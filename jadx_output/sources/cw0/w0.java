package cw0;

/* loaded from: classes5.dex */
public final class w0 extends qv0.f {
    public yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.l f222692J;
    public yz5.l K;
    public yz5.a L;
    public yz5.l M;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar N;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar P;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar Q;
    public android.widget.TextView R;
    public android.widget.TextView S;
    public android.view.View T;
    public android.widget.TextView U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void K(cw0.w0 w0Var, boolean z17) {
        if (!z17) {
            w0Var.getClass();
            return;
        }
        yz5.l lVar = w0Var.M;
        if (lVar != null) {
        }
        w0Var.M(false);
    }

    public final void L(float f17, java.lang.Float f18, java.lang.Float f19) {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = this.N;
        if (mJTextSeekBar == null || this.Q == null || this.P == null) {
            return;
        }
        if (mJTextSeekBar == null) {
            kotlin.jvm.internal.o.o("narrationVolumeSeekBar");
            throw null;
        }
        float f27 = 100;
        mJTextSeekBar.setValue(f17 * f27);
        if (f18 == null) {
            android.widget.TextView textView = this.R;
            if (textView == null) {
                kotlin.jvm.internal.o.o("ostText");
                throw null;
            }
            textView.setVisibility(8);
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar2 = this.P;
            if (mJTextSeekBar2 == null) {
                kotlin.jvm.internal.o.o("ostVolumeSeekBar");
                throw null;
            }
            mJTextSeekBar2.setVisibility(8);
        } else {
            android.widget.TextView textView2 = this.R;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("ostText");
                throw null;
            }
            textView2.setVisibility(0);
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar3 = this.P;
            if (mJTextSeekBar3 == null) {
                kotlin.jvm.internal.o.o("ostVolumeSeekBar");
                throw null;
            }
            mJTextSeekBar3.setValue(f18.floatValue() * f27);
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar4 = this.P;
            if (mJTextSeekBar4 == null) {
                kotlin.jvm.internal.o.o("ostVolumeSeekBar");
                throw null;
            }
            mJTextSeekBar4.setVisibility(0);
        }
        if (f19 == null) {
            android.widget.TextView textView3 = this.S;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("musicText");
                throw null;
            }
            textView3.setVisibility(8);
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar5 = this.Q;
            if (mJTextSeekBar5 != null) {
                mJTextSeekBar5.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("musicVolumeSeekBar");
                throw null;
            }
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar6 = this.Q;
        if (mJTextSeekBar6 == null) {
            kotlin.jvm.internal.o.o("musicVolumeSeekBar");
            throw null;
        }
        mJTextSeekBar6.setValue(f19.floatValue() * f27);
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar7 = this.Q;
        if (mJTextSeekBar7 == null) {
            kotlin.jvm.internal.o.o("musicVolumeSeekBar");
            throw null;
        }
        mJTextSeekBar7.setVisibility(0);
        android.widget.TextView textView4 = this.S;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("musicText");
            throw null;
        }
    }

    public final void M(boolean z17) {
        int i17 = z17 ? com.tencent.mm.R.drawable.a0n : com.tencent.mm.R.drawable.f480952c1;
        android.widget.TextView textView = this.U;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i17, 0, 0, 0);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.djn, bodyContainerLayout);
    }

    public final yz5.a getOnAttached() {
        return this.L;
    }

    public final yz5.l getOnAutoAdjustStateChange() {
        return this.M;
    }

    public final yz5.l getOnMusicVolumeChangedListener() {
        return this.K;
    }

    public final yz5.l getOnNarrationVolumeChangeListener() {
        return this.I;
    }

    public final yz5.l getOnOSTVolumeChangedListener() {
        return this.f222692J;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.llm);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(this, this.T, null);
        yz5.a aVar = this.L;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setOnAttached(yz5.a aVar) {
        this.L = aVar;
    }

    public final void setOnAutoAdjustStateChange(yz5.l lVar) {
        this.M = lVar;
    }

    public final void setOnMusicVolumeChangedListener(yz5.l lVar) {
        this.K = lVar;
    }

    public final void setOnNarrationVolumeChangeListener(yz5.l lVar) {
        this.I = lVar;
    }

    public final void setOnOSTVolumeChangedListener(yz5.l lVar) {
        this.f222692J = lVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qm7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.N = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q8w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.P = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f483368qh4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.Q = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f487448qr0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f487451qb5);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.R = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.qqy);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.S = (android.widget.TextView) findViewById6;
        this.T = findViewById(com.tencent.mm.R.id.h_);
        this.U = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487416qw);
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = this.N;
        if (mJTextSeekBar == null) {
            kotlin.jvm.internal.o.o("narrationVolumeSeekBar");
            throw null;
        }
        mJTextSeekBar.setOnSeekBarChangeListener(new cw0.s0(this));
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar2 = this.P;
        if (mJTextSeekBar2 == null) {
            kotlin.jvm.internal.o.o("ostVolumeSeekBar");
            throw null;
        }
        mJTextSeekBar2.setOnSeekBarChangeListener(new cw0.t0(this));
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar3 = this.Q;
        if (mJTextSeekBar3 == null) {
            kotlin.jvm.internal.o.o("musicVolumeSeekBar");
            throw null;
        }
        mJTextSeekBar3.setOnSeekBarChangeListener(new cw0.u0(this));
        android.view.View view = this.T;
        if (view != null) {
            view.setOnClickListener(new cw0.v0(this));
        }
    }
}
