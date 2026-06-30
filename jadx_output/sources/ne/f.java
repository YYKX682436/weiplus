package ne;

/* loaded from: classes7.dex */
public class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.luggage.sdk.config.AppBrandSysConfigLU(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.luggage.sdk.config.AppBrandSysConfigLU[i17];
    }
}
