package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
class ErrLog$PreventError implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.sandbox.monitor.ErrLog$PreventError> CREATOR = new com.tencent.mm.sandbox.monitor.h();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f192279d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f192280e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sandbox.monitor.ErrLog$Error f192281f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f192282g;

    public ErrLog$PreventError(java.lang.String str, java.lang.String str2, com.tencent.mm.sandbox.monitor.ErrLog$Error errLog$Error, java.lang.String str3) {
        this.f192279d = str;
        this.f192280e = str2;
        this.f192281f = errLog$Error;
        this.f192282g = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "PreventError{username='" + this.f192279d + "', tag='" + this.f192280e + "', err=" + this.f192281f + ", processName='" + this.f192282g + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f192279d);
        parcel.writeString(this.f192280e);
        parcel.writeParcelable(this.f192281f, i17);
        parcel.writeString(this.f192282g);
    }

    public ErrLog$PreventError(android.os.Parcel parcel) {
        this.f192279d = parcel.readString();
        this.f192280e = parcel.readString();
        this.f192281f = (com.tencent.mm.sandbox.monitor.ErrLog$Error) parcel.readParcelable(com.tencent.mm.sandbox.monitor.ErrLog$Error.class.getClassLoader());
        this.f192282g = parcel.readString();
    }
}
