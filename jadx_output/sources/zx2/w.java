package zx2;

/* loaded from: classes15.dex */
public class w extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f477092p = 0;

    /* renamed from: d, reason: collision with root package name */
    public zx2.u f477093d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f477094e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f477095f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f477096g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f477097h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f477098i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f477099m;

    /* renamed from: n, reason: collision with root package name */
    public int f477100n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477101o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout, android.content.Context context) {
        super(context);
        this.f477101o = finderTabLayout;
        this.f477100n = 2;
        c(context);
        int i17 = finderTabLayout.f133104h;
        int i18 = finderTabLayout.f133105i;
        int i19 = finderTabLayout.f133106m;
        int i27 = finderTabLayout.f133107n;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.v0.k(this, i17, i18, i19, i27);
        setGravity(17);
        setOrientation(!finderTabLayout.G ? 1 : 0);
        setClickable(true);
        n3.c1.d(this, n3.n0.b(getContext(), 1002));
        setClipChildren(finderTabLayout.W);
        setClipToPadding(finderTabLayout.f133110p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getContentWidth() {
        android.view.View[] viewArr = {this.f477094e, this.f477095f, this.f477096g};
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
        return i17 - i18;
    }

    public final void b() {
        android.graphics.drawable.Drawable drawable;
        zx2.u uVar = this.f477093d;
        android.graphics.drawable.Drawable drawable2 = null;
        android.view.View view = uVar != null ? uVar.f477086f : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((android.view.ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f477096g = view;
            android.widget.TextView textView = this.f477094e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.ImageView imageView = this.f477095f;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f477095f.setImageDrawable(null);
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.text1);
            this.f477097h = textView2;
            if (textView2 != null) {
                this.f477100n = androidx.core.widget.t.b(textView2);
            }
            this.f477098i = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        } else {
            android.view.View view2 = this.f477096g;
            if (view2 != null) {
                removeView(view2);
                this.f477096g = null;
            }
            this.f477097h = null;
            this.f477098i = null;
        }
        boolean z17 = false;
        if (this.f477096g == null) {
            if (this.f477095f == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a3t, (android.view.ViewGroup) this, false);
                addView(imageView2, 0);
                this.f477095f = imageView2;
            }
            if (uVar != null && (drawable = uVar.f477082b) != null) {
                drawable2 = drawable.mutate();
            }
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477101o;
            if (drawable2 != null) {
                f3.b.h(drawable2, finderTabLayout.f133111q);
                android.graphics.PorterDuff.Mode mode = finderTabLayout.f133114t;
                if (mode != null) {
                    f3.b.i(drawable2, mode);
                }
            }
            if (this.f477094e == null) {
                android.widget.TextView textView3 = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a3u, (android.view.ViewGroup) this, false);
                addView(textView3);
                this.f477094e = textView3;
                this.f477100n = androidx.core.widget.t.b(textView3);
            }
            this.f477094e.setTextAppearance(finderTabLayout.f133108o);
            android.content.res.ColorStateList colorStateList = finderTabLayout.f133109p;
            if (colorStateList != null) {
                this.f477094e.setTextColor(colorStateList);
            }
            d(this.f477094e, this.f477095f);
        } else {
            android.widget.TextView textView4 = this.f477097h;
            if (textView4 != null || this.f477098i != null) {
                d(textView4, this.f477098i);
            }
        }
        if (uVar != null && !android.text.TextUtils.isEmpty(uVar.f477084d)) {
            setContentDescription(uVar.f477084d);
        }
        if (uVar != null && uVar.a()) {
            z17 = true;
        }
        setSelected(z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.graphics.drawable.RippleDrawable] */
    public final void c(android.content.Context context) {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477101o;
        int i17 = finderTabLayout.f133117w;
        if (i17 != 0) {
            android.graphics.drawable.Drawable a17 = k.a.a(context, i17);
            this.f477099m = a17;
            if (a17 != null && a17.isStateful()) {
                this.f477099m.setState(getDrawableState());
            }
        } else {
            this.f477099m = null;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(0);
        if (finderTabLayout.f133112r != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            android.content.res.ColorStateList colorStateList = finderTabLayout.f133112r;
            android.content.res.ColorStateList colorStateList2 = new android.content.res.ColorStateList(new int[][]{zx2.c0.f477033c, android.util.StateSet.NOTHING}, new int[]{zx2.c0.a(colorStateList, zx2.c0.f477032b), zx2.c0.a(colorStateList, zx2.c0.f477031a)});
            boolean z17 = finderTabLayout.I;
            if (z17) {
                gradientDrawable = null;
            }
            gradientDrawable = new android.graphics.drawable.RippleDrawable(colorStateList2, gradientDrawable, z17 ? null : gradientDrawable2);
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(this, gradientDrawable);
        finderTabLayout.invalidate();
    }

    public final void d(android.widget.TextView textView, android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable;
        zx2.u uVar = this.f477093d;
        android.graphics.drawable.Drawable mutate = (uVar == null || (drawable = uVar.f477082b) == null) ? null : drawable.mutate();
        zx2.u uVar2 = this.f477093d;
        java.lang.CharSequence charSequence = uVar2 != null ? uVar2.f477083c : null;
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
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477101o;
            int g17 = (z17 && imageView.getVisibility() == 0) ? finderTabLayout.g(8) : 0;
            if (finderTabLayout.G) {
                if (g17 != n3.u.b(marginLayoutParams)) {
                    n3.u.g(marginLayoutParams, g17);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (g17 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = g17;
                n3.u.g(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        zx2.u uVar3 = this.f477093d;
        androidx.appcompat.widget.a3.a(this, z17 ? null : uVar3 != null ? uVar3.f477084d : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f477099m;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | this.f477099m.setState(drawableState);
        }
        if (z17) {
            invalidate();
            this.f477101o.invalidate();
        }
    }

    public zx2.u getTab() {
        return this.f477093d;
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
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477101o;
        int tabMaxWidth = finderTabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(finderTabLayout.f133118x, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
        if (this.f477094e != null) {
            float f17 = finderTabLayout.f133115u;
            int i19 = this.f477100n;
            android.widget.ImageView imageView = this.f477095f;
            boolean z17 = true;
            if (imageView == null || imageView.getVisibility() != 0) {
                android.widget.TextView textView = this.f477094e;
                if (textView != null && textView.getLineCount() > 1) {
                    f17 = finderTabLayout.f133116v;
                }
            } else {
                i19 = 1;
            }
            float textSize = this.f477094e.getTextSize();
            int lineCount = this.f477094e.getLineCount();
            int b17 = androidx.core.widget.t.b(this.f477094e);
            if (f17 != textSize || (b17 >= 0 && i19 != b17)) {
                if (finderTabLayout.F == 1 && f17 > textSize && lineCount == 1 && ((layout = this.f477094e.getLayout()) == null || layout.getLineWidth(0) * (f17 / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    z17 = false;
                }
                if (z17) {
                    this.f477094e.setTextSize(0, f17);
                    this.f477094e.setMaxLines(i19);
                    super.onMeasure(i17, i18);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f477093d == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f477093d.b();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        if (isSelected() != z17) {
        }
        super.setSelected(z17);
        android.widget.TextView textView = this.f477094e;
        if (textView != null) {
            textView.setSelected(z17);
        }
        android.widget.ImageView imageView = this.f477095f;
        if (imageView != null) {
            imageView.setSelected(z17);
        }
        android.view.View view = this.f477096g;
        if (view != null) {
            view.setSelected(z17);
        }
    }

    public void setTab(zx2.u uVar) {
        if (uVar != this.f477093d) {
            this.f477093d = uVar;
            b();
        }
    }
}
