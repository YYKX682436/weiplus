package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f143038d;

    public v0(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI) {
        this.f143038d = iPCallContactUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f143038d;
        iPCallContactUI.finish();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = iPCallContactUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
