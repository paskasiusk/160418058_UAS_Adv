package com.ubaya.uts_160418058.model

data class daily(
    val title:String?,
    val description:String?,
    val time:String?,
    val category:String?,
    val priority:String?,
    val photo_url:String?
)

data class weekly(
    val title:String?,
    val description:String?,
    val date:String?,
    val category:String?,
    val priority:String?,
    val photo_url:String?
)

data class monthly(
    val title:String?,
    val description:String?,
    val month:String?,
    val category:String?,
    val priority:String?,
    val photo_url:String?
)
data class history(
    val title:String?,
    val date:String?,
    val category:String?,
    val priority:String?,
    val photo_url:String?
)