package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class j5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI f142884d;

    public j5(com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI) {
        this.f142884d = iPCallTalkUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI = this.f142884d;
        iPCallTalkUI.finish();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = iPCallTalkUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
