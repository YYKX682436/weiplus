package zc;

/* loaded from: classes15.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo f471371e;

    public t(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        this.f471370d = wxaLiteAppWidgetAdapter;
        this.f471371e = pageInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo = this.f471371e;
        int i17 = pageInfo.flags;
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471370d;
        wxaLiteAppWidgetAdapter.setFlags(i17);
        wxaLiteAppWidgetAdapter.setPageOrientation(pageInfo.pageOrientation);
        if (kotlin.jvm.internal.o.b(wxaLiteAppWidgetAdapter.f45968g, pageInfo.appId)) {
            return;
        }
        wxaLiteAppWidgetAdapter.e();
    }
}
