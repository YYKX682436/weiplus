package ds0;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f242791a;

    /* renamed from: b, reason: collision with root package name */
    public final int f242792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f242793c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f242794d;

    /* renamed from: e, reason: collision with root package name */
    public fs0.f f242795e;

    /* renamed from: f, reason: collision with root package name */
    public fs0.f f242796f;

    /* renamed from: g, reason: collision with root package name */
    public gs0.a f242797g;

    /* renamed from: h, reason: collision with root package name */
    public js0.c f242798h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f242799i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f242800j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f242801k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.HandlerThread f242802l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f242803m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f242804n;

    /* renamed from: o, reason: collision with root package name */
    public int f242805o;

    /* renamed from: p, reason: collision with root package name */
    public int f242806p;

    /* renamed from: q, reason: collision with root package name */
    public int f242807q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f242808r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f242809s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f242810t;

    /* renamed from: u, reason: collision with root package name */
    public long f242811u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f242812v;

    /* renamed from: w, reason: collision with root package name */
    public int f242813w;

    public d0(int i17, int i18, int i19, yz5.q qVar) {
        this.f242791a = i17;
        this.f242792b = i18;
        this.f242793c = i19;
        this.f242794d = qVar;
        int i27 = pu5.i.f358473b;
        this.f242802l = pu5.f.a("MediaCodecAACCodec_EncodeThread", 5);
        lp0.b.D();
        this.f242808r = new ds0.z(this);
        this.f242809s = new ds0.a0(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "init MediaCodecAACCodec, sampleRate:" + i18 + ", channelCount:" + i19);
        this.f242798h = new js0.c(i18, i19, kz5.c0.i(3, 1).contains(java.lang.Integer.valueOf(this.f242791a)), kz5.c0.i(2, 3).contains(java.lang.Integer.valueOf(this.f242791a)), new ds0.a(this), new ds0.b(this));
    }

    public static final void a(ds0.d0 d0Var, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo, android.media.MediaFormat mediaFormat) {
        d0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("encode end ,data size is ");
        sb6.append(byteBuffer);
        sb6.append(' ');
        int i17 = d0Var.f242805o;
        d0Var.f242805o = i17 + 1;
        sb6.append(i17);
        sb6.append(", pts:");
        sb6.append(bufferInfo.presentationTimeUs);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", sb6.toString());
        yz5.q qVar = d0Var.f242794d;
        if (qVar != null) {
            qVar.invoke(byteBuffer, bufferInfo, mediaFormat);
        }
    }

    public static final void b(ds0.d0 d0Var) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        kl.k kVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "onFrameEncodeEnd, mixCount:" + d0Var.f242813w);
        js0.c cVar = d0Var.f242798h;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i(cVar.f301470l, "stopMix");
            java.util.List pcmDataList = cVar.f301466h;
            kotlin.jvm.internal.o.f(pcmDataList, "pcmDataList");
            synchronized (pcmDataList) {
                cVar.f301466h.clear();
            }
            synchronized (cVar.f301471m) {
                cVar.f301469k = true;
                try {
                    cVar.f301471m.notifyAll();
                } catch (java.lang.Exception unused) {
                }
            }
            com.tencent.mars.xlog.Log.i(cVar.f301470l, "isMixingFinish1 " + cVar.f301467i);
            if (!cVar.f301467i) {
                synchronized (cVar.f301472n) {
                    try {
                        if (!cVar.f301467i) {
                            com.tencent.mars.xlog.Log.i(cVar.f301470l, "isMixingFinish2 " + cVar.f301467i);
                            cVar.f301472n.wait();
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                }
            }
            nl.d dVar = cVar.f301463e;
            dVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = dVar.f338142e.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.util.HashMap hashMap4 = dVar.f338144g;
                if (hashMap4.containsKey(str)) {
                    byte[] bArr = (byte[]) hashMap4.get(str);
                    java.util.HashMap hashMap5 = dVar.f338145h;
                    int intValue = ((java.lang.Integer) hashMap5.get(str)).intValue();
                    hl.e eVar = new hl.e();
                    int i17 = dVar.f338141d;
                    byte[] bArr2 = new byte[i17];
                    if (intValue > 0 && intValue <= i17) {
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, intValue);
                    } else if (bArr != null) {
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i17);
                    }
                    eVar.f282038f = bArr2;
                    arrayList.add(eVar);
                    hashMap5.put(str, 0);
                    java.util.Arrays.fill(bArr, 0, nl.d.f338137j, (byte) 0);
                    hashMap4.put(str, bArr);
                }
            }
            byte[] b17 = dVar.b(arrayList);
            nl.d dVar2 = cVar.f301463e;
            java.util.ArrayList arrayList2 = dVar2.f338142e;
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(arrayList2.size())};
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioSyncMixController", "release, ids size:%d", objArr);
            java.util.Iterator it6 = arrayList2.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                hashMap = dVar2.f338145h;
                hashMap2 = dVar2.f338144g;
                hashMap3 = dVar2.f338143f;
                if (!hasNext) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it6.next();
                if (hashMap3.containsKey(str2) && (kVar = (kl.k) hashMap3.remove(str2)) != null) {
                    kVar.release();
                }
                hashMap2.remove(str2);
                hashMap.remove(str2);
            }
            hashMap3.clear();
            hashMap2.clear();
            hashMap.clear();
            arrayList2.clear();
            if (dVar2.f338146i != null) {
                dVar2.f338146i = null;
            }
            java.lang.String str3 = cVar.f301470l;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopMix, final dstAudio:");
            sb6.append(b17 != null ? b17.length : 0);
            com.tencent.mars.xlog.Log.i(str3, sb6.toString());
            if (b17 != null) {
                cVar.f301462d.invoke(b17, 0L);
            } else {
                cVar.f301462d.invoke(new byte[0], 0L);
            }
            com.tencent.mars.xlog.Log.i(cVar.f301470l, "stopMix finish");
        }
        gs0.a aVar = d0Var.f242797g;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("mAudioEncoder");
            throw null;
        }
        aVar.b();
        gs0.a aVar2 = d0Var.f242797g;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("mAudioEncoder");
            throw null;
        }
        aVar2.b();
        yz5.a aVar3 = d0Var.f242804n;
        if (aVar3 != null) {
            aVar3.invoke();
        }
    }

    public static final void c(ds0.d0 d0Var) {
        d0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "on background decode end");
        js0.c cVar = d0Var.f242798h;
        if (cVar != null) {
            cVar.d("background");
        }
        d0Var.l(true);
    }

    public static final void d(ds0.d0 d0Var, byte[] bArr, long j17) {
        js0.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "on background frame decode, isDecodeEnd:" + d0Var.f242799i);
        if (d0Var.f242799i) {
            return;
        }
        d0Var.f242806p++;
        if (bArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "input background data");
            fs0.f fVar = d0Var.f242796f;
            if (fVar == null || (cVar = d0Var.f242798h) == null) {
                return;
            }
            cVar.c(bArr, "background", j17, fVar.b(), fVar.a());
        }
    }

    public static final void e(ds0.d0 d0Var, byte[] bArr, long j17) {
        d0Var.f242813w++;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "onFrameMixEnd, mixCount:" + d0Var.f242813w + ", decodeMusicFrameCount:" + d0Var.f242807q + ", decodeBackgroundFrameCount:" + d0Var.f242806p + ", mixType:" + d0Var.f242791a + ", data:" + bArr.length + ", pts:" + j17);
        if (d0Var.f242791a == 3) {
            d0Var.h(bArr, j17, d0Var.f242799i && d0Var.f242813w == d0Var.f242806p);
            return;
        }
        if (!d0Var.f242799i) {
            d0Var.h(bArr, j17, false);
        } else if (d0Var.f242791a == 2) {
            d0Var.h(bArr, j17, d0Var.f242799i && d0Var.f242813w == d0Var.f242807q);
        } else {
            d0Var.h(bArr, j17, d0Var.f242799i && d0Var.f242813w == d0Var.f242806p);
        }
    }

    public static final void f(ds0.d0 d0Var) {
        d0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "on music decode end");
        js0.c cVar = d0Var.f242798h;
        if (cVar != null) {
            cVar.d("music");
        }
        d0Var.l(false);
    }

    public static final void g(ds0.d0 d0Var, byte[] bArr, long j17) {
        js0.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "on music frame decode, isDecodeEnd:" + d0Var.f242799i);
        if (d0Var.f242799i && d0Var.f242807q == d0Var.f242806p) {
            return;
        }
        d0Var.f242807q++;
        if (bArr != null) {
            fs0.f fVar = d0Var.f242795e;
            if (fVar != null && (cVar = d0Var.f242798h) != null) {
                cVar.c(bArr, "music", j17, fVar.b(), fVar.a());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "input music data");
        }
    }

    public final void h(byte[] bArr, long j17, boolean z17) {
        if (this.f242803m == null) {
            android.os.HandlerThread handlerThread = this.f242802l;
            handlerThread.start();
            this.f242803m = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper(), new ds0.d(this));
        }
        if (z17) {
            this.f242812v = true;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f242803m;
        android.os.Message obtainMessage = n3Var != null ? n3Var.obtainMessage() : null;
        if (obtainMessage != null) {
            obtainMessage.what = 1024;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
        ds0.c cVar = new ds0.c(copyOf, j17, z17);
        if (obtainMessage != null) {
            obtainMessage.obj = cVar;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f242803m;
        if (n3Var2 != null) {
            n3Var2.sendMessage(obtainMessage);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "checkPostEncoder, " + cVar.f242786a.length + ", pts:" + cVar.f242787b + ", isLast: " + cVar.f242788c);
    }

    public final void i() {
        long j17 = this.f242807q * 5;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f242803m;
        if (n3Var != null) {
            n3Var.postDelayed(new ds0.e(this), j17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "set check post encode end delay:" + j17);
    }

    public final void j(hs0.a aVar, hs0.a aVar2, long j17, long j18) {
        android.media.MediaFormat mediaFormat;
        fs0.f lVar;
        fs0.f lVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "init decoder background " + aVar + "music is " + aVar2);
        if (aVar != null) {
            try {
                mediaFormat = aVar.f284552f;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACCodec", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACDecoderInitFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 22L, 1L);
                throw e17;
            }
        } else {
            mediaFormat = null;
        }
        if (mediaFormat == null && this.f242791a == 3) {
            this.f242791a = 2;
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaCodecAACCodec", "background AudioFormat is null, recreate AudioMixCodec, sampleRate:" + this.f242792b + ", channelCount:" + this.f242793c);
            this.f242798h = new js0.c(this.f242792b, this.f242793c, kz5.c0.i(3, 1).contains(java.lang.Integer.valueOf(this.f242791a)), kz5.c0.i(2, 3).contains(java.lang.Integer.valueOf(this.f242791a)), new ds0.g(this), new ds0.h(this));
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxBackgroundNoAudioTrack");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 25L, 1L);
        }
        if (this.f242791a == 3 && aVar != null) {
            if (fp.h.a(23)) {
                lVar2 = new fs0.h(aVar, "background", j17, j18, new ds0.i(this), new ds0.j(this));
            } else {
                this.f242810t = true;
                lVar2 = new fs0.l(aVar, "background", j17, j18, new ds0.k(this), new ds0.l(this));
            }
            this.f242796f = lVar2;
        }
        if (aVar2 != null) {
            if (fp.h.a(23)) {
                lVar = new fs0.h(aVar2, "music", 0L, j18 - j17, new ds0.m(this), new ds0.n(this));
            } else {
                this.f242810t = true;
                lVar = new fs0.l(aVar2, "music", 0L, j18 - j17, new ds0.o(this), new ds0.f(this));
            }
            this.f242795e = lVar;
        }
    }

    public final void k(android.media.MediaFormat mediaFormat) {
        gs0.a hVar;
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        try {
            if (fp.h.a(23)) {
                hVar = new gs0.c(mediaFormat, new ds0.p(this), new ds0.q(this));
            } else {
                this.f242810t = true;
                hVar = new gs0.h(mediaFormat, new ds0.r(this), new ds0.s(this));
            }
            this.f242797g = hVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACCodec", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACEncoderInitFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 23L, 1L);
        }
    }

    public final synchronized void l(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MediaCodecAACCodec", "onDecodeEnd, isDecodeEnd:" + this.f242799i + ", isBackground:" + z17 + ", mixCount:" + this.f242813w + ", decodeMusicFrameCount:" + this.f242807q + ", decodeBackgroundFrameCount:" + this.f242806p, new java.lang.Object[0]);
        if (z17) {
            this.f242801k = true;
        } else {
            this.f242800j = true;
        }
        int i17 = this.f242791a;
        if (i17 == 3 && this.f242800j && this.f242801k) {
            if (!this.f242799i) {
                this.f242799i = true;
                fs0.f fVar = this.f242795e;
                if (fVar != null) {
                    fVar.e();
                }
                fs0.f fVar2 = this.f242796f;
                if (fVar2 != null) {
                    fVar2.e();
                }
                i();
            }
        } else if (i17 == 2 && this.f242800j) {
            if (!this.f242799i) {
                this.f242799i = true;
                fs0.f fVar3 = this.f242795e;
                if (fVar3 != null) {
                    fVar3.e();
                }
                i();
            }
        } else if (i17 == 1 && this.f242801k && !this.f242799i) {
            this.f242799i = true;
            fs0.f fVar4 = this.f242796f;
            if (fVar4 != null) {
                fVar4.e();
            }
        }
    }

    public boolean m(yz5.a aVar) {
        js0.c cVar = this.f242798h;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i(cVar.f301470l, "startMix");
            cVar.f301468j = true;
            pm0.v.m("AudioMixCodec_MixAudio", true, new js0.b(cVar));
        }
        int i17 = this.f242791a;
        if (i17 == 3 || i17 == 1) {
            pm0.v.m("BackgroundDecoder", true, new ds0.b0(this));
        }
        if (this.f242795e != null) {
            pm0.v.m("MusicDecoder", true, new ds0.c0(this));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "startCodec");
        this.f242804n = aVar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f242811u = android.os.SystemClock.elapsedRealtime();
        return true;
    }

    public boolean n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "stopCodec, isPostDecodeEnd:" + this.f242812v);
        fs0.f fVar = this.f242796f;
        if (fVar != null) {
            fVar.e();
        }
        fs0.f fVar2 = this.f242795e;
        if (fVar2 != null) {
            fVar2.e();
        }
        gs0.a aVar = this.f242797g;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("mAudioEncoder");
            throw null;
        }
        aVar.b();
        this.f242802l.quitSafely();
        long j17 = this.f242811u;
        if (j17 <= 0) {
            return true;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (this.f242810t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACAsyncMix");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(986L, 26L, 1L);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACAsyncMixTime: " + elapsedRealtime);
            g0Var.C(986L, 27L, elapsedRealtime);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACSyncMix");
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.C(986L, 30L, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACSyncMixTime: " + elapsedRealtime);
        g0Var2.C(986L, 31L, elapsedRealtime);
        return true;
    }
}
