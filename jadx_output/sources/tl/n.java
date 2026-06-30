package tl;

/* loaded from: classes12.dex */
public class n implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.t f420061a;

    public n(tl.t tVar) {
        this.f420061a = tVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioRecorder", "onRecError state = %s detailState = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new tl.m(this));
    }

    @Override // tl.c
    public void b(byte[] data, int i17) {
        boolean z17;
        boolean z18;
        to.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "onRecPcmDataReady, markStop: %s", java.lang.Boolean.valueOf(this.f420061a.f420131k));
        tl.t tVar = this.f420061a;
        if (tVar.f420138r == tl.s.STOPPED && !tVar.f420131k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAudioRecorder", "recorder has been stopped");
            return;
        }
        java.lang.Integer[] numArr = wl.a.f446984a;
        kotlin.jvm.internal.o.g(data, "data");
        int i18 = wl.a.f446986c + 1;
        wl.a.f446986c = i18;
        if (i18 % 200 == 0 && i17 != 0) {
            int i19 = i17 / 2;
            short[] sArr = new short[i19];
            for (int i27 = 0; i27 < i19; i27++) {
                int i28 = i27 * 2;
                sArr[i27] = (short) (((data[i28 + 1] & 255) << 8) | (data[i28] & 255));
            }
            double d17 = 0.0d;
            for (int i29 = 0; i29 < i19; i29++) {
                short s17 = sArr[i29];
                d17 += s17 * s17;
            }
            double sqrt = java.lang.Math.sqrt(d17 / i19);
            if (sqrt < 50.0d) {
                java.lang.Integer[] numArr2 = wl.a.f446984a;
                numArr2[0] = java.lang.Integer.valueOf(numArr2[0].intValue() + 1);
            } else if (sqrt < 300.0d) {
                java.lang.Integer[] numArr3 = wl.a.f446984a;
                numArr3[1] = java.lang.Integer.valueOf(numArr3[1].intValue() + 1);
            } else if (sqrt < 2000.0d) {
                java.lang.Integer[] numArr4 = wl.a.f446984a;
                numArr4[2] = java.lang.Integer.valueOf(numArr4[2].intValue() + 1);
            } else {
                java.lang.Integer[] numArr5 = wl.a.f446984a;
                numArr5[3] = java.lang.Integer.valueOf(numArr5[3].intValue() + 1);
            }
            wl.a.f446985b++;
        }
        java.lang.Object obj = tl.t.f420120y;
        synchronized (obj) {
            z17 = this.f420061a.f420131k;
        }
        if (z17) {
            synchronized (tl.t.f420119x) {
                if (this.f420061a.f420136p != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "do stop pcm recorder, last frame data: %s, read: %s", data, java.lang.Integer.valueOf(i17));
                    this.f420061a.f420136p.l();
                    tl.t tVar2 = this.f420061a;
                    tVar2.f420136p.f420172y = null;
                    tVar2.f420136p = null;
                    z18 = true;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "stop now, but recorder is null");
                    z18 = false;
                }
            }
            synchronized (obj) {
                this.f420061a.f420131k = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "stop finish notify");
                try {
                    obj.notifyAll();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAudioRecorder", e17, "", new java.lang.Object[0]);
                }
            }
        } else {
            z18 = false;
        }
        long j17 = this.f420061a.f420129i;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        long j18 = this.f420061a.f420128h;
        if (j18 > 0 && currentTimeMillis > j18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAudioRecorder", "Stop now ! expire duration ms:" + currentTimeMillis);
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new tl.k(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "read :" + i17 + " time: " + this.f420061a.f420141u.a() + " dataReadedCnt: " + this.f420061a.f420130j);
        if (i17 < 0) {
            if (this.f420061a.f420138r == tl.s.STOPPED) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAudioRecorder", "recorder has been stopped");
                return;
            } else {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new tl.l(this));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "publish SceneVoiceRcdDataEvent, buf.len %d, len: %d.", java.lang.Integer.valueOf(data.length), java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent sceneVoiceRcdDataEvent = new com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent();
        sceneVoiceRcdDataEvent.f54740g.f6499a = java.util.Arrays.copyOf(data, data.length);
        sceneVoiceRcdDataEvent.f54740g.f6500b = i17;
        sceneVoiceRcdDataEvent.e();
        tl.t tVar3 = this.f420061a;
        tVar3.f420130j += i17;
        synchronized (tVar3.f420123c) {
            tl.t tVar4 = this.f420061a;
            if (tVar4.f420126f == null && (((cVar = tVar4.f420137q) == to.c.PCM || cVar == to.c.SILK) && tVar4.f420127g != null && tVar4.f420134n)) {
                tVar4.f420126f = new n21.f();
                tl.t tVar5 = this.f420061a;
                tVar5.f420126f.c(tVar5.f420132l, 1, 16);
            }
            n21.f fVar = this.f420061a.f420126f;
            if (fVar != null) {
                java.util.concurrent.BlockingQueue blockingQueue = fVar.f334252e;
                ((java.util.concurrent.ArrayBlockingQueue) blockingQueue).size();
                if (data.length > 0) {
                    ((java.util.concurrent.ArrayBlockingQueue) blockingQueue).add(new tl.h0(data, data.length));
                }
            }
            tl.t tVar6 = this.f420061a;
            if (tVar6.f420137q == to.c.SILK) {
                if (tVar6.f420124d == null) {
                    tVar6.f420124d = new yl.g(tVar6.f420132l, tVar6.f420133m);
                    tl.t tVar7 = this.f420061a;
                    tVar7.f420124d.b(tVar7.f420122b);
                }
                c(data, i17);
                this.f420061a.f420124d.g(data, i17, z18);
                return;
            }
            if (tVar6.f420132l == 16000) {
                int i37 = i17 % 4;
                if (i37 != 0) {
                    i17 -= i37;
                }
                if (i17 <= 0) {
                    data = null;
                } else {
                    int i38 = i17 / 2;
                    byte[] bArr = new byte[i38];
                    for (int i39 = 0; i39 < i38; i39 += 2) {
                        int i47 = i39 * 2;
                        bArr[i39] = data[i47];
                        bArr[i39 + 1] = data[i47 + 1];
                    }
                    data = bArr;
                }
                i17 = data.length;
            }
            c(data, i17);
        }
    }

    public final void c(byte[] bArr, int i17) {
        for (int i18 = 0; i18 < i17 / 2; i18++) {
            int i19 = i18 * 2;
            short s17 = (short) ((bArr[i19 + 1] << 8) | (bArr[i19] & 255));
            tl.t tVar = this.f420061a;
            if (s17 > tVar.f420121a) {
                tVar.f420121a = s17;
            }
        }
    }
}
