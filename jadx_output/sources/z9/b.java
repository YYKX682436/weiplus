package z9;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.button.MaterialButton f470833a;

    /* renamed from: b, reason: collision with root package name */
    public int f470834b;

    /* renamed from: c, reason: collision with root package name */
    public int f470835c;

    /* renamed from: d, reason: collision with root package name */
    public int f470836d;

    /* renamed from: e, reason: collision with root package name */
    public int f470837e;

    /* renamed from: f, reason: collision with root package name */
    public int f470838f;

    /* renamed from: g, reason: collision with root package name */
    public int f470839g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f470840h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f470841i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.res.ColorStateList f470842j;

    /* renamed from: k, reason: collision with root package name */
    public android.content.res.ColorStateList f470843k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f470844l = new android.graphics.Paint(1);

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f470845m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f470846n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f470847o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f470848p;

    public b(com.google.android.material.button.MaterialButton materialButton) {
        new android.graphics.Rect();
        new android.graphics.RectF();
        this.f470848p = false;
        this.f470833a = materialButton;
    }

    public final android.graphics.drawable.Drawable a() {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        this.f470845m = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f470838f + 1.0E-5f);
        this.f470845m.setColor(-1);
        b();
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        this.f470846n = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f470838f + 1.0E-5f);
        this.f470846n.setColor(0);
        this.f470846n.setStroke(this.f470839g, this.f470842j);
        android.graphics.drawable.InsetDrawable insetDrawable = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{this.f470845m, this.f470846n}), this.f470834b, this.f470836d, this.f470835c, this.f470837e);
        android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
        this.f470847o = gradientDrawable3;
        gradientDrawable3.setCornerRadius(this.f470838f + 1.0E-5f);
        this.f470847o.setColor(-1);
        return new z9.a(ja.a.a(this.f470843k), insetDrawable, this.f470847o);
    }

    public final void b() {
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f470845m;
        if (gradientDrawable != null) {
            f3.b.h(gradientDrawable, this.f470841i);
            android.graphics.PorterDuff.Mode mode = this.f470840h;
            if (mode != null) {
                f3.b.i(this.f470845m, mode);
            }
        }
    }
}
