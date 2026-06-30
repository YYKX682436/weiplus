package com.tencent.mm.plugin.mmsight;

/* loaded from: classes10.dex */
public class SightCaptureResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.mmsight.SightCaptureResult> CREATOR = new ai3.e();

    /* renamed from: d, reason: collision with root package name */
    public boolean f148806d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f148807e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f148808f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f148809g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f148810h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f148811i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f148812m;

    /* renamed from: n, reason: collision with root package name */
    public final int f148813n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.vh4 f148814o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f148815p;

    /* renamed from: q, reason: collision with root package name */
    public r15.b f148816q;

    public SightCaptureResult(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, r45.vh4 vh4Var) {
        this.f148806d = false;
        this.f148807e = false;
        this.f148808f = true;
        this.f148809g = "";
        this.f148810h = "";
        this.f148811i = "";
        this.f148812m = "";
        this.f148813n = 0;
        this.f148814o = new r45.vh4();
        this.f148815p = "";
        this.f148816q = null;
        this.f148808f = z17;
        this.f148809g = str;
        this.f148810h = str2;
        this.f148811i = str3;
        this.f148813n = i17;
        this.f148814o = vh4Var;
        this.f148812m = str4;
        this.f148806d = true;
        this.f148807e = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f148806d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f148807e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f148808f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f148809g);
        parcel.writeString(this.f148810h);
        parcel.writeString(this.f148811i);
        parcel.writeString(this.f148812m);
        parcel.writeInt(this.f148813n);
        parcel.writeString(this.f148815p);
        try {
            byte[] byteArray = this.f148814o.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureResult", "write ext info error");
        }
    }

    public SightCaptureResult(boolean z17, java.lang.String str) {
        this.f148806d = false;
        this.f148807e = false;
        this.f148808f = true;
        this.f148809g = "";
        this.f148810h = "";
        this.f148811i = "";
        this.f148812m = "";
        this.f148813n = 0;
        this.f148814o = new r45.vh4();
        this.f148816q = null;
        this.f148808f = z17;
        this.f148815p = str;
        this.f148806d = false;
        this.f148807e = true;
    }

    public SightCaptureResult(android.os.Parcel parcel) {
        this.f148806d = false;
        this.f148807e = false;
        this.f148808f = true;
        this.f148809g = "";
        this.f148810h = "";
        this.f148811i = "";
        this.f148812m = "";
        this.f148813n = 0;
        this.f148814o = new r45.vh4();
        this.f148815p = "";
        this.f148816q = null;
        this.f148806d = parcel.readByte() != 0;
        this.f148807e = parcel.readByte() != 0;
        this.f148808f = parcel.readByte() != 0;
        this.f148809g = parcel.readString();
        this.f148810h = parcel.readString();
        this.f148811i = parcel.readString();
        this.f148812m = parcel.readString();
        this.f148813n = parcel.readInt();
        this.f148815p = parcel.readString();
        try {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            r45.vh4 vh4Var = new r45.vh4();
            this.f148814o = vh4Var;
            vh4Var.parseFrom(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureResult", "read ext info error: %s", e17.getMessage());
        }
    }
}
