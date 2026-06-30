package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public class y2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f133374d;

    public y2(com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f133374d = e3Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.f133374d;
        android.view.ViewTreeObserver viewTreeObserver = e3Var.f131964n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                e3Var.f131964n = e3Var.f131963m.getViewTreeObserver();
            }
            e3Var.f131964n.removeGlobalOnLayoutListener(e3Var);
            e3Var.f131964n = null;
        }
        if (!e3Var.f131965o) {
            e3Var.f131957d = null;
        }
        com.tencent.mm.plugin.finder.view.d3 d3Var = e3Var.f131968r;
        if (d3Var != null) {
            d3Var.onDismiss();
        }
        e3Var.f131976z.removeAllViews();
        e3Var.D.clear();
    }
}
