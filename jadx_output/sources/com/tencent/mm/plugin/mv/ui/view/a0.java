package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class a0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: v, reason: collision with root package name */
    public static final float f151756v = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);

    /* renamed from: w, reason: collision with root package name */
    public static final float f151757w = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 28);

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String f151758x = "MicroMsg.LyricItemDecoration";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f151759d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f151760e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f151761f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f151762g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f151763h;

    /* renamed from: i, reason: collision with root package name */
    public int f151764i;

    /* renamed from: m, reason: collision with root package name */
    public int f151765m;

    /* renamed from: n, reason: collision with root package name */
    public float f151766n;

    /* renamed from: o, reason: collision with root package name */
    public float f151767o;

    /* renamed from: p, reason: collision with root package name */
    public int f151768p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f151769q;

    /* renamed from: r, reason: collision with root package name */
    public long f151770r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f151771s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f151772t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f151773u;

    public a0(android.content.Context ctx, androidx.recyclerview.widget.RecyclerView lyricRv) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(lyricRv, "lyricRv");
        this.f151759d = ctx;
        this.f151760e = lyricRv;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f151761f = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f151762g = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f151763h = paint3;
        this.f151764i = 2;
        this.f151765m = 1;
        float f17 = f151756v;
        this.f151766n = f17;
        this.f151767o = f17;
        this.f151768p = 2;
        this.f151771s = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.t.f151948d);
        this.f151772t = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.u.f151954d);
        this.f151773u = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.s.f151943d);
        paint.setColor(b3.l.getColor(ctx, com.tencent.mm.R.color.BW_100_Alpha_0_8));
        paint2.setColor(b3.l.getColor(ctx, com.tencent.mm.R.color.BW_100_Alpha_0_8));
        paint3.setColor(b3.l.getColor(ctx, com.tencent.mm.R.color.BW_100_Alpha_0_8));
    }

    public final android.animation.ValueAnimator d() {
        return (android.animation.ValueAnimator) ((jz5.n) this.f151773u).getValue();
    }

    public final float e(int i17) {
        return i17 == this.f151765m ? this.f151767o : i17 == this.f151764i ? this.f151766n : f151756v;
    }

    public final void f(long j17) {
        float f17 = f151756v;
        this.f151767o = f17;
        this.f151766n = f17;
        this.f151760e.invalidate();
        if (j17 > 5000) {
            j17 = 3000;
        }
        int i17 = (int) j17;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var3 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.o.d(ofInt);
        ofInt.setDuration(i17);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.addListener(new com.tencent.mm.plugin.mv.ui.view.v(this));
        ofInt.addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.w(i17, this, c0Var3, c0Var2, c0Var));
        ofInt.cancel();
        ofInt.start();
        d().addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.x(this));
    }

    public final void g(long j17) {
        boolean z17 = this.f151769q;
        java.lang.String str = f151758x;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startAnim " + hashCode() + "， has startAnim");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "startAnim");
        this.f151769q = true;
        this.f151764i = 2;
        this.f151765m = 1;
        float f17 = f151756v;
        this.f151766n = f17;
        this.f151767o = f17;
        this.f151768p = 2;
        android.graphics.Paint paint = this.f151761f;
        android.content.Context context = this.f151759d;
        paint.setColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_8));
        this.f151762g.setColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_8));
        this.f151763h.setColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_8));
        long j18 = this.f151770r - j17;
        if (j18 <= 5000) {
            if (j18 >= 3000) {
                f(j18);
                return;
            } else {
                this.f151769q = false;
                return;
            }
        }
        jz5.g gVar = this.f151771s;
        ((android.animation.ValueAnimator) ((jz5.n) gVar).getValue()).addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.y(j18, this));
        jz5.g gVar2 = this.f151772t;
        ((android.animation.ValueAnimator) ((jz5.n) gVar2).getValue()).addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.z(j18, this));
        ((android.animation.ValueAnimator) ((jz5.n) gVar).getValue()).cancel();
        ((android.animation.ValueAnimator) ((jz5.n) gVar).getValue()).start();
        ((android.animation.ValueAnimator) ((jz5.n) gVar2).getValue()).cancel();
        ((android.animation.ValueAnimator) ((jz5.n) gVar2).getValue()).start();
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 == -1) {
            return;
        }
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (u07 == 0) {
            int i17 = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
            outRect.top = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.f151680J;
        } else if (u07 != itemCount - 1) {
            int i18 = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
            outRect.top = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
        } else {
            int i19 = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
            outRect.top = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
            outRect.bottom = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.f151680J;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(canvas, parent, state);
        if (this.f151769q && parent.getChildCount() > 0) {
            android.view.View childAt = parent.getChildAt(0);
            if (parent.u0(childAt) != 0) {
                return;
            }
            float f17 = f151756v;
            float top = childAt.getTop();
            float f18 = f151757w;
            canvas.drawCircle((f17 * 0.2f) + f17, top - f18, e(0), this.f151761f);
            canvas.drawCircle((4 * f17) + (f17 * 0.2f), childAt.getTop() - f18, e(1), this.f151762g);
            canvas.drawCircle((7 * f17) + (f17 * 0.2f), childAt.getTop() - f18, e(2), this.f151763h);
        }
    }
}
