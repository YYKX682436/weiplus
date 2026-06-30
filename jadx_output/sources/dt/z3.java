package dt;

/* loaded from: classes15.dex */
public class z3 extends com.tencent.mm.sdk.event.n {
    public z3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.autogen.events.HandleScanResultEvent handleScanResultEvent = (com.tencent.mm.autogen.events.HandleScanResultEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.fh fhVar = handleScanResultEvent.f54430g;
        android.content.Context context = fhVar.f6677c;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "context is null");
            return false;
        }
        java.lang.String[] strArr = fhVar.f6675a;
        java.lang.String str4 = null;
        if (strArr == null || strArr.length <= 0) {
            str = null;
            str2 = null;
        } else {
            str = strArr[0];
            str2 = kk.k.g(com.tencent.mm.pluginsdk.model.app.c.a(context, str, false)[0].toByteArray());
        }
        java.lang.String[] strArr2 = handleScanResultEvent.f54430g.f6676b;
        if (strArr2 == null || strArr2.length < 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "args is null");
            return false;
        }
        if (strArr2.length > 1) {
            str4 = strArr2[0];
            str3 = strArr2[1];
        } else {
            str3 = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "handleScanResult, appid = %s, scanResult = %s", str4, str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return false;
        }
        java.lang.String format = java.lang.String.format("weixin://dl/handleScanResult?appid=%s&result=%s", str4, str3);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.setData(android.net.Uri.parse(format));
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("key_command_id", 17);
        intent.putExtra("key_package_name", str);
        intent.putExtra("translate_link_scene", 1);
        intent.putExtra("key_package_signature", str2);
        com.tencent.mm.plugin.base.stub.e0.t(intent, context);
        return true;
    }
}
