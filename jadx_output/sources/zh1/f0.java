package zh1;

/* loaded from: classes8.dex */
public final class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public static final zh1.f0 f472879d = new zh1.f0();

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.util.Objects.toString(menuItem);
        if (menuItem instanceof db5.h4) {
            ((db5.h4) menuItem).c();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onMMMenuItemSelected, menuItem is not MMMenuItem");
        }
    }
}
