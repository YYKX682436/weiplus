package yt1;

/* loaded from: classes8.dex */
public class z implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        if (g17 == null || g17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreCard.notifyShareCardListener", "onReceiveMsg, msgContent is null");
        } else {
            xt1.t0.fj().f456587y.post(new yt1.y(this, g17, p0Var));
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
