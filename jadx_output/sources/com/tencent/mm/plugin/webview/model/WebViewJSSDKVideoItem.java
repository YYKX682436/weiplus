package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class WebViewJSSDKVideoItem extends com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem> CREATOR = new com.tencent.mm.plugin.webview.model.p4();

    /* renamed from: w, reason: collision with root package name */
    public int f182754w;

    public WebViewJSSDKVideoItem() {
        this.f182742n = 4;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public org.json.JSONObject a() {
        org.json.JSONObject a17 = super.a();
        try {
            a17.put("duration", this.f182754w);
        } catch (org.json.JSONException unused) {
        }
        return a17;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public java.lang.String b() {
        return "mp4";
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public java.lang.String c() {
        return "video";
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public void d(org.json.JSONObject jSONObject) {
        super.d(jSONObject);
        if (jSONObject != null) {
            this.f182754w = jSONObject.optInt("duration");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f182754w);
    }

    public WebViewJSSDKVideoItem(android.os.Parcel parcel) {
        super(parcel);
        this.f182754w = parcel.readInt();
    }
}
