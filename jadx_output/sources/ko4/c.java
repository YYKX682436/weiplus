package ko4;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f310039a;

    /* renamed from: b, reason: collision with root package name */
    public int f310040b;

    /* renamed from: c, reason: collision with root package name */
    public final ko4.b[] f310041c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f310042d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f310043e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f310044f;

    /* renamed from: g, reason: collision with root package name */
    public int f310045g;

    /* renamed from: h, reason: collision with root package name */
    public int f310046h;

    /* renamed from: i, reason: collision with root package name */
    public int f310047i;

    /* renamed from: j, reason: collision with root package name */
    public int f310048j;

    public c(int i17, int i18, java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f310039a = i17;
        this.f310040b = i18;
        ko4.b[] bVarArr = new ko4.b[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            bVarArr[i19] = null;
        }
        this.f310041c = bVarArr;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f310042d = reentrantLock;
        this.f310043e = reentrantLock.newCondition();
        this.f310044f = reentrantLock.newCondition();
        if (this.f310039a != 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid count " + this.f310039a);
    }

    public final int a(long j17) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f310042d;
        reentrantLock.lock();
        try {
            if (this.f310046h == this.f310047i && j17 > 0 && !this.f310043e.await(j17, java.util.concurrent.TimeUnit.MICROSECONDS)) {
                reentrantLock.unlock();
                return -1;
            }
            int i17 = this.f310047i;
            this.f310047i = i17 + 1;
            return i17 % this.f310039a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int b(long j17) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f310042d;
        reentrantLock.lock();
        try {
            int i17 = this.f310045g - this.f310048j;
            int i18 = this.f310039a;
            if (i17 >= i18 && j17 > 0 && !this.f310044f.await(j17, java.util.concurrent.TimeUnit.MICROSECONDS)) {
                reentrantLock.unlock();
                return -1;
            }
            int i19 = this.f310045g;
            this.f310045g = i19 + 1;
            return i19 % i18;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ko4.b c(int i17) {
        ko4.b[] bVarArr = this.f310041c;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f310042d;
        reentrantLock.lock();
        try {
            ko4.b bVar = bVarArr[i17];
            if (bVar == null) {
                android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(this.f310040b).order(java.nio.ByteOrder.nativeOrder());
                kotlin.jvm.internal.o.f(order, "order(...)");
                bVar = new ko4.b(bufferInfo, order);
                bVarArr[i17] = bVar;
            }
            return bVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f310042d;
        reentrantLock.lock();
        try {
            this.f310048j++;
            this.f310044f.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public java.lang.String toString() {
        return "[" + this.f310048j + ", " + this.f310047i + "; " + this.f310046h + ", " + this.f310045g + "] " + (this.f310045g - this.f310048j);
    }
}
