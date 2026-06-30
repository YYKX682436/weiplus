package l81;

/* loaded from: classes7.dex */
public final class x0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), l81.y0.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle[i17];
    }
}
