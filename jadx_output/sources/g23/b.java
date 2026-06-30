package g23;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f267890a;

    public b() {
        this.f267890a = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("aiSearchInnerInput");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17.optString("hotword"))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSAISearchInnerInputConfig", "get hotword failed");
            return;
        }
        d17.optString("extParams", "");
        d17.optString("navBarParams", "");
        d17.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        d17.optInt("businessType", 0);
        this.f267890a = true;
    }
}
