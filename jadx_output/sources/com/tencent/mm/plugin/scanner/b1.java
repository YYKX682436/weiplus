package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class b1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic f158680b;

    public b1(com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic, java.lang.String str) {
        this.f158680b = scanCodeSheetItemLogic;
        this.f158679a = str;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        if (aq3Var == null) {
            return;
        }
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic = this.f158680b;
        if (scanCodeSheetItemLogic.f158648e == scanCodeSheetItemLogic.f158649f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeSheetItemLogic", "net call back after 1s");
            return;
        }
        if (!scanCodeSheetItemLogic.f158655o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeSheetItemLogic", "enableCallback false");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.ScanCodeSheetItemLogic");
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic2 = this.f158680b;
        scanCodeSheetItemLogic2.f158648e = aq3Var;
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic.a(scanCodeSheetItemLogic2, aq3Var);
        this.f158680b.f158653m.put(this.f158679a, aq3Var);
        kd0.n2 n2Var = this.f158680b.f158650g;
        if (n2Var != null) {
            n2Var.a();
        }
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic3 = this.f158680b;
        kd0.o2 o2Var = scanCodeSheetItemLogic3.f158651h;
        if (o2Var != null) {
            o2Var.K0(this.f158679a, scanCodeSheetItemLogic3.f158648e);
        }
    }
}
