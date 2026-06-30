package fs4;

/* loaded from: classes9.dex */
public class c extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs4.h f266336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fs4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f266336c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) objArr[0];
        fs4.h hVar = this.f266336c;
        if (hVar.r()) {
            authen.f179542d = 4;
        } else {
            authen.f179542d = 1;
        }
        this.f338834b.d(new gs4.s(authen, hVar.f213801c.getBoolean("key_is_reset_with_new_card", false), hVar.f213801c.getBoolean("key_is_paymanager") ? 1 : 0), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof gs4.s)) {
            return false;
        }
        gs4.s sVar = (gs4.s) m1Var;
        fs4.h hVar = this.f266336c;
        hVar.f213801c.putString("kreq_token", sVar.f275136e);
        hVar.f266342e = sVar;
        if (sVar.f275137f) {
            return true;
        }
        hVar.o(this.f338833a, 0, hVar.f213801c);
        return true;
    }
}
