package k53;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p33.l f304375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f304376e;

    public n0(k53.u0 u0Var, p33.l lVar) {
        this.f304376e = u0Var;
        this.f304375d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = k53.u0.f304394k + "thumb_" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        java.lang.String str3 = this.f304375d.f351607i;
        k53.u0 u0Var = this.f304376e;
        u0Var.getClass();
        com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem c17 = j53.d.c(str3);
        if (c17 == null) {
            c17 = null;
        } else {
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.model.l4.f183002b.b(j53.d.b(str2, str3));
            if (b17 != null) {
                c17.f182737f = b17.f182738g;
            }
        }
        if (c17 == null || (str = c17.f182736e) == null) {
            return;
        }
        u0Var.f304398d = str;
        com.tencent.mm.plugin.webview.model.i4 bj6 = com.tencent.mm.plugin.webview.modeltools.z.bj();
        com.tencent.mm.plugin.webview.model.n0 n0Var = u0Var.f304403i;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f182937d;
        if (copyOnWriteArraySet != null && n0Var != null && !copyOnWriteArraySet.contains(n0Var)) {
            copyOnWriteArraySet.add(n0Var);
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().b(u0Var.f304404j);
        com.tencent.mm.sdk.platformtools.u3.h(new k53.o0(u0Var, c17));
    }
}
