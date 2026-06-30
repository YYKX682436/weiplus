package ea1;

/* loaded from: classes12.dex */
public class b implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea1.g f250508d;

    public b(ea1.g gVar) {
        this.f250508d = gVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp storage change: event=%s | eventData=%s", str, w0Var);
        int i17 = w0Var.f316974b;
        ea1.g gVar = this.f250508d;
        if (i17 == 2 || i17 == 3) {
            if (!"batch".equals(str)) {
                ((com.tencent.mm.plugin.fts.t) gVar.f250517e).b(65616, new ea1.d(gVar, w0Var.f316976d.toString()));
                return;
            }
            java.lang.Object obj = w0Var.f316976d;
            if (obj == null || !(obj instanceof java.util.List)) {
                return;
            }
            for (java.lang.String str2 : (java.util.List) obj) {
                ((com.tencent.mm.plugin.fts.t) gVar.f250517e).b(65616, new ea1.d(gVar, str2));
            }
            return;
        }
        if (i17 != 5) {
            return;
        }
        if (!"batch".equals(str)) {
            ((com.tencent.mm.plugin.fts.t) gVar.f250517e).b(65616, new ea1.c(gVar, w0Var.f316976d.toString()));
            return;
        }
        java.lang.Object obj2 = w0Var.f316976d;
        if (obj2 == null || !(obj2 instanceof java.util.List)) {
            return;
        }
        for (java.lang.String str3 : (java.util.List) obj2) {
            ((com.tencent.mm.plugin.fts.t) gVar.f250517e).b(65616, new ea1.c(gVar, str3));
        }
    }
}
