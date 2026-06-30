package rl3;

/* loaded from: classes12.dex */
public abstract class b implements com.tencent.mm.plugin.music.player.base.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f397226a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f397228c;

    /* renamed from: d, reason: collision with root package name */
    public kl3.h f397229d;

    /* renamed from: e, reason: collision with root package name */
    public kl3.e f397230e;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f397227b = "";

    /* renamed from: f, reason: collision with root package name */
    public long f397231f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f397232g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f397233h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.h5[] f397234i = {null};

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f397235j = new java.util.LinkedList();

    public void k() {
        if (b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.READ_PHONE_STATE") != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.BaseMusicPlayer", "addPhoneStatusWatcher() not have read_phone_state perm");
            return;
        }
        com.tencent.mm.sdk.platformtools.h5[] h5VarArr = this.f397234i;
        if (h5VarArr[0] != null) {
            return;
        }
        synchronized (h5VarArr) {
            com.tencent.mm.sdk.platformtools.h5[] h5VarArr2 = this.f397234i;
            if (h5VarArr2[0] != null) {
                return;
            }
            h5VarArr2[0] = new rl3.a(this);
            ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi(this.f397234i[0]);
        }
    }

    public void l(b21.r rVar) {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar == null || (str = rVar.f17346e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onCompleteEvent: %s", objArr);
        this.f397227b = "ended";
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = 7;
        jkVar.f7037c = rVar;
        jkVar.f7040f = "ended";
        jkVar.f7039e = getDuration();
        jkVar.f7038d = rVar.f17346e;
        jkVar.f7041g = e();
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.m(rVar);
        }
    }

    public void m(b21.r rVar, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent with errCode:%d", java.lang.Integer.valueOf(i17));
        this.f397227b = "error";
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = 4;
        jkVar.f7037c = rVar;
        jkVar.f7040f = "error";
        jkVar.f7039e = getDuration();
        jkVar.f7041g = e();
        jkVar.f7045k = com.tencent.mm.plugin.music.player.base.m.b(i17);
        jkVar.f7046l = com.tencent.mm.plugin.music.player.base.m.a(i17);
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.n(rVar, i17);
        }
    }

    public void n(b21.r rVar) {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar == null || (str = rVar.f17346e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onPauseEvent: %s", objArr);
        this.f397227b = "pause";
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = 3;
        jkVar.f7037c = rVar;
        jkVar.f7040f = "pause";
        jkVar.f7039e = getDuration();
        jkVar.f7041g = e();
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.e(rVar);
        }
    }

    public void o(b21.r rVar) {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar == null || (str = rVar.f17346e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onResumeEvent: %s", objArr);
        this.f397227b = com.tencent.tav.core.AssetExtension.SCENE_PLAY;
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = 1;
        jkVar.f7037c = rVar;
        jkVar.f7040f = com.tencent.tav.core.AssetExtension.SCENE_PLAY;
        jkVar.f7039e = getDuration();
        jkVar.f7041g = e();
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.r(rVar);
        }
    }

    public void p(b21.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onSeekToEvent");
        this.f397227b = "seeked";
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = 8;
        jkVar.f7037c = rVar;
        jkVar.f7040f = "seeked";
        jkVar.f7039e = getDuration();
        jkVar.f7041g = e();
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.w(rVar);
        }
    }

    public void q(b21.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onStartEvent %b", java.lang.Boolean.valueOf(i()));
        this.f397227b = com.tencent.tav.core.AssetExtension.SCENE_PLAY;
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = 0;
        jkVar.f7037c = rVar;
        jkVar.f7040f = com.tencent.tav.core.AssetExtension.SCENE_PLAY;
        jkVar.f7039e = getDuration();
        jkVar.f7041g = e();
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.p(rVar);
        }
    }

    public void r(b21.r rVar) {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar == null || (str = rVar.f17346e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onStopEvent: %s", objArr);
        this.f397227b = "stop";
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = 2;
        jkVar.f7037c = rVar;
        jkVar.f7040f = "stop";
        jkVar.f7039e = getDuration();
        jkVar.f7041g = e();
        boolean z17 = this.f397228c;
        this.f397228c = false;
        jkVar.f7043i = z17;
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.f(rVar);
        }
    }

    public boolean s() {
        kl3.e eVar = this.f397230e;
        return eVar != null && eVar.requestFocus();
    }

    public boolean t(b21.r rVar) {
        if (rVar != null) {
            return rVar.V;
        }
        return true;
    }

    public void u(com.tencent.mm.plugin.music.player.base.k kVar) {
        if (kVar == null) {
            return;
        }
        java.util.LinkedList linkedList = this.f397235j;
        if (linkedList.contains(kVar)) {
            linkedList.remove(kVar);
        }
    }
}
