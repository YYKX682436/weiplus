package nd1;

/* loaded from: classes7.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f336278g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f336279h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336280i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nd1.d1 f336281m;

    public c1(nd1.d1 d1Var, com.tencent.mm.plugin.appbrand.y yVar, int i17, int i18, int i19, int i27, java.lang.String str) {
        this.f336281m = d1Var;
        this.f336275d = yVar;
        this.f336276e = i17;
        this.f336277f = i18;
        this.f336278g = i19;
        this.f336279h = i27;
        this.f336280i = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336275d;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        if (a17 == null) {
            yVar.a(this.f336276e, this.f336281m.o("fail:page don't exist"));
            return;
        }
        if (a17.isRunning()) {
            boolean P0 = a17.t3().P0();
            int i17 = this.f336278g;
            int i18 = this.f336277f;
            if (P0) {
                android.view.View findViewById = a17.t3().x0().getRootView().findViewById(com.tencent.mm.R.id.w_);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(i18);
                    a17.c3(i17);
                    return;
                }
                return;
            }
            if (!a17.g2() || a17.n2()) {
                a17.f1();
                int i19 = this.f336279h;
                if (i19 <= 0) {
                    a17.c3(i17);
                    a17.Z2(i18);
                    return;
                }
                int f5791d = a17.r1().getF5791d();
                int foregroundColor = a17.r1().getForegroundColor();
                java.lang.String str = this.f336280i;
                android.animation.TimeInterpolator linearInterpolator = "linear".equals(str) ? new android.view.animation.LinearInterpolator() : "easeIn".equals(str) ? new android.view.animation.AccelerateInterpolator() : "easeOut".equals(str) ? new android.view.animation.DecelerateInterpolator() : "easeInOut".equals(str) ? new android.view.animation.AccelerateDecelerateInterpolator() : null;
                android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                valueAnimator.setIntValues(f5791d, i18);
                valueAnimator.setEvaluator(new android.animation.ArgbEvaluator());
                valueAnimator.setDuration(i19);
                valueAnimator.setInterpolator(linearInterpolator);
                valueAnimator.addUpdateListener(new nd1.a1(this, a17));
                android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
                valueAnimator2.setIntValues(foregroundColor, i17);
                valueAnimator2.setEvaluator(new android.animation.ArgbEvaluator());
                valueAnimator2.setDuration(i19);
                valueAnimator2.setInterpolator(linearInterpolator);
                valueAnimator2.addUpdateListener(new nd1.b1(this, a17));
                valueAnimator.start();
                valueAnimator2.start();
                a17.d1(valueAnimator, valueAnimator2);
            }
        }
    }
}
