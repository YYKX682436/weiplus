package v73;

/* loaded from: classes9.dex */
public class c1 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.m f433679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI f433680b;

    public c1(com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI honeyPayProxyUI, r73.m mVar) {
        this.f433680b = honeyPayProxyUI;
        this.f433679a = mVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI honeyPayProxyUI = this.f433680b;
        java.lang.String str2 = honeyPayProxyUI.f142260d;
        r73.m mVar = this.f433679a;
        com.tencent.mars.xlog.Log.i(str2, "state: %s", java.lang.Integer.valueOf(mVar.f393178r.f386407f.f371886g));
        r45.tg5 tg5Var = mVar.f393178r;
        if (tg5Var.f386407f.f371886g == 1) {
            int i19 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI.f142362h;
            java.lang.String str3 = honeyPayProxyUI.f142260d;
            com.tencent.mars.xlog.Log.i(str3, "go to receive card ui");
            android.content.Intent intent = new android.content.Intent(honeyPayProxyUI, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI.class);
            intent.putExtra("key_card_no", honeyPayProxyUI.f142364g);
            try {
                byte[] byteArray = tg5Var.toByteArray();
                intent.putExtra("key_scene", 1);
                intent.putExtra("key_qry_response", byteArray);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str3, e17, "", new java.lang.Object[0]);
                intent.putExtra("key_scene", 0);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(honeyPayProxyUI, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoReceiveCardUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            honeyPayProxyUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(honeyPayProxyUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoReceiveCardUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            int i27 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI.f142362h;
            java.lang.String str4 = honeyPayProxyUI.f142260d;
            com.tencent.mars.xlog.Log.i(str4, "go to card detail");
            android.content.Intent intent2 = new android.content.Intent(honeyPayProxyUI, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardDetailUI.class);
            intent2.putExtra("key_card_no", honeyPayProxyUI.f142364g);
            intent2.putExtra("key_scene", 1);
            try {
                intent2.putExtra("key_qry_response", tg5Var.toByteArray());
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str4, e18, "", new java.lang.Object[0]);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(honeyPayProxyUI, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoCardDetailUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            honeyPayProxyUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(honeyPayProxyUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoCardDetailUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        honeyPayProxyUI.finish();
    }
}
