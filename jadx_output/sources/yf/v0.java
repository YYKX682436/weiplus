package yf;

/* loaded from: classes7.dex */
public class v0 implements com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461466b;

    public v0(yf.i0 i0Var) {
        this.f461466b = i0Var;
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener
    public void onAudioVolumeEvaluationNotify(int i17) {
        yf.i0 i0Var = this.f461466b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f461364n;
            int i18 = i0Var.f252497d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.j jVar = new bg1.j(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("volume", i17);
                qVar.a(jVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherAudioVolume fail", e17);
            }
        }
    }
}
