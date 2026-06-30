package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class uj implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public int f170583d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f170584e;

    public uj(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        this.f170584e = snsInfoFlip;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170584e;
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.P(snsInfoFlip) != null) {
            ((com.tencent.mm.plugin.sns.ui.SnsGalleryUI) com.tencent.mm.plugin.sns.ui.SnsInfoFlip.P(snsInfoFlip)).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170584e;
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.P(snsInfoFlip) != null) {
            ((com.tencent.mm.plugin.sns.ui.SnsGalleryUI) com.tencent.mm.plugin.sns.ui.SnsInfoFlip.P(snsInfoFlip)).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        if (i18 == 0 && this.f170583d != i17) {
            this.f170583d = i17;
            com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar imgBottomBarView = snsInfoFlip.getImgBottomBarView();
            if (imgBottomBarView != null && imgBottomBarView.a()) {
                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(2, 1, tg0.e1.f419061d);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170584e;
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip) != null) {
            if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.Q(snsInfoFlip) && com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).getCount() > 1 && !com.tencent.mm.plugin.sns.ui.SnsInfoFlip.z(snsInfoFlip)) {
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip.A(snsInfoFlip).setVisibility(0);
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip.A(snsInfoFlip).setPage(i17);
            }
            r45.jj4 jj4Var = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).m(i17).f380109d;
            java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).m(i17).f380110e;
            com.tencent.mm.plugin.sns.ui.bk K = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip);
            K.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelect", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            for (java.util.Map.Entry entry : ((java.util.HashMap) K.f167922o).entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get();
                if ((view instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) && !str2.equals(str)) {
                    ((com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) view).k(false);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelect", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).q(i17);
            int i18 = this.f170583d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            snsInfoFlip.l0(i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            snsInfoFlip.a0(jj4Var, i17, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (jj4Var.X == null) {
                db5.f0 c17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).c(i17, true);
                if (c17 == null) {
                    c17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).f(i17, true);
                }
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip.C(snsInfoFlip, c17);
                if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(snsInfoFlip) != null) {
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(snsInfoFlip).e(com.tencent.mm.plugin.sns.ui.SnsInfoFlip.D(snsInfoFlip));
                }
                snsInfoFlip.m0(c17, i17);
                if (c17 != null) {
                    c17.i();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            android.content.Context context = snsInfoFlip.V;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (context instanceof com.tencent.mm.plugin.sns.ui.SnsBrowseUI) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                android.content.Context context2 = snsInfoFlip.V;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = (com.tencent.mm.plugin.sns.ui.SnsBrowseUI) context2;
                snsBrowseUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                com.tencent.mm.ui.base.MMViewPager gallery = snsBrowseUI.f166810o.getGallery();
                gallery.setGalleryScaleListener(new com.tencent.mm.plugin.sns.ui.df(snsBrowseUI, gallery));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
            if (snsInfoFlip.U(jj4Var)) {
                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) snsInfoFlip.R(i17).first;
                if (flexibleLivePhotoView != null) {
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip.C(snsInfoFlip, flexibleLivePhotoView.getThumbImageView());
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(snsInfoFlip).e(com.tencent.mm.plugin.sns.ui.SnsInfoFlip.D(snsInfoFlip));
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(snsInfoFlip).i();
                    snsInfoFlip.m0(com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(snsInfoFlip), i17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWhenScrollSelect", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                    flexibleLivePhotoView.m("updateWhenScrollSelect");
                    dd4.f fVar = flexibleLivePhotoView.f169205w;
                    if (fVar == dd4.f.f228995d || fVar == dd4.f.f228997f) {
                        flexibleLivePhotoView.p();
                    } else {
                        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.q(flexibleLivePhotoView, flexibleLivePhotoView.f169208z, flexibleLivePhotoView.A, false, null, 8, null);
                        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = flexibleLivePhotoView.f169192g;
                        flexibleVideoView.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
                        flexibleVideoView.j("triggerDownload");
                        flexibleVideoView.f169229o.e();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWhenScrollSelect", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                }
            } else {
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).t(i17, -1, jj4Var.f377855d, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
    }
}
