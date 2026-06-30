package com.tencent.mm.plugin.voiceprint.model;

/* loaded from: classes16.dex */
public class VertifyInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.voiceprint.model.VertifyInfo> CREATOR = new fq4.r();

    /* renamed from: d, reason: collision with root package name */
    public int f176154d;

    /* renamed from: e, reason: collision with root package name */
    public int f176155e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f176156f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f176157g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f176158h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f176159i = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f176160m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f176161n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f176162o = false;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f176154d);
        parcel.writeInt(this.f176155e);
        parcel.writeInt(this.f176158h);
        parcel.writeInt(this.f176159i);
        java.lang.String str = this.f176156f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f176157g;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f176160m;
        parcel.writeString(str3 != null ? str3 : "");
        parcel.writeInt(this.f176161n ? 1 : 0);
        parcel.writeInt(this.f176162o ? 1 : 0);
    }
}
