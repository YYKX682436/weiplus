package k91;

/* loaded from: classes7.dex */
public final class t implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams(parcel.readInt() != 0, parcel.readString(), parcel.readDouble(), parcel.readDouble());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams[i17];
    }
}
