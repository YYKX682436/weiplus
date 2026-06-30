package u9;

/* loaded from: classes15.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.f f425788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u9.s f425789e;

    public r(u9.s sVar, o8.f fVar) {
        this.f425789e = sVar;
        this.f425788d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f425788d) {
        }
        this.f425789e.f425791b.q(this.f425788d);
    }
}
