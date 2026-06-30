package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class g5 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.h5 f182320d;

    public g5(com.tencent.mm.plugin.webview.luggage.jsapi.h5 h5Var, java.lang.String str, android.content.Context context, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182320d = h5Var;
        this.f182317a = str;
        this.f182318b = context;
        this.f182319c = q5Var;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareEmotion", "imageLoaderListener onImageLoadComplete %s", str);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182319c;
        if (bitmap != null && objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof java.lang.String) && str.equals(this.f182317a)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(objArr[0].toString());
            if (r6Var.m()) {
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
                com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
                ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
                java.lang.String g17 = n22.m.g();
                ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
                com.tencent.mm.vfs.w6.c(r6Var.o(), com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", p17));
                this.f182320d.f(this.f182318b, p17, q5Var);
                return;
            }
        }
        q5Var.a("fail", null);
    }
}
