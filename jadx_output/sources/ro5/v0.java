package ro5;

/* loaded from: classes14.dex */
public final class v0 implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398301d;

    public v0(ro5.m1 m1Var) {
        this.f398301d = m1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) this.f398301d.f398242d.f455797h.getValue(), null, null, new ro5.u0(runnable, null), 3, null);
    }
}
