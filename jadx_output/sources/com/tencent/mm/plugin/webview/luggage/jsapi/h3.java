package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class h3 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f182329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f182330d;

    public h3(com.tencent.mm.plugin.webview.luggage.jsapi.i3 i3Var, android.content.Context context, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, android.app.ProgressDialog progressDialog, android.content.Intent intent) {
        this.f182327a = context;
        this.f182328b = q5Var;
        this.f182329c = progressDialog;
        this.f182330d = intent;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182328b;
        android.content.Context context = this.f182327a;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiProfile", "getNow callback, msghandler has already been detached!");
            q5Var.a("fail", null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f182329c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str);
        }
        if (n17 == null || ((int) n17.E2) <= 0) {
            z17 = false;
        } else {
            str = n17.d1();
        }
        if (!z17) {
            com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.webview.luggage.jsapi.g3(this));
            q5Var.a("fail", null);
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.tencent.mm.modelavatar.g.f(str, 3);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().i(str);
        android.content.Intent intent = this.f182330d;
        intent.addFlags(268435456);
        intent.putExtra("Contact_User", str);
        if (n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",42");
            intent.putExtra("Contact_Scene", 42);
        }
        ((com.tencent.mm.app.y7) dw4.a.f244297a).l(intent, context);
        q5Var.a(null, null);
    }
}
