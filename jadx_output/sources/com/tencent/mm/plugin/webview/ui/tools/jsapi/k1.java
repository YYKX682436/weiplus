package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class k1 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185224d;

    public k1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f185224d = c1Var;
        this.f185221a = str;
        this.f185222b = str2;
        this.f185223c = y2Var;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", str);
        nw4.y2 y2Var = this.f185223c;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185224d;
        if (bitmap == null || objArr == null || objArr.length <= 0) {
            c1Var.i5(y2Var, "shareEmoticon:fail", null);
            return;
        }
        java.lang.Object obj = objArr[0];
        if (obj == null || !(obj instanceof java.lang.String)) {
            c1Var.i5(y2Var, "shareEmoticon:fail", null);
            return;
        }
        if (!str.equals(this.f185221a)) {
            c1Var.i5(y2Var, "shareEmoticon:fail", null);
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(objArr[0].toString());
        if (!r6Var.m()) {
            c1Var.i5(y2Var, "shareEmoticon:fail", null);
            return;
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
        com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
        com.tencent.mm.vfs.w6.c(r6Var.o(), com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", p17));
        c1Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.l1(c1Var, p17, this.f185222b));
    }
}
