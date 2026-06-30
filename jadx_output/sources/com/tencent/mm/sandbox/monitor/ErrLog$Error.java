package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
class ErrLog$Error implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.sandbox.monitor.ErrLog$Error> CREATOR = new com.tencent.mm.sandbox.monitor.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f192273d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f192274e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f192275f;

    /* renamed from: g, reason: collision with root package name */
    public final long f192276g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f192277h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f192278i;

    public ErrLog$Error(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = o45.wf.f343023a;
        sb6.append(wo.q.f447780a);
        sb6.append("_");
        sb6.append(o45.wf.f343029g);
        sb6.append("_");
        sb6.append(android.os.Build.CPU_ABI);
        this.f192273d = sb6.toString();
        this.f192274e = str;
        this.f192275f = str2;
        this.f192276g = j17;
        this.f192277h = str3;
        this.f192278i = false;
        this.f192278i = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return this.f192274e + "," + this.f192273d + "," + this.f192275f + ",time_" + this.f192276g + ",error_" + this.f192277h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f192274e);
        parcel.writeString(this.f192275f);
        parcel.writeLong(this.f192276g);
        parcel.writeString(this.f192277h);
        parcel.writeByte(this.f192278i ? (byte) 1 : (byte) 0);
    }

    public ErrLog$Error(android.os.Parcel parcel) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = o45.wf.f343023a;
        sb6.append(wo.q.f447780a);
        sb6.append("_");
        sb6.append(o45.wf.f343029g);
        sb6.append("_");
        sb6.append(android.os.Build.CPU_ABI);
        this.f192273d = sb6.toString();
        this.f192274e = parcel.readString();
        this.f192275f = parcel.readString();
        this.f192276g = parcel.readLong();
        this.f192277h = parcel.readString();
        this.f192278i = parcel.readByte() != 0;
    }
}
