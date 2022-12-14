package com.example.games

import com.google.gson.annotations.SerializedName

data class DetailResults(@SerializedName("name_original")
                           val nameOriginal: String = "",
                         @SerializedName("reddit_name")
                           val redditName: String = "",
                         @SerializedName("background_image")
                           val backgroundImage: String = "",
                         @SerializedName("name")
                           val name: String = "",
                         @SerializedName("reddit_url")
                         val reddit_url: String = "",
                         @SerializedName("description")
                           val description: String = "",
                         @SerializedName("background_image_additional")
                           val backgroundImageAdditional: String = "",
                         @SerializedName("website")
                           val website: String = "")