package xj1;

/* loaded from: classes7.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList f454816d;

    public t(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
        this.f454816d = appBrandCollectionVerticalSortList;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        androidx.fragment.app.FragmentActivity activity = this.f454816d.getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }
}
