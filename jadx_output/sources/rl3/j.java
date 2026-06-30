package rl3;

/* loaded from: classes14.dex */
public class j extends com.tencent.mm.plugin.music.player.base.i {

    /* renamed from: d, reason: collision with root package name */
    public gp.c f397247d;

    /* renamed from: e, reason: collision with root package name */
    public wo.i1 f397248e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.AudioTrack f397249f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f397250g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f397251h = true;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f397252i = null;

    /* renamed from: j, reason: collision with root package name */
    public int f397253j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f397254k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f397255l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f397256m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f397257n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f397258o = new rl3.i(this);

    public static boolean l(rl3.j jVar) {
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMPlayer", "createAudioTrack");
        int i17 = jVar.f397254k == 1 ? 4 : 12;
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(jVar.f397253j, i17, 2);
        if (((kl3.f) sl3.b.b(kl3.f.class)) != null) {
            jVar.f397249f = new to.e(3, jVar.f397253j, i17, 2, minBufferSize, 1);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMPlayer", "mediaResService null");
        }
        if (jVar.f397249f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMPlayer", "audioTrack is null, new AudioTrack");
            jVar.f397249f = new android.media.AudioTrack(3, jVar.f397253j, i17, 2, minBufferSize, 1);
        }
        android.media.AudioTrack audioTrack = jVar.f397249f;
        if (audioTrack != null && audioTrack.getState() == 1) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMPlayer", "audio track not initialized");
        android.media.AudioTrack audioTrack2 = jVar.f397249f;
        if (audioTrack2 != null) {
            try {
                audioTrack2.release();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static void m(rl3.j jVar) {
        jVar.getClass();
        try {
            android.media.AudioTrack audioTrack = jVar.f397249f;
            if (audioTrack != null) {
                audioTrack.flush();
                jVar.f397249f.release();
                jVar.f397249f = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e17, "releaseAudioTrack", new java.lang.Object[0]);
        }
    }

    public static void n(rl3.j jVar) {
        jVar.getClass();
        try {
            gp.c cVar = jVar.f397247d;
            if (cVar != null) {
                cVar.g();
                jVar.f397247d = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e17, "releaseMediaExtractor", new java.lang.Object[0]);
        }
    }

    public static void o(rl3.j jVar) {
        jVar.getClass();
        try {
            wo.i1 i1Var = jVar.f397248e;
            if (i1Var != null) {
                i1Var.y();
                jVar.f397248e.q();
                jVar.f397248e = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e17, "releaseMediaCodec", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public int a() {
        return (int) (this.f397255l / 1000);
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public int b() {
        return (int) (this.f397256m / 1000);
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public java.lang.String c() {
        return this.f397252i;
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public boolean d() {
        return !this.f397251h;
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public boolean e() {
        boolean z17;
        com.tencent.mm.plugin.music.player.base.o oVar = this.f150665c;
        synchronized (oVar) {
            z17 = oVar.f150666a == 3;
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void f(boolean z17) {
        this.f150665c.f150666a = 4;
        this.f397251h = true;
        super.f(z17);
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMPlayer", "pause");
        if (!this.f397251h) {
            this.f150665c.f150666a = 2;
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void h() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMPlayer", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
        boolean z18 = !this.f397251h;
        if (!z18) {
            this.f397251h = false;
            s75.d.b(this.f397258o, "music_player");
            return;
        }
        if (z18) {
            com.tencent.mm.plugin.music.player.base.o oVar = this.f150665c;
            synchronized (oVar) {
                z17 = oVar.f150666a == 2;
            }
            if (z17) {
                oVar.f150666a = 3;
                synchronized (this) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMPlayer", "sync notify");
                    try {
                        notify();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e17, "syncNotify", new java.lang.Object[0]);
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void i(long j17) {
        this.f397247d.h(j17 * 1000, 2);
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void j(java.lang.String str) {
        this.f397250g = str;
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void k() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMPlayer", "stop");
        this.f397251h = true;
        com.tencent.mm.plugin.music.player.base.o oVar = this.f150665c;
        synchronized (oVar) {
            z17 = oVar.f150666a == 2;
        }
        if (z17) {
            synchronized (this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMPlayer", "sync notify");
                try {
                    notify();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e17, "syncNotify", new java.lang.Object[0]);
                }
            }
        }
    }

    public void p(boolean z17) {
        this.f150665c.f150666a = 4;
        this.f397251h = true;
        if (this.f150663a != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.player.base.e(this, z17));
        }
    }

    public synchronized void q() {
        boolean z17;
        while (true) {
            try {
                if (!(!this.f397251h)) {
                    break;
                }
                com.tencent.mm.plugin.music.player.base.o oVar = this.f150665c;
                synchronized (oVar) {
                    z17 = oVar.f150666a == 2;
                }
                if (!z17) {
                    break;
                }
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMPlayer", "wait play");
                    wait();
                } catch (java.lang.InterruptedException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e17, "waitPlay", new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }
}
