package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class a3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI f142751d;

    public a3(com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI) {
        this.f142751d = iPCallPackageUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        q83.e eVar = this.f142751d.f142649n;
        eVar.f360763i++;
        eVar.b();
    }
}
