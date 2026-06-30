package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class h5 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f143593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.i5 f143594b;

    public h5(com.tencent.mm.plugin.lite.jsapi.comms.i5 i5Var, android.app.ProgressDialog progressDialog) {
        this.f143594b = i5Var;
        this.f143593a = progressDialog;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        android.app.ProgressDialog progressDialog = this.f143593a;
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
        com.tencent.mm.plugin.lite.jsapi.comms.i5 i5Var = this.f143594b;
        if (!z17) {
            android.content.Context context = i5Var.f143610d;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.fds, 3, -1), 0).show();
            i5Var.f143614h.f143443f.a("fail");
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.tencent.mm.modelavatar.g.f(str, 3);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().i(str);
        i5Var.f143612f.putExtra("Contact_User", str);
        if (n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",42");
            i5Var.f143612f.putExtra("Contact_Scene", 42);
        }
        i5Var.f143614h.A(i5Var.f143610d, i5Var.f143613g, i5Var.f143612f);
        i5Var.f143614h.f143443f.d(false);
    }
}
