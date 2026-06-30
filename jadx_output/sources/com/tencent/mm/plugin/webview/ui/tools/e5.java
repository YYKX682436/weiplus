package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class e5 implements com.tencent.mm.pluginsdk.ui.tools.f9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r01.h0 f184129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f184131c;

    public e5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, r01.h0 h0Var, java.lang.String str) {
        this.f184131c = b5Var;
        this.f184129a = h0Var;
        this.f184130b = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f9
    public android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        rv.w2 w2Var = (rv.w2) i95.n0.c(rv.w2.class);
        return ((vw.g) w2Var).Bi((android.content.Context) this.f184131c.f183946n.get(), bitmap, this.f184129a, this.f184130b);
    }
}
