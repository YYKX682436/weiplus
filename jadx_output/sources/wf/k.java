package wf;

/* loaded from: classes7.dex */
public class k implements com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f445472a;

    public k(wf.b bVar) {
        this.f445472a = bVar;
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener
    public void onAudioVolumeEvaluationNotify(int i17) {
        wf.b bVar = this.f445472a;
        xf.b bVar2 = bVar.f445420n;
        if (bVar2 != null) {
            int i18 = bVar.f252497d;
            yf1.k kVar = (yf1.k) bVar2;
            kVar.getClass();
            yf1.g gVar = new yf1.g(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("volume", i17);
                kVar.a(gVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerAudioVolume fail", e17);
            }
        }
    }
}
