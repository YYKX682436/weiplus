package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class h1 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185154c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185156e;

    public h1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, nw4.y2 y2Var) {
        this.f185156e = c1Var;
        this.f185152a = str;
        this.f185153b = str2;
        this.f185154c = str3;
        this.f185155d = y2Var;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", str);
        nw4.y2 y2Var = this.f185155d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185156e;
        if (bitmap == null || objArr == null || objArr.length <= 0) {
            c1Var.i5(y2Var, "addToEmoticon:fail", null);
            return;
        }
        java.lang.Object obj = objArr[0];
        if (obj == null || !(obj instanceof java.lang.String)) {
            c1Var.i5(y2Var, "addToEmoticon:fail", null);
            return;
        }
        if (!str.equals(this.f185152a)) {
            c1Var.i5(y2Var, "addToEmoticon:fail", null);
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(objArr[0].toString());
        if (!r6Var.m()) {
            c1Var.i5(y2Var, "addToEmoticon:fail", null);
            return;
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
        com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
        com.tencent.mm.vfs.w6.c(r6Var.o(), com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", p17));
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I3(c1Var, p17, this.f185153b, this.f185154c);
    }
}
