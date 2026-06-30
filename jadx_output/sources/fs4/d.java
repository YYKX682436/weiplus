package fs4;

/* loaded from: classes9.dex */
public class d extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs4.h f266337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fs4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f266337c = hVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f338833a.getString(com.tencent.mm.R.string.l0n);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[1];
        z0Var.f14022a = "3";
        this.f338834b.d(new gs4.u(z0Var), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof gs4.s)) {
            return false;
        }
        this.f266337c.f213801c.putString("kreq_token", ((gs4.s) m1Var).f275136e);
        return true;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        fs4.h hVar = this.f266337c;
        gs4.s sVar = hVar.f266342e;
        if (sVar == null) {
            return true;
        }
        sVar.resend();
        this.f338834b.a(hVar.f266342e, false);
        return true;
    }
}
