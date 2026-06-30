package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class pc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.rc f210643d;

    public pc(com.tencent.mm.ui.tools.rc rcVar) {
        this.f210643d = rcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.rc rcVar = this.f210643d;
        androidx.appcompat.app.AppCompatActivity context = rcVar.f210683b.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = rcVar.f210683b.getContext().getString(com.tencent.mm.R.string.ncn);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
    }
}
