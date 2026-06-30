package rr;

/* loaded from: classes13.dex */
public final class x implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.z f399155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va0.n f399156e;

    public x(rr.z zVar, va0.n nVar) {
        this.f399155d = zVar;
        this.f399156e = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        rr.z zVar = this.f399155d;
        zVar.f399161h.removeOnAttachStateChangeListener(this);
        ((com.tencent.mm.plugin.newtips.model.p) this.f399156e).r(zVar);
    }
}
