package lr;

/* loaded from: classes15.dex */
public final class e implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.g f320510d;

    public e(lr.g gVar) {
        this.f320510d = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        lr.g gVar = this.f320510d;
        lr.g.j(gVar).f(gVar.f320521f);
        if (lr.g.j(gVar).c()) {
            lr.g.j(gVar).e();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        lr.g gVar = this.f320510d;
        lr.g.j(gVar).d(gVar.f320521f);
    }
}
