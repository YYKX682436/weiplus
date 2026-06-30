package com.tencent.mm.plugin.setting.model;

/* loaded from: classes11.dex */
public class SwitchAccountModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.setting.model.SwitchAccountModel> CREATOR = new k14.n0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f160047d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f160048e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f160049f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f160050g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160051h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f160052i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160053m;

    public SwitchAccountModel(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6) {
        this.f160047d = str;
        this.f160048e = str2;
        this.f160049f = str3;
        this.f160050g = str4;
        this.f160051h = i17;
        this.f160052i = str5;
        this.f160053m = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160047d);
        parcel.writeString(this.f160048e);
        parcel.writeString(this.f160049f);
        parcel.writeString(this.f160050g);
        parcel.writeInt(this.f160051h);
        parcel.writeString(this.f160052i);
        parcel.writeString(this.f160053m);
    }
}
