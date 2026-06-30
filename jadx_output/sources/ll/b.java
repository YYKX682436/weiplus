package ll;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ol.h f319071a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f319072b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f319073c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f319074d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f319075e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f319076f = new java.lang.Object();

    public b(ol.h hVar) {
        this.f319071a = hVar;
        il.j a17 = il.j.a();
        synchronized (a17.f292005c) {
            java.util.Iterator it = a17.f292003a.iterator();
            while (it.hasNext()) {
                hl.d dVar = (hl.d) a17.f292004b.get((java.lang.String) it.next());
                if (dVar != null) {
                    dVar.h();
                }
            }
            a17.f292003a.clear();
            a17.f292004b.clear();
        }
    }

    public final boolean a(java.lang.String str, boolean z17, boolean z18) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "doDecodeAudio", null);
        if (this.f319071a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "mPlayer is null!", null);
            return false;
        }
        n01.b bVar = (n01.b) this.f319073c.get(str);
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "param for id %s is not exist!", str);
            return false;
        }
        ll.c cVar = (ll.c) this.f319072b.get(str);
        if (cVar != null) {
            if (cVar.f319078h && !this.f319071a.f346100i.e() && !this.f319071a.f346100i.c(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, but not to play end", null);
                return true;
            }
            if (cVar.f319078h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, reset source and decoder to run", null);
                cVar.f319078h = false;
                cVar.f319079i = ll.j.a(this.f319071a, new ql.a(bVar), 1, z18);
                cVar.f319119f = java.lang.System.currentTimeMillis();
                ll.m.b(cVar);
                return true;
            }
            ll.p pVar = cVar.f319079i;
            if (pVar == null || !z17) {
                if (pVar != null) {
                    ll.d dVar = (ll.d) pVar;
                    if (dVar.h() && !dVar.i()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "resume decoder to run", null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "resume", null);
                        dVar.p(4);
                        synchronized (dVar.f319099t) {
                            if (dVar.h()) {
                                dVar.f319089j.set(false);
                                try {
                                    dVar.f319099t.notify();
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", e17, "resume", new java.lang.Object[0]);
                                }
                            }
                        }
                        return true;
                    }
                }
                if (pVar != null && ((ll.d) pVar).i()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "decoder to stop, reset task run", null);
                    cVar.f319078h = false;
                    cVar.f319079i = ll.j.a(this.f319071a, new ql.a(bVar), 1, z18);
                    cVar.f319119f = java.lang.System.currentTimeMillis();
                    ll.m.b(cVar);
                    return true;
                }
                if (pVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is run and playing audio", null);
                    return true;
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "force decode to stop and create new task to run", null);
                ((ll.d) pVar).w();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is not exist, create new task to run", null);
        ll.p a17 = ll.j.a(this.f319071a, new ql.a(bVar), 1, z18);
        ll.c cVar2 = new ll.c(new ll.a(this), str, 5);
        cVar2.f319079i = a17;
        cVar2.f319119f = java.lang.System.currentTimeMillis();
        ll.m.b(cVar2);
        this.f319072b.put(str, cVar2);
        synchronized (this.f319076f) {
            if (!this.f319075e.contains(str)) {
                this.f319075e.add(str);
            }
        }
        return true;
    }

    public boolean b(java.lang.String str) {
        ll.c cVar = (ll.c) this.f319072b.get(str);
        if (cVar == null || !cVar.f319078h) {
            return false;
        }
        ol.h hVar = this.f319071a;
        if (hVar.f346100i.e() || hVar.f346100i.c(str)) {
            return false;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, but not to play end", null);
        return true;
    }

    public boolean c(java.lang.String str) {
        ll.c cVar = (ll.c) this.f319072b.get(str);
        if (cVar == null || cVar.f319078h) {
            return true;
        }
        return cVar.f319079i == null;
    }

    public void d(n01.b bVar) {
        boolean z17;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "prepareDecode", null);
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "param is null", null);
            return;
        }
        if (android.text.TextUtils.isEmpty(bVar.f333836a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "audioId is empty!", null);
            return;
        }
        if (this.f319075e.contains(bVar.f333836a)) {
            if (((n01.b) this.f319073c.get(bVar.f333836a)).a(bVar)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "is same param", null);
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "force to decode", null);
                z17 = true;
            }
            this.f319073c.put(bVar.f333836a, bVar);
        } else {
            synchronized (this.f319076f) {
                this.f319075e.add(bVar.f333836a);
            }
            this.f319073c.put(bVar.f333836a, bVar);
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "ids:%d, id2ParamMap:%d", java.lang.Integer.valueOf(this.f319075e.size()), java.lang.Integer.valueOf(this.f319073c.size()));
        if (bVar.A) {
            boolean a17 = a(bVar.f333836a, z17, true);
            synchronized (this.f319076f) {
                if (a17) {
                    if (!((java.util.ArrayList) this.f319074d).contains(bVar.f333838c)) {
                        ((java.util.ArrayList) this.f319074d).add(bVar.f333838c);
                    }
                }
            }
            return;
        }
        if (bVar.f333842g) {
            a(bVar.f333836a, z17, false);
            return;
        }
        boolean a18 = a(bVar.f333836a, z17, true);
        synchronized (this.f319076f) {
            if (a18) {
                if (!((java.util.ArrayList) this.f319074d).contains(bVar.f333838c)) {
                    ((java.util.ArrayList) this.f319074d).add(bVar.f333838c);
                }
            }
        }
    }

    public boolean e(java.lang.String str, int i17) {
        n01.b bVar = (n01.b) this.f319073c.get(str);
        if (bVar != null) {
            bVar.f333839d = i17;
            return true;
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "param for id %s is not exist!", str);
        return false;
    }

    public boolean f(java.lang.String str, int i17) {
        if (!e(str, i17)) {
            return false;
        }
        e(str, i17);
        ll.c cVar = (ll.c) this.f319072b.get(str);
        if (cVar == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist", null);
            return false;
        }
        if (cVar.f319078h) {
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!", null);
            return false;
        }
        ll.p pVar = cVar.f319079i;
        if (pVar == null) {
            int i27 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is isDetach!", null);
            return false;
        }
        if (pVar != null) {
            pVar.a(i17);
        }
        return true;
    }

    public void g(java.lang.String str) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "stopDecode audioId:%s", str);
        java.util.HashMap hashMap = this.f319072b;
        ll.c cVar = (ll.c) hashMap.get(str);
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist", null);
            return;
        }
        if (cVar.f319078h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!", null);
            return;
        }
        ll.p pVar = cVar.f319079i;
        if (pVar != null) {
            ((ll.d) pVar).w();
            cVar.f319079i = null;
            hashMap.remove(str);
        }
    }
}
