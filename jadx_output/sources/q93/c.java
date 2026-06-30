package q93;

/* loaded from: classes8.dex */
public class c extends mu4.f {

    /* renamed from: g, reason: collision with root package name */
    public final long f360911g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f360912h;

    public c(q93.d dVar, nw4.n nVar, q93.d dVar2) {
        super(nVar);
        this.f360911g = 0L;
        this.f360911g = dVar2.f360914b;
        this.f360912h = new java.lang.ref.WeakReference(dVar2);
    }

    @Override // mu4.f, com.tencent.mm.plugin.webview.stub.z0
    public void b(android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("result_data", bundle);
        com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(this.f360911g, intent);
    }

    @Override // mu4.f, com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = this.f360912h;
        if (i17 != 121003) {
            if (i17 != 1000000 || weakReference.get() == null) {
                return true;
            }
            q93.d dVar = (q93.d) weakReference.get();
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("LiteAppJsApiBridgeWebViewHandler", "onDestroy WebStubService");
            dVar.f360913a = null;
            return true;
        }
        long j17 = ((q93.d) weakReference.get()).f360914b;
        long j18 = ((q93.d) weakReference.get()).f360915c;
        int i18 = bundle != null ? bundle.getInt("key_image_pos", -1) : -1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ya.b.INDEX, i18);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("LiteAppJsApiBridgeWebViewHandler", "json exception: " + e17);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(j17, j18, "onImagePreviewChanged", jSONObject);
        return true;
    }

    @Override // mu4.f, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        return "liteapp://";
    }
}
