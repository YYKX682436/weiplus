package xu5;

/* loaded from: classes12.dex */
public class d implements xu5.s, xu5.u {
    public d(xu5.c cVar) {
    }

    public void a(xu5.b bVar, xu5.v vVar) {
        vVar.f457343z = null;
        xu5.t tVar = bVar.f457303b;
        if (tVar.f457335e.get()) {
            return;
        }
        synchronized (tVar) {
            xu5.v vVar2 = (xu5.v) tVar.f457339i.pollFirst();
            while (vVar2 != null && vVar2.isCancelled()) {
                vVar2 = (xu5.v) tVar.f457339i.pollFirst();
            }
            if (vVar2 == null) {
                tVar.f457337g = false;
                tVar.e();
            } else {
                xu5.s sVar = tVar.f457336f;
                java.util.Objects.requireNonNull(sVar);
                vVar2.f457343z = (xu5.d) sVar;
                ((vu5.b) vVar2.f449857r).c(vVar2);
            }
        }
    }
}
