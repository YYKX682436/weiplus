package tk1;

/* loaded from: classes7.dex */
public class b implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f419893d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tk1.c f419894e;

    public b(tk1.c cVar, tk1.a aVar) {
        this.f419894e = cVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "WebsocketWriteThread";
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.f419893d && !java.lang.Thread.interrupted()) {
            try {
                try {
                    try {
                        try {
                            if (!this.f419894e.f419896f.f408939d.isEmpty()) {
                                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) ((java.util.concurrent.LinkedBlockingQueue) this.f419894e.f419896f.f408939d).poll(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                                if (byteBuffer != null) {
                                    this.f419894e.f419899i.write(byteBuffer.array(), 0, byteBuffer.limit());
                                    this.f419894e.f419899i.flush();
                                }
                            }
                        } catch (java.io.IOException e17) {
                            tk1.c cVar = this.f419894e;
                            cVar.getClass();
                            if (e17 instanceof javax.net.ssl.SSLException) {
                                cVar.l(e17);
                            }
                            cVar.f419896f.e();
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetWork.WebSocketClient", e17, "[WebsocketWriteThread] run IOException", new java.lang.Object[0]);
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
                        }
                    } catch (java.lang.Exception e18) {
                        tk1.c cVar2 = this.f419894e;
                        cVar2.getClass();
                        if (e18 instanceof javax.net.ssl.SSLException) {
                            cVar2.l(e18);
                        }
                        cVar2.f419896f.e();
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetWork.WebSocketClient", e18, "[WebsocketWriteThread] run Exception", new java.lang.Object[0]);
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
                    try {
                        this.f419894e.f419899i.close();
                    } catch (java.io.IOException unused) {
                    }
                    tk1.c.h(this.f419894e);
                    throw th6;
                }
            } catch (java.lang.InterruptedException unused2) {
                java.util.Iterator it = ((java.util.concurrent.LinkedBlockingQueue) this.f419894e.f419896f.f408939d).iterator();
                while (it.hasNext()) {
                    java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) it.next();
                    this.f419894e.f419899i.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                    this.f419894e.f419899i.flush();
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
        try {
            this.f419894e.f419899i.close();
        } catch (java.io.IOException unused3) {
        }
        tk1.c.h(this.f419894e);
    }
}
