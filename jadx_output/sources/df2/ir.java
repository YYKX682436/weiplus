package df2;

/* loaded from: classes10.dex */
public final class ir implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.h f230427e;

    public ir(df2.lt ltVar, dk2.h hVar) {
        this.f230426d = ltVar;
        this.f230427e = hVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        java.lang.String str = df2.lt.W;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "click dislike banner menu from share menu");
            df2.lt.e7(this.f230426d, this.f230427e, false);
        }
    }
}
