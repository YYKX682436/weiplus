package lx5;

/* loaded from: classes15.dex */
public class a implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx5.b f322157d;

    public a(lx5.b bVar) {
        this.f322157d = bVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.String str = methodCall.method;
        str.getClass();
        boolean equals = str.equals("onDartChannelReady");
        lx5.b bVar = this.f322157d;
        if (!equals) {
            io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = bVar.f322160c;
            if (methodCallHandler != null) {
                methodCallHandler.onMethodCall(methodCall, result);
                return;
            }
            return;
        }
        nx5.c.a("WxaRouter.SafeMethodChannel", "onMethodCall onDartChannelReady", new java.lang.Object[0]);
        if (bVar.f322158a) {
            return;
        }
        bVar.f322158a = true;
        while (true) {
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = bVar.f322161d;
            if (linkedBlockingQueue.isEmpty()) {
                return;
            }
            lx5.c cVar = (lx5.c) linkedBlockingQueue.poll();
            if (cVar != null) {
                io.flutter.plugin.common.MethodChannel methodChannel = bVar.f322159b;
                java.lang.String str2 = cVar.f322163a;
                methodChannel.invokeMethod(str2, cVar.f322164b, cVar.f322165c);
                nx5.c.a("WxaRouter.SafeMethodChannel", "notifyChannelReady doing invoke method %s", str2);
            }
        }
    }
}
