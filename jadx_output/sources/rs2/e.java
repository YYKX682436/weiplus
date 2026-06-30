package rs2;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs2.f f399326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f399327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rs2.f fVar, android.os.Bundle bundle, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399326d = fVar;
        this.f399327e = bundle;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rs2.e(this.f399326d, this.f399327e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rs2.e eVar = (rs2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.google.android.material.tabs.TabLayout tabLayout;
        byte[] byteArrayExtra;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.os.Bundle bundle = this.f399327e;
        rs2.f fVar = this.f399326d;
        super/*com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC*/.onCreate(bundle);
        androidx.viewpager.widget.ViewPager viewPager = fVar.f133659h;
        if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
        androidx.viewpager.widget.ViewPager viewPager2 = fVar.f133659h;
        if (viewPager2 instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager2).setEnableViewPagerScroll(true);
        }
        fVar.f133658g = (com.google.android.material.tabs.TabLayout) fVar.findViewById(com.tencent.mm.R.id.nup);
        fVar.f133659h = (androidx.viewpager.widget.ViewPager) fVar.findViewById(com.tencent.mm.R.id.f487570p16);
        rs2.f fVar2 = this.f399326d;
        java.lang.String string = fVar2.getContext().getString(com.tencent.mm.R.string.f0n);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(fVar2, new rs2.b(string), new com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseListUI(), false, 4, null);
        if (fVar.getIntent().getIntExtra("key_purchase_pay_mic_course_count", 0) > 0 && (byteArrayExtra = fVar.getIntent().getByteArrayExtra("KEY_PURCHASE_PAY_MIC_COURSE_JUMP_INTENT")) != null) {
            rs2.f fVar3 = this.f399326d;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            try {
                finderJumpInfo.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            java.lang.String string2 = fVar3.getContext().getString(com.tencent.mm.R.string.f491743mn1);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(fVar3, new rs2.b(string2), new com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseMicListUI(finderJumpInfo), false, 4, null);
        }
        if (fVar.f7().size() <= 1 && (tabLayout = fVar.f133658g) != null) {
            tabLayout.setSelectedTabIndicatorColor(0);
        }
        return jz5.f0.f302826a;
    }
}
