package gy4;

/* loaded from: classes8.dex */
public final class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f277589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f277589d = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI T6() {
        if (!(getActivity() instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI)) {
            com.tencent.mars.xlog.Log.e(pf5.o.TAG, "activity is not WebViewUI");
            throw new java.lang.RuntimeException("activity is not WebViewUI");
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        return (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) activity;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("key_yuanbao_webview_initial_title");
        if (stringExtra == null) {
            return;
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = T6().L1;
        if (e3Var != null) {
            e3Var.D(new gy4.a(this, stringExtra));
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var2 = T6().L1;
        if (e3Var2 != null) {
            e3Var2.C(new gy4.b(this, stringExtra));
        }
    }
}
