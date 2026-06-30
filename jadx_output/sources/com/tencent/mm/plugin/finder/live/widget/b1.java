package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public abstract class b1 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f117806h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.content.Context context) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117806h = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.z0(context, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        y().clearFocus();
        java.lang.Object systemService = this.f118381d.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(y().getWindowToken(), 0);
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f117806h).getValue()).d();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        pm0.v.V(100L, new com.tencent.mm.plugin.finder.live.widget.a1(this));
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f117806h).getValue()).f();
    }

    public abstract android.widget.EditText y();

    public void z() {
        y().setFocusableInTouchMode(true);
        y().requestFocus();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f118381d.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(y(), 0);
        }
    }
}
