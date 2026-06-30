package xj1;

/* loaded from: classes7.dex */
public final class r extends com.tencent.mm.plugin.appbrand.appusage.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList f454814a;

    public r(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
        this.f454814a = appBrandCollectionVerticalSortList;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.r, com.tencent.mm.plugin.appbrand.appusage.f
    public void a(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList = this.f454814a;
        android.os.Bundle arguments = appBrandCollectionVerticalSortList.getArguments();
        int i17 = arguments != null ? arguments.getInt("KEY_OPERATE_REPORT_SCENE") : 0;
        android.os.Bundle arguments2 = appBrandCollectionVerticalSortList.getArguments();
        com.tencent.mm.plugin.appbrand.report.y0.b(info, 7, i17, arguments2 != null ? arguments2.getString("KEY_OPERATE_REPORT_SCENE_ID") : null);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.f
    public void b(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList = this.f454814a;
        android.os.Bundle arguments = appBrandCollectionVerticalSortList.getArguments();
        int i17 = arguments != null ? arguments.getInt("KEY_OPERATE_REPORT_SCENE") : 0;
        android.os.Bundle arguments2 = appBrandCollectionVerticalSortList.getArguments();
        com.tencent.mm.plugin.appbrand.report.y0.b(info, 6, i17, arguments2 != null ? arguments2.getString("KEY_OPERATE_REPORT_SCENE_ID") : null);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.r
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionVerticalSortList", "[collection]reorder callback entered");
        ((com.tencent.mm.plugin.appbrand.appusage.l) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.l.class)).Di(com.tencent.mm.plugin.appbrand.appusage.l3.f76507h);
        androidx.fragment.app.FragmentActivity activity = this.f454814a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
