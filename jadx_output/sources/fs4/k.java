package fs4;

/* loaded from: classes9.dex */
public class k extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs4.m f266344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fs4.m mVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f266344c = mVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[0];
        this.f266344c.f213801c.getString("key_pwd1");
        this.f338834b.d(new gs4.t(z0Var.f14023b, z0Var.f14025d), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (i17 != 0 || i18 != 0) {
            if (!(m1Var instanceof gs4.t)) {
                return false;
            }
            db5.e1.G(mMActivity, str, "", false, new fs4.j(this));
            return true;
        }
        if (m1Var instanceof gs4.t) {
            fs4.m mVar = this.f266344c;
            mVar.f213801c.putInt("RESET_PWD_USER_ACTION", 1);
            mVar.o(mMActivity, 0, mVar.f213801c);
            db5.e1.T(mMActivity, mMActivity.getString(com.tencent.mm.R.string.ku6));
        }
        return true;
    }
}
