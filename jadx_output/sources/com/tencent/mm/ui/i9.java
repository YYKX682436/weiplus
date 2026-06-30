package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class i9 extends com.tencent.mm.ui.widget.dialog.k2 implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f208908d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f208909e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f208910f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f208911g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f208912h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f208913i;

    public i9(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bxu, (android.view.ViewGroup) null);
        this.f208908d = linearLayout;
        this.f208909e = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.mm_alert_ok_btn);
        this.f208910f = (android.widget.TextView) this.f208908d.findViewById(com.tencent.mm.R.id.jlo);
        this.f208911g = (android.widget.TextView) this.f208908d.findViewById(com.tencent.mm.R.id.jlg);
        this.f208912h = this.f208908d.findViewById(com.tencent.mm.R.id.jlp);
        this.f208913i = (android.widget.LinearLayout) this.f208908d.findViewById(com.tencent.mm.R.id.jlh);
        setCanceledOnTouchOutside(true);
    }

    public void c(boolean z17) {
        super.setCancelable(z17);
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.h9(this));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteDependDialog", com.tencent.mm.sdk.platformtools.z3.b(true));
        } else {
            try {
                super.dismiss();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteDependDialog", "dismiss exception, e = " + e17.getMessage());
            }
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f208908d);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        android.view.View view = this.f208912h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(Ljava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(Ljava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f208910f.setVisibility(0);
        this.f208910f.setMaxLines(2);
        this.f208910f.setText(charSequence);
        android.widget.TextView textView = this.f208911g;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478892k1));
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteDependDialog", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i17) {
        android.view.View view = this.f208912h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f208910f.setVisibility(0);
        this.f208910f.setMaxLines(2);
        this.f208910f.setText(i17);
        android.widget.TextView textView = this.f208911g;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478892k1));
        }
    }
}
