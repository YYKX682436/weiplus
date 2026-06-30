package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public final class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanPassportUI f159648d;

    public t1(com.tencent.mm.plugin.scanner.ui.ScanPassportUI scanPassportUI) {
        this.f159648d = scanPassportUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.scanner.ui.ScanPassportUI scanPassportUI = this.f159648d;
        scanPassportUI.f159346f = true;
        scanPassportUI.finish();
    }
}
