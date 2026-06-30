package xt2;

/* loaded from: classes14.dex */
public final class l6 implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderShoppingListNestedScrollCoordinatorLayout f456874a;

    public l6(com.tencent.mm.plugin.finder.shopping.view.FinderShoppingListNestedScrollCoordinatorLayout finderShoppingListNestedScrollCoordinatorLayout) {
        this.f456874a = finderShoppingListNestedScrollCoordinatorLayout;
    }

    @Override // com.google.android.material.appbar.e
    public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        com.tencent.mm.plugin.finder.shopping.view.FinderShoppingListNestedScrollCoordinatorLayout finderShoppingListNestedScrollCoordinatorLayout = this.f456874a;
        com.tencent.mars.xlog.Log.i(finderShoppingListNestedScrollCoordinatorLayout.D, "appbar offset changed, offset = " + i17);
        finderShoppingListNestedScrollCoordinatorLayout.G = i17 == 0;
        com.google.android.material.appbar.AppBarLayout appBarLayout2 = finderShoppingListNestedScrollCoordinatorLayout.F;
        finderShoppingListNestedScrollCoordinatorLayout.H = i17 == (appBarLayout2 != null ? appBarLayout2.getTotalScrollRange() : 0);
    }
}
