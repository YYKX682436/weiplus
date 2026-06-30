package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class r1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallDialUI f142993d;

    public r1(com.tencent.mm.plugin.ipcall.ui.IPCallDialUI iPCallDialUI) {
        this.f142993d = iPCallDialUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f142993d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
