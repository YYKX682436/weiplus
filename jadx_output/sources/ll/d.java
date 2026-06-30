package ll;

/* loaded from: classes13.dex */
public abstract class d implements ll.p, ol.j {

    /* renamed from: a, reason: collision with root package name */
    public volatile ol.h f319080a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ql.c f319081b;

    /* renamed from: c, reason: collision with root package name */
    public volatile n01.b f319082c;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f319083d;

    /* renamed from: e, reason: collision with root package name */
    public kl.k f319084e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.String f319085f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.String f319086g;

    /* renamed from: q, reason: collision with root package name */
    public int f319096q;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f319087h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f319088i = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f319089j = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f319090k = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f319091l = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f319092m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f319093n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    public int f319094o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f319095p = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f319097r = -1;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Object f319098s = new java.lang.Object();

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Object f319099t = new java.lang.Object();

    public d(ol.h hVar, ql.c cVar) {
        this.f319080a = hVar;
        this.f319081b = cVar;
        this.f319082c = this.f319081b.b();
        this.f319083d = this.f319082c.f333836a;
        this.f319085f = this.f319082c.f333838c;
        this.f319096q = this.f319082c.f333839d;
        this.f319086g = this.f319082c.f333837b;
    }

    public void A(hl.d dVar) {
        if (this.f319084e == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecoderBase", "process is null", null);
            return;
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "writeCacheAndPlay", null);
        s();
        while (true) {
            if (!i()) {
                y();
                hl.e c17 = this.f319084e.c(3536);
                if (dVar.k() > 0 && c17 == null) {
                    dVar.a();
                    break;
                }
                if (dVar.k() == 0 && c17 == null) {
                    dVar.h();
                    break;
                } else {
                    if (c17 == null) {
                        break;
                    }
                    if (!dVar.f282019b) {
                        dVar.m(c17);
                    }
                    z(c17);
                }
            } else {
                break;
            }
        }
        r();
    }

