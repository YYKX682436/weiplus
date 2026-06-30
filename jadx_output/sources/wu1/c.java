package wu1;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public int f449669d;

    /* renamed from: e, reason: collision with root package name */
    public int f449670e;

    /* renamed from: a, reason: collision with root package name */
    public final xu1.b f449666a = new xu1.b();

    /* renamed from: b, reason: collision with root package name */
    public final yu1.d f449667b = new yu1.c();

    /* renamed from: c, reason: collision with root package name */
    public final zu1.b f449668c = new zu1.a();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f449671f = new java.util.ArrayList();

    public final void a() {
        yu1.c cVar = (yu1.c) this.f449667b;
        cVar.f465845b = false;
        ((java.util.ArrayList) cVar.f465844a).clear();
        if (cVar.f465846c != null && cVar.f465845b) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yu1.b(cVar, null), 2, null);
        }
        zu1.a aVar = (zu1.a) this.f449668c;
        aVar.getClass();
        aVar.f475688a = false;
        java.lang.Thread.sleep(50L);
        xu1.b bVar = this.f449666a;
        if (bVar.f457188a == xu1.c.f457192f) {
            java.net.Socket socket = bVar.f457189b;
            kotlin.jvm.internal.o.d(socket);
            socket.close();
            bVar.f457188a = xu1.c.f457190d;
            bVar.f457189b = new java.net.Socket();
        }
    }

    public final int b(byte b17, byte[] data, byte b18) {
        kotlin.jvm.internal.o.g(data, "data");
        int length = data.length + 12;
        byte[] bArr = new byte[12];
        bArr[0] = (byte) 105;
        bArr[1] = (byte) 2;
        bArr[2] = (byte) (length & 255);
        bArr[3] = (byte) ((length >>> 8) & 255);
        bArr[4] = (byte) ((length >>> 16) & 255);
        bArr[5] = (byte) ((length >>> 24) & 255);
        bArr[6] = (byte) 12;
        bArr[7] = (byte) 0;
        bArr[8] = b17;
        if (b17 == 1) {
            int i17 = this.f449670e + 1;
            this.f449670e = i17;
            bArr[9] = (byte) (i17 & 255);
            bArr[10] = (byte) ((i17 >>> 8) & 255);
        }
        if (b17 == 2) {
            int i18 = this.f449669d + 1;
            this.f449669d = i18;
            bArr[9] = (byte) (i18 & 255);
            bArr[10] = (byte) ((i18 >>> 8) & 255);
        }
        bArr[11] = b18;
        byte[] x17 = kz5.v.x(bArr, data);
        zu1.a aVar = (zu1.a) this.f449668c;
        aVar.getClass();
        try {
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteWriter", "error happened in send data");
        }
        if (!aVar.f475688a) {
            return 0;
        }
        java.net.Socket socket = aVar.f475690c;
        if (socket == null || !socket.isConnected()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteWriter", "socket not connected");
            return -1;
        }
        java.io.OutputStream outputStream = aVar.f475689b;
        if (outputStream != null) {
            outputStream.write(x17);
        }
        java.io.OutputStream outputStream2 = aVar.f475689b;
        if (outputStream2 == null) {
            return 0;
        }
        outputStream2.flush();
        return 0;
    }
}
