package d22;

/* loaded from: classes12.dex */
public final class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f225848d;

    public i0(d22.k0 k0Var) {
        this.f225848d = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        boolean z18;
        s25.a wi6;
        d22.k0 k0Var = this.f225848d;
        boolean z19 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(k0Var.f364225c)) {
            com.tencent.mars.xlog.Log.w(k0Var.f225853j, "userName is null");
            z17 = false;
            z18 = false;
        } else {
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(k0Var.f364225c, k0Var.f364229g);
            z18 = c01.ia.C(o27);
            z17 = c01.ia.e(o27);
        }
        com.tencent.mars.xlog.Log.i(k0Var.f225853j, "isShareSaveForbidden:%s, forbiddenAllOp: %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        if (!z17) {
            if (!k0Var.f225852i.I1()) {
                k0Var.getClass();
                g4Var.a(0, com.tencent.mm.R.string.f489844dc);
            }
            if (!z18) {
                g4Var.a(k0Var.f225854k, com.tencent.mm.R.string.i29);
            }
            k12.s sVar = (k12.s) i95.n0.c(k12.s.class);
            if (sVar != null && (wi6 = ((g30.h) sVar).wi()) != null) {
                if (((y12.h) wi6).H(k0Var.f225852i)) {
                    z19 = true;
                }
            }
            if (z19 && (com.tencent.mm.sdk.platformtools.t8.K0(k0Var.f364227e) || !com.tencent.mm.storage.z3.K3(k0Var.f364227e))) {
                g4Var.a(k0Var.f225855l, com.tencent.mm.R.string.bxa);
            }
        }
        g4Var.a(k0Var.f225856m, com.tencent.mm.R.string.bw_);
    }
}
