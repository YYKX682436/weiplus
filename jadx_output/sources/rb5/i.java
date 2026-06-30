package rb5;

/* loaded from: classes11.dex */
public class i implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.j f393871d;

    public i(rb5.j jVar) {
        this.f393871d = jVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("ChattingCompat", "OnApplyWindowInsetsListener %s", windowInsets);
        windowInsets.consumeSystemWindowInsets();
        rb5.j jVar = this.f393871d;
        rb5.l lVar = jVar.f393875g;
        windowInsets.getSystemWindowInsetTop();
        android.graphics.Rect rect = new android.graphics.Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        lVar.getClass();
        com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = jVar.f393873e;
        fitSystemWindowLayoutView.setActionBarContainer(jVar.f393874f);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
        return windowInsets;
    }
}
