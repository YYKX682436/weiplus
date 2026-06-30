package xz4;

/* loaded from: classes8.dex */
public class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode[i17];
    }
}
