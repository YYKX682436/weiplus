package gy3;

/* loaded from: classes13.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final gy3.j f277569d;

    /* renamed from: e, reason: collision with root package name */
    public final android.bluetooth.BluetoothSocket f277570e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.InputStream f277571f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f277572g;

    public h(gy3.j mSession, android.bluetooth.BluetoothSocket mSocket) {
        kotlin.jvm.internal.o.g(mSession, "mSession");
        kotlin.jvm.internal.o.g(mSocket, "mSocket");
        this.f277569d = mSession;
        this.f277570e = mSocket;
        this.f277571f = null;
        try {
            this.f277571f = mSocket.getInputStream();
        } catch (java.io.IOException e17) {
            this.f277571f = null;
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RecvThread", "socket.getInputStream failed!!! (%s)", e17.toString());
            ((gy3.d) this.f277569d.f277581a).h("Can not get read stream");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        gy3.j jVar = this.f277569d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RecvThread", "BEGIN RecvThread");
        java.io.InputStream inputStream = this.f277571f;
        if (inputStream == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RecvThread", "socket.getInputStream failed!!! Just Leave");
            return;
        }
        byte[] bArr = new byte[com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES];
        while (!this.f277572g) {
            try {
                kotlin.jvm.internal.o.d(inputStream);
                int read = inputStream.read(bArr);
                if (read > 0) {
                    byte[] bArr2 = new byte[read];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, read);
                    gy3.d dVar = (gy3.d) jVar.f277581a;
                    dVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "recv--------, data size = " + java.lang.Integer.valueOf(read));
                    gy3.c cVar = dVar.f277559g;
                    cVar.sendMessage(cVar.obtainMessage(4, bArr2));
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RecvThread", "mInStream.read Failed!!! (%s)", e17.toString());
                ((gy3.d) jVar.f277581a).g();
                try {
                    this.f277570e.close();
                    return;
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RecvThread", "Close socket failed!!! (%s)", e18.toString());
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RecvThread", "Cancel is called while receiving data, just leave");
    }
}
