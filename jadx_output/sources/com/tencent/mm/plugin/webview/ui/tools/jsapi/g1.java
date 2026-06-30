package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f185118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185121g;

    public g1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2) {
        this.f185121g = c1Var;
        this.f185118d = r6Var;
        this.f185119e = str;
        this.f185120f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.vfs.r6 r6Var = this.f185118d;
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
        com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
        java.lang.String p18 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", p17);
        if (!com.tencent.mm.vfs.w6.j(p18)) {
            com.tencent.mm.vfs.w6.c(r6Var.o(), p18);
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I3(this.f185121g, p17, this.f185119e, this.f185120f);
    }
}
