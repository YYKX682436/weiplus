package p81;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.launching.k6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k91.a3 f352719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p81.j f352720b;

    public g(k91.a3 a3Var, p81.j jVar) {
        this.f352719a = a3Var;
        this.f352720b = jVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void a(com.tencent.mm.plugin.appbrand.launching.o6 request, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(request, "request");
        k91.a3 a3Var = this.f352719a;
        if (a3Var != null) {
            p81.j jVar = this.f352720b;
            java.lang.String field_appId = jVar.f352723a.field_appId;
            kotlin.jvm.internal.o.f(field_appId, "field_appId");
            java.lang.String field_packageKey = jVar.f352723a.field_packageKey;
            kotlin.jvm.internal.o.f(field_packageKey, "field_packageKey");
            k91.u0 u0Var = (k91.u0) a3Var;
            k91.r0 Bi = u0Var.Bi(field_appId);
            java.util.Map map = Bi.f305757a;
            java.lang.Object obj = map.get(field_packageKey);
            if (obj == null) {
                obj = new k91.m0(false, 0.0f, null, 7, null);
                map.put(field_packageKey, obj);
            }
            k91.x0[] x0VarArr = k91.x0.f305815d;
            java.util.Map map2 = ((k91.m0) obj).f305674c;
            java.lang.Object obj2 = map2.get(1);
            if (obj2 == null) {
                obj2 = new k91.q0(false, 0L, 3, null);
                map2.put(1, obj2);
            }
            k91.q0 q0Var = (k91.q0) obj2;
            q0Var.f305729a = true;
            q0Var.f305730b = java.lang.System.currentTimeMillis();
            u0Var.Ri(field_appId, Bi);
        }
    }
}
