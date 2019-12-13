package com.bryanollivie.sdk

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

const val EXTRA_USER = "com.bryanollivie.sdk.extra.user"

@Parcelize
data class UserArgs(val userId: String) : Parcelable