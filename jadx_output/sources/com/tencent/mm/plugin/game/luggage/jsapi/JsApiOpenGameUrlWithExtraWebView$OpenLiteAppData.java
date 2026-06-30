package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData> CREATOR = new com.tencent.mm.plugin.game.luggage.jsapi.o2();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f139577d;

    public JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData(android.os.Bundle bundle) {
        this.f139577d = new android.os.Bundle();
        this.f139577d = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeBundle(this.f139577d);
    }

    public JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData(android.os.Parcel parcel) {
        this.f139577d = new android.os.Bundle();
        this.f139577d = parcel.readBundle();
    }
}
