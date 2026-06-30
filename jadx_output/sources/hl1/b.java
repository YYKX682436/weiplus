package hl1;

/* loaded from: classes7.dex */
public class b implements hl1.h {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f282081b;

    /* renamed from: c, reason: collision with root package name */
    public int f282082c;

    /* renamed from: d, reason: collision with root package name */
    public int f282083d;

    public b(com.tencent.mm.plugin.appbrand.o6 runtime, int i17) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f282081b = runtime;
        this.f282082c = i17;
    }

    @Override // hl1.h
    public void a() {
        this.f282082c = android.graphics.Color.argb(0, android.graphics.Color.red(this.f282082c), android.graphics.Color.green(this.f282082c), android.graphics.Color.blue(this.f282082c));
        this.f282083d = 0;
    }

    @Override // hl1.h
    public void b(int i17) {
        this.f282082c = i17;
    }

    @Override // hl1.h
    public void c() {
    }

    @Override // hl1.h
    public android.animation.ValueAnimator d(int i17, int i18, long j17) {
        if (i17 == i18) {
            return null;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.setDuration(j17);
        android.view.View g17 = g();
        ofInt.addUpdateListener(new hl1.a(this, i17, i18, j17, (android.view.View) (g17 != null ? g17.getParent() : null)));
        ofInt.start();
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenBackgroundCommonRenderer", "animator[" + ofInt + ']');
        return ofInt;
    }

    @Override // hl1.h
    public int e() {
        return android.graphics.Color.alpha(this.f282082c);
    }

    @Override // hl1.h
    public void f(android.graphics.Canvas canvas, android.view.View view) {
        int i17 = this.f282083d;
        int i18 = this.f282082c;
        if (canvas != null) {
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(android.graphics.Color.argb(i17, android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18)));
            colorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            colorDrawable.draw(canvas);
        }
    }

    @Override // hl1.h
    public android.view.View g() {
        return this.f282081b.f74810s;
    }

    @Override // hl1.h
    public int h() {
        return this.f282083d;
    }

    public void i(int i17, int i18, long j17, android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // hl1.h
    public void reset() {
        this.f282083d = 0;
    }

    @Override // hl1.h
    public hl1.g type() {
        return hl1.g.f282095e;
    }
}
