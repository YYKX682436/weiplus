package qu5;

/* loaded from: classes12.dex */
public final class b implements qu5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f366832a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f366833b = new java.util.concurrent.atomic.AtomicBoolean();

    public b(android.os.Handler handler) {
        this.f366832a = handler;
    }

    @Override // qu5.a
    public void dispatchMessage(android.os.Message message) {
        this.f366832a.dispatchMessage(message);
    }

    @Override // qu5.a
    public void dump(android.util.Printer printer, java.lang.String str) {
        this.f366832a.dump(printer, str);
    }

    @Override // qu5.a
    public boolean executeOrSendMessage(android.os.Message message) {
        if (isQuit()) {
            return false;
        }
        if (getLooper() != android.os.Looper.myLooper()) {
            return sendMessage(message);
        }
        this.f366832a.dispatchMessage(message);
        return true;
    }

    @Override // qu5.a
    public android.os.Looper getLooper() {
        return this.f366832a.getLooper();
    }

    @Override // qu5.a
    public java.lang.String getMessageName(android.os.Message message) {
        return this.f366832a.getMessageName(message);
    }

    @Override // qu5.a
    public android.os.Handler getSelf() {
        return this.f366832a;
    }

    @Override // qu5.a
    public xu5.b getSerial() {
        return null;
    }

    @Override // qu5.a
    public java.lang.String getSerialTag() {
        return null;
    }

    @Override // qu5.a
    public boolean hasMessages(int i17) {
        return this.f366832a.hasMessages(i17);
    }

    @Override // qu5.a
    public boolean isQuit() {
        return this.f366833b.get();
    }

    @Override // qu5.a
    public android.os.Message obtainMessage() {
        return this.f366832a.obtainMessage();
    }

    @Override // qu5.a
    public boolean post(java.lang.Runnable runnable) {
        return this.f366832a.post(runnable);
    }

    @Override // qu5.a
    public boolean postAtFrontOfQueue(java.lang.Runnable runnable) {
        return this.f366832a.postAtFrontOfQueue(runnable);
    }

    @Override // qu5.a
    public boolean postAtTime(java.lang.Runnable runnable, long j17) {
        return this.f366832a.postAtTime(runnable, j17);
    }

    @Override // qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        return this.f366832a.postDelayed(runnable, j17);
    }

    @Override // qu5.a
    public boolean quit() {
        if (!this.f366833b.compareAndSet(false, true)) {
            return false;
        }
        removeCallbacksAndMessages(null);
        if (getLooper() != null) {
            ku5.o.f312599c.w("WrapperHandler", "Do you want to quit this looper thread? You'd better get this Looper to quit.", new java.lang.Object[0]);
        }
        return true;
    }

    @Override // qu5.a
    public void removeCallbacks(java.lang.Runnable runnable) {
        this.f366832a.removeCallbacks(runnable);
    }

    @Override // qu5.a
    public void removeCallbacksAndMessages(java.lang.Object obj) {
        this.f366832a.removeCallbacksAndMessages(obj);
    }

    @Override // qu5.a
    public void removeMessages(int i17) {
        this.f366832a.removeMessages(i17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessage(int i17) {
        return this.f366832a.sendEmptyMessage(i17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessageAtTime(int i17, long j17) {
        return this.f366832a.sendEmptyMessageAtTime(i17, j17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessageDelayed(int i17, long j17) {
        return this.f366832a.sendEmptyMessageDelayed(i17, j17);
    }

    @Override // qu5.a
    public boolean sendMessage(android.os.Message message) {
        return this.f366832a.sendMessage(message);
    }

    @Override // qu5.a
    public boolean sendMessageAtFrontOfQueue(android.os.Message message) {
        return this.f366832a.sendMessageAtFrontOfQueue(message);
    }

    @Override // qu5.a
    public boolean sendMessageAtTime(android.os.Message message, long j17) {
        if (isQuit()) {
            return false;
        }
        return this.f366832a.sendMessageAtTime(message, j17);
    }

    @Override // qu5.a
    public boolean sendMessageDelayed(android.os.Message message, long j17) {
        return this.f366832a.sendMessageDelayed(message, j17);
    }

    public java.lang.String toString() {
        return this.f366832a.toString();
    }

    @Override // qu5.a
    public boolean hasMessages(int i17, java.lang.Object obj) {
        return this.f366832a.hasMessages(i17, obj);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17) {
        return this.f366832a.obtainMessage(i17);
    }

    @Override // qu5.a
    public boolean postAtTime(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        return this.f366832a.postAtTime(runnable, obj, j17);
    }

    @Override // qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return this.f366832a.postDelayed(runnable, obj, j17);
        }
        throw new java.lang.RuntimeException("Call requires API level 28 (current min is 19): android.os.Handler#postDelayed");
    }

    @Override // qu5.a
    public void removeCallbacks(java.lang.Runnable runnable, java.lang.Object obj) {
        this.f366832a.removeCallbacks(runnable, obj);
    }

    @Override // qu5.a
    public void removeMessages(int i17, java.lang.Object obj) {
        this.f366832a.removeMessages(i17, obj);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, java.lang.Object obj) {
        return this.f366832a.obtainMessage(i17, obj);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, int i18, int i19) {
        return this.f366832a.obtainMessage(i17, i18, i19);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, int i18, int i19, java.lang.Object obj) {
        return this.f366832a.obtainMessage(i17, i18, i19, obj);
    }
}
