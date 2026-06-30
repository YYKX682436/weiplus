package py0;

/* loaded from: classes5.dex */
public final class f0 extends com.tencent.mm.ui.widget.dialog.v3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f358981d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f358982e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f358983f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f358984g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f358985h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f358986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        kotlin.jvm.internal.o.g(context, "context");
        this.f358981d = "MicroMsg.MaasProgressDialog";
        this.f358982e = jz5.h.b(new py0.b0(this));
        this.f358983f = jz5.h.b(new py0.c0(this));
        this.f358984g = jz5.h.b(new py0.d0(this));
        this.f358985h = jz5.h.b(new py0.e0(this));
    }

    public final android.view.View b() {
        java.lang.Object value = ((jz5.n) this.f358983f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void c(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        ((android.widget.TextView) ((jz5.n) this.f358985h).getValue()).setText(msg);
    }

    public final void e(boolean z17) {
        if (this.f358986i != z17) {
            this.f358986i = z17;
            int h17 = z17 ? (getContext().getResources().getDisplayMetrics().heightPixels / 2) - com.tencent.mm.ui.bl.h(getContext()) : ((java.lang.Number) ((jz5.n) this.f358984g).getValue()).intValue();
            b().setPadding(b().getPaddingLeft(), b().getPaddingTop(), b().getPaddingRight(), h17);
            com.tencent.mars.xlog.Log.i(this.f358981d, "updateLoadingContainerPaddingBottom: " + this.f358986i + ',' + h17);
        }
        super.show();
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView((android.view.View) ((jz5.n) this.f358982e).getValue(), new android.view.ViewGroup.LayoutParams(-1, -1));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        com.tencent.mars.xlog.Log.i(this.f358981d, "onCreate: " + ((java.lang.Number) ((jz5.n) this.f358984g).getValue()).intValue());
    }

    @Override // android.app.Dialog
    public void show() {
        e(false);
    }
}
