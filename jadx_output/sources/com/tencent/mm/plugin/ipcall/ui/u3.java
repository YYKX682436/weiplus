package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class u3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f143024d;

    public u3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f143024d = iPCallRechargeUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f143024d.finish();
    }
}
