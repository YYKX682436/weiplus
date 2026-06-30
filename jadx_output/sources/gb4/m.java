package gb4;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment f270068d;

    public m(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        this.f270068d = contentFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.backgroundCoverUrl) == false) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$7"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f270068d
            gb4.q r3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(r2)
            if (r3 != 0) goto L14
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L14:
            java.lang.String r3 = "access$700"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            za4.g0 r5 = r2.B
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            boolean r5 = r5.f471082b
            if (r5 != 0) goto L34
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            za4.g0 r5 = r2.B
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r3 = r5.backgroundCoverUrl
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Le5
        L34:
            java.lang.String r3 = "access$1500"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r5 = r2.F
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r5 != 0) goto Le5
            java.lang.String r3 = "access$1502"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 1
            r2.F = r5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            gb4.q r3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(r2)
            android.widget.LinearLayout r3 = gb4.q.a(r3)
            r4 = 0
            r3.setVisibility(r4)
            gb4.q r3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(r2)
            android.widget.ImageView r3 = r3.f270072b
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            r3.setScaleType(r5)
            gb4.q r3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(r2)
            android.widget.LinearLayout r3 = gb4.q.a(r3)
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            gb4.l r5 = new gb4.l
            r5.<init>(r10)
            r3.addOnPreDrawListener(r5)
            gb4.b r3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.l0(r2)
            gb4.q r2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(r2)
            android.widget.LinearLayout r2 = gb4.q.a(r2)
            r3.getClass()
            java.lang.String r5 = "getPageHeight"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
        L8c:
            za4.g0 r7 = r3.f270048d
            java.util.LinkedList r7 = r7.f471083c
            int r7 = r7.size()
            if (r4 >= r7) goto Le2
            za4.g0 r7 = r3.f270048d
            java.util.LinkedList r7 = r7.f471083c
            java.lang.Object r7 = r7.get(r4)
            ab4.d0 r7 = (ab4.d0) r7
            android.content.Context r8 = r2.getContext()
            int r9 = r3.f270049e
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 r7 = com.tencent.mm.plugin.sns.ui.ta.a(r8, r7, r2, r9)
            android.view.View r8 = r7.x()
            android.view.ViewParent r8 = r8.getParent()
            if (r8 == 0) goto Ld1
            android.view.View r8 = r7.x()
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.ViewGroup
            if (r8 == 0) goto Ld1
            android.view.View r8 = r7.x()
            android.view.ViewParent r8 = r8.getParent()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.View r9 = r7.x()
            r8.removeView(r9)
        Ld1:
            android.view.View r8 = r7.x()
            r8.setTag(r7)
            android.view.View r7 = r7.x()
            r2.addView(r7)
            int r4 = r4 + 1
            goto L8c
        Le2:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        Le5:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb4.m.run():void");
    }
}
