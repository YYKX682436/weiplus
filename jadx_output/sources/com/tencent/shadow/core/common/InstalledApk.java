package com.tencent.shadow.core.common;

/* loaded from: classes13.dex */
public class InstalledApk implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.shadow.core.common.InstalledApk> CREATOR = new android.os.Parcelable.Creator<com.tencent.shadow.core.common.InstalledApk>() { // from class: com.tencent.shadow.core.common.InstalledApk.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.shadow.core.common.InstalledApk createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.shadow.core.common.InstalledApk(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.shadow.core.common.InstalledApk[] newArray(int i17) {
            return new com.tencent.shadow.core.common.InstalledApk[i17];
        }
    };
    public final android.os.ParcelFileDescriptor apkFd;
    public final java.lang.String apkFilePath;
    public final java.lang.String libraryPath;
    public final java.lang.String oDexPath;
    public final byte[] parcelExtras;

    public InstalledApk(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, str3, (byte[]) null);
    }

    public synchronized void closeIfNeeded() {
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.apkFd;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.close();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InstalledApk{apkFilePath='");
        sb6.append(this.apkFilePath);
        sb6.append("',\n apkFd=");
        sb6.append(this.apkFd);
        sb6.append(",\n oDexPath='");
        sb6.append(this.oDexPath);
        sb6.append("',\n libraryPath='");
        sb6.append(this.libraryPath);
        sb6.append("',\n parcelExtras=Array(bytes=");
        byte[] bArr = this.parcelExtras;
        sb6.append(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        sb6.append(")}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.apkFilePath);
        parcel.writeParcelable(this.apkFd, i17);
        parcel.writeString(this.oDexPath);
        parcel.writeString(this.libraryPath);
        byte[] bArr = this.parcelExtras;
        parcel.writeInt(bArr == null ? 0 : bArr.length);
        byte[] bArr2 = this.parcelExtras;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
    }

    public InstalledApk(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, java.lang.String str2) {
        this(parcelFileDescriptor, str, str2, (byte[]) null);
    }

    public InstalledApk(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.apkFilePath = null;
        this.apkFd = parcelFileDescriptor;
        this.oDexPath = str;
        this.libraryPath = str2;
        this.parcelExtras = bArr;
    }

    public InstalledApk(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        this.apkFilePath = str;
        this.apkFd = null;
        this.oDexPath = str2;
        this.libraryPath = str3;
        this.parcelExtras = bArr;
    }

    public InstalledApk(android.os.Parcel parcel) {
        this.apkFilePath = parcel.readString();
        this.apkFd = (android.os.ParcelFileDescriptor) parcel.readParcelable(android.os.ParcelFileDescriptor.class.getClassLoader());
        this.oDexPath = parcel.readString();
        this.libraryPath = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.parcelExtras = new byte[readInt];
        } else {
            this.parcelExtras = null;
        }
        byte[] bArr = this.parcelExtras;
        if (bArr != null) {
            parcel.readByteArray(bArr);
        }
    }
}
