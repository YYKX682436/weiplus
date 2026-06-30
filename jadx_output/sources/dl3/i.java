package dl3;

/* loaded from: classes13.dex */
public class i {
    public static dl3.i W;
    public final java.util.HashMap A;
    public final ol.c B;
    public volatile boolean C;
    public volatile boolean D;
    public final bm5.x0 E;
    public long F;
    public final java.util.LinkedList G;
    public final java.util.LinkedList H;
    public final ml.b I;

    /* renamed from: J, reason: collision with root package name */
    public android.os.Handler f235307J;
    public android.os.Looper K;
    public dl3.b L;
    public dl3.a M;
    public final dl3.f N;
    public final java.lang.Runnable O;
    public final java.lang.Runnable P;
    public final ol.b Q;
    public final ol.k R;
    public final ml.g S;
    public volatile int T;
    public final java.lang.Object U;
    public final n01.e V;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f235308a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f235309b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f235310c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f235311d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f235312e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f235313f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f235314g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f235315h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f235316i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f235317j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f235318k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f235319l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f235320m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f235321n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.util.Set f235322o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f235323p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f235324q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f235325r;

    /* renamed from: s, reason: collision with root package name */
    public long f235326s;

    /* renamed from: t, reason: collision with root package name */
    public long f235327t;

    /* renamed from: u, reason: collision with root package name */
    public el3.i f235328u;

    /* renamed from: v, reason: collision with root package name */
    public n01.a f235329v;

    /* renamed from: w, reason: collision with root package name */
    public final fl3.a f235330w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.h5[] f235331x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f235332y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f235333z;

