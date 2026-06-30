package l81;

/* loaded from: classes7.dex */
public final class z0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        l81.a1 a1Var = (l81.a1) kz5.n0.a0(l81.a1.f317010h, parcel.readInt());
        if (a1Var == null) {
            a1Var = l81.a1.f317006d;
        }
        return new com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle(readLong, readLong2, a1Var, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle[i17];
    }
}
