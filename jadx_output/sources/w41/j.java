package w41;

/* loaded from: classes15.dex */
public final class j extends androidx.appcompat.app.i0 implements x41.b {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f442860f;

    /* renamed from: g, reason: collision with root package name */
    public final ah5.a f442861g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView f442862h;

    /* renamed from: i, reason: collision with root package name */
    public j41.i0 f442863i;

    /* renamed from: m, reason: collision with root package name */
    public v41.r f442864m;

    /* renamed from: n, reason: collision with root package name */
    public final w41.h f442865n;

    /* renamed from: o, reason: collision with root package name */
    public int f442866o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f442867p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f442868q;

    public j(android.content.Context context, ah5.a aVar) {
        super(context, com.tencent.mm.R.style.n_);
        this.f442860f = context;
        this.f442861g = aVar;
        this.f442865n = new w41.h(this);
        this.f442867p = jz5.h.b(new w41.g(this));
        this.f442868q = jz5.h.b(new w41.f(this));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView;
        if (!isShowing() || (openIMKefuConfirmDialogView = this.f442862h) == null) {
            return;
        }
        openIMKefuConfirmDialogView.b(5);
    }

    @Override // x41.b
    public void dismissDialog(int i17) {
        try {
            if (isShowing()) {
                super.dismiss();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.WindowManager.LayoutParams attributes;
        android.view.View decorView;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmDialog", "OpenIMKefuConfirmDialog onCreate");
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.Window window5 = getWindow();
        if (window5 != null && (decorView = window5.getDecorView()) != null) {
            android.content.Context context = decorView.getContext();
            decorView.setMinimumWidth((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.B(decorView.getContext()) : displayMetrics.widthPixels);
            decorView.setPadding(0, 0, 0, 0);
        }
        android.view.Window window6 = getWindow();
        if (window6 != null && (attributes = window6.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -2;
            attributes.gravity = 80;
        }
        android.content.Context context2 = this.f442860f;
        if (context2 == null) {
            context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
        }
        com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView = new com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView(context2, null);
        this.f442862h = openIMKefuConfirmDialogView;
        openIMKefuConfirmDialogView.f72309i = this;
        openIMKefuConfirmDialogView.setConfirmData(this.f442863i);
        com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView2 = this.f442862h;
        if (openIMKefuConfirmDialogView2 != null) {
            openIMKefuConfirmDialogView2.setOnConfirmDialogOpListener(this.f442864m);
        }
        com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView3 = this.f442862h;
        if (openIMKefuConfirmDialogView3 != null) {
            openIMKefuConfirmDialogView3.setBackgroundListener(this.f442865n);
        }
        com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView4 = this.f442862h;
        kotlin.jvm.internal.o.d(openIMKefuConfirmDialogView4);
        setContentView(openIMKefuConfirmDialogView4, new android.view.ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new w41.i(this));
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OpenIMKefuConfirmDialog", "realShowDialog ui is finishing and ignore");
                }
            }
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenIMKefuConfirmDialog", e17, "realShowDialog exception", new java.lang.Object[0]);
        }
    }
}
