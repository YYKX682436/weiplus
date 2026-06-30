package jq1;

/* loaded from: classes13.dex */
public class g extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f301075a;

    public g(xu5.b bVar, jq1.h hVar) {
        super(bVar);
        this.f301075a = null;
        this.f301075a = new java.lang.ref.WeakReference(hVar);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        jq1.h hVar = (jq1.h) this.f301075a.get();
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothChatThreads", "null == connectTread");
            return;
        }
        int i17 = message.what;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            if (!hVar.f301080e) {
                com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ConnectThread", "Remoto device is aready disconnect, just leave");
                return;
            }
            try {
                hVar.f301076a.close();
                return;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ConnectThread", "socket close failed (%s)", e17.toString());
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ConnectThread", "------connectImp------");
        if (hVar.f301080e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ConnectThread", "Remoto device is aready connect, just leave");
            return;
        }
        try {
            if (hVar.f301077b) {
                hVar.f301076a = hVar.f301081f.createRfcommSocketToServiceRecord(jq1.e.f301059i);
            } else {
                hVar.f301076a = hVar.f301081f.createInsecureRfcommSocketToServiceRecord(jq1.e.f301060j);
            }
            try {
                hVar.f301076a.connect();
                hVar.f301080e = true;
                jq1.f fVar = hVar.f301078c;
                jq1.e eVar = hVar.f301079d;
                android.bluetooth.BluetoothSocket bluetoothSocket = hVar.f301076a;
                fVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothChatSession", "connected");
                jq1.i iVar = fVar.f301072d;
                if (iVar != null) {
                    iVar.a();
                    fVar.f301072d = null;
                }
                jq1.j jVar = fVar.f301073e;
                if (jVar != null) {
                    jVar.f301088d = null;
                    jVar.f301094m = true;
                    synchronized (jVar) {
                        jVar.notify();
                    }
                    jVar.f301091g.clear();
                    jVar.f301090f.clear();
                    fVar.f301073e = null;
                }
                fVar.f301072d = new jq1.i(fVar, eVar, bluetoothSocket);
                ((ku5.t0) ku5.t0.f312615d).q(fVar.f301072d);
                fVar.f301073e = new jq1.j(fVar, eVar, bluetoothSocket);
                ((ku5.t0) ku5.t0.f312615d).q(fVar.f301073e);
                jq1.e eVar2 = hVar.f301079d;
                if (eVar2 != null) {
                    eVar2.f301061a.a(hVar.f301078c.f301070b, true);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ConnectThread", "socket connect failed (%s)", e18.toString());
                try {
                    hVar.f301076a.close();
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ConnectThread", "Close socket failed!!! (%s)", e19.toString());
                }
                jq1.e eVar3 = hVar.f301079d;
                if (eVar3 != null) {
                    eVar3.f301061a.a(hVar.f301078c.f301070b, false);
                }
            }
        } catch (java.io.IOException e27) {
            hVar.f301076a = null;
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ConnectThread", "createRfcommSocket Failed!!! (%s)", e27.toString());
            jq1.e eVar4 = hVar.f301079d;
            if (eVar4 != null) {
                eVar4.f301061a.a(hVar.f301078c.f301070b, false);
            }
        }
    }
}
