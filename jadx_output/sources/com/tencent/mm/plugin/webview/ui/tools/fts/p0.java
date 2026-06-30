package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class p0 implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184581b;

    public p0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, java.lang.String str) {
        this.f184581b = baseSearchWebViewUI;
        this.f184580a = str;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        android.graphics.Bitmap a07;
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = this.f184581b;
        sb6.append(baseSearchWebViewUI.Z3);
        sb6.append(";");
        sb6.append(baseSearchWebViewUI.B3);
        sb6.append(";");
        sb6.append(this.f184580a);
        baseSearchWebViewUI.X3.setExtraInfoForReport(sb6.toString());
        java.lang.String z96 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.z9(baseSearchWebViewUI, iEmojiInfo);
        int i18 = 2;
        if (iEmojiInfo.k() || iEmojiInfo.getGroup() == 18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "emoji is system emoji %s", java.lang.Integer.valueOf(iEmojiInfo.getGroup()));
            if (!com.tencent.mm.vfs.w6.j(z96) && (a07 = iEmojiInfo.a0(baseSearchWebViewUI, 480)) != null) {
                try {
                    com.tencent.mm.sdk.platformtools.x.D0(a07, 80, android.graphics.Bitmap.CompressFormat.PNG, z96, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "save emoji bitmap %d %s", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(z96)), z96);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseSearchWebViewUI", e17, "SaveEmojiBitmap", new java.lang.Object[0]);
                }
            }
        }
        java.lang.String str = "weixin://fts/emoji?path=" + z96;
        java.lang.String md52 = iEmojiInfo.getMd5();
        java.lang.String aesKey = iEmojiInfo.getAesKey();
        java.lang.String J1 = iEmojiInfo.J1();
        boolean E0 = iEmojiInfo.E0();
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        if (n22.m.k(iEmojiInfo)) {
            i17 = 1;
        } else {
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            if (!n22.m.j(iEmojiInfo)) {
                ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
                if (n22.m.p(iEmojiInfo)) {
                    i18 = 3;
                } else {
                    i17 = 0;
                }
            }
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onSelectedEmoji %s %s %b", md52, str, java.lang.Boolean.valueOf(E0));
        baseSearchWebViewUI.s9().G(md52, str, i17, !E0 ? 1 : 0, J1, aesKey);
        if (!E0) {
            ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).wi(iEmojiInfo, new com.tencent.mm.plugin.webview.ui.tools.fts.o0(this, iEmojiInfo, md52, str, i17, J1, aesKey));
        }
        baseSearchWebViewUI.W3.setVisibility(8);
    }

    @Override // qk.u9
    public void onHide() {
    }
}
