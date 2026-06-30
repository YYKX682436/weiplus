package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class tj extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        super(2);
        this.f124243d = dkVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f124243d;
        dkVar.P6().getCommonConfig().f330193c = booleanValue;
        dkVar.P6().setNotDispatchToParent(booleanValue);
        dkVar.f123643t = booleanValue;
        if (booleanValue) {
            android.app.Activity context = dkVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class)).x7();
        } else {
            android.app.Activity context2 = dkVar.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
            androidx.viewpager.widget.ViewPager viewPager = finderProfileTabUIC.f133659h;
            if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
                ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableSrollHorizontally(true);
            }
            finderProfileTabUIC.V6();
        }
        return jz5.f0.f302826a;
    }
}
