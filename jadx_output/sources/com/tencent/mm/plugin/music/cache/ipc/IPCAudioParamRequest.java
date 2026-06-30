package com.tencent.mm.plugin.music.cache.ipc;

/* loaded from: classes7.dex */
public class IPCAudioParamRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest> CREATOR = new hl3.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f150620d;

    /* renamed from: e, reason: collision with root package name */
    public int f150621e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f150622f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f150623g;

    public IPCAudioParamRequest() {
        this.f150620d = "";
        this.f150621e = 0;
        this.f150622f = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f150620d);
        parcel.writeInt(this.f150621e);
        parcel.writeString(this.f150622f);
        byte[] bArr = this.f150623g;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f150623g);
        }
    }

    public IPCAudioParamRequest(android.os.Parcel parcel) {
        this.f150620d = "";
        this.f150621e = 0;
        this.f150622f = "";
        this.f150620d = parcel.readString();
        this.f150621e = parcel.readInt();
        this.f150622f = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f150623g = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
