package io3;

/* loaded from: classes13.dex */
public class c implements io3.d {

    /* renamed from: d, reason: collision with root package name */
    public static final ot5.i f293500d = new io3.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f293501a = new io3.b(this, "NormsgSensorEngineWorker");

    /* renamed from: b, reason: collision with root package name */
    public final io3.e f293502b = new io3.e(this);

    /* renamed from: c, reason: collision with root package name */
    public final io3.h f293503c = new io3.h();

    public void a(android.os.Message message) {
        int i17 = message.what;
        io3.e eVar = this.f293502b;
        io3.h hVar = this.f293503c;
        switch (i17) {
            case 1:
                jo3.b bVar = (jo3.b) message.obj;
                int i18 = message.arg1;
                this.f293501a.removeMessages(6);
                java.lang.String str = bVar.f300894c;
                hVar.getClass();
                com.tencent.mm.normsg.k.k(str, i18, bVar.f300892a);
                if (hVar.f293517a) {
                    com.tencent.mm.normsg.k.h();
                }
                java.util.Iterator it = ((java.util.ArrayList) hVar.f293518b).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.normsg.k.b(((java.lang.Integer) it.next()).intValue());
                }
                java.util.Iterator it6 = ((java.util.ArrayList) hVar.f293519c).iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.normsg.k.a(((java.lang.Integer) it6.next()).intValue());
                }
                if (eVar.f293504d.get()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSensorEngine", "SensorListener is already started");
                    return;
                }
                java.util.HashMap hashMap = (java.util.HashMap) eVar.f293506f;
                hashMap.clear();
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("NSL");
                eVar.f293508h = handlerThread;
                handlerThread.start();
                eVar.f293509i = new android.os.Handler(eVar.f293508h.getLooper());
                int[] iArr = jo3.b.f300891d;
                int i19 = 0;
                while (true) {
                    io3.d dVar = eVar.f293505e;
                    if (i19 >= 5) {
                        boolean isEmpty = hashMap.isEmpty();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = eVar.f293504d;
                        if (!isEmpty) {
                            atomicBoolean.set(true);
                            return;
                        }
                        ((io3.c) dVar).b(3, 0);
                        atomicBoolean.set(false);
                        android.os.HandlerThread handlerThread2 = eVar.f293508h;
                        if (handlerThread2 != null) {
                            handlerThread2.quit();
                            return;
                        }
                        return;
                    }
                    int i27 = iArr[i19];
                    if (jo3.a.a(i27) == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NormsgSensorListener", "Unknown sensor type " + i27);
                    } else {
                        android.hardware.SensorManager sensorManager = eVar.f293507g;
                        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(i27);
                        int a17 = jo3.a.a(i27);
                        if (defaultSensor == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSensorListener", "Device has no sensor " + a17);
                            ((io3.c) dVar).b(1, a17);
                        } else {
                            hashMap.put(java.lang.Integer.valueOf(a17), new io3.f(defaultSensor));
                            if (!sensorManager.registerListener(eVar, defaultSensor, 0, eVar.f293509i)) {
                                ((io3.c) dVar).b(2, a17);
                            }
                        }
                    }
                    i19++;
                }
            case 2:
                int i28 = message.arg1;
                java.util.List list = (java.util.List) message.obj;
                if (list == null || list.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NormsgSensorEngine", "Sensor buffer is empty");
                    return;
                }
                hVar.getClass();
                if (list.isEmpty()) {
                    return;
                }
                com.tencent.mm.normsg.k.f(i28, list);
                return;
            case 3:
                java.lang.String str2 = (java.lang.String) message.obj;
                hVar.getClass();
                if (com.tencent.mm.normsg.k.j(str2)) {
                    d(str2);
                    return;
                }
                int d17 = com.tencent.mm.normsg.k.d(str2);
                if (d17 < 0) {
                    return;
                }
                com.tencent.mm.normsg.k.i(str2);
                c(4, 0, str2, d17 > 0 ? (d17 * 20) + 2000 : 0);
                return;
            case 4:
                d((java.lang.String) message.obj);
                return;
            case 5:
                java.lang.String str3 = (java.lang.String) message.obj;
                hVar.getClass();
                com.tencent.mm.normsg.k.l(str3);
                if (com.tencent.mm.normsg.k.e()) {
                    return;
                }
                c(6, 0, null, 0L);
                return;
            case 6:
                if (eVar.f293504d.get()) {
                    java.util.HashMap hashMap2 = (java.util.HashMap) eVar.f293506f;
                    java.util.Iterator it7 = hashMap2.values().iterator();
                    while (it7.hasNext()) {
                        eVar.f293507g.unregisterListener(eVar, ((io3.f) it7.next()).f293510a);
                    }
                    eVar.f293504d.set(false);
                    hashMap2.clear();
                    android.os.HandlerThread handlerThread3 = eVar.f293508h;
                    if (handlerThread3 != null) {
                        handlerThread3.quit();
                    }
                }
                hVar.f293517a = false;
                ((java.util.ArrayList) hVar.f293518b).clear();
                ((java.util.ArrayList) hVar.f293519c).clear();
                com.tencent.mm.normsg.k.g();
                return;
            default:
                return;
        }
    }

    public void b(int i17, int i18) {
        io3.h hVar = this.f293503c;
        if (i17 == 1) {
            ((java.util.ArrayList) hVar.f293519c).add(java.lang.Integer.valueOf(i18));
            com.tencent.mm.normsg.k.a(i18);
            return;
        }
        if (i17 == 2) {
            ((java.util.ArrayList) hVar.f293518b).add(java.lang.Integer.valueOf(i18));
            com.tencent.mm.normsg.k.b(i18);
            return;
        }
        if (i17 == 3) {
            hVar.f293517a = true;
            com.tencent.mm.normsg.k.h();
        }
    }

    public final void c(int i17, int i18, java.lang.Object obj, long j17) {
        try {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = i17;
            obtain.arg1 = i18;
            obtain.obj = obj;
            this.f293501a.sendMessageDelayed(obtain, j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NormsgSensorEngine", "Send msg error: %s" + th6.getMessage());
        }
    }

    public final void d(java.lang.String str) {
        io3.h hVar = this.f293503c;
        hVar.getClass();
        byte[] c17 = com.tencent.mm.normsg.k.c(str);
        if (c17 != null) {
            w04.l.INSTANCE.me(str, c17);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.NormsgSensorEngine", "Can't get encrypted sensor data: " + str);
        }
        hVar.getClass();
        com.tencent.mm.normsg.k.l(str);
        if (com.tencent.mm.normsg.k.e()) {
            return;
        }
        c(6, 0, null, 0L);
    }
}
