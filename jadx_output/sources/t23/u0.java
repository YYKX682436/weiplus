package t23;

/* loaded from: classes10.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f415275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t23.v0 f415276e;

    public u0(t23.v0 v0Var, boolean z17) {
        this.f415276e = v0Var;
        this.f415275d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.i iVar = this.f415276e.f415280d;
        boolean z17 = this.f415275d;
        if (!iVar.f415181o) {
            iVar.f415183q.f415189d.remove(iVar.f415180n);
        }
        iVar.f415183q.f415189d.size();
        t23.j jVar = iVar.f415183q;
        jVar.f415187b++;
        jVar.i();
        if (z17) {
            iVar.f415183q.f415186a.d(iVar.f415173d, iVar.f415182p, 12288, iVar.f415177h, iVar.f415181o, iVar.f415178i, iVar.f415179m);
            iVar.f415182p = null;
        }
    }
}
