package o01;

/* loaded from: classes.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final kotlinx.coroutines.flow.j a(com.tencent.mm.modelbase.o reqResp) {
        kotlin.jvm.internal.o.g(reqResp, "reqResp");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.FlowNetScene", "doScene, " + reqResp.f70713d + ' ' + reqResp.f70712c);
        u26.k0 k0Var = new u26.k0();
        ku5.u0 u0Var = ku5.t0.f312615d;
        ((ku5.t0) u0Var).h(new o01.b(reqResp, k0Var), "FlowNetScene:" + reqResp.f70713d);
        return new kotlinx.coroutines.flow.r(k0Var);
    }
}
