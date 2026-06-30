package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class WebViewJSSDKImageItem extends com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem> CREATOR = new com.tencent.mm.plugin.webview.model.n4();

    /* renamed from: w, reason: collision with root package name */
    public boolean f182751w;

    public WebViewJSSDKImageItem() {
        this.f182742n = 1;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public org.json.JSONObject a() {
        org.json.JSONObject a17 = super.a();
        try {
            a17.put("isGif", this.f182751w);
        } catch (org.json.JSONException unused) {
        }
        return a17;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public java.lang.String b() {
        return "jpeg";
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public java.lang.String c() {
        return "image";
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public void d(org.json.JSONObject jSONObject) {
        super.d(jSONObject);
        if (jSONObject != null) {
            this.f182751w = jSONObject.optBoolean("isGif");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void f() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f182738g);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewJSSDkImageItem", "Original file not existed");
            return;
        }
        java.lang.String str2 = this.f182737f;
        if (str2 == null) {
            zg0.r3 r3Var = (zg0.r3) i95.n0.c(zg0.r3.class);
            java.lang.String str3 = java.lang.System.currentTimeMillis() + "";
            ((yg0.u4) r3Var).getClass();
            this.f182737f = com.tencent.mm.plugin.webview.model.o5.c(str3);
        } else if (str2.equals(this.f182738g)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewJSSDkImageItem", "Thumb file is original file");
            return;
        }
        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(this.f182738g, 640, 640, false);
        if (T != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewJSSDkImageItem", "extract thumbnail bitmap");
            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(T, com.tencent.mm.sdk.platformtools.l.a(this.f182738g));
            if (w07 != null) {
                try {
                    com.tencent.mm.sdk.platformtools.x.D0(w07, 100, android.graphics.Bitmap.CompressFormat.JPEG, this.f182737f, true);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJSSDkImageItem", "save bitmap to file failed : %s", e17.getMessage());
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewJSSDkImageItem", "Thumb Path: %s", this.f182737f);
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f182751w ? 1 : 0);
    }

    public WebViewJSSDKImageItem(android.os.Parcel parcel) {
        super(parcel);
        this.f182751w = parcel.readInt() == 1;
    }
}
