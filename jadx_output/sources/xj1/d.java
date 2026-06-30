package xj1;

/* loaded from: classes7.dex */
public final class d implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454783d;

    public d(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f454783d = appBrandCollectionDisplayVerticalList;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList$onActivityCreated$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            int i17 = com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.f89638t;
            com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f454783d;
            if (appBrandCollectionDisplayVerticalList.getContext() != null) {
                db5.e1.N(appBrandCollectionDisplayVerticalList.getContext(), "!TEST!\n输入小程序username添加到「我的小程序」", "", "", Integer.MAX_VALUE, new xj1.m(appBrandCollectionDisplayVerticalList));
            }
            z17 = true;
        } else {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList$onActivityCreated$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
