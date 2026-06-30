package f40;

/* loaded from: classes12.dex */
public final class q implements w65.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f259446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e40.y f259447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f259448f;

    public q(java.util.Map map, e40.y yVar, yz5.p pVar) {
        this.f259446d = map;
        this.f259447e = yVar;
        this.f259448f = pVar;
    }

    @Override // w65.o
    public void P2(w65.p event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = this.f259447e.f247628a;
        java.util.Map map = this.f259446d;
        e40.b0 b0Var = (e40.b0) map.get(str);
        if (b0Var != null) {
            e40.a0 a17 = e40.a0.f247602e.a(event);
            if (a17 == null) {
                a17 = b0Var.f247612a;
            }
            kotlin.jvm.internal.o.g(a17, "<set-?>");
            b0Var.f247612a = a17;
            b0Var.f247613b = java.lang.Float.valueOf(event.f443365d);
        }
        yz5.p pVar = this.f259448f;
        if (pVar != null) {
            pVar.invoke(map, java.lang.Boolean.FALSE);
        }
    }
}
