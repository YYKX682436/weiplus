package v73;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fq4 f433706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI, r45.fq4 fq4Var) {
        super(false);
        this.f433707e = honeyPayCardManagerUI;
        this.f433706d = fq4Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f433707e.getContext(), this.f433706d.f374551e, false);
    }
}
