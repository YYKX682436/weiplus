package rt4;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rt4.h f399544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(rt4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f399544c = hVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        if (i17 == 0) {
            return this.f338833a.getString(com.tencent.mm.R.string.kk8);
        }
        return null;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        rt4.h hVar = this.f399544c;
        hVar.f213801c.putString("key_pwd1", (java.lang.String) objArr[0]);
        this.f338834b.a(new yt4.c(hVar.f213801c.getString("key_pwd1")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof yt4.c;
        rt4.h hVar = this.f399544c;
        if (z17) {
            if (i18 == 0 && i17 == 0) {
                yt4.c cVar = (yt4.c) m1Var;
                hVar.f213801c.putString("payu_reference", cVar.f465749d);
                if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f465749d)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.PayUUnbindProcess", "hy: check pwd failed");
                } else {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) hVar.f213801c.getParcelable("key_bankcard");
                    if (bankcard != null) {
                        this.f338834b.a(new rt4.c(bankcard.field_bindSerial, hVar.f213801c.getString("payu_reference")), true);
                    }
                }
            }
        } else if ((m1Var instanceof rt4.c) && i17 == 0 && i18 == 0) {
            hVar.f213801c.putInt("key_errcode_payu", 0);
            hVar.f(this.f338833a, hVar.f213801c);
        }
        return false;
    }
}
