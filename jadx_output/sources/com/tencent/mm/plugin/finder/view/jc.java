package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class jc implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f132435d;

    public jc(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f132435d = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.tencent.mm.plugin.finder.view.oc ocVar = com.tencent.mm.plugin.finder.view.oc.f132781a;
        db5.d5 d5Var = com.tencent.mm.plugin.finder.view.oc.f132783c;
        boolean z17 = false;
        if (d5Var != null && d5Var.isShowing()) {
            z17 = true;
        }
        if (z17) {
            db5.d5 d5Var2 = com.tencent.mm.plugin.finder.view.oc.f132783c;
            if (d5Var2 != null) {
                d5Var2.dismiss();
            }
            com.tencent.mm.plugin.finder.view.oc.f132783c = null;
        }
        this.f132435d.onDismiss();
    }
}
