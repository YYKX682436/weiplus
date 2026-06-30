package fl1;

/* loaded from: classes7.dex */
public class g1 extends com.tencent.mm.ui.widget.dialog.g4 implements fl1.b2, fl1.a2 {

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnShowListener f263767f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f263768g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f263769h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f263770i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f263771m;

    /* renamed from: n, reason: collision with root package name */
    public fl1.g2 f263772n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f263773o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f263774p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.loading.MMProgressLoading f263775q;

    public g1(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.f263771m = true;
        try {
            onCreate(null);
        } catch (java.lang.Exception unused) {
        }
        setContentView(com.tencent.mm.R.layout.d_t);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // fl1.b2
    public boolean d() {
        return this.f263770i;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g4, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f263772n;
        if (g2Var != null) {
            g2Var.a(this);
            android.content.DialogInterface.OnDismissListener onDismissListener = this.f263768g;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
        }
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f263773o;
    }

    @Override // fl1.b2
    public int getPosition() {
        return 1;
    }

    @Override // fl1.b2
    public boolean j() {
        return this.f263771m;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    public void onCancel() {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f263769h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.g4, android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        this.f263771m = z17;
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z17) {
        super.setCanceledOnTouchOutside(z17);
        this.f263770i = z17;
    }

    @Override // android.app.Dialog
    public void setContentView(int i17) {
        setContentView(android.view.LayoutInflater.from(getContext()).inflate(i17, (android.view.ViewGroup) null));
    }

    @Override // com.tencent.mm.ui.widget.dialog.g4, android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(java.lang.CharSequence charSequence) {
        this.f263774p.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        this.f263769h = onCancelListener;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        this.f263768g = onDismissListener;
    }

    @Override // android.app.Dialog
    public void setOnShowListener(android.content.DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
        this.f263767f = onShowListener;
    }

    @Override // android.app.ProgressDialog
    public void setProgress(int i17) {
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            this.f263773o.post(new fl1.f1(this, i17));
            return;
        }
        if (this.f263775q == null) {
            com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading = (com.tencent.mm.ui.widget.loading.MMProgressLoading) this.f263773o.findViewById(com.tencent.mm.R.id.prs);
            this.f263775q = mMProgressLoading;
            mMProgressLoading.setVisibility(0);
            android.view.View findViewById = this.f263773o.findViewById(com.tencent.mm.R.id.prq);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandProgressDialog", "setProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandProgressDialog", "setProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f263775q.setProgress(i17);
    }

    @Override // com.tencent.mm.ui.widget.dialog.g4, android.app.Dialog
    public void show() {
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        android.content.DialogInterface.OnShowListener onShowListener = this.f263767f;
        if (onShowListener != null) {
            onShowListener.onShow(this);
        }
        this.f263772n = g2Var;
    }

    @Override // fl1.b2
    public void y(int i17) {
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view) {
        this.f263773o = view;
        this.f263774p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.prr);
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            view.setLayoutParams(layoutParams);
        }
        setContentView(view);
    }
}
