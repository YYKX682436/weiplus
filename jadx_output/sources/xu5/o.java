package xu5;

/* loaded from: classes12.dex */
public class o implements qu5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler.Callback f457327a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f457328b = true;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f457329c = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f457330d;

    /* renamed from: e, reason: collision with root package name */
    public final xu5.b f457331e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f457332f;

    /* renamed from: g, reason: collision with root package name */
    public final zu5.b f457333g;

    public o(xu5.b bVar, android.os.Handler.Callback callback) {
        xu5.e eVar = new xu5.e(this, android.os.Looper.getMainLooper());
        this.f457332f = eVar;
        this.f457333g = new zu5.b(android.os.Message.class, "recycleUnchecked", new java.lang.Class[0]);
        java.util.Objects.requireNonNull(bVar);
        this.f457331e = bVar;
        this.f457330d = bVar.f457302a;
        this.f457327a = callback;
        try {
            zu5.a aVar = new zu5.a(android.os.Handler.class, "mLooper");
            synchronized (aVar) {
                aVar.c(eVar, null, false);
            }
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public xu5.n a(android.os.Message message) {
        return new xu5.n(this, message);
    }

    public void b(android.os.Message message) {
    }

    @Override // qu5.a
    public void dispatchMessage(android.os.Message message) {
        if (message.getCallback() != null) {
            message.getCallback().run();
            return;
        }
        android.os.Handler.Callback callback = this.f457327a;
        if (callback == null || !callback.handleMessage(message)) {
            b(message);
        }
    }

    @Override // qu5.a
    public void dump(android.util.Printer printer, java.lang.String str) {
        printer.println(str + this.f457331e.f457303b.c().toString());
    }

    @Override // qu5.a
    public boolean executeOrSendMessage(android.os.Message message) {
        if (xu5.b.d() != this.f457331e) {
            return sendMessage(message);
        }
        dispatchMessage(message);
        return true;
    }

    @Override // qu5.a
    public android.os.Looper getLooper() {
        return null;
    }

    @Override // qu5.a
    public java.lang.String getMessageName(android.os.Message message) {
        return this.f457332f.getMessageName(message);
    }

    @Override // qu5.a
    public android.os.Handler getSelf() {
        return null;
    }

    @Override // qu5.a
    public xu5.b getSerial() {
        return this.f457331e;
    }

    @Override // qu5.a
    public java.lang.String getSerialTag() {
        return this.f457330d;
    }

    @Override // qu5.a
    public boolean hasMessages(int i17) {
        return this.f457331e.f457303b.b(new xu5.k(this, i17));
    }

    @Override // qu5.a
    public boolean isQuit() {
        return this.f457329c.get();
    }

    @Override // qu5.a
    public android.os.Message obtainMessage() {
        return this.f457332f.obtainMessage();
    }

    @Override // qu5.a
    public boolean post(java.lang.Runnable runnable) {
        return this.f457332f.post(runnable);
    }

    @Override // qu5.a
    public boolean postAtFrontOfQueue(java.lang.Runnable runnable) {
        android.os.Handler handler = this.f457332f;
        return handler.sendMessageAtTime(android.os.Message.obtain(handler, runnable), Long.MIN_VALUE);
    }

    @Override // qu5.a
    public boolean postAtTime(java.lang.Runnable runnable, long j17) {
        return this.f457332f.postAtTime(runnable, j17);
    }

    @Override // qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        return this.f457332f.postDelayed(runnable, j17);
    }

    @Override // qu5.a
    public boolean quit() {
        if (!this.f457329c.compareAndSet(false, true)) {
            return false;
        }
        this.f457331e.f457303b.h(new xu5.m(this));
        return true;
    }

    @Override // qu5.a
    public void removeCallbacks(java.lang.Runnable runnable) {
        this.f457331e.f457303b.h(new xu5.f(this, runnable));
    }

    @Override // qu5.a
    public void removeCallbacksAndMessages(java.lang.Object obj) {
        this.f457331e.f457303b.h(new xu5.j(this, obj));
    }

    @Override // qu5.a
    public void removeMessages(int i17) {
        this.f457331e.f457303b.h(new xu5.h(this, i17));
    }

    @Override // qu5.a
    public boolean sendEmptyMessage(int i17) {
        return this.f457332f.sendEmptyMessage(i17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessageAtTime(int i17, long j17) {
        return this.f457332f.sendEmptyMessageAtTime(i17, j17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessageDelayed(int i17, long j17) {
        return this.f457332f.sendEmptyMessageDelayed(i17, j17);
    }

    @Override // qu5.a
    public boolean sendMessage(android.os.Message message) {
        return this.f457332f.sendMessage(message);
    }

    @Override // qu5.a
    public boolean sendMessageAtFrontOfQueue(android.os.Message message) {
        return this.f457332f.sendMessageAtTime(message, Long.MIN_VALUE);
    }

    @Override // qu5.a
    public boolean sendMessageAtTime(android.os.Message message, long j17) {
        xu5.n a17 = a(message);
        if (isQuit()) {
            ku5.o.f312597a.b(a17.f457324f, 0, this.f457330d, true);
            return false;
        }
        if (((ku5.t0) ku5.t0.f312615d).f312617a.get()) {
            ku5.o.f312597a.b(a17.f457324f, 0, this.f457330d, true);
            return false;
        }
        if (j17 != Long.MIN_VALUE) {
            long uptimeMillis = j17 - android.os.SystemClock.uptimeMillis();
            if (xu5.b.b() == this.f457331e) {
                ((ku5.t0) ku5.t0.f312615d).E(a17, uptimeMillis);
            } else {
                ((ku5.t0) ku5.t0.f312615d).l(a17, uptimeMillis, this.f457330d);
            }
        } else if (xu5.b.b() == this.f457331e) {
            ((ku5.t0) ku5.t0.f312615d).D(a17);
        } else {
            ((ku5.t0) ku5.t0.f312615d).j(a17, this.f457330d);
        }
        return true;
    }

    @Override // qu5.a
    public boolean sendMessageDelayed(android.os.Message message, long j17) {
        return this.f457332f.sendMessageDelayed(message, j17);
    }

    public java.lang.String toString() {
        return java.lang.String.format("SerialHandler(%s) %s", this.f457330d, getClass().getName());
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17) {
        return this.f457332f.obtainMessage(i17);
    }

    @Override // qu5.a
    public boolean postAtTime(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        return this.f457332f.postAtTime(runnable, obj, j17);
    }

    @Override // qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        android.os.Message obtain = android.os.Message.obtain(this.f457332f, runnable);
        obtain.obj = obj;
        return sendMessageDelayed(obtain, j17);
    }

    @Override // qu5.a
    public boolean hasMessages(int i17, java.lang.Object obj) {
        return this.f457331e.f457303b.b(new xu5.l(this, obj));
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, java.lang.Object obj) {
        return this.f457332f.obtainMessage(i17, obj);
    }

    @Override // qu5.a
    public void removeCallbacks(java.lang.Runnable runnable, java.lang.Object obj) {
        this.f457331e.f457303b.h(new xu5.g(this, runnable, obj));
    }

    @Override // qu5.a
    public void removeMessages(int i17, java.lang.Object obj) {
        this.f457331e.f457303b.h(new xu5.i(this, i17, obj));
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, int i18, int i19) {
        return this.f457332f.obtainMessage(i17, i18, i19);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, int i18, int i19, java.lang.Object obj) {
        return this.f457332f.obtainMessage(i17, i18, i19, obj);
    }
}
