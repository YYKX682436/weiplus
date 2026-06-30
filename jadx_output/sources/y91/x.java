package y91;

/* loaded from: classes16.dex */
public class x {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f460319h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final y91.y f460320a;

    /* renamed from: b, reason: collision with root package name */
    public y91.i0 f460321b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f460322c;

    /* renamed from: d, reason: collision with root package name */
    public java.net.InetSocketAddress f460323d;

    /* renamed from: e, reason: collision with root package name */
    public java.net.MulticastSocket f460324e;

    /* renamed from: f, reason: collision with root package name */
    public java.net.MulticastSocket f460325f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f460326g = false;

    public x(y91.y yVar, java.util.List list, y91.i0 i0Var, int i17) {
        this.f460320a = yVar;
        this.f460321b = i0Var;
        this.f460322c = list;
        try {
            java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(i17);
            this.f460324e = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.f460324e.setReceiveBufferSize(32768);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Creating wildcard socketNotify (for receiving multicast datagrams) on port: ");
            int i18 = yVar.f460328b;
            sb6.append(i18);
            v91.b.b("x", sb6.toString());
            this.f460323d = new java.net.InetSocketAddress(yVar.f460327a, i18);
            java.net.MulticastSocket multicastSocket2 = new java.net.MulticastSocket(i18);
            this.f460325f = multicastSocket2;
            multicastSocket2.setReuseAddress(true);
            this.f460325f.setReceiveBufferSize(32768);
            for (java.net.NetworkInterface networkInterface : this.f460322c) {
                v91.b.b("x", "Joining multicast group: " + this.f460323d + " on network interface: " + networkInterface.getDisplayName());
                this.f460325f.joinGroup(this.f460323d, networkInterface);
            }
        } catch (java.lang.Exception e17) {
            throw new java.lang.Exception("Could not initialize x: " + e17);
        }
    }

    public static void a(y91.x xVar) {
        v91.b.b("x", "Entering blocking search receiving loop, listening for UDP datagrams on port: " + xVar.f460324e.getLocalPort());
        y91.l0 l0Var = new y91.l0();
        while (xVar.f460326g) {
            try {
                int i17 = xVar.f460320a.f460329c;
                java.net.DatagramPacket datagramPacket = new java.net.DatagramPacket(new byte[i17], i17);
                xVar.f460324e.receive(datagramPacket);
                java.lang.String str = new java.lang.String(datagramPacket.getData(), 0, datagramPacket.getLength(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                v91.b.b("x", "loopSearch: content = " + str);
                aa1.b c17 = l0Var.c(str);
                if (c17 != null) {
                    xVar.f460321b.e(c17);
                } else {
                    v91.b.a("x", "discard this message");
                }
            } catch (java.io.IOException e17) {
                v91.b.a("x", "search fail: " + android.util.Log.getStackTraceString(e17));
                xVar.f460326g = false;
                throw e17;
            }
        }
        v91.b.a("x", "loop end");
    }

    public static void b(y91.x xVar) {
        v91.b.b("x", "Entering blocking notify receiving loop, listening for UDP datagrams on port: " + xVar.f460325f.getLocalPort());
        y91.l0 l0Var = new y91.l0();
        while (xVar.f460326g) {
            try {
                int i17 = xVar.f460320a.f460329c;
                java.net.DatagramPacket datagramPacket = new java.net.DatagramPacket(new byte[i17], i17);
                xVar.f460325f.receive(datagramPacket);
                java.lang.String str = new java.lang.String(datagramPacket.getData(), 0, datagramPacket.getLength(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                v91.b.b("x", str);
                aa1.b c17 = l0Var.c(str);
                if (c17 != null) {
                    xVar.f460321b.e(c17);
                } else {
                    v91.b.b("x", "receive a not care notify message");
                }
            } catch (java.io.IOException e17) {
                v91.b.a("x", "notify fail: " + android.util.Log.getStackTraceString(e17));
                xVar.f460326g = false;
                throw e17;
            }
        }
        v91.b.a("x", "loop end");
    }

    public synchronized void c() {
        if (this.f460326g) {
            return;
        }
        this.f460326g = true;
        new java.lang.Thread(new y91.w(this, null)).start();
        new java.lang.Thread(new y91.v(this, null)).start();
    }
}
