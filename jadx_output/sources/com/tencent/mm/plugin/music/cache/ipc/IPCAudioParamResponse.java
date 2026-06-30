package com.tencent.mm.plugin.music.cache.ipc;

/* loaded from: classes7.dex */
public class IPCAudioParamResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse> CREATOR = new hl3.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150624d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150625e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f150626f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f150627g;

    /* renamed from: h, reason: collision with root package name */
    public final int f150628h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f150629i;

    /* renamed from: m, reason: collision with root package name */
    public final int f150630m;

    public IPCAudioParamResponse(b21.v vVar) {
        this.f150624d = vVar.f17368a;
        this.f150625e = vVar.f17369b;
        this.f150626f = vVar.f17370c;
        this.f150628h = vVar.f17372e;
        this.f150627g = vVar.f17373f;
        this.f150629i = vVar.f17371d;
        this.f150630m = vVar.f17374g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f150624d);
        parcel.writeString(this.f150625e);
        parcel.writeString(this.f150626f);
        parcel.writeString(this.f150627g);
        parcel.writeInt(this.f150628h);
        parcel.writeInt(this.f150630m);
        byte[] bArr = this.f150629i;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    public IPCAudioParamResponse(android.os.Parcel parcel) {
        this.f150624d = parcel.readString();
        this.f150625e = parcel.readString();
        this.f150626f = parcel.readString();
        this.f150627g = parcel.readString();
        this.f150628h = parcel.readInt();
        this.f150630m = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f150629i = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
