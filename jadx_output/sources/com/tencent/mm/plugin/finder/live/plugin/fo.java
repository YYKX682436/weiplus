package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f112579d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        super(0);
        this.f112579d = apVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f112579d;
        com.tencent.mm.plugin.finder.live.util.j1 j1Var = (com.tencent.mm.plugin.finder.live.util.j1) apVar.f111916q;
        synchronized (j1Var.f115569b) {
            z17 = !j1Var.f115568a.isEmpty();
        }
        if (z17) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.eo(apVar));
            apVar.I1();
        }
        return jz5.f0.f302826a;
    }
}
