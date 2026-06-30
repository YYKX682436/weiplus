package i95;

/* loaded from: classes12.dex */
public class s implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.v f289850d;

    public s(i95.v vVar) {
        this.f289850d = vVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        boolean z17;
        synchronized (this.f289850d) {
            z17 = this.f289850d.f289860n != null;
        }
        if (z17) {
            this.f289850d.join();
            return null;
        }
        this.f289850d.invoke();
        return null;
    }
}
