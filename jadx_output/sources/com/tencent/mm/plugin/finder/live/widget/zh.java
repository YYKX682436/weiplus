package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ai f120574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ei f120575e;

    public zh(com.tencent.mm.plugin.finder.live.widget.ai aiVar, com.tencent.mm.plugin.finder.live.widget.ei eiVar) {
        this.f120574d = aiVar;
        this.f120575e = eiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        android.view.Window b17;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f120574d.f211798d;
        if (y1Var != null && (b17 = y1Var.b()) != null) {
            b17.setSoftInputMode(18);
        }
        com.tencent.mm.plugin.finder.live.widget.ei eiVar = this.f120575e;
        android.widget.EditText editText = eiVar.f118256o;
        eiVar.getClass();
        if (editText != null) {
            editText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }
}
