package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class g7 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MultiStageCitySelectUI f210441a;

    public g7(com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI) {
        this.f210441a = multiStageCitySelectUI;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.LOCAION;
        com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = this.f210441a;
        if (booleanValue) {
            multiStageCitySelectUI.onBusinessPermissionGranted(g0Var.f227192d);
        } else {
            multiStageCitySelectUI.onBusinessPermissionDenied(g0Var.f227192d);
        }
    }
}
