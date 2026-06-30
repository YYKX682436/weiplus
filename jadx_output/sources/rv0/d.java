package rv0;

/* loaded from: classes5.dex */
public final class d extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f399963J;
    public yz5.l K;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(focusedSegmentVM, "focusedSegmentVM");
    }

    @Override // qv0.f
    public boolean E(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return super.E(view);
    }

    @Override // qv0.f
    public boolean F(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return super.F(view);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfq, bodyContainerLayout);
    }

    public final yz5.a getOnFirstAttached() {
        return this.f399963J;
    }

    public final yz5.l getOnVolumeChanged() {
        return this.K;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.lkx);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void setOnFirstAttached(yz5.a aVar) {
        this.f399963J = aVar;
    }

    public final void setOnVolumeChanged(yz5.l lVar) {
        this.K = lVar;
    }

    public final void setVolume(float f17) {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = this.L;
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
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) findViewById;
        this.L = mJTextSeekBar;
        mJTextSeekBar.setOnIconClickListener(new rv0.a(this));
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar2 = this.L;
        if (mJTextSeekBar2 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        mJTextSeekBar2.setGetIconByValue(new rv0.b(this));
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar3 = this.L;
        if (mJTextSeekBar3 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        mJTextSeekBar3.setOnSeekBarChangeListener(new rv0.c(this));
        yz5.a aVar = this.f399963J;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
