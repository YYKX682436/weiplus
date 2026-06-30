package is;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ is.p f294348d;

    public k(is.p pVar) {
        this.f294348d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f294348d.getClass();
        am5.c cVar = am5.c.f8820b;
        cVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = (java.util.HashMap) cVar.f8821a;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            am5.a aVar = (am5.a) hashMap.get((am5.b) it.next());
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        boolean z17 = false;
        while (it6.hasNext()) {
            am5.a aVar2 = (am5.a) it6.next();
            if (aVar2.a()) {
                if (aVar2.f8814a.equals("HEAVY_USER_CONTACT")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1987L, 10L, 1L);
                    ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347315l);
                } else if (aVar2.f8814a.equals("HEAVY_USER_SESSION")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1987L, 11L, 1L);
                    ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347314k);
                } else if (aVar2.f8814a.equals("HEAVY_USER_STORAGE")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1987L, 12L, 1L);
                    ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347316m);
                } else if (aVar2.f8814a.equals("HEAVY_USER_GAME")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1987L, 13L, 1L);
                    ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347317n);
                }
                z17 = true;
            }
        }
        if (!z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1987L, 2L, 1L);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1987L, 1L, 1L);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347313j);
    }
}
