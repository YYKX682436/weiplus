package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class qc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.rc f210663d;

    public qc(com.tencent.mm.ui.tools.rc rcVar) {
        this.f210663d = rcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.rc rcVar = this.f210663d;
        androidx.appcompat.app.AppCompatActivity context = rcVar.f210683b.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = rcVar.f210683b.getContext().getString(com.tencent.mm.R.string.i88);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }
}
