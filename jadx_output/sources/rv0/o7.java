package rv0;

/* loaded from: classes5.dex */
public final class o7 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f400164J;
    public yz5.p K;
    public yz5.a L;
    public yz5.a M;
    public android.view.View N;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(focusedSegmentVM, "focusedSegmentVM");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfr, bodyContainerLayout);
    }

    public final yz5.a getOnApplyToAllButtonClicked() {
        return this.M;
    }

    public final yz5.a getOnAttached() {
        return this.f400164J;
    }

    public final yz5.a getOnMuteIconClicked() {
        return this.L;
    }

    public final yz5.p getOnVolumeChanged() {
        return this.K;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.lky);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        super.p();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(this, this.N, null);
        yz5.a aVar = this.f400164J;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setIsMuted(boolean z17) {
        float value;
        if (z17) {
            value = 0.0f;
        } else {
            if (this.P == null) {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
            value = r4.getValue() / 100.0f;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = this.P;
        if (mJTextSeekBar != null) {
            mJTextSeekBar.A(value);
        } else {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
    }

    public final void setOnApplyToAllButtonClicked(yz5.a aVar) {
        this.M = aVar;
    }

    public final void setOnAttached(yz5.a aVar) {
        this.f400164J = aVar;
    }

    public final void setOnMuteIconClicked(yz5.a aVar) {
        this.L = aVar;
    }

    public final void setOnVolumeChanged(yz5.p pVar) {
        this.K = pVar;
    }

    public final void setVolume(float f17) {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = this.P;
        if (mJTextSeekBar != null) {
            mJTextSeekBar.setValue(f17);
        } else {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qby);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.P = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) findViewById;
        this.N = findViewById(com.tencent.mm.R.id.q3i);
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = this.P;
        if (mJTextSeekBar == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        mJTextSeekBar.setOnIconClickListener(new rv0.k7(this));
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar2 = this.P;
        if (mJTextSeekBar2 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        mJTextSeekBar2.setGetIconByValue(new rv0.l7(this));
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar3 = this.P;
        if (mJTextSeekBar3 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        mJTextSeekBar3.setOnSeekBarChangeListener(new rv0.m7(this));
        android.view.View view = this.N;
        if (view != null) {
            view.setOnClickListener(new rv0.n7(this));
        }
    }
}
