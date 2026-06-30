package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f175467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175468e;

    public s0(android.content.Context context, com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175467d = context;
        this.f175468e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f175467d.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f175468e.f175484n, 0);
        }
    }
}
