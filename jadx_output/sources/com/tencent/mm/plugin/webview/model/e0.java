package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class e0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h0 f182843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182845c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182846d;

    public e0(com.tencent.mm.plugin.webview.model.h0 h0Var, java.lang.String str, android.content.Context context, java.lang.String str2) {
        this.f182843a = h0Var;
        this.f182844b = str;
        this.f182845c = context;
        this.f182846d = str2;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewShrotcutManager", "getContactCallBack, suc = %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.webview.model.h0 h0Var = this.f182843a;
        java.lang.String str2 = this.f182844b;
        if (!z17) {
            if (h0Var != null) {
                h0Var.a(str2, false);
                return;
            }
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.f2())) {
            if (h0Var != null) {
                h0Var.a(str2, false);
            }
        } else {
            com.tencent.mm.plugin.webview.model.j0.b(this.f182845c, str2, this.f182846d, n17.f2(), h0Var);
        }
    }
}
