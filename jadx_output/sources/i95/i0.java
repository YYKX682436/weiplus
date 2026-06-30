package i95;

/* loaded from: classes12.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.w f289799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f289800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f289801f;

    public i0(i95.w wVar, java.lang.Throwable th6, boolean z17) {
        this.f289799d = wVar;
        this.f289800e = th6;
        this.f289801f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f289799d.setLastCallerStack(this.f289800e);
        i95.n0.j(null, this.f289799d, i95.r.INITIALIZED, this.f289801f, true, false);
    }
}
