package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public abstract class rv {
    public static void a(android.content.Context context, final android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showWelComePage", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("HalfBottomDialog", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
        final com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0, true);
        z2Var.i(com.tencent.mm.R.layout.dpg);
        z2Var.x(1);
        z2Var.y(i65.a.r(context, com.tencent.mm.R.string.f490454vi));
        z2Var.F = new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.sns.ui.rv$$a
            @Override // com.tencent.mm.ui.widget.dialog.p3
            public final void a() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$HalfBottomDialog$0", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
                com.tencent.mm.ui.widget.dialog.z2.this.B();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$HalfBottomDialog$0", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
            }
        };
        z2Var.l(new com.tencent.mm.ui.widget.dialog.q3() { // from class: com.tencent.mm.plugin.sns.ui.rv$$b
            @Override // com.tencent.mm.ui.widget.dialog.q3
            public final void dismiss() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$HalfBottomDialog$1", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
                gm0.j1.i();
                int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(68385, null), 0) + 1;
                gm0.j1.i();
                gm0.j1.u().c().w(68385, java.lang.Integer.valueOf(j17));
                onClickListener.onClick(null, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$HalfBottomDialog$1", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
            }
        });
        z2Var.C();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("HalfBottomDialog", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showWelComePage", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
    }
}
