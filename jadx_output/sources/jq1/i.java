package jq1;

/* loaded from: classes13.dex */
public final class i implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.bluetooth.BluetoothSocket f301083d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f301084e;

    /* renamed from: f, reason: collision with root package name */
    public final jq1.f f301085f;

    /* renamed from: g, reason: collision with root package name */
    public final jq1.e f301086g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f301087h = false;

    public i(jq1.f fVar, jq1.e eVar, android.bluetooth.BluetoothSocket bluetoothSocket) {
        this.f301083d = bluetoothSocket;
        this.f301085f = fVar;
        this.f301086g = eVar;
        this.f301084e = null;
        try {
            this.f301084e = bluetoothSocket.getInputStream();
        } catch (java.io.IOException e17) {
            this.f301084e = null;
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! (%s)", e17.toString());
        }
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RecvThread", "------cancel------");
        if (this.f301087h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.RecvThread", "Cancel is done aready, just leave");
            return;
        }
        this.f301087h = true;
        try {
            this.f301083d.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RecvThread", "close() of connect socket failed", e17);
        }
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "BluetoothChatSession_recv";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RecvThread", "BEGIN RecvThread");
        if (this.f301084e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! Just Leave");
            return;
        }
        byte[] bArr = new byte[2048];
        while (!this.f301087h) {
            try {
                int read = this.f301084e.read(bArr);
                if (read > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RecvThread", "------On data receivce------data length = %d", java.lang.Integer.valueOf(read));
                    a42.i.b(bArr, read);
                    byte[] bArr2 = new byte[read];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, read);
                    jq1.e eVar = this.f301086g;
                    if (eVar != null) {
                        jq1.c cVar = eVar.f301061a;
                        long j17 = this.f301085f.f301070b;
                        kq1.d dVar = (kq1.d) cVar;
                        dVar.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onRecv*** sessionId = " + j17);
                        iz5.a.g(null, kq1.n.a(dVar.f311239a, 1, 1, 0, new kq1.k(j17, bArr2)));
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RecvThread", "mInStream.read Failed!!! (%s)", e17.toString());
                try {
                    this.f301083d.close();
                    return;
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RecvThread", "Close socket failed!!! (%s)", e18.toString());
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.RecvThread", "Cancel is called while receiving data, just leave");
    }
}
