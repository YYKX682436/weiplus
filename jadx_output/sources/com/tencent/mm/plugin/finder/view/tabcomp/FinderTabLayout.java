package com.tencent.mm.plugin.finder.view.tabcomp;

@androidx.viewpager.widget.j
/* loaded from: classes15.dex */
public class FinderTabLayout extends android.widget.HorizontalScrollView {

    /* renamed from: x0, reason: collision with root package name */
    public static final m3.e f133098x0 = new m3.g(16);
    public int A;
    public final int B;
    public int C;
    public final int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public zx2.o f133099J;
    public final java.util.ArrayList K;
    public zx2.o L;
    public android.animation.ValueAnimator M;
    public androidx.viewpager.widget.ViewPager N;
    public androidx.viewpager.widget.a P;
    public android.database.DataSetObserver Q;
    public zx2.v R;
    public zx2.n S;
    public boolean T;
    public final m3.e U;
    public final android.animation.TimeInterpolator V;
    public final boolean W;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f133100d;

    /* renamed from: e, reason: collision with root package name */
    public zx2.u f133101e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f133102f;

    /* renamed from: g, reason: collision with root package name */
    public final zx2.t f133103g;

    /* renamed from: h, reason: collision with root package name */
    public int f133104h;

    /* renamed from: i, reason: collision with root package name */
    public int f133105i;

    /* renamed from: m, reason: collision with root package name */
    public int f133106m;

    /* renamed from: n, reason: collision with root package name */
    public int f133107n;

    /* renamed from: o, reason: collision with root package name */
    public final int f133108o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.res.ColorStateList f133109p;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f133110p0;

    /* renamed from: q, reason: collision with root package name */
    public android.content.res.ColorStateList f133111q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f133112r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f133113s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.PorterDuff.Mode f133114t;

    /* renamed from: u, reason: collision with root package name */
    public final float f133115u;

    /* renamed from: v, reason: collision with root package name */
    public final float f133116v;

    /* renamed from: w, reason: collision with root package name */
    public final int f133117w;

    /* renamed from: x, reason: collision with root package name */
    public int f133118x;

    /* renamed from: y, reason: collision with root package name */
    public final int f133119y;

    /* renamed from: z, reason: collision with root package name */
    public final int f133120z;

