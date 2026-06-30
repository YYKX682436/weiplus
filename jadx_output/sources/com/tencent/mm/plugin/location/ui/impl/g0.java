package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class g0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.p0 f144819a;

    public g0(com.tencent.mm.plugin.location.ui.impl.p0 p0Var) {
        this.f144819a = p0Var;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.LOCAION;
        com.tencent.mm.plugin.location.ui.impl.p0 p0Var = this.f144819a;
        if (booleanValue) {
            p0Var.onBusinessPermissionGranted(g0Var.f227192d);
        } else {
            p0Var.onBusinessPermissionDenied(g0Var.f227192d);
        }
    }
}
