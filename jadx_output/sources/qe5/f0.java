package qe5;

/* loaded from: classes12.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f362097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f362099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362100g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qe5.m0 m0Var, int i17, int i18, java.lang.String str) {
        super(0);
        this.f362097d = m0Var;
        this.f362098e = i17;
        this.f362099f = i18;
        this.f362100g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qe5.m0 m0Var = this.f362097d;
        java.lang.Long X6 = m0Var.X6();
        com.tencent.mm.storage.f9 Y6 = m0Var.Y6();
        if (X6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "msgId is null");
        } else {
            int i17 = this.f362099f;
            if (i17 != 0 && z65.c.a()) {
                dp.a.makeText(m0Var.getActivity(), "errCode[" + i17 + ']', 0).show();
            }
            if ((i17 == -5103087 || i17 == -5103059 || i17 == -5103017) && Y6 != null) {
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Y6, m0Var.U6(), 4, true);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Y6.getMsgId(), Y6, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "msgId:%s fail, errCode:%s", X6, java.lang.Integer.valueOf(i17));
            }
            if (i17 == -5103059) {
                j75.f Q6 = m0Var.Q6();
                if (Q6 != null) {
                    Q6.B3(new kd5.b());
                }
            } else {
                m0Var.c7(false);
                com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "dealFailMsg msgId:%s fail, errCode:%s, errMsg:%s, errType:%s", X6, java.lang.Integer.valueOf(i17), this.f362100g, java.lang.Integer.valueOf(this.f362098e));
            }
        }
        return jz5.f0.f302826a;
    }
}
