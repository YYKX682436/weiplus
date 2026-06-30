package lw4;

/* loaded from: classes8.dex */
public class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw4.j f321657d;

    public i(lw4.j jVar) {
        this.f321657d = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int currPosMs;
        lw4.j jVar = this.f321657d;
        try {
            currPosMs = jVar.f321658a.getCurrPosMs();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiVideoCallback", "OnVideoTimeUpdate e=%s", e17);
        }
        if (java.lang.Math.abs(currPosMs - jVar.f321660c) < 250) {
            return true;
        }
        jVar.f321660c = currPosMs;
        org.json.JSONObject h17 = jVar.h();
        h17.put("currentTime", jVar.f321658a.getCurrPosSec());
        jVar.j(jVar.g(4, h17));
        return true;
    }
}
