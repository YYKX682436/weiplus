package dk5;

/* loaded from: classes4.dex */
public class z5 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg3.x0 f235022d;

    public z5(dk5.s5 s5Var, tg3.x0 x0Var) {
        this.f235022d = x0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.jk0 jk0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgMgr", "onSceneEnd() called with: errType = [" + i17 + "], errCode = [" + i18 + "], errMsg = [" + str + "], scene = [" + m1Var + "]");
        c01.d9.e().q(m1Var.getType(), this);
        tg3.x0 x0Var = this.f235022d;
        if (i17 != 0 || i18 != 0) {
            x0Var.a(i17, i18, null, null);
        } else {
            if (!(m1Var instanceof l41.t) || (jk0Var = ((l41.t) m1Var).f315926f) == null) {
                return;
            }
            x0Var.a(i17, i18, jk0Var.f377898d, jk0Var.f377899e.f192156a);
        }
    }
}
