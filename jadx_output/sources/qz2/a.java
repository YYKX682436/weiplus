package qz2;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qz2.b f367835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qz2.b bVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f367835c = bVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f367835c.f213801c.putString("pwd", (java.lang.String) objArr[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthProcess", "this is onNext");
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
