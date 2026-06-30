package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes5.dex */
public final class wd implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186614a;

    public wd(nw4.k kVar) {
        this.f186614a = kVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo != null) {
            java.lang.String md52 = iEmojiInfo.getMd5();
            iEmojiInfo.E0();
            android.content.Context context = this.f186614a.f340860a;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
            if (webViewUI != null) {
                ((com.tencent.mm.feature.emoji.c4) ((com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class))).ij(iEmojiInfo, false, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.vd(webViewUI, md52, fy4.f.f267261a.b(iEmojiInfo)));
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
        sk.e a17 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.ce.a(this.f186614a);
        if (a17 != null) {
            vr.g gVar = (vr.g) a17;
            yz5.a aVar = gVar.f439408f;
            if (aVar != null) {
                aVar.invoke();
            }
            pm0.v.X(new vr.c(gVar));
        }
    }
}
