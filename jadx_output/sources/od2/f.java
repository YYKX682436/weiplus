package od2;

/* loaded from: classes12.dex */
public class f implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od2.k f344611d;

    public f(od2.k kVar) {
        this.f344611d = kVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "FinderFollow storage change: event=%s | eventData=%s", str, w0Var);
        int i17 = w0Var.f316974b;
        if ((i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) && (obj = w0Var.f316976d) != null && (obj instanceof java.lang.String) && "FinderContact".equals(str)) {
            od2.k kVar = this.f344611d;
            p13.c cVar = kVar.f344622g;
            if (cVar != null) {
                ((com.tencent.mm.plugin.fts.t) kVar.f344620e).a().a(cVar);
            }
            java.lang.String username = w0Var.f316976d.toString();
            c61.l7 l7Var = (c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class));
            l7Var.getClass();
            kotlin.jvm.internal.o.g(username, "username");
            ya2.b2 y07 = l7Var.Jj().y0(username);
            if (y07 != null) {
                if (y07.field_follow_Flag == ya2.b2.Q2) {
                    od2.h hVar = new od2.h(kVar, w0Var.f316976d.toString());
                    kVar.f344622g = hVar;
                    ((com.tencent.mm.plugin.fts.t) kVar.f344620e).b(65646, hVar);
                    return;
                }
            }
            od2.g gVar = new od2.g(kVar, w0Var.f316976d.toString());
            kVar.f344622g = gVar;
            ((com.tencent.mm.plugin.fts.t) kVar.f344620e).b(65646, gVar);
        }
    }
}
