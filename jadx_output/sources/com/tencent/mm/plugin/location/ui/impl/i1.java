package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class i1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144830a;

    public i1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144830a = x1Var;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.LOCAION;
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144830a;
        if (booleanValue) {
            x1Var.onBusinessPermissionGranted(g0Var.f227192d);
        } else {
            x1Var.onBusinessPermissionDenied(g0Var.f227192d);
        }
    }
}
