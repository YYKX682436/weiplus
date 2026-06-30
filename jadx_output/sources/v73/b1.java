package v73;

/* loaded from: classes9.dex */
public class b1 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.l f433674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI f433675b;

    public b1(com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI honeyPayProxyUI, r73.l lVar) {
        this.f433675b = honeyPayProxyUI;
        this.f433674a = lVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r73.l lVar = this.f433674a;
        r45.bx3 bx3Var = lVar.f393177r.f384844f;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI honeyPayProxyUI = this.f433675b;
        if (bx3Var != null) {
            com.tencent.mars.xlog.Log.i(honeyPayProxyUI.f142260d, "state: %s", java.lang.Integer.valueOf(bx3Var.f371122g));
        }
        r45.rg5 rg5Var = lVar.f393177r;
        int i19 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI.f142362h;
        java.lang.String str2 = honeyPayProxyUI.f142260d;
        com.tencent.mars.xlog.Log.i(str2, "go to manager ui");
        android.content.Intent intent = new android.content.Intent(honeyPayProxyUI, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.class);
        intent.putExtra("key_card_no", honeyPayProxyUI.f142364g);
        try {
            byte[] byteArray = rg5Var.toByteArray();
            intent.putExtra("key_scene", 1);
            intent.putExtra("key_qry_response", byteArray);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str2, e17, "", new java.lang.Object[0]);
            intent.putExtra("key_scene", 0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(honeyPayProxyUI, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoManagerUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        honeyPayProxyUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(honeyPayProxyUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoManagerUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        honeyPayProxyUI.finish();
    }
}
