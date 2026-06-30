package v73;

/* loaded from: classes8.dex */
public class l0 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.b f433708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI f433709b;

    public l0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI, r73.b bVar) {
        this.f433709b = honeyPayMainUI;
        this.f433708a = bVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r73.b bVar = this.f433708a;
        r45.a10 a10Var = bVar.f393164r;
        long j17 = a10Var.f369623g;
        long j18 = a10Var.f369622f;
        java.lang.String str2 = a10Var.f369624h;
        java.lang.String str3 = a10Var.f369625i;
        java.lang.String str4 = bVar.f393165s;
        java.lang.String str5 = a10Var.f369629p;
        int i19 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.f142334u;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI = this.f433709b;
        com.tencent.mars.xlog.Log.i(honeyPayMainUI.f142260d, "go to give card");
        android.content.Intent intent = new android.content.Intent(honeyPayMainUI, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.class);
        intent.putExtra("key_max_credit_line", j17);
        intent.putExtra("key_min_credit_line", j18);
        intent.putExtra("key_min_credit_line", j18);
        intent.putExtra("key_true_name", str2);
        intent.putExtra("key_take_message", str3);
        intent.putExtra("key_username", str4);
        intent.putExtra("key_over_max_limit_warning", str5);
        honeyPayMainUI.startActivityForResult(intent, 2);
    }
}
