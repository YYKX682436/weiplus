package ml4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ml4.b f328407a = new ml4.b();

    /* renamed from: b, reason: collision with root package name */
    public static org.json.JSONObject f328408b = new org.json.JSONObject();

    public final void a() {
        java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.ting.RepairerConfigTingPlayerParams());
        if (f17 == null || r26.n0.N(f17)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayerConfig", "updateConfig config " + f17);
        try {
            f328408b = new org.json.JSONObject(f17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingPlayerConfig", "updateConfig ex " + e17.getMessage());
        }
    }
}
