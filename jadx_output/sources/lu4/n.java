package lu4;

/* loaded from: classes7.dex */
public final class n implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lu4.q f321444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321445b;

    public n(lu4.q qVar, java.lang.String str) {
        this.f321444a = qVar;
        this.f321445b = str;
    }

    @Override // nw4.e
    public final void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        kotlin.jvm.internal.o.d(str2);
        hashMap.put("err_msg", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        java.lang.String a17 = nw4.x2.a(str, hashMap, false, "");
        lu4.q qVar = this.f321444a;
        com.tencent.mars.xlog.Log.i(qVar.f321431c, "invoke callback: " + str2 + ", " + this.f321445b + ", " + a17);
        lu4.c cVar = (lu4.c) qVar.f321430b;
        java.lang.String str3 = this.f321445b;
        java.lang.String gVar = new cl0.g(a17).a("__params").toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        lu4.c.u(cVar, str3, gVar, null, 4, null);
    }
}
