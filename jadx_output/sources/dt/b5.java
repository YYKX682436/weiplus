package dt;

/* loaded from: classes15.dex */
public class b5 extends com.tencent.mm.sdk.event.n {
    public b5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.autogen.events.SDKOpenBusiLuckyMoneyEvent sDKOpenBusiLuckyMoneyEvent = (com.tencent.mm.autogen.events.SDKOpenBusiLuckyMoneyEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.js jsVar = sDKOpenBusiLuckyMoneyEvent.f54720g;
        android.content.Context context = jsVar.f7079c;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "add card to wx event, context is null");
        } else {
            java.lang.String[] strArr = jsVar.f7077a;
            if (strArr == null || strArr.length <= 0) {
                str = null;
                str2 = null;
            } else {
                str = strArr[0];
                str2 = kk.k.g(com.tencent.mm.pluginsdk.model.app.c.a(context, str, false)[0].toByteArray());
            }
            java.lang.String[] strArr2 = sDKOpenBusiLuckyMoneyEvent.f54720g.f7078b;
            if (strArr2 != null && strArr2.length >= 6) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
                intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
                intent.putExtra("key_way", 4);
                intent.putExtra("appId", strArr2[0]);
                intent.putExtra("timeStamp", strArr2[1]);
                intent.putExtra("nonceStr", strArr2[2]);
                intent.putExtra("packageExt", strArr2[5]);
                intent.putExtra("signtype", strArr2[3]);
                intent.putExtra("paySignature", strArr2[4]);
                intent.putExtra("key_wxapi_package_name", str);
                intent.putExtra("key_wxapi_sign", str2);
                intent.putExtra("key_command_id", 13);
                com.tencent.mm.plugin.base.stub.e0.t(intent, context);
            }
        }
        return false;
    }
}
