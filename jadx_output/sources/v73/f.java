package v73;

/* loaded from: classes9.dex */
public class f implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433687a;

    public f(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f433687a = honeyPayCardManagerUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        int i17 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.Y;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI = this.f433687a;
        com.tencent.mars.xlog.Log.i(honeyPayCardManagerUI.f142260d, "go to quata ui");
        if (u73.h.g()) {
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putString("card_id", honeyPayCardManagerUI.M);
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("honeyPayModifyCreditUseCase", create, new v73.g(honeyPayCardManagerUI));
        } else {
            android.content.Intent intent = new android.content.Intent(honeyPayCardManagerUI, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI.class);
            intent.putExtra("key_max_credit_line", honeyPayCardManagerUI.N);
            intent.putExtra("key_min_credit_line", honeyPayCardManagerUI.P);
            intent.putExtra("key_card_no", honeyPayCardManagerUI.M);
            intent.putExtra("key_take_message", honeyPayCardManagerUI.K);
            intent.putExtra("key_title", honeyPayCardManagerUI.U);
            intent.putExtra("key_subtitle", honeyPayCardManagerUI.V);
            intent.putExtra("key_bottom_tips", honeyPayCardManagerUI.W);
            intent.putExtra("key_over_quota_tips", honeyPayCardManagerUI.X);
            honeyPayCardManagerUI.startActivityForResult(intent, 1);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 0, 1, 0, 0);
    }
}
