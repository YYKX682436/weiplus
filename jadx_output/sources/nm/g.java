package nm;

/* loaded from: classes12.dex */
public final class g extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm.i f338433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nm.i iVar) {
        super(android.os.Looper.getMainLooper());
        this.f338433a = iVar;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] PendingActionScheduler.schedulePendingActions called.");
        sendMessageAtFrontOfQueue(android.os.Message.obtain(this.f338433a.f338438b, 2));
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FirstScreenArrangement2", "[!] Watchdog barked.");
            removeMessages(1);
            removeMessages(2);
            sendEmptyMessage(2);
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Pending actions scheduled.");
        removeMessages(1);
        removeMessages(2);
        synchronized (this.f338433a.f338440d) {
            if (this.f338433a.f338442f) {
                return;
            }
            this.f338433a.f338442f = true;
            ((ku5.t0) ku5.t0.f312615d).g(new nm.f(this));
        }
    }
}
