package mn2;

/* loaded from: classes11.dex */
public class o implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn2.q f330075b;

    public o(mn2.q qVar, java.lang.String str) {
        this.f330075b = qVar;
        this.f330074a = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        synchronized (this.f330075b.f330090d) {
            java.util.Iterator it = ((java.util.ArrayList) this.f330075b.f330090d).iterator();
            while (it.hasNext()) {
                kv.e0 e0Var = (kv.e0) ((java.lang.ref.WeakReference) it.next()).get();
                if (e0Var != null) {
                    e0Var.U(this.f330074a);
                } else {
                    it.remove();
                }
            }
        }
    }
}
