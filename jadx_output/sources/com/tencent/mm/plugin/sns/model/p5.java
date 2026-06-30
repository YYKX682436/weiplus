package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class p5 extends mt0.a {

    /* renamed from: f, reason: collision with root package name */
    public long f164578f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f164579g;

    /* renamed from: h, reason: collision with root package name */
    public final int f164580h;

    public p5(java.lang.String str, com.tencent.mm.memory.r rVar, long j17) {
        super(str, rVar);
        this.f164579g = false;
        this.f164580h = 255;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (j17 != 0) {
            this.f164578f = j17;
            hashMap.put(str, java.lang.Boolean.TRUE);
            this.f164579g = true;
        } else {
            if (hashMap.containsKey(str)) {
                return;
            }
            this.f164578f = android.os.SystemClock.uptimeMillis();
            hashMap.put(str, java.lang.Boolean.TRUE);
            this.f164579g = true;
        }
    }

    public long d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartTime", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        long j17 = this.f164578f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartTime", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        return j17;
    }

    @Override // mt0.a, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        android.graphics.Rect bounds = getBounds();
        android.graphics.Bitmap bitmap = this.f331186e.f68970d;
        if (ca4.z0.f(bitmap)) {
            boolean z17 = this.f164579g;
            int i17 = this.f164580h;
            android.graphics.Paint paint = this.f331185d;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                long j17 = this.f164578f;
                float f17 = ((float) (uptimeMillis - j17)) / 150.0f;
                if (j17 == 0) {
                    f17 = 0.0f;
                }
                if (f17 >= 1.0f) {
                    this.f164579g = false;
                    paint.setAlpha(i17);
                    canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
                } else {
                    paint.setAlpha((int) (i17 * f17));
                    canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
                    invalidateSelf();
                }
            } else {
                paint.setAlpha(i17);
                canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
            }
        } else {
            canvas.drawColor(-1118482);
            this.f164578f = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
    }
}
