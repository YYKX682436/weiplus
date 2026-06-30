package fs4;

/* loaded from: classes9.dex */
public class i extends np5.g {
    public i(fs4.m mVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (i17 == 0) {
            return mMActivity.getString(com.tencent.mm.R.string.f493517kk2);
        }
        if (i17 != 1) {
            return null;
        }
        return mMActivity.getString(com.tencent.mm.R.string.kuk);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f338834b.d(new ss4.x((java.lang.String) objArr[0], 3, (java.lang.String) objArr[1]), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
