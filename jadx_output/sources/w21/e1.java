package w21;

/* loaded from: classes12.dex */
public class e1 implements tl.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.f1 f442362a;

    public e1(w21.f1 f1Var) {
        this.f442362a = f1Var;
    }

    @Override // tl.a
    public void a() {
        w21.f1 f1Var = this.f442362a;
        com.tencent.mm.modelbase.e1 e1Var = f1Var.f442367c;
        if (e1Var != null) {
            e1Var.a();
        }
        try {
            f1Var.f442365a.d();
            f1Var.f442368d = -1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("VoiceRecorder", "setErrorListener File[" + f1Var.f442366b + "] ErrMsg[" + e17.getStackTrace() + "]");
        }
    }
}
