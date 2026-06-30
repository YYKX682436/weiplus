package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class e2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f160973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f160974e;

    public e2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f160974e = selfQRCodeUI;
        this.f160973d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f160973d);
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f160974e;
        if (!com.tencent.mm.storage.z3.R4(selfQRCodeUI.f160180i)) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str = selfQRCodeUI.f160180i;
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(str)) {
                return;
            }
        }
        selfQRCodeUI.finish();
    }
}
