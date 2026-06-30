package sx5;

/* loaded from: classes13.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413754d;

    public r0(sx5.a1 a1Var) {
        this.f413754d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(1749L, 7L, 1L);
        }
        sx5.a1 a1Var = this.f413754d;
        boolean z17 = !a1Var.R;
        a1Var.getClass();
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoMute muted:" + z17);
        a1Var.f413672f.evaluateJavascript(java.lang.String.format("xwebVideoBridge.xwebToJS_Video_MuteChange(%b);", java.lang.Boolean.valueOf(z17)), new sx5.s(a1Var));
    }
}
