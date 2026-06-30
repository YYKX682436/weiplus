package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f208231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b6 f208232e;

    public x5(com.tencent.mm.ui.conversation.b6 b6Var, boolean z17) {
        this.f208232e = b6Var;
        this.f208231d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.b6 b6Var = this.f208232e;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = b6Var.f207479e.f208001d;
        if (j0Var != null && j0Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "update dialog is showing.");
            return;
        }
        r45.mm6 mm6Var = b6Var.f207478d;
        if (mm6Var.f380682u == 1) {
            if (mm6Var.f380681t == 4) {
                xv.h0 h0Var = (xv.h0) i95.n0.c(xv.h0.class);
                int i17 = b6Var.f207478d.f380681t;
                ((wv.a) h0Var).getClass();
                w73.a.e("mmdiff_apk_has_ready", 0, i17);
                ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                w73.f.k(121);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 121L, 1L, false);
            } else {
                xv.h0 h0Var2 = (xv.h0) i95.n0.c(xv.h0.class);
                int i18 = b6Var.f207478d.f380681t;
                ((wv.a) h0Var2).getClass();
                w73.a.e("mmdiff_apk_has_ready", 0, i18);
                ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                w73.f.k(60);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 60L, 1L, false);
            }
        }
        if (!this.f208231d) {
            r45.mm6 mm6Var2 = b6Var.f207478d;
            if (mm6Var2.f380684w != 1) {
                if (mm6Var2.f380683v == 1) {
                    int i19 = mm6Var2.f380681t;
                    if (i19 == 4 || i19 == 3) {
                        ((un4.e) i95.n0.c(un4.e.class)).getClass();
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).uj(b6Var.f207478d.f380680s);
                    } else {
                        ((un4.e) i95.n0.c(un4.e.class)).getClass();
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).tj(b6Var.f207478d.f380680s);
                    }
                }
                k35.n1.a();
            }
        }
        com.tencent.mm.ui.conversation.q5 q5Var = b6Var.f207479e;
        android.app.Activity activity = q5Var.f208009o;
        r45.mm6 mm6Var3 = b6Var.f207478d;
        q5Var.f208001d = db5.e1.C(activity, mm6Var3.f380674m, mm6Var3.f380673i, mm6Var3.f380675n, mm6Var3.f380676o, false, new com.tencent.mm.ui.conversation.v5(this), new com.tencent.mm.ui.conversation.w5(this));
        k35.n1.a();
    }
}
