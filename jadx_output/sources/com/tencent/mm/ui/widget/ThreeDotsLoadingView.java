package com.tencent.mm.ui.widget;

/* loaded from: classes7.dex */
public class ThreeDotsLoadingView extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static int f211446o = -16777216;

    /* renamed from: d, reason: collision with root package name */
    public int f211447d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f211448e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f211449f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f211450g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f211451h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f211452i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f211453m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f211454n;

    public ThreeDotsLoadingView(android.content.Context context) {
        super(context);
        this.f211447d = f211446o;
        this.f211448e = false;
        this.f211449f = false;
        this.f211454n = new al5.q3(this);
        a(context, null);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.f211450g = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bpi, (android.view.ViewGroup) this, true);
        int color = context.getResources().getColor(com.tencent.mm.R.color.f478714f5);
        f211446o = color;
        this.f211447d = color;
        this.f211451h = (android.widget.ImageView) this.f211450g.findViewById(com.tencent.mm.R.id.ily);
        this.f211452i = (android.widget.ImageView) this.f211450g.findViewById(com.tencent.mm.R.id.ilz);
        this.f211453m = (android.widget.ImageView) this.f211450g.findViewById(com.tencent.mm.R.id.f485679im0);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.appbrand.widget.l0.f91754c);
            this.f211447d = obtainStyledAttributes.getColor(0, f211446o);
            obtainStyledAttributes.recycle();
        }
        d();
    }

    public final android.graphics.drawable.AnimationDrawable b(int i17, float[] fArr) {
        android.graphics.drawable.AnimationDrawable animationDrawable = new android.graphics.drawable.AnimationDrawable();
        com.tencent.mars.xlog.Log.i("ThreeDotsLoadingView", "AnimationDrawable hash:" + animationDrawable.hashCode());
        animationDrawable.setOneShot(false);
        for (float f17 : fArr) {
            animationDrawable.addFrame(c(i17, f17), 300);
        }
        return animationDrawable;
    }

    public final android.graphics.drawable.Drawable c(int i17, float f17) {
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        shapeDrawable.setIntrinsicHeight(32);
        shapeDrawable.setIntrinsicWidth(32);
        shapeDrawable.getPaint().setColor(i17);
        shapeDrawable.getPaint().setAlpha((int) (f17 * 255.0f));
        return shapeDrawable;
    }

    public final void d() {
        this.f211451h.setImageDrawable(c(this.f211447d, 0.5f));
        this.f211452i.setImageDrawable(c(this.f211447d, 0.4f));
        this.f211453m.setImageDrawable(c(this.f211447d, 0.3f));
    }

    public void e() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(this)) {
            this.f211449f = true;
        } else {
            if (this.f211448e) {
                return;
            }
            this.f211448e = true;
            d();
            postDelayed(this.f211454n, 300L);
        }
    }

    public void f() {
        this.f211449f = false;
        if (this.f211448e) {
            this.f211448e = false;
            removeCallbacks(this.f211454n);
            if (this.f211451h.getDrawable() instanceof android.graphics.drawable.AnimationDrawable) {
                ((android.graphics.drawable.AnimationDrawable) this.f211451h.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) this.f211452i.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) this.f211453m.getDrawable()).stop();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f211449f) {
            this.f211449f = false;
            e();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        this.f211451h.setAlpha(f17);
        this.f211452i.setAlpha(f17);
        this.f211453m.setAlpha(f17);
        if (getBackground() != null) {
            getBackground().setAlpha(java.lang.Math.round(f17 * 255.0f));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (8 == i17 || 4 == i17) {
            f();
        }
        super.setVisibility(i17);
    }

    public ThreeDotsLoadingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211447d = f211446o;
        this.f211448e = false;
        this.f211449f = false;
        this.f211454n = new al5.q3(this);
        a(context, attributeSet);
    }

    public ThreeDotsLoadingView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211447d = f211446o;
        this.f211448e = false;
        this.f211449f = false;
        this.f211454n = new al5.q3(this);
        a(context, attributeSet);
    }
}
