package rv0;

/* loaded from: classes5.dex */
public final class f extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l {

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f399990J;
    public android.widget.TextView K;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJWaveformView L;
    public com.tencent.maas.model.time.MJTimeRange M;
    public com.tencent.maas.model.time.MJTime N;
    public com.tencent.maas.model.time.MJTime P;
    public boolean Q;
    public final int R;
    public final int S;
    public yz5.a T;
    public yz5.l U;
    public yz5.l V;
    public yz5.a W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(focusedSegmentVM, "focusedSegmentVM");
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        this.N = ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        this.P = ZeroTime;
        this.R = j65.q.a(context).getColor(com.tencent.mm.R.color.ac9, null);
        this.S = j65.q.a(context).getColor(com.tencent.mm.R.color.f479400ad2, null);
    }

    public static final void K(rv0.f fVar, float f17) {
        fVar.getClass();
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(f17);
        kotlin.jvm.internal.o.d(fromSeconds);
        fVar.N = fromSeconds;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dft, bodyContainerLayout);
    }

    public final yz5.a getOnFirstAttached() {
        return this.T;
    }

    public final yz5.l getOnMusicStartInMediaChanged() {
        return this.V;
    }

    public final yz5.l getOnPlayingProgressChanged() {
        return this.U;
    }

    public final yz5.a getOnUserTouch() {
        return this.W;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f492487ll0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void setCurrentTime(com.tencent.maas.model.time.MJTime time) {
        kotlin.jvm.internal.o.g(time, "time");
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = this.M;
        if (mJTimeRange == null) {
            return;
        }
        if (mJTimeRange == null) {
            kotlin.jvm.internal.o.o("presentationTimeRange");
            throw null;
        }
        com.tencent.maas.model.time.MJTime add = time.sub(mJTimeRange.getStartTime()).add(this.N);
        long milliseconds = (long) this.P.toMilliseconds();
        long milliseconds2 = (long) add.toMilliseconds();
        java.lang.String d17 = ou0.f.d(milliseconds);
        java.lang.String d18 = ou0.f.d(milliseconds2);
        java.lang.String str = d18 + " / " + d17;
        android.widget.TextView textView = this.f399990J;
        if (textView == null) {
            kotlin.jvm.internal.o.o("startTimeTv");
            throw null;
        }
        int length = d18.length();
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.R), 0, length, 18);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.S), length, str.length(), 18);
        textView.setText(spannableString);
        if (this.Q) {
            return;
        }
        if (time instanceof ou0.g ? ou0.f.c(time, 2L) : false) {
            return;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJWaveformView mJWaveformView = this.L;
        if (mJWaveformView != null) {
            mJWaveformView.setVideoPosition((long) add.sub(this.N).toMilliseconds());
        } else {
            kotlin.jvm.internal.o.o("wave");
            throw null;
        }
    }

    public final void setMusicFullDuration(com.tencent.maas.model.time.MJTime duration) {
        kotlin.jvm.internal.o.g(duration, "duration");
        this.P = duration;
        java.lang.String d17 = ou0.f.d((long) duration.toMilliseconds());
        java.lang.String str = ou0.f.d(0L) + " / " + d17;
        android.widget.TextView textView = this.f399990J;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.o.o("startTimeTv");
            throw null;
        }
    }

    public final void setOnFirstAttached(yz5.a aVar) {
        this.T = aVar;
    }

    public final void setOnMusicStartInMediaChanged(yz5.l lVar) {
        this.V = lVar;
    }

    public final void setOnPlayingProgressChanged(yz5.l lVar) {
        this.U = lVar;
    }

    public final void setOnUserTouch(yz5.a aVar) {
        this.W = aVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.q3v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f399990J = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qah);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qc_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJWaveformView mJWaveformView = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJWaveformView) findViewById3;
        this.L = mJWaveformView;
        mJWaveformView.setListener(new rv0.e(this));
        yz5.a aVar = this.T;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
