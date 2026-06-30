package md1;

/* loaded from: classes7.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md1.j1 f325746d;

    public i1(md1.j1 j1Var) {
        this.f325746d = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        md1.j1 j1Var = this.f325746d;
        j1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "_hide");
        j1Var.f325754d = false;
        mi1.w0 w0Var = j1Var.f325753c;
        if (w0Var != null) {
            w0Var.dismiss();
            j1Var.f325753c = null;
        }
        j1Var.f325751a = null;
        j1Var.f325752b = 2;
    }
}
