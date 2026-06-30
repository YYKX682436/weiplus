package hq1;

/* loaded from: classes13.dex */
public final class h0 {

    /* renamed from: t, reason: collision with root package name */
    public static int f283109t;

    /* renamed from: a, reason: collision with root package name */
    public final long f283110a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f283111b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f283112c;

    /* renamed from: d, reason: collision with root package name */
    public android.bluetooth.BluetoothGatt f283113d;

    /* renamed from: e, reason: collision with root package name */
    public hq1.f0 f283114e;

    /* renamed from: f, reason: collision with root package name */
    public final hq1.a f283115f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f283116g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f283117h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f283118i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f283119j;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f283123n;

    /* renamed from: r, reason: collision with root package name */
    public boolean f283127r;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f283121l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f283122m = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f283124o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public long f283125p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f283126q = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final android.bluetooth.BluetoothGattCallback f283128s = new hq1.b0(this);

    /* renamed from: k, reason: collision with root package name */
    public final hq1.h0 f283120k = this;

    public h0(long j17, android.content.Context context, hq1.f0 f0Var) {
        this.f283114e = f0Var;
        this.f283112c = context;
        android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f283110a = j17;
        this.f283123n = 3;
        this.f283111b = adapter.getRemoteDevice(a42.i.f(j17));
        this.f283115f = new hq1.a(20);
        this.f283127r = false;
        this.f283116g = new hq1.g0(xu5.b.a("BluetoothLESimpleSession_handlerThread"), this);
        this.f283117h = new hq1.c0(this);
        this.f283118i = new hq1.d0(this);
        this.f283119j = new hq1.e0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(hq1.h0 r25, android.bluetooth.BluetoothGattCharacteristic r26) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hq1.h0.a(hq1.h0, android.bluetooth.BluetoothGattCharacteristic):void");
    }

    public boolean b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------connect------, mac=%s, name=%s", a42.i.f(this.f283110a), lq1.a.c(this.f283111b));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283116g;
        return n3Var.sendMessage(n3Var.obtainMessage(0));
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "markSessionDisconnected, mac=%s, name=%s", a42.i.f(this.f283110a), lq1.a.c(this.f283111b));
        this.f283123n = 2;
        this.f283116g.removeCallbacks(this.f283118i);
        this.f283116g.removeCallbacks(this.f283119j);
        d();
        e();
    }

    public final void d() {
        hq1.f0 f0Var = this.f283114e;
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f283111b;
        long j17 = this.f283110a;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------ don't need to notify, mac=%s, name=%s", a42.i.f(j17), lq1.a.c(bluetoothDevice));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------, mac=%s, name=%s", a42.i.f(j17), lq1.a.c(bluetoothDevice));
        hq1.f0 f0Var2 = this.f283114e;
        if (f0Var2 != null) {
            f0Var2.a(this.f283110a, false, this.f283125p);
        }
        this.f283114e = null;
    }

    public final void e() {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f283113d;
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f283111b;
        long j17 = this.f283110a;
        if (bluetoothGatt == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------ nothing to release, objid=%d, mac=%s, name=%s", java.lang.Integer.valueOf(hashCode()), a42.i.f(j17), lq1.a.c(bluetoothDevice));
            return;
        }
        f283109t--;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------, objid=%d, resourceCount=%d, mac=%s, name=%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(f283109t), a42.i.f(j17), lq1.a.c(bluetoothDevice));
        this.f283127r = false;
        this.f283113d.close();
        this.f283116g.quitSafely();
        this.f283113d = null;
    }

    public final void f() {
        if (this.f283121l.isEmpty()) {
            this.f283122m = false;
            return;
        }
        iq1.a b17 = iq1.a.b((byte[]) this.f283121l.pop());
        byte[] a17 = b17.a();
        java.lang.String str = b17.f293668e;
        int i17 = b17.f293669f;
        java.lang.String b18 = iq1.f.b(b17.f293667d);
        java.util.HashMap hashMap = (java.util.HashMap) this.f283124o.get(b18);
        if (hashMap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "service(%s) not found, mac=%s, name=%s", b18, a42.i.f(this.f283110a), lq1.a.c(this.f283111b));
            hq1.f0 f0Var = this.f283114e;
            if (f0Var != null) {
                f0Var.b(this.f283110a, false);
                return;
            }
            return;
        }
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = (android.bluetooth.BluetoothGattCharacteristic) hashMap.get(str);
        if (bluetoothGattCharacteristic == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (str == null) {
                str = "null";
            }
            objArr[0] = str;
            objArr[1] = a42.i.f(this.f283110a);
            objArr[2] = lq1.a.c(this.f283111b);
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic(%s) not found, mac=%s, name=%s", objArr);
            hq1.f0 f0Var2 = this.f283114e;
            if (f0Var2 != null) {
                f0Var2.b(this.f283110a, false);
                return;
            }
            return;
        }
        if (i17 != 8) {
            a42.i.f(this.f283110a);
            lq1.a.c(this.f283111b);
            hq1.f0 f0Var3 = this.f283114e;
            if (f0Var3 != null) {
                f0Var3.b(this.f283110a, false);
                return;
            }
            return;
        }
        hq1.a aVar = this.f283115f;
        aVar.f283080d = bluetoothGattCharacteristic;
        if (a17 == null) {
            aVar.f283077a = null;
            aVar.f283079c = 0;
            aVar.f283078b = 0;
        } else {
            byte[] bArr = new byte[a17.length];
            aVar.f283077a = bArr;
            java.lang.System.arraycopy(a17, 0, bArr, 0, a17.length);
            aVar.f283079c = a17.length;
            aVar.f283078b = 0;
        }
        byte[] a18 = this.f283115f.a();
        a42.i.a(a18);
        a42.i.f(this.f283110a);
        lq1.a.c(this.f283111b);
        bluetoothGattCharacteristic.setValue(a18);
        this.f283116g.postDelayed(this.f283117h, 5000L);
        if (this.f283113d.writeCharacteristic(bluetoothGattCharacteristic)) {
            this.f283122m = true;
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "mBluetoothGatt.writeCharacteristic Failed!!!, mac=%s, name=%s", a42.i.f(this.f283110a), lq1.a.c(this.f283111b));
        hq1.f0 f0Var4 = this.f283114e;
        if (f0Var4 != null) {
            f0Var4.b(this.f283110a, false);
        }
    }
}
