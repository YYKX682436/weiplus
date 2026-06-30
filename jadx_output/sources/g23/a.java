package g23;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f267884a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267885b;

    /* renamed from: c, reason: collision with root package name */
    public final int f267886c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267887d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267888e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f267889f;

    public a() {
        this.f267884a = "";
        this.f267885b = 0;
        this.f267886c = 0;
        this.f267887d = "";
        this.f267888e = "";
        this.f267889f = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("aiSearch");
        java.lang.String optString = d17.optString("hotword");
        this.f267884a = optString;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSAISearchConfig", "get hotword failed");
            return;
        }
        this.f267887d = d17.optString("extParams", "");
        this.f267888e = d17.optString("navBarParams", "");
        this.f267885b = d17.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f267886c = d17.optInt("businessType", 0);
        this.f267889f = true;
    }
}
