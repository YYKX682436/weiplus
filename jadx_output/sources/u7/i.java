package u7;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f425050a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f425051b = java.util.concurrent.Executors.newFixedThreadPool(8);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f425052c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.net.ServerSocket f425053d;

    /* renamed from: e, reason: collision with root package name */
    public final int f425054e;

    /* renamed from: f, reason: collision with root package name */
    public final u7.c f425055f;

    public i(u7.c cVar, u7.f fVar) {
        cVar.getClass();
        this.f425055f = cVar;
        try {
            java.net.ServerSocket serverSocket = new java.net.ServerSocket(0, 8, java.net.InetAddress.getByName("127.0.0.1"));
            this.f425053d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f425054e = localPort;
            java.util.List list = u7.m.f425067d;
            java.net.ProxySelector.setDefault(new u7.m(java.net.ProxySelector.getDefault(), "127.0.0.1", localPort));
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            new java.lang.Thread(new u7.h(this, countDownLatch)).start();
            countDownLatch.await();
        } catch (java.io.IOException | java.lang.InterruptedException e17) {
            this.f425051b.shutdown();
            throw new java.lang.IllegalStateException("Error starting local proxy server", e17);
        }
    }

    public java.io.File a(java.lang.String str) {
        u7.c cVar = this.f425055f;
        return new java.io.File(cVar.f425033a, ((v7.i) cVar.f425034b).a(str));
    }

    public final u7.k b(java.lang.String str) {
        u7.k kVar;
        synchronized (this.f425050a) {
            kVar = (u7.k) ((java.util.concurrent.ConcurrentHashMap) this.f425052c).get(str);
            if (kVar == null) {
                kVar = new u7.k(str, this.f425055f);
                ((java.util.concurrent.ConcurrentHashMap) this.f425052c).put(str, kVar);
            }
        }
        return kVar;
    }

    public final int c() {
        int i17;
        synchronized (this.f425050a) {
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f425052c).values().iterator();
            i17 = 0;
            while (it.hasNext()) {
                i17 += ((u7.k) it.next()).f425057a.get();
            }
        }
        return i17;
    }

    public final void d(java.net.Socket socket) {
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (java.net.SocketException unused) {
        } catch (java.io.IOException e17) {
            new u7.r("Error closing socket input stream", e17);
        }
        try {
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (java.io.IOException unused2) {
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (java.io.IOException e18) {
            new u7.r("Error closing socket", e18);
        }
    }
}
