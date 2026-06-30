package w21;

/* loaded from: classes14.dex */
public class a0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w21.d0 f442296e;

    public a0(w21.d0 d0Var, w21.y yVar) {
        this.f442296e = d0Var;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "SilkPlayer_play_" + this.f442296e.f442321m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int minBufferSize;
        w21.d0 d0Var;
        int i18;
        int write;
        yl.d dVar;
        try {
            android.os.Process.setThreadPriority(-16);
            int minBufferSize2 = android.media.AudioTrack.getMinBufferSize(this.f442296e.f442316h, 2, 2) * 2;
            byte[] bArr = new byte[minBufferSize2];
            int i19 = (short) ((this.f442296e.f442316h * 20) / 1000);
            short[] sArr = new short[i19];
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "Thread start");
            while (true) {
                if (this.f442296e.f442318j != 1 && this.f442296e.f442318j != 2) {
                    break;
                }
                synchronized (w21.d0.I) {
                    try {
                        int i27 = w21.d0.K;
                        int i28 = this.f442296e.f442321m;
                        if (i27 != i28) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "[%d] diff id, useDeocder: %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(w21.d0.K));
                            w21.d0.k(this.f442296e);
                            if (this.f442296e.f442319k > 3) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(161L, 17L, 1L, false);
                            }
                            w21.d0 d0Var2 = this.f442296e;
                            d0Var2.q(d0Var2.f442317i);
                        }
                    } finally {
                    }
                }
                while (this.f442296e.f442320l) {
                    java.lang.Thread.sleep(20L);
                }
                w21.d0 d0Var3 = this.f442296e;
                if (d0Var3.f442328t != null) {
                    vl.a aVar = d0Var3.f442324p;
                    if (aVar != null) {
                        aVar.a(i19, bArr);
                    }
                    int i29 = 0;
                    while (true) {
                        long j17 = this.f442296e.f442331w;
                        d0Var = this.f442296e;
                        if (j17 < d0Var.f442322n || i29 < 0 || d0Var.f442333y) {
                            break;
                        }
                        i29 = d0Var.f442328t.b(bArr, i19);
                        if (i29 > 0) {
                            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(minBufferSize2);
                            allocate.put(bArr);
                            allocate.position(0);
                            w21.d0.m(this.f442296e);
                            ((java.util.ArrayList) this.f442296e.f442334z).add(allocate);
                        } else if (i29 == 0) {
                            this.f442296e.f442333y = true;
                        }
                    }
                    long j18 = d0Var.f442331w;
                    w21.d0 d0Var4 = this.f442296e;
                    if (j18 >= d0Var4.f442322n || i29 < 0 || ((java.util.ArrayList) d0Var4.f442334z).size() <= this.f442296e.f442331w) {
                        i18 = i29;
                    } else {
                        w21.d0 d0Var5 = this.f442296e;
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) ((java.util.ArrayList) d0Var5.f442334z).get((int) d0Var5.f442331w);
                        byteBuffer.position(0);
                        byteBuffer.get(bArr);
                        i18 = 1;
                    }
                    if (i18 < 0) {
                        this.f442296e.f442318j = 0;
                        w21.e0 e0Var = this.f442296e.D;
                        if (e0Var != null) {
                            e0Var.d();
                            w21.e0 e0Var2 = this.f442296e.D;
                            if (e0Var2.f442352i > 0) {
                                int write2 = this.f442296e.f442309a.write(sArr, 0, e0Var2.g(sArr, i19));
                                if (write2 <= 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.SilkPlayer", "playing done: write ret %d", java.lang.Integer.valueOf(write2));
                                } else {
                                    this.f442296e.H += write2 * 2;
                                }
                            }
                        }
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.idkeyStat(161L, 0L, 1L, false);
                        g0Var.idkeyStat(161L, 4L, 1L, false);
                        com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "[%d] SilkDoDec failed: %d", java.lang.Integer.valueOf(this.f442296e.f442321m), java.lang.Integer.valueOf(i18));
                        yl.d dVar2 = this.f442296e.f442323o;
                        if (dVar2 != null && x51.o1.H) {
                            dVar2.a();
                        }
                    } else {
                        if (x51.o1.H && (dVar = this.f442296e.f442323o) != null) {
                            dVar.b(bArr, i19 * 2);
                        }
                        try {
                            w21.d0 d0Var6 = this.f442296e;
                            android.media.AudioTrack audioTrack = d0Var6.f442309a;
                            if (audioTrack != null) {
                                if (d0Var6.f442332x) {
                                    audioTrack.pause();
                                    audioTrack.flush();
                                    audioTrack.play();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "seek flush audioTrack");
                                }
                                w21.e0 e0Var3 = this.f442296e.D;
                                if (e0Var3 != null) {
                                    e0Var3.h(bArr, i19 * 2);
                                    write = audioTrack.write(sArr, 0, this.f442296e.D.g(sArr, i19)) * 2;
                                } else {
                                    write = audioTrack.write(bArr, 0, i19 * 2);
                                }
                                if (write <= 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.SilkPlayer", "playing: write ret %d", java.lang.Integer.valueOf(write));
                                } else {
                                    this.f442296e.H += write;
                                }
                            }
                            w21.d0 d0Var7 = this.f442296e;
                            tl.g gVar = d0Var7.f442329u;
                            if (gVar != null && !d0Var7.f442332x) {
                                ((sl.b) gVar).a(this.f442296e.f442331w * 20);
                            }
                            this.f442296e.getClass();
                            synchronized (this.f442296e.f442330v) {
                                w21.d0.l(this.f442296e);
                                this.f442296e.f442332x = false;
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "write audio track failed: %s", e17.getMessage());
                            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            g0Var2.idkeyStat(161L, 0L, 1L, false);
                            g0Var2.idkeyStat(161L, 5L, 1L, false);
                        }
                        if (i18 == 0) {
                            this.f442296e.f442318j = 4;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "[%d] play completed", java.lang.Integer.valueOf(this.f442296e.f442321m));
                            yl.d dVar3 = this.f442296e.f442323o;
                            if (dVar3 != null && x51.o1.H) {
                                dVar3.a();
                                com.tencent.mm.sdk.platformtools.u3.h(new w21.b0(this));
                            }
                        } else if (this.f442296e.f442318j == 2) {
                            this.f442296e.getClass();
                            synchronized ("") {
                                try {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "before mOk.notify");
                                    this.f442296e.getClass();
                                    "".notifyAll();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "after mOk.notify");
                                } catch (java.lang.Exception e18) {
                                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                                }
                            }
                            this.f442296e.getClass();
                            synchronized ("") {
                                try {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "before mpause.wait");
                                    this.f442296e.getClass();
                                    "".wait();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "after mpause.wait");
                                } catch (java.lang.Exception e19) {
                                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                                }
                            }
                        } else {
                            this.f442296e.getClass();
                            synchronized ("") {
                                try {
                                    this.f442296e.getClass();
                                    "".notifyAll();
                                } catch (java.lang.Exception e27) {
                                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                                }
                            }
                        }
                    }
                } else {
                    d0Var3.f442318j = 0;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "[%d] SilkDoDec failed. data == null ", java.lang.Integer.valueOf(this.f442296e.f442321m));
                    yl.d dVar4 = this.f442296e.f442323o;
                    if (dVar4 != null && x51.o1.H) {
                        dVar4.a();
                    }
                }
            }
        } catch (java.lang.Exception e28) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(161L, 0L, 1L, false);
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
            android.media.MediaPlayer.OnErrorListener onErrorListener = this.f442296e.F;
            if (onErrorListener != null) {
                ((w21.z) onErrorListener).onError(null, 0, 0);
            }
            this.f442296e.f442318j = 0;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: w21.a0$$a
            @Override // java.lang.Runnable
            public final void run() {
                w21.t0 t0Var;
                w21.a0 a0Var = w21.a0.this;
                a0Var.getClass();
                synchronized (w21.d0.I) {
                    int i37 = w21.d0.K;
                    w21.d0 d0Var8 = a0Var.f442296e;
                    if (i37 == d0Var8.f442321m && (t0Var = d0Var8.f442328t) != null) {
                        t0Var.a();
                        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "[%d] SilkDecUnInit", java.lang.Integer.valueOf(a0Var.f442296e.f442321m));
                        w21.d0.K = -1;
                        a0Var.f442296e.f442319k = 0;
                    }
                }
                if (a0Var.f442296e.f442318j != 3) {
                    tl.e eVar = a0Var.f442296e.f442313e;
                    if (eVar != null) {
                        eVar.onCompletion();
                    }
                    android.media.MediaPlayer.OnCompletionListener onCompletionListener = a0Var.f442296e.E;
                    if (onCompletionListener != null) {
                        ((w21.y) onCompletionListener).onCompletion(null);
                        return;
                    }
                    return;
                }
                if (a0Var.f442296e.f442309a != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
                    try {
                        a0Var.f442296e.v();
                    } catch (java.lang.Exception e29) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "mAudioTrack.stop() error: %s", e29.getMessage());
                    }
                }
            }
        };
        w21.d0 d0Var8 = this.f442296e;
        android.media.AudioTrack audioTrack2 = d0Var8.f442309a;
        if (!d0Var8.A || d0Var8.f442318j == 3 || audioTrack2 == null || audioTrack2.getPlayState() != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "complete");
            runnable.run();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "delay complete");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_silk_player_use_sleep, 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "stop use old sleep 1000");
            java.util.concurrent.Future future = this.f442296e.G;
            if (future != null && !future.isDone()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "has uncomplete task");
            }
            this.f442296e.G = ((ku5.t0) ku5.t0.f312615d).k(runnable, 1000L);
            return;
        }
        if (audioTrack2.getPlaybackHeadPosition() >= this.f442296e.H / 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "audioTrackHeadPosition %d writtenBytes %d, just invoke oncomp", java.lang.Integer.valueOf(audioTrack2.getPlaybackHeadPosition()), java.lang.Integer.valueOf(this.f442296e.H));
            java.util.concurrent.Future future2 = this.f442296e.G;
            if (future2 != null && !future2.isDone()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "has uncomplete task");
            }
            w21.d0 d0Var9 = this.f442296e;
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
            t0Var.getClass();
            d0Var9.G = t0Var.k(runnable, 0L);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "set setNotificationMarkerPosition %d", java.lang.Integer.valueOf(this.f442296e.H / 2));
        try {
            i17 = audioTrack2.setNotificationMarkerPosition(this.f442296e.H / 2);
        } catch (java.lang.Exception e29) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "run: setNotificationMarkerPosition error", e29);
            i17 = -1;
        }
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "run: setNotificationMarkerPosition error %d", java.lang.Integer.valueOf(i17));
            java.util.concurrent.Future future3 = this.f442296e.G;
            if (future3 != null && !future3.isDone()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "has uncompleted task");
            }
            w21.d0 d0Var10 = this.f442296e;
            ku5.t0 t0Var2 = (ku5.t0) ku5.t0.f312615d;
            t0Var2.getClass();
            d0Var10.G = t0Var2.k(runnable, 0L);
            return;
        }
        this.f442296e.B = true;
        this.f442296e.C = runnable;
        try {
            audioTrack2.setPlaybackPositionUpdateListener(new w21.c0(this, ((ku5.t0) ku5.t0.f312615d).k(runnable, 5000L), runnable), new android.os.Handler(android.os.Looper.getMainLooper()));
        } catch (java.lang.Exception e37) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "run: setPlaybackPositionUpdateListener error", e37);
        }
        try {
            minBufferSize = audioTrack2.getBufferSizeInFrames() * 2;
        } catch (java.lang.IllegalStateException e38) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SilkPlayer", e38, "get buffer size error", new java.lang.Object[0]);
            minBufferSize = this.f442296e.f442325q * android.media.AudioTrack.getMinBufferSize(this.f442296e.f442316h, 2, 2);
        }
        int i37 = this.f442296e.H % minBufferSize;
        if (i37 == 0 || i37 >= minBufferSize) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SilkPlayer", "run: need write empty data %d, %d", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(minBufferSize));
        int i38 = minBufferSize - i37;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "run: write ret %d", java.lang.Integer.valueOf(audioTrack2.write(new byte[i38], 0, i38)));
        } catch (java.lang.Exception e39) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "run: write error", e39);
        }
    }
}
