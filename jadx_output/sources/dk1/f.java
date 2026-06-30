package dk1;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f233147d;

    public f(com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView) {
        this.f233147d = loadMoreRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f233147d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loadMoreRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage$initContentArea$onFirstTimesFetched$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        loadMoreRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(loadMoreRecyclerView, "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage$initContentArea$onFirstTimesFetched$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f233147d.m1(true);
    }
}
