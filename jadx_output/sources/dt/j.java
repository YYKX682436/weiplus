package dt;

/* loaded from: classes15.dex */
public class j extends com.tencent.mm.sdk.event.n {
    public j() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        com.tencent.mm.autogen.events.ChooseCardFromWXEvent chooseCardFromWXEvent = (com.tencent.mm.autogen.events.ChooseCardFromWXEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.v2 v2Var = chooseCardFromWXEvent.f54057g;
        android.content.Context context = v2Var.f8166c;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "choose card from wx event, context is null");
            return false;
        }
        java.lang.String[] strArr = v2Var.f8164a;
        if (strArr == null || strArr.length <= 0) {
            str = null;
        } else {
            str = strArr[0];
            kk.k.g(com.tencent.mm.pluginsdk.model.app.c.a(context, str, false)[0].toByteArray());
        }
        java.lang.String[] strArr2 = chooseCardFromWXEvent.f54057g.f8165b;
        if (strArr2 == null || strArr2.length < 10) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "ChooseCardFromWXEvent selectionArgs is null or length is < 10, the length is " + (strArr2 != null ? strArr2.length : 0));
        } else {
            for (java.lang.String str2 : strArr2) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ChooseCardFromWXEvent selectionArgs:", strArr2.toString());
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
            intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
            intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, strArr2[0]);
            intent.putExtra("shop_id", com.tencent.mm.sdk.platformtools.t8.P(strArr2[1], 0));
            intent.putExtra("sign_type", strArr2[2]);
            intent.putExtra("card_sign", strArr2[3]);
            intent.putExtra("time_stamp", com.tencent.mm.sdk.platformtools.t8.P(strArr2[4], 0));
            intent.putExtra("nonce_str", strArr2[5]);
            intent.putExtra("card_tp_id", strArr2[6]);
            intent.putExtra("card_type", strArr2[7]);
            intent.putExtra("can_multi_select", com.tencent.mm.sdk.platformtools.t8.P(strArr2[8], 0));
            intent.putExtra("key_from_scene", 8);
            intent.putExtra("key_command_id", 16);
            intent.putExtra("key_app_id", strArr2[0]);
            intent.putExtra("key_package_name", str);
            intent.putExtra("key_transaction", strArr2[9]);
            com.tencent.mm.plugin.base.stub.e0.t(intent, context);
        }
        return true;
    }
}
