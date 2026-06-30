package jt5;

/* loaded from: classes13.dex */
public class c implements jt5.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f301668a = new java.util.ArrayList();

    @Override // jt5.b
    public void a(kt5.d dVar) {
        if (dVar.f312054c != 0) {
            return;
        }
        java.lang.String str = dVar.f312056e;
        if (android.text.TextUtils.isEmpty(str) || !"u:r:zygote:s0".equals(str)) {
            return;
        }
        java.lang.String str2 = dVar.f312055d;
        if (android.text.TextUtils.isEmpty(str2) || "zygote".equals(str2) || "zygote64".equals(str2)) {
            return;
        }
        ot5.g.b("JavaProcessAnalyzer match : " + dVar.toString());
        ((java.util.ArrayList) this.f301668a).add(dVar);
    }

    @Override // jt5.b
    public boolean b() {
        return ((java.util.ArrayList) this.f301668a).size() > 0;
    }
}
