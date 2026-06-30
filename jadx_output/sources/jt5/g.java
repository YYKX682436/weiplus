package jt5;

/* loaded from: classes13.dex */
public class g implements jt5.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f301671a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.regex.Pattern f301672b = java.util.regex.Pattern.compile("^/system/xbin/ku\\.sud$|^daemonsu:|^k_worker/[1-9]\\d*:[1-9]\\d*$|^kr_worker/[1-9]\\d*:[1-9]\\d*$|^km_worker/[1-9]\\d*:[1-9]\\d*$|^tworker/[1-9]\\d*:[1-9]\\d*$|^tu_worker/[1-9]\\d*:[1-9]\\d*$|^tq_worker/[1-9]\\d*:[1-9]\\d*$|^kworker/[1-9]\\d{2}$|^permmgrd$|^360sguard$|^/data/data/[\\w\\-\\.]+/");

    @Override // jt5.b
    public void a(kt5.d dVar) {
        if (dVar.f312054c == 0 && dVar.f312053b == 1) {
            ((java.util.ArrayList) this.f301671a).add(dVar);
        }
    }

    @Override // jt5.b
    public boolean b() {
        java.util.Iterator it = ((java.util.ArrayList) this.f301671a).iterator();
        while (it.hasNext()) {
            kt5.d dVar = (kt5.d) it.next();
            ot5.g.c("RiskScanner", "SingleProcessAnalyzer : " + dVar.toString());
            java.lang.String str = dVar.f312055d;
            if (str != null && this.f301672b.matcher(str).find()) {
                ot5.g.b("SingleProcessAnalyzer match : " + dVar.toString());
                return true;
            }
        }
        return false;
    }
}
