package ea;

/* loaded from: classes15.dex */
public abstract class l {

    /* renamed from: b, reason: collision with root package name */
    public android.animation.Animator f250481b;

    /* renamed from: c, reason: collision with root package name */
    public w9.h f250482c;

    /* renamed from: d, reason: collision with root package name */
    public w9.h f250483d;

    /* renamed from: e, reason: collision with root package name */
    public w9.h f250484e;

    /* renamed from: f, reason: collision with root package name */
    public w9.h f250485f;

    /* renamed from: g, reason: collision with root package name */
    public float f250486g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f250487h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f250488i;

    /* renamed from: j, reason: collision with root package name */
    public fa.d f250489j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.drawable.Drawable f250490k;

    /* renamed from: l, reason: collision with root package name */
    public float f250491l;

    /* renamed from: m, reason: collision with root package name */
    public float f250492m;

    /* renamed from: n, reason: collision with root package name */
    public float f250493n;

    /* renamed from: o, reason: collision with root package name */
    public int f250494o;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f250496q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f250497r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.android.material.internal.VisibilityAwareImageButton f250498s;

    /* renamed from: t, reason: collision with root package name */
    public final ka.b f250499t;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnPreDrawListener f250504y;

    /* renamed from: z, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f250479z = w9.a.f444036c;
    public static final int[] A = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] B = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] C = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] D = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_enabled};
    public static final int[] F = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public int f250480a = 0;

    /* renamed from: p, reason: collision with root package name */
    public float f250495p = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f250500u = new android.graphics.Rect();

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.RectF f250501v = new android.graphics.RectF();

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.RectF f250502w = new android.graphics.RectF();

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Matrix f250503x = new android.graphics.Matrix();

    public l(com.google.android.material.internal.VisibilityAwareImageButton visibilityAwareImageButton, ka.b bVar) {
        this.f250498s = visibilityAwareImageButton;
        this.f250499t = bVar;
        fa.a0 a0Var = new fa.a0();
        a0Var.a(A, d(new ea.h(this)));
        a0Var.a(B, d(new ea.g(this)));
        a0Var.a(C, d(new ea.g(this)));
        a0Var.a(D, d(new ea.g(this)));
        a0Var.a(E, d(new ea.j(this)));
        a0Var.a(F, d(new ea.f(this)));
        this.f250486g = visibilityAwareImageButton.getRotation();
    }

    public final void a(float f17, android.graphics.Matrix matrix) {
        matrix.reset();
        if (this.f250498s.getDrawable() == null || this.f250494o == 0) {
            return;
        }
        android.graphics.RectF rectF = this.f250501v;
        android.graphics.RectF rectF2 = this.f250502w;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i17 = this.f250494o;
        rectF2.set(0.0f, 0.0f, i17, i17);
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.CENTER);
        int i18 = this.f250494o;
        matrix.postScale(f17, f17, i18 / 2.0f, i18 / 2.0f);
    }

    public final android.animation.AnimatorSet b(w9.h hVar, float f17, float f18, float f19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Property property = android.view.View.ALPHA;
        float[] fArr = {f17};
        com.google.android.material.internal.VisibilityAwareImageButton visibilityAwareImageButton = this.f250498s;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(visibilityAwareImageButton, (android.util.Property<com.google.android.material.internal.VisibilityAwareImageButton, java.lang.Float>) property, fArr);
        hVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(visibilityAwareImageButton, (android.util.Property<com.google.android.material.internal.VisibilityAwareImageButton, java.lang.Float>) android.view.View.SCALE_X, f18);
        hVar.d("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(visibilityAwareImageButton, (android.util.Property<com.google.android.material.internal.VisibilityAwareImageButton, java.lang.Float>) android.view.View.SCALE_Y, f18);
        hVar.d("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        android.graphics.Matrix matrix = this.f250503x;
        a(f19, matrix);
        android.animation.ObjectAnimator ofObject = android.animation.ObjectAnimator.ofObject(visibilityAwareImageButton, new w9.f(), new w9.g(), new android.graphics.Matrix(matrix));
        hVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        w9.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public fa.d c(int i17, android.content.res.ColorStateList colorStateList) {
        android.content.Context context = this.f250498s.getContext();
        fa.d h17 = h();
        int color = b3.l.getColor(context, com.tencent.mm.R.color.f478879jp);
        int color2 = b3.l.getColor(context, com.tencent.mm.R.color.f478878jo);
        int color3 = b3.l.getColor(context, com.tencent.mm.R.color.f478876jm);
        int color4 = b3.l.getColor(context, com.tencent.mm.R.color.f478877jn);
        h17.f260585f = color;
        h17.f260586g = color2;
        h17.f260587h = color3;
        h17.f260588i = color4;
        float f17 = i17;
        if (h17.f260584e != f17) {
            h17.f260584e = f17;
            h17.f260580a.setStrokeWidth(f17 * 1.3333f);
            h17.f260591l = true;
            h17.invalidateSelf();
        }
        if (colorStateList != null) {
            h17.f260590k = colorStateList.getColorForState(h17.getState(), h17.f260590k);
        }
        h17.f260589j = colorStateList;
        h17.f260591l = true;
        h17.invalidateSelf();
        return h17;
    }

    public final android.animation.ValueAnimator d(ea.k kVar) {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setInterpolator(f250479z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(kVar);
        valueAnimator.addUpdateListener(kVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public abstract float e();

    public abstract void f(android.graphics.Rect rect);

    public abstract void g();

    public abstract fa.d h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f17, float f18, float f19);

    public abstract void l(android.graphics.Rect rect);

    public abstract void m(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.content.res.ColorStateList colorStateList2, int i17);

    public void n(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.f250488i;
        if (drawable != null) {
            f3.b.h(drawable, ja.a.a(colorStateList));
        }
    }

    public final void o() {
        android.graphics.Rect rect = this.f250500u;
        f(rect);
        l(rect);
        int i17 = rect.left;
        int i18 = rect.top;
        int i19 = rect.right;
        int i27 = rect.bottom;
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = ((ea.b) this.f250499t).f250465a;
        floatingActionButton.f44501r.set(i17, i18, i19, i27);
        int i28 = floatingActionButton.f44498o;
        floatingActionButton.setPadding(i17 + i28, i18 + i28, i19 + i28, i27 + i28);
    }
}
