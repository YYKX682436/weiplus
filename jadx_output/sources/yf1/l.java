package yf1;

/* loaded from: classes7.dex */
public class l implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd1.i f461645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf1.o f461646b;

    public l(yf1.o oVar, pd1.i iVar) {
        this.f461646b = oVar;
        this.f461645a = iVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        pd1.i iVar = this.f461645a;
        yf1.o oVar = this.f461646b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, value: " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            wf.b bVar = oVar.f461651a;
            bVar.f445426s = ik1.w.c(jSONObject.optInt("x", bVar.f445426s));
            bVar.f445427t = ik1.w.c(jSONObject.optInt("y", bVar.f445427t));
            bVar.w();
            wf.b bVar2 = oVar.f461651a;
            iVar.a(bVar2.f445426s, bVar2.f445427t);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, parse " + str + " failed");
            wf.b bVar3 = oVar.f461651a;
            iVar.a(bVar3.f445426s, bVar3.f445427t);
        }
    }
}
