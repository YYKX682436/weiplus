package v73;

/* loaded from: classes9.dex */
public class j1 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.tg5 f433703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI f433704b;

    public j1(com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI honeyPayReceiveCardUI, r45.tg5 tg5Var) {
        this.f433704b = honeyPayReceiveCardUI;
        this.f433703a = tg5Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        r45.tg5 tg5Var = this.f433703a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(tg5Var.f386409h)) {
            com.tencent.mm.wallet_core.ui.r1.V(this.f433704b.getContext(), tg5Var.f386409h, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 1, 0, 0, 0, 0);
    }
}
