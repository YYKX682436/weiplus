package ow0;

/* loaded from: classes5.dex */
public final class o0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView f349340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f349341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f349342f;

    public o0(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView, gx0.u2 u2Var, ex0.a0 a0Var) {
        this.f349340d = captionTimelineView;
        this.f349341e = u2Var;
        this.f349342f = a0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f349340d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ow0.q0.d(this.f349341e, this.f349340d, this.f349342f, null, 4, null);
    }
}
