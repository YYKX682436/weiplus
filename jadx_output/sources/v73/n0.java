package v73;

/* loaded from: classes9.dex */
public class n0 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.zw3 f433715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI f433716b;

    public n0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI, r45.zw3 zw3Var) {
        this.f433716b = honeyPayMainUI;
        this.f433715a = zw3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f433716b, this.f433715a.f392429p.f390557f, true);
    }
}
