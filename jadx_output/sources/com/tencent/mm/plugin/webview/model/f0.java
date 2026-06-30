package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class f0 implements kv.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h0 f182867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182869h;

    public f0(java.lang.String str, android.content.Context context, com.tencent.mm.plugin.webview.model.h0 h0Var, java.lang.String str2, java.lang.String str3) {
        this.f182865d = str;
        this.f182866e = context;
        this.f182867f = h0Var;
        this.f182868g = str2;
        this.f182869h = str3;
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        java.lang.String str2 = this.f182865d;
        if (str2.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewShrotcutManager", "notifyChanged avatar(%s).", str);
            ((java.util.LinkedList) com.tencent.mm.plugin.webview.model.j0.f182949a).remove(this);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().q(this);
            android.content.Context context = this.f182866e;
            android.graphics.Bitmap f17 = com.tencent.mm.plugin.webview.model.j0.f(context, str2);
            com.tencent.mm.plugin.webview.model.h0 h0Var = this.f182867f;
            if (f17 == null || f17.isRecycled()) {
                if (h0Var != null) {
                    h0Var.a(str2, false);
                    return;
                }
                return;
            }
            android.content.Intent c17 = com.tencent.mm.plugin.webview.model.j0.c(this.f182866e, this.f182865d, this.f182868g, this.f182869h, f17, true);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewShrotcutManager", "intent is null");
                if (h0Var != null) {
                    h0Var.a(str2, false);
                    return;
                }
                return;
            }
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.c.a(context, c17, null, null, false);
            if (h0Var != null) {
                h0Var.a(str2, true);
            }
        }
    }
}
