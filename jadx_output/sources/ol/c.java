package ol;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ol.h f346079a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.b f346080b;

    /* renamed from: d, reason: collision with root package name */
    public final kl.h f346082d;

    /* renamed from: e, reason: collision with root package name */
    public final jl.c f346083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f346084f;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f346081c = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f346085g = false;

    public c(boolean z17) {
        ol.h hVar = new ol.h(z17);
        this.f346079a = hVar;
        ll.b bVar = new ll.b(hVar);
        this.f346080b = bVar;
        hVar.f346111t = bVar;
        this.f346082d = new kl.h(null);
        this.f346083e = new jl.c();
    }

    public void a(java.lang.String str) {
        java.lang.String str2 = this.f346084f;
        this.f346083e.getClass();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackTaskController", "cacheToFile appId:%s, filePath:%s", str2, str);
        jl.d dVar = new jl.d(new jl.a(str2, str), "AudioPcmDataTrackCacheToFileTask", 5);
        ll.m.a();
        ll.m.b(dVar);
    }

    public final void b(n01.b bVar) {
        bVar.f333861z = true;
        int d17 = this.f346079a.d(bVar.f333836a);
        int e17 = this.f346079a.e();
        if (!this.f346085g) {
            if (d17 <= 2000) {
                bVar.f333861z = false;
            }
            if (d17 >= 5000) {
                bVar.f333861z = true;
            } else if (e17 <= 5) {
                bVar.f333861z = false;
            } else {
                bVar.f333861z = true;
            }
            if (bVar.f333838c.contains("scale_intro")) {
                bVar.f333861z = false;
            }
        }
        if (e17 > 5) {
            ol.h hVar = this.f346079a;
            hVar.f346110s.clear();
            hVar.f346117z.clear();
            synchronized (hVar.f346098g) {
                hVar.f346117z.addAll(hVar.f346107p.keySet());
                java.util.Iterator it = hVar.f346117z.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    ol.i iVar = (ol.i) hVar.f346107p.get(str);
                    if (iVar != null && iVar.a(2)) {
                        hVar.f346110s.add(str);
                    }
                }
            }
            java.util.ArrayList arrayList = hVar.f346110s;
            if (arrayList.contains(bVar.f333836a)) {
                arrayList.remove(bVar.f333836a);
            }
            if (arrayList.size() > 2) {
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(arrayList.size())};
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayer", "do stop paused audio size:%d", objArr);
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    r((java.lang.String) it6.next());
                }
            }
        }
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(d17), java.lang.Boolean.valueOf(bVar.f333861z)};
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayer", "playingCount:%d, duration:%d, supportMixPlay:%b", objArr2);
    }

    public long c() {
        long j17;
        il.j a17 = il.j.a();
        synchronized (a17.f292005c) {
            java.util.Iterator it = a17.f292003a.iterator();
            j17 = 0;
            while (it.hasNext()) {
                hl.d dVar = (hl.d) a17.f292004b.get((java.lang.String) it.next());
                if (dVar != null && dVar.f282019b && !dVar.f282026i) {
                    j17 += dVar.c();
                }
            }
        }
        return j17;
    }

    public boolean d(java.lang.String str) {
        n01.b c17 = this.f346079a.c(str);
        if (c17 == null) {
            return false;
        }
        java.util.HashMap hashMap = this.f346081c;
        if (hashMap.containsKey(c17.f333838c)) {
            return ((java.lang.Boolean) hashMap.get(c17.f333838c)).booleanValue();
        }
        boolean d17 = il.j.a().d(c17.f333838c);
        if (d17) {
            hashMap.put(c17.f333838c, java.lang.Boolean.valueOf(d17));
        }
        return d17;
    }

    public boolean e(java.lang.String str) {
        java.util.HashMap hashMap = this.f346081c;
        if (hashMap.containsKey(str)) {
            return ((java.lang.Boolean) hashMap.get(str)).booleanValue();
        }
        boolean d17 = il.j.a().d(str);
        if (d17) {
            hashMap.put(str, java.lang.Boolean.valueOf(d17));
        }
        return d17;
    }

    public boolean f(java.lang.String str) {
        return this.f346079a.f346104m.containsKey(str);
    }

    public boolean g(java.lang.String str) {
        ol.i iVar;
        ol.h hVar = this.f346079a;
        return hVar.f346107p.containsKey(str) && (iVar = (ol.i) hVar.f346107p.get(str)) != null && iVar.a(2);
    }

    public boolean h(java.lang.String str) {
        return this.f346079a.j(str);
    }

    public boolean i(java.lang.String str) {
        ol.i iVar;
        ol.h hVar = this.f346079a;
        return hVar.f346107p.containsKey(str) && (iVar = (ol.i) hVar.f346107p.get(str)) != null && iVar.a(7);
    }

    public boolean j(java.lang.String str) {
        ol.i iVar;
        ol.h hVar = this.f346079a;
        return hVar.f346107p.containsKey(str) && (iVar = (ol.i) hVar.f346107p.get(str)) != null && iVar.a(9);
    }

    public boolean k(java.lang.String str) {
        ol.h hVar = this.f346079a;
        if (hVar.f346106o.containsKey(str)) {
            return ((java.lang.Boolean) hVar.f346106o.get(str)).booleanValue();
        }
        return false;
    }

    public void l() {
        ll.b bVar = this.f346080b;
        bVar.getClass();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "pauseAllOnBackground", null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (bVar.f319076f) {
            arrayList.addAll(bVar.f319075e);
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ll.c cVar = (ll.c) bVar.f319072b.get((java.lang.String) it.next());
            if (cVar != null && !cVar.f319078h) {
                ll.p pVar = cVar.f319079i;
                if (!(pVar == null) && pVar != null && !((ll.d) pVar).h()) {
                    pVar.d();
                }
            }
        }
        ol.h hVar = this.f346079a;
        hVar.getClass();
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "pauseAllOnBackground", null);
        nl.b bVar2 = hVar.f346100i;
        bVar2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "pauseMix", null);
        bVar2.f338115d.set(true);
        int i19 = bVar2.f338133v;
        if (i19 > 0) {
            long j17 = bVar2.f338134w / i19;
            bVar2.f338132u = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "mixAverageTime:%d", java.lang.Long.valueOf(j17));
        }
        bVar2.f338133v = 0;
        bVar2.f338134w = 0L;
        hVar.f346093b.set(false);
        hVar.f346095d.set(true);
        hVar.f346094c.set(false);
        hVar.p();
        synchronized (hVar) {
            java.lang.Thread thread = hVar.f346099h;
            if (thread != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "stop playback thread id:%d", java.lang.Long.valueOf(thread.getId()));
                hVar.f346099h = null;
            }
        }
        kl.h hVar2 = this.f346082d;
        hVar2.getClass();
        if (kl.h.f308730d == 0) {
            kl.h.f308730d = 0L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - kl.h.f308730d <= kl.h.f308729c.longValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioScanConvertCacheController", "startClean the last clean time is in AUDIO_MIX_NO_SCAN_TIME time", null);
        } else {
            kl.h.f308730d = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "start scan audio mix convert file", null);
            ll.m.b(new kl.g(hVar2, "clean audio mix convert cache", 5));
        }
        il.j a17 = il.j.a();
        synchronized (a17.f292005c) {
            java.util.Iterator it6 = a17.f292003a.iterator();
            while (it6.hasNext()) {
                hl.d dVar = (hl.d) a17.f292004b.get((java.lang.String) it6.next());
                if (dVar != null && dVar.f282019b && dVar.f282026i) {
                    synchronized (dVar) {
                        if (dVar.f282027j != null) {
                            int i27 = rl.b.f397143a;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.PcmBufferProvider", "closeCacheFileWithNoDiscard success", null);
                            dVar.f282027j.a();
                            dVar.f282027j = null;
                        }
                    }
                }
            }
        }
        il.e c17 = il.e.c();
        c17.getClass();
        int i28 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "saveData", null);
        jl.d dVar2 = new jl.d(new il.c(c17), "saveData", 5);
        ll.m.a();
        ll.m.b(dVar2);
    }

    public void m(n01.b bVar) {
        jl.e eVar;
        ol.i iVar;
        this.f346084f = bVar.f333849n;
        java.lang.Object[] objArr = {bVar.f333836a};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayer", "preparePlay:%s", objArr);
        il.e c17 = il.e.c();
        java.lang.String str = this.f346084f;
        if (!android.text.TextUtils.isEmpty(c17.f291984b) && !str.equals(c17.f291984b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, null);
            java.lang.String str2 = c17.f291984b;
            c17.f291984b = str;
            eVar = new il.a(c17, str2, str);
        } else if (android.text.TextUtils.isEmpty(c17.f291984b)) {
            c17.f291984b = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, null);
            eVar = new il.b(c17, str);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            jl.d dVar = new jl.d(eVar, "init cache path", 5);
            ll.m.a();
            ll.m.b(dVar);
        }
        if (e(bVar.f333838c) && bVar.f333842g) {
            b(bVar);
        }
        ol.h hVar = this.f346079a;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "preparePlay", null);
        boolean z17 = bVar.A;
        if (z17 || !bVar.f333842g) {
            if (z17) {
                synchronized (hVar.f346098g) {
                    if (hVar.f346107p.containsKey(bVar.f333836a) && (iVar = (ol.i) hVar.f346107p.get(bVar.f333836a)) != null && iVar.a(4)) {
                        hVar.f346107p.remove(bVar.f333836a);
                    }
                }
            }
        } else if (hVar.f346093b.get()) {
            hVar.n();
        } else {
            hVar.i();
        }
        hVar.f346104m.put(bVar.f333836a, bVar);
        synchronized (hVar.f346098g) {
            hVar.f346109r.put(bVar.f333836a, java.lang.Boolean.FALSE);
        }
        hVar.f346100i.l(bVar.f333836a);
        nl.b bVar2 = hVar.f346100i;
        bVar2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "prepareMix", null);
        bVar2.f338114c.set(false);
        bVar2.f338115d.set(false);
        if (bVar2.f338119h == null) {
            java.lang.Thread thread = new java.lang.Thread(bVar2.f338135x, "audio_mix_controller");
            bVar2.f338119h = thread;
            thread.start();
        }
        synchronized (bVar2.f338118g) {
            try {
                bVar2.f338118g.notify();
            } catch (java.lang.Exception e17) {
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e17, "notifyMix", new java.lang.Object[0]);
            }
        }
        this.f346080b.d(bVar);
    }

    public void n(java.lang.String str) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayer", "remove audioId:%s", str);
        ol.h hVar = this.f346079a;
        hVar.f346104m.remove(str);
        hVar.f346105n.remove(str);
        hVar.f346106o.remove(str);
        synchronized (hVar.f346098g) {
            hVar.f346107p.remove(str);
            hVar.f346109r.remove(str);
        }
        hVar.f346108q.remove(str);
        ll.b bVar = this.f346080b;
        if (bVar.f319072b.containsKey(str) && bVar.f319075e.contains(str)) {
            bVar.g(str);
        }
        bVar.f319073c.remove(str);
        synchronized (bVar.f319076f) {
            bVar.f319075e.remove(str);
        }
    }

    public void o(java.lang.String str) {
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(this.f346079a.h(str))};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayer", "resume audioId:%s, audio state:%d", objArr);
        b(this.f346079a.c(str));
        ol.h hVar = this.f346079a;
        hVar.f346095d.set(false);
        hVar.f346094c.set(false);
        hVar.p();
        hVar.n();
        synchronized (hVar.f346098g) {
            hVar.f346109r.put(str, java.lang.Boolean.FALSE);
        }
        hVar.f346100i.l(str);
        hVar.f346105n.remove(str);
        hVar.f346106o.put(str, java.lang.Boolean.TRUE);
        if (hVar.f346111t.c(str) && hVar.f346111t.b(str)) {
            hVar.l(1, str);
        }
        ll.b bVar = this.f346080b;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "startDecode audioId:%s", str);
        bVar.a(str, false, false);
    }

    public void p(n01.b bVar) {
        ol.h hVar = this.f346079a;
        hVar.f346104m.put(bVar.f333836a, bVar);
        if (hVar.g() == 1) {
            java.lang.String str = bVar.f333836a;
            if ((hVar.f346104m.containsKey(str) ? ((n01.b) hVar.f346104m.get(str)).f333861z : false) && hVar.j(bVar.f333836a)) {
                float f17 = (float) bVar.f333847l;
                hVar.o(f17, f17);
                java.lang.Object[] objArr = {java.lang.Double.valueOf(bVar.f333847l)};
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "setPlayParam setVolume:%f", objArr);
            }
        }
        this.f346080b.f319073c.put(bVar.f333836a, bVar);
    }

    public void q(boolean z17) {
        ll.b bVar = this.f346080b;
        synchronized (bVar.f319076f) {
            java.util.Iterator it = bVar.f319075e.iterator();
            while (it.hasNext()) {
                n01.b bVar2 = (n01.b) bVar.f319073c.get((java.lang.String) it.next());
                if (bVar2 != null) {
                    if (z17) {
                        bVar2.f333861z = z17;
                    } else {
                        ol.h hVar = bVar.f319071a;
                        if (hVar != null) {
                            int d17 = hVar.d(bVar2.f333836a);
                            int e17 = hVar.e();
                            if (d17 <= 2000) {
                                bVar2.f333861z = false;
                            }
                            if (d17 >= 5000) {
                                bVar2.f333861z = true;
                            } else if (e17 <= 5) {
                                bVar2.f333861z = false;
                            } else {
                                bVar2.f333861z = true;
                            }
                            if (bVar2.f333838c.contains("scale_intro")) {
                                bVar2.f333861z = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public void r(java.lang.String str) {
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(this.f346079a.h(str))};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayer", "stop audioId:%s, audio state:%d", objArr);
        ol.h hVar = this.f346079a;
        nl.b bVar = hVar.f346100i;
        bVar.f338117f.put(str, java.lang.Boolean.TRUE);
        bVar.j(str);
        if (bVar.f338120i.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "stopMix isMute", null);
            bVar.f338116e.set(true);
            bVar.f338113b.o(0.0f, 0.0f);
        } else {
            bVar.f338116e.set(false);
        }
        synchronized (hVar.f346098g) {
            hVar.f346109r.remove(str);
        }
        hVar.f346105n.remove(str);
        hVar.f346106o.put(str, java.lang.Boolean.FALSE);
        if (hVar.f346111t.c(str)) {
            hVar.l(3, str);
        }
        this.f346080b.g(str);
    }

    public void s(n01.b bVar) {
        ll.c cVar;
        ll.p pVar;
        ol.h hVar = this.f346079a;
        if (hVar.f346104m.containsKey(bVar.f333836a)) {
            hVar.f346104m.put(bVar.f333836a, bVar);
            if (hVar.g() == 1) {
                java.lang.String str = bVar.f333836a;
                if ((hVar.f346104m.containsKey(str) ? ((n01.b) hVar.f346104m.get(str)).f333861z : false) && hVar.j(bVar.f333836a)) {
                    float f17 = (float) bVar.f333847l;
                    hVar.o(f17, f17);
                    java.lang.Object[] objArr = {java.lang.Double.valueOf(bVar.f333847l)};
                    int i17 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "update setVolume:%f", objArr);
                }
            }
        }
        ll.b bVar2 = this.f346080b;
        java.util.HashMap hashMap = bVar2.f319073c;
        if (hashMap.containsKey(bVar.f333836a)) {
            hashMap.put(bVar.f333836a, bVar);
            if (bVar2.c(bVar.f333836a) || (cVar = (ll.c) bVar2.f319072b.get(bVar.f333836a)) == null || (pVar = cVar.f319079i) == null) {
                return;
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ((ll.d) pVar).f319088i;
            if (atomicInteger.get() == 8 || atomicInteger.get() == 7) {
                return;
            }
            float f18 = (float) bVar.f333847l;
            pVar.c(f18, f18);
        }
    }
}
