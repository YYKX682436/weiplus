package zc;

/* loaded from: classes11.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f471366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471367e;

    public r(boolean z17, com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter) {
        this.f471366d = z17;
        this.f471367e = wxaLiteAppWidgetAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f471366d;
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471367e;
        if (z17) {
            android.view.Window window = wxaLiteAppWidgetAdapter.f45975q.getWindow();
            if (window != null) {
                window.clearFlags(8192);
                return;
            }
            return;
        }
        android.view.Window window2 = wxaLiteAppWidgetAdapter.f45975q.getWindow();
        if (window2 != null) {
            window2.addFlags(8192);
        }
    }
}
