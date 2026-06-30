package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes3.dex */
public class a2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f211741d;

    public a2(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f211741d = y1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211741d;
        android.view.ViewTreeObserver viewTreeObserver = y1Var.f212032n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                y1Var.f212032n = y1Var.f212031m.getViewTreeObserver();
            }
            y1Var.f212032n.removeGlobalOnLayoutListener(y1Var);
            y1Var.f212032n = null;
        }
        if (!y1Var.f212033o) {
            y1Var.f212025d = null;
        }
        com.tencent.mm.ui.widget.dialog.h2 h2Var = y1Var.f212037s;
        if (h2Var != null) {
            h2Var.onDismiss();
        }
        com.tencent.mm.ui.widget.dialog.i2 i2Var = y1Var.f212038t;
        if (i2Var != null && !y1Var.f212039u) {
            i2Var.onDismiss();
        }
        y1Var.B.setTranslationX(0.0f);
        y1Var.B.setVisibility(0);
        y1Var.C.removeAllViews();
        y1Var.D.clear();
    }
}
