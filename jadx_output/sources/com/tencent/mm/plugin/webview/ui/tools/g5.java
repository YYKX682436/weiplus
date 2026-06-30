package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class g5 implements com.tencent.mm.pluginsdk.ui.tools.f9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r01.h0 f184750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f184752c;

    public g5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, r01.h0 h0Var, java.lang.String str) {
        this.f184752c = b5Var;
        this.f184750a = h0Var;
        this.f184751b = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f9
    public android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        rv.w2 w2Var = (rv.w2) i95.n0.c(rv.w2.class);
        return ((vw.g) w2Var).Bi((android.content.Context) this.f184752c.f183946n.get(), bitmap, this.f184750a, this.f184751b);
    }
}
