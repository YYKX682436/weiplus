package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class h implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.BaseLifeUI f152321a;

    public h(com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI) {
        this.f152321a = baseLifeUI;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.LOCAION;
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152321a;
        if (booleanValue) {
            baseLifeUI.onBusinessPermissionGranted(g0Var.f227192d);
        } else {
            baseLifeUI.onBusinessPermissionDenied(g0Var.f227192d);
        }
    }
}
