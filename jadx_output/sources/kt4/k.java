package kt4;

/* loaded from: classes9.dex */
public class k implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kt4.n f312037a;

    public k(kt4.n nVar) {
        this.f312037a = nVar;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        kt4.n nVar = this.f312037a;
        nVar.f312043c.dismiss();
        com.tencent.mm.ui.MMActivity mMActivity = nVar.f338833a;
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI) {
            ((com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI) mMActivity).U6();
        }
    }
}
