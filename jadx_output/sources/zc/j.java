package zc;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f471352e;

    public j(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, boolean z17) {
        this.f471351d = wxaLiteAppWidgetAdapter;
        this.f471352e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kx5.n h17 = kx5.n.h();
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471351d;
        int i17 = wxaLiteAppWidgetAdapter.f45967f;
        jz5.l lVar = new jz5.l("activityId", java.lang.String.valueOf(wxaLiteAppWidgetAdapter.f45965d));
        boolean z17 = this.f471352e;
        h17.k(i17, "onBackPressed", kz5.c1.k(lVar, new jz5.l("animation", java.lang.Boolean.valueOf(z17)), new jz5.l("popPage", java.lang.Boolean.TRUE)), new zc.i(wxaLiteAppWidgetAdapter, z17));
    }
}
