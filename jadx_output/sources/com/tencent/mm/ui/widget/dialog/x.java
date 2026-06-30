package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.a f212014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f212015e;

    public x(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.a aVar) {
        this.f212015e = j0Var;
        this.f212014d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f212015e;
        android.text.Layout layout = j0Var.f211829g.getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0) {
            return;
        }
        com.tencent.mm.ui.yk.c("MicroMsg.MMAlertDialog", "PositiveButton text too long, show updown mode!!", new java.lang.Object[0]);
        com.tencent.mm.ui.widget.dialog.j0.c(j0Var, this.f212014d);
    }
}
