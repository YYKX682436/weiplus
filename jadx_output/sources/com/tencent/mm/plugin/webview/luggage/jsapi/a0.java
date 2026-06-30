package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class a0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.b0 f182250e;

    public a0(com.tencent.mm.plugin.webview.luggage.jsapi.b0 b0Var, sd.b bVar) {
        this.f182250e = b0Var;
        this.f182249d = bVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f182250e.hashCode() & 65535)) {
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("key_pick_local_media_show_memory_warning", false) : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "request to open file chooser, result code = %d, hasShowMemoryWarning = %b", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(booleanExtra));
            java.util.HashMap hashMap = new java.util.HashMap();
            if (booleanExtra) {
                hashMap.put("memoryWarning", java.lang.Boolean.TRUE);
            }
            sd.b bVar = this.f182249d;
            if (i18 == -1) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_pick_local_pic_callback_local_ids") : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    bVar.b("fail", hashMap);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "localIds = %s", stringExtra);
                    hashMap.put("localIds", stringExtra);
                    java.lang.String stringExtra2 = intent.getStringExtra("key_pick_local_pic_source_type");
                    if (stringExtra2 != null) {
                        hashMap.put("sourceType", stringExtra2);
                    }
                    bVar.d(hashMap);
                }
            } else if (i18 != 0) {
                bVar.b("fail", hashMap);
            } else {
                bVar.b("cancel", hashMap);
            }
            ((com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d).mmSetOnActivityResultCallback(null);
        }
    }
}
