package mn1;

/* loaded from: classes12.dex */
public class s implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.LinkedBlockingQueue f329882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn1.e f329883e;

    public s(mn1.e eVar, java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue) {
        this.f329883e = eVar;
        this.f329882d = linkedBlockingQueue;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "startSendRequestSessionResponse.onNotifyWorker";
    }

    @Override // java.lang.Runnable
    public void run() {
        mn1.u uVar;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f329882d;
        while (true) {
            mn1.e eVar = this.f329883e;
            if (eVar.f329848k || mn1.e.N) {
                return;
            }
            try {
                uVar = (mn1.u) linkedBlockingQueue.poll(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Exception unused) {
                uVar = null;
            }
            linkedBlockingQueue.size();
            if (uVar != null) {
                eVar.b(uVar.f329885a, uVar.f329887c, uVar.f329888d, uVar.f329886b);
            }
        }
    }
}
