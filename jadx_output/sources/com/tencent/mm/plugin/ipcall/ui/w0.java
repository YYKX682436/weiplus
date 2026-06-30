package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class w0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f143055d;

    public w0(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI) {
        this.f143055d = iPCallContactUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f143055d.finish();
    }
}
