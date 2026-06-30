package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class q0 implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.d0 f144873a;

    public q0(com.tencent.mm.plugin.location.ui.impl.r0 r0Var, com.tencent.mm.plugin.location.ui.impl.d0 d0Var) {
        this.f144873a = d0Var;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(this);
        this.f144873a.f144784j.f71220p = addr.f71220p;
    }
}
