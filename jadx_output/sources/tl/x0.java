package tl;

/* loaded from: classes12.dex */
public class x0 implements tl.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.y0 f420177a;

    public x0(tl.y0 y0Var) {
        this.f420177a = y0Var;
    }

    @Override // tl.a
    public void a() {
        tl.y0 y0Var = this.f420177a;
        y0Var.f420188a.a();
        cv.a1 a1Var = y0Var.f420191d;
        if (a1Var != null) {
            a1Var.a();
        }
        try {
            y0Var.f420189b.d();
            y0Var.f420192e = -1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimpleVoiceRecorder", "setErrorListener File[" + y0Var.f420190c + "] ErrMsg[" + e17.getStackTrace() + "]");
        }
    }
}
