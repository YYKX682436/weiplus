package df2;

/* loaded from: classes3.dex */
public final class z2 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public float f231919a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f231920b;

    /* renamed from: c, reason: collision with root package name */
    public int f231921c;

    /* renamed from: d, reason: collision with root package name */
    public int f231922d;

    /* renamed from: e, reason: collision with root package name */
    public int f231923e;

    /* renamed from: f, reason: collision with root package name */
    public float f231924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.a3 f231925g;

    public z2(df2.a3 a3Var) {
        this.f231925g = a3Var;
    }

    public final void a(android.view.View view, android.view.View target) {
        android.graphics.Rect rect;
        kotlin.jvm.internal.o.g(target, "target");
        int width = target.getWidth();
        int height = target.getHeight();
        if (view == null || view.getWidth() <= 0) {
            rect = null;
        } else {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr);
            target.getLocationOnScreen(iArr2);
            int i17 = iArr[0] - iArr2[0];
            int i18 = iArr[1] - iArr2[1];
            rect = new android.graphics.Rect(i17, i18, view.getWidth() + i17, view.getHeight() + i18);
        }
        if (rect == null || !rect.intersects(0, 0, width, height)) {
            if (rect == null) {
                com.tencent.mars.xlog.Log.i("FinderLiveMicCenterFadingAnimator", "calibrate: anchor unavailable, fallback to center");
            } else {
                com.tencent.mars.xlog.Log.i("FinderLiveMicCenterFadingAnimator", "calibrate: anchor out of target bounds, fallback to center");
            }
            int i19 = width / 2;
            int i27 = height / 2;
            this.f231920b = i19;
            this.f231921c = i27;
            this.f231922d = i19;
            this.f231923e = i27;
            this.f231924f = this.f231925g.f229669i;
            return;
        }
        this.f231920b = rect.left;
        this.f231921c = rect.top;
        this.f231922d = rect.right;
        this.f231923e = rect.bottom;
        float f17 = target.getResources().getDisplayMetrics().density;
        com.tencent.mars.xlog.Log.i("FinderLiveMicCenterFadingAnimator", "calibrate: anchor=" + view + ", target=" + target + ", rect=[" + this.f231920b + ',' + this.f231921c + ',' + this.f231922d + ',' + this.f231923e + "], dp=[" + (this.f231920b / f17) + ", " + (this.f231921c / f17) + ", " + (this.f231922d / f17) + ", " + (this.f231923e / f17) + ']');
        this.f231924f = ((float) target.getHeight()) / 2.0f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        float f17 = this.f231919a;
        int f18 = e06.p.f((int) (this.f231920b + ((0 - r2) * f17)), 0, width);
        int f19 = e06.p.f((int) (this.f231921c + ((0 - r2) * f17)), 0, height);
        int f27 = e06.p.f((int) (this.f231922d + ((width - r2) * f17)), 0, width);
        int f28 = e06.p.f((int) (this.f231923e + ((height - r0) * f17)), 0, height);
        float f29 = this.f231924f;
        float f37 = this.f231925g.f229669i;
        outline.setRoundRect(f18, f19, f27, f28, e06.p.e(f29 + ((f37 - f29) * f17), 0.0f, f37));
    }
}
