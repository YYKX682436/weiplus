package kx5;

/* loaded from: classes15.dex */
public class g implements io.flutter.plugin.common.MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f313299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kx5.m f313301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx5.n f313302d;

    public g(kx5.n nVar, java.lang.Runnable runnable, java.lang.String str, kx5.m mVar) {
        this.f313302d = nVar;
        this.f313299a = runnable;
        this.f313300b = str;
        this.f313301c = mVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        nx5.c.b("WxaRouter.WxaRouter", "invokeMethod %s error. code: %s, message: %s, details: %s", this.f313300b, str, str2, obj.toString());
        ((kx5.c) this.f313301c).a();
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        nx5.c.b("WxaRouter.WxaRouter", "invokeMethod %s notImplemented", this.f313300b);
        ((kx5.c) this.f313301c).a();
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(java.lang.Object obj) {
        this.f313302d.f313319i.removeCallbacks(this.f313299a);
        nx5.c.c("WxaRouter.WxaRouter", "invokeMethod %s success", this.f313300b);
        ((kx5.c) this.f313301c).a();
    }
}
