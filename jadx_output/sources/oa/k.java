package oa;

/* loaded from: classes15.dex */
public class k extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f343789p = 0;

    /* renamed from: d, reason: collision with root package name */
    public oa.i f343790d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f343791e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f343792f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f343793g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f343794h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f343795i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f343796m;

    /* renamed from: n, reason: collision with root package name */
    public int f343797n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.tabs.TabLayout f343798o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.google.android.material.tabs.TabLayout tabLayout, android.content.Context context) {
        super(context);
        this.f343798o = tabLayout;
        this.f343797n = 2;
        b(context);
        int i17 = tabLayout.f44545h;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.v0.k(this, i17, tabLayout.f44546i, tabLayout.f44547m, tabLayout.f44548n);
        setGravity(17);
        setOrientation(!tabLayout.G ? 1 : 0);
        setClickable(true);
        n3.c1.d(this, n3.n0.b(getContext(), 1002));
    }

    public final void a() {
        android.graphics.drawable.Drawable drawable;
        oa.i iVar = this.f343790d;
        android.graphics.drawable.Drawable drawable2 = null;
        android.view.View view = iVar != null ? iVar.f343783f : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((android.view.ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f343793g = view;
            android.widget.TextView textView = this.f343791e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.ImageView imageView = this.f343792f;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f343792f.setImageDrawable(null);
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.text1);
            this.f343794h = textView2;
            if (textView2 != null) {
                this.f343797n = androidx.core.widget.t.b(textView2);
            }
            this.f343795i = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        } else {
            android.view.View view2 = this.f343793g;
            if (view2 != null) {
                removeView(view2);
                this.f343793g = null;
            }
            this.f343794h = null;
            this.f343795i = null;
        }
        boolean z17 = false;
        if (this.f343793g == null) {
            if (this.f343792f == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a3t, (android.view.ViewGroup) this, false);
                addView(imageView2, 0);
                this.f343792f = imageView2;
            }
            if (iVar != null && (drawable = iVar.f343779b) != null) {
                drawable2 = drawable.mutate();
            }
            com.google.android.material.tabs.TabLayout tabLayout = this.f343798o;
            if (drawable2 != null) {
                f3.b.h(drawable2, tabLayout.f44551q);
                android.graphics.PorterDuff.Mode mode = tabLayout.f44554t;
                if (mode != null) {
                    f3.b.i(drawable2, mode);
                }
            }
            if (this.f343791e == null) {
                android.widget.TextView textView3 = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a3u, (android.view.ViewGroup) this, false);
                addView(textView3);
                this.f343791e = textView3;
                this.f343797n = androidx.core.widget.t.b(textView3);
            }
            this.f343791e.setTextAppearance(tabLayout.f44549o);
            android.content.res.ColorStateList colorStateList = tabLayout.f44550p;
            if (colorStateList != null) {
                this.f343791e.setTextColor(colorStateList);
            }
            c(this.f343791e, this.f343792f);
        } else {
            android.widget.TextView textView4 = this.f343794h;
            if (textView4 != null || this.f343795i != null) {
                c(textView4, this.f343795i);
            }
        }
        if (iVar != null && !android.text.TextUtils.isEmpty(iVar.f343781d)) {
            setContentDescription(iVar.f343781d);
        }
        if (iVar != null && iVar.a()) {
            z17 = true;
        }
        setSelected(z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    public final void b(android.content.Context context) {
        com.google.android.material.tabs.TabLayout tabLayout = this.f343798o;
        int i17 = tabLayout.f44557w;
        if (i17 != 0) {
            android.graphics.drawable.Drawable a17 = k.a.a(context, i17);
            this.f343796m = a17;
            if (a17 != null && a17.isStateful()) {
                this.f343796m.setState(getDrawableState());
            }
        } else {
            this.f343796m = null;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.f44552r != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            android.content.res.ColorStateList a18 = ja.a.a(tabLayout.f44552r);
            boolean z17 = tabLayout.I;
            if (z17) {
                gradientDrawable = null;
            }
            gradientDrawable = new android.graphics.drawable.RippleDrawable(a18, gradientDrawable, z17 ? null : gradientDrawable2);
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(this, gradientDrawable);
        tabLayout.invalidate();
    }

    public final void c(android.widget.TextView textView, android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable;
        oa.i iVar = this.f343790d;
        android.graphics.drawable.Drawable mutate = (iVar == null || (drawable = iVar.f343779b) == null) ? null : drawable.mutate();
        oa.i iVar2 = this.f343790d;
        java.lang.CharSequence charSequence = iVar2 != null ? iVar2.f343780c : null;
        if (imageView != null) {
            if (mutate != null) {
                imageView.setImageDrawable(mutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z17 = !android.text.TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z17) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((java.lang.CharSequence) null);
            }
        }
        if (imageView != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            com.google.android.material.tabs.TabLayout tabLayout = this.f343798o;
            int i17 = (z17 && imageView.getVisibility() == 0) ? tabLayout.i(8) : 0;
            if (tabLayout.G) {
                if (i17 != n3.u.b(marginLayoutParams)) {
                    n3.u.g(marginLayoutParams, i17);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i17 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i17;
                n3.u.g(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        oa.i iVar3 = this.f343790d;
        androidx.appcompat.widget.a3.a(this, z17 ? null : iVar3 != null ? iVar3.f343781d : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f343796m;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | this.f343796m.setState(drawableState);
        }
        if (z17) {
            invalidate();
            this.f343798o.invalidate();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(androidx.appcompat.app.a.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(androidx.appcompat.app.a.class.getName());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.text.Layout layout;
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        com.google.android.material.tabs.TabLayout tabLayout = this.f343798o;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(tabLayout.f44558x, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
        if (this.f343791e != null) {
            float f17 = tabLayout.f44555u;
            int i19 = this.f343797n;
            android.widget.ImageView imageView = this.f343792f;
            boolean z17 = true;
            if (imageView == null || imageView.getVisibility() != 0) {
                android.widget.TextView textView = this.f343791e;
                if (textView != null && textView.getLineCount() > 1) {
                    f17 = tabLayout.f44556v;
                }
            } else {
                i19 = 1;
            }
            float textSize = this.f343791e.getTextSize();
            int lineCount = this.f343791e.getLineCount();
            int b17 = androidx.core.widget.t.b(this.f343791e);
            if (f17 != textSize || (b17 >= 0 && i19 != b17)) {
                if (tabLayout.F == 1 && f17 > textSize && lineCount == 1 && ((layout = this.f343791e.getLayout()) == null || layout.getLineWidth(0) * (f17 / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    z17 = false;
                }
                if (z17) {
                    this.f343791e.setTextSize(0, f17);
                    this.f343791e.setMaxLines(i19);
                    super.onMeasure(i17, i18);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f343790d == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f343790d.b();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        if (isSelected() != z17) {
        }
        super.setSelected(z17);
        android.widget.TextView textView = this.f343791e;
        if (textView != null) {
            textView.setSelected(z17);
        }
        android.widget.ImageView imageView = this.f343792f;
        if (imageView != null) {
            imageView.setSelected(z17);
        }
        android.view.View view = this.f343793g;
        if (view != null) {
            view.setSelected(z17);
        }
    }
}
