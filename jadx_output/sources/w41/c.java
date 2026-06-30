package w41;

/* loaded from: classes15.dex */
public final class c extends androidx.appcompat.app.i0 implements x41.b, ab0.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f442850f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView f442851g;

    /* renamed from: h, reason: collision with root package name */
    public w41.a f442852h;

    /* renamed from: i, reason: collision with root package name */
    public ab0.r f442853i;

    public c(android.content.Context context) {
        super(context, com.tencent.mm.R.style.n_);
        this.f442850f = context;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView openIMConfirmDialogView;
        if (!isShowing() || (openIMConfirmDialogView = this.f442851g) == null) {
            return;
        }
        openIMConfirmDialogView.b(5);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMConfirmDialog", "onCreate");
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
        android.content.Context context2 = this.f442850f;
        if (context2 == null) {
            context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
        }
        com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView openIMConfirmDialogView = new com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView(context2, null);
        this.f442851g = openIMConfirmDialogView;
        openIMConfirmDialogView.f72309i = this;
        openIMConfirmDialogView.setConfirmData(this.f442852h);
        com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView openIMConfirmDialogView2 = this.f442851g;
        if (openIMConfirmDialogView2 != null) {
            openIMConfirmDialogView2.setOnConfirmDialogOpListener(this.f442853i);
        }
        com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView openIMConfirmDialogView3 = this.f442851g;
        kotlin.jvm.internal.o.d(openIMConfirmDialogView3);
        setContentView(openIMConfirmDialogView3, new android.view.ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new w41.b(this));
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OpenIMConfirmDialog", "realShowDialog ui is finishing and ignore");
                }
            }
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenIMConfirmDialog", e17, "realShowDialog exception", new java.lang.Object[0]);
        }
    }
}
