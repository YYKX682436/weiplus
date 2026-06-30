package wo;

/* loaded from: classes13.dex */
public class l1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfo[i17];
    }
}
