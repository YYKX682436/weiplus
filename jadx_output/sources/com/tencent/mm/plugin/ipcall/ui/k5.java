package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class k5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI f142892d;

    public k5(com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI) {
        this.f142892d = iPCallTalkUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f142892d.finish();
    }
}
