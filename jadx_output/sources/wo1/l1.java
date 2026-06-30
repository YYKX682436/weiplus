package wo1;

/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final wo1.l1 f447986a = new wo1.l1();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f447987b;

    public final void a(java.lang.String str) {
        if (!android.provider.Settings.canDrawOverlays(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RoamFloatWindowHelper", "Float window permission is denied, return directly.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamFloatWindowHelper", "Start float window service to show SAF guide");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.emv, (android.view.ViewGroup) null);
        if (inflate == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamFloatWindowHelper", "Fail to inflate container view");
            return;
        }
        f447987b = new java.lang.ref.WeakReference(inflate);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.txn);
        frameLayout.removeAllViews();
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.view.View inflate2 = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.emw, (android.view.ViewGroup) null);
        if (str != null) {
            ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.vfe)).setText(context2.getString(com.tencent.mm.R.string.ofk, str));
        }
        kotlin.jvm.internal.o.d(inflate2);
        frameLayout.addView(inflate2);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(-2, -2, android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 8, -3);
        layoutParams.gravity = 8388693;
        layoutParams.x = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);
        layoutParams.y = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479649bo);
        windowManager.addView(inflate, layoutParams);
        inflate.setOnTouchListener(new wo1.j1(layoutParams, windowManager, inflate));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.txm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById).setOnClickListener(new wo1.k1(windowManager, inflate));
    }
}
