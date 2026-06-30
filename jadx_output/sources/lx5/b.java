package lx5;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f322159b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel.MethodCallHandler f322160c;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel.MethodCallHandler f322162e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f322158a = true;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f322161d = new java.util.concurrent.LinkedBlockingQueue();

    public b(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str) {
        lx5.a aVar = new lx5.a(this);
        this.f322162e = aVar;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binaryMessenger, str);
        this.f322159b = methodChannel;
        methodChannel.setMethodCallHandler(aVar);
    }

    public void a(java.lang.String str, java.lang.Object obj, io.flutter.plugin.common.MethodChannel.Result result) {
        if (this.f322158a) {
            this.f322159b.invokeMethod(str, obj, result);
            nx5.c.a("WxaRouter.SafeMethodChannel", "invokeMethod invoke method %s", str);
        } else {
            this.f322161d.offer(new lx5.c(str, obj, result));
            nx5.c.a("WxaRouter.SafeMethodChannel", "invokeMethod add invoke method %s", str);
        }
    }
}
