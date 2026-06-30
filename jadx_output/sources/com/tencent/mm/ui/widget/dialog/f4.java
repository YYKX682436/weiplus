package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class f4 extends android.app.Dialog {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f211790n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.e4 f211791d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f211792e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f211793f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f211794g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f211795h;

    /* renamed from: i, reason: collision with root package name */
    public int f211796i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f211797m;

    public f4(android.content.Context context, int i17, int i18, boolean z17) {
        super(context, i17);
        this.f211796i = i18;
        this.f211797m = z17;
        android.view.View inflate = android.view.View.inflate(getContext(), (i18 == 1 || i18 == 2) ? com.tencent.mm.R.layout.dig : com.tencent.mm.R.layout.dih, null);
        this.f211795h = inflate;
        this.f211792e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3);
        this.f211793f = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f211795h.findViewById(com.tencent.mm.R.id.f487356oe2);
        this.f211794g = (android.widget.ProgressBar) this.f211795h.findViewById(com.tencent.mm.R.id.qgu);
        int i19 = this.f211796i;
        if (i19 == 1) {
            this.f211793f.setVisibility(0);
            this.f211794g.setVisibility(8);
        } else if (i19 == 2) {
            this.f211793f.setVisibility(8);
            this.f211794g.setVisibility(0);
        }
        setCanceledOnTouchOutside(true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f211795h, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        if (this.f211796i != 2 && !this.f211797m) {
            attributes.flags = attributes.flags | 8 | 16;
        }
        onWindowAttributesChanged(attributes);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }
}
