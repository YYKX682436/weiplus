package g23;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f267897a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f267898b;

    public d() {
        this.f267897a = "";
        this.f267898b = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("searchAdWithYBInnerInput");
        java.lang.String optString = d17.optString("adTitle");
        this.f267897a = optString;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSAskYuanbaoConfig", "get adTitle failed");
        } else {
            d17.optInt("timevalSec", 0);
            this.f267898b = true;
        }
    }
}
