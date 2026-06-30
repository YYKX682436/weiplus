package ub3;

/* loaded from: classes14.dex */
public class i implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f426107d = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479884hx);

    /* renamed from: e, reason: collision with root package name */
    public int f426108e;

    /* renamed from: f, reason: collision with root package name */
    public float f426109f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f426110g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426111h;

    public i(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426111h = luckyMoneyF2FQRCodeUI;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "onAccuracyChanged");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r7 > 0.0f) goto L15;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSensorChanged(android.hardware.SensorEvent r7) {
        /*
            r6 = this;
            android.hardware.Sensor r0 = r7.sensor
            int r0 = r0.getType()
            r1 = 1
            if (r0 != r1) goto L82
            com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI r0 = r6.f426111h
            int r2 = r0.f145069J
            if (r2 > 0) goto L10
            return
        L10:
            int r2 = r6.f426108e
            if (r2 != 0) goto L1e
            int r2 = o25.n1.a(r0)
            float r3 = r6.f426107d
            int r3 = (int) r3
            int r2 = r2 + r3
            r6.f426108e = r2
        L1e:
            float[] r7 = r7.values
            r7 = r7[r1]
            float r2 = r6.f426109f
            float r2 = r7 - r2
            float r2 = java.lang.Math.abs(r2)
            double r2 = (double) r2
            r4 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L35
            return
        L35:
            r6.f426109f = r7
            r2 = -1069547520(0xffffffffc0400000, float:-3.0)
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 >= 0) goto L3f
        L3d:
            r7 = r2
            goto L45
        L3f:
            r2 = 0
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 <= 0) goto L45
            goto L3d
        L45:
            r2 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 / r2
            int r2 = r6.f426108e
            float r3 = (float) r2
            float r7 = r7 * r3
            float r2 = (float) r2
            float r7 = r7 + r2
            android.view.View r2 = r0.f145070g
            r2.getPaddingTop()
            android.animation.ValueAnimator r2 = r6.f426110g
            if (r2 == 0) goto L5a
            r2.cancel()
        L5a:
            r2 = 2
            float[] r2 = new float[r2]
            android.view.View r0 = r0.f145070g
            int r0 = r0.getPaddingTop()
            float r0 = (float) r0
            r3 = 0
            r2[r3] = r0
            r2[r1] = r7
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r2)
            r0 = 200(0xc8, double:9.9E-322)
            android.animation.ValueAnimator r7 = r7.setDuration(r0)
            r6.f426110g = r7
            ub3.h r0 = new ub3.h
            r0.<init>(r6)
            r7.addUpdateListener(r0)
            android.animation.ValueAnimator r7 = r6.f426110g
            r7.start()
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ub3.i.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
