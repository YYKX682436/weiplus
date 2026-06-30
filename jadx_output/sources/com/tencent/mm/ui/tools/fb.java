package com.tencent.mm.ui.tools;

/* loaded from: classes5.dex */
public class fb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.gb f210421d;

    public fb(com.tencent.mm.ui.tools.gb gbVar) {
        this.f210421d = gbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.gb gbVar = this.f210421d;
        androidx.appcompat.app.AppCompatActivity context = gbVar.f210444a.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = gbVar.f210444a.getContext().getString(com.tencent.mm.R.string.i88);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }
}
