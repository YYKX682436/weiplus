package xm1;

/* loaded from: classes14.dex */
public abstract class h implements cv.y0 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f455171c;

    /* renamed from: d, reason: collision with root package name */
    public int f455172d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f455173e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f455174f;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f455177i;

    /* renamed from: a, reason: collision with root package name */
    public int f455169a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f455170b = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f455175g = jz5.h.b(xm1.a.f455156d);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Stack f455176h = new java.util.Stack();

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f455178j = jz5.h.b(xm1.b.f455157d);

    public static /* synthetic */ void y(xm1.h hVar, int i17, yz5.a aVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMode");
        }
        if ((i18 & 2) != 0) {
            aVar = null;
        }
        hVar.x(i17, aVar);
    }

    public abstract boolean A(boolean z17);

    public final int B(int i17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BaseAudioManager", "start current audio playing device %s", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            this.f455173e = true;
            c().setSpeakerphoneOn(true);
        } else if (i17 == 2) {
            this.f455173e = false;
            c().setSpeakerphoneOn(false);
        } else if (i17 == 3) {
            if (this.f455176h.contains(4)) {
                b(4);
            }
            an1.d.f8839b = true;
            this.f455173e = false;
            c().setSpeakerphoneOn(false);
        } else if (i17 == 4) {
            if (this.f455171c) {
                return 1;
            }
            ((ku5.t0) ku5.t0.f312615d).A("delayConnectBluetooth");
            int d17 = an1.c.d(c());
            this.f455171c = d17 == 1;
            this.f455173e = false;
            c().setSpeakerphoneOn(false);
            an1.c.f8834b = d17 == 1;
            return d17;
        }
        return -1;
    }

    @Override // cv.y0
    public void a(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BaseAudioManager", "request speaker on value %s", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            java.util.Stack mDeviceQueue = this.f455176h;
            kotlin.jvm.internal.o.g(mDeviceQueue, "mDeviceQueue");
            com.tencent.mars.xlog.Log.i("MicroMsg.SpeakerUtil", "release the speaker resource");
            mDeviceQueue.removeElement(1);
            p(false, 1);
            return;
        }
        synchronized (this.f455176h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAudioManager", "isSpeakerphoneOn is " + n() + " and ret is " + an1.e.a(this.f455176h));
            p(true, 1);
        }
    }

    public final void b(int i17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BaseAudioManager", "close prev audio playing device %s", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            this.f455173e = false;
            c().setSpeakerphoneOn(false);
            return;
        }
        if (i17 == 3) {
            an1.d.f8839b = false;
            return;
        }
        if (i17 != 4) {
            return;
        }
        this.f455171c = false;
        an1.c.f8834b = false;
        android.media.AudioManager audioManager = c();
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        ym1.e eVar = ym1.f.f463134h;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BluetoothUtil", "dkbt begin stopBluetooth %s", eVar.f());
        audioManager.setBluetoothScoOn(false);
        an1.c.f8834b = false;
        if (!com.tencent.mm.sdk.platformtools.l5.Bi()) {
            wo.o oVar = wo.v1.f447833m;
            com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "stop SrvDeviceInfo mCommonInfo getStartBluetoothSco:%s,getStopBluetoothInBU:%s ", java.lang.Integer.valueOf(oVar.f447745c), java.lang.Integer.valueOf(oVar.f447744b));
            if (oVar.f447744b == 1 || oVar.f447745c == -1) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "BluetoothUtil stopBluetoothSco stack: %s", new com.tencent.mm.sdk.platformtools.z3());
                yj0.a.c(audioManager, "com/tencent/mm/plugin/audio/util/BluetoothUtil", "doStopBluetooth", "(Landroid/media/AudioManager;)Z", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
                audioManager.stopBluetoothSco();
                yj0.a.f(audioManager, "com/tencent/mm/plugin/audio/util/BluetoothUtil", "doStopBluetooth", "(Landroid/media/AudioManager;)Z", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "dkbt end stopBluetooth %s", eVar.f());
        ((ku5.t0) ku5.t0.f312615d).A("delayConnectBluetooth");
    }

    public final android.media.AudioManager c() {
        return (android.media.AudioManager) ((jz5.n) this.f455175g).getValue();
    }

    public final int d() {
        int intValue;
        synchronized (this.f455176h) {
            if (this.f455176h.empty()) {
                intValue = -1;
            } else {
                java.lang.Object lastElement = this.f455176h.lastElement();
                kotlin.jvm.internal.o.f(lastElement, "lastElement(...)");
                intValue = ((java.lang.Number) lastElement).intValue();
            }
        }
        return intValue;
    }

    public final boolean e() {
        return ((java.lang.Boolean) ((jz5.n) this.f455178j).getValue()).booleanValue();
    }

    public final int f() {
        android.media.AudioManager c17 = c();
        jz5.g gVar = mm1.g.f328661a;
        kotlin.jvm.internal.o.g(c17, "<this>");
        if (!((java.lang.Boolean) ((jz5.n) mm1.g.f328662b).getValue()).booleanValue()) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return c17.getMode();
            }
            android.media.AudioDeviceInfo audioDeviceInfo = mm1.d.f328647a;
            return mm1.d.f328648b;
        }
        pm1.s sVar = pm1.e.f356814e.a().f356818c;
        java.lang.Integer num = sVar.f356839a;
        if (num == null) {
            int mode = sVar.f356840b.getMode();
            sVar.f356839a = java.lang.Integer.valueOf(mode);
            return mode;
        }
        num.intValue();
        ((ku5.t0) ku5.t0.f312615d).h(new pm1.q(sVar), "AudioMiscCache");
        return num.intValue();
    }

    public int g(int i17) {
        if (!e()) {
            return c().getStreamMaxVolume(i17);
        }
        pm1.e a17 = pm1.e.f356814e.a();
        if (a17.f356819d) {
            pm1.w wVar = a17.f356817b;
            return wVar.a(i17, wVar.f356849d);
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((android.media.AudioManager) systemService).getStreamMaxVolume(i17);
    }

    public int h(int i17) {
        if (!e()) {
            return c().getStreamVolume(i17);
        }
        pm1.e a17 = pm1.e.f356814e.a();
        if (a17.f356819d) {
            pm1.w wVar = a17.f356817b;
            return wVar.a(i17, wVar.f356850e);
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((android.media.AudioManager) systemService).getStreamVolume(i17);
    }

    public void i() {
        an1.c.f8837e = true;
        ym1.e eVar = ym1.f.f463134h;
        an1.c.f8834b = eVar.i();
        an1.d.f8839b = eVar.j();
    }

    public boolean j() {
        boolean isBluetoothA2dpOn;
        boolean k17 = k();
        if (e()) {
            pm1.o oVar = pm1.e.f356814e.a().f356816a;
            java.lang.Boolean bool = oVar.f356832d;
            if (bool != null) {
                bool.booleanValue();
                ((ku5.t0) ku5.t0.f312615d).h(new pm1.g(oVar), oVar.f356829a);
                isBluetoothA2dpOn = bool.booleanValue();
            } else {
                android.media.AudioManager audioManager = oVar.f356835g;
                kotlin.jvm.internal.o.g(audioManager, "audioManager");
                boolean isBluetoothA2dpOn2 = audioManager.isBluetoothA2dpOn();
                oVar.f356832d = java.lang.Boolean.valueOf(isBluetoothA2dpOn2);
                isBluetoothA2dpOn = isBluetoothA2dpOn2;
            }
        } else {
            android.media.AudioManager audioManager2 = c();
            kotlin.jvm.internal.o.g(audioManager2, "audioManager");
            isBluetoothA2dpOn = audioManager2.isBluetoothA2dpOn();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new xm1.c(k17, isBluetoothA2dpOn));
        return k17 || isBluetoothA2dpOn;
    }

    public boolean k() {
        return mm1.g.a(c());
    }

    public boolean l() {
        boolean e17 = e();
        an1.d dVar = an1.d.f8838a;
        if (!e17) {
            return dVar.a(c());
        }
        pm1.o oVar = pm1.e.f356814e.a().f356816a;
        java.lang.Boolean bool = oVar.f356834f;
        if (bool == null) {
            boolean a17 = dVar.a(oVar.f356835g);
            oVar.f356834f = java.lang.Boolean.valueOf(a17);
            return a17;
        }
        bool.booleanValue();
        ((ku5.t0) ku5.t0.f312615d).h(new pm1.i(oVar), oVar.f356829a);
        return bool.booleanValue();
    }

    public final boolean m(int i17) {
        if (i17 == 3) {
            return an1.d.f8839b;
        }
        if (i17 != 4) {
            return true;
        }
        return an1.c.f8834b;
    }

    public boolean n() {
        return mm1.g.b(c());
    }

    public void o(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAudioDeviceStateChanged mstatus is ");
        sb6.append(i17);
        sb6.append(" and  mCurrentAudioDeviceState = status ");
        sb6.append(-1 == i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAudioManager", sb6.toString());
        if (-1 == i17) {
            return;
        }
        if (!this.f455170b.isEmpty() || (i17 == 9 && i17 == 8)) {
            switch (i17) {
                case 0:
                case 5:
                    ((ku5.t0) ku5.t0.f312615d).l(new xm1.d(this), 1000L, "delayConnectBluetooth");
                    return;
                case 1:
                case 6:
                case 7:
                    s(false);
                    return;
                case 2:
                    w(true);
                    s(true);
                    return;
                case 3:
                    ((ku5.t0) ku5.t0.f312615d).A("delayConnectBluetooth");
                    s(false);
                    return;
                case 4:
                default:
                    return;
                case 8:
                    u(true);
                    return;
                case 9:
                    u(false);
                    return;
            }
        }
    }

    public final int p(boolean z17, int i17) {
        boolean z18;
        int i18;
        int i19;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BaseAudioManager", "current refresh audio playing isPlugged %s, and device is  %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        synchronized (this.f455176h) {
            if (this.f455176h.isEmpty() || this.f455176h.size() <= 1) {
                z18 = false;
                i18 = 0;
                i19 = 0;
            } else {
                java.util.Stack stack = this.f455176h;
                java.lang.Object obj = stack.get(stack.size() - 1);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                int intValue = ((java.lang.Number) obj).intValue();
                java.lang.Object lastElement = this.f455176h.lastElement();
                kotlin.jvm.internal.o.f(lastElement, "lastElement(...)");
                i19 = ((java.lang.Number) lastElement).intValue();
                i18 = intValue;
                z18 = true;
            }
        }
        if (z18) {
            if (z17) {
                if (i18 != i17) {
                    b(i18);
                }
                return B(i17);
            }
            b(i17);
            if (i17 != i19) {
                return B(i19);
            }
        } else {
            if (z17) {
                return B(i17);
            }
            b(i17);
            if (i17 == 1 && ((!an1.c.f8833a.b() || !an1.c.f8834b) && !l())) {
                t(true);
            }
        }
        return -1;
    }

    public final void q(java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BaseAudioManager", "releaseAudioPlayingOrRecordingResource type ".concat(type), new java.lang.Object[0]);
        an1.c.f8837e = false;
        s(false);
        this.f455176h.clear();
        this.f455170b.remove(type);
    }

    public final int r(java.lang.String type, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f455174f = this.f455173e;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BaseAudioManager", "requestAudioPlayingOrRecordingResource type " + type + " adn target device " + num, new java.lang.Object[0]);
        i();
        java.util.ArrayList arrayList = this.f455170b;
        if (arrayList.contains(type)) {
            arrayList.remove(type);
        }
        arrayList.add(type);
        if (num != null && num.intValue() == 4) {
            return s(true);
        }
        if (num != null && num.intValue() == 3) {
            u(true);
        } else if (num != null && num.intValue() == 2) {
            t(true);
        } else if (num != null && num.intValue() == 1) {
            a(true);
        }
        return -1;
    }

    public final int s(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BaseAudioManager", "request bluetooth on value %s", java.lang.Boolean.valueOf(z17));
        int i17 = -1;
        if (z17) {
            synchronized (this.f455176h) {
                if (an1.c.c(this.f455176h)) {
                    int p17 = p(true, 4);
                    w(p17 != -1);
                    i17 = p17;
                } else {
                    w(false);
                }
            }
        } else {
            w(false);
            java.util.Stack mDeviceQueue = this.f455176h;
            kotlin.jvm.internal.o.g(mDeviceQueue, "mDeviceQueue");
            com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", " release the bluetooth resource");
            mDeviceQueue.removeElement(4);
            p(false, 4);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAudioManager", "request bluetooth failed %s", java.lang.Integer.valueOf(i17));
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.intValue() == 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r7 == 0) goto L49
            java.util.Stack r7 = r6.f455176h
            monitor-enter(r7)
            java.util.Stack r3 = r6.f455176h     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "mDeviceQueue"
            kotlin.jvm.internal.o.g(r3, r4)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "MicroMsg.EarPieceUtil"
            java.lang.String r5 = " request the earpiece resource"
            com.tencent.mars.xlog.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L46
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L46
            r5 = 1
            if (r4 != 0) goto L2f
            java.lang.Object r4 = r3.lastElement()     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L46
            if (r4 != 0) goto L29
            goto L2f
        L29:
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L46
            if (r4 == r1) goto L3c
        L2f:
            boolean r0 = r3.contains(r2)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L38
            r3.removeElement(r2)     // Catch: java.lang.Throwable -> L46
        L38:
            r3.push(r2)     // Catch: java.lang.Throwable -> L46
            r0 = r5
        L3c:
            if (r0 == 0) goto L44
            r6.b(r5)     // Catch: java.lang.Throwable -> L46
            r6.p(r5, r1)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r7)
            goto L5d
        L46:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L49:
            java.util.Stack r7 = r6.f455176h
            java.lang.String r3 = "mDeviceQueue"
            kotlin.jvm.internal.o.g(r7, r3)
            java.lang.String r3 = "MicroMsg.EarPieceUtil"
            java.lang.String r4 = " release the earpiece resource"
            com.tencent.mars.xlog.Log.i(r3, r4)
            r7.removeElement(r2)
            r6.p(r0, r1)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xm1.h.t(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.intValue() == 3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r7 == 0) goto L46
            java.util.Stack r7 = r6.f455176h
            monitor-enter(r7)
            java.util.Stack r3 = r6.f455176h     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "mDeviceQueue"
            kotlin.jvm.internal.o.g(r3, r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "MicroMsg.HeadSetPlugUtil"
            java.lang.String r5 = " request the headset resource"
            com.tencent.mars.xlog.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L43
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L43
            r5 = 1
            if (r4 != 0) goto L2f
            java.lang.Object r4 = r3.lastElement()     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L29
            goto L2f
        L29:
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L43
            if (r4 == r1) goto L3c
        L2f:
            boolean r0 = r3.contains(r2)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L38
            r3.removeElement(r2)     // Catch: java.lang.Throwable -> L43
        L38:
            r3.push(r2)     // Catch: java.lang.Throwable -> L43
            r0 = r5
        L3c:
            if (r0 == 0) goto L41
            r6.p(r5, r1)     // Catch: java.lang.Throwable -> L43
        L41:
            monitor-exit(r7)
            goto L5a
        L43:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L46:
            java.util.Stack r7 = r6.f455176h
            java.lang.String r3 = "mDeviceQueue"
            kotlin.jvm.internal.o.g(r7, r3)
            java.lang.String r3 = "MicroMsg.HeadSetPlugUtil"
            java.lang.String r4 = " release the headset resource"
            com.tencent.mars.xlog.Log.i(r3, r4)
            r7.removeElement(r2)
            r6.p(r0, r1)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xm1.h.u(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (gq4.v.Bi().f176562e != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v() {
        /*
            r3 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.x2.n()
            java.lang.String r1 = "MicroMsg.BaseAudioManager"
            if (r0 == 0) goto L31
            java.lang.Class<jp5.o> r0 = jp5.o.class
            i95.m r0 = i95.n0.c(r0)
            jp5.o r0 = (jp5.o) r0
            boolean r0 = r0.ie()
            if (r0 != 0) goto L2b
            java.lang.Class<lg0.m> r0 = lg0.m.class
            i95.m r0 = i95.n0.c(r0)
            lg0.m r0 = (lg0.m) r0
            kg0.p r0 = (kg0.p) r0
            r0.getClass()
            com.tencent.mm.plugin.voip.model.h2 r0 = gq4.v.Bi()
            boolean r0 = r0.f176562e
            if (r0 == 0) goto L31
        L2b:
            java.lang.String r0 = "current talking in voip "
            com.tencent.mars.xlog.Log.e(r1, r0)
            return
        L31:
            java.lang.String r0 = "reset speaker to normal"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            y(r3, r0, r2, r1, r2)
            r0 = 30
            boolean r0 = fp.h.b(r0)
            if (r0 == 0) goto L4d
            android.media.AudioManager r0 = r3.c()     // Catch: java.lang.Exception -> L4d
            boolean r1 = r3.f455174f     // Catch: java.lang.Exception -> L4d
            r0.setSpeakerphoneOn(r1)     // Catch: java.lang.Exception -> L4d
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xm1.h.v():void");
    }

    public final void w(boolean z17) {
        yz5.l lVar = this.f455177i;
        if (lVar != null) {
        }
    }

    public final void x(int i17, yz5.a aVar) {
        if (fp.h.b(30)) {
            ((ku5.t0) ku5.t0.f312615d).h(new xm1.f(this, i17, aVar), "reset speaker");
        } else {
            int i18 = this.f455169a;
            if (i18 == -1 || i18 != i17) {
                ((ku5.t0) ku5.t0.f312615d).h(new xm1.g(this, i17, aVar), "reset speaker");
            }
        }
        this.f455169a = i17;
    }

    public void z(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAudioManager", "setStreamVolume streamType:%s,index:%s,flags:%s ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        to.a.c(c(), i17, i18, i19);
    }
}
