package ol;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioTrack f346092a;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Thread f346099h;

    /* renamed from: i, reason: collision with root package name */
    public nl.b f346100i;

    /* renamed from: j, reason: collision with root package name */
    public ol.b f346101j;

    /* renamed from: k, reason: collision with root package name */
    public ll.q f346102k;

    /* renamed from: l, reason: collision with root package name */
    public ol.k f346103l;

    /* renamed from: t, reason: collision with root package name */
    public ll.b f346111t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f346112u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.Handler f346113v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f346114w;

    /* renamed from: x, reason: collision with root package name */
    public int f346115x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f346116y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f346117z;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f346093b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f346094c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f346095d = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f346096e = new java.util.ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f346097f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f346098g = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public volatile java.util.HashMap f346104m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public volatile java.util.HashMap f346105n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public volatile java.util.HashMap f346106o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public volatile java.util.HashMap f346107p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public volatile java.util.HashMap f346108q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public volatile java.util.HashMap f346109r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f346110s = new java.util.ArrayList();

    public h(boolean z17) {
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        this.f346112u = new byte[2];
        this.f346114w = false;
        this.f346115x = 0;
        this.f346116y = new ol.d(this);
        this.f346117z = new java.util.ArrayList();
        nl.b bVar = new nl.b(this);
        this.f346100i = bVar;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "onInit", null);
        if (bVar.f338119h == null) {
            java.lang.Thread thread = new java.lang.Thread(bVar.f338135x, "audio_mix_controller");
            bVar.f338119h = thread;
            thread.start();
        }
        bVar.f338122k.clear();
        nl.c cVar = new nl.c();
        bVar.f338112a = cVar;
        if (cVar.f338136a == null) {
            cVar.f338136a = new nl.h();
        }
        if (this.f346102k == null) {
            this.f346102k = new ol.f(this);
        }
        if (z17) {
            i();
        }
        this.f346113v = new android.os.Handler(android.os.Looper.myLooper());
    }

    public static void a(ol.h hVar) {
        boolean z17;
        synchronized (hVar) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "createAudioTrack", null);
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(44100, 12, 2);
            int i18 = minBufferSize / 3536;
            z17 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "miniBufferSize:%d, channels:%d, sampleRate:%d", java.lang.Integer.valueOf(minBufferSize), 2, 44100);
            if (hVar.f346092a == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "audioTrack is null, new AudioTrack", null);
                try {
                    hVar.f346092a = new android.media.AudioTrack(3, 44100, 12, 2, minBufferSize, 1);
                } catch (java.lang.IllegalArgumentException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e17, "AudioTrack create", new java.lang.Object[0]);
                }
            }
            android.media.AudioTrack audioTrack = hVar.f346092a;
            if (audioTrack == null || audioTrack.getState() != 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "audio track not initialized", null);
                android.media.AudioTrack audioTrack2 = hVar.f346092a;
                if (audioTrack2 != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "AudioTrack getState", java.lang.Integer.valueOf(audioTrack2.getState()));
                    try {
                        hVar.f346092a.release();
                        hVar.f346092a = null;
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e18, "AudioTrack release", new java.lang.Object[0]);
                    }
                }
            } else {
                z17 = true;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "create AudioTrack success", null);
            hVar.f346092a.play();
        } else {
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "onError, errCode:%d", 710);
        }
    }

    public static void b(ol.h hVar, hl.b bVar) {
        hl.c cVar;
        if (hVar.f346101j != null && hVar.f346114w) {
            if (il.g.f291988d == null) {
                synchronized (il.g.class) {
                    if (il.g.f291988d == null) {
                        il.g.f291988d = new il.g();
                    }
                }
            }
            il.g gVar = il.g.f291988d;
            synchronized (gVar) {
                if (gVar.f291989a.size() > 0) {
                    cVar = (hl.c) gVar.f291989a.remove(gVar.f291989a.size() - 1);
                } else if (gVar.f291991c >= gVar.f291990b) {
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(gVar.f291991c)};
                    int i17 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioOutputMixBufferPool", "size >= FIX_SIZE, size:%d", objArr);
                    cVar = null;
                } else {
                    gVar.f291991c++;
                    cVar = new hl.c();
                }
            }
            if (cVar == null) {
                return;
            }
            byte[] bArr = cVar.f282016c;
            if (bArr == null || bArr.length < bVar.f282016c.length) {
                cVar.f282016c = new byte[bVar.f282016c.length];
            }
            byte[] bArr2 = bVar.f282016c;
            java.lang.System.arraycopy(bArr2, 0, cVar.f282016c, 0, bArr2.length);
            hVar.f346113v.post(new ol.g(hVar, cVar));
        }
    }

    public n01.b c(java.lang.String str) {
        if (this.f346104m.containsKey(str)) {
            return (n01.b) this.f346104m.get(str);
        }
        return null;
    }

    public int d(java.lang.String str) {
        n01.b bVar;
        if (!this.f346104m.containsKey(str) || (bVar = (n01.b) this.f346104m.get(str)) == null) {
            return 0;
        }
        java.lang.String str2 = bVar.f333838c;
        if (android.text.TextUtils.isEmpty(str2)) {
            return 0;
        }
        return (int) il.j.a().b(str2).f282021d;
    }

    public int e() {
        int i17;
        synchronized (this.f346098g) {
            java.util.Set keySet = this.f346107p.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(keySet);
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                ol.i iVar = (ol.i) this.f346107p.get((java.lang.String) it.next());
                if (iVar != null && (iVar.a(0) || iVar.a(1) || iVar.a(2))) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public int f(java.lang.String str) {
        n01.b bVar;
        int i17;
        ll.p pVar;
        if (!this.f346104m.containsKey(str) || (bVar = (n01.b) this.f346104m.get(str)) == null) {
            return 0;
        }
        if (bVar.f333861z) {
            i17 = (int) this.f346100i.b(str);
        } else {
            ll.c cVar = (ll.c) this.f346111t.f319072b.get(str);
            long j17 = -1;
            if (cVar != null && (pVar = cVar.f319079i) != null) {
                j17 = pVar.getCurrentPosition();
            }
            i17 = (int) j17;
        }
        if (i17 != -1) {
            bVar.f333841f = i17;
        } else {
            i17 = bVar.f333841f;
        }
        if (i17 == -1) {
            return 0;
        }
        int d17 = d(str);
        return (d17 <= 0 || i17 <= d17) ? i17 : d17;
    }

    public int g() {
        int i17;
        synchronized (this.f346098g) {
            java.util.Set keySet = this.f346107p.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(keySet);
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                ol.i iVar = (ol.i) this.f346107p.get((java.lang.String) it.next());
                if (iVar != null && (iVar.a(0) || iVar.a(1))) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public int h(java.lang.String str) {
        ol.i iVar;
        java.lang.Object obj;
        if (!this.f346107p.containsKey(str) || (iVar = (ol.i) this.f346107p.get(str)) == null) {
            return -1;
        }
        synchronized (iVar) {
            obj = iVar.f346118a;
        }
        return ((java.lang.Integer) obj).intValue();
    }

    public void i() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f346093b;
        if (atomicBoolean.get()) {
            return;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "initThread", null);
        atomicBoolean.set(true);
        this.f346095d.set(false);
        this.f346094c.set(false);
        n();
    }

    public boolean j(java.lang.String str) {
        if (this.f346107p.containsKey(str)) {
            ol.i iVar = (ol.i) this.f346107p.get(str);
            if (iVar != null && iVar.a(0) && !this.f346100i.f338115d.get()) {
                return true;
            }
            if (!this.f346100i.f338115d.get() && !this.f346100i.d(str) && this.f346111t.b(str)) {
                return true;
            }
        }
        return false;
    }

    public void k(hl.b bVar) {
        boolean z17;
        java.util.Iterator it = bVar.f282017d.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            synchronized (this.f346098g) {
                if (!android.text.TextUtils.isEmpty(str) && (!this.f346109r.containsKey(str) || !((java.lang.Boolean) this.f346109r.get(str)).booleanValue())) {
                    if (this.f346109r.containsKey(str)) {
                        this.f346109r.put(str, java.lang.Boolean.TRUE);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        this.f346113v.post(new ol.e(this, str));
                    }
                }
            }
        }
    }

    public void l(int i17, java.lang.String str) {
        ll.d dVar;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f346100i.f338124m.get(str);
        m(i17, str, (weakReference == null || weakReference.get() == null || (dVar = (ll.d) weakReference.get()) == null) ? "" : dVar.f319086g);
    }

    public void m(int i17, java.lang.String str, java.lang.String str2) {
        n01.b bVar = (n01.b) this.f346104m.get(str);
        if (bVar == null) {
            return;
        }
        com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
        am.g0 g0Var = audioPlayerEvent.f53990g;
        g0Var.f6718c = str;
        g0Var.f6716a = i17;
        g0Var.f6720e = bVar.f333849n;
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = bVar.f333837b;
        }
        am.g0 g0Var2 = audioPlayerEvent.f53990g;
        g0Var2.f6723h = str2;
        g0Var2.f6719d = com.tencent.mm.autogen.events.AudioPlayerEvent.f(i17);
        ll.q qVar = this.f346102k;
        if (qVar != null) {
            ((ol.f) qVar).a(audioPlayerEvent);
        }
    }

    public final void n() {
        synchronized (this) {
            if (this.f346099h == null) {
                java.lang.Thread thread = new java.lang.Thread(this.f346116y, "audio_mix_player");
                this.f346099h = thread;
                thread.start();
                java.lang.Object[] objArr = {java.lang.Long.valueOf(this.f346099h.getId())};
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "start playback thread id:%d", objArr);
            }
        }
    }

    public void o(float f17, float f18) {
        try {
            android.media.AudioTrack audioTrack = this.f346092a;
            if (audioTrack != null) {
                audioTrack.setStereoVolume(f17, f18);
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e17, be1.x0.NAME, new java.lang.Object[0]);
        }
    }

    public void p() {
        synchronized (this.f346097f) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "sync notify", null);
            try {
                this.f346097f.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e17, "syncNotify", new java.lang.Object[0]);
            }
        }
    }
}
