package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes9.dex */
public class j0 extends android.app.Dialog implements android.content.DialogInterface {
    public android.view.ViewGroup A;
    public android.widget.LinearLayout B;
    public android.view.ViewGroup C;
    public android.view.View D;
    public boolean E;
    public boolean F;
    public android.view.animation.Animation G;
    public android.view.animation.Animation H;
    public android.view.animation.Animation I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.animation.Animation f211825J;
    public com.tencent.mm.ui.widget.dialog.g0 K;
    public android.content.DialogInterface.OnDismissListener L;
    public com.tencent.mm.ui.widget.dialog.l M;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f211826d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f211827e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f211828f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f211829g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f211830h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f211831i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f211832m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f211833n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f211834o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f211835p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f211836q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.EditText f211837r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.CheckBox f211838s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f211839t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f211840u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f211841v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f211842w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f211843x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewStub f211844y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f211845z;

    public j0(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.E = false;
        this.F = false;
        this.f211826d = context;
        i(context);
    }

    public static void b(com.tencent.mm.ui.widget.dialog.j0 j0Var, android.view.animation.Animation animation) {
        android.widget.LinearLayout linearLayout = j0Var.f211845z;
        if (linearLayout != null) {
            linearLayout.startAnimation(animation);
        }
        android.widget.LinearLayout linearLayout2 = j0Var.B;
        if (linearLayout2 != null) {
            linearLayout2.startAnimation(animation);
        }
        android.widget.TextView textView = j0Var.f211836q;
        if (textView != null && j0Var.E) {
            textView.startAnimation(animation);
        }
        android.widget.EditText editText = j0Var.f211837r;
        if (editText != null) {
            if (j0Var.F) {
                editText.startAnimation(animation);
            } else {
                editText.setVisibility(8);
            }
        }
    }

