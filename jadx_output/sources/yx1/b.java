package yx1;

/* loaded from: classes13.dex */
public class b extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f467823a;

    public b(yx1.c cVar, android.os.Handler handler) {
        this.f467823a = handler;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.INotificationManagerInvocationHandler", "run on my handler");
            this.f467823a.handleMessage(message);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.INotificationManagerInvocationHandler", "protect succ");
        }
    }
}
