package jt5;

/* loaded from: classes13.dex */
public class d implements jt5.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f301669a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f301670b = new java.util.ArrayList();

    @Override // jt5.b
    public void a(kt5.d dVar) {
        if (dVar.f312054c != 0) {
            return;
        }
        int i17 = dVar.f312053b;
        java.lang.String str = dVar.f312055d;
        if (i17 == 1 && !"/sbin/adbd".equals(str)) {
            ot5.g.c("RiskScanner", "ProcessRelationAnalyzer parent : " + dVar.toString());
            this.f301669a.add(java.lang.Integer.valueOf(dVar.f312052a));
            return;
        }
        if (i17 > 1 && "sh".equals(str) && "/system/bin/sh".equals(str)) {
            ot5.g.c("RiskScanner", "ProcessRelationAnalyzer child : " + dVar.toString());
            ((java.util.ArrayList) this.f301670b).add(dVar);
        }
    }

    @Override // jt5.b
    public boolean b() {
        java.util.Iterator it = ((java.util.ArrayList) this.f301670b).iterator();
        while (it.hasNext()) {
            kt5.d dVar = (kt5.d) it.next();
            if (this.f301669a.contains(java.lang.Integer.valueOf(dVar.f312053b))) {
                ot5.g.b("ProcessRelationAnalyzer match : " + dVar.toString());
                return true;
            }
        }
        return false;
    }
}
