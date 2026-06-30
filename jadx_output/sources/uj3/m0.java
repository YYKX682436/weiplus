package uj3;

/* loaded from: classes14.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f428330d;

    public m0(uj3.v0 v0Var) {
        this.f428330d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View backgroundView;
        android.graphics.Canvas lockCanvas;
        if (this.f428330d.F || (backgroundView = this.f428330d.getBackgroundView()) == null) {
            return;
        }
        uj3.v0 v0Var = this.f428330d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        uj3.k screenFuncConfig = v0Var.getScreenFuncConfig();
        boolean contains = screenFuncConfig != null ? screenFuncConfig.f428303c.contains(11) : false;
        synchronized (v0Var) {
            int measuredWidth = backgroundView.getMeasuredWidth() - (backgroundView.getMeasuredWidth() % 4);
            int measuredHeight = backgroundView.getMeasuredHeight() - (backgroundView.getMeasuredHeight() % 4);
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (v0Var.f428373v == null) {
                    v0Var.f428373v = new yj3.g(measuredWidth, measuredHeight, new uj3.t0(v0Var));
                }
                yj3.g gVar = v0Var.f428373v;
                if (gVar != null) {
                    gVar.b(measuredWidth, measuredHeight);
                }
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                android.view.Surface surface = v0Var.f428374w;
                if (surface != null && (lockCanvas = surface.lockCanvas(null)) != null) {
                    lockCanvas.drawPaint(new android.graphics.Paint());
                    lockCanvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
                    if (!contains) {
                        backgroundView.draw(lockCanvas);
                    }
                    long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
                    uj3.k1 k1Var = v0Var.f428361g;
                    if (k1Var != null) {
                        k1Var.f428309e = (k1Var.f428309e + elapsedRealtime3) / 2;
                    }
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    uj3.c cVar = v0Var.f428368q;
                    if (cVar != null) {
                        cVar.a(lockCanvas);
                    }
                    long elapsedRealtime5 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime4;
                    uj3.k1 k1Var2 = v0Var.f428361g;
                    if (k1Var2 != null) {
                        k1Var2.f428308d = (k1Var2.f428308d + elapsedRealtime5) / 2;
                    }
                    android.view.Surface surface2 = v0Var.f428374w;
                    if (surface2 != null) {
                        surface2.unlockCanvasAndPost(lockCanvas);
                    }
                }
            }
        }
        uj3.k1 mScreenReportData = v0Var.getMScreenReportData();
        if (mScreenReportData == null) {
            return;
        }
        uj3.k1 mScreenReportData2 = v0Var.getMScreenReportData();
        mScreenReportData.f428307c = ((mScreenReportData2 != null ? mScreenReportData2.f428307c : 0L) + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime)) / 2;
    }
}
