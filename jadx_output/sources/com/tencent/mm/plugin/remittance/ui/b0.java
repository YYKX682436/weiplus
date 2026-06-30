package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f157640a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.ui.a0 f157641b;

    /* renamed from: c, reason: collision with root package name */
    public r45.o10 f157642c;

    public b0(android.content.Context context) {
        this.f157640a = context;
    }

    public void a(int i17, java.lang.String str, r45.o10 o10Var, com.tencent.mm.plugin.remittance.ui.a0 a0Var, java.lang.String str2, java.lang.String str3) {
        this.f157641b = a0Var;
        this.f157642c = o10Var;
        android.content.Context context = this.f157640a;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.ccc, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ht7);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.g6u);
        ((com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.cgi)).b(this.f157642c.f381811e);
        textView.setText(o10Var.f381812f);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.u(this.f157642c.f381810d);
        u1Var.d(inflate);
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.remittance.model.r1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.remittance.model.r1.class)).setValue("real_name_dialog_title_key", this.f157642c.f381810d);
        java.lang.String string = !com.tencent.mm.sdk.platformtools.t8.K0(str2) ? str2 : context.getResources().getString(com.tencent.mm.R.string.f490568yq);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str3 = context.getResources().getString(com.tencent.mm.R.string.f490347sg);
        }
        u1Var.n(string);
        u1Var.j(str3);
        ck5.f b17 = ck5.f.b(editText);
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
        b17.f42561f = 1;
        b17.f42560e = 1;
        b17.f42556a = false;
        b17.f42557b = false;
        b17.d(null);
        editText.setMaxLines(1);
        editText.addTextChangedListener(new com.tencent.mm.plugin.remittance.ui.r(this, u1Var, editText));
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.remittance.ui.s(this, editText), 200L);
        com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct();
        wCPayTrasnferCheckRealNameReportStruct.f62128f = i17;
        wCPayTrasnferCheckRealNameReportStruct.p(str);
        wCPayTrasnferCheckRealNameReportStruct.f62126d = 1L;
        wCPayTrasnferCheckRealNameReportStruct.k();
        u1Var.b(new com.tencent.mm.plugin.remittance.ui.t(this, i17, str, editText));
        u1Var.q(false);
        if (u1Var.f211998c == null || !com.tencent.mm.sdk.platformtools.t8.J0(editText.getText())) {
            return;
        }
        u1Var.f211998c.f(-1).setEnabled(false);
        u1Var.f211998c.B(-2141754475);
    }
}
