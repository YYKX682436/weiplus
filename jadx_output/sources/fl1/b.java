package fl1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.ui.widget.dialog.j0 implements fl1.b2 {
    public android.content.DialogInterface.OnShowListener N;
    public android.content.DialogInterface.OnDismissListener P;
    public android.content.DialogInterface.OnCancelListener Q;
    public boolean R;
    public boolean S;
    public fl1.g2 T;
    public android.view.View U;
    public boolean V;
    public java.lang.CharSequence W;

    public b(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.S = true;
        this.V = false;
        setContentView(this.f211827e);
        setCanceledOnTouchOutside(false);
    }

    public void E(int i17) {
        java.lang.String string = getContext().getResources().getString(i17);
        this.W = string;
        super.t(string);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // fl1.b2
    public boolean d() {
        return this.R;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.V) {
            return;
        }
        this.V = true;
        fl1.g2 g2Var = this.T;
        if (g2Var != null) {
            g2Var.a(this);
            android.content.DialogInterface.OnDismissListener onDismissListener = this.P;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.j0, fl1.b2
    public android.view.View getContentView() {
        android.view.View view = this.U;
        return view != null ? view : this.f211827e;
    }

    public int getPosition() {
        return 1;
    }

    @Override // fl1.b2
    public boolean j() {
        return this.S;
    }

    @Override // fl1.b2
    public void m() {
        android.view.View contentView = getContentView();
        if (contentView != null) {
            zk1.a.a(contentView);
        }
    }

    @Override // fl1.b2
    public void onCancel() {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.Q;
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.j0, android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        this.S = z17;
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z17) {
        super.setCanceledOnTouchOutside(z17);
        this.R = z17;
    }

    @Override // android.app.Dialog
    public void setContentView(int i17) {
        setContentView(android.view.LayoutInflater.from(getContext()).inflate(i17, (android.view.ViewGroup) null));
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        this.Q = onCancelListener;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        this.P = onDismissListener;
    }

    @Override // android.app.Dialog
    public void setOnShowListener(android.content.DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
        this.N = onShowListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j0, android.app.Dialog
    public void show() {
    }

    @Override // com.tencent.mm.ui.widget.dialog.j0
    public void t(java.lang.CharSequence charSequence) {
        this.W = charSequence;
        super.t(charSequence);
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        android.content.DialogInterface.OnShowListener onShowListener = this.N;
        if (onShowListener != null) {
            onShowListener.onShow(this);
        }
        this.T = g2Var;
    }

    @Override // fl1.b2
    public void y(int i17) {
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view) {
        if (!(view instanceof fl1.a)) {
            view = new fl1.a(view.getContext(), view);
        }
        this.U = view;
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            view.setLayoutParams(layoutParams);
        }
        setContentView(view);
    }

    public b(android.content.Context context, int i17) {
        super(context, i17);
        this.S = true;
        this.V = false;
    }
}
