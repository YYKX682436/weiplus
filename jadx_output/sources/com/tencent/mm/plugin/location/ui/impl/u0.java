package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class u0 implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.d0 f144903a;

    public u0(com.tencent.mm.plugin.location.ui.impl.v0 v0Var, com.tencent.mm.plugin.location.ui.impl.d0 d0Var) {
        this.f144903a = d0Var;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(this);
        this.f144903a.f144784j.f71220p = addr.f71220p;
    }
}
