package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class t implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f157942c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f157943d;

    public t(com.tencent.mm.plugin.remittance.ui.b0 b0Var, int i17, java.lang.String str, android.widget.EditText editText) {
        this.f157943d = b0Var;
        this.f157940a = i17;
        this.f157941b = str;
        this.f157942c = editText;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.remittance.ui.b0 b0Var = this.f157943d;
        android.widget.EditText editText = this.f157942c;
        java.lang.String str2 = this.f157941b;
        int i17 = this.f157940a;
        if (z17) {
            com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct();
            wCPayTrasnferCheckRealNameReportStruct.f62128f = i17;
            wCPayTrasnferCheckRealNameReportStruct.p(str2);
            wCPayTrasnferCheckRealNameReportStruct.f62126d = 3L;
            wCPayTrasnferCheckRealNameReportStruct.k();
            b0Var.f157641b.onINputName(editText.getText().toString());
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct();
        wCPayTrasnferCheckRealNameReportStruct2.f62128f = i17;
        wCPayTrasnferCheckRealNameReportStruct2.p(str2);
        wCPayTrasnferCheckRealNameReportStruct2.f62126d = 2L;
        wCPayTrasnferCheckRealNameReportStruct2.k();
        editText.clearFocus();
        b0Var.f157641b.onCancel();
    }
}
