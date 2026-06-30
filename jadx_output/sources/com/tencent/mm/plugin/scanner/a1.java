package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class a1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd0.n2 f158660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic f158661c;

    public a1(com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic, java.lang.String str, kd0.n2 n2Var) {
        this.f158661c = scanCodeSheetItemLogic;
        this.f158659a = str;
        this.f158660b = n2Var;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        if (aq3Var == null) {
            return;
        }
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic = this.f158661c;
        scanCodeSheetItemLogic.f158648e = aq3Var;
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic.a(scanCodeSheetItemLogic, aq3Var);
        scanCodeSheetItemLogic.f158653m.put(this.f158659a, aq3Var);
        kd0.n2 n2Var = this.f158660b;
        if (n2Var != null) {
            n2Var.a();
        }
    }
}
