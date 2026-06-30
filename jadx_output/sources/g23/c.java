package g23;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f267891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267892b;

    /* renamed from: c, reason: collision with root package name */
    public final int f267893c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267894d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267895e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f267896f;

    public c() {
        this.f267891a = "";
        this.f267892b = 0;
        this.f267893c = 0;
        this.f267894d = "";
        this.f267895e = "";
        this.f267896f = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("aiSearchWithYBInnerInput");
        java.lang.String optString = d17.optString("hotword");
        this.f267891a = optString;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSAISearchWithYBInnerInputConfig", "get hotword failed");
            return;
        }
        this.f267894d = d17.optString("extParams", "");
        this.f267895e = d17.optString("navBarParams", "");
        this.f267892b = d17.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f267893c = d17.optInt("businessType", 0);
        d17.optInt("timevalSec", 0);
        this.f267896f = true;
    }
}
