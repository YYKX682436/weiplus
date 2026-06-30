package hr4;

/* loaded from: classes11.dex */
public final class n implements hr4.q {
    @Override // hr4.q
    public void a(boolean z17, kr4.e eVar) {
        java.lang.String str = eVar != null ? eVar.field_username : null;
        if (str == null || str.length() == 0) {
            return;
        }
        hr4.p pVar = hr4.p.f284263a;
        java.util.concurrent.ConcurrentHashMap c17 = pVar.c();
        kotlin.jvm.internal.o.d(eVar);
        if (c17.containsKey(eVar.field_username)) {
            hr4.q qVar = (hr4.q) pVar.c().get(eVar.field_username);
            if (qVar != null) {
                qVar.a(z17, eVar);
            }
            pVar.c().remove(eVar.field_username);
        }
        if (z17) {
            pVar.d(eVar);
        }
    }

    @Override // hr4.q
    public void b() {
        java.util.Iterator it = hr4.p.f284263a.c().entrySet().iterator();
        while (it.hasNext()) {
            hr4.q.c((hr4.q) ((java.util.Map.Entry) it.next()).getValue(), false, null, 2, null);
        }
        hr4.p.f284263a.c().clear();
    }
}
