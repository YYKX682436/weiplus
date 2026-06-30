package m8;

/* loaded from: classes15.dex */
public class j extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m8.k f324572a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m8.k kVar, android.os.Looper looper) {
        super(looper);
        this.f324572a = kVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        m8.k kVar = this.f324572a;
        kVar.getClass();
        int i17 = message.what;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = kVar.f324577e;
        switch (i17) {
            case 0:
                kVar.f324585m--;
                return;
            case 1:
                kVar.f324583k = message.arg1;
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((m8.z) it.next()).y(kVar.f324581i, kVar.f324583k);
                }
                return;
            case 2:
                kVar.f324586n = message.arg1 != 0;
                java.util.Iterator it6 = copyOnWriteArraySet.iterator();
                while (it6.hasNext()) {
                    ((m8.z) it6.next()).b(kVar.f324586n);
                }
                return;
            case 3:
                if (kVar.f324585m == 0) {
                    q9.p pVar = (q9.p) message.obj;
                    kVar.f324580h = true;
                    kVar.f324589q = pVar.f360870a;
                    kVar.f324590r = pVar.f360871b;
                    q9.k kVar2 = (q9.k) kVar.f324573a;
                    kVar2.getClass();
                    kVar2.f360866c = (q9.j) pVar.f360872c;
                    java.util.Iterator it7 = copyOnWriteArraySet.iterator();
                    while (it7.hasNext()) {
                        ((m8.z) it7.next()).e(kVar.f324589q, kVar.f324590r);
                    }
                    return;
                }
                return;
            case 4:
                int i18 = kVar.f324584l - 1;
                kVar.f324584l = i18;
                if (i18 == 0) {
                    kVar.f324592t = (m8.m) message.obj;
                    if (kVar.f324587o.j()) {
                        kVar.f324593u = 0;
                        kVar.f324594v = 0L;
                    }
                    if (message.arg1 != 0) {
                        java.util.Iterator it8 = copyOnWriteArraySet.iterator();
                        while (it8.hasNext()) {
                            ((m8.z) it8.next()).A();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (kVar.f324584l == 0) {
                    kVar.f324592t = (m8.m) message.obj;
                    java.util.Iterator it9 = copyOnWriteArraySet.iterator();
                    while (it9.hasNext()) {
                        ((m8.z) it9.next()).A();
                    }
                    return;
                }
                return;
            case 6:
                m8.o oVar = (m8.o) message.obj;
                int i19 = kVar.f324584l - oVar.f324642d;
                kVar.f324584l = i19;
                if (kVar.f324585m == 0) {
                    m8.m0 m0Var = oVar.f324639a;
                    kVar.f324587o = m0Var;
                    kVar.f324588p = oVar.f324640b;
                    kVar.f324592t = oVar.f324641c;
                    if (i19 == 0 && m0Var.j()) {
                        kVar.f324593u = 0;
                        kVar.f324594v = 0L;
                    }
                    java.util.Iterator it10 = copyOnWriteArraySet.iterator();
                    while (it10.hasNext()) {
                        ((m8.z) it10.next()).t(kVar.f324587o, kVar.f324588p);
                    }
                    return;
                }
                return;
            case 7:
                m8.y yVar = (m8.y) message.obj;
                if (kVar.f324591s.equals(yVar)) {
                    return;
                }
                kVar.f324591s = yVar;
                java.util.Iterator it11 = copyOnWriteArraySet.iterator();
                while (it11.hasNext()) {
                    ((m8.z) it11.next()).u(yVar);
                }
                return;
            case 8:
                m8.e eVar = (m8.e) message.obj;
                java.util.Iterator it12 = copyOnWriteArraySet.iterator();
                while (it12.hasNext()) {
                    ((m8.z) it12.next()).d(eVar);
                }
                return;
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}
