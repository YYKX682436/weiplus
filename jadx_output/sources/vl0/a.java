package vl0;

/* loaded from: classes13.dex */
public final class a implements gl0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at.e f437778a;

    public a(at.e eVar) {
        this.f437778a = eVar;
    }

    @Override // gl0.a
    public void a(fl0.b bVar, long j17, boolean z17, float f17) {
        at.e eVar = this.f437778a;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveHomeReddotPredict", "item null");
            if (eVar != null) {
                eVar.a("", 2, 0.0f);
                return;
            }
            return;
        }
        if (eVar != null) {
            java.lang.String c17 = ((pl0.e) bVar).c();
            kotlin.jvm.internal.o.f(c17, "getUid(...)");
            eVar.a(c17, z17 ? 1 : 0, f17);
        }
        if (nl0.c.f338161c == null) {
            nl0.c.b();
        }
        nl0.f fVar = nl0.c.f338161c;
        java.lang.String c18 = ((pl0.e) bVar).c();
        java.lang.String ret = java.lang.String.valueOf(z17 ? 1 : 0);
        fVar.getClass();
        kotlin.jvm.internal.o.g(ret, "ret");
        if (c18 == null) {
            return;
        }
        dm.l9 l9Var = new dm.l9();
        l9Var.field_score = f17;
        l9Var.field_uid = c18;
        l9Var.field_biz = "LiveHomeRedDot";
        l9Var.field_ret = ret;
        l9Var.field_save_time = java.lang.System.currentTimeMillis();
        fVar.insert(l9Var);
    }

    @Override // gl0.a
    public void b(fl0.b bVar) {
        at.e eVar;
        if (bVar == null || (eVar = this.f437778a) == null) {
            return;
        }
        java.lang.String c17 = ((pl0.e) bVar).c();
        kotlin.jvm.internal.o.f(c17, "getUid(...)");
        eVar.start(c17);
    }
}
