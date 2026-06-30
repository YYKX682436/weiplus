package sl0;

/* loaded from: classes11.dex */
public class w0 implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl0.b1 f409225a;

    public w0(sl0.b1 b1Var) {
        this.f409225a = b1Var;
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(9, null);
        if (com.tencent.mm.sdk.platformtools.f9.MeSetPrivacyAddByQQ.h() || num == null || num.intValue() == 0) {
            return java.lang.Boolean.FALSE;
        }
        sl0.b1 b1Var = this.f409225a;
        return java.lang.Boolean.valueOf((sl0.b1.b(b1Var, 8) && sl0.b1.b(b1Var, 16)) ? false : true);
    }
}
