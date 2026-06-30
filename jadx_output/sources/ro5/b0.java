package ro5;

/* loaded from: classes14.dex */
public final class b0 implements ro5.b {

    /* renamed from: a, reason: collision with root package name */
    public ro5.j f398144a;

    /* renamed from: b, reason: collision with root package name */
    public ro5.m1 f398145b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f398147d;

    /* renamed from: f, reason: collision with root package name */
    public so5.k0 f398149f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f398150g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f398151h;

    /* renamed from: i, reason: collision with root package name */
    public int f398152i;

    /* renamed from: k, reason: collision with root package name */
    public int f398154k;

    /* renamed from: n, reason: collision with root package name */
    public fp5.a f398157n;

    /* renamed from: o, reason: collision with root package name */
    public final so5.n0 f398158o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f398159p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f398160q;

    /* renamed from: r, reason: collision with root package name */
    public int f398161r;

    /* renamed from: c, reason: collision with root package name */
    public er4.r f398146c = er4.r.MP_ROOM_TYPE_VIDEO;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f398148e = new java.lang.ref.WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    public int f398153j = 8;

    /* renamed from: l, reason: collision with root package name */
    public int f398155l = 32;

    /* renamed from: m, reason: collision with root package name */
    public final so5.z f398156m = new ro5.m(this);

    public b0() {
        so5.n0 n0Var = new so5.n0();
        n0Var.a(new ro5.k(this));
        this.f398158o = n0Var;
        this.f398159p = new android.util.SparseArray();
        this.f398160q = new java.util.concurrent.ConcurrentSkipListSet();
    }

