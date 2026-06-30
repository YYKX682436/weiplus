package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class c1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic f158716b;

    public c1(com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic, java.lang.String str) {
        this.f158716b = scanCodeSheetItemLogic;
        this.f158715a = str;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        if (aq3Var == null) {
            return;
        }
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic = this.f158716b;
        scanCodeSheetItemLogic.f158648e = aq3Var;
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic.a(scanCodeSheetItemLogic, aq3Var);
        java.util.HashMap hashMap = scanCodeSheetItemLogic.f158653m;
        java.lang.String str = this.f158715a;
        hashMap.put(str, aq3Var);
        kd0.n2 n2Var = scanCodeSheetItemLogic.f158650g;
        if (n2Var != null) {
            n2Var.a();
        }
        kd0.o2 o2Var = scanCodeSheetItemLogic.f158651h;
        if (o2Var != null) {
            o2Var.K0(str, scanCodeSheetItemLogic.f158648e);
        }
    }
}
