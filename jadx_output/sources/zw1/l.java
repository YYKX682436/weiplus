package zw1;

/* loaded from: classes2.dex */
public class l extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d8 f476699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw1.m f476700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zw1.m mVar, r45.d8 d8Var) {
        super(false);
        this.f476700e = mVar;
        this.f476699d = d8Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        r45.d8 d8Var = this.f476699d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(d8Var.f372215f)) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(this.f476700e.f476718d.getContext(), d8Var.f372215f, true);
    }
}
