package dt;

/* loaded from: classes15.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.autogen.events.AddCardToWXEvent addCardToWXEvent = (com.tencent.mm.autogen.events.AddCardToWXEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.i iVar = addCardToWXEvent.f53969g;
        android.content.Context context = iVar.f6887c;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "add card to wx event, context is null");
            return false;
        }
        java.lang.String[] strArr = iVar.f6885a;
        java.lang.String str5 = null;
        if (strArr == null || strArr.length <= 0) {
            str = null;
            str2 = null;
        } else {
            str = strArr[0];
            str2 = kk.k.g(com.tencent.mm.pluginsdk.model.app.c.a(context, str, false)[0].toByteArray());
        }
        java.lang.String[] strArr2 = addCardToWXEvent.f53969g.f6886b;
        if (strArr2 == null || strArr2.length <= 1) {
            str3 = null;
            str4 = null;
        } else {
            str3 = strArr2[0];
            str4 = strArr2[1];
        }
        if (strArr2 != null && strArr2.length > 2) {
            str5 = strArr2[2];
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "carlist = %s, appid = %s, transcation = %s", str4, str3, str5);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("key_in_card_list", str4);
        intent.putExtra("key_package_name", str);
        intent.putExtra("key_sign", str2);
        intent.putExtra("key_from_scene", 8);
        intent.putExtra("key_command_id", 9);
        intent.putExtra("key_app_id", str3);
        intent.putExtra("key_transaction", str5);
        com.tencent.mm.plugin.base.stub.e0.t(intent, context);
        return true;
    }
}
