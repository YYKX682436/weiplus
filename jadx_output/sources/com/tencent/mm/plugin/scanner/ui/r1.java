package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public final class r1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanPassportUI f159620d;

    public r1(com.tencent.mm.plugin.scanner.ui.ScanPassportUI scanPassportUI) {
        this.f159620d = scanPassportUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.scanner.ui.ScanPassportUI scanPassportUI = this.f159620d;
        scanPassportUI.f159346f = true;
        scanPassportUI.finish();
    }
}
