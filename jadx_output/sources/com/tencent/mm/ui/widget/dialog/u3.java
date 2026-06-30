package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class u3 extends com.tencent.mm.ui.widget.dialog.v3 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f212004d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f212005e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f212006f;

    /* renamed from: g, reason: collision with root package name */
    public final int f212007g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.t3 f212008h;

    public u3(android.content.Context context, int i17, int i18) {
        super(context, i17);
        this.f212007g = i18;
        android.view.View inflate = android.view.View.inflate(getContext(), (i18 == 0 || i18 != 1) ? com.tencent.mm.R.layout.c1_ : com.tencent.mm.R.layout.c1b, null);
        this.f212006f = inflate;
        this.f212004d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jma);
        this.f212005e = (android.widget.ProgressBar) this.f212006f.findViewById(com.tencent.mm.R.id.jm_);
        setCanceledOnTouchOutside(true);
    }

    public static com.tencent.mm.ui.widget.dialog.u3 b(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (i18 <= 0) {
            i18 = com.tencent.mm.R.style.f494791wd;
            if (i17 != 0 && i17 != 1 && i17 != 2) {
                i18 = com.tencent.mm.R.style.f494796wi;
            }
        }
        com.tencent.mm.ui.widget.dialog.t3 t3Var = new com.tencent.mm.ui.widget.dialog.t3(context);
        t3Var.f211982c = charSequence;
        t3Var.f211984e = i17;
        t3Var.f211985f = i18;
        t3Var.f211983d = z17;
        t3Var.f211989j = onCancelListener;
        return t3Var.a();
    }

    public static com.tencent.mm.ui.widget.dialog.u3 c(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return b(context, charSequence, z17, i17, -1, onCancelListener);
    }

    public static com.tencent.mm.ui.widget.dialog.u3 e(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.tencent.mm.ui.widget.dialog.u3 b17 = b(context, charSequence, z17, i17, i18, onCancelListener);
        com.tencent.mm.ui.widget.dialog.t3 t3Var = b17.f212008h;
        if (t3Var.b(t3Var.f211981b)) {
            if (t3Var.f211980a == null) {
                t3Var.f211980a = t3Var.a();
            }
            t3Var.f211980a.show();
        } else {
            com.tencent.mm.ui.AlertActivity.f196559p = t3Var;
            android.content.Intent intent = new android.content.Intent(t3Var.f211981b, (java.lang.Class<?>) com.tencent.mm.ui.AlertActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 4);
            android.content.Context context2 = t3Var.f211981b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMProgressDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/MMProgressDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return b17;
    }

    public static com.tencent.mm.ui.widget.dialog.u3 f(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return e(context, charSequence, z17, i17, -1, onCancelListener);
    }

    @Override // com.tencent.mm.ui.widget.dialog.v3, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.tencent.mm.ui.widget.dialog.s3 s3Var;
        try {
            com.tencent.mm.ui.widget.dialog.t3 t3Var = this.f212008h;
            if (t3Var != null && (s3Var = t3Var.f211986g) != null && t3Var.f211980a != this) {
                com.tencent.mm.ui.c0 c0Var = (com.tencent.mm.ui.c0) s3Var;
                com.tencent.mm.ui.widget.dialog.u3 u3Var = c0Var.f198067a;
                if (u3Var.isShowing()) {
                    u3Var.dismiss();
                }
                c0Var.f198068b.finish();
            }
            com.tencent.mm.ui.widget.dialog.t3 t3Var2 = this.f212008h;
            if (t3Var2 != null) {
                t3Var2.f211987h = true;
            }
            super.dismiss();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f212006f, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        if (this.f212007g == 2) {
            getWindow().addFlags(2);
            attributes.dimAmount = 0.65f;
        }
        onWindowAttributesChanged(attributes);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(java.lang.CharSequence charSequence) {
        this.f212004d.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        com.tencent.mm.ui.widget.dialog.t3 t3Var = this.f212008h;
        if (t3Var == null || t3Var.f211980a == this) {
            return;
        }
        t3Var.f211989j = onCancelListener;
        com.tencent.mm.ui.widget.dialog.s3 s3Var = t3Var.f211986g;
        if (s3Var != null) {
            ((com.tencent.mm.ui.c0) s3Var).f198067a.setOnCancelListener(onCancelListener);
        }
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        com.tencent.mm.ui.widget.dialog.t3 t3Var = this.f212008h;
        if (t3Var == null || t3Var.f211980a == this) {
            return;
        }
        t3Var.f211988i = onDismissListener;
        com.tencent.mm.ui.widget.dialog.s3 s3Var = t3Var.f211986g;
        if (s3Var != null) {
            ((com.tencent.mm.ui.c0) s3Var).f198067a.setOnDismissListener(onDismissListener);
        }
    }

    @Override // android.app.Dialog
    public void setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
        com.tencent.mm.ui.widget.dialog.t3 t3Var = this.f212008h;
        if (t3Var == null || t3Var.f211980a == this) {
            return;
        }
        t3Var.f211991l = onKeyListener;
        com.tencent.mm.ui.widget.dialog.s3 s3Var = t3Var.f211986g;
        if (s3Var != null) {
            ((com.tencent.mm.ui.c0) s3Var).f198067a.setOnKeyListener(onKeyListener);
        }
    }

    @Override // android.app.Dialog
    public void setOnShowListener(android.content.DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
        com.tencent.mm.ui.widget.dialog.t3 t3Var = this.f212008h;
        if (t3Var == null || t3Var.f211980a == this) {
            return;
        }
        t3Var.f211990k = onShowListener;
        com.tencent.mm.ui.widget.dialog.s3 s3Var = t3Var.f211986g;
        if (s3Var != null) {
            ((com.tencent.mm.ui.c0) s3Var).f198067a.setOnShowListener(onShowListener);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        com.tencent.mm.ui.widget.dialog.s3 s3Var;
        try {
            com.tencent.mm.ui.widget.dialog.t3 t3Var = this.f212008h;
            if (t3Var != null && (s3Var = t3Var.f211986g) != null && t3Var.f211980a != this) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var = ((com.tencent.mm.ui.c0) s3Var).f198067a;
                if (!u3Var.isShowing()) {
                    u3Var.show();
                }
            }
            com.tencent.mm.ui.widget.dialog.t3 t3Var2 = this.f212008h;
            if (t3Var2 != null) {
                t3Var2.f211987h = false;
            }
            super.show();
        } catch (java.lang.Exception unused) {
        }
    }
}
