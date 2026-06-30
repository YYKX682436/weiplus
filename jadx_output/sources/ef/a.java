package ef;

/* loaded from: classes7.dex */
public final class a implements ef.e {
    @Override // ef.e
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "onKeyboardStateChanged");
    }

    @Override // ef.e
    public void b() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", qc1.v.NAME);
    }

    @Override // ef.e
    public int c() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "getToolbarHeight");
        return 0;
    }

    @Override // ef.e
    public void d(int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "refreshHeight");
    }

    @Override // ef.e
    public boolean e(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "releaseEditText");
        return false;
    }

    @Override // ef.e
    public void f(pl1.i params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "updateParams");
    }

    @Override // ef.e
    public void g(yz5.l l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "setOnDoneListener");
    }

    @Override // ef.e
    public android.view.View getView() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "getView");
        return null;
    }

    @Override // ef.e
    public void h(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "attachEditText");
    }

    @Override // ef.e
    public void hideKeyboard() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", qc1.e.NAME);
    }

    @Override // ef.e
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "updateInputConnection");
    }

    @Override // ef.e
    public void j(boolean z17) {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "updateToolbar");
    }

    @Override // ef.e
    public void k(com.tencent.mm.plugin.appbrand.widget.input.p3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "addOnHeightChangedListener");
    }

    @Override // ef.e
    public void m(com.tencent.mm.plugin.appbrand.widget.input.p3 p3Var) {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "removeOnHeightChangeListener");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "isRealHeightSettled");
        return false;
    }

    @Override // ef.e
    public void setXMode(int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "setXMode");
    }
}
