package v73;

/* loaded from: classes9.dex */
public class n1 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.av3 f433717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f433718b;

    public n1(v73.p1 p1Var, r45.av3 av3Var, android.content.Context context) {
        this.f433717a = av3Var;
        this.f433718b = context;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "click oper text");
        r45.av3 av3Var = this.f433717a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(av3Var.f370276i.f392374f)) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(this.f433718b, av3Var.f370276i.f392374f, false);
    }
}
