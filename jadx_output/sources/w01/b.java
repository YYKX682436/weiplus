package w01;

/* loaded from: classes9.dex */
public abstract class b {
    public static void a(android.app.Activity activity, com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req, android.os.Bundle bundle, java.lang.String str) {
        int i17 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.transmit.SelectConversationUI.class);
        int i18 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        intent.putExtra("Select_Conv_NextStep", new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.class).putExtras(bundle).putExtra("SendAppMessageWrapper_Scene", req.scene));
        intent.putExtra("Select_App_Id", str);
        intent.putExtra("Select_Open_Id", req.openId);
        intent.putExtra("Select_Conv_Type", 3);
        if (req.message.getType() == 36 || req.message.getType() == 46) {
            intent.putExtra("mutil_select_is_ret", !((com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) req.message.mediaObject).withShareTicket);
        } else {
            intent.putExtra("mutil_select_is_ret", true);
        }
        if (req.message.getType() == 45) {
            intent.putExtra("Select_Send_Card", true);
        }
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477889ed);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477729q);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/modelbiz/ww/OpenSdkBridge", "dealSendMsgToWx", "(Landroid/app/Activity;Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/modelbiz/ww/OpenSdkBridge", "dealSendMsgToWx", "(Landroid/app/Activity;Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void b(android.app.Activity activity, com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req) {
        android.os.Bundle bundle = new android.os.Bundle();
        req.toBundle(bundle);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.wework");
        intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
        intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT, "weixin://sendreq?appid=wx4706a9fcbbca10f2");
        intent.putExtra("SendAppMessageWrapper_BlockInvalidToken", false);
        intent.putExtra("SendAppMessageWrapper_NoNeedStayInWeixin", true);
        try {
            a(activity, req, intent.getExtras(), "com.tencent.wework");
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477729q);
        } catch (java.lang.Throwable unused) {
        }
    }
}
