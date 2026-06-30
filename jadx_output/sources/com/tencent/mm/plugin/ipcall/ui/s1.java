package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallDialUI f143003d;

    public s1(com.tencent.mm.plugin.ipcall.ui.IPCallDialUI iPCallDialUI) {
        this.f143003d = iPCallDialUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f143003d.finish();
    }
}
