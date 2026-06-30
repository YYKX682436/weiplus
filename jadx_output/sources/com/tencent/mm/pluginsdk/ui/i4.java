package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.j4 f190876d;

    public i4(com.tencent.mm.pluginsdk.ui.j4 j4Var) {
        this.f190876d = j4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f190876d.f190881d.f189871d.requestFocus();
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.i4$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.pluginsdk.ui.j4 j4Var = com.tencent.mm.pluginsdk.ui.i4.this.f190876d;
                ((android.view.inputmethod.InputMethodManager) j4Var.f190881d.getContext().getSystemService("input_method")).showSoftInput(j4Var.f190881d.f189871d, 0);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 200L, false);
    }
}
