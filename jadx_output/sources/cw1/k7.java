package cw1;

/* loaded from: classes11.dex */
public final class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI f223092d;

    public k7(com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI) {
        this.f223092d = storageDisableAlertUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI.f95799h;
        com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI = this.f223092d;
        storageDisableAlertUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "showDialogView");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(storageDisableAlertUI);
        storageDisableAlertUI.f95803g = y1Var;
        y1Var.i(false);
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = storageDisableAlertUI.f95803g;
        if (y1Var2 == null) {
            kotlin.jvm.internal.o.o("dialog");
            throw null;
        }
        y1Var2.H = false;
        android.view.View inflate = android.view.LayoutInflater.from(storageDisableAlertUI).inflate(com.tencent.mm.R.layout.e2z, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484105t45);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t47);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484103t43);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484102t42);
        fp.r0 r0Var = fp.r0.f265232a;
        long j17 = l75.d1.f316946b;
        if (j17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "getThresholdWording by exptConf, threshold=" + j17);
            str = fp.n0.a(j17);
        } else {
            str = (java.lang.String) r0Var.d().f302843f;
        }
        textView.setText(storageDisableAlertUI.getString(com.tencent.mm.R.string.ndw, str));
        double d17 = storageDisableAlertUI.f95800d;
        if (d17 < 0.0d) {
            textView2.setVisibility(8);
        } else if (d17 < 1.0d) {
            textView2.setText(storageDisableAlertUI.getString(com.tencent.mm.R.string.ndy));
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((long) storageDisableAlertUI.f95800d);
            sb6.append('%');
            textView2.setText(storageDisableAlertUI.getString(com.tencent.mm.R.string.ndx, sb6.toString()));
        }
        jx3.f.INSTANCE.d(25984, 201, "", "", "", java.lang.Double.valueOf(storageDisableAlertUI.f95800d));
        textView3.setOnClickListener(new cw1.n7(storageDisableAlertUI));
        textView4.setOnClickListener(new cw1.o7(storageDisableAlertUI));
        com.tencent.mm.ui.widget.dialog.y1 y1Var3 = storageDisableAlertUI.f95803g;
        if (y1Var3 == null) {
            kotlin.jvm.internal.o.o("dialog");
            throw null;
        }
        y1Var3.k(inflate);
        com.tencent.mm.ui.widget.dialog.y1 y1Var4 = storageDisableAlertUI.f95803g;
        if (y1Var4 == null) {
            kotlin.jvm.internal.o.o("dialog");
            throw null;
        }
        y1Var4.s();
        l75.d1.f316949e = true;
        if (z65.c.a()) {
            textView.setOnLongClickListener(new cw1.p7(storageDisableAlertUI));
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }
}
