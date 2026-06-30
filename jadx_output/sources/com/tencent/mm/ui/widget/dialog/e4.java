package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class e4 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f211774a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f211775b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f211776c;

    /* renamed from: d, reason: collision with root package name */
    public int f211777d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f211778e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f211779f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f211780g = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f211781h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f211782i = null;

    public e4(android.content.Context context) {
        this.f211775b = context;
    }

    public com.tencent.mm.ui.widget.dialog.f4 a() {
        com.tencent.mm.ui.widget.dialog.f4 f4Var = new com.tencent.mm.ui.widget.dialog.f4(this.f211775b, com.tencent.mm.R.style.f494676n3, this.f211780g, this.f211779f);
        java.lang.CharSequence charSequence = this.f211776c;
        android.widget.TextView textView = f4Var.f211792e;
        if (textView != null) {
            textView.setText(charSequence);
        }
        int i17 = this.f211777d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = f4Var.f211793f;
        if (weImageView != null) {
            weImageView.setImageResource(i17);
        }
        f4Var.setCancelable(this.f211778e);
        f4Var.setCanceledOnTouchOutside(false);
        f4Var.setOnCancelListener(this.f211781h);
        f4Var.setOnDismissListener(this.f211782i);
        f4Var.f211791d = this;
        this.f211774a = f4Var;
        return f4Var;
    }

    public com.tencent.mm.ui.widget.dialog.e4 b(int i17) {
        this.f211777d = i17;
        if (i17 > 0) {
            this.f211780g = 1;
        }
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.f4 c() {
        android.content.Context context = this.f211775b;
        if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) this.f211775b).isDestroyed()) {
            if (this.f211774a == null) {
                this.f211774a = a();
            }
            this.f211774a.show();
            int i17 = this.f211780g;
            if (i17 == 0 || i17 == 1) {
                new android.os.Handler().postDelayed(new com.tencent.mm.ui.widget.dialog.d4(this), 2000);
            }
            return this.f211774a;
        }
        if (this.f211775b == null) {
            com.tencent.mm.ui.yk.b("MicroMsg.WeToast", "Context is null, cannot show WeToast", new java.lang.Object[0]);
            return null;
        }
        com.tencent.mm.ui.AlertActivity.f196560q = this;
        android.content.Intent intent = new android.content.Intent(this.f211775b, (java.lang.Class<?>) com.tencent.mm.ui.AlertActivity.class);
        intent.setFlags(335544320);
        intent.putExtra("dialog_scene", 5);
        android.content.Context context2 = this.f211775b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/WeToast$Builder", "show", "()Lcom/tencent/mm/ui/widget/dialog/WeToast;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/WeToast$Builder", "show", "()Lcom/tencent/mm/ui/widget/dialog/WeToast;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }

    public com.tencent.mm.ui.widget.dialog.e4 d(int i17) {
        this.f211776c = this.f211775b.getText(i17);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.f4 e() {
        int i17;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f211774a;
        if (f4Var != null) {
            java.lang.CharSequence charSequence = this.f211776c;
            android.widget.TextView textView = f4Var.f211792e;
            if (textView != null) {
                textView.setText(charSequence);
            }
            int i18 = this.f211777d;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = f4Var.f211793f;
            if (weImageView != null) {
                weImageView.setImageResource(i18);
            }
            f4Var.setCancelable(this.f211778e);
            f4Var.setCanceledOnTouchOutside(false);
            f4Var.setOnCancelListener(this.f211781h);
            f4Var.setOnDismissListener(this.f211782i);
            f4Var.f211791d = this;
            int i19 = this.f211780g;
            f4Var.f211796i = i19;
            if (i19 == 1) {
                f4Var.f211793f.setVisibility(0);
                f4Var.f211794g.setVisibility(8);
            } else if (i19 == 2) {
                f4Var.f211793f.setVisibility(8);
                f4Var.f211794g.setVisibility(0);
            }
            this.f211774a = f4Var;
            android.content.Context context = this.f211775b;
            if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) this.f211775b).isDestroyed() && ((i17 = this.f211780g) == 0 || i17 == 1)) {
                new android.os.Handler().postDelayed(new com.tencent.mm.ui.widget.dialog.b4(this), 2000);
            }
        }
        return f4Var;
    }
}
