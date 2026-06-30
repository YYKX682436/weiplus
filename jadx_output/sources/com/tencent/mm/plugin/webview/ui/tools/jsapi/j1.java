package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f185204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185206f;

    public j1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        this.f185206f = c1Var;
        this.f185204d = r6Var;
        this.f185205e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.vfs.r6 r6Var = this.f185204d;
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
        com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
        java.lang.String p18 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", p17);
        if (!com.tencent.mm.vfs.w6.j(p18)) {
            com.tencent.mm.vfs.w6.c(r6Var.o(), p18);
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185206f;
        c1Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.l1(c1Var, p17, this.f185205e));
    }
}
