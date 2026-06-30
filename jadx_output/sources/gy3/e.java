package gy3;

/* loaded from: classes13.dex */
public final class e extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f277564a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String name, gy3.f context) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(context, "context");
        this.f277564a = new java.lang.ref.WeakReference(context);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        gy3.f fVar = (gy3.f) this.f277564a.get();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "handleMessage " + msg.what);
        int i17 = msg.what;
        if (i17 != 0) {
            if (i17 == 1 && fVar != null) {
                try {
                    try {
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "begin close socket");
                            android.bluetooth.BluetoothSocket bluetoothSocket = fVar.f277567c;
                            if (bluetoothSocket != null) {
                                bluetoothSocket.close();
                            }
                        } catch (java.lang.NullPointerException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket null!!! (" + e17 + ')');
                        }
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "socket close failed (%s)", e18.toString());
                    }
                    return;
                } finally {
                    fVar.f277567c = null;
                }
            }
            return;
        }
        if (fVar != null) {
            if (android.os.Build.VERSION.SDK_INT >= 31 && b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_CONNECT") != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "don`t have bluetooth connect permission");
                return;
            }
            try {
                android.bluetooth.BluetoothSocket createInsecureRfcommSocketToServiceRecord = fVar.f277566b.createInsecureRfcommSocketToServiceRecord(gy3.j.f277580e);
                fVar.f277567c = createInsecureRfcommSocketToServiceRecord;
                if (createInsecureRfcommSocketToServiceRecord == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "createRfcommSocket Failed: null");
                    ((gy3.d) fVar.f277565a.f277581a).h("Can not createRfcommSocket");
                    ((gy3.d) fVar.f277565a.f277581a).g();
                    return;
                }
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "begin socket connect()");
                    ((gy3.d) fVar.f277565a.f277581a).f();
                    createInsecureRfcommSocketToServiceRecord.connect();
                    gy3.d dVar = (gy3.d) fVar.f277565a.f277581a;
                    dVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "onConnected");
                    dVar.f277561i = false;
                    dVar.f277560h = true;
                    dVar.f277562j.a();
                    gy3.c cVar = dVar.f277559g;
                    cVar.sendMessage(cVar.obtainMessage(5));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "startWorkThread");
                    gy3.j jVar = fVar.f277565a;
                    jVar.getClass();
                    gy3.h hVar = jVar.f277583c;
                    if (hVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RecvThread", "RecvRunnable cancel");
                        if (hVar.f277572g) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RecvThread", "Cancel is done aready, just leave");
                        } else {
                            hVar.f277572g = true;
                        }
                    }
                    jVar.f277583c = null;
                    gy3.i iVar = jVar.f277584d;
                    if (iVar != null) {
                        iVar.a();
                    }
                    jVar.f277584d = null;
                    jVar.f277583c = new gy3.h(jVar, createInsecureRfcommSocketToServiceRecord);
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    gy3.h hVar2 = jVar.f277583c;
                    kotlin.jvm.internal.o.d(hVar2);
                    ((ku5.t0) u0Var).q(hVar2);
                    jVar.f277584d = new gy3.i(jVar, createInsecureRfcommSocketToServiceRecord);
                    ku5.u0 u0Var2 = ku5.t0.f312615d;
                    gy3.i iVar2 = jVar.f277584d;
                    kotlin.jvm.internal.o.d(iVar2);
                    ((ku5.t0) u0Var2).q(iVar2);
                } catch (java.io.IOException e19) {
                    fVar.b(e19);
                } catch (java.lang.NullPointerException e27) {
                    fVar.b(e27);
                } catch (java.lang.SecurityException e28) {
                    fVar.b(e28);
                }
            } catch (java.io.IOException e29) {
                fVar.f277567c = null;
                com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "createRfcommSocket Failed!!! (" + e29 + ')');
                ((gy3.d) fVar.f277565a.f277581a).h("Can not createRfcommSocket");
                ((gy3.d) fVar.f277565a.f277581a).g();
            }
        }
    }
}
