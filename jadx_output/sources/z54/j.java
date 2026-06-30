package z54;

/* loaded from: classes4.dex */
public final class j extends vb4.b {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(float r1, float r2, long r3, android.app.Activity r5, android.view.View r6, boolean r7, int r8, kotlin.jvm.internal.i r9) {
        /*
            r0 = this;
            r8 = r8 & 32
            r9 = 1
            if (r8 == 0) goto L6
            r7 = r9
        L6:
            java.lang.String r8 = "context"
            kotlin.jvm.internal.o.g(r5, r8)
            java.lang.String r8 = "animView"
            kotlin.jvm.internal.o.g(r6, r8)
            r0.<init>(r5, r6, r7)
            r5 = 2
            float[] r5 = new float[r5]
            r6 = 0
            r5[r6] = r1
            r5[r9] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r5)
            r0.f434795b = r1
            z54.h r2 = new z54.h
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r1 = r0.f434795b
            z54.i r2 = new z54.i
            r2.<init>(r0)
            r1.addListener(r2)
            android.animation.ValueAnimator r1 = r0.f434795b
            r1.setDuration(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z54.j.<init>(float, float, long, android.app.Activity, android.view.View, boolean, int, kotlin.jvm.internal.i):void");
    }

    public static final /* synthetic */ vb4.c e(z54.j jVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getListener$p$s495274197", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation");
        vb4.c cVar = jVar.f434796c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getListener$p$s495274197", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation");
        return cVar;
    }
}
