package dd1;

/* loaded from: classes7.dex */
public class c implements dd1.b {
    public void a(android.content.Context context, org.json.JSONObject data, dd1.a callback) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean b17 = fd1.d.b();
        boolean a17 = fd1.d.a();
        boolean c17 = fd1.d.c();
        android.content.ComponentName componentName = new android.content.ComponentName(context, com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService.class.getCanonicalName());
        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(android.nfc.NfcAdapter.getDefaultAdapter(context));
        com.tencent.mars.xlog.Log.i("HceStateService", "component name: " + componentName);
        if (cardEmulation.isDefaultServiceForCategory(componentName, "payment")) {
            com.tencent.mars.xlog.Log.i("HceStateService", "now is NFC Default Application");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("HceStateService", "not NFC Default Application, isAutoSet: %b");
            z17 = false;
        }
        java.lang.String str = true & true ? "ok" : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", (java.lang.Object) 0);
        jSONObject.put("errMsg", str);
        jSONObject.put("isNFCSupported", b17);
        jSONObject.put("isHCESupported", a17);
        jSONObject.put("isNFCOpened", c17);
        jSONObject.put("isDefaultWalletApp", z17);
        callback.b(jSONObject);
    }
}
