package dt;

/* loaded from: classes15.dex */
public class e5 extends com.tencent.mm.sdk.event.n {
    public e5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.autogen.events.SDKOpenOfflinePayEvent sDKOpenOfflinePayEvent = (com.tencent.mm.autogen.events.SDKOpenOfflinePayEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        java.lang.String[] strArr = sDKOpenOfflinePayEvent.f54721g.f7180b;
        if (strArr == null || strArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "args is null");
        } else if (strArr.length < 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "args must contain appid");
        } else if (gm0.j1.a()) {
            am.ks ksVar = sDKOpenOfflinePayEvent.f54721g;
            android.content.Context context = ksVar.f7181c;
            java.lang.String str3 = strArr[0];
            java.lang.String[] strArr2 = ksVar.f7179a;
            if (strArr2 == null || strArr2.length <= 0) {
                str = null;
                str2 = null;
            } else {
                str = strArr2[0];
                str2 = kk.k.g(com.tencent.mm.pluginsdk.model.app.c.a(context, str, false)[0].toByteArray());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "sdk open offlinePay, appid = %s, package = %s", str3, str);
            java.lang.String format = java.lang.String.format("weixin://dl/offlinepay/?appid=%s", str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "url format = %s", format);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
            intent.setData(android.net.Uri.parse(format));
            intent.addFlags(268435456);
            intent.putExtra("key_app_id", str3);
            intent.putExtra("key_package_name", str);
            intent.putExtra("translate_link_scene", 1);
            intent.putExtra("key_package_signature", str2);
            intent.putExtra("key_command_id", 24);
            c01.l2 c17 = c01.n2.d().c("key_data_center_session_id", true);
            c17.i("key_package_name", str);
            c17.i("key_package_signature", str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "sava packagename and signature to data center, package ; %s, sig : %s", str, str2);
            com.tencent.mm.plugin.base.stub.e0.t(intent, context);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "has not login, sdk open offlinePay fail");
        }
        return true;
    }
}
