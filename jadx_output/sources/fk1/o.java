package fk1;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f263284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263285e;

    public o(int i17, com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263284d = i17;
        this.f263285e = wAGameRecordShareUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("app_brand_game_record_education_flag_");
        int i17 = this.f263284d;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        boolean i18 = com.tencent.mm.sdk.platformtools.o4.L().i(sb7, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: scene " + i17 + " is shown education " + i18);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        int i19 = i18 ? com.tencent.mm.R.layout.f488034ez : com.tencent.mm.R.layout.f488033ey;
        long j17 = 2;
        if (i17 == 1) {
            h0Var.f310123d = "{\"sharetype\": 1}";
        } else if (i17 != 2) {
            j17 = i17 != 3 ? 1000L : 1L;
        } else {
            h0Var.f310123d = "{\"sharetype\": 2}";
        }
        long j18 = j17;
        if (!i18 || i17 == 3) {
            com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263285e;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(wAGameRecordShareUI, 2, 0);
            jz5.f0 f0Var2 = null;
            android.view.View inflate = android.view.LayoutInflater.from(wAGameRecordShareUI).inflate(i19, (android.view.ViewGroup) null);
            java.lang.String string = (i17 == 1 || i17 == 2) ? wAGameRecordShareUI.getString(com.tencent.mm.R.string.a1s) : i17 != 3 ? null : i18 ? wAGameRecordShareUI.getString(com.tencent.mm.R.string.a1t) : wAGameRecordShareUI.getString(com.tencent.mm.R.string.a1u);
            java.lang.String string2 = i17 == 3 ? i18 ? wAGameRecordShareUI.getString(com.tencent.mm.R.string.a1q) : wAGameRecordShareUI.getString(com.tencent.mm.R.string.a1r) : null;
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.d9t);
            jz5.f0 f0Var3 = jz5.f0.f302826a;
            if (string != null) {
                textView.setText(string);
                textView.setVisibility(0);
                f0Var = f0Var3;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.d9n);
            if (string2 != null) {
                textView2.setText(string2);
                textView2.setVisibility(0);
                f0Var2 = f0Var3;
            }
            if (f0Var2 == null) {
                textView2.setVisibility(8);
            }
            z2Var.j(inflate);
            z2Var.y(wAGameRecordShareUI.getString(com.tencent.mm.R.string.f490454vi));
            z2Var.x(1);
            z2Var.F = new fk1.n(wAGameRecordShareUI, j18, h0Var, z2Var);
            z2Var.u(wAGameRecordShareUI.W6(i19));
            z2Var.C();
            wAGameRecordShareUI.Z6(602L, j18, 1, 1, (java.lang.String) h0Var.f310123d);
            com.tencent.mm.sdk.platformtools.o4.L().G(sb7, true);
        }
    }
}
