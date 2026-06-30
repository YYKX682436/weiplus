package dt;

/* loaded from: classes15.dex */
public class h5 extends com.tencent.mm.sdk.event.n {
    public h5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        java.lang.String str4;
        boolean z18;
        com.tencent.mm.autogen.events.SDKOpenWebviewEvent sDKOpenWebviewEvent = (com.tencent.mm.autogen.events.SDKOpenWebviewEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.ls lsVar = sDKOpenWebviewEvent.f54722g;
        android.content.Context context = lsVar.f7270c;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "context is null");
            return false;
        }
        java.lang.String[] strArr = lsVar.f7268a;
        if (strArr == null || strArr.length <= 0) {
            str = null;
            str2 = null;
        } else {
            str = strArr[0];
            str2 = kk.k.g(com.tencent.mm.pluginsdk.model.app.c.a(context, str, false)[0].toByteArray());
        }
        am.ls lsVar2 = sDKOpenWebviewEvent.f54722g;
        java.lang.String[] strArr2 = lsVar2.f7269b;
        if (strArr2 == null || strArr2.length < 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "args is null");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent handle event, withType = %b", java.lang.Boolean.valueOf(lsVar2.f7271d));
        if (lsVar2.f7271d) {
            if (strArr2.length < 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent handle fail, selectionArgs length invalid");
                return false;
            }
            java.lang.String str5 = strArr2[0];
            java.lang.String str6 = strArr2[1];
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent, typeStr = %s, appid = %s", str6, str5);
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str6, 0);
            if (D1 == 1) {
                if (strArr2.length < 5) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent handle subscribe message, lenght = %d", java.lang.Integer.valueOf(strArr2.length));
                }
                java.lang.String str7 = strArr2[2];
                java.lang.String str8 = strArr2[3];
                java.lang.String str9 = strArr2[4];
                java.lang.String str10 = str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "openwebviewwithtype, appid = %s, type = %s, scene = %s, templateID = %s, reserved = %s", str5, java.lang.Integer.valueOf(D1), str7, str8, str9);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "openwebviewwithtype fail, appId is null");
                } else {
                    java.lang.String format = java.lang.String.format("weixin://dl/businessWebview/link?appid=%s&type=%d&query=%s", str5, java.lang.Integer.valueOf(D1), android.net.Uri.encode(java.lang.String.format("scene=%s&template_id=%s&reserved=%s", str7, str8, str9)));
                    com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "openwebviewwithtype url format = %s", format);
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
                    intent.setData(android.net.Uri.parse(format));
                    intent.addFlags(268435456);
                    intent.putExtra("key_package_name", str);
                    z18 = true;
                    intent.putExtra("translate_link_scene", 1);
                    intent.putExtra("key_package_signature", str10);
                    intent.putExtra("key_command_id", 12);
                    c01.l2 c17 = c01.n2.d().c("key_data_center_session_id", true);
                    c17.i("key_package_name", str);
                    c17.i("key_package_signature", str10);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "sava packagename and signature to data center, package ; %s, sig : %s", str, str10);
                    com.tencent.mm.plugin.base.stub.e0.t(intent, context);
                }
            } else if (D1 == 5) {
                if (strArr2.length < 5) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent handle subscribe message, lenght = %d", java.lang.Integer.valueOf(strArr2.length));
                }
                java.lang.String str11 = strArr2[2];
                com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "openwebviewwithtype, appid = %s, type = %s, miniProgramAppid = %s", str5, java.lang.Integer.valueOf(D1), str11);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "openwebviewwithtype fail, appId is null");
                } else {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str11)) {
                        java.lang.String format2 = java.lang.String.format("weixin://dl/businessWebview/link?appid=%s&type=%d&query=%s", str5, java.lang.Integer.valueOf(D1), android.net.Uri.encode(java.lang.String.format("miniProgramAppid=%s", str11)));
                        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "openwebviewwithtype url format = %s", format2);
                        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
                        intent2.setData(android.net.Uri.parse(format2));
                        intent2.addFlags(268435456);
                        intent2.putExtra("key_package_name", str);
                        intent2.putExtra("translate_link_scene", 1);
                        intent2.putExtra("key_package_signature", str2);
                        intent2.putExtra("key_command_id", 12);
                        c01.l2 c18 = c01.n2.d().c("key_data_center_session_id", true);
                        c18.i("key_package_name", str);
                        c18.i("key_package_signature", str2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "sava packagename and signature to data center, package ; %s, sig : %s", str, str2);
                        com.tencent.mm.plugin.base.stub.e0.t(intent2, context);
                        return true;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "openwebviewwithtype fail, miniProgramAppid is null");
                }
            } else {
                if (strArr2.length >= 3) {
                    java.lang.String format3 = java.lang.String.format("weixin://dl/businessWebview/link?appid=%s&type=%d&query=%s", str5, java.lang.Integer.valueOf(D1), strArr2[2]);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "default url format = %s", format3);
                    android.content.Intent intent3 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
                    intent3.setData(android.net.Uri.parse(format3));
                    intent3.addFlags(268435456);
                    intent3.putExtra("key_package_name", str);
                    intent3.putExtra("translate_link_scene", 1);
                    intent3.putExtra("key_package_signature", str2);
                    intent3.putExtra("key_command_id", 12);
                    c01.l2 c19 = c01.n2.d().c("key_data_center_session_id", true);
                    c19.i("key_package_name", str);
                    c19.i("key_package_signature", str2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "sava packagename and signature to data center, package ; %s, sig : %s", str, str2);
                    com.tencent.mm.plugin.base.stub.e0.t(intent3, context);
                    return true;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent fail, unknown type = %d", java.lang.Integer.valueOf(D1));
            }
            return false;
        }
        java.lang.String str12 = str2;
        if (strArr2.length > 1) {
            z17 = false;
            str4 = strArr2[0];
            str3 = strArr2[1];
        } else {
            z17 = false;
            str3 = null;
            str4 = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "open webview, appid = %s, url = %s", str4, str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return z17;
        }
        java.lang.String format4 = java.lang.String.format("weixin://dl/businessWebview/link?appid=%s&url=%s", str4, str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "url format = %s", format4);
        android.content.Intent intent4 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent4.setData(android.net.Uri.parse(format4));
        intent4.addFlags(268435456);
        intent4.putExtra("key_package_name", str);
        z18 = true;
        intent4.putExtra("translate_link_scene", 1);
        intent4.putExtra("key_package_signature", str12);
        intent4.putExtra("key_command_id", 12);
        c01.l2 c27 = c01.n2.d().c("key_data_center_session_id", true);
        c27.i("key_package_name", str);
        c27.i("key_package_signature", str12);
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "sava packagename and signature to data center, package ; %s, sig : %s", str, str12);
        com.tencent.mm.plugin.base.stub.e0.t(intent4, context);
        return z18;
    }
}
