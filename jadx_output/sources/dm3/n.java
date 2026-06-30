package dm3;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.o f241714d;

    public n(dm3.o oVar) {
        this.f241714d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm3.o oVar = this.f241714d;
        if (oVar.f241724q) {
            com.tencent.mars.xlog.Log.i(oVar.m(), "startTimerToReplace overTime and replace player");
            oVar.f241725r = true;
            ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Vi(true);
            b66.n nVar = oVar.f241718h;
            if (nVar != null) {
                qk.a9 a9Var = oVar.f241726s;
                if (a9Var != null) {
                    ((ul4.i) a9Var).f428617e = null;
                }
                b66.g o17 = oVar.o();
                if (o17 != null) {
                    urgen.ur_2BA9.UR_882D.UR_F619(((b66.i) o17).getCppPointer(), nVar);
                }
                qk.a9 a9Var2 = oVar.f241726s;
                if (a9Var2 != null) {
                    jm4.h0 h0Var = jm4.h0.f300389f;
                    byte[] byteArray = new bw5.vo0().toByteArray();
                    kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                    ((ul4.i) a9Var2).e(h0Var, byteArray);
                }
                b66.t tVar = oVar.f241729v;
                ((b66.q) nVar).j(tVar);
                jm4.n2 o18 = oVar.o();
                b66.n f17 = o18 != null ? ((jm4.p2) o18).f() : null;
                oVar.f241718h = f17;
                if (f17 != null) {
                    ((b66.q) f17).a(tVar);
                }
            }
        }
    }
}
