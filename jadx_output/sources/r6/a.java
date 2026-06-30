package r6;

/* loaded from: classes13.dex */
public class a implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r6.f f392743d;

    public a(r6.f fVar) {
        this.f392743d = fVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        synchronized (this.f392743d) {
            r6.f fVar = this.f392743d;
            if (fVar.f392765o == null) {
                return null;
            }
            fVar.z();
            if (this.f392743d.k()) {
                this.f392743d.w();
                this.f392743d.f392767q = 0;
            }
            return null;
        }
    }
}
