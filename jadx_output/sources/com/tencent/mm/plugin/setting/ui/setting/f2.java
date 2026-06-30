package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class f2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161020d;

    public f2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161020d = selfQRCodeUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161020d;
        boolean R4 = com.tencent.mm.storage.z3.R4(selfQRCodeUI.f160180i);
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str = selfQRCodeUI.f160180i;
        ((qv.o) u2Var).getClass();
        boolean j17 = r01.z.j(str);
        if (!j17 && !R4) {
            g4Var.a(2, com.tencent.mm.R.string.f492966ih2);
        }
        g4Var.a(1, com.tencent.mm.R.string.f492969ih5);
        if (!j17) {
            g4Var.a(3, com.tencent.mm.R.string.ihk);
        }
        if (selfQRCodeUI.f160181m) {
            g4Var.a(4, com.tencent.mm.R.string.ihj);
        }
    }
}
