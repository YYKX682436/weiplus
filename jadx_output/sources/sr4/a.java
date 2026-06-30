package sr4;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f411864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr4.b f411865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sr4.b bVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f411865d = bVar;
        this.f411864c = null;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        if (i17 != 1) {
            return null;
        }
        return this.f338833a.getString(com.tencent.mm.R.string.f493537kn3);
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        sr4.b bVar = this.f411865d;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) bVar.f213801c.getParcelable("key_bankcard");
        if (bankcard == null || bankcard.field_bankcardState != 1) {
            bVar.f213801c.putInt("key_process_result_code", 1);
            return false;
        }
        bVar.f411866d = bankcard.field_bindSerial;
        this.f338834b.d(new tr4.d(bankcard.field_bankcardType, bankcard.field_bindSerial, bVar.f213801c.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1) == 2), true);
        bVar.f213801c.putBoolean("key_is_expired_bankcard", true);
        return true;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        sr4.b bVar = this.f411865d;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) bVar.f213801c.getParcelable("key_bankcard");
        java.lang.String str = (java.lang.String) objArr[0];
        this.f411864c = (java.lang.String) objArr[1];
        java.lang.String string = bVar.f213801c.getString("key_support_quick_bind");
        if (bankcard == null) {
            bVar.f213801c.putInt("key_process_result_code", 1);
            return false;
        }
        bVar.f411866d = bankcard.field_bindSerial;
        this.f338834b.d(new tr4.d(bankcard.field_bankcardType, bankcard.field_bindSerial, str, bVar.f213801c.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1) == 2, string), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof tr4.d) {
            sr4.b bVar = this.f411865d;
            if (i17 == 0 && i18 == 0) {
                bVar.f213801c.putInt("key_process_result_code", -1);
                com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
                if (bVar.t(mMActivity, null)) {
                    this.f338834b.d(new ss4.e0(this.f411864c, 14), true);
                } else {
                    bVar.o(mMActivity, 0, null);
                    if (mMActivity instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI) {
                        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).cleanUiData(0);
                    }
                    mMActivity.finish();
                }
                return true;
            }
            bVar.f213801c.putInt("key_process_result_code", 1);
        }
        return false;
    }
}
