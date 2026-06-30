package s23;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.f f402302d = new s23.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.d2 d2Var;
        java.util.Set entrySet = s23.n.f402310e.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        do {
            d2Var = null;
            if (!it.hasNext()) {
                break;
            }
            s23.x xVar = (s23.x) ((java.util.Map.Entry) it.next()).getValue();
            if (xVar != null) {
                k33.b bVar = xVar.f402357u;
                r23.m mVar = bVar instanceof r23.m ? (r23.m) bVar : null;
                if (mVar != null) {
                    if (!mVar.isShowing()) {
                        mVar = null;
                    }
                    if (mVar != null) {
                        d2Var = mVar.f368840k;
                    }
                }
            }
        } while (d2Var == null);
        return d2Var;
    }
}
