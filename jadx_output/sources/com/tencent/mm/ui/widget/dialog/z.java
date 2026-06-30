package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.a f212050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f212051e;

    public z(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.a aVar) {
        this.f212051e = j0Var;
        this.f212050d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f212051e;
        android.text.Layout layout = j0Var.f211830h.getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0) {
            return;
        }
        com.tencent.mm.ui.yk.c("MicroMsg.MMAlertDialog", "NegativeButton text too long, show updown mode!!", new java.lang.Object[0]);
        com.tencent.mm.ui.widget.dialog.j0.c(j0Var, this.f212050d);
    }
}
