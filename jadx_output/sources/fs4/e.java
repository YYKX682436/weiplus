package fs4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs4.h f266338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fs4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f266338c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[0];
        fs4.h hVar = this.f266338c;
        boolean z17 = hVar.f213801c.getBoolean("key_is_set_pwd_after_face_action");
        np5.b0 b0Var = this.f338834b;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "WalletPwdConfirmUI controller onNext, after face verify, reset pwd by face");
            b0Var.d(new gs4.m(hVar.f213801c.getString("key_face_action_result_token"), z0Var.f14023b), true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "WalletPwdConfirmUI controller onNext, not after face verify, reset pwd normal");
            b0Var.d(new gs4.r(z0Var), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || (!(m1Var instanceof gs4.r) && !(m1Var instanceof gs4.m))) {
            return false;
        }
        fs4.h hVar = this.f266338c;
        hVar.o(this.f338833a, 0, hVar.f213801c);
        return true;
    }
}
