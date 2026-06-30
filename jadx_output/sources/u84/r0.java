package u84;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425661d;

    public r0(u84.m1 m1Var) {
        this.f425661d = m1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            kotlinx.coroutines.r0 r2 = u84.m1.N
            java.lang.String r2 = "access$doAlphaAnim"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            u84.m1 r4 = r12.f425661d
            r4.getClass()
            java.lang.String r5 = "doAlphaAnim"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            r4.C()
            java.lang.String r6 = "checkActivityAlive"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            r7 = 0
            android.view.View r8 = r4.f425594o
            if (r8 == 0) goto L2d
            android.content.Context r8 = r8.getContext()
            goto L2e
        L2d:
            r8 = r7
        L2e:
            boolean r9 = r8 instanceof android.app.Activity
            if (r9 == 0) goto L35
            r7 = r8
            android.app.Activity r7 = (android.app.Activity) r7
        L35:
            if (r7 != 0) goto L3b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L50
        L3b:
            boolean r8 = r7.isFinishing()
            if (r8 != 0) goto L4d
            boolean r7 = r7.isDestroyed()
            if (r7 == 0) goto L48
            goto L4d
        L48:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            r6 = 1
            goto L51
        L4d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L50:
            r6 = 0
        L51:
            if (r6 != 0) goto L60
            java.lang.String r4 = r4.j()
            java.lang.String r6 = "doAlphaAnim but check activity is not alive"
            com.tencent.mars.xlog.Log.w(r4, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto Lb1
        L60:
            android.view.ViewGroup r6 = r4.F()
            r7 = 2
            float[] r8 = new float[r7]
            r8 = {x00b8: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            java.lang.String r9 = "alpha"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r9, r8)
            android.view.animation.PathInterpolator r8 = r4.F
            r6.setInterpolator(r8)
            r10 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r10)
            r4.D = r6
            android.view.ViewGroup r6 = r4.E()
            float[] r7 = new float[r7]
            r7 = {x00c0: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r9, r7)
            android.view.animation.PathInterpolator r7 = r4.G
            r6.setInterpolator(r7)
            r6.setDuration(r10)
            r4.E = r6
            u84.p0 r7 = new u84.p0
            r7.<init>(r4)
            r6.addListener(r7)
            android.animation.ObjectAnimator r6 = r4.D
            if (r6 == 0) goto La7
            u84.q0 r7 = new u84.q0
            r7.<init>(r4)
            r6.addListener(r7)
        La7:
            android.animation.ObjectAnimator r4 = r4.D
            if (r4 == 0) goto Lae
            r4.start()
        Lae:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        Lb1:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u84.r0.run():void");
    }
}
