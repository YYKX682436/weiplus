package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class zf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f124428d = finderProfileTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124428d;
        if (!finderProfileTabUIC.y7(6)) {
            android.app.Activity context = finderProfileTabUIC.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
            if (p2Var != null) {
                p2Var.O6(11732, 4, 6);
            }
            gm0.j1.d().a(11732, new com.tencent.mm.plugin.finder.profile.uic.yf(finderProfileTabUIC));
            finderProfileTabUIC.C7();
        }
        return jz5.f0.f302826a;
    }
}
