package cr1;

/* loaded from: classes11.dex */
public final class d implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr1.g f221835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221836b;

    public d(cr1.g gVar, java.lang.String str) {
        this.f221835a = gVar;
        this.f221836b = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        cr1.g gVar = this.f221835a;
        java.util.List list = gVar.f221842e;
        java.lang.String str = this.f221836b;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) gVar.f221842e).iterator();
            while (it.hasNext()) {
                kv.e0 e0Var = (kv.e0) ((java.lang.ref.WeakReference) it.next()).get();
                if (e0Var != null) {
                    e0Var.U(str);
                } else {
                    it.remove();
                }
            }
        }
    }
}
