package rc3;

/* loaded from: classes7.dex */
public final class f1 implements qc3.c, jc3.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.magicbrush.MBBuildConfig f393986d;

    /* renamed from: e, reason: collision with root package name */
    public final jc3.a0 f393987e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f393988f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f393989g;

    /* renamed from: h, reason: collision with root package name */
    public sc3.q1 f393990h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f393991i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f393992m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f393993n;

    public f1(com.tencent.mm.plugin.magicbrush.MBBuildConfig config, jc3.a0 delegate, yz5.l instanceToBiz) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(instanceToBiz, "instanceToBiz");
        this.f393986d = config;
        this.f393987e = delegate;
        this.f393988f = instanceToBiz;
        this.f393989g = jz5.h.b(new rc3.a1(this));
        this.f393991i = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f393992m = new java.util.HashMap();
        this.f393993n = new java.util.HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // qc3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void B8(int r12, int r13, int r14, int r15, int r16, int r17) {
        /*
            r11 = this;
            r9 = r11
            monitor-enter(r11)
            java.util.HashMap r0 = r9.f393993n     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L2f
            yz5.l r1 = r9.f393988f     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L51
            sc3.k1 r0 = (sc3.k1) r0     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L2c
            qc3.c r1 = r0.H0()     // Catch: java.lang.Throwable -> L51
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r1.B8(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L51
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L51
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 != 0) goto L4f
        L2f:
            java.util.HashMap r0 = r9.f393992m     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L51
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L4f
            rc3.e1 r10 = new rc3.e1     // Catch: java.lang.Throwable -> L51
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L51
            r0.add(r10)     // Catch: java.lang.Throwable -> L51
        L4f:
            monitor-exit(r11)
            return
        L51:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc3.f1.B8(int, int, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // qc3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void Bi(int r10, float[] r11, float[] r12, float[] r13, float[] r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "left"
            kotlin.jvm.internal.o.g(r11, r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "top"
            kotlin.jvm.internal.o.g(r12, r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "width"
            kotlin.jvm.internal.o.g(r13, r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "height"
            kotlin.jvm.internal.o.g(r14, r0)     // Catch: java.lang.Throwable -> L60
            java.util.HashMap r0 = r9.f393993n     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L41
            yz5.l r1 = r9.f393988f     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L60
            sc3.k1 r0 = (sc3.k1) r0     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L3e
            qc3.c r1 = r0.H0()     // Catch: java.lang.Throwable -> L60
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.Bi(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L60
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L60
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 != 0) goto L5e
        L41:
            java.util.HashMap r0 = r9.f393992m     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L60
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L5e
            rc3.d1 r8 = new rc3.d1     // Catch: java.lang.Throwable -> L60
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L60
            r0.add(r8)     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r9)
            return
        L60:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rc3.f1.Bi(int, float[], float[], float[], float[]):void");
    }

    @Override // qc3.c
    public synchronized void C3(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f393987e.getClass();
        this.f393992m.put(java.lang.Integer.valueOf(i17), kz5.c0.k(new rc3.b1(this, i17, i18, i19, i27, i28, i29)));
    }

    @Override // qc3.c
    public void Da(boolean z17) {
    }

    @Override // qc3.c
    public void F2(int i17, java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // qc3.c
    public synchronized void K3(int i17) {
        sc3.k1 k1Var;
        this.f393987e.getClass();
        java.lang.String str = (java.lang.String) this.f393993n.remove(java.lang.Integer.valueOf(i17));
        if (str != null && (k1Var = (sc3.k1) this.f393988f.invoke(str)) != null) {
            k1Var.H0().K3(i17);
        }
        this.f393992m.remove(java.lang.Integer.valueOf(i17));
    }

    @Override // qc3.c
    public void Ke(java.lang.String logStr) {
        kotlin.jvm.internal.o.g(logStr, "logStr");
    }

    @Override // qc3.c
    public void Oe() {
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // qc3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c(int r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            jc3.a0 r0 = r2.f393987e     // Catch: java.lang.Throwable -> L43
            r0.w(r3)     // Catch: java.lang.Throwable -> L43
            java.util.HashMap r0 = r2.f393993n     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L2b
            yz5.l r1 = r2.f393988f     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L43
            sc3.k1 r0 = (sc3.k1) r0     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L28
            qc3.c r0 = r0.H0()     // Catch: java.lang.Throwable -> L43
            r0.c(r3, r4)     // Catch: java.lang.Throwable -> L43
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L43
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 != 0) goto L41
        L2b:
            java.util.HashMap r0 = r2.f393992m     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L43
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L41
            rc3.c1 r1 = new rc3.c1     // Catch: java.lang.Throwable -> L43
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L43
            r0.add(r1)     // Catch: java.lang.Throwable -> L43
        L41:
            monitor-exit(r2)
            return
        L43:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rc3.f1.c(int, boolean):void");
    }

    public java.lang.String d(java.lang.String instanceName) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        sc3.k1 k1Var = (sc3.k1) this.f393988f.invoke(instanceName);
        if (k1Var == null) {
            return null;
        }
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = k1Var.f406482n;
        if (mBBuildConfig != null) {
            return mBBuildConfig.f147820g;
        }
        kotlin.jvm.internal.o.o("config");
        throw null;
    }

    @Override // qc3.c
    public void h(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f393987e.h(envId, msg);
    }

    @Override // qc3.c
    public java.lang.String ih(java.lang.String event, java.lang.String data, java.lang.String privateData) {
        java.lang.String a17;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(privateData, "privateData");
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f393986d;
        lc3.c0 c0Var = (lc3.c0) mBBuildConfig.f147827q.get(event);
        if (c0Var == null) {
            return "{\"errMsg\":\"Not handled\", \"errCode\": -1}";
        }
        lc3.d0 d0Var = (lc3.d0) c0Var;
        d0Var.f317890a = mBBuildConfig.b();
        d0Var.o((oc3.c) ((jz5.n) this.f393989g).getValue());
        lc3.a0 a0Var = new lc3.a0(data);
        if (d0Var.n()) {
            hh.h hVar = new hh.h(new rc3.z0(d0Var, a0Var));
            this.f393991i.post(hVar);
            a17 = ((lc3.a0) hVar.b()).a();
        } else {
            a17 = d0Var.r(a0Var).a();
        }
        d0Var.f317890a = null;
        return a17;
    }

    @Override // qc3.c
    public void j6(java.lang.String event, java.lang.String data, java.lang.String privateData, int i17) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(privateData, "privateData");
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f393986d;
        lc3.c0 c0Var = (lc3.c0) mBBuildConfig.f147827q.get(event);
        if (c0Var != null) {
            lc3.b0 r17 = ((lc3.b0) c0Var).r();
            r17.f317890a = mBBuildConfig.b();
            r17.o((oc3.c) ((jz5.n) this.f393989g).getValue());
            r17.f317886d = new rc3.x0(this, i17);
            lc3.a0 a0Var = new lc3.a0(data);
            if (r17.n()) {
                this.f393991i.post(new rc3.y0(r17, a0Var));
            } else {
                r17.t(a0Var);
            }
        }
    }

    @Override // qc3.c
    public void n() {
        this.f393987e.n();
    }

    @Override // qc3.c
    public void onCreated() {
        this.f393987e.onCreated();
    }

    @Override // qc3.c
    public void onDestroy() {
        this.f393987e.onDestroy();
    }
}
