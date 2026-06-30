package ld;

/* loaded from: classes15.dex */
public class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.liteapp.report.WxaLiteAppStartReport(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.liteapp.report.WxaLiteAppStartReport[i17];
    }
}
