package zc;

/* loaded from: classes11.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f471363e;

    public p(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, boolean z17) {
        this.f471362d = wxaLiteAppWidgetAdapter;
        this.f471363e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471362d;
        boolean z17 = this.f471363e;
        wxaLiteAppWidgetAdapter.I = z17;
        if (z17) {
            android.view.Window window = wxaLiteAppWidgetAdapter.f45975q.getWindow();
            if (window != null) {
                window.addFlags(128);
                return;
            }
            return;
        }
        android.view.Window window2 = wxaLiteAppWidgetAdapter.f45975q.getWindow();
        if (window2 != null) {
            window2.clearFlags(128);
        }
    }
}
