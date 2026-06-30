package oa;

/* loaded from: classes15.dex */
public class h extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f343769d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f343770e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f343771f;

    /* renamed from: g, reason: collision with root package name */
    public int f343772g;

    /* renamed from: h, reason: collision with root package name */
    public float f343773h;

    /* renamed from: i, reason: collision with root package name */
    public int f343774i;

    /* renamed from: m, reason: collision with root package name */
    public int f343775m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f343776n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.tabs.TabLayout f343777o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.google.android.material.tabs.TabLayout tabLayout, android.content.Context context) {
        super(context);
        this.f343777o = tabLayout;
        this.f343772g = -1;
        this.f343774i = -1;
        this.f343775m = -1;
        setWillNotDraw(false);
        this.f343770e = new android.graphics.Paint();
        this.f343771f = new android.graphics.drawable.GradientDrawable();
    }

    public void a(int i17, int i18) {
        android.animation.ValueAnimator valueAnimator = this.f343776n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f343776n.cancel();
        }
        android.view.View childAt = getChildAt(i17);
        if (childAt == null) {
            c();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        com.google.android.material.tabs.TabLayout tabLayout = this.f343777o;
        if (!tabLayout.H && (childAt instanceof oa.k)) {
            b((oa.k) childAt, tabLayout.f44543f);
            android.graphics.RectF rectF = tabLayout.f44543f;
            left = (int) rectF.left;
            right = (int) rectF.right;
        }
        int i19 = left;
        int i27 = right;
        int i28 = this.f343774i;
        int i29 = this.f343775m;
        if (i28 == i19 && i29 == i27) {
            return;
        }
        android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
        this.f343776n = valueAnimator2;
        valueAnimator2.setInterpolator(w9.a.f444035b);
        valueAnimator2.setDuration(i18);
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        valueAnimator2.addUpdateListener(new oa.f(this, i28, i19, i29, i27));
        valueAnimator2.addListener(new oa.g(this, i17));
        valueAnimator2.start();
    }

    public final void b(oa.k kVar, android.graphics.RectF rectF) {
        android.view.View[] viewArr = {kVar.f343791e, kVar.f343792f, kVar.f343793g};
        int i17 = 0;
        int i18 = 0;
        boolean z17 = false;
        for (int i19 = 0; i19 < 3; i19++) {
            android.view.View view = viewArr[i19];
            if (view != null && view.getVisibility() == 0) {
                i18 = z17 ? java.lang.Math.min(i18, view.getLeft()) : view.getLeft();
                i17 = z17 ? java.lang.Math.max(i17, view.getRight()) : view.getRight();
                z17 = true;
            }
        }
        int i27 = i17 - i18;
        com.google.android.material.tabs.TabLayout tabLayout = this.f343777o;
        if (i27 < tabLayout.i(24)) {
            i27 = tabLayout.i(24);
        }
        int left = (kVar.getLeft() + kVar.getRight()) / 2;
        int i28 = i27 / 2;
        rectF.set(left - i28, 0.0f, left + i28, 0.0f);
    }

    public final void c() {
        int i17;
        android.view.View childAt = getChildAt(this.f343772g);
        int i18 = -1;
        if (childAt == null || childAt.getWidth() <= 0) {
            i17 = -1;
        } else {
            int left = childAt.getLeft();
            int right = childAt.getRight();
            com.google.android.material.tabs.TabLayout tabLayout = this.f343777o;
            boolean z17 = tabLayout.H;
            android.graphics.RectF rectF = tabLayout.f44543f;
            if (!z17 && (childAt instanceof oa.k)) {
                b((oa.k) childAt, rectF);
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
            if (this.f343773h <= 0.0f || this.f343772g >= getChildCount() - 1) {
                i18 = left;
                i17 = right;
            } else {
                android.view.View childAt2 = getChildAt(this.f343772g + 1);
                int left2 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                if (!tabLayout.H && (childAt2 instanceof oa.k)) {
                    b((oa.k) childAt2, rectF);
                    left2 = (int) rectF.left;
                    right2 = (int) rectF.right;
                }
                float f17 = this.f343773h;
                float f18 = 1.0f - f17;
                i18 = (int) ((left2 * f17) + (left * f18));
                i17 = (int) ((right2 * f17) + (f18 * right));
            }
        }
        if (i18 == this.f343774i && i17 == this.f343775m) {
            return;
        }
        this.f343774i = i18;
        this.f343775m = i17;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int i17;
        com.google.android.material.tabs.TabLayout tabLayout = this.f343777o;
        android.graphics.drawable.Drawable drawable = tabLayout.f44553s;
        int i18 = 0;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        int i19 = this.f343769d;
        if (i19 >= 0) {
            intrinsicHeight = i19;
        }
        int i27 = tabLayout.E;
        if (i27 == 0) {
            i18 = getHeight() - intrinsicHeight;
            intrinsicHeight = getHeight();
        } else if (i27 == 1) {
            i18 = (getHeight() - intrinsicHeight) / 2;
            intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
        } else if (i27 != 2) {
            intrinsicHeight = i27 != 3 ? 0 : getHeight();
        }
        int i28 = this.f343774i;
        if (i28 >= 0 && (i17 = this.f343775m) > i28) {
            android.graphics.drawable.Drawable drawable2 = tabLayout.f44553s;
            if (drawable2 == null) {
                drawable2 = this.f343771f;
            }
            drawable2.setBounds(i28, i18, i17, intrinsicHeight);
            android.graphics.Paint paint = this.f343770e;
            if (paint != null) {
                f3.b.g(drawable2, paint.getColor());
            }
            drawable2.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.animation.ValueAnimator valueAnimator = this.f343776n;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            c();
            return;
        }
        this.f343776n.cancel();
        a(this.f343772g, java.lang.Math.round((1.0f - this.f343776n.getAnimatedFraction()) * ((float) this.f343776n.getDuration())));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (android.view.View.MeasureSpec.getMode(i17) != 1073741824) {
            return;
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f343777o;
        boolean z17 = true;
        if (tabLayout.F == 1 && tabLayout.C == 1) {
            int childCount = getChildCount();
            int i19 = 0;
            for (int i27 = 0; i27 < childCount; i27++) {
                android.view.View childAt = getChildAt(i27);
                if (childAt.getVisibility() == 0) {
                    i19 = java.lang.Math.max(i19, childAt.getMeasuredWidth());
                }
            }
            if (i19 <= 0) {
                return;
            }
            if (i19 * childCount <= getMeasuredWidth() - (tabLayout.i(16) * 2)) {
                boolean z18 = false;
                for (int i28 = 0; i28 < childCount; i28++) {
                    android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) getChildAt(i28).getLayoutParams();
                    if (layoutParams.width != i19 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i19;
                        layoutParams.weight = 0.0f;
                        z18 = true;
                    }
                }
                z17 = z18;
            } else {
                tabLayout.C = 0;
                tabLayout.v(false);
            }
            if (z17) {
                super.onMeasure(i17, i18);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i17) {
        super.onRtlPropertiesChanged(i17);
    }
}
