package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class m implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.n f182396e;

    public m(com.tencent.mm.plugin.webview.luggage.jsapi.n nVar, java.lang.String str, android.content.Context context, java.lang.String str2, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182396e = nVar;
        this.f182392a = str;
        this.f182393b = context;
        this.f182394c = str2;
        this.f182395d = q5Var;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddToEmotion", "imageLoaderListener onImageLoadComplete %s", str);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182395d;
        if (bitmap != null && objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof java.lang.String) && str.equals(this.f182392a)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(objArr[0].toString());
            if (r6Var.m()) {
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
                com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
                ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
                java.lang.String g17 = n22.m.g();
                ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
                com.tencent.mm.vfs.w6.c(r6Var.o(), com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", p17));
                this.f182396e.f(this.f182393b, p17, this.f182394c, q5Var);
                return;
            }
        }
        q5Var.a("fail", null);
    }
}
