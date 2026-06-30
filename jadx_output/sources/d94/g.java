package d94;

/* loaded from: classes4.dex */
public class g implements d94.b {

    /* renamed from: a, reason: collision with root package name */
    public final d94.i f227555a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f227556b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Point f227557c = new android.graphics.Point();

    /* renamed from: d, reason: collision with root package name */
    public final d94.a f227558d;

    /* renamed from: e, reason: collision with root package name */
    public d94.f f227559e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f227560f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f227561g;

    /* renamed from: h, reason: collision with root package name */
    public final int f227562h;

    public g(android.content.Context context, android.widget.FrameLayout frameLayout, d94.a aVar, int i17) {
        this.f227555a = new d94.i(context, frameLayout);
        this.f227556b = frameLayout;
        this.f227558d = aVar;
        this.f227562h = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r9 != 3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "handleTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r9 != 0) goto Le
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        Le:
            r9.getAction()     // Catch: java.lang.Throwable -> L8a
            d94.a r2 = r8.f227558d
            r3 = 2
            if (r2 == 0) goto L30
            android.graphics.Point r4 = r8.f227560f     // Catch: java.lang.Throwable -> L8a
            int r5 = r8.f227562h
            if (r4 == 0) goto L1e
            if (r5 != r3) goto L24
        L1e:
            android.graphics.Point r4 = r2.b()     // Catch: java.lang.Throwable -> L8a
            r8.f227560f = r4     // Catch: java.lang.Throwable -> L8a
        L24:
            android.graphics.Rect r4 = r8.f227561g     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L2a
            if (r5 != r3) goto L30
        L2a:
            android.graphics.Rect r2 = r2.a()     // Catch: java.lang.Throwable -> L8a
            r8.f227561g = r2     // Catch: java.lang.Throwable -> L8a
        L30:
            float r2 = r9.getX()     // Catch: java.lang.Throwable -> L8a
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L8a
            android.graphics.Point r4 = r8.f227560f     // Catch: java.lang.Throwable -> L8a
            int r4 = r4.x     // Catch: java.lang.Throwable -> L8a
            int r2 = r2 + r4
            float r4 = r9.getY()     // Catch: java.lang.Throwable -> L8a
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L8a
            android.graphics.Point r5 = r8.f227560f     // Catch: java.lang.Throwable -> L8a
            int r5 = r5.y     // Catch: java.lang.Throwable -> L8a
            int r4 = r4 + r5
            android.graphics.Point r5 = r8.f227557c
            r5.set(r2, r4)     // Catch: java.lang.Throwable -> L8a
            int r9 = r9.getAction()     // Catch: java.lang.Throwable -> L8a
            d94.i r6 = r8.f227555a
            if (r9 == 0) goto L86
            r7 = 1
            if (r9 == r7) goto L70
            if (r9 == r3) goto L5a
            r3 = 3
            if (r9 == r3) goto L70
            goto La3
        L5a:
            android.graphics.Rect r9 = r8.f227561g     // Catch: java.lang.Throwable -> L8a
            if (r9 != 0) goto L62
            r6.a(r5)     // Catch: java.lang.Throwable -> L8a
            goto La3
        L62:
            boolean r9 = r9.contains(r2, r4)     // Catch: java.lang.Throwable -> L8a
            if (r9 == 0) goto L6c
            r6.a(r5)     // Catch: java.lang.Throwable -> L8a
            goto La3
        L6c:
            r6.h()     // Catch: java.lang.Throwable -> L8a
            goto La3
        L70:
            android.graphics.Rect r9 = r8.f227561g     // Catch: java.lang.Throwable -> L8a
            if (r9 == 0) goto L7a
            boolean r9 = r9.contains(r2, r4)     // Catch: java.lang.Throwable -> L8a
            if (r9 == 0) goto L7d
        L7a:
            r6.a(r5)     // Catch: java.lang.Throwable -> L8a
        L7d:
            r6.h()     // Catch: java.lang.Throwable -> L8a
            r9 = 0
            r8.f227561g = r9     // Catch: java.lang.Throwable -> L8a
            r8.f227560f = r9     // Catch: java.lang.Throwable -> L8a
            goto La3
        L86:
            r6.h()     // Catch: java.lang.Throwable -> L8a
            goto La3
        L8a:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "handleTouchEvent, exp="
            r2.<init>(r3)
            java.lang.String r9 = r9.toString()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "ParticleAnimProxy"
            com.tencent.mars.xlog.Log.e(r2, r9)
        La3:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d94.g.a(android.view.MotionEvent):void");
    }

    public void b(d94.f fVar) {
        d94.i iVar = this.f227555a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
        try {
            if (this.f227559e != fVar) {
                com.tencent.mars.xlog.Log.i("ParticleAnimProxy", "setAnimConfig, old=" + this.f227559e);
                com.tencent.mars.xlog.Log.i("ParticleAnimProxy", "setAnimConfig, new=" + fVar);
                iVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                com.tencent.mars.xlog.Log.i("ParticleGenerator", "clear");
                iVar.f227566b.clear();
                iVar.f227567c.clear();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                android.view.ViewGroup viewGroup = this.f227556b;
                viewGroup.removeAllViews();
                if (fVar != null) {
                    iVar.j(fVar);
                    viewGroup.setVisibility(0);
                } else {
                    viewGroup.setVisibility(8);
                }
                this.f227559e = fVar;
            } else {
                com.tencent.mars.xlog.Log.i("ParticleAnimProxy", "setAnimConfig, config not change");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ParticleAnimProxy", "setAnimConfig, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
    }
}
