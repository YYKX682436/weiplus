package dv2;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f243942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv2.v f243943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(dv2.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243943e = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dv2.s sVar = new dv2.s(this.f243943e, continuation);
        sVar.f243942d = ((java.lang.Boolean) obj).booleanValue();
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dv2.s sVar = (dv2.s) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f243942d;
        androidx.viewpager.widget.ViewPager viewPager = this.f243943e.f133659h;
        if (viewPager != null) {
            if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
                ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableViewPagerScroll(!z17);
            }
            if (z17) {
                int currentItem = viewPager.getCurrentItem();
                dv2.i iVar = dv2.i.f243865e;
                if (currentItem != 0) {
                    com.tencent.mars.xlog.Log.i("Finder.FollowAggregationTabUIC", "applyFollowOnlyToPager: force pager to FOLLOW from " + viewPager.getCurrentItem());
                    viewPager.setCurrentItem(0, false);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
