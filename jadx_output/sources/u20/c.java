package u20;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f423857a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.share.t f423858b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f423859c;

    public c(java.util.List list, com.tencent.mm.feature.ecs.share.t tVar) {
        this.f423857a = list;
        this.f423858b = tVar;
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f423859c = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a).plus(new kotlinx.coroutines.x0("EcsShareToContactLogic_WAAPPMsg")));
    }

    public final void a() {
        com.tencent.mm.feature.ecs.share.t tVar = this.f423858b;
        if (tVar != null) {
            t00.m2 m2Var = (t00.m2) tVar;
            c00.n3 n3Var = m2Var.f414319a;
            if (n3Var != null) {
                n3Var.onCancel();
            }
            m2Var.f414319a = null;
        }
        this.f423858b = null;
    }

    public final void b(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.w("EcsShareToContactLogic_Base", "onFail： ".concat(msg));
        com.tencent.mm.feature.ecs.share.t tVar = this.f423858b;
        if (tVar != null) {
            ((t00.m2) tVar).a(msg);
        }
        this.f423858b = null;
    }

    public void c(boolean z17) {
    }

    public final void d(boolean z17) {
        com.tencent.mm.feature.ecs.share.t tVar = this.f423858b;
        if (tVar != null) {
            t00.m2 m2Var = (t00.m2) tVar;
            com.tencent.mars.xlog.Log.i("ShareToContactsEcsActionHandler", "share to contact success");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isGroup", z17 ? "1" : "0");
            c00.n3 n3Var = m2Var.f414319a;
            if (n3Var != null) {
                n3Var.b(jSONObject);
            }
            m2Var.f414319a = null;
        }
        this.f423858b = null;
        c(z17);
    }
}
