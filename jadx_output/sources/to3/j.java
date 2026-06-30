package to3;

/* loaded from: classes9.dex */
public class j extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ to3.l f420967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(to3.l lVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f420967c = lVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[1];
        z0Var.f14022a = "1";
        this.f338834b.d(new ss4.w(z0Var), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof ss4.e0;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (!z17) {
            if (!(m1Var instanceof wo3.k)) {
                return false;
            }
            com.tencent.mm.wallet_core.a.d(mMActivity, ((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).getInput());
            yo3.m.v(mMActivity);
            return true;
        }
        if (((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).getInput() == null || ((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).getInput().getInt("key_bind_scene", -1) != 5 || yo3.m.k()) {
            return false;
        }
        to3.l.H(this.f420967c, mMActivity);
        return true;
    }
}
