package z54;

/* loaded from: classes4.dex */
public final class g extends vb4.b {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.app.Activity r1, android.view.View r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "animView"
            kotlin.jvm.internal.o.g(r2, r4)
            r0.<init>(r1, r2, r3)
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0038: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r0.f434795b = r1
            z54.e r2 = new z54.e
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r1 = r0.f434795b
            z54.f r2 = new z54.f
            r2.<init>(r0)
            r1.addListener(r2)
            android.animation.ValueAnimator r1 = r0.f434795b
            r2 = 300(0x12c, double:1.48E-321)
            r1.setDuration(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z54.g.<init>(android.app.Activity, android.view.View, boolean, int, kotlin.jvm.internal.i):void");
    }

    public static final /* synthetic */ vb4.c e(z54.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getListener$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
        vb4.c cVar = gVar.f434796c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getListener$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
        return cVar;
    }

    public static final /* synthetic */ android.view.View f(z54.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getView$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
        android.view.View view = gVar.f434794a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getView$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
        return view;
    }
}
