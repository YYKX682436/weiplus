package sx5;

/* loaded from: classes13.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413759d;

    public u0(sx5.a1 a1Var) {
        this.f413759d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        sx5.a1 a1Var = this.f413759d;
        a1Var.getClass();
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoChangeStatus");
        a1Var.f413672f.evaluateJavascript("xwebVideoBridge.xwebToJS_Video_Play();", new sx5.o(a1Var));
        a1Var.y();
    }
}
