package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes7.dex */
public class g4 extends android.app.ProgressDialog {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f211802d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f211803e;

    public g4(android.content.Context context, int i17) {
        super(context, i17);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dig, null);
        this.f211802d = inflate;
        this.f211803e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3);
        setCanceledOnTouchOutside(true);
    }

    public static com.tencent.mm.ui.widget.dialog.g4 b(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.tencent.mm.ui.widget.dialog.g4 g4Var = new com.tencent.mm.ui.widget.dialog.g4(context, com.tencent.mm.R.style.f494676n3);
        g4Var.setMessage(charSequence);
        g4Var.setCancelable(z17);
        g4Var.setOnCancelListener(onCancelListener);
        g4Var.setCanceledOnTouchOutside(z17);
        return g4Var;
    }

    public static com.tencent.mm.ui.widget.dialog.g4 c(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.tencent.mm.ui.widget.dialog.g4 b17 = b(context, charSequence, z17, onCancelListener);
        b17.show();
        return b17;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("WeUI.WeUIProgresssDialog", "dismiss exception, e = " + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f211802d, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(java.lang.CharSequence charSequence) {
        this.f211803e.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.d("WeUI.WeUIProgresssDialog", e17, "", new java.lang.Object[0]);
        }
    }
}
