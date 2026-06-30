package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public final class d implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f185039g;

    public d(boolean z17, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, int i17, boolean z18) {
        this.f185036d = z17;
        this.f185037e = c1Var;
        this.f185038f = i17;
        this.f185039g = z18;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        android.net.Uri[] uriArr;
        android.net.Uri[] uriArr2;
        android.net.Uri data;
        if (i17 == 219) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromAlbum onActivityResult resultCode:" + i18 + ", data:" + intent);
            if (android.os.Build.VERSION.SDK_INT >= 33 && -1 == i18 && intent != null && intent.getData() == null && intent.getClipData() != null) {
                android.content.ClipData clipData = intent.getClipData();
                kotlin.jvm.internal.o.d(clipData);
                if (clipData.getItemCount() > 0) {
                    android.content.ClipData clipData2 = intent.getClipData();
                    kotlin.jvm.internal.o.d(clipData2);
                    uriArr = new android.net.Uri[clipData2.getItemCount()];
                    android.content.ClipData clipData3 = intent.getClipData();
                    kotlin.jvm.internal.o.d(clipData3);
                    int itemCount = clipData3.getItemCount();
                    for (int i19 = 0; i19 < itemCount; i19++) {
                        android.content.ClipData clipData4 = intent.getClipData();
                        kotlin.jvm.internal.o.d(clipData4);
                        uriArr[i19] = clipData4.getItemAt(i19).getUri();
                    }
                    uriArr2 = uriArr;
                    dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.jsapi.c(uriArr2, this.f185036d, this.f185037e, this.f185038f, this.f185039g));
                }
            }
            if (-1 == i18 && intent == null) {
                uriArr = new android.net.Uri[0];
            } else {
                if (-1 == i18) {
                    android.net.Uri uri = null;
                    try {
                        data = intent.getData();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromCamera onActivityResult extra uri get exception:" + e17);
                    }
                    if (data == null) {
                        android.os.Bundle extras = intent.getExtras();
                        if (extras != null) {
                            data = (android.net.Uri) extras.getParcelable("android.intent.extra.STREAM");
                        }
                        uriArr2 = new android.net.Uri[]{uri};
                        dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.jsapi.c(uriArr2, this.f185036d, this.f185037e, this.f185038f, this.f185039g));
                    }
                    uri = data;
                    uriArr2 = new android.net.Uri[]{uri};
                    dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.jsapi.c(uriArr2, this.f185036d, this.f185037e, this.f185038f, this.f185039g));
                }
                uriArr = new android.net.Uri[0];
            }
            uriArr2 = uriArr;
            dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.jsapi.c(uriArr2, this.f185036d, this.f185037e, this.f185038f, this.f185039g));
        }
    }
}
