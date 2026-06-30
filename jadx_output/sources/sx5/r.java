package sx5;

/* loaded from: classes13.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413753d;

    public r(sx5.a1 a1Var) {
        this.f413753d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        sx5.a1 a1Var = this.f413753d;
        a1Var.getClass();
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoExitFullscreen");
        a1Var.f413672f.evaluateJavascript("xwebVideoBridge.xwebToJS_Video_ExitFullscreen();", new sx5.t(a1Var));
    }
}