    public i() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f235308a = linkedList;
        this.f235309b = new java.util.HashMap();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f235310c = linkedList2;
        this.f235311d = new java.util.HashMap();
        this.f235312e = new java.util.LinkedList();
        this.f235313f = new java.util.LinkedList();
        this.f235314g = new java.util.HashMap();
        this.f235315h = new java.util.HashMap();
        this.f235316i = new java.util.HashMap();
        this.f235317j = new java.util.HashMap();
        this.f235318k = new java.util.LinkedList();
        this.f235319l = new java.util.LinkedList();
        this.f235320m = new java.util.HashMap();
        this.f235321n = new java.util.LinkedList();
        this.f235322o = new java.util.HashSet();
        java.lang.Object obj = new java.lang.Object();
        this.f235323p = obj;
        this.f235324q = false;
        this.f235325r = false;
        this.f235326s = 0L;
        this.f235327t = 0L;
        this.f235329v = new n01.a();
        this.f235330w = new fl3.a();
        this.f235331x = new com.tencent.mm.sdk.platformtools.h5[]{null};
        this.f235332y = new java.util.ArrayList();
        this.f235333z = new java.util.HashMap();
        this.A = new java.util.HashMap();
        this.C = true;
        this.D = true;
        this.E = new bm5.x0(new dl3.i$$a());
        this.F = 0L;
        this.G = new java.util.LinkedList();
        this.H = new java.util.LinkedList();
        this.L = null;
        this.M = null;
        this.N = new dl3.l(this);
        this.O = new dl3.m(this);
        this.P = new dl3.n(this);
        this.Q = new dl3.p(this);
        this.R = new dl3.q(this);
        this.S = new dl3.s(this);
        this.T = 0;
        this.U = new java.lang.Object();
        this.V = new dl3.j(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "_release");
        linkedList.clear();
        synchronized (obj) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                k(str, (dl3.d0) this.f235309b.remove(str));
            }
            this.f235310c.clear();
            this.f235309b.clear();
            java.util.Iterator it6 = this.f235312e.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                k(str2, (dl3.d0) this.f235311d.remove(str2));
            }
            this.f235312e.clear();
            this.f235311d.clear();
            java.util.Iterator it7 = this.f235313f.iterator();
            while (it7.hasNext()) {
                java.util.LinkedList linkedList3 = (java.util.LinkedList) this.f235315h.remove((java.lang.String) it7.next());
                if (linkedList3 != null) {
                    linkedList3.clear();
                }
            }
        }
        this.f235313f.clear();
        this.f235314g.clear();
        this.f235315h.clear();
        this.f235316i.clear();
        this.f235317j.clear();
        this.f235320m.clear();
        this.f235321n.clear();
        this.f235318k.clear();
        com.tencent.mm.sdk.platformtools.u3.l(this.O);
        com.tencent.mm.sdk.platformtools.u3.l(this.P);
        this.f235324q = false;
        this.f235325r = false;
        synchronized (this.f235331x) {
            com.tencent.mm.sdk.platformtools.h5 h5Var = this.f235331x[0];
            if (h5Var != null) {
                ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).Di(h5Var);
                this.f235331x[0] = null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "removePhoneStatusWatcher");
        this.L = null;
        ol.c cVar = new ol.c(false);
        this.B = cVar;
        ol.b bVar = this.Q;
        ol.h hVar = cVar.f346079a;
        hVar.f346101j = bVar;
        hVar.f346103l = this.R;
        dl3.d dVar = new dl3.d();
        this.I = dVar;
        dVar.f327171e = this.S;
    }

    public static void b(dl3.i iVar, java.lang.String str) {
        if (iVar.G.remove(str)) {
            iVar.f235316i.remove(str);
        }
    }

    public static void c(dl3.i iVar) {
        if (iVar.r() <= 0) {
            synchronized (iVar.f235323p) {
                iVar.f235325r = false;
            }
            com.tencent.mm.sdk.platformtools.u3.l(iVar.O);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!iVar.f235325r || currentTimeMillis - iVar.f235327t >= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            synchronized (iVar.f235323p) {
                iVar.f235325r = true;
            }
            iVar.f235327t = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "stopAudioDelayIfPaused, delay_ms:%d", 600000);
            java.lang.Runnable runnable = iVar.O;
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 600000);
        }
    }

    public static dl3.i s() {
        if (W == null) {
            W = new dl3.i();
        }
        return W;
    }

    public void A(java.lang.String str) {
        if (t()) {
            n01.b bVar = (n01.b) this.f235316i.get(str);
            if (bVar != null && !android.text.TextUtils.isEmpty(bVar.f333838c) && this.B.e(bVar.f333838c)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "preloadMixCache cache done!");
                return;
            }
            synchronized (this.H) {
                if (!this.H.contains(str)) {
                    this.H.add(str);
                }
            }
            if (this.K == null || android.os.Looper.myQueue() == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "Looper.myQueue() is null!");
            } else {
                android.os.Looper.myQueue().addIdleHandler(new dl3.o(this, str));
            }
        }
    }

    public final void B() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "recycleStopPlayer");
        synchronized (this.f235323p) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f235312e);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                dl3.d0 d0Var = (dl3.d0) this.f235311d.remove(str);
                this.f235312e.remove(str);
                if (d0Var != null) {
                    if (d0Var.f235286i) {
                        O(str, d0Var);
                        k(str, d0Var);
                    } else if (!d0Var.v()) {
                        O(str, d0Var);
                        k(str, d0Var);
                    }
                }
            }
        }
    }

    public final void C() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "recyclePausedPlayer");
        synchronized (this.f235323p) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f235312e);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                dl3.d0 d0Var = (dl3.d0) this.f235311d.get(str);
                if (d0Var != null && d0Var.v()) {
                    z(str, d0Var);
                }
            }
        }
    }

    public final void D(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "recyclePlayer");
        java.util.HashMap hashMap = this.f235309b;
        int size = hashMap.size();
        java.util.HashMap hashMap2 = this.f235311d;
        int size2 = hashMap2.size();
        int r17 = r();
        if (size > 0 || size2 > 0 || r17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d, paused_player_count:%d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(r17));
        }
        if (size >= 10) {
            C();
        } else if (r17 >= 6) {
            C();
        } else if (size + r17 >= 8) {
            C();
        }
        java.lang.String m17 = m(str);
        int size3 = hashMap.size();
        int size4 = hashMap2.size();
        if (size3 > 0 || size4 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", java.lang.Integer.valueOf(size3), java.lang.Integer.valueOf(size4));
        }
        java.util.LinkedList linkedList = this.f235313f;
        if (size4 >= 50) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 != null && !str2.equalsIgnoreCase(m17)) {
                    E(str2);
                }
            }
        } else if (size4 + size3 >= 50) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.lang.String str3 = (java.lang.String) it6.next();
                if (str3 != null && !str3.equalsIgnoreCase(m17)) {
                    E(str3);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "condition is not satisfy to do recycleStopPlayerByAppId");
        }
        int size5 = hashMap2.size();
        if (size3 > 0 || size5 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", java.lang.Integer.valueOf(size3), java.lang.Integer.valueOf(size5));
        }
        if (size5 >= 50) {
            B();
        } else if (size3 + size5 >= 50) {
            B();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "condition is not satisfy to do recycleAllStopPlayer");
        }
    }

    public final void E(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "recycleStoppedPlayerByAppId");
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllStoppedAudioPlayersAndSaveStateByAppId, appId:%s", str);
        e(str);
        L();
        synchronized (this.f235323p) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f235315h.get(str);
            if (linkedList != null && linkedList.size() != 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (this.B.f(str2)) {
                        this.B.r(str2);
                    }
                    dl3.d0 d0Var = (dl3.d0) this.f235311d.remove(str2);
                    this.f235312e.remove(str2);
                    if (d0Var != null) {
                        O(str2, d0Var);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
                        if (d0Var.f235286i) {
                            k(str2, d0Var);
                        } else {
                            k(str2, d0Var);
                        }
                    }
                }
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
        }
    }

    public void F(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!this.f235324q || currentTimeMillis - this.f235326s >= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            this.f235326s = currentTimeMillis;
            synchronized (this.f235323p) {
                this.f235324q = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "releaseAudioDelayIfPaused, delay_ms:%d", java.lang.Integer.valueOf(i17));
            com.tencent.mm.sdk.platformtools.u3.l(this.P);
            com.tencent.mm.sdk.platformtools.u3.i(this.P, i17);
        }
    }

    public final void G() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "removeAndStopPlayingAudioPlayer");
        java.util.LinkedList linkedList = this.f235319l;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player audioId : %s", str);
            R(str);
            J();
        }
        java.util.LinkedList linkedList2 = this.f235321n;
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player for try audioId : %s", str2);
            R(str2);
            J();
        }
        linkedList.clear();
        linkedList2.clear();
    }

    public void H() {
        ol.c cVar = this.B;
        cVar.q(false);
        ol.h hVar = cVar.f346079a;
        hVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "setIsOutputMixBuffer:%b", bool);
        hVar.f346114w = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayer", "forceMixPlay:%b", bool);
        cVar.f346085g = false;
        this.L = null;
        for (dl3.d0 d0Var : this.f235309b.values()) {
            if (d0Var != null) {
                d0Var.f235301x = null;
            }
        }
    }

    public final void I(n01.b bVar, boolean z17, boolean z18) {
        long j17;
        el3.i iVar = (el3.i) sl3.b.b(el3.i.class);
        this.f235328u = iVar;
        if (iVar != null) {
            java.lang.String str = bVar.f333836a;
            java.lang.String str2 = bVar.f333837b;
            el3.h hVar = (el3.h) iVar;
            hVar.getClass();
            p95.a.a(new el3.c(hVar, str, str2, z18));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        bVar.f333850o = currentTimeMillis;
        if (z17) {
            j17 = bVar.f333854s;
            bVar.f333851p = bVar.f333853r;
        } else {
            j17 = bVar.f333856u;
            bVar.f333851p = bVar.f333855t;
        }
        if (j17 <= 0 || currentTimeMillis <= j17) {
            bVar.f333852q = 0L;
        } else {
            bVar.f333852q = currentTimeMillis - j17;
        }
    }

    public final void J() {
        el3.i iVar = (el3.i) sl3.b.b(el3.i.class);
        this.f235328u = iVar;
        if (iVar != null) {
            ((el3.h) iVar).getClass();
            synchronized (el3.h.f253996i) {
                el3.h.f253990c++;
            }
        }
    }

    public final void K(n01.b bVar) {
        el3.i iVar = (el3.i) sl3.b.b(el3.i.class);
        this.f235328u = iVar;
        if (iVar != null) {
            java.lang.String str = bVar.f333836a;
            java.lang.String str2 = bVar.f333837b;
            el3.h hVar = (el3.h) iVar;
            hVar.getClass();
            p95.a.a(new el3.b(hVar, str, str2));
        }
    }

    public void L() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "resetSpeaker");
        if (!this.D && ((android.media.AudioManager) this.E.b()).getMode() == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "set speaker on and reset mode to MODE_NORMAL");
            ((android.media.AudioManager) this.E.b()).setSpeakerphoneOn(true);
            ((android.media.AudioManager) this.E.b()).setMode(0);
        } else if (!this.D) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "set speaker on");
            ((android.media.AudioManager) this.E.b()).setSpeakerphoneOn(true);
        }
        this.D = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0045, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean M(java.lang.String r11, n01.b r12) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl3.i.M(java.lang.String, n01.b):boolean");
    }

    public final void N(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "saveCreateId, appId:%s, audioId:%s", str, str2);
        if (!this.f235313f.contains(str)) {
            this.f235313f.add(str);
        }
        if (!this.f235308a.contains(str2)) {
            this.f235308a.add(str2);
        }
        synchronized (this.f235323p) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f235315h.get(str);
            if (linkedList == null) {
                linkedList = new java.util.LinkedList();
            }
            if (!linkedList.contains(str2)) {
                linkedList.add(str2);
            }
            this.f235315h.put(str, linkedList);
        }
    }

    public final void O(java.lang.String str, dl3.d0 d0Var) {
        this.f235317j.put(str, d0Var.s());
    }

    public void P(dl3.b bVar) {
        this.L = bVar;
        dl3.a aVar = new dl3.a(1, "0");
        bVar.c(aVar);
        this.M = aVar;
        ol.c cVar = this.B;
        cVar.q(true);
        ol.h hVar = cVar.f346079a;
        hVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "setIsOutputMixBuffer:%b", bool);
        hVar.f346114w = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayer", "forceMixPlay:%b", bool);
        cVar.f346085g = true;
        synchronized (this.f235323p) {
            for (dl3.d0 d0Var : this.f235309b.values()) {
                if (d0Var != null) {
                    d0Var.f235301x = bVar;
                }
            }
        }
    }

    public final boolean Q(dl3.d0 d0Var) {
        if (d0Var == null) {
            return true;
        }
        return !(d0Var.i() || d0Var.v() || d0Var.x() || d0Var.w() || d0Var.g());
    }

    public boolean R(java.lang.String str) {
        dl3.d0 o17 = o(str);
        if (o17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "stopAudio, player is null");
            ol.c cVar = this.B;
            if (!cVar.f(str)) {
                return false;
            }
            cVar.r(str);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "stopAudio, audioId:%s", str);
        o17.stopPlay();
        n01.b bVar = (n01.b) this.f235316i.get(str);
        if (bVar != null) {
            bVar.f333839d = 0;
            bVar.f333842g = true;
        }
        O(str, o17);
        w(str, o17);
        return true;
    }

    public final void S(java.lang.String str, dl3.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "unmarkPlayer, unmark player by audioId:%s", str);
        synchronized (this.f235323p) {
            if (this.f235312e.contains(str)) {
                this.f235311d.remove(str);
                this.f235312e.remove(str);
            }
            if (this.f235310c.contains(str)) {
                this.f235310c.remove(str);
                this.f235309b.remove(str);
            }
        }
    }

    public final void T(java.lang.String str) {
        n01.b bVar = (n01.b) this.f235316i.get(str);
        if (bVar == null || android.text.TextUtils.isEmpty(bVar.f333837b)) {
            return;
        }
        if ((bVar.f333837b.startsWith("http://") || bVar.f333837b.startsWith("https://")) && gl3.j.a(bVar.f333837b)) {
            bVar.f333838c = xl3.c.d(bVar.f333837b);
            java.lang.String str2 = bVar.f333837b;
            java.util.HashMap hashMap = this.f235333z;
            if (hashMap.containsKey(str2)) {
                return;
            }
            hashMap.put(bVar.f333837b, bVar.f333838c);
        }
    }

    public final void U(n01.b bVar) {
        if (android.text.TextUtils.isEmpty(bVar.f333838c)) {
            java.lang.String str = bVar.f333837b;
            java.util.HashMap hashMap = this.f235333z;
            if (hashMap.containsKey(str)) {
                bVar.f333838c = (java.lang.String) hashMap.get(bVar.f333837b);
            }
        }
    }

    public void a() {
        fl3.a aVar = this.f235330w;
        if (aVar.f263927b) {
            aVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
            bm5.x0 x0Var = aVar.f263926a;
            if (x0Var.b() == null) {
                return;
            }
            ((android.media.AudioManager) x0Var.b()).abandonAudioFocus(aVar.f263928c);
            aVar.f263927b = false;
        }
    }

    public final boolean d(java.lang.String str) {
        n01.b bVar;
        int i17;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        synchronized (this.f235323p) {
            int size = this.f235309b.size();
            boolean z17 = false;
            if (size < 10) {
                this.f235319l.clear();
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "playerCount:%d is not need to remove", java.lang.Integer.valueOf(size));
                return false;
            }
            java.util.Iterator it = this.f235310c.iterator();
            while (it.hasNext()) {
                n01.b bVar2 = (n01.b) this.f235316i.get((java.lang.String) it.next());
                if (bVar2 != null && (str2 = bVar2.f333837b) != null) {
                    if (hashMap.containsKey(str2)) {
                        hashMap.put(bVar2.f333837b, java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(bVar2.f333837b)).intValue() + 1));
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap2.get(bVar2.f333837b);
                        if (!arrayList2.contains(bVar2.f333836a)) {
                            arrayList2.add(bVar2.f333836a);
                        }
                        hashMap2.put(bVar2.f333837b, arrayList2);
                    } else {
                        hashMap.put(bVar2.f333837b, 1);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(bVar2.f333836a);
                        hashMap2.put(bVar2.f333837b, arrayList3);
                    }
                    if (!arrayList.contains(bVar2.f333837b)) {
                        arrayList.add(bVar2.f333837b);
                    }
                }
            }
            java.lang.String str3 = "";
            int i18 = gl3.h.f272839i;
            if (i18 == 0) {
                if (gl3.e.d()) {
                    ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
                    i17 = com.tencent.mm.plugin.music.model.cache.ipc.n.f(3);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                    i17 = 3;
                }
                gl3.h.f272839i = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheHelper", "sRemovePlayingAudioPlayerGroupCount:%d", java.lang.Integer.valueOf(i17));
                if (gl3.h.f272839i == 0) {
                    gl3.h.f272839i = 3;
                }
                i18 = gl3.h.f272839i;
            }
            java.util.Iterator it6 = arrayList.iterator();
            boolean z18 = false;
            int i19 = i18;
            while (it6.hasNext()) {
                java.lang.String str4 = (java.lang.String) it6.next();
                int intValue = ((java.lang.Integer) hashMap.get(str4)).intValue();
                if (intValue >= i18) {
                    if (i19 < intValue) {
                        str3 = str4;
                        i19 = intValue;
                    }
                    if (android.text.TextUtils.isEmpty(str3)) {
                        z18 = true;
                        str3 = str4;
                    } else {
                        z18 = true;
                    }
                }
            }
            if (!z18 || (bVar = (n01.b) this.f235316i.get(str)) == null || str3 == null || !str3.equalsIgnoreCase(bVar.f333837b)) {
                z17 = z18;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "srcUrl is same, not remove and don't play again");
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "need to remove player");
                java.util.ArrayList arrayList4 = (java.util.ArrayList) hashMap2.get(str3);
                if (arrayList4 != null && arrayList4.size() > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        n01.b bVar3 = (n01.b) this.f235316i.get((java.lang.String) it7.next());
                        if (bVar3 != null) {
                            linkedList.add(bVar3);
                        }
                    }
                    java.util.Collections.sort(linkedList, new dl3.u(this));
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.Iterator it8 = linkedList.iterator();
                    while (it8.hasNext()) {
                        linkedList2.add(((n01.b) it8.next()).f333836a);
                    }
                    int i27 = size - 10;
                    if (i27 > 0 && linkedList2.size() > i27) {
                        int i28 = i27 + 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "removeCount should be %d", java.lang.Integer.valueOf(i28));
                        int size2 = linkedList2.size() - i28;
                        this.f235319l.addAll(linkedList2.subList(size2 >= 0 ? size2 : 1, linkedList2.size()));
                    } else if (i27 <= 0 || linkedList2.size() >= i27) {
                        this.f235319l.add((java.lang.String) linkedList2.get(linkedList2.size() - 1));
                    } else {
                        this.f235319l.addAll(linkedList2.subList(1, linkedList2.size()));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player count : %d", java.lang.Integer.valueOf(this.f235319l.size()));
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "not need to remove player");
                this.f235319l.clear();
            }
            return z17;
        }
    }

    public final void e(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(this.f235329v.f333835c) && !str.equalsIgnoreCase(this.f235329v.f333835c)) {
            n01.a aVar = this.f235329v;
            aVar.f333833a = true;
            aVar.f333834b = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "reset AudioContextParam, appId:%s", str);
        }
        n01.a aVar2 = this.f235329v;
        aVar2.f333835c = str;
        this.C = aVar2.f333834b;
    }

    public void f() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f235329v.f333833a);
        fl3.a aVar = this.f235330w;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther:%b, focus:%b", valueOf, java.lang.Boolean.valueOf(aVar.f263927b));
        boolean z17 = this.f235329v.f333833a;
        if (z17 || aVar.f263927b) {
            if (z17 && aVar.f263927b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "abandonFocus()");
                a();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus()");
        if (aVar.f263927b) {
            return;
        }
        bm5.x0 x0Var = aVar.f263926a;
        boolean z18 = false;
        if (x0Var.b() != null) {
            int requestAudioFocus = ((android.media.AudioManager) x0Var.b()).requestAudioFocus(aVar.f263928c, 3, 2);
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(requestAudioFocus == 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "request audio focus %b", objArr);
            if (requestAudioFocus == 1) {
                aVar.f263927b = true;
            }
            if (requestAudioFocus == 1) {
                z18 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus focus:%b", java.lang.Boolean.valueOf(z18));
    }

    public final void g(n01.b bVar) {
        if (bVar == null || android.text.TextUtils.isEmpty(bVar.f333837b) || !bVar.f333837b.startsWith("http")) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(bVar.f333838c) && this.B.e(bVar.f333838c)) {
            return;
        }
        if (this.f235307J == null) {
            this.f235307J = new android.os.Handler(android.os.Looper.myLooper());
        }
        gl3.h.f(bVar.f333837b);
        boolean a17 = gl3.j.a(bVar.f333837b);
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "checkNeedDownloadSrc audioId:%s, cacheValid:%b, checkCount:%d", bVar.f333836a, java.lang.Boolean.valueOf(a17), java.lang.Integer.valueOf(this.T));
        this.T++;
        if (a17) {
            T(bVar.f333836a);
            U(bVar);
            A(bVar.f333836a);
            return;
        }
        ml.b bVar2 = this.I;
        bVar2.getClass();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioDownloadMgr", "startDownload", null);
        if (android.text.TextUtils.isEmpty(bVar.f333837b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioDownloadMgr", "srcUrl is null", null);
            return;
        }
        if (bVar2.f327169c.contains(bVar.f333837b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioDownloadMgr", "srcUrl:%s is download finish", bVar.f333837b);
            return;
        }
        if (bVar2.f327167a.containsKey(bVar.f333837b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioDownloadMgr", "task is exit!", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioDownloadMgr", "download src:%s, audioId:%s", bVar.f333837b, bVar.f333836a);
        ml.d dVar = new ml.d(new ml.c(new ml.a(bVar2)), bVar.f333836a, 5);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.lang.String str = bVar.f333858w;
        if (str != null) {
            concurrentHashMap.put(bVar.f333837b, str);
        }
        dVar.f327178i = new dl3.e(new vl3.a(concurrentHashMap), bVar);
        dVar.f319119f = java.lang.System.currentTimeMillis();
        if (ml.e.f327179e == null) {
            synchronized (ml.e.class) {
                if (ml.e.f327179e == null) {
                    ml.e.f327179e = new ml.e();
                }
            }
        }
        ml.e eVar = ml.e.f327179e;
        synchronized (eVar.f327180a) {
            dVar.f327177h = false;
            eVar.f327182c.add(dVar);
            int i18 = eVar.f327183d;
            if (eVar.f327182c.size() > i18) {
                eVar.a(i18 + 2);
            }
        }
        eVar.f327181b.execute(dVar);
        synchronized (bVar2.f327170d) {
            bVar2.f327167a.put(bVar.f333837b, dVar);
            bVar2.f327168b.add(bVar.f333837b);
        }
    }

    public final dl3.d0 h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "createOrReusePlayer");
        synchronized (this.f235323p) {
            try {
                if (this.f235311d.size() == 0) {
                    return new dl3.d0();
                }
                java.lang.String str = "";
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator it = this.f235312e.iterator();
                dl3.d0 d0Var = null;
                long j17 = 0;
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    dl3.d0 d0Var2 = (dl3.d0) this.f235311d.get(str2);
                    if (d0Var2 != null) {
                        if (!d0Var2.f235286i) {
                            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = d0Var2.f235282e;
                            if (!(commonPlayer != null && commonPlayer.getPlayerState() == 7)) {
                                com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer2 = d0Var2.f235282e;
                                if (!(commonPlayer2 != null && commonPlayer2.getPlayerState() == 6)) {
                                    com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer3 = d0Var2.f235282e;
                                    if (commonPlayer3 != null && commonPlayer3.getPlayerState() == 9) {
                                    }
                                }
                            }
                        }
                        if (j17 == 0 || d0Var2.f235299v < j17) {
                            j17 = d0Var2.f235299v;
                            str = str2;
                            d0Var = d0Var2;
                        }
                    }
                }
                if (d0Var == null || currentTimeMillis - j17 <= 500) {
                    return new dl3.d0();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "player is be reuse to play again with other audio");
                S(str, d0Var);
                return d0Var;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public final boolean i(java.lang.String str) {
        dl3.d0 o17 = o(str);
        if (o17 == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAndRemovePlayer, audioId:%s", str);
        k(str, o17);
        synchronized (this.f235323p) {
            this.f235309b.remove(str);
            this.f235310c.remove(str);
            this.f235311d.remove(str);
            this.f235312e.remove(str);
        }
        return true;
    }

    public boolean j(java.lang.String str) {
        boolean contains;
        boolean contains2;
        synchronized (this.H) {
            contains = this.H.contains(str);
        }
        if (!contains) {
            n01.b bVar = (n01.b) this.f235316i.get(str);
            if (bVar != null) {
                ol.c cVar = this.B;
                java.lang.String str2 = bVar.f333838c;
                ll.b bVar2 = cVar.f346080b;
                synchronized (bVar2.f319076f) {
                    contains2 = ((java.util.ArrayList) bVar2.f319074d).contains(str2);
                }
                if (contains2) {
                    contains = true;
                }
            }
            contains = false;
        }
        if (!contains) {
            if (this.B.f(str) && (this.B.g(str) || this.B.h(str) || this.B.i(str) || this.B.j(str) || this.B.k(str))) {
                this.B.r(str);
            }
            this.B.n(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAudio, audioId:%s", str);
        dl3.d0 o17 = o(str);
        if (o17 != null) {
            k(str, o17);
            synchronized (this.f235323p) {
                this.f235309b.remove(str);
                this.f235310c.remove(str);
                this.f235311d.remove(str);
                this.f235312e.remove(str);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "destroyAudio, player is null");
        }
        this.f235308a.remove(str);
        synchronized (this.f235323p) {
            java.util.Iterator it = this.f235313f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str3 = (java.lang.String) it.next();
                java.util.LinkedList linkedList = (java.util.LinkedList) this.f235315h.get(str3);
                if (linkedList != null && linkedList.contains(str)) {
                    linkedList.remove(str);
                    if (linkedList.size() == 0) {
                        this.f235315h.remove(str3);
                        this.f235313f.remove(str3);
                        this.f235314g.remove(str3);
                    }
                }
            }
        }
        this.f235317j.remove(str);
        if (!contains) {
            this.f235316i.remove(str);
        } else if (!this.G.contains(str)) {
            this.G.add(str);
        }
        return true;
    }

    public final void k(java.lang.String str, dl3.d0 d0Var) {
        if (d0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "destroyPlayer player is null for audioId:%s", str);
            return;
        }
        if (d0Var.i() || d0Var.g() || d0Var.x() || d0Var.w() || d0Var.v()) {
            d0Var.stopPlay();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "release");
        d0Var.f235348b = null;
        d0Var.f235301x = null;
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = d0Var.f235282e;
        if (commonPlayer != null) {
            commonPlayer.release();
            d0Var.f235282e = null;
        }
        dl3.i s17 = s();
        synchronized (s17.f235332y) {
            if (s17.f235332y.contains(d0Var)) {
                s17.f235332y.remove(d0Var);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyPlayer stop and release player by audioId:%s", str);
    }

    public void l() {
        if (this.f235329v.f333833a && !this.D) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther is true, useSpeakerOn is false, return");
            L();
            return;
        }
        if (this.f235329v.f333833a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther is true, return");
            return;
        }
        if (this.C && ((android.media.AudioManager) this.E.b()).getMode() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "speaker is on and reset speaker");
            L();
            return;
        }
        if (this.C) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "speaker is on, do nothing");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.l5.Bi()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when phone calling");
            return;
        }
        if (((android.media.AudioManager) this.E.b()).isBluetoothScoOn() || ((android.media.AudioManager) this.E.b()).isBluetoothA2dpOn()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when isBluetoothScoOn:%b , isBluetoothA2dpOn:%b", java.lang.Boolean.valueOf(((android.media.AudioManager) this.E.b()).isBluetoothScoOn()), java.lang.Boolean.valueOf(((android.media.AudioManager) this.E.b()).isBluetoothA2dpOn()));
            return;
        }
        if (((android.media.AudioManager) this.E.b()).isWiredHeadsetOn()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when wired headset on");
            return;
        }
        if (!this.D && ((android.media.AudioManager) this.E.b()).getMode() == 3 && !((android.media.AudioManager) this.E.b()).isSpeakerphoneOn()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when wired headset on");
            return;
        }
        this.D = false;
        ((android.media.AudioManager) this.E.b()).setSpeakerphoneOn(false);
        ((android.media.AudioManager) this.E.b()).setMode(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "set speaker off and change mode to MODE_IN_COMMUNICATION");
    }

    public final java.lang.String m(java.lang.String str) {
        java.util.Iterator it = this.f235313f.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f235315h.get(str2);
            if (linkedList != null && linkedList.contains(str)) {
                return str2;
            }
        }
        return "";
    }

    public n01.b n(java.lang.String str) {
        java.util.HashMap hashMap = this.f235316i;
        if (hashMap.containsKey(str)) {
            return (n01.b) hashMap.get(str);
        }
        return null;
    }

    public final dl3.d0 o(java.lang.String str) {
        java.util.HashMap hashMap = this.f235309b;
        if (hashMap.containsKey(str)) {
            return (dl3.d0) hashMap.get(str);
        }
        java.util.HashMap hashMap2 = this.f235311d;
        if (hashMap2.containsKey(str)) {
            return (dl3.d0) hashMap2.get(str);
        }
        return null;
    }

    public int p(java.lang.String str) {
        int size;
        int r17 = r();
        synchronized (this.f235323p) {
            int size2 = this.f235308a.size();
            size = this.f235309b.size();
            int size3 = this.f235311d.size();
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f235315h.get(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "getAudioPlayerCount, count:%d, player_count:%d, recycled_player_count:%d, audioIdsCount:%d, pause_count:%d", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size3), java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size()), java.lang.Integer.valueOf(r17));
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n01.d q(java.lang.String r13) {
        /*
            r12 = this;
            dl3.d0 r0 = r12.o(r13)
            if (r0 == 0) goto Lb
            n01.d r13 = r0.s()
            return r13
        Lb:
            ol.c r0 = r12.B
            boolean r0 = r0.f(r13)
            if (r0 == 0) goto Lb6
            ol.c r0 = r12.B
            ol.h r0 = r0.f346079a
            java.util.HashMap r1 = r0.f346108q
            boolean r1 = r1.containsKey(r13)
            if (r1 == 0) goto L28
            java.util.HashMap r1 = r0.f346108q
            java.lang.Object r1 = r1.get(r13)
            n01.d r1 = (n01.d) r1
            goto L32
        L28:
            n01.d r1 = new n01.d
            r1.<init>()
            java.util.HashMap r2 = r0.f346108q
            r2.put(r13, r1)
        L32:
            int r2 = r0.d(r13)
            int r3 = r0.f(r13)
            boolean r4 = r0.j(r13)
            java.util.HashMap r5 = r0.f346104m
            boolean r5 = r5.containsKey(r13)
            r6 = 100
            r7 = 0
            if (r5 == 0) goto L6c
            java.util.HashMap r5 = r0.f346104m
            java.lang.Object r5 = r5.get(r13)
            n01.b r5 = (n01.b) r5
            java.lang.String r5 = r5.f333838c
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L5a
            goto L6c
        L5a:
            il.j r8 = il.j.a()
            hl.d r5 = r8.b(r5)
            long r8 = r5.f282021d
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L6c
            r5 = r6
            goto L6d
        L6c:
            r5 = r7
        L6d:
            if (r5 >= 0) goto L70
            r5 = r7
        L70:
            r1.f333863b = r3
            r1.f333862a = r2
            r3 = 1
            r4 = r4 ^ r3
            r1.f333864c = r4
            java.util.HashMap r4 = r0.f346105n
            boolean r4 = r4.containsKey(r13)
            if (r4 == 0) goto L8f
            java.util.HashMap r4 = r0.f346105n
            java.lang.Object r4 = r4.get(r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L8f
            r7 = r3
        L8f:
            r1.f333865d = r7
            int r5 = r5 * r2
            int r5 = r5 / r6
            r1.f333866e = r5
            java.util.HashMap r2 = r0.f346104m
            boolean r2 = r2.containsKey(r13)
            if (r2 == 0) goto Lb2
            java.util.HashMap r0 = r0.f346104m
            java.lang.Object r0 = r0.get(r13)
            n01.b r0 = (n01.b) r0
            int r2 = r0.f333840e
            r1.f333868g = r2
            java.lang.String r2 = r0.f333837b
            r1.f333867f = r2
            java.lang.String r0 = r0.f333857v
            r1.f333869h = r0
            goto Lb3
        Lb2:
            r1 = 0
        Lb3:
            if (r1 == 0) goto Lb6
            return r1
        Lb6:
            java.util.HashMap r0 = r12.f235317j
            java.lang.Object r13 = r0.get(r13)
            n01.d r13 = (n01.d) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dl3.i.q(java.lang.String):n01.d");
    }

    public final int r() {
        int i17;
        boolean v17;
        synchronized (this.f235323p) {
            java.util.Iterator it = this.f235312e.iterator();
            i17 = 0;
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                dl3.d0 o17 = o(str);
                if (o17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "isPausedPlayer, player is null");
                    n01.d q17 = q(str);
                    v17 = q17 != null ? q17.f333864c : false;
                } else {
                    v17 = o17.v();
                }
                if (v17) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public final boolean t() {
        java.lang.System.currentTimeMillis();
        n01.a aVar = this.f235329v;
        return aVar.f333834b || aVar.f333833a;
    }

    public final boolean u(n01.b bVar) {
        return (bVar == null || !bVar.f333837b.startsWith("wxblob://") || bVar.B == null) ? false : true;
    }

    public final void v(java.lang.String str, dl3.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "markPlayer, mark player by audioId:%s", str);
        synchronized (this.f235323p) {
            if (this.f235312e.contains(str)) {
                this.f235311d.remove(str);
                this.f235312e.remove(str);
            }
            if (!this.f235310c.contains(str)) {
                this.f235310c.add(str);
                this.f235309b.put(str, d0Var);
            }
        }
    }

    public final void w(java.lang.String str, dl3.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "markPlayerRecycled, mark player recycled by audioId:%s", str);
        synchronized (this.f235323p) {
            if (this.f235310c.contains(str)) {
                this.f235309b.remove(str);
                this.f235310c.remove(str);
            }
            if (!this.f235312e.contains(str)) {
                this.f235312e.add(str);
                this.f235311d.put(str, d0Var);
            }
        }
    }

    public void x(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onErrorEvent with errCode:%d, audioId:%s", java.lang.Integer.valueOf(i17), str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "audioId is empty");
            str = dl3.h.a();
        }
        com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
        am.g0 g0Var = audioPlayerEvent.f53990g;
        g0Var.f6716a = 4;
        g0Var.f6719d = "error";
        g0Var.f6721f = com.tencent.mm.plugin.music.player.base.m.b(i17);
        g0Var.f6722g = com.tencent.mm.plugin.music.player.base.m.a(i17);
        g0Var.f6718c = str;
        g0Var.f6720e = m(str);
        audioPlayerEvent.b(android.os.Looper.getMainLooper());
    }

    public void y(java.lang.String str) {
        long size;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "pauseAllAudioPlayers, appId:%s", str);
        this.B.l();
        ((ku5.t0) ku5.t0.f312615d).g(new dl3.k(this));
        a();
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f235315h.get(str);
        ol.c cVar = this.B;
        long j17 = cVar.f346079a.f346100i.f338132u;
        long c17 = cVar.c();
        this.B.getClass();
        il.i a17 = il.i.a();
        synchronized (a17) {
            size = a17.f292000a.size() * 3536;
        }
        long j18 = c17 + size;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "mixAverageTime:%d, loadedCacheBufferSize:%d, remainingBufferSize:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c17), java.lang.Long.valueOf(size));
        this.f235328u = (el3.i) sl3.b.b(el3.i.class);
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
            return;
        }
        if (this.f235309b.isEmpty() && this.f235311d.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
            el3.i iVar = this.f235328u;
            if (iVar != null) {
                p95.a.a(new el3.e((el3.h) iVar, str, j17, j18, c17));
                return;
            }
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        synchronized (this.f235323p) {
            linkedList2.addAll(linkedList);
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            dl3.d0 d0Var = (dl3.d0) this.f235311d.get(str2);
            if (d0Var != null) {
                z(str2, d0Var);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "playing player count:%d", java.lang.Integer.valueOf(this.f235309b.size()));
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str3 = (java.lang.String) it6.next();
            dl3.d0 d0Var2 = (dl3.d0) this.f235309b.get(str3);
            if (d0Var2 != null) {
                z(str3, d0Var2);
                w(str3, d0Var2);
            }
        }
        el3.i iVar2 = this.f235328u;
        if (iVar2 != null) {
            p95.a.a(new el3.e((el3.h) iVar2, str, j17, j18, c17));
        }
    }

    public final void z(java.lang.String str, dl3.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "pausePlayerOnBackground, pause player on background by audioId:%s", str);
        n01.b bVar = (n01.b) this.f235316i.get(str);
        if (bVar != null && d0Var.i() && d0Var.g()) {
            bVar.f333842g = true;
            bVar.f333839d = d0Var.a();
        } else if (bVar != null && d0Var.g()) {
            bVar.f333842g = true;
            bVar.f333839d = d0Var.a();
        } else if (bVar != null) {
            bVar.f333842g = true;
            bVar.f333839d = 0;
        }
        O(str, d0Var);
        n01.d q17 = q(str);
        if (q17 != null && d0Var.i()) {
            q17.f333864c = true;
        }
        if (d0Var.i() || d0Var.g() || d0Var.x() || d0Var.w() || d0Var.v()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "pauseOnBackGround");
            d0Var.f235286i = true;
            d0Var.q();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "setPauseOnBackground");
            d0Var.f235286i = true;
            d0Var.f235285h = true;
        }
    }
}
