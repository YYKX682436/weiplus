package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class b2 extends com.tencent.mm.ui.widget.dialog.k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f157644d;

    /* renamed from: e, reason: collision with root package name */
    public int f157645e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f157646f;

    public b2(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494795wh);
        this.f157645e = 0;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.ce9, null);
        this.f157644d = inflate;
        setContentView(inflate);
        ((android.widget.Button) this.f157644d.findViewById(com.tencent.mm.R.id.b5i)).setOnClickListener(this);
        ((android.widget.Button) this.f157644d.findViewById(com.tencent.mm.R.id.h87)).setOnClickListener(this);
    }

    public static com.tencent.mm.plugin.remittance.ui.b2 c(android.content.Context context, int i17, double d17, double d18, java.lang.String str, double d19, double d27, java.lang.String str2, android.view.View.OnClickListener onClickListener) {
        com.tencent.mars.xlog.Log.i("RemittanceChargeDialog", "showCostDetail");
        com.tencent.mm.plugin.remittance.ui.b2 b2Var = new com.tencent.mm.plugin.remittance.ui.b2(context);
        b2Var.f157645e = i17;
        if (d18 == 0.0d) {
            com.tencent.mars.xlog.Log.i("RemittanceChargeDialog", "showCostDetail ::: remian_fee = 0");
        }
        ((android.widget.TextView) b2Var.findViewById(com.tencent.mm.R.id.lx8)).setText(com.tencent.mm.wallet_core.ui.r1.m(d18));
        ((android.widget.TextView) b2Var.findViewById(com.tencent.mm.R.id.dij)).setText(com.tencent.mm.wallet_core.ui.r1.m(d19));
        if (d27 == 0.0d) {
            com.tencent.mars.xlog.Log.e("RemittanceChargeDialog", "showCostDetail ::: transaction_costs = 0");
        }
        ((android.widget.TextView) b2Var.findViewById(com.tencent.mm.R.id.oiz)).setText(com.tencent.mm.wallet_core.ui.r1.m(d27));
        android.view.View findViewById = b2Var.findViewById(com.tencent.mm.R.id.f486615lv2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            android.widget.TextView textView = (android.widget.TextView) b2Var.findViewById(com.tencent.mm.R.id.f486620lw1);
            textView.setText(str2);
            textView.setVisibility(0);
        }
        android.view.View findViewById2 = b2Var.findViewById(com.tencent.mm.R.id.o_m);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (onClickListener != null) {
            b2Var.f157646f = onClickListener;
            b2Var.findViewById(com.tencent.mm.R.id.khs).setOnClickListener(new com.tencent.mm.plugin.remittance.ui.a2(b2Var));
        }
        b2Var.show();
        db5.e1.a(context, b2Var);
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 10, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 1, 1);
        }
        return b2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() != com.tencent.mm.R.id.khs) {
            com.tencent.mars.xlog.Log.i("RemittanceChargeDialog", "click cancel");
            dismiss();
        }
        if (view.getId() == com.tencent.mm.R.id.b5i) {
            if (this.f157645e == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 11, 1);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 2, 1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
