package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class WebViewJSSDKVoiceItem extends com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.model.WebViewJSSDKVoiceItem> CREATOR = new com.tencent.mm.plugin.webview.model.q4();

    public WebViewJSSDKVoiceItem() {
        this.f182742n = 2;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public java.lang.String b() {
        return "speex";
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public java.lang.String c() {
        return "voice";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
    }
}
