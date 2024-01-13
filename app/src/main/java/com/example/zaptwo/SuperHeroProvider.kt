package com.example.zaptwo

class SuperHeroProvider {
    companion object{
        val superheroList = listOf<SuperHero>(
            SuperHero(
                "Pingo's Café \uD83C\uDF69\uD83E\uDDC1",
                "Cafetería",
                "10:00 am a 6:00 pm; todos los días",
                "https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/398875494_250459344695780_7249738730238950541_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeF6e9okdVq49yo8XfcZSzcNxj8_3K0rE9bGPz_crSsT1q2JdtSFBDZ7i5EXRWB4mdRND0As1AHGUKfjbyVFTthN&_nc_ohc=R-I_nKJcq34AX8Ii_WH&_nc_ht=scontent.fmex29-1.fna&oh=00_AfAFGw23HxAea-MmvpIX0GvfXnfL2QIsIUyzI-iJGvNe5A&oe=659C115F"
            ),
            SuperHero(
                "Ropa y calzado infantil \"Almedy\"\uD83D\uDC52",
                "Boutique\uD83D\uDC57",
                "Lunes a Sábado: 10:00 am a 8:00 pm\n",
                "https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/398944317_250459521362429_4700739130623397992_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeGJxitdx4C-O0Tva55FdMvY6oigXLqSGejqiKBcupIZ6PeQfABsQEWtbHcrM8d1IHHian-7K4ACaUiD4QxFgKBz&_nc_ohc=WbMuM-c7QA0AX8Lxb60&_nc_ht=scontent.fmex29-1.fna&oh=00_AfCHjk71hy2NCe0It4wYckgh4tWUUz4Ebfbr8CNN1Mc2oQ&oe=659B5E9B"
            ),
            SuperHero(
                "Megalux",
                "Iluminación / Mascotas",
                "Lunes a Sábado 10:00 am a 7:00 pm",
                "https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/398995856_250459604695754_4245202908848096310_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeFgGsEu0Au2kutU13j4FKmduw2At6ya2_i7DYC3rJrb-OMZjin9NzZnCBKKSs8iR2XDl65K_2gHm7j6ObQKN12r&_nc_ohc=lnZVKJp4iWQAX-aCqsE&_nc_ht=scontent.fmex29-1.fna&oh=00_AfC6aXFLVKLxZ5ZQbBGrrQwC9rmmLhSZo8FIDTrbZm5Aww&oe=659AEB6E"
            ),
            SuperHero(
                "Cafetería Claudia Mendiola \uD83E\uDDC1",
                "Cafetería / Repostería\uD83E\uDD67",
                "Lunes a viernes 10:00 am a 9:00 pm",
                "https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/398859874_250459618029086_4034940226655862002_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeFJ7s92kiPnD65RFvMVH_sqsWRfm1opyXmxZF-bWinJeUmtsSt2tP0CPIRnfEf1YIFmNwjVuf6lxmjwtDnOWN5c&_nc_ohc=yn7-yAJeAA8AX_CJ5ZS&_nc_ht=scontent.fmex29-1.fna&oh=00_AfBPf92XNebs-2jMhDWRMKlWAFuEyXcaR1XDSfkpU5PftA&oe=659A5001"
            ),
            SuperHero(
                "Cosméticos y accesorios \" ALL CHEAP\"\uD83D\uDC85\uD83D\uDC84",
                "accesorios/cosméticos\uD83D\uDC84\uD83D\uDC8D",
                "9:00 am a 8:00 pm todos los días",
                "https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/398983655_250459681362413_6809308950441165713_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeFx_RsaCP3xeScWxRHojv3wu_SjGsr0e3W79KMayvR7dQp2JRprtFAeWh7EpDseCjylQZ4ap8T4GZzJ0Rl7NxdL&_nc_ohc=FMLubsRlWCkAX9uWT4k&_nc_ht=scontent.fmex29-1.fna&oh=00_AfCeKuvLQtbS0alj0bVfocC3qQxb609yOcf25z_fX3iTBg&oe=659BD156"
            ),
            SuperHero(
                "Salón de belleza \"Lauren\"\uD83D\uDC87\u200D♀️",
                "Belleza / estética",
                "lunes y sábado 9:30 am a 2:00 pm. 4:00pm a 7:00 pm.",
                "https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/398962123_250459711362410_47362356192009948_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeH1Opz4jMyOA68XU3gYPRShuNDi3qaSZEK40OLeppJkQkVzwI26aOD8Ox0MWqE5TvhLAK0E-jJ2tqTT5NjU2ZdR&_nc_ohc=juA4cgdTMIEAX-AOJw7&_nc_ht=scontent.fmex29-1.fna&oh=00_AfAIJIx5XGG8D0oXLg7UYn4GhlOWH6gSg_jhKserBXR9zg&oe=659BD6F6"
            ),
            SuperHero(
                "Florería D' Erica \uD83C\uDF39",
                "Florería\uD83C\uDF38",
                "7:30 am a 9:00 am todos los días.",
                "https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/398885511_250459748029073_6777071532343985457_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeG0dy7ALwGRL8kwWAnU6_gXUc-85dSIfDdRz7zl1Ih8Nwt_vpMOtft8k8nqkRCATSuK88EHAZJsR9l3eZpDOU8S&_nc_ohc=70rGpNRCAjYAX-OFWfL&_nc_ht=scontent.fmex29-1.fna&oh=00_AfBoRc7g9_v1rlomljpzTmK0AX6jTDrj6asc5PMqBo7wNQ&oe=659A8CCB"
            ),
            SuperHero(
                "OPTI LENT. \uD83D\uDC53",
                "Lentes/ Óptica.\uD83E\uDD13",
                "7:30 am a 9:00 am todos los días.",
                "https://scontent.fmex29-1.fna.fbcdn.net/v/t39.30808-6/398857530_250459858029062_4639811074258929209_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=dd5e9f&_nc_eui2=AeGnhcozVuyrroJT2ws3R4iINwm9W2aNaCA3Cb1bZo1oIIf7ZQqMpXW1W8rqw-zhgBxdRtG8tBcEjyMZT0FYvu7O&_nc_ohc=oO6pbuUwOmkAX8ruiQs&_nc_oc=AQmusYsh9xJ7y_VTYmSLQFpZyEMFpx5zfjHvyw954aUrweYmdFDF2bxHgeO4alANC4TuHPiVBdQGdTIrFOUnZyh2&_nc_ht=scontent.fmex29-1.fna&oh=00_AfAdo8XAey5_SGyrphBqU5tk0ICBIbiNxtr0_-nDUuQdfw&oe=659A5120"
            ),
            SuperHero(
                "Botas de Trabajo\uD83E\uDD7E",
                "Zapatería",
                "9: 00 am a 8:00 pm todos los días",
                "https://firebasestorage.googleapis.com/v0/b/zapdata-322cf.appspot.com/o/Botas%20de%20Trabajo.jpg?alt=media&token=31791522-a782-4cc0-9c8d-fccab4a78d1a"
            )
        )
    }
}