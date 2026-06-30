package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class i1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanCardUI f159563d;

    public i1(com.tencent.mm.plugin.scanner.ui.ScanCardUI scanCardUI) {
        this.f159563d = scanCardUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.scanner.ui.ScanCardUI scanCardUI = this.f159563d;
        scanCardUI.f159334g = true;
        scanCardUI.finish();
    }
}
