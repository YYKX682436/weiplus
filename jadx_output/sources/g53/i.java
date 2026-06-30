package g53;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f268915d;

    /* renamed from: a, reason: collision with root package name */
    public static final g53.i f268912a = new g53.i();

    /* renamed from: b, reason: collision with root package name */
    public static final g53.h f268913b = new g53.h();

    /* renamed from: c, reason: collision with root package name */
    public static final g53.g f268914c = new g53.g();

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f268916e = 4;

    public static final void a(g53.i iVar) {
        iVar.getClass();
        int b17 = b();
        boolean z17 = b17 != 4;
        com.tencent.mm.autogen.events.GameWeakNetEvent gameWeakNetEvent = new com.tencent.mm.autogen.events.GameWeakNetEvent();
        gameWeakNetEvent.f54373g.getClass();
        gameWeakNetEvent.e();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isUnderWeakNet", z17);
            jSONObject.put("weakNetDetailFlags", b17);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "onNetworkChange");
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
            ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
            com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, tw4.a.class, null);
        } catch (org.json.JSONException unused) {
        }
    }

    public static final int b() {
        int i17 = f268915d ? 2 : 4;
        if (kz5.z.G(new java.lang.Integer[]{4, 6}, java.lang.Integer.valueOf(f268916e))) {
            return i17;
        }
        return 1;
    }
}
