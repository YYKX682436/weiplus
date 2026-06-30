package pm0;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f356777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f356778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f356779f;

    public k(yz5.a aVar, boolean z17, android.os.HandlerThread handlerThread) {
        this.f356777d = aVar;
        this.f356778e = z17;
        this.f356779f = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f356777d.invoke();
        if (this.f356778e) {
            this.f356779f.quitSafely();
        }
    }
}
