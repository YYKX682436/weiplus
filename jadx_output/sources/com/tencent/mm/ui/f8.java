package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class f8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LauncherUI f208428d;

    public f8(com.tencent.mm.ui.LauncherUI launcherUI) {
        this.f208428d = launcherUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.ArrayList arrayList = com.tencent.mm.ui.LauncherUI.f196826y;
        com.tencent.mm.ui.LauncherUI launcherUI = this.f208428d;
        launcherUI.l7(true);
        com.tencent.mm.ui.LauncherUI.B = false;
        gm0.j1.n().f273288b.g(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.o0());
        launcherUI.m7();
    }
}