    @Override // ro5.b
    public void A(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27, int i28) {
        to5.c cVar;
        java.lang.Boolean bool;
        boolean z17;
        java.lang.Object m521constructorimpl;
        ro5.m1 m1Var = this.f398145b;
        if (m1Var == null || (cVar = m1Var.f398258t) == null) {
            return;
        }
        android.util.SparseArray sparseArray = cVar.f421004d;
        jz5.o oVar = (jz5.o) sparseArray.get(i17);
        if (oVar != null) {
            bool = java.lang.Boolean.valueOf(((java.lang.Number) oVar.f302841d).intValue() == i19 && ((java.lang.Number) oVar.f302842e).intValue() == i27 && ((java.lang.Number) oVar.f302843f).intValue() == i28);
        } else {
            bool = null;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            z17 = false;
        } else {
            sparseArray.put(i17, new jz5.o(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28)));
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPEngineOp", "onOnVideoFrameEvent() params change to: memberId = " + i17 + ", dataPtr = " + byteBuffer + ", dataLen = " + i18 + ", width = " + i19 + ", height = " + i27 + ", format = " + i28);
        }
        if (byteBuffer == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIPEngineOp", "data buffer is null");
            return;
        }
        cp5.a a17 = cVar.f421001a.a(i18, !((i28 & 18) == 18 || (i28 & 19) == 19));
        java.nio.ByteBuffer a18 = a17.a();
        if (a18 == null) {
            return;
        }
        if (a18.capacity() < i18 || i18 < 0) {
            throw new java.lang.RuntimeException("on video frame event datalen error " + i18);
        }
        synchronized (a18) {
            byteBuffer.clear();
            byteBuffer.limit(i18);
            a18.put(byteBuffer);
        }
        boolean z18 = (i28 & 128) == 128;
        boolean z19 = (i28 & 2048) == 2048;
        to5.b bVar = cVar.f421002b;
        if (bVar != null) {
            to5.a aVar = new to5.a(i17, a17, i19, i27, i28, z18, 4, z19);
            ro5.i0 i0Var = (ro5.i0) bVar;
            int i29 = aVar.f420996e;
            boolean z27 = (i29 & 18) == 18 || (i29 & 19) == 19;
            ro5.m1 m1Var2 = i0Var.f398208a;
            if (!z27) {
                kotlinx.coroutines.l.d((kotlinx.coroutines.y0) m1Var2.f398242d.f455799m.getValue(), null, null, new ro5.h0(m1Var2, aVar, null), 3, null);
                return;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.nio.ByteBuffer a19 = aVar.f420993b.a();
                if (a19 != null) {
                    a19.rewind();
                }
                ((so5.m) m1Var2.f398262x.getValue()).c(aVar);
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MVR.VoIPMPRenderLogic", m524exceptionOrNullimpl, "handle result", new java.lang.Object[0]);
            }
        }
    }

    @Override // ro5.b
    public void B() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "releaseVideoResource");
        so5.k0 k0Var = this.f398149f;
        if (k0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "stopCameraSync: ");
            k0Var.f410867q = false;
            zq4.b bVar = k0Var.f410859f;
            if (bVar != null) {
                bVar.e();
            }
        }
        this.f398149f = null;
        this.f398158o.c();
        z(false);
        ro5.m1 m1Var = this.f398145b;
        if (m1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "release released " + m1Var.f398248j);
            if (!m1Var.f398248j) {
                m1Var.f398248j = true;
                ((mo5.b) m1Var.f398261w.getValue()).f330426e = null;
                kotlinx.coroutines.z0.e(m1Var.f398244f, null, 1, null);
                boolean z17 = m1Var.f398249k;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = m1Var.f398250l;
                ep5.d dVar = m1Var.f398247i;
                kotlinx.coroutines.l.d(dVar.f255773a, null, null, new ep5.c(dVar, concurrentHashMap, z17, null), 3, null);
                android.util.SparseArray sparseArray = m1Var.f398263y;
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    sparseArray.keyAt(i17);
                    ((ro5.f0) sparseArray.valueAt(i17)).f398191a.release();
                }
                sparseArray.clear();
                m1Var.f398260v.close();
                ((so5.m) m1Var.f398262x.getValue()).close();
                xo5.n nVar = m1Var.f398242d;
                kotlinx.coroutines.l.d((kotlinx.coroutines.y0) nVar.f455799m.getValue(), null, null, new ro5.d1(m1Var, null), 3, null);
                kotlinx.coroutines.l.d((kotlinx.coroutines.y0) nVar.f455797h.getValue(), null, null, new ro5.e1(m1Var, null), 3, null);
                kotlinx.coroutines.l.d(nVar.f455795f, null, null, new ro5.f1(m1Var, null), 3, null);
                nVar.close();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ILinkVoIPRenderLogic release: close hander: ");
                int i18 = m1Var.f398241c;
                sb6.append(i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", sb6.toString());
                if (i18 == 1) {
                    m1Var.f398259u.close();
                }
            }
        }
        this.f398145b = null;
        this.f398150g = false;
        yz5.a aVar = zo5.d.f474879a;
        zo5.d.f474879a = ro5.s.f398291d;
    }

    @Override // ro5.b
    public void C(int i17) {
        to5.c cVar;
        ro5.m1 m1Var = this.f398145b;
        if (m1Var == null || (cVar = m1Var.f398258t) == null) {
            return;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.put((byte) i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPEngineOp", "setOri: " + i17 + " ret " + cVar.b(21, allocateDirect, allocateDirect.capacity()));
    }

    @Override // ro5.b
    public void D(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "bindSelfMid: " + i17);
        this.f398161r = i17;
        so5.k0 k0Var = this.f398149f;
        if (k0Var != null) {
            k0Var.a(i17);
        }
        ro5.j jVar = this.f398144a;
        if (jVar != null) {
            jVar.f398218e = this.f398161r;
        }
    }

    @Override // ro5.b
    public boolean H0() {
        so5.k0 k0Var = this.f398149f;
        boolean z17 = k0Var != null ? k0Var.f410858e : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "isCameraPause " + z17);
        return z17;
    }

    @Override // ro5.b
    public void a() {
        so5.k0 k0Var = this.f398149f;
        java.lang.Boolean bool = null;
        if (k0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "markActivityResume: needDelayOpen " + k0Var.f410867q);
            boolean z17 = false;
            if (k0Var.f410867q && !k0Var.b()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ILinkVoIPCameraHelper", "markActivityResume: delay open cam");
                boolean c17 = so5.k0.c(k0Var, true, false, 2, null);
                k0Var.f410867q = false;
                z17 = c17;
            }
            bool = java.lang.Boolean.valueOf(z17);
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            this.f398158o.b();
        }
    }

    @Override // ro5.b
    public boolean b() {
        zq4.b bVar;
        so5.k0 k0Var = this.f398149f;
        if (k0Var == null || (bVar = k0Var.f410859f) == null) {
            return false;
        }
        return bVar.f475041a;
    }

    @Override // ro5.b
    public void c(int i17, bp5.h hVar) {
        ro5.m1 m1Var;
        if (hVar == null || (m1Var = this.f398145b) == null) {
            return;
        }
        m1Var.f(i17, hVar);
    }

    @Override // ro5.b
    public void d(er4.r roomType) {
        ro5.m1 m1Var;
        kotlin.jvm.internal.o.g(roomType, "roomType");
        if (this.f398146c != roomType) {
            this.f398146c = roomType;
            if (roomType == er4.r.MP_ROOM_TYPE_VIDEO || (m1Var = this.f398145b) == null) {
                return;
            }
            m1Var.A = 0;
        }
    }

    @Override // ro5.b
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "closeCamera");
        so5.k0 k0Var = this.f398149f;
        if (k0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "stopCamera: ");
            k0Var.f410867q = false;
            kotlinx.coroutines.l.d(k0Var.f410857d, null, null, new so5.h0(k0Var, null), 3, null);
        }
    }

    @Override // ro5.b
    public boolean f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "checkVirtualBackgroundState: enable " + this.f398147d);
        return this.f398147d;
    }

    @Override // ro5.b
    public synchronized void g() {
        if (this.f398145b == null) {
            ro5.m1 m1Var = new ro5.m1(ro5.d.f398178a, this.f398156m, so5.o0.f410895a.a());
            m1Var.f398246h = new ro5.n(this);
            yz5.a aVar = zo5.d.f474879a;
            zo5.d.f474879a = new ro5.o(this);
            if (this.f398149f == null) {
                this.f398149f = new so5.k0();
            }
            so5.k0 k0Var = this.f398149f;
            if (k0Var != null) {
                k0Var.f410863m = new ro5.p(this, null);
            }
            so5.k0 k0Var2 = this.f398149f;
            if (k0Var2 != null) {
                k0Var2.f410864n = new ro5.q(this, null);
            }
            so5.k0 k0Var3 = this.f398149f;
            if (k0Var3 != null) {
                k0Var3.a(this.f398161r);
            }
            ro5.j jVar = this.f398144a;
            if (jVar != null) {
                jVar.f398218e = this.f398161r;
            }
            this.f398145b = m1Var;
        }
    }

    @Override // ro5.b
    public er4.w h(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "blackscreen: " + this.f398144a + " for mid " + j17);
        if (this.f398144a == null) {
            this.f398160q.add(java.lang.Long.valueOf(j17));
        }
        ro5.j jVar = this.f398144a;
        ro5.c a17 = jVar != null ? jVar.a((int) j17) : null;
        er4.w wVar = new er4.w();
        wVar.d(a17 != null ? a17.f398168b : 1.0d);
        wVar.e(a17 != null ? a17.f398169c : 0L);
        wVar.f(a17 != null ? a17.f398167a : 0L);
        wVar.g(a17 != null ? a17.f398170d : 0.0d);
        wVar.b(a17 != null ? a17.f398171e : 0.0d);
        wVar.c(a17 != null ? a17.f398172f : false);
        return wVar;
    }

    @Override // ro5.b
    public void i(int i17, bp5.h renderTargetHolder) {
        kotlin.jvm.internal.o.g(renderTargetHolder, "renderTargetHolder");
        ro5.m1 m1Var = this.f398145b;
        if (m1Var != null) {
            m1Var.b(i17, renderTargetHolder);
        }
    }

    @Override // ro5.b
    public boolean isCameraOn() {
        so5.k0 k0Var = this.f398149f;
        if (k0Var != null) {
            return k0Var.b();
        }
        return false;
    }

    @Override // ro5.b
    public void j(fp5.a remoteCameraStatusListener) {
        kotlin.jvm.internal.o.g(remoteCameraStatusListener, "remoteCameraStatusListener");
        this.f398157n = remoteCameraStatusListener;
    }

    @Override // ro5.b
    public void k(int i17) {
        so5.k0 k0Var = this.f398149f;
        if (k0Var == null || k0Var.f410860g == i17 || !k0Var.b()) {
            return;
        }
        if (com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.isForeground()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ILinkVoIPCameraHelper", "current camera on and exchange resolution");
            kotlinx.coroutines.l.d(k0Var.f410857d, null, null, new so5.i0(i17, k0Var, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "startCamera: not in foreground, delay open cam");
            k0Var.f410867q = true;
        }
    }

    @Override // ro5.b
    public void l() {
        this.f398153j = 0;
    }

    @Override // ro5.b
    public void m(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "setLocalEncoderRotation: " + i17);
        ro5.m1 m1Var = this.f398145b;
        if (m1Var != null) {
            m1Var.A = i17;
        }
    }

    @Override // ro5.b
    public fo5.f n() {
        int[] iArr;
        ep5.d dVar;
        ro5.j jVar = this.f398144a;
        if (jVar == null) {
            this.f398154k = 16;
        }
        int i17 = (jVar != null ? jVar.f398220g : 0) | this.f398152i | this.f398153j | this.f398154k | this.f398155l | 0;
        this.f398152i = 0;
        this.f398153j = 8;
        this.f398154k = 0;
        this.f398155l = 32;
        ro5.m1 m1Var = this.f398145b;
        if (m1Var != null) {
            iArr = new int[5];
            int i18 = 0;
            while (true) {
                dVar = m1Var.f398247i;
                if (i18 >= 5) {
                    break;
                }
                dVar.getClass();
                iArr[i18] = 0;
                i18++;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f255775c;
            java.util.Set<java.lang.String> keySet = concurrentHashMap.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            int i19 = 0;
            int i27 = -1;
            for (java.lang.String str : keySet) {
                if (concurrentHashMap.get(str) != null && dVar.f255776d != 0) {
                    java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(str);
                    if (num == null) {
                        num = 0;
                    }
                    int b17 = a06.d.b((num.intValue() / dVar.f255776d) * 100);
                    if (b17 > 0) {
                        int i28 = b17 <= 10 ? 0 : b17 <= 20 ? 1 : b17 <= 40 ? 2 : b17 <= 50 ? 3 : b17 <= 80 ? 4 : 5;
                        kotlin.jvm.internal.o.d(str);
                        if (r26.n0.B(str, "camera", false)) {
                            ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, i28 + 1, 1L);
                            iArr[0] = b17;
                        } else if (r26.n0.B(str, "local_render", false)) {
                            ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, 7 + i28, 1L);
                            iArr[1] = b17;
                        } else if (r26.n0.B(str, "process", false)) {
                            ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, 13 + i28, 1L);
                        } else if (r26.n0.B(str, "decode", false)) {
                            if (i19 > 0) {
                                if (b17 > 20) {
                                    i19++;
                                    iArr[3] = b17;
                                }
                                iArr[4] = i19;
                            } else {
                                if (i27 == -1) {
                                    i27 = i28;
                                }
                                iArr[3] = b17;
                                i19 = 1;
                            }
                        }
                    }
                }
            }
            if (i19 > 1) {
                ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, 25L, i19);
            } else if (i27 != -1) {
                ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, 19 + i27, 1L);
            }
            concurrentHashMap.clear();
            dVar.f255776d = 0;
        } else {
            iArr = new int[5];
            for (int i29 = 0; i29 < 5; i29++) {
                iArr[i29] = 0;
            }
        }
        return new fo5.f(iArr[0], iArr[1], iArr[2], iArr[3], i17);
    }

    @Override // ro5.b
    public void o(boolean z17, boolean z18) {
    }

    @Override // ro5.b
    public void p(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        so5.k0 k0Var = this.f398149f;
        if (k0Var == null) {
            callback.invoke();
            return;
        }
        if (k0Var != null) {
            ro5.l lVar = new ro5.l(callback);
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "exchangeCamera: ");
            kotlinx.coroutines.l.d(k0Var.f410857d, null, null, new so5.c0(k0Var, lVar, null), 3, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "flipCamera");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // ro5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.b0.q(java.util.ArrayList):void");
    }

    @Override // ro5.b
    public void r(boolean z17) {
        so5.k0 k0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "pauseCamera() called with: pause = " + z17);
        if (this.f398149f == null) {
            x();
        }
        so5.k0 k0Var2 = this.f398149f;
        if (((k0Var2 == null || k0Var2.b()) ? false : true) && !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "pauseCamera start");
            so5.k0 k0Var3 = this.f398149f;
            if (kotlin.jvm.internal.o.b(k0Var3 != null ? java.lang.Boolean.valueOf(so5.k0.c(k0Var3, false, false, 3, null)) : null, java.lang.Boolean.TRUE)) {
                this.f398158o.b();
            }
        }
        so5.k0 k0Var4 = this.f398149f;
        if ((k0Var4 != null && k0Var4.b()) && z17 && (k0Var = this.f398149f) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "stopCamera: ");
            k0Var.f410867q = false;
            kotlinx.coroutines.l.d(k0Var.f410857d, null, null, new so5.h0(k0Var, null), 3, null);
        }
        so5.k0 k0Var5 = this.f398149f;
        if (k0Var5 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "pauseCam: new value " + z17);
            k0Var5.f410858e = z17;
        }
        ro5.m1 m1Var = this.f398145b;
        if (m1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "pauseCam: new value " + z17);
            m1Var.f398249k = z17;
        }
        so5.k0 k0Var6 = this.f398149f;
        if (k0Var6 != null) {
            k0Var6.d();
        }
    }

    @Override // ro5.b
    public void s(er4.l mainUiScene) {
        kotlin.jvm.internal.o.g(mainUiScene, "mainUiScene");
        this.f398150g = mainUiScene != er4.l.MAIN_UI_CALL_END;
        this.f398151h = mainUiScene == er4.l.MAIN_UI_TALKING;
    }

    @Override // ro5.b
    public long t(int i17, int i18, int i19) {
        ro5.j jVar = this.f398144a;
        if (jVar != null) {
            return jVar.c(i17, i18, i19);
        }
        return 0L;
    }

    @Override // ro5.b
    public void u(io.flutter.view.TextureRegistry flutterTextureRegisterHelper) {
        kotlin.jvm.internal.o.g(flutterTextureRegisterHelper, "flutterTextureRegisterHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "registerFlutterTextureRegister");
        ro5.j jVar = new ro5.j(flutterTextureRegisterHelper);
        this.f398144a = jVar;
        android.util.SparseArray sparseArray = this.f398159p;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            int keyAt = sparseArray.keyAt(i17);
            ro5.e eVar = (ro5.e) sparseArray.valueAt(i17);
            h(keyAt);
            jVar.d(keyAt, eVar.f398182b, eVar.f398183c, eVar.f398184d, eVar.f398185e, false);
        }
        sparseArray.clear();
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = this.f398160q;
        java.util.Iterator it = concurrentSkipListSet.iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it.next();
            kotlin.jvm.internal.o.d(l17);
            h(l17.longValue());
        }
        concurrentSkipListSet.clear();
        android.util.SparseArray sparseArray2 = jVar.f398216c;
        int size2 = sparseArray2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int keyAt2 = sparseArray2.keyAt(i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "refresh render texture" + keyAt2);
            jVar.a(keyAt2);
            er4.w wVar = new er4.w();
            android.util.SparseArray sparseArray3 = jVar.f398215b;
            wVar.f(((ro5.a) sparseArray3.get(keyAt2)).f398128d.id());
            wVar.e(((ro5.e) sparseArray2.get(keyAt2)) != null ? r7.f398184d : 0L);
            ro5.e eVar2 = (ro5.e) sparseArray2.get(keyAt2);
            if (eVar2 != null) {
                int i19 = eVar2.f398183c;
                r8 = java.lang.Double.valueOf(i19 != 0 ? eVar2.f398182b / i19 : 1.0d).doubleValue();
            }
            wVar.d(r8);
            wVar.g(((ro5.e) sparseArray2.get(keyAt2)) != null ? r7.f398182b : 0.0d);
            wVar.b(((ro5.e) sparseArray2.get(keyAt2)) != null ? r7.f398183c : 0.0d);
            ro5.e eVar3 = (ro5.e) sparseArray2.get(keyAt2);
            wVar.c(eVar3 != null ? eVar3.f398185e : false);
            wVar.f256193m = ((ro5.a) sparseArray3.get(keyAt2)).f398130f;
            wVar.f256194n[7] = true;
            jVar.f398217d.put(java.lang.Integer.valueOf(keyAt2), java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.G(keyAt2, wVar, true, ro5.h.f398201a);
        }
        jVar.f398219f = new ro5.r(this);
    }

    @Override // ro5.b
    public void v(byte[] imageData, int i17, int i18) {
        mo5.b bVar;
        kotlin.jvm.internal.o.g(imageData, "imageData");
        ro5.m1 m1Var = this.f398145b;
        if (m1Var == null || (bVar = (mo5.b) m1Var.f398261w.getValue()) == null) {
            return;
        }
        if (i17 <= 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.ScreenProjectSendManager", "onScreenFrame: invalid size " + i17 + 'x' + i18);
            return;
        }
        int length = imageData.length;
        java.nio.ByteBuffer byteBuffer = bVar.f330426e;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            byteBuffer = java.nio.ByteBuffer.allocateDirect(length);
            bVar.f330426e = byteBuffer;
        }
        java.nio.ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.ScreenProjectSendManager", "onScreenFrame: buffer is null");
            return;
        }
        byteBuffer2.clear();
        byteBuffer2.put(imageData);
        byteBuffer2.flip();
        bVar.f330425d.a(byteBuffer2, i17, i18, 644, mo5.a.f330424d);
    }

    @Override // ro5.b
    public void w() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "unregisterFlutterTextureRegister");
        ro5.j jVar = this.f398144a;
        if (jVar != null) {
            jVar.b();
        }
        this.f398144a = null;
    }

    @Override // ro5.b
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "start render ");
        g();
    }

    @Override // ro5.b
    public void y() {
        if (this.f398149f == null) {
            x();
        }
        ro5.m1 m1Var = this.f398145b;
        if (m1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "pauseCam: new value false");
            m1Var.f398249k = false;
        }
        so5.k0 k0Var = this.f398149f;
        if (k0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "pauseCam: new value false");
            k0Var.f410858e = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "cameraHelper?.startCamera()");
        so5.k0 k0Var2 = this.f398149f;
        if (kotlin.jvm.internal.o.b(k0Var2 != null ? java.lang.Boolean.valueOf(so5.k0.c(k0Var2, false, false, 3, null)) : null, java.lang.Boolean.TRUE)) {
            this.f398158o.b();
        }
        ro5.m1 m1Var2 = this.f398145b;
        if (m1Var2 == null) {
            return;
        }
        m1Var2.f398245g = new ro5.t(this);
    }

    @Override // ro5.b
    public void z(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "setVirtualBackground() called with: vbon = " + z17);
        this.f398147d = z17;
        so5.p0 p0Var = (so5.p0) this.f398148e.get();
        if (p0Var != null) {
            p0Var.d(this.f398147d);
        }
    }
}
