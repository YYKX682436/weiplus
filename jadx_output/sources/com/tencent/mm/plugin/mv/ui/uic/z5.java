package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class z5 extends com.tencent.mm.ui.component.UIComponent {
    public android.graphics.Bitmap A;
    public boolean B;
    public final int C;
    public long D;
    public final kotlinx.coroutines.y0 E;
    public final com.tencent.mm.plugin.mv.ui.uic.j5 F;
    public final com.tencent.mm.plugin.mv.ui.uic.k5 G;
    public com.tencent.mm.plugin.mv.ui.uic.w4 H;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f151568d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f151569e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f151570f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f151571g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f151572h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f151573i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f151574m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f151575n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f151576o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f151577p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f151578q;

    /* renamed from: r, reason: collision with root package name */
    public kk4.d f151579r;

    /* renamed from: s, reason: collision with root package name */
    public long f151580s;

    /* renamed from: t, reason: collision with root package name */
    public long f151581t;

    /* renamed from: u, reason: collision with root package name */
    public long f151582u;

    /* renamed from: v, reason: collision with root package name */
    public float f151583v;

    /* renamed from: w, reason: collision with root package name */
    public fm3.q f151584w;

    /* renamed from: x, reason: collision with root package name */
    public int f151585x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Bitmap f151586y;

    /* renamed from: z, reason: collision with root package name */
    public int f151587z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151568d = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.x5(this));
        this.f151569e = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.c5(this));
        this.f151570f = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.h5(this));
        this.f151571g = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.y5(this));
        this.f151572h = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.v5(this));
        this.f151573i = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.b5(this));
        this.f151574m = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.a5(this));
        this.f151575n = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.d5(activity));
        this.f151576o = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.z4(this));
        this.f151577p = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.l5(this));
        this.f151578q = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.e5(this));
        this.f151585x = Integer.MAX_VALUE;
        this.f151587z = Integer.MAX_VALUE;
        this.C = i65.a.b(activity, 48);
        this.D = -1L;
        this.E = kotlinx.coroutines.z0.b();
        this.F = new com.tencent.mm.plugin.mv.ui.uic.j5(this);
        this.G = new com.tencent.mm.plugin.mv.ui.uic.k5(this);
    }

    public static final void O6(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var) {
        gk4.b effector;
        fm3.q qVar = z5Var.f151584w;
        if (qVar != null) {
            int i17 = qVar.f264107e;
            if (qVar.f264114o == null || i17 > z5Var.f151585x) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "tryCatchFirstFrame, timeInMv:" + i17 + ", firstRenderTime:" + z5Var.f151585x);
            kk4.d dVar = z5Var.f151579r;
            if (dVar == null || (effector = dVar.getEffector()) == null) {
                return;
            }
            gk4.h0 h0Var = (gk4.h0) effector;
            h0Var.G = new com.tencent.mm.plugin.mv.ui.uic.w5(i17, z5Var);
            h0Var.F = true;
            com.tencent.mars.xlog.Log.i(h0Var.f272556a, "request snapshot");
        }
    }

    public final com.tencent.mm.plugin.mv.ui.uic.x4 P6() {
        return (com.tencent.mm.plugin.mv.ui.uic.x4) ((jz5.n) this.f151576o).getValue();
    }

    public final androidx.recyclerview.widget.RecyclerView Q6() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f151574m).getValue();
    }

    public final android.widget.LinearLayout R6() {
        return (android.widget.LinearLayout) ((jz5.n) this.f151569e).getValue();
    }

    public final com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar S6() {
        return (com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar) ((jz5.n) this.f151577p).getValue();
    }

    public final android.widget.ImageView T6() {
        return (android.widget.ImageView) ((jz5.n) this.f151572h).getValue();
    }

    public final bm3.c U6() {
        return (bm3.c) ((jz5.n) this.f151568d).getValue();
    }

    public final void V6() {
        com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2;
        int itemCount = P6().getItemCount();
        for (int i17 = 0; i17 < itemCount; i17++) {
            androidx.recyclerview.widget.k3 p07 = Q6().p0(i17);
            com.tencent.mm.plugin.mv.ui.uic.y4 y4Var = p07 instanceof com.tencent.mm.plugin.mv.ui.uic.y4 ? (com.tencent.mm.plugin.mv.ui.uic.y4) p07 : null;
            if (y4Var != null && (frameListView2 = y4Var.f151555d) != null) {
                rm5.k kVar = frameListView2.f151610t;
                if (kVar != null) {
                    kVar.destroy();
                }
                frameListView2.f151610t = null;
                frameListView2.f151599f = null;
                com.tencent.mars.xlog.Log.i(frameListView2.f151597d, "clearThumb");
                frameListView2.f151600g.clear();
                frameListView2.f151601h = null;
                frameListView2.postInvalidate();
            }
        }
        P6().f151527e = null;
        Q6().postInvalidate();
    }

    public final void W6(boolean z17) {
        kk4.b player;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "setShow:" + z17);
        if (z17) {
            T6().setImageDrawable(null);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.mv.ui.uic.h4) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class)).U6();
            R6().setVisibility(0);
            R6().animate().alpha(1.0f).setDuration(250L).setListener(new com.tencent.mm.plugin.mv.ui.uic.m5(this)).start();
            return;
        }
        T6().setImageDrawable(null);
        kk4.d dVar = this.f151579r;
        if (dVar != null && (player = dVar.getPlayer()) != null) {
            kk4.b.i(player, false, false, 3, null);
        }
        V6();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
        h4Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "resumeVideo");
        h4Var.R6().notifyItemChanged(h4Var.f151167n.f151864m);
        R6().animate().alpha(0.0f).withEndAction(new com.tencent.mm.plugin.mv.ui.uic.n5(this)).start();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (R6().getVisibility() != 0) {
            return super.onBackPressed();
        }
        com.tencent.mm.plugin.mv.ui.uic.w4 w4Var = this.H;
        if (w4Var == null) {
            return true;
        }
        ((jm3.j0) w4Var).a(this.B);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        S6().setCursorColor(-1);
        S6().setCursorWidth(i65.a.b(getActivity(), 2));
        U6().f22499b.setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.f5(this));
        U6().f22500c.setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.g5(this));
        R6().setAlpha(0.0f);
        Q6().setAdapter(P6());
        Q6().setLayoutManager((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) this.f151575n).getValue());
        Q6().i(this.G);
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        ((cf0.q) qVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout = new com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout((android.content.Context) context, false);
        this.f151579r = mMTPVideoLayout;
        mMTPVideoLayout.c();
        java.lang.Object obj = this.f151579r;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        java.lang.Object obj2 = this.f151579r;
        android.view.View view2 = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
        if (view2 != null) {
            view2.setId(com.tencent.mm.R.id.k0o);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f151571g).getValue();
        java.lang.Object obj3 = this.f151579r;
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type android.view.View");
        frameLayout.addView((android.view.View) obj3, layoutParams);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gk4.b effector;
        kk4.b player;
        kk4.d dVar = this.f151579r;
        if (dVar != null && (player = dVar.getPlayer()) != null) {
            player.recycle();
        }
        kk4.d dVar2 = this.f151579r;
        if (dVar2 != null && (effector = dVar2.getEffector()) != null) {
            gk4.h0 h0Var = (gk4.h0) effector;
            com.tencent.mm.sdk.platformtools.n3 n3Var = h0Var.f272560e;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(null);
            }
            h0Var.e(new gk4.f0(h0Var));
        }
        rm5.c cVar = rm5.h.f397489h;
        rm5.h.f397490i.evictAll();
    }
}
