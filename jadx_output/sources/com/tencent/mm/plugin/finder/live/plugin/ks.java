package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ks extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        super(0);
        this.f113316d = etVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f227164o;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113316d;
        if (!((d85.d1) m0Var).Di(g0Var, f0Var, new com.tencent.mm.plugin.finder.live.plugin.is(etVar))) {
            int i17 = com.tencent.mm.plugin.finder.live.plugin.et.J1;
            etVar.getClass();
            etVar.f112447l1 = null;
            pm0.v.L("Finder.LiveInputPlugin_requestLbs", true, new com.tencent.mm.plugin.finder.live.plugin.js(etVar));
        }
        return jz5.f0.f302826a;
    }
}
