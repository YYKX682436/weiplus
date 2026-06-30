package yt4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yt4.f f465750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yt4.f fVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f465750c = fVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f338834b.a(new yt4.d(this.f465750c.f213801c.getString("payu_reference"), ((at4.z0) objArr[0]).f14023b), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof yt4.d) || i17 != 0 || i18 != 0) {
            return false;
        }
        yt4.f fVar = this.f465750c;
        fVar.f213801c.putInt("key_errcode_payu", 0);
        com.tencent.mm.wallet_core.a.c(this.f338833a, fVar.f213801c, 0);
        return true;
    }
}
