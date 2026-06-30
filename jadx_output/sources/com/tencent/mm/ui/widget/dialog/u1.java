package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes11.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.i0 f211996a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f211997b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f211998c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f211999d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f212000e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RadioGroup f212001f;

    public u1(android.content.Context context) {
        this.f211999d = null;
        this.f212000e = null;
        this.f211997b = context;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        this.f211996a = i0Var;
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.A = false;
        aVar.B = false;
        aVar.f211725o = new com.tencent.mm.ui.widget.dialog.n1(this);
        this.f212000e = context.getResources().getString(com.tencent.mm.R.string.apj);
        this.f211999d = context.getResources().getString(com.tencent.mm.R.string.apu);
    }

    public com.tencent.mm.ui.widget.dialog.u1 a(boolean z17) {
        com.tencent.mm.ui.widget.dialog.a aVar = this.f211996a.f211821b;
        aVar.A = z17;
        aVar.B = z17;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 b(com.tencent.mm.ui.widget.dialog.w1 w1Var) {
        android.widget.RadioGroup radioGroup = this.f212001f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f211998c);
        }
        l(w1Var);
        i(w1Var);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 c(com.tencent.mm.ui.widget.dialog.w1 w1Var, com.tencent.mm.ui.widget.dialog.w1 w1Var2) {
        android.widget.RadioGroup radioGroup = this.f212001f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f211998c);
        }
        i(w1Var);
        l(w1Var2);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 d(android.view.View view) {
        this.f211996a.f211821b.L = view;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 e(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f211996a.f211821b.H = onDismissListener;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 f(java.lang.Boolean bool) {
        this.f211996a.f211821b.f211716f = bool.booleanValue();
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 g(java.lang.String str) {
        this.f211996a.f211821b.f211729s = str;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 h(java.lang.CharSequence charSequence) {
        int i17 = (int) (com.tencent.mm.ui.zk.f212638b * 14.0f);
        android.content.Context context = this.f211997b;
        com.tencent.mm.ui.zk.a(context, i17);
        if (charSequence != null && charSequence.length() > 0) {
            charSequence = pg5.d.a(context, charSequence.toString());
        }
        this.f211996a.f211821b.f211730t = charSequence;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 i(com.tencent.mm.ui.widget.dialog.w1 w1Var) {
        java.lang.String str = this.f212000e;
        if (str == null || (str != null && str.length() == 0)) {
            this.f212000e = this.f211997b.getResources().getString(com.tencent.mm.R.string.apj);
        }
        android.widget.RadioGroup radioGroup = this.f212001f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f211998c);
        }
        java.lang.String str2 = this.f212000e;
        com.tencent.mm.ui.widget.dialog.a aVar = this.f211996a.f211821b;
        aVar.f211733w = str2;
        aVar.F = new com.tencent.mm.ui.widget.dialog.o1(this, w1Var);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 j(java.lang.String str) {
        this.f212000e = str;
        this.f211996a.f211821b.f211733w = str;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 k(int i17) {
        this.f211996a.f211821b.W = i17;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 l(com.tencent.mm.ui.widget.dialog.w1 w1Var) {
        java.lang.String str = this.f211999d;
        if (str == null || (str != null && str.length() == 0)) {
            this.f211999d = this.f211997b.getResources().getString(com.tencent.mm.R.string.apu);
        }
        android.widget.RadioGroup radioGroup = this.f212001f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f211998c);
        }
        java.lang.String str2 = this.f211999d;
        com.tencent.mm.ui.widget.dialog.a aVar = this.f211996a.f211821b;
        aVar.f211732v = str2;
        aVar.E = new com.tencent.mm.ui.widget.dialog.p1(this, w1Var);
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 m(int i17) {
        java.lang.String string = this.f211997b.getResources().getString(i17);
        this.f211999d = string;
        this.f211996a.f211821b.f211732v = string;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 n(java.lang.String str) {
        this.f211999d = str;
        this.f211996a.f211821b.f211732v = str;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 o(java.lang.String str) {
        this.f211996a.f211821b.f211714d = str;
        return this;
    }

    public void p() {
        q(false);
    }

    public void q(boolean z17) {
        android.content.Context context = this.f211997b;
        boolean z18 = context instanceof android.app.Activity;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = this.f211996a;
        if (z18) {
            if (this.f211998c == null) {
                this.f211998c = z17 ? i0Var.b(true) : i0Var.a();
            }
            this.f211998c.show();
            return;
        }
        com.tencent.mm.ui.AlertActivity.f196556m = i0Var;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.AlertActivity.class);
        intent.setFlags(335544320);
        android.content.Context context2 = this.f211997b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMConfirmDialog$Builder", "show", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/MMConfirmDialog$Builder", "show", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public com.tencent.mm.ui.widget.dialog.u1 r(boolean z17) {
        this.f211996a.f211821b.f211710a0 = z17;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.j0 s() {
        if (this.f211998c == null) {
            this.f211998c = this.f211996a.a();
        }
        android.view.Window window = this.f211998c.getWindow();
        if (window != null) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                window.setType(2038);
            } else {
                window.setType(2002);
            }
            window.addFlags(524288);
            com.tencent.mm.ui.yk.a("dialog", "show top window not null!!", new java.lang.Object[0]);
        }
        this.f211998c.show();
        return this.f211998c;
    }

    public com.tencent.mm.ui.widget.dialog.u1 t(java.util.ArrayList arrayList, android.widget.RadioGroup.OnCheckedChangeListener onCheckedChangeListener, int i17) {
        android.content.Context context = this.f211997b;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.a4f, null);
        this.f212001f = (android.widget.RadioGroup) inflate.findViewById(com.tencent.mm.R.id.lhv);
        int size = arrayList != null ? arrayList.size() : 0;
        for (int i18 = 0; i18 < size; i18++) {
            android.widget.RadioButton radioButton = (android.widget.RadioButton) android.view.View.inflate(context, com.tencent.mm.R.layout.a4e, null);
            radioButton.setId(i18);
            if (i18 == i17) {
                radioButton.setChecked(true);
            }
            radioButton.setText((java.lang.CharSequence) arrayList.get(i18));
            this.f212001f.addView(radioButton);
        }
        this.f212001f.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f211996a.f211821b.L = inflate;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 u(java.lang.CharSequence charSequence) {
        int i17 = (int) (com.tencent.mm.ui.zk.f212638b * 20.0f);
        android.content.Context context = this.f211997b;
        com.tencent.mm.ui.zk.a(context, i17);
        if (charSequence != null && charSequence.length() > 0) {
            charSequence = pg5.d.a(context, charSequence.toString());
        }
        this.f211996a.f211821b.f211709a = charSequence;
        return this;
    }

    public com.tencent.mm.ui.widget.dialog.u1 v(com.tencent.mm.ui.widget.dialog.v1 v1Var) {
        android.widget.RadioGroup radioGroup = this.f212001f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f211998c);
        }
        java.lang.String str = this.f211999d;
        android.content.Context context = this.f211997b;
        if (str == null || (str != null && str.length() == 0)) {
            this.f211999d = context.getResources().getString(com.tencent.mm.R.string.apu);
        }
        java.lang.String str2 = this.f211999d;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = this.f211996a;
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.f211732v = str2;
        aVar.E = new com.tencent.mm.ui.widget.dialog.s1(this, v1Var);
        java.lang.String str3 = this.f212000e;
        if (str3 == null || (str3 != null && str3.length() == 0)) {
            this.f212000e = context.getResources().getString(com.tencent.mm.R.string.apj);
        }
        java.lang.String str4 = this.f212000e;
        com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var.f211821b;
        aVar2.f211733w = str4;
        aVar2.F = new com.tencent.mm.ui.widget.dialog.t1(this, v1Var);
        return this;
    }
}
