package com.tencent.mm.ui.tools;

/* loaded from: classes5.dex */
public class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.gb f210379d;

    public eb(com.tencent.mm.ui.tools.gb gbVar) {
        this.f210379d = gbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.gb gbVar = this.f210379d;
        androidx.appcompat.app.AppCompatActivity context = gbVar.f210444a.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = gbVar.f210444a.getContext().getString(com.tencent.mm.R.string.ncn);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
    }
}