    @Override // ll.p
    public void a(int i17) {
        int i18 = this.f319096q;
        synchronized (this.f319098s) {
            this.f319096q = i17;
            this.f319097r = i17 / 20;
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)};
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "seek preStartTime:%d, seek position:%d", objArr);
        }
    }

    @Override // ll.p
    public void c(float f17, float f18) {
    }

    @Override // ll.p
    public void d() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "pauseOnBackground", null);
        pause();
    }

    public java.lang.String e() {
        n01.b g17 = g();
        if (g17 != null) {
            return g17.f333836a;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecoderBase", "param is null", null);
        return this.f319083d;
    }

    public hl.d f() {
        return il.j.a().b(this.f319085f);
    }

    public n01.b g() {
        return this.f319081b != null ? this.f319081b.b() : this.f319082c;
    }

    @Override // ll.p
    public long getCurrentPosition() {
        return -1L;
    }

    public boolean h() {
        return this.f319089j.get();
    }

    public boolean i() {
        return this.f319090k.get();
    }

    public void j(int i17) {
        if (i17 < 50) {
            this.f319091l.set(false);
            return;
        }
        hl.d f17 = f();
        g();
        if (!f17.f282019b) {
            this.f319091l.set(false);
            return;
        }
        this.f319091l.set(true);
        synchronized (this.f319099t) {
            try {
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "lockWriteBuffer, writeSize:%d", objArr);
                this.f319099t.wait();
            } catch (java.lang.Exception e17) {
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", e17, "lockWriteBuffer", new java.lang.Object[0]);
            }
        }
    }

    public void k() {
        synchronized (this.f319099t) {
            try {
                this.f319099t.notify();
            } catch (java.lang.Exception e17) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", e17, "notifyDecode", new java.lang.Object[0]);
            }
        }
    }

    public abstract void l();

    public void m(int i17) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecoderBase", "onError, errType:%d", objArr);
        this.f319090k.set(true);
        q(9, i17, "");
    }

    public void n(boolean z17) {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "onError needTry:%b", objArr);
        this.f319090k.set(true);
        p(9);
        hl.d f17 = f();
        if (f17.f282019b) {
            return;
        }
        f17.g();
    }

    public void o() {
        java.lang.ref.WeakReference weakReference;
        nl.b bVar = this.f319080a.f346100i;
        java.lang.String e17 = e();
        if (!bVar.f338124m.containsKey(e17) || (weakReference = (java.lang.ref.WeakReference) bVar.f338124m.remove(e17)) == null || weakReference.get() == null) {
            return;
        }
        weakReference.clear();
    }

    public void p(int i17) {
        q(i17, 0, "");
    }

    @Override // ll.p
    public void pause() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "pause", null);
        p(5);
        this.f319089j.set(true);
        this.f319092m.set(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        if (r8 == 15) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(int r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            ol.h r0 = r7.f319080a
            if (r0 != 0) goto L5
            return
        L5:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f319088i
            r0.set(r8)
            r0 = -1
            r1 = 4
            if (r8 != 0) goto Lf
            goto L50
        Lf:
            r2 = 1
            if (r8 != r2) goto L13
            goto L50
        L13:
            r2 = 9
            r3 = 3
            if (r8 != r3) goto L19
            goto L51
        L19:
            r4 = 7
            r5 = 2
            if (r8 != r5) goto L1f
        L1d:
            r2 = r4
            goto L51
        L1f:
            if (r8 != r1) goto L23
            r2 = 0
            goto L51
        L23:
            r6 = 5
            if (r8 != r6) goto L28
        L26:
            r2 = r5
            goto L51
        L28:
            r5 = 6
            if (r8 != r5) goto L2d
        L2b:
            r2 = r3
            goto L51
        L2d:
            if (r8 != r4) goto L31
            r2 = r6
            goto L51
        L31:
            if (r8 != r2) goto L35
            r2 = r1
            goto L51
        L35:
            r2 = 11
            if (r8 != r2) goto L3a
            goto L26
        L3a:
            r3 = 12
            if (r8 != r3) goto L41
            r2 = 10
            goto L51
        L41:
            r4 = 13
            if (r8 != r4) goto L46
            goto L51
        L46:
            r2 = 14
            if (r8 != r2) goto L4b
            goto L2b
        L4b:
            r2 = 15
            if (r8 != r2) goto L50
            goto L1d
        L50:
            r2 = r0
        L51:
            java.lang.String r8 = r7.e()
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 == 0) goto L5c
            return
        L5c:
            ol.h r3 = r7.f319080a
            if (r2 != r0) goto L61
            goto L9a
        L61:
            if (r3 == 0) goto L93
            if (r2 != r1) goto L93
            java.util.HashMap r0 = r3.f346104m
            java.lang.Object r0 = r0.get(r8)
            n01.b r0 = (n01.b) r0
            if (r0 != 0) goto L70
            goto L9a
        L70:
            com.tencent.mm.autogen.events.AudioPlayerEvent r1 = new com.tencent.mm.autogen.events.AudioPlayerEvent
            r1.<init>()
            am.g0 r4 = r1.f53990g
            r4.f6718c = r8
            r4.f6716a = r2
            java.lang.String r8 = r0.f333849n
            r4.f6720e = r8
            r4.f6721f = r9
            r4.f6722g = r10
            java.lang.String r8 = com.tencent.mm.autogen.events.AudioPlayerEvent.f(r2)
            r4.f6719d = r8
            ll.q r8 = r3.f346102k
            if (r8 == 0) goto L9a
            ol.f r8 = (ol.f) r8
            r8.a(r1)
            goto L9a
        L93:
            if (r3 == 0) goto L9a
            java.lang.String r9 = r7.f319086g
            r3.m(r2, r8, r9)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.d.q(int, int, java.lang.String):void");
    }

    public void r() {
    }

    public void s() {
    }

    public void t(hl.e eVar) {
        java.lang.Object obj;
        if (this.f319081b.b().f333861z) {
            if (!this.f319093n.get()) {
                this.f319093n.set(true);
                p(14);
            }
            nl.b bVar = this.f319080a.f346100i;
            java.lang.String e17 = e();
            bVar.getClass();
            java.lang.Object obj2 = null;
            int i17 = 0;
            if (eVar == null || android.text.TextUtils.isEmpty(e17) || eVar.f282038f == null) {
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "track is invalid", null);
            } else {
                if (!bVar.f338122k.containsKey(e17)) {
                    int i19 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "queue not exist for audioId:%s", e17);
                    synchronized (bVar.f338125n) {
                        bVar.f338122k.put(e17, new java.util.ArrayList());
                        if (!bVar.f338120i.contains(e17)) {
                            bVar.f338120i.add(e17);
                        }
                        if (!bVar.f338121j.containsKey(e17)) {
                            obj2 = new java.lang.Object();
                            bVar.f338121j.put(e17, obj2);
                        }
                    }
                }
                if (obj2 == null) {
                    if (bVar.f338121j.containsKey(e17)) {
                        obj2 = bVar.f338121j.get(e17);
                    } else {
                        synchronized (bVar.f338125n) {
                            if (bVar.f338121j.containsKey(e17)) {
                                obj = bVar.f338121j.get(e17);
                            } else {
                                obj = new java.lang.Object();
                                bVar.f338121j.put(e17, obj);
                            }
                        }
                        obj2 = obj;
                    }
                }
                if (obj2 == null) {
                    obj2 = new java.lang.Object();
                }
                java.lang.Object obj3 = obj2;
                if (!bVar.f338124m.containsKey(e17)) {
                    bVar.f338124m.put(e17, new java.lang.ref.WeakReference(this));
                }
                java.util.List list = (java.util.List) bVar.f338122k.get(e17);
                synchronized (obj3) {
                    if (list != null) {
                        list.add(0, eVar);
                        synchronized (bVar.f338125n) {
                            try {
                                bVar.f338125n.notifyAll();
                            } catch (java.lang.Exception e18) {
                                int i27 = rl.b.f397143a;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e18, "writePcmDataTrack", new java.lang.Object[0]);
                            }
                        }
                        i17 = list.size();
                    } else if (eVar.f282039g) {
                        il.h.a().c(eVar);
                    }
                }
            }
            j(i17);
        }
    }

    public void u() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "readCacheAndPlay", null);
        hl.d f17 = f();
        s();
        int k17 = f17.k();
        int i18 = 0;
        while (i18 < k17 && !i()) {
            y();
            synchronized (this.f319098s) {
                int i19 = this.f319097r;
                if (i19 >= 0 && i19 < k17) {
                    this.f319097r = -1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "seek to pos:%s", java.lang.Integer.valueOf(i19));
                    i18 = i19;
                }
            }
            hl.e e17 = f17.e(i18);
            if (e17 != null) {
                z(e17);
            }
            i18++;
        }
        r();
    }

    public void v() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f319092m;
        if (atomicBoolean.get() || this.f319090k.get()) {
            return;
        }
        atomicBoolean.set(true);
        p(13);
    }

    public void w() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "stop", null);
        c(0.0f, 0.0f);
        p(6);
        this.f319090k.set(true);
        this.f319089j.set(false);
        k();
        this.f319092m.set(false);
        this.f319093n.set(false);
    }

    public void x(int i17) {
        if (i17 < 20 && this.f319091l.get() && !h() && !i()) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "unLockWrite, queueSize:%d", objArr);
            k();
        }
    }

    public void y() {
        synchronized (this.f319099t) {
            while (!i() && h()) {
                try {
                    int i17 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "waitDecode", null);
                    this.f319099t.wait();
                } catch (java.lang.Exception e17) {
                    int i18 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", e17, "waitDecode", new java.lang.Object[0]);
                }
            }
        }
    }

    public void z(hl.e eVar) {
        int i17;
        if (this.f319087h.get() || eVar == null) {
            return;
        }
        long j17 = eVar.f282037e;
        if (j17 > 0 && (i17 = this.f319096q) > 0 && j17 < i17) {
            if (eVar.f282039g) {
                il.h.a().c(eVar);
            }
        } else {
            if (this.f319080a == null || this.f319080a.f346100i == null) {
                return;
            }
            eVar.f282033a = e();
            t(eVar);
        }
    }
}
