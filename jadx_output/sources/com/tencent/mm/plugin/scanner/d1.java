package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.e1 f158719d;

    public d1(com.tencent.mm.plugin.scanner.e1 e1Var) {
        this.f158719d = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.e1 e1Var = this.f158719d;
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic = e1Var.f158721e;
        r45.aq3 aq3Var = scanCodeSheetItemLogic.f158648e;
        if (aq3Var == null || aq3Var == scanCodeSheetItemLogic.f158649f) {
            r45.aq3 aq3Var2 = scanCodeSheetItemLogic.f158649f;
            scanCodeSheetItemLogic.f158648e = aq3Var2;
            com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic.a(scanCodeSheetItemLogic, aq3Var2);
            kd0.n2 n2Var = e1Var.f158721e.f158650g;
            if (n2Var != null) {
                n2Var.a();
            }
            com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic2 = e1Var.f158721e;
            kd0.o2 o2Var = scanCodeSheetItemLogic2.f158651h;
            if (o2Var != null) {
                o2Var.K0(e1Var.f158720d, scanCodeSheetItemLogic2.f158648e);
            }
        }
    }
}
