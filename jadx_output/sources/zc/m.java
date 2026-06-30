package zc;

/* loaded from: classes15.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471356e;

    public m(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, int i17) {
        this.f471355d = wxaLiteAppWidgetAdapter;
        this.f471356e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f471355d.f(this.f471356e);
    }
}
