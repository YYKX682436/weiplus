package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class v implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.w f159656a;

    public v(com.tencent.mm.plugin.scanner.ui.w wVar) {
        this.f159656a = wVar;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != 0) {
            return;
        }
        com.tencent.mm.plugin.scanner.ui.w wVar = this.f159656a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(wVar.f159661d.f159302h)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", wVar.f159661d.f159302h);
        j45.l.j(wVar.f159661d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
