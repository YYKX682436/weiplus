package v73;

/* loaded from: classes4.dex */
public class y implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.c f433753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI f433754b;

    public y(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI, r73.c cVar) {
        this.f433754b = honeyPayCheckPwdUI;
        this.f433753a = cVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCheckPwdUI", "create success");
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI = this.f433754b;
        android.content.Intent intent = new android.content.Intent(honeyPayCheckPwdUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.class);
        intent.putExtra("key_create_succ", true);
        r73.c cVar = this.f433753a;
        r45.bx3 bx3Var = cVar.f393166r.f391797f;
        if (bx3Var != null) {
            intent.putExtra("key_card_no", bx3Var.f371119d);
            intent.putExtra("key_card_type", cVar.f393166r.f391797f.f371131s);
        }
        dp.a.makeText(honeyPayCheckPwdUI.getContext(), com.tencent.mm.R.string.fwt, 1).show();
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI2 = this.f433754b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(honeyPayCheckPwdUI2, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCheckPwdUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        honeyPayCheckPwdUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(honeyPayCheckPwdUI2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCheckPwdUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 2L, 1L);
    }
}
