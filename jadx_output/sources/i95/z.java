package i95;

/* loaded from: classes12.dex */
public class z implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.w f289866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f289867e;

    public z(i95.w wVar, java.lang.Throwable th6) {
        this.f289866d = wVar;
        this.f289867e = th6;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        this.f289866d.setLastCallerStack(this.f289867e);
        i95.n0.j(null, this.f289866d, i95.r.ACTIVATED, true, true, false);
        return null;
    }
}
