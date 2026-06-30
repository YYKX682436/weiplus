package zv2;

/* loaded from: classes8.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.m implements yz5.q {
    public j(java.lang.Object obj) {
        super(3, obj, zv2.m.class, "onMenuGetView", "onMenuGetView(Landroid/view/View;ILandroid/view/MenuItem;)V", 0);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        android.view.MenuItem menuItem = (android.view.MenuItem) obj3;
        zv2.m mVar = (zv2.m) this.receiver;
        mVar.getClass();
        if (view != null) {
            java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf != null && valueOf.intValue() == 3) {
                mVar.n(view, "change_product_title", 40);
            }
        }
        return jz5.f0.f302826a;
    }
}