    public FinderTabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478434jr);
    }

    private int getDefaultHeight() {
        java.util.ArrayList arrayList = this.f133100d;
        int size = arrayList.size();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 < size) {
                zx2.u uVar = (zx2.u) arrayList.get(i17);
                if (uVar != null && uVar.f477082b != null && !android.text.TextUtils.isEmpty(uVar.f477083c)) {
                    z17 = true;
                    break;
                }
                i17++;
            } else {
                break;
            }
        }
        return (!z17 || this.G) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i17 = this.f133119y;
        if (i17 != -1) {
            return i17;
        }
        if (this.F == 0) {
            return this.A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return java.lang.Math.max(0, ((this.f133103g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i17) {
        zx2.t tVar = this.f133103g;
        int childCount = tVar.getChildCount();
        if (i17 < childCount) {
            int i18 = 0;
            while (i18 < childCount) {
                android.view.View childAt = tVar.getChildAt(i18);
                boolean z17 = true;
                childAt.setSelected(i18 == i17);
                if (i18 != i17) {
                    z17 = false;
                }
                childAt.setActivated(z17);
                i18++;
            }
        }
    }

    public void a(zx2.o oVar) {
        java.util.ArrayList arrayList = this.K;
        if (arrayList.contains(oVar)) {
            return;
        }
        arrayList.add(oVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view) {
        c(view);
    }

    public void b(zx2.u uVar, int i17, boolean z17) {
        if (uVar.f477087g != this) {
            throw new java.lang.IllegalArgumentException("Tab belongs to a different CustomTabLayout.");
        }
        uVar.f477085e = i17;
        java.util.ArrayList arrayList = this.f133100d;
        arrayList.add(i17, uVar);
        int size = arrayList.size();
        while (true) {
            i17++;
            if (i17 >= size) {
                break;
            } else {
                ((zx2.u) arrayList.get(i17)).f477085e = i17;
            }
        }
        zx2.w wVar = uVar.f477088h;
        int i18 = uVar.f477085e;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        if (this.F == 1 && this.C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f133103g.addView(wVar, i18, layoutParams);
        if (z17) {
            uVar.b();
        }
    }

    public final void c(android.view.View view) {
        if (!(view instanceof com.google.android.material.tabs.TabItem)) {
            throw new java.lang.IllegalArgumentException("Only TabItem instances can be added to CustomTabLayout");
        }
        com.google.android.material.tabs.TabItem tabItem = (com.google.android.material.tabs.TabItem) view;
        zx2.u j17 = j();
        java.lang.CharSequence charSequence = tabItem.f44537d;
        if (charSequence != null) {
            if (android.text.TextUtils.isEmpty(j17.f477084d) && !android.text.TextUtils.isEmpty(charSequence)) {
                j17.f477088h.setContentDescription(charSequence);
            }
            j17.f477083c = charSequence;
            zx2.w wVar = j17.f477088h;
            if (wVar != null) {
                wVar.b();
            }
        }
        android.graphics.drawable.Drawable drawable = tabItem.f44538e;
        if (drawable != null) {
            j17.f477082b = drawable;
            zx2.w wVar2 = j17.f477088h;
            if (wVar2 != null) {
                wVar2.b();
            }
        }
        int i17 = tabItem.f44539f;
        if (i17 != 0) {
            j17.c(i17);
        }
        if (!android.text.TextUtils.isEmpty(tabItem.getContentDescription())) {
            j17.f477084d = tabItem.getContentDescription();
            zx2.w wVar3 = j17.f477088h;
            if (wVar3 != null) {
                wVar3.b();
            }
        }
        java.util.ArrayList arrayList = this.f133100d;
        b(j17, arrayList.size(), arrayList.isEmpty());
    }

    public final void d(int i17) {
        if (i17 != -1) {
            if (getWindowToken() != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (n3.x0.c(this)) {
                    zx2.t tVar = this.f133103g;
                    int childCount = tVar.getChildCount();
                    boolean z17 = false;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= childCount) {
                            break;
                        }
                        if (tVar.getChildAt(i18).getWidth() <= 0) {
                            z17 = true;
                            break;
                        }
                        i18++;
                    }
                    if (!z17) {
                        int scrollX = getScrollX();
                        int f17 = f(i17, 0.0f);
                        if (scrollX != f17) {
                            h();
                            this.M.setIntValues(scrollX, f17);
                            this.M.start();
                        }
                        tVar.a(i17, this.D);
                        return;
                    }
                }
            }
            o(i17, 0.0f, true, true);
        }
    }

    public final void e() {
        int max = this.F == 0 ? java.lang.Math.max(0, this.B - this.f133104h) : 0;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        zx2.t tVar = this.f133103g;
        n3.v0.k(tVar, max, 0, 0, 0);
        int i17 = this.F;
        if (i17 == 0) {
            tVar.setGravity(8388611);
        } else if (i17 == 1) {
            tVar.setGravity(1);
        }
        q(true);
    }

    public final int f(int i17, float f17) {
        if (this.F != 0) {
            return 0;
        }
        zx2.t tVar = this.f133103g;
        android.view.View childAt = tVar.getChildAt(i17);
        int i18 = i17 + 1;
        android.view.View childAt2 = i18 < tVar.getChildCount() ? tVar.getChildAt(i18) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i19 = (int) ((width + width2) * 0.5f * f17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.v0.d(this) == 0 ? left + i19 : left - i19;
    }

    public int g(int i17) {
        return java.lang.Math.round(getResources().getDisplayMetrics().density * i17);
    }

    public int getScrollableTabMinWidth() {
        return this.A;
    }

    public int getSelectedTabPosition() {
        zx2.u uVar = this.f133101e;
        if (uVar != null) {
            return uVar.f477085e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f133100d.size();
    }

    public int getTabGravity() {
        return this.C;
    }

    public android.content.res.ColorStateList getTabIconTint() {
        return this.f133111q;
    }

    public int getTabIndicatorGravity() {
        return this.E;
    }

    public int getTabMaxWidth() {
        return this.f133118x;
    }

    public int getTabMode() {
        return this.F;
    }

    public android.content.res.ColorStateList getTabRippleColor() {
        return this.f133112r;
    }

    public android.graphics.drawable.Drawable getTabSelectedIndicator() {
        return this.f133113s;
    }

    public android.content.res.ColorStateList getTabTextColors() {
        return this.f133109p;
    }

    public final void h() {
        if (this.M == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.M = valueAnimator;
            valueAnimator.setInterpolator(this.V);
            this.M.setDuration(this.D);
            this.M.addUpdateListener(new zx2.m(this));
        }
    }

    public zx2.u i(int i17) {
        if (i17 < 0 || i17 >= getTabCount()) {
            return null;
        }
        return (zx2.u) this.f133100d.get(i17);
    }

    public zx2.u j() {
        zx2.u uVar = (zx2.u) ((m3.g) f133098x0).a();
        if (uVar == null) {
            uVar = new zx2.u();
        }
        uVar.f477087g = this;
        m3.e eVar = this.U;
        zx2.w wVar = eVar != null ? (zx2.w) ((m3.f) eVar).a() : null;
        if (wVar == null) {
            wVar = new zx2.w(this, getContext());
        }
        wVar.setTab(uVar);
        wVar.setFocusable(true);
        wVar.setMinimumWidth(getTabMinWidth());
        if (android.text.TextUtils.isEmpty(uVar.f477084d)) {
            wVar.setContentDescription(uVar.f477083c);
        } else {
            wVar.setContentDescription(uVar.f477084d);
        }
        uVar.f477088h = wVar;
        return uVar;
    }

    public void k() {
        int currentItem;
        int childCount = this.f133103g.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            } else {
                l(childCount);
            }
        }
        java.util.ArrayList arrayList = this.f133100d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zx2.u uVar = (zx2.u) it.next();
            it.remove();
            uVar.f477087g = null;
            uVar.f477088h = null;
            uVar.f477081a = null;
            uVar.f477082b = null;
            uVar.f477083c = null;
            uVar.f477084d = null;
            uVar.f477085e = -1;
            uVar.f477086f = null;
            ((m3.g) f133098x0).b(uVar);
        }
        this.f133101e = null;
        androidx.viewpager.widget.a aVar = this.P;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i17 = 0; i17 < count; i17++) {
                zx2.u j17 = j();
                java.lang.CharSequence pageTitle = this.P.getPageTitle(i17);
                if (android.text.TextUtils.isEmpty(j17.f477084d) && !android.text.TextUtils.isEmpty(pageTitle)) {
                    j17.f477088h.setContentDescription(pageTitle);
                }
                j17.f477083c = pageTitle;
                zx2.w wVar = j17.f477088h;
                if (wVar != null) {
                    wVar.b();
                }
                b(j17, arrayList.size(), false);
            }
            androidx.viewpager.widget.ViewPager viewPager = this.N;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m(i(currentItem), true);
        }
    }

    public final void l(int i17) {
        zx2.t tVar = this.f133103g;
        zx2.w wVar = (zx2.w) tVar.getChildAt(i17);
        tVar.removeViewAt(i17);
        if (wVar != null) {
            wVar.setTab(null);
            wVar.setSelected(false);
            ((m3.f) this.U).b(wVar);
        }
        requestLayout();
    }

    public void m(zx2.u uVar, boolean z17) {
        zx2.u uVar2 = this.f133101e;
        java.util.ArrayList arrayList = this.K;
        if (uVar2 == uVar) {
            if (uVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((zx2.o) arrayList.get(size)).c(uVar);
                }
                d(uVar.f477085e);
                return;
            }
            return;
        }
        int i17 = uVar != null ? uVar.f477085e : -1;
        if (z17) {
            if ((uVar2 == null || uVar2.f477085e == -1) && i17 != -1) {
                o(i17, 0.0f, true, true);
            } else {
                d(i17);
            }
            if (i17 != -1) {
                setSelectedTabView(i17);
            }
        }
        this.f133101e = uVar;
        if (uVar2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((zx2.o) arrayList.get(size2)).b(uVar2);
            }
        }
        if (uVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((zx2.o) arrayList.get(size3)).a(uVar);
            }
        }
    }

    public void n(androidx.viewpager.widget.a aVar, boolean z17) {
        android.database.DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.P;
        if (aVar2 != null && (dataSetObserver = this.Q) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.P = aVar;
        if (z17 && aVar != null) {
            if (this.Q == null) {
                this.Q = new zx2.p(this);
            }
            aVar.registerDataSetObserver(this.Q);
        }
        k();
    }

    public void o(int i17, float f17, boolean z17, boolean z18) {
        int round = java.lang.Math.round(i17 + f17);
        if (round >= 0) {
            zx2.t tVar = this.f133103g;
            if (round < tVar.getChildCount()) {
                if (z18) {
                    android.animation.ValueAnimator valueAnimator = tVar.f477078n;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        tVar.f477078n.cancel();
                    }
                    tVar.f477074g = i17;
                    tVar.f477075h = f17;
                    tVar.e();
                }
                android.animation.ValueAnimator valueAnimator2 = this.M;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.M.cancel();
                }
                scrollTo(f(i17, f17), 0);
                if (z17) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.N == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof androidx.viewpager.widget.ViewPager) {
                p((androidx.viewpager.widget.ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        zx2.w wVar;
        android.graphics.drawable.Drawable drawable;
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f133103g;
            if (i17 >= tVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            if ((childAt instanceof zx2.w) && (drawable = (wVar = (zx2.w) childAt).f477099m) != null) {
                drawable.setBounds(wVar.getLeft(), wVar.getTop(), wVar.getRight(), wVar.getBottom());
                wVar.f477099m.draw(canvas);
            }
            i17++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L28;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.g(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L24
            if (r1 == 0) goto L1f
            goto L30
        L1f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L30
        L24:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L30:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L49
            int r1 = r5.f133120z
            if (r1 <= 0) goto L3f
            goto L47
        L3f:
            r1 = 56
            int r1 = r5.g(r1)
            int r1 = r0 - r1
        L47:
            r5.f133118x = r1
        L49:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L97
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.F
            if (r2 == 0) goto L6a
            if (r2 == r0) goto L5f
            goto L77
        L5f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L75
            goto L76
        L6a:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L75
            goto L76
        L75:
            r0 = r6
        L76:
            r6 = r0
        L77:
            if (r6 == 0) goto L97
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout.onMeasure(int, int):void");
    }

    public final void p(androidx.viewpager.widget.ViewPager viewPager, boolean z17, boolean z18) {
        androidx.viewpager.widget.ViewPager viewPager2 = this.N;
        if (viewPager2 != null) {
            zx2.v vVar = this.R;
            if (vVar != null) {
                viewPager2.removeOnPageChangeListener(vVar);
            }
            zx2.n nVar = this.S;
            if (nVar != null) {
                this.N.removeOnAdapterChangeListener(nVar);
            }
        }
        zx2.o oVar = this.L;
        if (oVar != null) {
            this.K.remove(oVar);
            this.L = null;
        }
        if (viewPager != null) {
            this.N = viewPager;
            if (this.R == null) {
                this.R = new zx2.v(this);
            }
            zx2.v vVar2 = this.R;
            vVar2.f477091f = 0;
            vVar2.f477090e = 0;
            viewPager.addOnPageChangeListener(vVar2);
            zx2.x xVar = new zx2.x(viewPager);
            this.L = xVar;
            a(xVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                n(adapter, z17);
            }
            if (this.S == null) {
                this.S = new zx2.n(this);
            }
            zx2.n nVar2 = this.S;
            nVar2.f477060d = z17;
            viewPager.addOnAdapterChangeListener(nVar2);
            o(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.N = null;
            n(null, false);
        }
        this.T = z18;
    }

    public void q(boolean z17) {
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f133103g;
            if (i17 >= tVar.getChildCount()) {
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            childAt.setMinimumWidth(getTabMinWidth());
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.F == 1 && this.C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z17) {
                childAt.requestLayout();
            }
            i17++;
        }
    }

    public void setInlineLabel(boolean z17) {
        if (this.G == z17) {
            return;
        }
        this.G = z17;
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f133103g;
            if (i17 >= tVar.getChildCount()) {
                e();
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            if (childAt instanceof zx2.w) {
                zx2.w wVar = (zx2.w) childAt;
                wVar.setOrientation(!wVar.f477101o.G ? 1 : 0);
                android.widget.TextView textView = wVar.f477097h;
                if (textView == null && wVar.f477098i == null) {
                    wVar.d(wVar.f477094e, wVar.f477095f);
                } else {
                    wVar.d(textView, wVar.f477098i);
                }
            }
            i17++;
        }
    }

    public void setInlineLabelResource(int i17) {
        setInlineLabel(getResources().getBoolean(i17));
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(zx2.o oVar) {
        zx2.o oVar2 = this.f133099J;
        if (oVar2 != null) {
            this.K.remove(oVar2);
        }
        this.f133099J = oVar;
        if (oVar != null) {
            a(oVar);
        }
    }

    public void setScrollAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        h();
        this.M.addListener(animatorListener);
    }

    public void setScrollableTabMinWidth(int i17) {
        this.A = i17;
    }

    public void setSelectedTabIndicator(android.graphics.drawable.Drawable drawable) {
        if (this.f133113s != drawable) {
            this.f133113s = drawable;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this.f133103g);
        }
    }

    public void setSelectedTabIndicatorColor(int i17) {
        this.f133103g.setSelectedIndicatorColor(i17);
    }

    public void setSelectedTabIndicatorGravity(int i17) {
        if (this.E != i17) {
            this.E = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this.f133103g);
        }
    }

    @java.lang.Deprecated
    public void setSelectedTabIndicatorHeight(int i17) {
        this.f133103g.setSelectedIndicatorHeight(i17);
    }

    public void setTabGravity(int i17) {
        if (this.C != i17) {
            this.C = i17;
            e();
        }
    }

    public void setTabIconTint(android.content.res.ColorStateList colorStateList) {
        if (this.f133111q != colorStateList) {
            this.f133111q = colorStateList;
            java.util.ArrayList arrayList = this.f133100d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                zx2.w wVar = ((zx2.u) arrayList.get(i17)).f477088h;
                if (wVar != null) {
                    wVar.b();
                }
            }
        }
    }

    public void setTabIconTintResource(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f302856a;
        setTabIconTint(context.getColorStateList(i17));
    }

    public void setTabIndicatorFullWidth(boolean z17) {
        this.H = z17;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this.f133103g);
    }

    public void setTabMode(int i17) {
        if (i17 != this.F) {
            this.F = i17;
            e();
        }
    }

    public void setTabRippleColor(android.content.res.ColorStateList colorStateList) {
        if (this.f133112r == colorStateList) {
            return;
        }
        this.f133112r = colorStateList;
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f133103g;
            if (i17 >= tVar.getChildCount()) {
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            if (childAt instanceof zx2.w) {
                android.content.Context context = getContext();
                int i18 = zx2.w.f477092p;
                ((zx2.w) childAt).c(context);
            }
            i17++;
        }
    }

    public void setTabRippleColorResource(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f302856a;
        setTabRippleColor(context.getColorStateList(i17));
    }

    public void setTabTextColors(android.content.res.ColorStateList colorStateList) {
        if (this.f133109p != colorStateList) {
            this.f133109p = colorStateList;
            java.util.ArrayList arrayList = this.f133100d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                zx2.w wVar = ((zx2.u) arrayList.get(i17)).f477088h;
                if (wVar != null) {
                    wVar.b();
                }
            }
        }
    }

    @java.lang.Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        n(aVar, false);
    }

    public void setUnboundedRipple(boolean z17) {
        if (this.I == z17) {
            return;
        }
        this.I = z17;
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f133103g;
            if (i17 >= tVar.getChildCount()) {
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            if (childAt instanceof zx2.w) {
                android.content.Context context = getContext();
                int i18 = zx2.w.f477092p;
                ((zx2.w) childAt).c(context);
            }
            i17++;
        }
    }

    public void setUnboundedRippleResource(int i17) {
        setUnboundedRipple(getResources().getBoolean(i17));
    }

    public void setupWithViewPager(androidx.viewpager.widget.ViewPager viewPager) {
        p(viewPager, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public FinderTabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.V = new y3.b();
        this.f133100d = new java.util.ArrayList();
        this.f133102f = new android.graphics.RectF();
        this.f133118x = Integer.MAX_VALUE;
        this.K = new java.util.ArrayList();
        this.U = new m3.f(12);
        setHorizontalScrollBarEnabled(false);
        zx2.t tVar = new zx2.t(this, context);
        this.f133103g = tVar;
        super.addView(tVar, 0, new android.widget.FrameLayout.LayoutParams(-2, -1));
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434131u, i17, com.tencent.mm.R.style.f494750v8, 22);
        tVar.setSelectedIndicatorHeight(d17.getDimensionPixelSize(10, -1));
        tVar.setSelectedIndicatorColor(d17.getColor(7, 0));
        setSelectedTabIndicator(ia.a.b(context, d17, 5));
        setSelectedTabIndicatorGravity(d17.getInt(9, 0));
        setTabIndicatorFullWidth(d17.getBoolean(8, true));
        int dimensionPixelSize = d17.getDimensionPixelSize(15, 0);
        this.f133107n = dimensionPixelSize;
        this.f133106m = dimensionPixelSize;
        this.f133105i = dimensionPixelSize;
        this.f133104h = dimensionPixelSize;
        this.f133104h = d17.getDimensionPixelSize(18, dimensionPixelSize);
        this.f133105i = d17.getDimensionPixelSize(19, this.f133105i);
        this.f133106m = d17.getDimensionPixelSize(17, this.f133106m);
        this.f133107n = d17.getDimensionPixelSize(16, this.f133107n);
        int resourceId = d17.getResourceId(22, com.tencent.mm.R.style.f494593r4);
        this.f133108o = resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, j.a.f296197y);
        try {
            this.f133115u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f133109p = ia.a.a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d17.hasValue(23)) {
                this.f133109p = ia.a.a(context, d17, 23);
            }
            if (d17.hasValue(21)) {
                this.f133109p = new android.content.res.ColorStateList(new int[][]{android.widget.HorizontalScrollView.SELECTED_STATE_SET, android.widget.HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d17.getColor(21, 0), this.f133109p.getDefaultColor()});
            }
            this.f133111q = ia.a.a(context, d17, 3);
            this.f133114t = fa.e0.a(d17.getInt(4, -1), null);
            this.f133112r = ia.a.a(context, d17, 20);
            this.D = d17.getInt(6, 300);
            this.f133119y = d17.getDimensionPixelSize(13, -1);
            this.f133120z = d17.getDimensionPixelSize(12, -1);
            this.f133117w = d17.getResourceId(0, 0);
            this.B = d17.getDimensionPixelSize(1, 0);
            this.F = d17.getInt(14, 1);
            this.C = d17.getInt(2, 0);
            this.G = d17.getBoolean(11, false);
            this.I = d17.getBoolean(24, false);
            d17.recycle();
            android.content.res.Resources resources = getResources();
            this.f133116v = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480298tv);
            this.A = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480296tt);
            e();
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b92.w2.f18552i);
            tVar.setClipChildren(obtainStyledAttributes2.getBoolean(0, true));
            tVar.setClipToPadding(obtainStyledAttributes2.getBoolean(1, true));
            this.W = obtainStyledAttributes2.getBoolean(2, true);
            this.f133110p0 = obtainStyledAttributes2.getBoolean(3, true);
            obtainStyledAttributes2.recycle();
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(int i17) {
        if (i17 != 0) {
            setSelectedTabIndicator(k.a.a(getContext(), i17));
        } else {
            setSelectedTabIndicator((android.graphics.drawable.Drawable) null);
        }
    }
}
