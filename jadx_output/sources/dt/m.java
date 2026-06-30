package dt;

/* loaded from: classes15.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i17;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.p3 p3Var = ((com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent) iEvent).f54077g;
        android.content.Context context = p3Var.f7601d;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "CreateOrJoinChatroomEvent, context is null");
            return false;
        }
        java.lang.String[] strArr = p3Var.f7600c;
        if (strArr == null || strArr.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "CreateOrJoinChatroomEvent, invalid args");
            return false;
        }
        java.lang.String[] strArr2 = p3Var.f7599b;
        str = "";
        java.lang.String str6 = (strArr2 == null || strArr2.length <= 0) ? "" : strArr2[0];
        java.lang.String str7 = strArr[0];
        java.lang.String str8 = strArr[1];
        java.lang.String str9 = strArr[2];
        int i18 = p3Var.f7598a;
        if (i18 == 1) {
            java.lang.String str10 = strArr.length >= 4 ? strArr[3] : "";
            str2 = strArr.length >= 5 ? strArr[4] : "";
            str3 = strArr.length >= 6 ? strArr[5] : "";
            str = strArr.length >= 7 ? strArr[6] : "";
            str5 = "action_create";
            i17 = 14;
            java.lang.String str11 = str;
            str = str10;
            str4 = str11;
        } else {
            if (i18 != 2) {
                return false;
            }
            str2 = strArr.length >= 4 ? strArr[3] : "";
            str3 = strArr.length >= 5 ? strArr[4] : "";
            str4 = strArr.length >= 6 ? strArr[5] : "";
            str5 = "action_join";
            i17 = 15;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("key_app_id", str7);
        intent.putExtra("key_transaction", str8);
        intent.putExtra("key_command_id", i17);
        intent.putExtra("action", str5);
        intent.putExtra("package_name", str6);
        intent.putExtra(ya.b.GROUP_ID, str9);
        intent.putExtra("chatroom_name", str);
        intent.putExtra("chatroom_nickname", str2);
        intent.putExtra("ext_msg", str3);
        intent.putExtra("open_id", str4);
        com.tencent.mm.plugin.base.stub.e0.t(intent, context);
        return true;
    }
}
