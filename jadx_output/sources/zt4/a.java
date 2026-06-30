package zt4;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f475595c;

    public a(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var, android.os.Bundle bundle) {
        super(mMActivity, b0Var);
        this.f475595c = bundle;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        this.f338834b.a(new zt4.c(this.f475595c.getString("payu_reference")), true);
        return true;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        android.os.Bundle bundle = this.f475595c;
        com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion payUSecurityQuestion = (com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion) bundle.getParcelable("key_security_question");
        this.f338834b.a(new zt4.b(bundle.getString("payu_reference"), payUSecurityQuestion.f181272d, bundle.getString("key_question_answer")), true);
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof zt4.c;
        android.os.Bundle bundle = this.f475595c;
        if (z17 && i17 == 0 && i18 == 0) {
            zt4.c cVar = (zt4.c) m1Var;
            bundle.putParcelable("key_security_question", new com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion(cVar.f475598d, cVar.f475599e));
            return false;
        }
        if (m1Var instanceof zt4.b) {
            zt4.b bVar = (zt4.b) m1Var;
            if (i17 == 0 && i18 == 0 && bVar.f475596d) {
                bundle.putString("payu_reference", bVar.f475597e);
                com.tencent.mm.wallet_core.a.d(this.f338833a, bundle);
                return true;
            }
        }
        return false;
    }
}
