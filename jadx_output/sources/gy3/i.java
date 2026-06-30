package gy3;

/* loaded from: classes13.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final gy3.j f277573d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.OutputStream f277574e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f277575f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Runnable f277576g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f277577h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f277578i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f277579m;

    public i(gy3.j mSession, android.bluetooth.BluetoothSocket socket) {
        kotlin.jvm.internal.o.g(mSession, "mSession");
        kotlin.jvm.internal.o.g(socket, "socket");
        this.f277573d = mSession;
        this.f277577h = new java.util.LinkedList();
        this.f277578i = new java.util.LinkedList();
        this.f277579m = new java.lang.Object();
        try {
            this.f277574e = socket.getOutputStream();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.SendThread", "output sockets not created", e17);
            this.f277574e = null;
            ((gy3.d) this.f277573d.f277581a).h("Can not get write stream");
        }
        this.f277576g = this;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SendThread", "SendThread cancel");
        this.f277576g = null;
        this.f277575f = true;
        synchronized (this.f277579m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SendThread", "mLock.notify");
            this.f277579m.notify();
        }
        this.f277578i.clear();
        this.f277577h.clear();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SendThread", "BEGIN SendThread");
        if (this.f277574e == null) {
            return;
        }
        while (true) {
            if (this.f277575f) {
                break;
            }
            if (this.f277576g == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.SendThread", "Send thread has been close. just leave");
                break;
            }
            if (!this.f277578i.isEmpty()) {
                byte[] bArr = (byte[]) this.f277578i.pop();
                if (bArr != null) {
                    if (!(bArr.length == 0)) {
                        try {
                            java.io.OutputStream outputStream = this.f277574e;
                            kotlin.jvm.internal.o.d(outputStream);
                            outputStream.write(bArr);
                            ((gy3.d) this.f277573d.f277581a).i(true, bArr.length);
                        } catch (java.io.IOException unused) {
                            ((gy3.d) this.f277573d.f277581a).i(false, bArr.length);
                        }
                    }
                }
                ((gy3.d) this.f277573d.f277581a).i(false, 0);
            } else if (this.f277577h.isEmpty()) {
                synchronized (this.f277579m) {
                    if (this.f277577h.isEmpty()) {
                        try {
                            this.f277579m.wait();
                        } catch (java.lang.InterruptedException e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Rtos.SendThread", e17, "", new java.lang.Object[0]);
                        }
                    }
                }
            } else {
                synchronized (this.f277579m) {
                    if (true ^ this.f277577h.isEmpty()) {
                        this.f277578i.addAll(this.f277577h);
                        this.f277577h.clear();
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SendThread", "FINISH SendThread");
    }
}
