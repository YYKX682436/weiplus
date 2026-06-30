package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class z5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.l6 f143096d;

    public z5(com.tencent.mm.plugin.ipcall.ui.l6 l6Var) {
        this.f143096d = l6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "user choose end this call because isNotFree");
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f143096d;
        l6Var.f142926y.j(0, 0);
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(42);
        l6Var.f142924w.finish();
    }
}
