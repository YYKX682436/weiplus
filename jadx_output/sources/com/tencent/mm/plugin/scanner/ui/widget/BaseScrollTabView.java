package com.tencent.mm.plugin.scanner.ui.widget;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b$\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\tR\"\u0010\u001f\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView;", "Landroid/widget/LinearLayout;", "", "", "enable", "Ljz5/f0;", "setEnableSwitchTab", "enabled", "setEnabled", "", ya.b.INDEX, "setSelectedTab", "Ld04/j3;", "tabOnSelectedListener", "setOnTabChangedListener", "Ld04/h3;", "tabOnClickListener", "setOnTabClickListener", "Ld04/i3;", "tabOnScrollListener", "setOnTabScrollListener", "Ld04/k;", "getSelectedTab", "importantForAccessibility", "setTabViewImportantForAccessibility", "F", "Z", "getCanVibrate", "()Z", "setCanVibrate", "(Z)V", "canVibrate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class BaseScrollTabView extends android.widget.LinearLayout {
    public static final /* synthetic */ int H = 0;
    public float A;
    public int B;
    public boolean C;
    public boolean D;
    public android.os.Vibrator E;

    /* renamed from: F, reason: from kotlin metadata */
    public boolean canVibrate;
    public final android.view.GestureDetector G;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f159666d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f159667e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f159668f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f159669g;

    /* renamed from: h, reason: collision with root package name */
    public int f159670h;

    /* renamed from: i, reason: collision with root package name */
    public int f159671i;

    /* renamed from: m, reason: collision with root package name */
    public int f159672m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f159673n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.animation.LinearInterpolator f159674o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f159675p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f159676q;

    /* renamed from: r, reason: collision with root package name */
    public d04.j3 f159677r;

    /* renamed from: s, reason: collision with root package name */
    public d04.i3 f159678s;

    /* renamed from: t, reason: collision with root package name */
    public int f159679t;

    /* renamed from: u, reason: collision with root package name */
    public float f159680u;

    /* renamed from: v, reason: collision with root package name */
    public float f159681v;

    /* renamed from: w, reason: collision with root package name */
    public float f159682w;

    /* renamed from: x, reason: collision with root package name */
    public float f159683x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.VelocityTracker f159684y;

    /* renamed from: z, reason: collision with root package name */
    public float f159685z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseScrollTabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static void a(com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView, int i17, float f17, float f18, long j17, yz5.a aVar, int i18, java.lang.Object obj) {
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator updateListener;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator duration;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollX");
        }
        if ((i18 & 8) != 0) {
            j17 = 150;
        }
        if ((i18 & 16) != 0) {
            aVar = d04.a.f225371d;
        }
        if (baseScrollTabView.f159673n) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseScrollTabView", "animateScrollX targetIndex: %d, fromTransX: %f, toTransX: %f", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        baseScrollTabView.f159673n = true;
        android.widget.LinearLayout linearLayout = baseScrollTabView.f159666d;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = linearLayout.animate();
        if (animate == null || (interpolator = animate.setInterpolator(baseScrollTabView.f159674o)) == null || (translationX = interpolator.translationX(f18)) == null || (updateListener = translationX.setUpdateListener(new d04.b(f17, f18, baseScrollTabView))) == null || (listener = updateListener.setListener(new d04.c(aVar, baseScrollTabView))) == null || (duration = listener.setDuration(j17)) == null) {
            return;
        }
        duration.start();
    }

    public final void b(int i17, int i18, boolean z17, int i19) {
        if (i17 == i18) {
            return;
        }
        f(i17);
        android.widget.LinearLayout linearLayout = this.f159666d;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        float translationX = linearLayout.getTranslationX();
        float c17 = c(i18);
        android.widget.LinearLayout linearLayout2 = this.f159666d;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        linearLayout2.getTranslationX();
        this.f159671i = i18;
        if (z17) {
            a(this, i18, translationX, c17, 0L, new d04.d(this, i18, i19), 8, null);
            return;
        }
        android.widget.LinearLayout linearLayout3 = this.f159666d;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        linearLayout3.setTranslationX(c17);
        d(i18, i19);
    }

    public final float c(int i17) {
        jz5.l lVar = (jz5.l) kz5.n0.a0(this.f159675p, i17);
        if (lVar != null) {
            return (((java.lang.Number) lVar.f302833d).floatValue() + ((java.lang.Number) lVar.f302834e).floatValue()) / 2;
        }
        return 0.0f;
    }

    public final void d(int i17, int i18) {
        android.os.Vibrator vibrator;
        d04.k kVar = (d04.k) kz5.n0.a0(this.f159669g, i17);
        if (kVar != null) {
            e(kVar, i17);
            com.tencent.mm.plugin.scanner.ui.widget.ScrollTab scrollTab = (com.tencent.mm.plugin.scanner.ui.widget.ScrollTab) kVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            android.widget.TextView textView = scrollTab.f159807d;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            sb6.append((java.lang.Object) textView.getText());
            sb6.append(scrollTab.getContext().getString(com.tencent.mm.R.string.iaq));
            java.lang.String sb7 = sb6.toString();
            android.widget.TextView textView2 = scrollTab.f159807d;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            java.util.Objects.toString(textView2.getText());
            android.widget.TextView textView3 = scrollTab.f159807d;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            textView3.setTextColor(scrollTab.getResources().getColor(com.tencent.mm.R.color.a3o));
            android.widget.TextView textView4 = scrollTab.f159807d;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            textView4.setContentDescription(sb7);
            android.widget.TextView textView5 = scrollTab.f159807d;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            textView5.setAlpha(1.0f);
            android.widget.TextView textView6 = scrollTab.f159807d;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            android.text.TextPaint paint = textView6.getPaint();
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.widget.TextView textView7 = scrollTab.f159807d;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            android.text.TextPaint paint2 = textView7.getPaint();
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
            d04.j3 j3Var = this.f159677r;
            if (j3Var != null) {
                j3Var.a(kVar.getF159808e(), i18);
            }
            if (!this.canVibrate || (vibrator = this.E) == null) {
                return;
            }
            vibrator.vibrate(10L);
        }
    }

    public void e(d04.k tab, int i17) {
        kotlin.jvm.internal.o.g(tab, "tab");
    }

    public final void f(int i17) {
        d04.k kVar = (d04.k) kz5.n0.a0(this.f159669g, i17);
        if (kVar != null) {
            g(kVar, i17);
            com.tencent.mm.plugin.scanner.ui.widget.ScrollTab scrollTab = (com.tencent.mm.plugin.scanner.ui.widget.ScrollTab) kVar;
            android.widget.TextView textView = scrollTab.f159807d;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            java.util.Objects.toString(textView.getText());
            android.widget.TextView textView2 = scrollTab.f159807d;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            java.util.Objects.toString(textView2.getText());
            android.widget.TextView textView3 = scrollTab.f159807d;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            textView3.setTextColor(scrollTab.getResources().getColor(com.tencent.mm.R.color.a3o));
            android.widget.TextView textView4 = scrollTab.f159807d;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            textView4.setContentDescription(textView4.getText());
            android.widget.TextView textView5 = scrollTab.f159807d;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            textView5.setAlpha(0.5f);
            android.widget.TextView textView6 = scrollTab.f159807d;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("tabTitle");
                throw null;
            }
            android.text.TextPaint paint = textView6.getPaint();
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL);
            }
            d04.j3 j3Var = this.f159677r;
            if (j3Var != null) {
                j3Var.b(kVar.getF159808e());
            }
        }
    }

    public void g(d04.k tab, int i17) {
        kotlin.jvm.internal.o.g(tab, "tab");
    }

    public final boolean getCanVibrate() {
        return this.canVibrate;
    }

    public d04.k getSelectedTab() {
        int i17 = this.f159671i;
        if (i17 < 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.f159669g;
        if (i17 < arrayList.size()) {
            return (d04.k) arrayList.get(this.f159671i);
        }
        return null;
    }

    public void h(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseScrollTabView", "setSelectedTab last: %d, selected: %d, isScrollingX: %b, tabTranslationInited: %b, tabSelectedAction: %d", java.lang.Integer.valueOf(this.f159671i), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f159673n), java.lang.Boolean.valueOf(this.f159676q), java.lang.Integer.valueOf(i18));
        int i19 = this.f159671i;
        if (i19 == i17 || this.f159673n) {
            return;
        }
        if (i19 == -1) {
            i19 = 0;
        }
        if (this.f159676q) {
            b(i19, i17, true, i18);
        } else {
            this.f159672m = i17;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        if (!this.f159668f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        boolean z17 = false;
        if (motionEvent == null) {
            return false;
        }
        if (this.f159684y == null) {
            this.f159684y = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f159684y;
        kotlin.jvm.internal.o.d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        android.view.VelocityTracker velocityTracker2 = this.f159684y;
        kotlin.jvm.internal.o.d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        android.view.VelocityTracker velocityTracker3 = this.f159684y;
        kotlin.jvm.internal.o.d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        android.view.VelocityTracker velocityTracker4 = this.f159684y;
        kotlin.jvm.internal.o.d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            motionEvent.getRawX();
            motionEvent.getRawY();
            android.widget.LinearLayout linearLayout = this.f159666d;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            linearLayout.getTranslationX();
            this.f159682w = motionEvent.getRawX();
            this.f159683x = motionEvent.getRawY();
            android.widget.LinearLayout linearLayout2 = this.f159666d;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            this.f159685z = linearLayout2.getTranslationX();
        } else if (action != 1 && action == 2) {
            float rawX = motionEvent.getRawX() - this.f159682w;
            float rawY = motionEvent.getRawY() - this.f159683x;
            if (java.lang.Math.abs(xVelocity) > java.lang.Math.abs(yVelocity) && java.lang.Math.abs(rawX) > java.lang.Math.abs(rawY) && java.lang.Math.abs(rawX) >= 5.0f) {
                z17 = true;
            }
        }
        motionEvent.getAction();
        return z17;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f159670h = com.tencent.mm.ui.bk.h(getContext()).x;
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), i18);
        if (getMeasuredWidth() != 0) {
            int measuredWidth = getMeasuredWidth();
            int i19 = this.f159670h;
            if (measuredWidth < i19) {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824), i18);
            }
        }
        if (getMeasuredWidth() != 0) {
            android.view.View view = this.f159667e;
            if (view == null) {
                kotlin.jvm.internal.o.o("dotView");
                throw null;
            }
            view.getMeasuredWidth();
            android.view.View view2 = this.f159667e;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("dotView");
                throw null;
            }
            view2.setTranslationX((this.f159670h / 2.0f) - view2.getMeasuredWidth());
            java.util.ArrayList arrayList = this.f159675p;
            arrayList.clear();
            float f17 = this.f159670h / 2.0f;
            java.util.ArrayList arrayList2 = this.f159669g;
            java.util.Iterator it = arrayList2.iterator();
            int i27 = 0;
            int i28 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i29 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.Object obj = (d04.k) next;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
                android.view.View view3 = (android.view.View) obj;
                float f18 = f17 - i28;
                i28 += view3.getMeasuredWidth();
                arrayList.add(new jz5.l(java.lang.Float.valueOf(f18 - view3.getMeasuredWidth()), java.lang.Float.valueOf(f18)));
                view3.getMeasuredWidth();
                i27 = i29;
            }
            this.f159676q = true;
            java.lang.Object obj2 = (d04.k) kz5.n0.Z(arrayList2);
            if (obj2 == null || ((android.view.View) obj2).getMeasuredWidth() == 0) {
                return;
            }
            int i37 = this.f159672m;
            if (i37 != -1) {
                b(this.f159671i, i37, false, 0);
                this.f159672m = -1;
                return;
            }
            int i38 = this.f159671i;
            if (i38 == -1 || i38 == 0) {
                float c17 = c(0);
                android.widget.LinearLayout linearLayout = this.f159666d;
                if (linearLayout == null) {
                    kotlin.jvm.internal.o.o("container");
                    throw null;
                }
                linearLayout.setTranslationX(c17);
                b(this.f159671i, 0, false, 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0249  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCanVibrate(boolean z17) {
        this.canVibrate = z17;
    }

    public void setEnableSwitchTab(boolean z17) {
        this.f159668f = z17;
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        java.util.Iterator it = this.f159669g.iterator();
        while (it.hasNext()) {
            ((d04.k) it.next()).setTabEnabled(z17);
        }
        android.view.View view = this.f159667e;
        if (view != null) {
            view.setEnabled(z17);
        } else {
            kotlin.jvm.internal.o.o("dotView");
            throw null;
        }
    }

    public void setOnTabChangedListener(d04.j3 tabOnSelectedListener) {
        kotlin.jvm.internal.o.g(tabOnSelectedListener, "tabOnSelectedListener");
        this.f159677r = tabOnSelectedListener;
    }

    public void setOnTabClickListener(d04.h3 tabOnClickListener) {
        kotlin.jvm.internal.o.g(tabOnClickListener, "tabOnClickListener");
    }

    public void setOnTabScrollListener(d04.i3 tabOnScrollListener) {
        kotlin.jvm.internal.o.g(tabOnScrollListener, "tabOnScrollListener");
        this.f159678s = tabOnScrollListener;
    }

    public void setSelectedTab(int i17) {
        h(i17, 0);
    }

    public final void setTabViewImportantForAccessibility(int i17) {
        java.util.ArrayList<java.lang.Object> arrayList = this.f159669g;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof android.view.View) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTabViewImportantForAccessibility :");
                android.view.View view = (android.view.View) obj;
                sb6.append(view.getImportantForAccessibility());
                sb6.append("  ");
                sb6.append(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseScrollTabView", sb6.toString());
                view.setImportantForAccessibility(i17);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseScrollTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.Object systemService;
        kotlin.jvm.internal.o.g(context, "context");
        this.f159668f = true;
        this.f159669g = new java.util.ArrayList();
        this.f159671i = -1;
        this.f159672m = -1;
        this.f159674o = new android.view.animation.LinearInterpolator();
        this.f159675p = new java.util.ArrayList();
        this.f159679t = 1;
        this.B = -1;
        this.G = new android.view.GestureDetector(getContext(), new d04.e(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489211bp2, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.mci);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f159666d = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.mcj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f159667e = findViewById2;
        getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479563f);
        if (this.E != null || (systemService = getContext().getSystemService("vibrator")) == null) {
            return;
        }
        this.E = (android.os.Vibrator) systemService;
    }
}
