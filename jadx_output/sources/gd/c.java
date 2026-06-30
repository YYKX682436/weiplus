package gd;

/* loaded from: classes9.dex */
public final class c implements com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.ScanWidgetLiteAppCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gd.a f270471a;

    public c(gd.a aVar) {
        this.f270471a = aVar;
    }

    @Override // com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.ScanWidgetLiteAppCallback
    public final void onScanCallback(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteAppBankCardOcrService", "get scan result and callback");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("cardNumber", intent.getStringExtra("cardNumber"));
        jSONObject.putOpt("scanResult", intent.getStringExtra("scanResult"));
        byte[] byteArrayExtra = intent.getByteArrayExtra("imageData");
        if (byteArrayExtra != null) {
            jSONObject.putOpt("cardImgData", android.util.Base64.encodeToString(byteArrayExtra, 2));
        }
        this.f270471a.onScan(jSONObject);
    }
}