    public static void c(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.a aVar) {
        android.view.View inflate = android.view.View.inflate(j0Var.f211826d, com.tencent.mm.R.layout.f488669zy, null);
        j0Var.f211830h = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.mm_alert_cancel_btn);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.mm_alert_ok_btn);
        j0Var.f211829g = button;
        button.setVisibility(0);
        j0Var.f211829g.setText(aVar.f211732v);
        int i17 = aVar.W;
        if (i17 != 0) {
            j0Var.f211829g.setTextColor(i17);
        }
        j0Var.f211829g.setOnClickListener(new com.tencent.mm.ui.widget.dialog.b0(j0Var, aVar));
        j0Var.f211830h.setVisibility(0);
        j0Var.f211830h.setText(aVar.f211733w);
        int i18 = aVar.V;
        if (i18 != 0) {
            j0Var.f211830h.setTextColor(i18);
        }
        j0Var.f211830h.setOnClickListener(new com.tencent.mm.ui.widget.dialog.c0(j0Var, aVar));
        j0Var.s(inflate, new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    private void i(android.content.Context context) {
        android.content.Context context2 = this.f211826d;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(context2, com.tencent.mm.R.layout.bxt, null);
        this.f211827e = linearLayout;
        this.f211828f = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.f482929s4);
        this.f211829g = (android.widget.Button) this.f211827e.findViewById(com.tencent.mm.R.id.mm_alert_ok_btn);
        this.f211830h = (android.widget.Button) this.f211827e.findViewById(com.tencent.mm.R.id.mm_alert_cancel_btn);
        this.f211831i = (android.widget.TextView) this.f211827e.findViewById(com.tencent.mm.R.id.jlo);
        this.f211832m = (android.widget.TextView) this.f211827e.findViewById(com.tencent.mm.R.id.jlq);
        this.f211833n = (android.widget.TextView) this.f211827e.findViewById(com.tencent.mm.R.id.jlg);
        this.f211834o = (android.widget.TextView) this.f211827e.findViewById(com.tencent.mm.R.id.jll);
        this.f211835p = (android.widget.TextView) this.f211827e.findViewById(com.tencent.mm.R.id.jlk);
        this.f211836q = (android.widget.TextView) this.f211827e.findViewById(com.tencent.mm.R.id.c_f);
        this.f211837r = (android.widget.EditText) this.f211827e.findViewById(com.tencent.mm.R.id.c_l);
        this.f211838s = (android.widget.CheckBox) this.f211827e.findViewById(com.tencent.mm.R.id.c__);
        this.f211839t = (android.widget.ImageView) this.f211827e.findViewById(com.tencent.mm.R.id.jlj);
        this.f211840u = (android.widget.ImageView) this.f211827e.findViewById(com.tencent.mm.R.id.d0v);
        this.f211843x = (android.widget.LinearLayout) this.f211827e.findViewById(com.tencent.mm.R.id.jlp);
        this.f211844y = (android.view.ViewStub) this.f211827e.findViewById(com.tencent.mm.R.id.oco);
        this.f211845z = (android.widget.LinearLayout) this.f211827e.findViewById(com.tencent.mm.R.id.jlh);
        this.A = (android.view.ViewGroup) this.f211827e.findViewById(com.tencent.mm.R.id.f485938jl5);
        this.D = this.f211827e.findViewById(com.tencent.mm.R.id.jl_);
        this.B = (android.widget.LinearLayout) this.f211827e.findViewById(com.tencent.mm.R.id.jlc);
        this.C = (android.view.ViewGroup) this.f211827e.findViewById(com.tencent.mm.R.id.ocn);
        setCanceledOnTouchOutside(true);
        this.G = android.view.animation.AnimationUtils.loadAnimation(context2, com.tencent.mm.R.anim.f477723k);
        this.H = android.view.animation.AnimationUtils.loadAnimation(context2, com.tencent.mm.R.anim.f477723k);
        this.I = android.view.animation.AnimationUtils.loadAnimation(context2, com.tencent.mm.R.anim.f477724l);
        this.f211825J = android.view.animation.AnimationUtils.loadAnimation(context2, com.tencent.mm.R.anim.f477724l);
    }

    public void A(java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        android.widget.Button button = this.f211829g;
        if (button == null) {
            return;
        }
        button.setVisibility(0);
        this.f211829g.setText(charSequence);
        this.f211829g.setOnClickListener(new com.tencent.mm.ui.widget.dialog.o(this, onClickListener, z17));
    }

    public void B(int i17) {
        this.f211829g.setTextColor(i17);
    }

    public void C(int i17) {
        android.widget.TextView textView = this.f211831i;
        if (textView != null) {
            textView.setGravity(i17);
        }
    }

    public void D(android.view.View view, int i17) {
        this.f211841v = view;
        if (view != null) {
            this.f211845z.setVisibility(0);
            this.B.setVisibility(0);
            this.B.removeAllViews();
            this.B.setGravity(1);
            this.B.addView(this.f211841v, new android.widget.LinearLayout.LayoutParams(i17, i17));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.widget.dialog.t(this));
            com.tencent.mm.ui.yk.b("MicroMsg.MMAlertDialog", "dialog dismiss error!", new java.lang.Object[0]);
            return;
        }
        try {
            super.dismiss();
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.yk.d("MicroMsg.MMAlertDialog", th6, "dismiss exception", new java.lang.Object[0]);
        }
        com.tencent.mm.ui.widget.dialog.l lVar = this.M;
        if (lVar != null) {
            lVar.onDialogDismiss(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(com.tencent.mm.ui.widget.dialog.a r20) {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.dialog.j0.e(com.tencent.mm.ui.widget.dialog.a):void");
    }

    public android.widget.Button f(int i17) {
        if (i17 == -2) {
            return this.f211830h;
        }
        if (i17 != -1) {
            return null;
        }
        return this.f211829g;
    }

    public android.view.View getContentView() {
        return this.f211827e;
    }

    public java.lang.String h() {
        android.widget.EditText editText = this.f211837r;
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    public void k(int i17, boolean z17) {
        if (i17 == -2) {
            if (z17) {
                this.f211830h.setVisibility(0);
                return;
            } else {
                this.f211830h.setVisibility(8);
                return;
            }
        }
        if (i17 != -1) {
            return;
        }
        if (z17) {
            this.f211829g.setVisibility(0);
        } else {
            this.f211829g.setVisibility(8);
        }
    }

    public void o(boolean z17) {
        super.setCancelable(z17);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f211827e);
    }

    public void p(int i17) {
        android.widget.TextView textView = this.f211836q;
        if (textView != null) {
            textView.setGravity(i17);
        }
    }

    public final void r(int i17) {
        android.widget.LinearLayout linearLayout = this.f211845z;
        if (linearLayout != null) {
            linearLayout.setVisibility(i17);
        }
        android.widget.LinearLayout linearLayout2 = this.B;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(i17);
        }
        android.widget.TextView textView = this.f211836q;
        if (textView != null && this.E) {
            textView.setVisibility(i17);
        }
        android.widget.EditText editText = this.f211837r;
        if (editText != null) {
            if (this.F) {
                editText.setVisibility(i17);
            } else {
                editText.setVisibility(8);
            }
        }
    }

    public final void s(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.View view2 = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMAlertDialog", "setCustomBottomView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/dialog/MMAlertDialog", "setCustomBottomView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A.removeAllViews();
        this.A.addView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        this.f211843x.setVisibility(0);
        this.f211831i.setVisibility(0);
        com.tencent.mm.ui.widget.dialog.g0 g0Var = this.K;
        android.content.Context context = this.f211826d;
        if (g0Var != null) {
            charSequence = g0Var.a(context, charSequence.toString(), this.f211831i.getTextSize());
        }
        this.f211831i.setMaxLines(2);
        this.f211831i.setText(charSequence);
        this.f211831i.getPaint().setFakeBoldText(true);
        int color = context.getResources().getColor(com.tencent.mm.R.color.FG_1);
        android.widget.TextView textView = this.f211833n;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.d("MicroMsg.MMAlertDialog", e17, "", new java.lang.Object[0]);
        }
    }

    public void t(java.lang.CharSequence charSequence) {
        this.f211845z.setVisibility(0);
        this.f211833n.setVisibility(0);
        com.tencent.mm.ui.widget.dialog.g0 g0Var = this.K;
        if (g0Var != null) {
            charSequence = g0Var.a(this.f211833n.getContext(), charSequence.toString(), this.f211833n.getTextSize());
        }
        this.f211833n.setText(charSequence);
    }

    public void u(int i17, android.content.DialogInterface.OnClickListener onClickListener) {
        w(of5.b.a(this.f211826d).getString(i17), true, onClickListener);
    }

    public void w(java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        android.widget.Button button = this.f211830h;
        if (button == null) {
            return;
        }
        button.setVisibility(0);
        this.f211830h.setText(charSequence);
        this.f211830h.setOnClickListener(new com.tencent.mm.ui.widget.dialog.p(this, onClickListener, z17));
    }

    public void x(int i17) {
        this.f211830h.setTextColor(i17);
    }

    public void z(int i17, android.content.DialogInterface.OnClickListener onClickListener) {
        A(of5.b.a(this.f211826d).getString(i17), true, onClickListener);
    }

    public j0(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.E = false;
        this.F = false;
        this.f211826d = context;
        i(context);
    }

    @Override // android.app.Dialog
    public void setTitle(int i17) {
        this.f211843x.setVisibility(0);
        this.f211831i.setVisibility(0);
        this.f211831i.setMaxLines(2);
        this.f211831i.setText(i17);
        this.f211831i.getPaint().setFakeBoldText(true);
        int color = this.f211826d.getResources().getColor(com.tencent.mm.R.color.FG_1);
        android.widget.TextView textView = this.f211833n;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }
}
