package so5;

/* loaded from: classes14.dex */
public final class y implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f410920d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f410921e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f410922f;

    /* renamed from: g, reason: collision with root package name */
    public final so5.a0 f410923g;

    /* renamed from: h, reason: collision with root package name */
    public final to5.c f410924h;

    /* renamed from: i, reason: collision with root package name */
    public final bp5.k f410925i;

    /* renamed from: m, reason: collision with root package name */
    public final yo5.h f410926m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f410927n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.l f410928o;

    /* renamed from: p, reason: collision with root package name */
    public final int f410929p;

    /* renamed from: q, reason: collision with root package name */
    public final so5.t[] f410930q;

    /* renamed from: r, reason: collision with root package name */
    public final so5.n[] f410931r;

    /* renamed from: s, reason: collision with root package name */
    public final bp5.h[] f410932s;

    /* renamed from: t, reason: collision with root package name */
    public final int f410933t;

    /* renamed from: u, reason: collision with root package name */
    public final java.nio.ByteBuffer f410934u;

    /* renamed from: v, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f410935v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f410936w;

    /* renamed from: x, reason: collision with root package name */
    public long f410937x;

    public y(boolean z17, boolean z18, boolean z19, so5.a0 hwCodecManager, to5.c engineOp, bp5.k renderTargetHolder, yo5.h handlerDispatcher, java.util.List list, yz5.l qosSizeChange) {
        kotlin.jvm.internal.o.g(hwCodecManager, "hwCodecManager");
        kotlin.jvm.internal.o.g(engineOp, "engineOp");
        kotlin.jvm.internal.o.g(renderTargetHolder, "renderTargetHolder");
        kotlin.jvm.internal.o.g(handlerDispatcher, "handlerDispatcher");
        kotlin.jvm.internal.o.g(qosSizeChange, "qosSizeChange");
        this.f410920d = z17;
        this.f410921e = z18;
        this.f410922f = z19;
        this.f410923g = hwCodecManager;
        this.f410924h = engineOp;
        this.f410925i = renderTargetHolder;
        this.f410926m = handlerDispatcher;
        this.f410927n = list;
        this.f410928o = qosSizeChange;
        this.f410929p = 2;
        so5.t[] tVarArr = new so5.t[2];
        for (int i17 = 0; i17 < 2; i17++) {
            tVarArr[i17] = so5.q.f410906b;
        }
        this.f410930q = tVarArr;
        int i18 = this.f410929p;
        so5.n[] nVarArr = new so5.n[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            nVarArr[i19] = new so5.n(0, 0, false, false, false);
        }
        this.f410931r = nVarArr;
        int i27 = this.f410929p;
        bp5.h[] hVarArr = new bp5.h[i27];
        for (int i28 = 0; i28 < i27; i28++) {
            hVarArr[i28] = null;
        }
        this.f410932s = hVarArr;
        this.f410933t = this.f410920d ? 78 : 61;
        this.f410934u = java.nio.ByteBuffer.allocateDirect(14);
        this.f410935v = kotlinx.coroutines.z0.a(this.f410926m.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f410936w = this.f410927n == null;
    }

    public final void a(short s17, int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.ILinkVoIP.EncoderManager", "closeCodec() called with: targetCodec = " + ((int) s17) + ", codecFlag = " + i17);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(6);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN).clear();
        allocateDirect.putShort((short) i17).putShort(s17).putShort((short) 0);
        this.f410924h.b(39, allocateDirect, allocateDirect.capacity());
    }

    public final void b(int i17, so5.t tVar) {
        if (!this.f410936w) {
            this.f410936w = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "before setLocalQoS: ");
            java.util.List<so5.a> list = this.f410927n;
            if (list != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "after setLocalQoS: ");
                to5.c engineOp = this.f410924h;
                kotlin.jvm.internal.o.g(engineOp, "engineOp");
                for (so5.a config : list) {
                    kotlin.jvm.internal.o.g(config, "config");
                    com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderQoSConfigHelper", "configCodec: " + config);
                    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(12);
                    allocateDirect.order(java.nio.ByteOrder.BIG_ENDIAN);
                    allocateDirect.position(2);
                    java.nio.ByteBuffer put = allocateDirect.put(config.f410785a).put(config.f410786b).put(config.f410787c).put(config.f410788d).put(config.f410789e).put(config.f410790f);
                    int i18 = config.f410791g;
                    put.put((byte) (i18 & 65535)).put((byte) ((i18 >> 8) & 65535)).put((byte) ((i18 >> 16) & 65535)).put((byte) ((i18 >> 24) & 65535));
                    engineOp.b(98, allocateDirect, allocateDirect.capacity());
                    if (allocateDirect.get(0) == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIP.EncoderQoSConfigHelper", "configCodec: config error " + config);
                    }
                }
            }
        }
        if (!(tVar instanceof so5.s)) {
            if (tVar instanceof so5.o) {
                i(i17);
                c(i17, false);
                return;
            } else if (tVar instanceof so5.p) {
                i(i17);
                c(i17, true);
                return;
            } else {
                if (tVar instanceof so5.q) {
                    i(i17);
                    return;
                }
                return;
            }
        }
        i(i17);
        uo5.u uVar = ((so5.s) tVar).f410907b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "configSWEncoder() called with: wayIndex = " + i17);
        bp5.c cVar = new bp5.c(new so5.x(this));
        int i19 = uVar.f429744a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ");
        sb6.append(i19);
        sb6.append(' ');
        int i27 = uVar.f429745b;
        sb6.append(i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.ImageReaderWrapper", sb6.toString());
        if (cVar.f23452e != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MVR.ImageReaderWrapper", "already has an instance, release first");
            cVar.close();
        }
        cVar.f23452e = android.media.ImageReader.newInstance(i19, i27, 1, 2);
        cVar.f23453f = new android.util.Size(i19, i27);
        android.media.ImageReader imageReader = cVar.f23452e;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new bp5.b(cVar), null);
        }
        bp5.h[] hVarArr = this.f410932s;
        bp5.h hVar = hVarArr[i17];
        java.io.Closeable closeable = hVar instanceof java.io.Closeable ? (java.io.Closeable) hVar : null;
        if (closeable != null) {
            closeable.close();
        }
        hVarArr[i17] = cVar;
        this.f410925i.a((i17 << 16) | com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, cVar);
        this.f410931r[i17].f410888c = true;
    }

    public final void c(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "configHWEncoder() called with: wayIndex = " + i17 + ", hevc = " + z17);
        wo5.b bVar = new wo5.b(z17, (android.os.Handler) ((jz5.n) this.f410926m.f464371g).getValue(), new so5.w(this, i17));
        ((ro5.d) this.f410923g).getClass();
        to5.c engineOp = this.f410924h;
        kotlin.jvm.internal.o.g(engineOp, "engineOp");
        uo5.l lVar = new uo5.l(true, new uo5.b(ro5.d.f398179b, bVar, new wo5.e(engineOp, bVar.f448315a, i17)));
        kotlinx.coroutines.y0 y0Var = this.f410935v;
        kotlinx.coroutines.l.d(y0Var, null, null, new so5.v(lVar, i17, z17, this, null), 3, null);
        bp5.f fVar = new bp5.f(y0Var, lVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecEncoderWrapper", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        ((uo5.l) fVar.f23459e).f();
        kotlinx.coroutines.r2 r2Var = fVar.f23461g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        fVar.f23461g = kotlinx.coroutines.l.d(fVar.f23458d, null, null, new bp5.e(fVar, null), 3, null);
        bp5.h[] hVarArr = this.f410932s;
        bp5.h hVar = hVarArr[i17];
        java.io.Closeable closeable = hVar instanceof java.io.Closeable ? (java.io.Closeable) hVar : null;
        if (closeable != null) {
            closeable.close();
        }
        hVarArr[i17] = fVar;
        this.f410925i.a((i17 << 16) | com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "close");
        int length = this.f410932s.length;
        for (int i17 = 0; i17 < length; i17++) {
            i(i17);
        }
        so5.t[] tVarArr = this.f410930q;
        int length2 = tVarArr.length;
        for (int i18 = 0; i18 < length2; i18++) {
            tVarArr[i18] = so5.q.f410906b;
        }
        this.f410936w = false;
    }

    public final void f(boolean z17, int i17, uo5.u newParams) {
        uo5.q qVar;
        java.lang.Object m521constructorimpl;
        bp5.f fVar;
        uo5.q qVar2;
        uo5.q qVar3;
        uo5.q qVar4;
        kotlin.jvm.internal.o.g(newParams, "newParams");
        byte b17 = newParams.f429749f;
        boolean z18 = newParams.f429750g;
        if (!z18 || (!(z17 && this.f410922f) && (z17 || !this.f410921e))) {
            if (z18) {
                if (z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIP.EncoderManager", "close hevc codec for way idx " + i17);
                    a((short) b17, 2);
                    return;
                }
                if (z17) {
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIP.EncoderManager", "close avc codec for way idx " + i17);
                a((short) b17, 2);
                return;
            }
            return;
        }
        so5.n[] nVarArr = this.f410931r;
        so5.n nVar = nVarArr[i17];
        if (nVar.f410887b > 2 || nVar.f410886a > 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close local encoder ");
            short s17 = b17;
            sb6.append((int) s17);
            sb6.append(" for way idx ");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIP.EncoderManager", sb6.toString());
            a(s17, 2);
            return;
        }
        so5.t[] tVarArr = this.f410930q;
        if ((z17 && !(tVarArr[i17] instanceof so5.p)) || ((!z17 && !(tVarArr[i17] instanceof so5.o)) || nVar.f410890e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "hwLogic: newParams " + newParams + ", needRecreate " + nVarArr[i17].f410890e);
            nVarArr[i17].f410890e = false;
            so5.t pVar = z17 ? new so5.p(newParams) : new so5.o(newParams);
            tVarArr[i17] = pVar;
            b(i17, pVar);
        }
        if (newParams.f429751h) {
            tVarArr[i17].f410908a = false;
            return;
        }
        so5.t tVar = tVarArr[i17];
        boolean z19 = true;
        tVar.f410908a = true;
        boolean z27 = newParams.f429752i;
        bp5.h[] hVarArr = this.f410932s;
        if (z27) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", i17 + " request I frame, mPrevMakeIMs: " + this.f410937x + ", lMakeIMs: " + currentTimeMillis);
            if (currentTimeMillis - this.f410937x >= 500) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", i17 + " request I frame");
                bp5.h hVar = hVarArr[i17];
                bp5.f fVar2 = hVar instanceof bp5.f ? (bp5.f) hVar : null;
                if (fVar2 != null && (qVar4 = fVar2.f23459e) != null) {
                    uo5.l lVar = (uo5.l) qVar4;
                    com.tencent.mars.xlog.Log.i(lVar.f429726c, "requestIFrame");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("request-sync", 0);
                    lVar.d(bundle);
                }
                this.f410937x = currentTimeMillis;
            }
        }
        if (tVar instanceof so5.r) {
            uo5.u uVar = ((so5.r) tVar).f410907b;
            if (uVar.f429744a == newParams.f429744a && uVar.f429745b == newParams.f429745b) {
                z19 = false;
            }
            byte b18 = newParams.f429748e;
            if (!z19 && !nVarArr[i17].f410889d) {
                short s18 = uVar.f429746c;
                short s19 = newParams.f429746c;
                if (s18 == s19) {
                    if (uVar.f429748e != b18) {
                        bp5.h hVar2 = hVarArr[i17];
                        fVar = hVar2 instanceof bp5.f ? (bp5.f) hVar2 : null;
                        if (fVar == null || (qVar2 = fVar.f23459e) == null) {
                            return;
                        }
                        ((uo5.l) qVar2).b(b18 & 255);
                        return;
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", i17 + " hwLogic: bitrate change newParams " + newParams);
                tVarArr[i17] = z17 ? new so5.p(newParams) : new so5.o(newParams);
                bp5.h hVar3 = hVarArr[i17];
                fVar = hVar3 instanceof bp5.f ? (bp5.f) hVar3 : null;
                if (fVar == null || (qVar3 = fVar.f23459e) == null) {
                    return;
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("video-bitrate", s19 * 1000);
                uo5.l lVar2 = (uo5.l) qVar3;
                lVar2.d(bundle2);
                lVar2.b(b18 & 255);
                return;
            }
            this.f410928o.invoke(newParams);
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", i17 + " hwLogic: size change newParams " + newParams + ", needReset: " + nVarArr[i17].f410889d);
            nVarArr[i17].f410889d = false;
            tVarArr[i17] = z17 ? new so5.p(newParams) : new so5.o(newParams);
            bp5.h hVar4 = hVarArr[i17];
            bp5.f fVar3 = hVar4 instanceof bp5.f ? (bp5.f) hVar4 : null;
            if (fVar3 == null || (qVar = fVar3.f23459e) == null) {
                return;
            }
            uo5.l lVar3 = (uo5.l) qVar;
            java.lang.String str = lVar3.f429726c;
            com.tencent.mars.xlog.Log.i(str, "resetCodec");
            lVar3.e(uo5.g.f429719a);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                uo5.r rVar = lVar3.f429729f;
                if (rVar != null) {
                    ((uo5.s) rVar).f429739a.stop();
                    lVar3.f429728e = null;
                    ((uo5.s) rVar).f429739a.reset();
                }
                lVar3.e(uo5.f.f429718a);
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, m524exceptionOrNullimpl, "codec call error", new java.lang.Object[0]);
                java.lang.String message = m524exceptionOrNullimpl.getMessage();
                lVar3.c(message != null ? message : "codec call error");
            }
            kotlin.Result.m527isFailureimpl(m521constructorimpl);
            lVar3.f();
            lVar3.b(b18 & 255);
        }
    }

    public final void i(int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.ILinkVoIP.EncoderManager", "releaseCurrentCodec() called with: wayIndex = " + i17);
        bp5.h[] hVarArr = this.f410932s;
        bp5.h hVar = hVarArr[i17];
        if (hVar != null) {
            this.f410925i.c((i17 << 16) | com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, hVar);
        }
        bp5.h hVar2 = hVarArr[i17];
        java.io.Closeable closeable = hVar2 instanceof java.io.Closeable ? (java.io.Closeable) hVar2 : null;
        if (closeable != null) {
            closeable.close();
        }
        hVarArr[i17] = null;
    }

    public final void j(int i17, uo5.u uVar) {
        so5.t[] tVarArr = this.f410930q;
        if (!(tVarArr[i17] instanceof so5.s)) {
            so5.s sVar = new so5.s(uVar);
            tVarArr[i17] = sVar;
            b(i17, sVar);
        }
        so5.t tVar = tVarArr[i17];
        boolean z17 = true;
        tVar.f410908a = !uVar.f429751h;
        if (tVar instanceof so5.r) {
            uo5.u uVar2 = ((so5.r) tVar).f410907b;
            if (uVar2.f429744a == uVar.f429744a && uVar2.f429745b == uVar.f429745b) {
                z17 = false;
            }
            if (z17) {
                this.f410928o.invoke(uVar);
                so5.s sVar2 = new so5.s(uVar);
                tVarArr[i17] = sVar2;
                b(i17, sVar2);
            }
        }
    }
}
