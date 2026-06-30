package r50;

/* loaded from: classes5.dex */
public final class u implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392613a;

    public u(r50.j0 j0Var) {
        this.f392613a = j0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        try {
            this.f392613a.W6().e().n(text);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ForwardMsgPreviewKeyboardUIC", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        r50.j0 j0Var = this.f392613a;
        android.view.inputmethod.InputConnection inputConnection = j0Var.W6().e().getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        android.view.inputmethod.InputConnection inputConnection2 = j0Var.W6().e().getInputConnection();
        if (inputConnection2 != null) {
            inputConnection2.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
        r50.j0 j0Var = this.f392613a;
        j0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "setToSendTextColor: enable=%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            j0Var.W6().e().setTextColor(j0Var.getActivity().getResources().getColor(com.tencent.mm.R.color.f479411yi));
            return;
        }
        j0Var.W6().e().setTextColor(j0Var.getActivity().getResources().getColor(com.tencent.mm.R.color.t_));
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "focusEdt: %s, %s", java.lang.Boolean.FALSE, j0Var.W6().e());
        j0Var.W6().e().clearFocus();
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
