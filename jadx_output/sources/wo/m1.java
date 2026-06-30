package wo;

/* loaded from: classes13.dex */
public class m1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfoWrapper
            public static final android.os.Parcelable.Creator<com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfoWrapper> CREATOR = new wo.m1();

            /* renamed from: d, reason: collision with root package name */
            public final java.util.List f64768d;

            {
                this.f64768d = parcel.createTypedArrayList(com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfo.CREATOR);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeTypedList(this.f64768d);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfoWrapper[i17];
    }
}
