package y91;

/* loaded from: classes13.dex */
public class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static y91.k0 f460296d;

    /* renamed from: a, reason: collision with root package name */
    public java.net.MulticastSocket f460297a;

    /* renamed from: b, reason: collision with root package name */
    public final java.net.InetAddress f460298b;

    /* renamed from: c, reason: collision with root package name */
    public int f460299c;

    public k0(boolean z17) {
        this.f460299c = -1;
        try {
            this.f460298b = java.net.InetAddress.getByName("239.255.255.250");
            if (z17) {
                java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket();
                this.f460297a = multicastSocket;
                multicastSocket.setBroadcast(true);
                this.f460299c = this.f460297a.getLocalPort();
            }
        } catch (java.io.IOException e17) {
            v91.b.c("TransporterImpl", e17, "");
        }
    }

    public aa1.e a(w91.f fVar) {
        android.net.http.AndroidHttpClient androidHttpClient = null;
        try {
            androidHttpClient = android.net.http.AndroidHttpClient.newInstance("");
            y91.j0 j0Var = new y91.j0(fVar.f444065c, fVar.f444063a);
            java.util.Map map = fVar.f444067e;
            if (map != null) {
                java.util.HashMap hashMap = (java.util.HashMap) map;
                if (!hashMap.isEmpty()) {
                    for (java.util.Map.Entry entry : hashMap.entrySet()) {
                        j0Var.addHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                    }
                }
            }
            java.lang.String a17 = fVar.a();
            if (!android.text.TextUtils.isEmpty(a17)) {
                org.apache.http.entity.StringEntity stringEntity = new org.apache.http.entity.StringEntity(a17, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                stringEntity.setContentType("text/xml; charset=\"utf-8\"");
                j0Var.setEntity(stringEntity);
            }
            org.apache.http.HttpResponse execute = androidHttpClient.execute(j0Var);
            androidHttpClient.close();
            aa1.e eVar = new aa1.e(false);
            eVar.f2488a = new aa1.b();
            for (org.apache.http.Header header : execute.getAllHeaders()) {
                eVar.f2488a.b(header.getName(), header.getValue());
            }
            eVar.f2489b = new y91.l0().a(org.apache.http.util.EntityUtils.toString(execute.getEntity(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding).replaceAll("&(?!amp;)", "&amp;"));
            eVar.f2487c = execute.getStatusLine().getStatusCode();
            return eVar;
        } catch (java.io.IOException e17) {
            if (androidHttpClient != null) {
                androidHttpClient.close();
            }
            v91.b.a("TransporterImpl", e17.toString());
            throw e17;
        }
    }

    public void b(w91.d dVar) {
        y91.k0 k0Var = f460296d;
        java.net.InetAddress inetAddress = this.f460298b;
        if (this == k0Var) {
            byte[] bytes = dVar.a().getBytes();
            this.f460297a.send(new java.net.DatagramPacket(bytes, bytes.length, inetAddress, 1900));
            return;
        }
        if (this.f460297a == null) {
            java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket();
            this.f460297a = multicastSocket;
            multicastSocket.setBroadcast(true);
            this.f460299c = this.f460297a.getLocalPort();
        }
        byte[] bytes2 = dVar.a().getBytes();
        this.f460297a.send(new java.net.DatagramPacket(bytes2, bytes2.length, inetAddress, 1900));
        this.f460297a.close();
    }

    public void finalize() {
        if (this == f460296d) {
            this.f460297a.close();
        }
        super.finalize();
    }
}
