package com.tencent.qbar;

/* loaded from: classes13.dex */
public class WxQBarResult extends zs5.c0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.qbar.WxQBarResult> CREATOR = new zs5.x0();

    /* renamed from: m, reason: collision with root package name */
    public int f215250m;

    /* renamed from: n, reason: collision with root package name */
    public int f215251n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.qbar.WxQBarPoint f215252o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f215253p;

    public WxQBarResult(int i17, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, int i18) {
        this.f215250m = 0;
        this.f215251n = 0;
        this.f215253p = false;
        this.f475330d = i17;
        this.f475331e = str;
        this.f475332f = str2;
        this.f475333g = bArr;
        this.f475334h = str3;
        this.f475335i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f475330d);
        parcel.writeString(this.f475331e);
        parcel.writeString(this.f475332f);
        parcel.writeByteArray(this.f475333g);
        parcel.writeString(this.f475334h);
        parcel.writeInt(this.f215250m);
        parcel.writeParcelable(this.f215252o, i17);
        parcel.writeInt(this.f475335i);
        parcel.writeInt(this.f215251n);
        parcel.writeInt(this.f215253p ? 1 : 0);
    }

    public WxQBarResult(android.os.Parcel parcel) {
        this.f215250m = 0;
        this.f215251n = 0;
        this.f215253p = false;
        this.f475330d = parcel.readInt();
        this.f475331e = parcel.readString();
        this.f475332f = parcel.readString();
        parcel.readByteArray(this.f475333g);
        this.f475334h = parcel.readString();
        this.f215250m = parcel.readInt();
        this.f215252o = (com.tencent.qbar.WxQBarPoint) parcel.readParcelable(com.tencent.qbar.WxQBarPoint.class.getClassLoader());
        this.f475335i = parcel.readInt();
        this.f215251n = parcel.readInt();
        this.f215253p = parcel.readByte() != 0;
    }
}
