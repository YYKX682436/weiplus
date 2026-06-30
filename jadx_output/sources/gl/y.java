package gl;

/* loaded from: classes14.dex */
public final class y extends gl.a {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f272784i = kz5.c0.i(26, 7);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f272785j = kz5.c0.i(3, 22, 11, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f272786k = kz5.b0.c(2);

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.List f272787l = kz5.b0.c(1);

    /* renamed from: c, reason: collision with root package name */
    public gl.q f272788c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.AudioDeviceInfo f272789d;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f272792g;

    /* renamed from: e, reason: collision with root package name */
    public int f272790e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f272791f = java.lang.Boolean.FALSE;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f272793h = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    public y() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        gl.t tVar = new gl.t(this);
        gl.w wVar = new gl.w(this);
        audioManager.registerAudioDeviceCallback(tVar, null);
        audioManager.addOnCommunicationDeviceChangedListener(new gl.s(this), wVar);
        l(new android.media.AudioDeviceInfo[0]);
    }

    @Override // gl.r
    public boolean a() {
        java.lang.Object obj;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        kotlin.jvm.internal.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4) {
                break;
            }
        }
        return obj != null;
    }

    @Override // gl.r
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        kotlin.jvm.internal.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((android.media.AudioDeviceInfo) obj).getType() == 2) {
                break;
            }
        }
        android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
        if (audioDeviceInfo != null) {
            if (n(audioDeviceInfo)) {
                this.f272790e = audioDeviceInfo.getType();
                m(f272786k);
                return new cv.v0(1, null, 1, 2, null);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LEAudioProfile", "error happened in route to device speaker");
        }
        return null;
    }

    @Override // gl.r
    public java.lang.Object d(kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        gl.b bVar = new gl.b();
        bVar.a();
        if (bVar.f272734b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LEAudioProfile", "routeToEarpiece -> Fallback System Default Audio Route");
            audioManager.clearCommunicationDevice();
        } else {
            java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
            kotlin.jvm.internal.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
            java.util.Iterator<T> it = availableCommunicationDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                boolean z17 = true;
                if (((android.media.AudioDeviceInfo) obj).getType() != 1) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LEAudioProfile", "not has earpieceDevice but force route to earpiece");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LEAudioProfile", "routeToEarpiece -> Route to Earpiece");
            if (!n(audioDeviceInfo)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LEAudioProfile", "error happened in route to device earpiece");
                return null;
            }
            this.f272790e = audioDeviceInfo.getType();
            m(f272787l);
        }
        return new cv.v0(2, null, 1, 2, null);
    }

    @Override // gl.r
    public java.lang.Object f(kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj;
        java.lang.CharSequence string;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        kotlin.jvm.internal.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 7) {
                break;
            }
        }
        android.media.AudioDeviceInfo audioDeviceInfo2 = (android.media.AudioDeviceInfo) obj;
        if (audioDeviceInfo2 != null) {
            if (n(audioDeviceInfo2)) {
                this.f272790e = audioDeviceInfo2.getType();
                if (!kotlin.jvm.internal.o.b(audioDeviceInfo2.getProductName(), wo.w0.m())) {
                    java.lang.CharSequence productName = audioDeviceInfo2.getProductName();
                    if (!(productName == null || r26.n0.N(productName))) {
                        string = audioDeviceInfo2.getProductName();
                        m(f272784i);
                        string.toString();
                        cv.v0 v0Var = new cv.v0(4, string.toString(), 1);
                        java.lang.String address = audioDeviceInfo2.getAddress();
                        kotlin.jvm.internal.o.f(address, "getAddress(...)");
                        v0Var.f222519d = address;
                        return v0Var;
                    }
                }
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m);
                m(f272784i);
                string.toString();
                cv.v0 v0Var2 = new cv.v0(4, string.toString(), 1);
                java.lang.String address2 = audioDeviceInfo2.getAddress();
                kotlin.jvm.internal.o.f(address2, "getAddress(...)");
                v0Var2.f222519d = address2;
                return v0Var2;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LEAudioProfile", "error happened in route to device ble audio ");
        }
        return null;
    }

    @Override // gl.r
    public java.lang.Object h(kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        kotlin.jvm.internal.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4) {
                break;
            }
        }
        android.media.AudioDeviceInfo audioDeviceInfo2 = (android.media.AudioDeviceInfo) obj;
        if (audioDeviceInfo2 != null) {
            if (n(audioDeviceInfo2)) {
                this.f272790e = audioDeviceInfo2.getType();
                m(f272785j);
                return new cv.v0(3, audioDeviceInfo2.getProductName().toString(), 1);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LEAudioProfile", "error happened in route to device headset");
        }
        return null;
    }

    @Override // gl.r
    public boolean i() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        if (mm1.g.a((android.media.AudioManager) systemService)) {
            return true;
        }
        android.media.AudioDeviceInfo audioDeviceInfo = mm1.d.f328647a;
        android.media.AudioDeviceInfo audioDeviceInfo2 = mm1.d.f328647a;
        return audioDeviceInfo2 != null && audioDeviceInfo2.getType() == 26;
    }

    @Override // gl.r
    public void j(gl.q listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f272788c = listener;
    }

    @Override // gl.r
    public boolean k() {
        java.lang.Object obj;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        kotlin.jvm.internal.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) {
                break;
            }
        }
        return obj != null;
    }

    public final void l(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = audioDeviceInfoArr.length;
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= length) {
                break;
            }
            android.media.AudioDeviceInfo audioDeviceInfo = audioDeviceInfoArr[i17];
            if (audioDeviceInfo.getType() != 26 && audioDeviceInfo.getType() != 7) {
                z17 = false;
            }
            if (z17) {
                arrayList.add(audioDeviceInfo);
            }
            i17++;
        }
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        kotlin.jvm.internal.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : availableCommunicationDevices) {
            android.media.AudioDeviceInfo audioDeviceInfo2 = (android.media.AudioDeviceInfo) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.LEAudioProfile", "checkAllBluetoothDevice " + ((java.lang.Object) audioDeviceInfo2.getProductName()) + " -" + audioDeviceInfo2.getType());
            if (audioDeviceInfo2.getType() == 26 || audioDeviceInfo2.getType() == 7) {
                arrayList2.add(obj);
            }
        }
        java.lang.Object[] elements = arrayList2.toArray(new android.media.AudioDeviceInfo[0]);
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size() + elements.length);
        arrayList3.addAll(arrayList);
        kz5.h0.w(arrayList3, elements);
    }

    public final boolean m(java.util.List list) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioDeviceInfo communicationDevice = ((android.media.AudioManager) systemService).getCommunicationDevice();
        if (communicationDevice == null || !list.contains(java.lang.Integer.valueOf(communicationDevice.getType()))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LEAudioProfile", "route to device:" + list + " slowly ");
            return false;
        }
        this.f272790e = -1;
        kotlinx.coroutines.r2 r2Var = this.f272792g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("route to device:");
        android.media.AudioDeviceInfo audioDeviceInfo = this.f272789d;
        sb6.append(audioDeviceInfo != null ? java.lang.Integer.valueOf(audioDeviceInfo.getType()) : null);
        sb6.append(" soon ");
        com.tencent.mars.xlog.Log.e("MicroMsg.LEAudioProfile", sb6.toString());
        this.f272789d = communicationDevice;
        return true;
    }

    public final boolean n(android.media.AudioDeviceInfo audioDeviceInfo) {
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            boolean communicationDevice = ((android.media.AudioManager) systemService).setCommunicationDevice(audioDeviceInfo);
            com.tencent.mars.xlog.Log.i("MicroMsg.LEAudioProfile", "setCommunicationDevice Result: " + communicationDevice);
            return communicationDevice;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LEAudioProfile", "something error happened in device failed " + e17.getMessage());
            return false;
        }
    }

    @Override // gl.r
    public void release() {
        kotlinx.coroutines.r2 r2Var = this.f272792g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ((ku5.t0) ku5.t0.f312615d).g(gl.x.f272783d);
    }
}
