package kj1;

/* loaded from: classes7.dex */
public final class j0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult(parcel.readInt() != 0, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult[i17];
    }
}
