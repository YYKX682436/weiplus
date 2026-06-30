package pk2;

/* loaded from: classes3.dex */
public final class o7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f356068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(pk2.p7 p7Var) {
        super(0);
        this.f356068d = p7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.res.Resources resources;
        pk2.p7 p7Var = this.f356068d;
        int i17 = p7Var.f356160a.getResources().getDisplayMetrics().heightPixels;
        android.content.Context context = p7Var.f356160a;
        int i18 = context.getResources().getDisplayMetrics().widthPixels;
        int i19 = (int) (i17 * 0.75d);
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "=== Context Debug Info ===");
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "context class: ".concat(context.getClass().getName()));
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "context packageName: " + context.getPackageName());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("context applicationContext: ");
        android.content.Context applicationContext = context.getApplicationContext();
        android.util.DisplayMetrics displayMetrics = null;
        sb6.append(applicationContext != null ? applicationContext.getClass().getName() : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isLandscape: ");
        boolean z17 = p7Var.f356161b;
        sb7.append(z17);
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", sb7.toString());
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "screenWidth: " + i18 + ", screenHeight: " + i17);
        android.content.Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 != null && (resources = applicationContext2.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        if (displayMetrics != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "applicationContext width: " + displayMetrics.widthPixels + ", height: " + displayMetrics.heightPixels);
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "applicationContext density: " + displayMetrics.density + ", densityDpi: " + displayMetrics.densityDpi);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.FinderStartLiveMoreActionBottomSheet", "applicationContext displayMetrics is null");
        }
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "isLandscape:" + z17 + ", peekHeight:" + i19);
        android.view.View view = p7Var.f356163d;
        if (z17) {
            e3Var.g(view, new android.widget.FrameLayout.LayoutParams(i17, -2));
        } else {
            if (i19 <= 0) {
                i19 = -2;
            }
            e3Var.g(view, new android.widget.FrameLayout.LayoutParams(i18, i19));
            if (i19 > 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "setFixedHeight: " + i19);
            }
        }
        e3Var.f131965o = true;
        e3Var.c(true);
        e3Var.a();
        return e3Var;
    }
}
