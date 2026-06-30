package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(1);
        this.f123971d = finderProfileFeedUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a callback = (yz5.a) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        androidx.fragment.app.Fragment fragment = this.f123971d.getFragment();
        kotlin.jvm.internal.o.d(fragment);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = (com.tencent.mm.plugin.finder.profile.uic.f4) a17;
        f4Var.f123695s = true;
        f4Var.f123701y = callback;
        f4Var.R6(com.tencent.mm.R.id.rlc);
        return jz5.f0.f302826a;
    }
}
