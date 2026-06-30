package fv0;

/* loaded from: classes5.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final fv0.d a(int i17) {
        java.lang.Object obj;
        java.util.Iterator<E> it = fv0.d.f266967s.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((fv0.d) obj).f266968d == i17) {
                break;
            }
        }
        fv0.d dVar = (fv0.d) obj;
        return dVar == null ? fv0.d.f266957f : dVar;
    }
}
