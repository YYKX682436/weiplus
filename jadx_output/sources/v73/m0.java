package v73;

/* loaded from: classes8.dex */
public class m0 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.z75 f433711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI f433712b;

    public m0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI, r45.z75 z75Var) {
        this.f433712b = honeyPayMainUI;
        this.f433711a = z75Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        r45.z75 z75Var = this.f433711a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(z75Var.f391775e)) {
            com.tencent.mm.wallet_core.ui.r1.X(this.f433712b.getContext(), z75Var.f391775e, true);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 1, 0, 0, 0, 0, 0);
    }
}
