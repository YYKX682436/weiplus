package rv0;

/* loaded from: classes5.dex */
public final class j7 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f400068J;
    public yz5.a K;
    public yz5.a L;
    public yz5.a M;
    public yz5.a N;
    public yz5.a P;
    public yz5.a Q;
    public android.view.View R;
    public android.view.View S;
    public final jz5.g T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(focusedSegmentVM, "focusedSegmentVM");
        this.T = jz5.h.b(new rv0.i7(this));
    }

    private final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.wheel_picker.HorizontalScaleWheelPicker getSpeedPicker() {
        java.lang.Object value = ((jz5.n) this.T).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.wheel_picker.HorizontalScaleWheelPicker) value;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489267dg3, bodyContainerLayout);
    }

    public final double getCurrentSpeed() {
        return (getSpeedPicker().getCurrentSpeed() != null ? r0.intValue() : 100) / 100.0d;
    }

    public final yz5.a getOnApplyToAllButtonClicked() {
        return this.f400068J;
    }

    public final yz5.a getOnAttached() {
        return this.M;
    }

    public final yz5.a getOnClosed() {
        return this.P;
    }

    public final yz5.a getOnFirstAttached() {
        return this.L;
    }

    public final yz5.a getOnOpened() {
        return this.N;
    }

    public final yz5.a getOnResetButtonClicked() {
        return this.K;
    }

    public final yz5.a getOnSpeedChanged() {
        return this.Q;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.llb);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        super.p();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(this, this.R, null);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(this, this.S, null);
        yz5.a aVar = this.M;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void s() {
        yz5.a aVar = this.P;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setOnApplyToAllButtonClicked(yz5.a aVar) {
        this.f400068J = aVar;
    }

    public final void setOnAttached(yz5.a aVar) {
        this.M = aVar;
    }

    public final void setOnClosed(yz5.a aVar) {
        this.P = aVar;
    }

    public final void setOnFirstAttached(yz5.a aVar) {
        this.L = aVar;
    }

    public final void setOnOpened(yz5.a aVar) {
        this.N = aVar;
    }

    public final void setOnResetButtonClicked(yz5.a aVar) {
        this.K = aVar;
    }

    public final void setOnSpeedChanged(yz5.a aVar) {
        this.Q = aVar;
    }

    public final void setSpeed(double d17) {
        getSpeedPicker().setSpeed(d17);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        this.R = findViewById(com.tencent.mm.R.id.q3i);
        this.S = findViewById(com.tencent.mm.R.id.q3o);
        android.view.View view = this.R;
        if (view != null) {
            view.setOnClickListener(new rv0.f7(this));
        }
        android.view.View view2 = this.S;
        if (view2 != null) {
            view2.setOnClickListener(new rv0.g7(this));
        }
        lx0.c cVar = new lx0.c(0, 1, null);
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.wheel_picker.HorizontalScaleWheelPicker speedPicker = getSpeedPicker();
        speedPicker.getClass();
        speedPicker.Q = cVar;
        int i17 = cVar.f322032a;
        if (i17 != -1) {
            speedPicker.f69486n = i17 - 1;
            speedPicker.f69485m = 0;
        }
        speedPicker.f69487o = i17 - 1;
        speedPicker.f69488p = 25;
        speedPicker.c();
        speedPicker.invalidate();
        speedPicker.requestLayout();
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.wheel_picker.HorizontalScaleWheelPicker speedPicker2 = getSpeedPicker();
        speedPicker2.f69479d = 5;
        speedPicker2.f69480e = 10;
        getSpeedPicker().setOnScrollListener(new rv0.h7(this));
        yz5.a aVar = this.L;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void x() {
        yz5.a aVar = this.N;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
