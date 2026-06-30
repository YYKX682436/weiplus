package zc;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471353d;

    public k(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter) {
        this.f471353d = wxaLiteAppWidgetAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f471353d.removeBackgroundImage();
    }
}
