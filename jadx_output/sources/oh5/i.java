package oh5;

/* loaded from: classes12.dex */
public final class i extends oh5.d {

    /* renamed from: d, reason: collision with root package name */
    public static final oh5.i f345498d = new oh5.i();

    /* renamed from: e, reason: collision with root package name */
    public static java.util.List f345499e = kz5.p0.f313996d;

    @Override // oh5.d
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        ((ku5.t0) ku5.t0.f312615d).q(new oh5.f(this, intent));
    }

    @Override // oh5.d
    public java.lang.String c() {
        return com.tencent.mm.ui.matrix.MatrixMemoryHookResultUI.class.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(boolean z17) {
        vp3.c cVar = (vp3.c) tp3.a.INSTANCE.a(vp3.c.class);
        if (cVar == null) {
            return false;
        }
        com.tencent.mm.vfs.r6 r6Var = vp3.c.f438971t;
        java.lang.String o17 = r6Var.o();
        com.tencent.mm.vfs.r6 r6Var2 = vp3.c.f438972u;
        cVar.u(o17, r6Var2.o());
        sp3.d.d(vp3.c.f438969r, r6Var);
        java.lang.String e17 = sp3.d.e(r6Var2.o());
        if (e17 == null) {
            return false;
        }
        kz5.p0<oh5.p> p0Var = kz5.p0.f313996d;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArray = new org.json.JSONObject(e17).getJSONArray("SoNativeSize");
            kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
            c75.c.d(jSONArray, new oh5.h(arrayList));
            p0Var = arrayList;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.MatrixMemoryHookResultHelper", th6, "", new java.lang.Object[0]);
        }
        f345499e = p0Var;
        for (oh5.p pVar : p0Var) {
            if (z17) {
                java.util.Map map = oh5.j.f345500a;
                java.lang.String str = pVar.f345516a;
                java.lang.Long valueOf = java.lang.Long.valueOf(pVar.f345517b + oh5.j.f345502c);
                com.tencent.mars.xlog.Log.i("MicroMsg.MatrixMemoryHookResultHelper", "step up the threshold of " + pVar.f345516a + " to " + valueOf.longValue());
                map.put(str, valueOf);
            }
        }
        return !p0Var.isEmpty();
    }
}
