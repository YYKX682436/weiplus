package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class v extends com.tencent.mm.xcompat.recyclerview.widget.d1 implements com.tencent.mm.xcompat.recyclerview.widget.j1 {
    public static final int[] C = {android.R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final java.lang.Runnable B;

    /* renamed from: a, reason: collision with root package name */
    public final int f214660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f214661b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f214662c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f214663d;

    /* renamed from: e, reason: collision with root package name */
    public final int f214664e;

    /* renamed from: f, reason: collision with root package name */
    public final int f214665f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f214666g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f214667h;

    /* renamed from: i, reason: collision with root package name */
    public final int f214668i;

    /* renamed from: j, reason: collision with root package name */
    public final int f214669j;

    /* renamed from: k, reason: collision with root package name */
    public int f214670k;

    /* renamed from: l, reason: collision with root package name */
    public int f214671l;

    /* renamed from: m, reason: collision with root package name */
    public float f214672m;

    /* renamed from: n, reason: collision with root package name */
    public int f214673n;

    /* renamed from: o, reason: collision with root package name */
    public int f214674o;

    /* renamed from: p, reason: collision with root package name */
    public float f214675p;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214678s;

    /* renamed from: z, reason: collision with root package name */
    public final android.animation.ValueAnimator f214685z;

    /* renamed from: q, reason: collision with root package name */
    public int f214676q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f214677r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f214679t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f214680u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f214681v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f214682w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f214683x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f214684y = new int[2];

    public v(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i17, int i18, int i19) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView3;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f214685z = ofFloat;
        this.A = 0;
        com.tencent.mm.xcompat.recyclerview.widget.r rVar = new com.tencent.mm.xcompat.recyclerview.widget.r(this);
        this.B = rVar;
        com.tencent.mm.xcompat.recyclerview.widget.s sVar = new com.tencent.mm.xcompat.recyclerview.widget.s(this);
        this.f214662c = stateListDrawable;
        this.f214663d = drawable;
        this.f214666g = stateListDrawable2;
        this.f214667h = drawable2;
        this.f214664e = java.lang.Math.max(i17, stateListDrawable.getIntrinsicWidth());
        this.f214665f = java.lang.Math.max(i17, drawable.getIntrinsicWidth());
        this.f214668i = java.lang.Math.max(i17, stateListDrawable2.getIntrinsicWidth());
        this.f214669j = java.lang.Math.max(i17, drawable2.getIntrinsicWidth());
        this.f214660a = i18;
        this.f214661b = i19;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new com.tencent.mm.xcompat.recyclerview.widget.t(this));
        ofFloat.addUpdateListener(new com.tencent.mm.xcompat.recyclerview.widget.u(this));
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView4 = this.f214678s;
        if (recyclerView4 == recyclerView) {
            return;
        }
        if (recyclerView4 != null) {
            com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = recyclerView4.f214413t;
            if (g1Var != null) {
                com.tencent.mm.xcompat.recyclerview.widget.e0 e0Var = (com.tencent.mm.xcompat.recyclerview.widget.e0) g1Var;
                if (e0Var.f214501v == null && (recyclerView3 = e0Var.f214522b) != null) {
                    recyclerView3.i("Cannot remove item decoration during a scroll  or layout");
                }
            }
            java.util.ArrayList arrayList = recyclerView4.f214415v;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView4.setWillNotDraw(recyclerView4.getOverScrollMode() == 2);
            }
            recyclerView4.N();
            recyclerView4.requestLayout();
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView5 = this.f214678s;
            recyclerView5.f214416w.remove(this);
            if (recyclerView5.f214417x == this) {
                recyclerView5.f214417x = null;
            }
            java.util.List list = this.f214678s.H1;
            if (list != null) {
                ((java.util.ArrayList) list).remove(sVar);
            }
            this.f214678s.removeCallbacks(rVar);
        }
        this.f214678s = recyclerView;
        if (recyclerView != null) {
            com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var2 = recyclerView.f214413t;
            if (g1Var2 != null) {
                com.tencent.mm.xcompat.recyclerview.widget.e0 e0Var2 = (com.tencent.mm.xcompat.recyclerview.widget.e0) g1Var2;
                if (e0Var2.f214501v == null && (recyclerView2 = e0Var2.f214522b) != null) {
                    recyclerView2.i("Cannot add item decoration during a scroll  or layout");
                }
            }
            java.util.ArrayList arrayList2 = recyclerView.f214415v;
            if (arrayList2.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList2.add(this);
            recyclerView.N();
            recyclerView.requestLayout();
            this.f214678s.f214416w.add(this);
            this.f214678s.h(sVar);
        }
    }

    public boolean a(float f17, float f18) {
        if (f18 >= this.f214677r - this.f214668i) {
            int i17 = this.f214674o;
            int i18 = this.f214673n;
            if (f17 >= i17 - (i18 / 2) && f17 <= i17 + (i18 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(float f17, float f18) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214678s;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z17 = n3.v0.d(recyclerView) == 1;
        int i17 = this.f214664e;
        if (z17) {
            if (f17 > i17) {
                return false;
            }
        } else if (f17 < this.f214676q - i17) {
            return false;
        }
        int i18 = this.f214671l;
        int i19 = this.f214670k / 2;
        return f18 >= ((float) (i18 - i19)) && f18 <= ((float) (i18 + i19));
    }

    public void c(int i17) {
        java.lang.Runnable runnable = this.B;
        android.graphics.drawable.StateListDrawable stateListDrawable = this.f214662c;
        if (i17 == 2 && this.f214681v != 2) {
            stateListDrawable.setState(C);
            this.f214678s.removeCallbacks(runnable);
        }
        if (i17 == 0) {
            this.f214678s.invalidate();
        } else {
            d();
        }
        if (this.f214681v == 2 && i17 != 2) {
            stateListDrawable.setState(D);
            this.f214678s.removeCallbacks(runnable);
            this.f214678s.postDelayed(runnable, 1200);
        } else if (i17 == 1) {
            this.f214678s.removeCallbacks(runnable);
            this.f214678s.postDelayed(runnable, 1500);
        }
        this.f214681v = i17;
    }

    public void d() {
        int i17 = this.A;
        android.animation.ValueAnimator valueAnimator = this.f214685z;
        if (i17 != 0) {
            if (i17 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
