package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class o7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f113711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        super(0);
        this.f113711d = x7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fj2.s.c(fj2.s.f263183a, ml2.q2.E, null, null, 0, 0, 30, null);
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f113711d;
        qo0.c cVar = x7Var.f115036p;
        qo0.b bVar = qo0.b.M3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SELF_EXIT_PK", true);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_TOAST_MIC", true);
        cVar.statusChange(bVar, bundle);
        x7Var.C1();
        return jz5.f0.f302826a;
    }
}
