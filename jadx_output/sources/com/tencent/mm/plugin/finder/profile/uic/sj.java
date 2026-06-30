package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class sj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        super(1);
        this.f124217d = dkVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bq.z1 it = (bq.z1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f124217d;
        kotlinx.coroutines.y0 lifecycleScope = dkVar.getLifecycleScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleScope, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.finder.profile.uic.rj(dkVar, it, null), 2, null);
        return jz5.f0.f302826a;
    }
}
