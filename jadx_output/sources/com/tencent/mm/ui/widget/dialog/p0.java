package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class p0 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211943d;

    public p0(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f211943d = k0Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface dialogInterface) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211943d;
        com.tencent.mm.ui.widget.dialog.d1 d1Var = k0Var.f211856e;
        if (d1Var != null && !k0Var.W1) {
            d1Var.onShow();
        }
        if (k0Var.f211858f == null || k0Var.W1 || (recyclerView = k0Var.F1) == null || recyclerView.getVisibility() != 0) {
            return;
        }
        ((com.tencent.mm.pluginsdk.forward.e) k0Var.f211858f).a();
    }
}
