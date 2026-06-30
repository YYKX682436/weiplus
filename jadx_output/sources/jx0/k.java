package jx0;

/* loaded from: classes5.dex */
public final class k extends com.tencent.mm.ui.widget.dialog.v3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f302378d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f302379e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f302380f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f302381g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f302382h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f302383i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f302384m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        kotlin.jvm.internal.o.g(context, "context");
        this.f302378d = jz5.h.b(new jx0.g(this));
        this.f302379e = jz5.h.b(new jx0.e(this));
        this.f302380f = jz5.h.b(new jx0.f(this));
        this.f302381g = jz5.h.b(new jx0.i(this));
        this.f302382h = jz5.h.b(new jx0.h(this));
    }

    public final android.view.View b() {
        return (android.view.View) ((jz5.n) this.f302379e).getValue();
    }

    public final void c(boolean z17) {
        android.content.Context context;
        int i17;
        if (this.f302383i == z17) {
            return;
        }
        this.f302383i = z17;
        ((android.view.View) ((jz5.n) this.f302380f).getValue()).setEnabled(!this.f302383i);
        b().setEnabled(!this.f302383i);
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f302382h).getValue();
        if (b().isEnabled()) {
            context = getContext();
            i17 = com.tencent.mm.R.string.f492494mu1;
        } else {
            context = getContext();
            i17 = com.tencent.mm.R.string.f492493mu0;
        }
        textView.setText(i65.a.r(context, i17));
    }

    public final android.view.View getContentView() {
        return (android.view.View) ((jz5.n) this.f302378d).getValue();
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView(getContentView(), new android.view.ViewGroup.LayoutParams(-1, -1));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        ((android.widget.ProgressBar) ((jz5.n) this.f302381g).getValue()).setMax(100);
        b().requestFocus();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.f302384m = false;
        c(false);
    }
}
