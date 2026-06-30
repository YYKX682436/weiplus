package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class fq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f132124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.gq f132125e;

    public fq(android.widget.EditText editText, com.tencent.mm.plugin.finder.view.gq gqVar) {
        this.f132124d = editText;
        this.f132125e = gqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f132124d;
        editText.requestFocus();
        editText.setSelection(editText.getText().length());
        com.tencent.mm.plugin.finder.view.gq gqVar = this.f132125e;
        android.view.ViewGroup viewGroup = gqVar.f132187g;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            java.lang.Object systemService = mMActivity.getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            boolean showSoftInput = ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(editText, 0);
            com.tencent.mars.xlog.Log.i(gqVar.f132186f, "showSoftInput result:" + showSoftInput);
        }
    }
}
