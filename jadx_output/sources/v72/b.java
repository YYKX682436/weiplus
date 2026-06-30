package v72;

/* loaded from: classes12.dex */
public class b implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v72.i f433644d;

    public b(v72.i iVar) {
        this.f433644d = iVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var == null) {
            return;
        }
        int i17 = w0Var.f316974b;
        java.lang.Object obj = w0Var.f316976d;
        if (obj == null) {
            return;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        if (longValue < 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "EventData: %s", w0Var);
        v72.i iVar = this.f433644d;
        if (i17 == 2 || i17 == 3) {
            ((com.tencent.mm.plugin.fts.t) iVar.f433664e).b(65576, new v72.f(iVar, longValue, null));
        } else {
            if (i17 != 5) {
                return;
            }
            ((com.tencent.mm.plugin.fts.t) iVar.f433664e).b(65576, new v72.d(iVar, longValue));
        }
    }
}
