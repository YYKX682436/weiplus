package jr0;

/* loaded from: classes12.dex */
public class h implements jr0.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f301332a = new java.util.concurrent.ConcurrentHashMap();

    public boolean a(ri.d0 d0Var) {
        if (!d0Var.f395863e.b().equals("Trace")) {
            return false;
        }
        org.json.JSONObject jSONObject = d0Var.f395862d;
        java.lang.String str = d0Var.f395860b;
        if (str.equalsIgnoreCase("Trace_EvilMethod")) {
            if (!jSONObject.getString("detail").equalsIgnoreCase("NORMAL") || com.tencent.mm.sdk.platformtools.o4.L().i("clicfg_normal_report", false)) {
                return false;
            }
            com.tencent.mm.matrix.o.k();
        } else if (str.equalsIgnoreCase("Trace_FPS")) {
            java.lang.String string = jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f301332a;
            jr0.g gVar = (jr0.g) concurrentHashMap.get(string);
            if (gVar == null) {
                gVar = new jr0.g(null);
                concurrentHashMap.put(string, gVar);
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - gVar.f301331b;
            int i17 = gVar.f301330a + 1;
            gVar.f301330a = i17;
            if (i17 <= 12 || uptimeMillis > 2400000) {
                return false;
            }
            concurrentHashMap.put(string, new jr0.g(null));
        } else if (!str.equalsIgnoreCase("Trace_StartUp") || j62.e.g().l("clicfg_matrix_startup_report", false, true, true)) {
            return false;
        }
        return true;
    }
}
