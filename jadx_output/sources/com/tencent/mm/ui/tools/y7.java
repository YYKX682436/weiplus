package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class y7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewTaskUI f210925d;

    public y7(com.tencent.mm.ui.tools.NewTaskUI newTaskUI) {
        this.f210925d = newTaskUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dkwt dlg imgSid:");
        com.tencent.mm.ui.tools.NewTaskUI newTaskUI = this.f210925d;
        sb6.append(newTaskUI.f210135f.f210481b);
        sb6.append(" img len");
        sb6.append(newTaskUI.f210135f.f210483d.length);
        sb6.append(" ");
        sb6.append(fp.k.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTaskUI", sb6.toString());
        com.tencent.mm.ui.applet.SecurityImage securityImage = newTaskUI.f210134e;
        if (securityImage == null) {
            return;
        }
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(newTaskUI.f210135f.f210484e, securityImage.getSecImgCode(), newTaskUI.f210134e.getSecImgSid(), newTaskUI.f210134e.getSecImgEncryptKey());
        c01.d9.e().g(v0Var);
        com.tencent.mm.ui.tools.NewTaskUI newTaskUI2 = this.f210925d;
        newTaskUI2.f210136g = db5.e1.Q(newTaskUI2, newTaskUI2.getString(com.tencent.mm.R.string.f490573yv), newTaskUI.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.ui.tools.x7(this, v0Var));
    }
}
