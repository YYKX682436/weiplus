package gf;

/* loaded from: classes7.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.n2 f271131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(gf.n2 n2Var) {
        super(0);
        this.f271131d = n2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        x.b bVar;
        gf.n2 n2Var = this.f271131d;
        if (n2Var.f271145h && n2Var.f271147m && n2Var.f271148n) {
            k91.r rVar = n2Var.f271141d;
            synchronized (rVar.f305741h) {
                java.util.Map map = rVar.g() ? rVar.f305743m : rVar.f305742i;
                if (map == null) {
                    bVar = null;
                } else {
                    bVar = new x.b(map.size());
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        k91.j jVar = ((k91.f) entry.getValue()).f305578u;
                        if (jVar != null) {
                            bVar.put(str, jVar);
                        }
                    }
                }
            }
            if (bVar != null) {
                gf.n2 n2Var2 = this.f271131d;
                java.util.Iterator it = ((x.i) bVar.entrySet()).iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    k91.j jVar2 = (k91.j) entry2.getValue();
                    if (n2Var2.a(jVar2 != null ? jVar2.f305622a : null)) {
                        n2Var2.f271151q.a(str2, 1);
                        return java.lang.Boolean.TRUE;
                    }
                    n2Var2.f271151q.a(str2, 0);
                }
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
