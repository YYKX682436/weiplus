package dk1;

/* loaded from: classes4.dex */
public final class c implements vl1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ak1.a f233125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage f233126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk1.k f233128d;

    public c(ak1.a aVar, com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage appBrandPrivacyUseRecordPage, kotlin.jvm.internal.h0 h0Var, dk1.k kVar) {
        this.f233125a = aVar;
        this.f233126b = appBrandPrivacyUseRecordPage;
        this.f233127c = h0Var;
        this.f233128d = kVar;
    }

    @Override // vl1.j
    public final void a(com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView, androidx.recyclerview.widget.f2 f2Var) {
        if (this.f233125a.f5564e) {
            kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this.f233126b), null, null, new dk1.b(this.f233127c, this.f233126b, this.f233125a, this.f233128d, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyUseRecordPage", "onLoadMore, loading is not shown");
        }
    }
}
