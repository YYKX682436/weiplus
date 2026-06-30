package com.tencent.mmkv;

/* loaded from: classes12.dex */
public final class ParcelableMMKV implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mmkv.ParcelableMMKV> CREATOR = new ir5.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f215172d;

    /* renamed from: e, reason: collision with root package name */
    public final int f215173e;

    /* renamed from: f, reason: collision with root package name */
    public final int f215174f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f215175g;

    public ParcelableMMKV(com.tencent.mmkv.MMKV mmkv) {
        this.f215173e = -1;
        this.f215174f = -1;
        this.f215175g = null;
        this.f215172d = mmkv.mmapID();
        this.f215173e = mmkv.ashmemFD();
        this.f215174f = mmkv.ashmemMetaFD();
        this.f215175g = mmkv.cryptKey();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            parcel.writeString(this.f215172d);
            android.os.ParcelFileDescriptor fromFd = android.os.ParcelFileDescriptor.fromFd(this.f215173e);
            android.os.ParcelFileDescriptor fromFd2 = android.os.ParcelFileDescriptor.fromFd(this.f215174f);
            int i18 = i17 | 1;
            fromFd.writeToParcel(parcel, i18);
            fromFd2.writeToParcel(parcel, i18);
            java.lang.String str = this.f215175g;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (java.io.IOException unused) {
        }
    }

    public ParcelableMMKV(java.lang.String str, int i17, int i18, java.lang.String str2, ir5.j jVar) {
        this.f215173e = -1;
        this.f215174f = -1;
        this.f215175g = null;
        this.f215172d = str;
        this.f215173e = i17;
        this.f215174f = i18;
        this.f215175g = str2;
    }
}
