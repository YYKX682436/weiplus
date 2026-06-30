package yf;

/* loaded from: classes7.dex */
public class u0 implements com.tencent.rtmp.TXLivePusher.OnBGMNotify {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461464b;

    public u0(yf.i0 i0Var) {
        this.f461464b = i0Var;
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMComplete(int i17) {
        yf.i0 i0Var = this.f461464b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f461364n;
            int i18 = i0Var.f252497d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.k kVar = new bg1.k(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("errCode", i17);
                qVar.a(kVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMComplete fail", e17);
            }
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMProgress(long j17, long j18) {
        yf.i0 i0Var = this.f461464b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f461364n;
            int i17 = i0Var.f252497d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.l lVar = new bg1.l(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i17);
                jSONObject.put("progress", j17);
                jSONObject.put("duration", j18);
                qVar.a(lVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMProgress fail", e17);
            }
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMStart() {
        yf.i0 i0Var = this.f461464b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f461364n;
            int i17 = i0Var.f252497d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.m mVar = new bg1.m(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i17);
                qVar.a(mVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMStart fail", e17);
            }
        }
    }
}
