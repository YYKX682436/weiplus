package yr4;

/* loaded from: classes9.dex */
public class n extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, np5.b0 b0Var) {
        super(uVar, walletBaseUI, b0Var);
        this.f465106c = uVar;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        yr4.u uVar = this.f465106c;
        if (uVar.f213801c.getInt("key_pay_scene", 0) == 11) {
            uVar.f213801c.putParcelable("key_history_bankcard", vr4.f1.wi().Ai().f13998g);
        }
        return false;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
