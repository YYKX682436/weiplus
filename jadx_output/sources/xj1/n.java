package xj1;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454808d;

    public n(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f454808d = appBrandCollectionDisplayVerticalList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.k activity = this.f454808d.getActivity();
        zj1.a aVar = activity instanceof zj1.a ? (zj1.a) activity : null;
        if (aVar != null) {
            aVar.H3(false);
        }
    }
}
