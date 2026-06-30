package qs4;

/* loaded from: classes9.dex */
public class f extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Authen f366416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs4.j f366417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qs4.j jVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366417d = jVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        qs4.j jVar = this.f366417d;
        jVar.a("onNext", objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "onNext, do bind bank card!");
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) objArr[0];
        this.f366416c = authen;
        authen.f179542d = jVar.G();
        this.f338834b.d(new rs4.a(this.f366416c, "", ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof rs4.a;
            com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
            qs4.j jVar = this.f366417d;
            if (z17) {
                rs4.a aVar = (rs4.a) m1Var;
                if (aVar.f399345f == null) {
                    jVar.f213801c.putString("kreq_token", aVar.f399344e);
                    if (jVar.t(mMActivity, jVar.f213801c)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "need update bankcardlist");
                        this.f338834b.a(new ss4.e0(null, 12), false);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "not need update bankcardlist");
                        jVar.o(mMActivity, 0, jVar.f213801c);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
                    com.tencent.mm.ui.MMActivity mMActivity2 = this.f338833a;
                    at4.y0 y0Var = aVar.f399345f;
                    db5.e1.A(mMActivity2, y0Var.f14013a, "", y0Var.f14015c, y0Var.f14014b, new qs4.d(this), new qs4.e(this));
                }
                return true;
            }
            if (m1Var instanceof ss4.e0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "update bankcardlist success!");
                jVar.o(mMActivity, 0, jVar.f213801c);
                return true;
            }
        }
        return false;
    }
}
