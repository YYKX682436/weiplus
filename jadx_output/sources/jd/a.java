package jd;

/* loaded from: classes.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.liteapp.jsapi.WxaLiteAppIPCCallbackData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.liteapp.jsapi.WxaLiteAppIPCCallbackData[i17];
    }
}
