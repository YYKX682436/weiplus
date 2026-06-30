package k91;

/* loaded from: classes7.dex */
public final class p3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener[i17];
    }
}
