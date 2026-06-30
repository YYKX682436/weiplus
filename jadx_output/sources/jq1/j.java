package jq1;

/* loaded from: classes13.dex */
public final class j implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Runnable f301088d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.OutputStream f301089e;

    /* renamed from: h, reason: collision with root package name */
    public final jq1.f f301092h;

    /* renamed from: i, reason: collision with root package name */
    public final jq1.e f301093i;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f301090f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f301091g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f301094m = false;

    public j(jq1.f fVar, jq1.e eVar, android.bluetooth.BluetoothSocket bluetoothSocket) {
        this.f301088d = null;
        this.f301089e = null;
        this.f301092h = null;
        this.f301093i = null;
        this.f301092h = fVar;
        this.f301093i = eVar;
        try {
            java.io.OutputStream outputStream = bluetoothSocket.getOutputStream();
            this.f301088d = this;
            this.f301089e = outputStream;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SendThread", "temp sockets not created", e17);
            this.f301089e = null;
            if (this.f301093i != null) {
                this.f301093i.f301061a.b(this.f301092h.f301070b, 11, "Can not get write stream");
            }
        }
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "BluetoothChatSession_send";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SendThread", "BEGIN SendThread");
        if (this.f301089e == null) {
            return;
        }
        while (!this.f301094m) {
            if (this.f301088d == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.SendThread", "Send thread has been close. just leave");
                return;
            }
            if (!this.f301091g.isEmpty()) {
                try {
                    this.f301089e.write((byte[]) this.f301091g.pop());
                    jq1.e eVar = this.f301093i;
                    if (eVar != null) {
                        eVar.f301061a.c(this.f301092h.f301070b, true);
                    }
                } catch (java.io.IOException unused) {
                    jq1.e eVar2 = this.f301093i;
                    if (eVar2 != null) {
                        eVar2.f301061a.c(this.f301092h.f301070b, false);
                    }
                }
            } else if (this.f301090f.isEmpty()) {
                synchronized (this) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.SendThread", e17, "", new java.lang.Object[0]);
                        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.SendThread", "BluetoothChatThread_SendRunnable InterruptedException...");
                    }
                }
            } else {
                synchronized (this.f301090f) {
                    iz5.a.g(null, this.f301091g.addAll(this.f301090f));
                    this.f301090f.clear();
                }
            }
        }
    }
}
