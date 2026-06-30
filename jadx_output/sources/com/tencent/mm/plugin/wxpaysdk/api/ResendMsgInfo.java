package com.tencent.mm.plugin.wxpaysdk.api;

/* loaded from: classes.dex */
public class ResendMsgInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo> CREATOR = new o05.m();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f188590d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f188591e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f188592f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f188593g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f188594h;

    public ResendMsgInfo(android.os.Parcel parcel) {
        this.f188590d = parcel.readString();
        this.f188591e = parcel.readString();
        this.f188592f = parcel.readString();
        this.f188593g = parcel.readString();
        this.f188594h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "ResendMsgInfo{title='" + this.f188590d + "', pic='" + this.f188591e + "', description='" + this.f188592f + "', left_button_wording='" + this.f188593g + "', right_button_wording='" + this.f188594h + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f188590d);
        parcel.writeString(this.f188591e);
        parcel.writeString(this.f188592f);
        parcel.writeString(this.f188593g);
        parcel.writeString(this.f188594h);
    }
}
