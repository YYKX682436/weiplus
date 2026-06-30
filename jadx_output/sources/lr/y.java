package lr;

/* loaded from: classes15.dex */
public abstract class y implements ir.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final lr.z f320612a;

    public y(lr.z adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f320612a = adapter;
    }

    @Override // ir.l0
    public void a(int i17, int i18) {
        this.f320612a.notifyItemRangeChanged(i17, i18);
    }
}
