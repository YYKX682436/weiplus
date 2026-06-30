package dr4;

/* loaded from: classes14.dex */
public final class t1 implements com.tencent.mm.plugin.voip.model.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr4.x1 f242746a;

    public t1(dr4.x1 x1Var) {
        this.f242746a = x1Var;
    }

    public void a(android.view.Surface encoderSurface) {
        dr4.q qVar;
        java.lang.Object obj;
        dr4.c0 c0Var;
        kotlin.jvm.internal.o.g(encoderSurface, "encoderSurface");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipWindowsSurfaceRenderer", "onEncoderSurfaceRelease:" + encoderSurface.hashCode());
        dr4.x1 x1Var = this.f242746a;
        dr4.h hVar = x1Var.f242765e;
        if (hVar == null || (qVar = hVar.f242683i) == null || (obj = qVar.f242729b) == null || !kotlin.jvm.internal.o.b(obj, encoderSurface) || (c0Var = x1Var.f242762b) == null) {
            return;
        }
        dr4.c0.c(c0Var, qVar, null, 2, null);
    }
}
