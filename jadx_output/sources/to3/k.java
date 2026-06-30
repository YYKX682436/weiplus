package to3;

/* loaded from: classes9.dex */
public class k extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ to3.l f420968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(to3.l lVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f420968c = lVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f338834b.d(new rs4.b((at4.z0) objArr[0]), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof ss4.e0;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (z17) {
            if (((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).getInput() != null && ((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).getInput().getInt("key_bind_scene", -1) == 5 && !yo3.m.k()) {
                to3.l.H(this.f420968c, mMActivity);
            }
            return true;
        }
        if (!(m1Var instanceof wo3.k)) {
            return false;
        }
        android.os.Bundle input = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).getInput();
        input.putBoolean("intent_bind_end", true);
        com.tencent.mm.wallet_core.a.d(mMActivity, input);
        yo3.m.v(mMActivity);
        return true;
    }
}
