package zc;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471369e;

    public s(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, int i17) {
        this.f471368d = wxaLiteAppWidgetAdapter;
        this.f471369e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View decorView;
        android.view.Window window = this.f471368d.f45975q.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(this.f471369e);
    }
}
