package u9;

/* loaded from: classes13.dex */
public final class j implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {

    /* renamed from: h, reason: collision with root package name */
    public static final u9.j f425754h = new u9.j();

    /* renamed from: d, reason: collision with root package name */
    public volatile long f425755d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f425756e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Choreographer f425757f;

    /* renamed from: g, reason: collision with root package name */
    public int f425758g;

    public j() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), this);
        this.f425756e = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        this.f425755d = j17;
        this.f425757f.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 0) {
            this.f425757f = android.view.Choreographer.getInstance();
            return true;
        }
        if (i17 == 1) {
            int i18 = this.f425758g + 1;
            this.f425758g = i18;
            if (i18 == 1) {
                this.f425757f.postFrameCallback(this);
            }
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        int i19 = this.f425758g - 1;
        this.f425758g = i19;
        if (i19 == 0) {
            this.f425757f.removeFrameCallback(this);
            this.f425755d = 0L;
        }
        return true;
    }
}
