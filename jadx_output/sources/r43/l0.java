package r43;

/* loaded from: classes8.dex */
public class l0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        ((ku5.t0) ku5.t0.f312615d).h(new r43.k0(this, p0Var), "GameSysCmdMsgListener");
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
        if (r0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f70760d) || com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f70761e)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("GameSysCmdMsgListener", "delete msgType:%s, msgId:%s", r0Var.f70760d, r0Var.f70761e);
        if ("gamecenter".equalsIgnoreCase(r0Var.f70760d)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(r0Var.f70761e);
            com.tencent.mm.plugin.game.model.r.a(arrayList, false);
        }
    }
}
