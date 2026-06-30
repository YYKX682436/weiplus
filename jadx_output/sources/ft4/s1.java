package ft4;

/* loaded from: classes14.dex */
public final class s1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft4.u1 f266693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(ft4.u1 u1Var) {
        super(false);
        this.f266693d = u1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ft4.u1 u1Var = this.f266693d;
        u1Var.D(301);
        ft4.t1 t1Var = u1Var.R;
        if (t1Var != null) {
            t1Var.a(u1Var.Q);
        }
    }
}
