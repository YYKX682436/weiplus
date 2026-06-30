package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
class JsApiOpenLiteApp$OpenLiteAppData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenLiteApp$OpenLiteAppData> CREATOR = new com.tencent.mm.plugin.game.luggage.jsapi.y2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f139578d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139579e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f139580f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f139581g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f139582h;

    public JsApiOpenLiteApp$OpenLiteAppData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.f139578d = str;
        this.f139579e = str2;
        this.f139580f = str3;
        this.f139581g = bool;
        this.f139582h = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f139578d);
        parcel.writeString(this.f139579e);
        parcel.writeString(this.f139580f);
        parcel.writeByte(this.f139581g.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f139582h.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public JsApiOpenLiteApp$OpenLiteAppData(android.os.Parcel parcel) {
        this.f139578d = parcel.readString();
        this.f139579e = parcel.readString();
        this.f139580f = parcel.readString();
        this.f139581g = java.lang.Boolean.valueOf(parcel.readByte() != 0);
        this.f139582h = java.lang.Boolean.valueOf(parcel.readByte() != 0);
    }
}
