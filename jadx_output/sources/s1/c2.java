package s1;

/* loaded from: classes14.dex */
public final class c2 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f401998a;

    public c2(n0.e5 e5Var) {
        this.f401998a = e5Var;
    }

    @Override // n0.a2
    public void dispose() {
        s1.q0 a17 = ((s1.k2) this.f401998a.getValue()).a();
        u1.w wVar = a17.f402061a;
        wVar.f423693q = true;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) a17.f402065e;
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            n0.f1 f1Var = ((s1.k0) it.next()).f402021c;
            if (f1Var != null) {
                f1Var.dispose();
            }
        }
        wVar.E();
        wVar.f423693q = false;
        linkedHashMap.clear();
        ((java.util.LinkedHashMap) a17.f402066f).clear();
        a17.f402071k = 0;
        a17.f402070j = 0;
        ((java.util.LinkedHashMap) a17.f402068h).clear();
        a17.b();
    }
}
