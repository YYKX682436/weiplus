package ze5;

/* loaded from: classes5.dex */
public final class z7 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f472348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f472349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.u2 f472350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ af5.d1 f472351g;

    public z7(android.view.View view, long j17, sb5.u2 u2Var, af5.d1 d1Var) {
        this.f472348d = view;
        this.f472349e = j17;
        this.f472350f = u2Var;
        this.f472351g = d1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f472348d.removeOnAttachStateChangeListener(this);
        long j17 = this.f472349e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] doOnDetach: unregister callbacks, msgSvrId=%d", java.lang.Long.valueOf(j17));
        sb5.u2 u2Var = this.f472350f;
        if (u2Var != null) {
            ((com.tencent.mm.ui.chatting.component.qp) u2Var).v0(j17);
        }
        if (u2Var != null) {
            ((com.tencent.mm.ui.chatting.component.qp) u2Var).w0(j17);
        }
        this.f472351g.setTag(com.tencent.mm.R.id.vp8, null);
    }
}
