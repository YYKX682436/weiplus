package v73;

/* loaded from: classes9.dex */
public class i1 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.e f433699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI f433700b;

    public i1(com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI honeyPayReceiveCardUI, r73.e eVar) {
        this.f433700b = honeyPayReceiveCardUI;
        this.f433699a = eVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r73.e eVar = this.f433699a;
        r45.bv3 bv3Var = eVar.f393168r.f370760f;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI honeyPayReceiveCardUI = this.f433700b;
        if (bv3Var != null) {
            com.tencent.mars.xlog.Log.i(honeyPayReceiveCardUI.f142260d, "do real name");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayReceiveCardUI");
            u73.h.i(honeyPayReceiveCardUI, bundle, eVar.f393168r.f370760f, false);
        } else {
            int i19 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI.E;
            com.tencent.mars.xlog.Log.i(honeyPayReceiveCardUI.f142260d, "go to honey pay card detail");
            android.content.Intent intent = new android.content.Intent(honeyPayReceiveCardUI, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardDetailUI.class);
            intent.putExtra("key_scene", 0);
            intent.putExtra("key_card_no", honeyPayReceiveCardUI.f142382z);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(honeyPayReceiveCardUI, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayReceiveCardUI", "gotoHoneyPayCardDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            honeyPayReceiveCardUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(honeyPayReceiveCardUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayReceiveCardUI", "gotoHoneyPayCardDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            u73.h.e(1, honeyPayReceiveCardUI.f142382z);
            honeyPayReceiveCardUI.finish();
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(875L, 4L, 1L);
        if (honeyPayReceiveCardUI.B) {
            honeyPayReceiveCardUI.B = false;
            g0Var.d(24522, 2, 2);
        }
    }
}
