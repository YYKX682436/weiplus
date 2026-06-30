package gf2;

/* loaded from: classes10.dex */
public final class k implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271289d;

    public k(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView) {
        this.f271289d = anchorMilestoneShareView;
    }

    public final void a(int i17) {
        java.util.ArrayList arrayList = this.f271289d.f111582q;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("postViewList");
            throw null;
        }
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i17);
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.ci6) : null;
        if (findViewById == null) {
            return;
        }
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById.findViewById(com.tencent.mm.R.id.v6f);
        if (mMPAGView != null) {
            mMPAGView.setProgress(0.0d);
        }
        if (mMPAGView != null) {
            mMPAGView.n();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        a(this.f271289d.f111584s + 1);
        a(r1.f111584s - 1);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMilestoneShareView", "onPageSelected " + i17);
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271289d;
        anchorMilestoneShareView.f111584s = i17;
        com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator commonCircleIndicator = anchorMilestoneShareView.f111576h;
        if (commonCircleIndicator == null) {
            kotlin.jvm.internal.o.o("circleIndicator");
            throw null;
        }
        commonCircleIndicator.a(i17);
        java.util.ArrayList arrayList = anchorMilestoneShareView.f111582q;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("postViewList");
            throw null;
        }
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i17);
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.ci6) : null;
        if (findViewById == null || (mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById.findViewById(com.tencent.mm.R.id.v6f)) == null) {
            return;
        }
        mMPAGView.g();
    }
}
