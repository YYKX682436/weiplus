package tl2;

/* loaded from: classes8.dex */
public final class g implements com.tencent.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public int f420245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl2.u f420246e;

    public g(tl2.u uVar) {
        this.f420246e = uVar;
    }

    @Override // com.tencent.mm.ui.fa
    public void onConfigurationChanged(android.content.res.Configuration it) {
        com.tencent.mm.plugin.webview.ui.tools.widget.q1 q1Var;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.orientation != this.f420245d) {
            java.lang.ref.WeakReference weakReference = this.f420246e.f420279i;
            if (weakReference != null && (q1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.q1) weakReference.get()) != null && q1Var.isShowing()) {
                ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) q1Var).dismiss();
            }
            this.f420245d = it.orientation;
        }
    }
}
