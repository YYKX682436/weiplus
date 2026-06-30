package com.tencent.mm.plugin.wepkg.downloader;

/* loaded from: classes8.dex */
public enum WePkgDownloader$IWepkgUpdateCallback$RetCode implements android.os.Parcelable {
    OK,
    LOCAL_FILE_NOT_FOUND,
    PKG_INTEGRITY_FAILED,
    /* JADX INFO: Fake field, exist only in values array */
    PKG_INVALID,
    FAILED,
    CANCEL;

    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode> CREATOR = new xz4.g();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(ordinal());
    }
}
