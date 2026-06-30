package yr4;

/* loaded from: classes9.dex */
public class e extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, np5.b0 b0Var) {
        super(uVar, walletBaseUI, b0Var);
        this.f465093c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        if (objArr.length > 0) {
            this.f338834b.d(zr4.a.d((at4.z0) objArr[0], (com.tencent.mm.plugin.wallet_core.model.Orders) this.f465093c.f213801c.getParcelable("key_orders")), true);
        }
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ds4.g) {
            ds4.g gVar = (ds4.g) m1Var;
            if (i17 == 0 && i18 == 0) {
                boolean z17 = gVar.isPaySuccess;
                yr4.u uVar = this.f465093c;
                if (z17) {
                    uVar.f213801c.putParcelable("key_orders", gVar.f242926x);
                }
                com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = gVar.f214061s;
                if (realnameGuideHelper != null) {
                    uVar.f213801c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                }
                android.os.Bundle bundle = uVar.f213801c;
                com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
                uVar.o(mMActivity, 0, bundle);
                mMActivity.finish();
                return true;
            }
        }
        return false;
    }
}
