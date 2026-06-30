package ro2;

/* loaded from: classes2.dex */
public final class e implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMileStoneView f398036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398039g;

    public e(com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView, com.tencent.mm.plugin.finder.convert.qe qeVar, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f398036d = finderMileStoneView;
        this.f398037e = qeVar;
        this.f398038f = context;
        this.f398039g = baseFinderFeed;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.finder.view.FinderMileStoneView mileStoneView = this.f398036d;
        kotlin.jvm.internal.o.f(mileStoneView, "$mileStoneView");
        android.content.Context context = this.f398038f;
        kotlin.jvm.internal.o.f(context, "$context");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f398039g;
        kotlin.jvm.internal.o.f(item, "$item");
        hc2.v0.d(mileStoneView, "finder_poster", "finder_screenshot", false, ro2.r.b(this.f398037e, context, item), null, 20, null);
    }
}
