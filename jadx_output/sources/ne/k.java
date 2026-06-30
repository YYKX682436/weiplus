package ne;

/* loaded from: classes7.dex */
public final class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized((com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle) parcel.readParcelable(com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized.class.getClassLoader()), parcel.readParcelable(com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized[i17];
    }
}
