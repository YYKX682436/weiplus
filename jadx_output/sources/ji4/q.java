package ji4;

/* loaded from: classes11.dex */
public class q implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f299944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ji4.s f299945b;

    public q(ji4.s sVar, java.lang.String str) {
        this.f299945b = sVar;
        this.f299944a = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        synchronized (this.f299945b.f299948d) {
            java.util.Iterator it = ((java.util.ArrayList) this.f299945b.f299948d).iterator();
            while (it.hasNext()) {
                kv.e0 e0Var = (kv.e0) ((java.lang.ref.WeakReference) it.next()).get();
                if (e0Var != null) {
                    e0Var.U(this.f299944a);
                } else {
                    it.remove();
                }
            }
        }
    }
}
