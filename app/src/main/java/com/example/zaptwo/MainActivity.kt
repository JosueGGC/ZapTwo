package com.example.zaptwo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zaptwo.adapter.SuperHeroAdapter
import com.example.zaptwo.databinding.ActivityMainBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class MainActivity : AppCompatActivity() {

    private val listTwo = mutableListOf<CarouselItem>()
    private lateinit var binding: ActivityMainBinding
    private var superHeroMutableList: MutableList<SuperHero> =
        SuperHeroProvider.superheroList.toMutableList()
    private lateinit var adapter: SuperHeroAdapter
    private val llmanager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.etFilter.addTextChangedListener { userFilter ->
            val superheroesFiltered =
                superHeroMutableList.filter { superhero ->
                    superhero.superhero.lowercase().contains(userFilter.toString().lowercase())
                }
            adapter.updateSuperHeroes(superheroesFiltered)
        }
        initRecyclerView()

        val carousel: ImageCarousel = findViewById(R.id.carusel)

        listTwo.add(CarouselItem("https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/345269890_751089683344976_4749875968989446274_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=783fdb&_nc_eui2=AeHZ76auXkNU9dY-akTkQLhZELhWQK9SE7YQuFZAr1ITttSctiwPElS9O3MeRyByU0YRWZ9iDwduFLFTxT5wYYH_&_nc_ohc=hctwXEQ5l8cAX8Qakpa&_nc_ht=scontent.fmex29-1.fna&oh=00_AfDLPh-mm4ZI9zjhVz5L9-dL2PnnSOtihluUD5nG3kkFrw&oe=659A9E3F"))
        listTwo.add(CarouselItem("https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/399014618_250458971362484_7003107857916408152_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeEZdHCpl9Xk8l8JPiX6pFpDNc9sGm6g3hg1z2wabqDeGFBBpDlZb_MW_iIgSpi3A6YiPNe2J86fSUaOS5KRyuqt&_nc_ohc=WlZH0wqxjqMAX-UqsrS&_nc_ht=scontent.fmex29-1.fna&oh=00_AfDsUanhb5fOih_VN5di1xXSrRa1RmEHGDPRgboaV8sbJg&oe=659B096C"))

        carousel.addData(listTwo)
    }

    private fun createSuperHero() {
        val superHero = SuperHero(
            "Incognito",
            "AristiDevsCorporation",
            "???????",
            "https://pbs.twimg.com/profile_images/1037281659727634432/5x2XVPwB_400x400.jpg"
        )

        superHeroMutableList.add(index = 3, superHero)
        adapter.notifyItemInserted(3)
        llmanager.scrollToPositionWithOffset(3, 10)
    }

    private fun initRecyclerView() {
        adapter = SuperHeroAdapter(
            superheroList = superHeroMutableList,
            onClickListener = { superhero -> onItemSelected(superhero) },
            onClickDelete = { position -> onDeletedItem(position) }
        )
        binding.recyclerSuperHero.layoutManager = llmanager
        binding.recyclerSuperHero.adapter = adapter

    }

    private fun onDeletedItem(position: Int) {
        superHeroMutableList.removeAt(position)
        adapter.notifyItemRemoved(position)
    }

    private fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.realName, Toast.LENGTH_SHORT).show()
    }
}