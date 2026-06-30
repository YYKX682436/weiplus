package rs2;

/* loaded from: classes2.dex */
public final class l extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {

    /* renamed from: v, reason: collision with root package name */
    public boolean f399331v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f399331v = true;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new rs2.g();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b7v;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void l7(int i17) {
        if (this.f399331v) {
            this.f399331v = false;
        } else {
            if (i17 < 0 || i17 >= f7().size()) {
                return;
            }
            boolean z17 = ((zx2.i) f7().get(i17)) instanceof rs2.h;
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.google.android.material.tabs.TabLayout tabLayout;
        super.onCreate(bundle);
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
        androidx.viewpager.widget.ViewPager viewPager2 = this.f133659h;
        if (viewPager2 instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager2).setEnableViewPagerScroll(true);
        }
        this.f133658g = (com.google.android.material.tabs.TabLayout) findViewById(com.tencent.mm.R.id.nup);
        this.f133659h = (androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.f487570p16);
        findViewById(com.tencent.mm.R.id.cod).setOnClickListener(new rs2.k(this));
        if (getIntent().getIntExtra("key_purchase_member_count", 0) > 0) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.elg);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new rs2.h(string), new com.tencent.mm.plugin.finder.member.ui.FinderMemberCardListUI(), false, 4, null);
        }
        if (getIntent().getIntExtra("key_purchase_paid_collection_count", 0) > 0) {
            java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.eyc);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new rs2.h(string2), new com.tencent.mm.plugin.finder.feed.ui.FinderCollectionPurchaseListUI(), false, 4, null);
        }
        boolean z17 = getIntent().getIntExtra("key_purchase_live_count", 0) > 0;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PURCHASE_PAY_MIC_COURSE_JUMP_INTENT");
        if (byteArrayExtra != null) {
            finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            try {
                finderJumpInfo.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        } else {
            finderJumpInfo = null;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = finderJumpInfo;
        boolean z18 = getIntent().getIntExtra("key_purchase_pay_mic_course_count", 0) > 0 && finderJumpInfo2 != null;
        if (z17 && z18) {
            java.lang.String string3 = getContext().getString(com.tencent.mm.R.string.mre);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new rs2.h(string3), new com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseTabUI(), false, 4, null);
        } else {
            if (z17) {
                java.lang.String string4 = getContext().getString(com.tencent.mm.R.string.mre);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new rs2.h(string4), new com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseListUI(), false, 4, null);
            }
            if (z18) {
                java.lang.String string5 = getContext().getString(com.tencent.mm.R.string.mre);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new rs2.h(string5), new com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseMicListUI(finderJumpInfo2), false, 4, null);
            }
        }
        if (f7().size() > 1 || (tabLayout = this.f133658g) == null) {
            return;
        }
        tabLayout.setSelectedTabIndicatorColor(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f399331v = true;
    }
}
