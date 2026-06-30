package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185091g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185092h;

    public f1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var, java.lang.String str2, java.lang.String str3) {
        this.f185092h = c1Var;
        this.f185088d = str;
        this.f185089e = y2Var;
        this.f185090f = str2;
        this.f185091g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.y2 y2Var = this.f185089e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185092h;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doAddToEmoticon use base64DataString");
        java.lang.String str = this.f185088d;
        int indexOf = str.indexOf(";base64,");
        try {
            byte[] decode = android.util.Base64.decode(indexOf != -1 ? str.substring(indexOf + 8, str.length()) : "", 0);
            if (com.tencent.mm.sdk.platformtools.t8.M0(decode)) {
                c1Var.i5(y2Var, "addToEmoticon:fail", null);
                return;
            }
            java.lang.String g17 = kk.k.g(decode);
            com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            java.lang.String g18 = n22.m.g();
            ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
            java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g18, "", g17);
            if (!com.tencent.mm.vfs.w6.j(p17) || !com.tencent.mm.vfs.w6.p(p17).equalsIgnoreCase(g17)) {
                com.tencent.mm.vfs.w6.S(p17, decode, 0, decode.length);
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I3(c1Var, g17, this.f185090f, this.f185091g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "doAddToEmoticon error:" + e17.getMessage());
            c1Var.i5(y2Var, "addToEmoticon:fail_" + e17.getMessage(), null);
        }
    }
}
