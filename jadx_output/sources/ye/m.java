package ye;

/* loaded from: classes7.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.luggage.sdk.processes.main.RuntimeInfo(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig) parcel.readParcelable(com.tencent.luggage.sdk.processes.main.RuntimeInfo.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.luggage.sdk.processes.main.RuntimeInfo[i17];
    }
}
