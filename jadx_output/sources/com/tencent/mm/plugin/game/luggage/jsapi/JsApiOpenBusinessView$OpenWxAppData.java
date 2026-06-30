package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class JsApiOpenBusinessView$OpenWxAppData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenBusinessView$OpenWxAppData> CREATOR = new com.tencent.mm.plugin.game.luggage.jsapi.v1();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f139575d;

    public JsApiOpenBusinessView$OpenWxAppData(android.os.Bundle bundle) {
        this.f139575d = new android.os.Bundle();
        this.f139575d = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeBundle(this.f139575d);
    }

    public JsApiOpenBusinessView$OpenWxAppData(android.os.Parcel parcel) {
        this.f139575d = new android.os.Bundle();
        this.f139575d = parcel.readBundle();
    }
}
