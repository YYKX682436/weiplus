package gy3;

/* loaded from: classes13.dex */
public final class d implements gy3.a, gy3.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f277553a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter f277554b;

    /* renamed from: c, reason: collision with root package name */
    public gy3.j f277555c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f277556d;

    /* renamed from: e, reason: collision with root package name */
    public gy3.k f277557e;

    /* renamed from: f, reason: collision with root package name */
    public long f277558f;

    /* renamed from: g, reason: collision with root package name */
    public final gy3.c f277559g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f277560h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f277561i;

    /* renamed from: j, reason: collision with root package name */
    public final gy3.b f277562j;

    /* renamed from: k, reason: collision with root package name */
    public android.content.BroadcastReceiver f277563k;

    public d(android.content.Context mContext) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f277553a = mContext;
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        kotlin.jvm.internal.o.f(defaultAdapter, "getDefaultAdapter(...)");
        this.f277554b = defaultAdapter;
        this.f277556d = "";
        this.f277559g = new gy3.c(this);
        this.f277562j = new gy3.b();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        if (this.f277563k == null) {
            android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver(this) { // from class: com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel$RtosBCReceiver

                /* renamed from: a, reason: collision with root package name */
                public final java.lang.ref.WeakReference f158581a;

                {
                    kotlin.jvm.internal.o.g(this, "rtosBCChannel");
                    this.f158581a = new java.lang.ref.WeakReference(this);
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent) {
                    java.lang.String action = intent != null ? intent.getAction() : null;
                    gy3.d dVar = (gy3.d) this.f158581a.get();
                    if (dVar == null || action == null) {
                        return;
                    }
                    int hashCode = action.hashCode();
                    gy3.c cVar = dVar.f277559g;
                    switch (hashCode) {
                        case -1530327060:
                            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                                int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_STATE_CHANGED------ from " + intExtra2 + " -> " + intExtra);
                                if ((intExtra2 == 11 || intExtra2 == 10) && intExtra == 12) {
                                    cVar.sendMessage(cVar.obtainMessage(7));
                                }
                                if ((intExtra2 == 13 || intExtra2 == 12) && intExtra == 10) {
                                    cVar.sendMessage(cVar.obtainMessage(8));
                                    return;
                                }
                                return;
                            }
                            return;
                        case -301431627:
                            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                kotlin.jvm.internal.o.d(bluetoothDevice);
                                java.lang.String address = bluetoothDevice.getAddress();
                                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_ACL_CONNECTED------ device name = " + bluetoothDevice.getName() + ", device Mac = " + address);
                                if (!r26.i0.p(dVar.f277556d, address, true) || dVar.f277561i || dVar.f277560h || !dVar.e()) {
                                    return;
                                }
                                dVar.f277562j.a();
                                dVar.b();
                                return;
                            }
                            return;
                        case 1821585647:
                            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                                android.bluetooth.BluetoothDevice bluetoothDevice2 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                kotlin.jvm.internal.o.d(bluetoothDevice2);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_ACL_DISCONNECTED------ device name = " + bluetoothDevice2.getName() + ", device Mac = " + bluetoothDevice2.getAddress());
                                return;
                            }
                            return;
                        case 2116862345:
                            if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                                android.bluetooth.BluetoothDevice bluetoothDevice3 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                kotlin.jvm.internal.o.d(bluetoothDevice3);
                                java.lang.String address2 = bluetoothDevice3.getAddress();
                                int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10);
                                int intExtra4 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_BOND_STATE_CHANGED------ device name = " + bluetoothDevice3.getName() + ", device Mac = " + address2 + ", from " + intExtra3 + " -> " + intExtra4);
                                if (r26.i0.p(dVar.f277556d, address2, true) && intExtra3 == 12 && intExtra4 == 10 && cVar != null) {
                                    cVar.sendMessage(cVar != null ? cVar.obtainMessage(3) : null);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            };
            this.f277563k = broadcastReceiver;
            mContext.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "clear");
        this.f277556d = "";
        this.f277557e = null;
        gy3.c cVar = this.f277559g;
        cVar.removeMessages(1);
        cVar.removeMessages(2);
        this.f277562j.a();
    }

    public void b() {
        if (this.f277556d.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosBCChannel", "device mac is empty");
            return;
        }
        if (this.f277560h || this.f277561i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosBCChannel", "Remoto device is aready connect or connecting, just leave");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "begin establish socket");
        this.f277561i = true;
        gy3.c cVar = this.f277559g;
        cVar.removeMessages(1);
        cVar.removeMessages(2);
        if (android.os.Build.VERSION.SDK_INT < 31 || b3.l.checkSelfPermission(this.f277553a, "android.permission.BLUETOOTH_SCAN") == 0) {
            this.f277554b.cancelDiscovery();
        }
        if (this.f277556d.length() > 0) {
            android.bluetooth.BluetoothDevice remoteDevice = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.f277556d);
            kotlin.jvm.internal.o.f(remoteDevice, "getRemoteDevice(...)");
            gy3.j jVar = this.f277555c;
            if (jVar != null) {
                gy3.f fVar = jVar.f277582b;
                if (fVar != null) {
                    fVar.a();
                }
                jVar.f277582b = null;
                gy3.f fVar2 = new gy3.f(jVar, remoteDevice);
                jVar.f277582b = fVar2;
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "------connect------");
                com.tencent.mm.sdk.platformtools.n3 n3Var = fVar2.f277568d;
                if (!n3Var.sendMessage(n3Var.obtainMessage(0))) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "sendMessage = %d failed!!!", 0);
                    ((gy3.d) fVar2.f277565a.f277581a).g();
                }
            }
            gy3.b bVar = this.f277562j;
            if (bVar.f277551c > 0) {
                cVar.sendMessageDelayed(cVar.obtainMessage(1), bVar.f277551c);
            }
        }
    }

    public java.lang.String c() {
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices;
        if (this.f277556d.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "getDeviceName mac is empty");
            return "";
        }
        if ((android.os.Build.VERSION.SDK_INT < 31 || b3.l.checkSelfPermission(this.f277553a, "android.permission.BLUETOOTH_CONNECT") == 0) && (bondedDevices = this.f277554b.getBondedDevices()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "Found " + bondedDevices.size() + " devices when getting device name");
            java.util.Iterator<android.bluetooth.BluetoothDevice> it = bondedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.bluetooth.BluetoothDevice next = it.next();
                if (r26.i0.p(next.getAddress(), this.f277556d, true)) {
                    if (next.getName() != null) {
                        java.lang.String name = next.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        return name;
                    }
                }
            }
        }
        return "";
    }

    public boolean d(java.lang.String mac) {
        kotlin.jvm.internal.o.g(mac, "mac");
        if (this.f277556d.length() > 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosBCChannel", "try init mac but not null");
            return true;
        }
        java.lang.String upperCase = mac.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
        this.f277556d = upperCase;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "BC channel init with mac " + this.f277556d);
        this.f277562j.a();
        this.f277555c = new gy3.j(this.f277556d, this);
        this.f277558f = a42.i.h(this.f277556d);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "channel is " + this.f277558f);
        return this.f277558f != 0;
    }

    public boolean e() {
        java.lang.String mac = this.f277556d;
        kotlin.jvm.internal.o.g(mac, "mac");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "checkDeviceBonded ".concat(mac));
        if (mac.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "checkDeviceBonded mac is empty");
        } else {
            android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f277554b;
            if (bluetoothAdapter.isEnabled()) {
                if (android.os.Build.VERSION.SDK_INT < 31 || b3.l.checkSelfPermission(this.f277553a, "android.permission.BLUETOOTH_CONNECT") == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "Permission check passed, attempting to get bonded devices");
                    java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
                    if (bondedDevices != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "Found " + bondedDevices.size() + " bonded devices");
                        for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
                            kotlin.jvm.internal.o.d(bluetoothDevice);
                            if (r26.i0.p(bluetoothDevice.getAddress(), mac, true)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "device " + mac + " was bonded!");
                                return true;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "No matching device found in bonded devices list");
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosBCChannel", "bondedDevices is null");
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosBCChannel", "BLUETOOTH_CONNECT permission not granted");
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosBCChannel", "no bondedDevices or device not found");
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosBCChannel", "Bluetooth is not enabled, cannot get bonded devices");
            }
        }
        return false;
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "onConnecting");
        this.f277561i = true;
        this.f277560h = false;
    }

    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "onDisconnected");
        boolean z17 = false;
        this.f277561i = false;
        this.f277560h = false;
        gy3.c cVar = this.f277559g;
        cVar.sendMessage(cVar.obtainMessage(6));
        if (!e() || cVar.hasMessages(2)) {
            return;
        }
        android.os.Message obtainMessage = cVar.obtainMessage(2);
        gy3.b bVar = this.f277562j;
        long j17 = bVar.f277549a + bVar.f277550b;
        bVar.f277549a = j17;
        long j18 = 30000;
        if (11000 <= j17 && j17 < 30000) {
            z17 = true;
        }
        if (z17) {
            bVar.f277550b = 3000L;
            bVar.f277551c = 8000L;
        }
        if (j17 >= 30000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "enter long delay reconnect strategy");
            bVar.f277549a = 30000L;
            bVar.f277550b = 0L;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "reconnect delay " + bVar.f277549a);
            j18 = bVar.f277549a;
        }
        cVar.sendMessageDelayed(obtainMessage, j18);
    }

    public void h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "channel onError, " + str);
    }

    public void i(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "--------send, data size = " + i17 + ", result = " + z17);
    }
}
