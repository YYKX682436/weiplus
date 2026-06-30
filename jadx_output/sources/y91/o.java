package y91;

/* loaded from: classes13.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f460303a;

    /* renamed from: b, reason: collision with root package name */
    public int f460304b;

    /* renamed from: e, reason: collision with root package name */
    public final y91.m f460307e = new y91.l(this);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f460305c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f460306d = new java.util.HashMap();

    public o(y91.h hVar) {
    }

    public boolean a() {
        y91.t tVar = y91.s.f460311a;
        tVar.f460316e = null;
        synchronized (tVar) {
            if (tVar.f460312a) {
                tVar.f460312a = false;
                java.net.ServerSocket serverSocket = tVar.f460315d;
                if (serverSocket != null && serverSocket.isClosed()) {
                    try {
                        tVar.f460315d.close();
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        }
        ((java.util.HashMap) this.f460305c).clear();
        ((java.util.HashMap) this.f460306d).clear();
        return true;
    }

    public boolean b() {
        y91.t tVar = y91.s.f460311a;
        tVar.f460316e = this.f460307e;
        synchronized (tVar) {
            if (!tVar.f460312a) {
                tVar.f460312a = true;
                try {
                    java.lang.String b17 = y91.z.b();
                    tVar.f460313b = b17;
                    java.net.ServerSocket serverSocket = new java.net.ServerSocket(0, 32, java.net.InetAddress.getByName(b17));
                    tVar.f460315d = serverSocket;
                    tVar.f460314c = serverSocket.getLocalPort();
                    java.lang.Thread thread = new java.lang.Thread(new y91.r(tVar));
                    thread.setName("DLNA-Server-Thread");
                    thread.start();
                } catch (java.io.IOException unused) {
                }
            }
        }
        this.f460303a = tVar.f460313b;
        this.f460304b = tVar.f460314c;
        return true;
    }

    public final java.lang.String c(java.lang.String str) {
        return "http://" + this.f460303a + ":" + this.f460304b + str;
    }
}
