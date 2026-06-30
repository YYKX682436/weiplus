package nl;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public nl.g f338112a;

    /* renamed from: b, reason: collision with root package name */
    public final ol.h f338113b;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Thread f338119h;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f338114c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f338115d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f338116e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile java.util.HashMap f338117f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f338118g = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public volatile java.util.LinkedList f338120i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public volatile java.util.HashMap f338121j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public volatile java.util.HashMap f338122k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public volatile java.util.HashMap f338123l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public volatile java.util.HashMap f338124m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f338125n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f338126o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public volatile java.util.HashMap f338127p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public volatile java.util.HashMap f338128q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public volatile java.util.HashMap f338129r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public volatile java.util.HashMap f338130s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public volatile java.util.LinkedList f338131t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public long f338132u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f338133v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f338134w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f338135x = new nl.a(this);

    public b(ol.h hVar) {
        this.f338113b = hVar;
    }

    public final ll.d a(java.lang.String str) {
        java.lang.ref.WeakReference weakReference;
        if (!this.f338124m.containsKey(str) || (weakReference = (java.lang.ref.WeakReference) this.f338124m.get(str)) == null || weakReference.get() == null) {
            return null;
        }
        return (ll.d) weakReference.get();
    }

    public long b(java.lang.String str) {
        synchronized (this.f338125n) {
            if (!this.f338130s.containsKey(str)) {
                return -1L;
            }
            java.lang.Long l17 = (java.lang.Long) this.f338130s.get(str);
            if (l17 == null) {
                return -1L;
            }
            return l17.longValue();
        }
    }

    public boolean c(java.lang.String str) {
        if (!this.f338120i.contains(str)) {
            return true;
        }
        java.util.List list = (java.util.List) this.f338122k.get(str);
        if (list != null && list.size() != 0) {
            return false;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "queue size is 0", null);
        return true;
    }

    public boolean d(java.lang.String str) {
        synchronized (this.f338125n) {
            if (!this.f338123l.containsKey(str)) {
                return false;
            }
            return ((java.lang.Boolean) this.f338123l.get(str)).booleanValue();
        }
    }

    public boolean e() {
        return this.f338114c.get();
    }

    public void f() {
        try {
            this.f338125n.notifyAll();
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e17, "notifySyncPcmData", new java.lang.Object[0]);
        }
    }

    public void g(java.lang.String str) {
        synchronized (this.f338125n) {
            if (this.f338123l.containsKey(str)) {
                this.f338123l.put(str, java.lang.Boolean.TRUE);
            } else {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "The audio of the id is remove", null);
            }
        }
    }

    public java.util.List h() {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f338125n) {
            arrayList.addAll(this.f338120i);
        }
        int i17 = 0;
        while (true) {
            hl.e eVar = null;
            if (i17 >= arrayList.size()) {
                break;
            }
            java.lang.String str = (java.lang.String) arrayList.get(i17);
            if (!d(str)) {
                java.util.List list = (java.util.List) this.f338122k.get(str);
                if (list == null || list.size() == 0) {
                    synchronized (this.f338125n) {
                        z17 = this.f338127p.containsKey(str) && ((java.lang.Boolean) this.f338127p.get(str)).booleanValue();
                    }
                    if (z17) {
                        synchronized (this.f338125n) {
                            this.f338127p.put(str, java.lang.Boolean.FALSE);
                        }
                        ol.h hVar = this.f338113b;
                        hVar.l(5, str);
                        n01.b c17 = hVar.c(str);
                        if (c17 != null) {
                            c17.f333841f = (int) b(str);
                        }
                        j(str);
                    } else {
                        continue;
                    }
                } else {
                    ll.d a17 = a(str);
                    if (a17 != null) {
                        a17.x(list.size());
                    }
                    java.lang.Object obj = this.f338121j.get(str);
                    if (obj == null) {
                        continue;
                    } else {
                        synchronized (obj) {
                            int size = list.size();
                            if (size > 0) {
                                while (size > 0) {
                                    size--;
                                    eVar = (hl.e) list.remove(size);
                                    if (!this.f338129r.containsKey(str) || ((java.lang.Integer) this.f338129r.get(str)).intValue() <= eVar.f282037e) {
                                        break;
                                    }
                                    if (eVar.f282039g) {
                                        il.h.a().c(eVar);
                                    }
                                }
                                if (eVar != null) {
                                    this.f338130s.put(str, java.lang.Long.valueOf(eVar.f282037e));
                                    n01.b c18 = this.f338113b.c(str);
                                    if (c18 != null && c18.f333847l == 0.0d && !eVar.f282039g) {
                                        hl.e b17 = il.h.a().b();
                                        if (b17 != null) {
                                            if (b17.f282038f == null) {
                                                b17.f282038f = new byte[3536];
                                            }
                                            b17.a();
                                            ((java.util.ArrayList) this.f338126o).add(b17);
                                        } else {
                                            ((java.util.ArrayList) this.f338126o).add(eVar);
                                        }
                                    } else if (c18 != null && c18.f333847l == 0.0d && eVar.f282039g) {
                                        eVar.a();
                                        ((java.util.ArrayList) this.f338126o).add(eVar);
                                    } else {
                                        ((java.util.ArrayList) this.f338126o).add(eVar);
                                    }
                                    this.f338131t.add(str);
                                } else if (a17 != null) {
                                    a17.x(list.size());
                                }
                            }
                        }
                    }
                }
            }
            i17++;
        }
        synchronized (this.f338125n) {
            if (((java.util.ArrayList) this.f338126o).size() == 0 && !e()) {
                try {
                    int i18 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "wait read data", null);
                    this.f338125n.wait();
                } catch (java.lang.Exception e17) {
                    int i19 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e17, "readMixDataFromPcmTrack", new java.lang.Object[0]);
                }
            }
        }
        return this.f338126o;
    }

    public final void i(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            hl.e eVar = (hl.e) it.next();
            if (eVar != null && eVar.f282039g) {
                il.h.a().c(eVar);
            }
        }
    }

    public void j(java.lang.String str) {
        synchronized (this.f338125n) {
            if (this.f338120i.contains(str)) {
                this.f338120i.remove(str);
                java.lang.Object obj = this.f338121j.get(str);
                java.util.List list = (java.util.List) this.f338122k.remove(str);
                if (obj != null) {
                    synchronized (obj) {
                        i(list);
                        list.clear();
                    }
                } else {
                    i(list);
                    list.clear();
                }
                this.f338121j.remove(str);
                this.f338123l.remove(str);
                this.f338127p.remove(str);
                this.f338128q.remove(str);
                if (this.f338115d.get()) {
                    f();
                }
                this.f338129r.remove(str);
                this.f338130s.remove(str);
            } else {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "The audio of the id is remove", null);
            }
        }
    }

    public boolean k(java.lang.String str, int i17, boolean z17) {
        hl.e eVar;
        if (!this.f338120i.contains(str)) {
            return false;
        }
        if (i17 < 0) {
            this.f338129r.remove(str);
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i17 == 0) {
            this.f338129r.remove(str);
        } else {
            this.f338129r.put(str, java.lang.Integer.valueOf(i17));
        }
        java.util.List list = (java.util.List) this.f338122k.get(str);
        if (list == null || list.size() == 0) {
            this.f338129r.remove(str);
            return false;
        }
        n01.b c17 = this.f338113b.c(str);
        if (c17 == null) {
            this.f338129r.remove(str);
            return false;
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "seekTo begin", null);
        boolean d17 = d(str);
        if (!d17) {
            g(str);
        }
        int size = list.size();
        hl.d b17 = il.j.a().b(c17.f333838c);
        int k17 = b17.k();
        int i19 = i17 / 20;
        int b18 = (int) (b(str) / 20);
        java.lang.Object obj = this.f338121j.get(str);
        if (obj == null) {
            this.f338129r.remove(str);
            return false;
        }
        ll.d a17 = a(str);
        if (i19 > b18 && i19 <= k17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "seekTo seekToPos > currentPos", null);
            int i27 = i19 - b18;
            synchronized (obj) {
                for (int i28 = 0; i28 < i27 && i28 < size; i28++) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0 && (eVar = (hl.e) list.remove(size2)) != null && eVar.f282039g) {
                        il.h.a().c(eVar);
                    }
                }
            }
            if (a17 != null) {
                a17.x(list.size());
            }
        } else if (i19 < b18 && b18 <= k17 && !z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "seekTo seekToPos < currentPos, can't write queue", null);
            synchronized (obj) {
                i(list);
                list.clear();
            }
            if (a17 != null) {
                a17.x(list.size());
            }
        } else if (i19 < b18 && b18 <= k17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "seekTo seekToPos < currentPos, can write queue", null);
            synchronized (obj) {
                while (b18 > i19) {
                    hl.e e17 = b17.e(b18);
                    if (e17 != null) {
                        list.add(list.size(), e17);
                    }
                    b18--;
                }
            }
        }
        if (!d17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "is not Pause", null);
            synchronized (this.f338125n) {
                if (this.f338123l.containsKey(str)) {
                    this.f338123l.put(str, java.lang.Boolean.FALSE);
                } else {
                    int i29 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "The audio of the id is remove", null);
                }
            }
            synchronized (this.f338125n) {
                f();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "seekTo end, time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return true;
    }

    public void l(java.lang.String str) {
        if (this.f338132u > 0) {
            this.f338132u = 0L;
        }
        synchronized (this.f338125n) {
            this.f338116e.set(false);
            java.util.HashMap hashMap = this.f338117f;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            hashMap.put(str, bool);
            if (this.f338120i.contains(str)) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "The audio of the Id is mixing", null);
            } else {
                this.f338120i.add(str);
                this.f338122k.put(str, new java.util.ArrayList());
                this.f338121j.put(str, new java.lang.Object());
                this.f338127p.put(str, bool);
            }
            this.f338123l.put(str, bool);
            this.f338128q.put(str, bool);
            if (this.f338115d.get()) {
                this.f338115d.set(false);
            } else {
                ((java.util.ArrayList) this.f338126o).size();
            }
            synchronized (this.f338118g) {
                try {
                    this.f338118g.notify();
                } catch (java.lang.Exception e17) {
                    int i18 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e17, "notifyMix", new java.lang.Object[0]);
                }
            }
            f();
        }
    }
}
