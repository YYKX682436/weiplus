package qr4;

/* loaded from: classes9.dex */
public class d extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f366128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qr4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366128c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) objArr[0];
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) objArr[1];
        qr4.h hVar = this.f366128c;
        int i17 = hVar.f213801c.getInt("key_pay_flag", 0);
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return false;
                }
                if (hVar.r()) {
                    authen.f179542d = 6;
                } else {
                    authen.f179542d = 3;
                }
            } else if (hVar.r()) {
                authen.f179542d = 5;
            } else {
                authen.f179542d = 2;
            }
        } else if (hVar.r()) {
            authen.f179542d = 4;
        } else {
            authen.f179542d = 1;
        }
        hVar.f213801c.putParcelable("key_authen", authen);
        this.f338834b.d(new as4.b(authen, orders, false), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof as4.b;
        qr4.h hVar = this.f366128c;
        if (z17) {
            as4.b bVar = (as4.b) m1Var;
            hVar.f213801c.putString("kreq_token", bVar.C);
            if (bVar.isPaySuccess) {
                hVar.f213801c.putParcelable("key_orders", bVar.A);
            }
        }
        hVar.getClass();
        hVar.o(this.f338833a, 0, hVar.f213801c);
        return true;
    }
}
