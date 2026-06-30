package p16;

/* loaded from: classes16.dex */
public abstract class q extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public p16.n f351338e = p16.n.f351323d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f351339f;

    public final void c(p16.s sVar) {
        p16.w0 w0Var;
        if (!this.f351339f) {
            this.f351338e = this.f351338e.clone();
            this.f351339f = true;
        }
        p16.n nVar = this.f351338e;
        p16.n nVar2 = sVar.f351343d;
        nVar.getClass();
        int i17 = 0;
        while (true) {
            int size = nVar2.f351324a.f351365e.size();
            w0Var = nVar2.f351324a;
            if (i17 >= size) {
                break;
            }
            nVar.h((java.util.Map.Entry) w0Var.f351365e.get(i17));
            i17++;
        }
        java.util.Iterator it = w0Var.c().iterator();
        while (it.hasNext()) {
            nVar.h((java.util.Map.Entry) it.next());
        }
    }
}
