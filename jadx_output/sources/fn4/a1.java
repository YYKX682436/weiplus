package fn4;

/* loaded from: classes15.dex */
public class a1 {

    /* renamed from: b, reason: collision with root package name */
    public fn4.b f264475b;

    /* renamed from: c, reason: collision with root package name */
    public int f264476c;

    /* renamed from: e, reason: collision with root package name */
    public r45.xn6 f264478e;

    /* renamed from: f, reason: collision with root package name */
    public rm4.d f264479f;

    /* renamed from: d, reason: collision with root package name */
    public int f264477d = 2;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f264480g = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f264474a = new java.util.HashMap();

    public void a() {
        if (this.f264479f == null || this.f264478e == null) {
            return;
        }
        ((java.util.ArrayList) this.f264480g).add(this.f264478e.f390259h + "#" + (this.f264479f.f397455d / 1000));
    }

    public void b() {
        int i17 = this.f264476c - 1;
        this.f264476c = i17;
        com.tencent.mars.xlog.Log.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "onUIDestroy %d", java.lang.Integer.valueOf(i17));
        if (this.f264476c <= 0) {
            c();
            this.f264475b = null;
        }
    }

    public void c() {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (rm4.e eVar : ((java.util.HashMap) this.f264474a).values()) {
            if (!eVar.f397478d) {
                hashSet2.add(eVar);
                eVar.f397478d = true;
            }
        }
        if (this.f264475b != null) {
            om4.t Ai = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai();
            r45.un6 r07 = this.f264475b.r0();
            Ai.getClass();
            if (hashSet2.size() == 0) {
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) Ai.f346443b;
            om4.s sVar = (om4.s) concurrentHashMap.get(java.lang.Long.valueOf(r07.f387505h));
            com.tencent.mm.sdk.platformtools.n3 n3Var = Ai.f346442a;
            if (sVar != null && n3Var.hasMessages(0)) {
                java.util.HashSet hashSet3 = sVar.f346439d;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo hit cached task %d add %d", java.lang.Integer.valueOf(hashSet3.size()), java.lang.Integer.valueOf(hashSet2.size()));
                java.util.Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    hashSet3.add((rm4.e) it.next());
                }
                return;
            }
            if (sVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo not report task: %s size: %d", sVar, java.lang.Integer.valueOf(sVar.f346439d.size()));
            }
            om4.s sVar2 = new om4.s(Ai, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo new task %d %s", java.lang.Integer.valueOf(hashSet2.size()), sVar2);
            java.lang.System.currentTimeMillis();
            java.util.Iterator it6 = hashSet2.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                hashSet = sVar2.f346439d;
                if (!hasNext) {
                    break;
                } else {
                    hashSet.add((rm4.e) it6.next());
                }
            }
            sVar2.f346440e = r07;
            if (hashSet.size() > 0) {
                n3Var.removeMessages(0);
                n3Var.sendMessageDelayed(n3Var.obtainMessage(0, sVar2), 5000L);
                concurrentHashMap.put(java.lang.Long.valueOf(r07.f387505h), sVar2);
            }
        }
    }

    public void d(r45.xn6 xn6Var) {
        e(xn6Var);
        ((rm4.e) ((java.util.HashMap) this.f264474a).get(xn6Var.f390259h)).f397476b = true;
    }

    public void e(r45.xn6 xn6Var) {
        if (xn6Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose null");
        }
        rm4.e eVar = new rm4.e(xn6Var);
        java.util.Map map = this.f264474a;
        if (((java.util.HashMap) map).containsKey(eVar.f397475a.f390259h)) {
            ((rm4.e) ((java.util.HashMap) map).get(eVar.f397475a.f390259h)).f397475a = xn6Var;
        } else {
            ((java.util.HashMap) map).put(eVar.f397475a.f390259h, eVar);
            com.tencent.mars.xlog.Log.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose %s", xn6Var);
        }
    }

    public void f(r45.xn6 xn6Var, int i17, java.lang.String str) {
        this.f264478e = xn6Var;
        rm4.d dVar = new rm4.d();
        this.f264479f = dVar;
        dVar.f397452a = java.lang.System.currentTimeMillis();
        rm4.d dVar2 = this.f264479f;
        dVar2.f397460i = 2L;
        dVar2.f397459h = this.f264477d;
        dVar2.f397472u = i17 + 1;
        r45.un6 r07 = this.f264475b.r0();
        this.f264479f.f397471t = r07.f387506i + "_" + r07.f387507m + "_" + r07.f387505h;
        if (this.f264475b.h1()) {
            this.f264479f.f397458g = 1L;
        }
        this.f264477d = 2;
        com.tencent.mars.xlog.Log.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "startVideoPlay %s %s %s reportInfo: %d %d", str, xn6Var.f390259h, xn6Var.f390255d, java.lang.Long.valueOf(this.f264479f.f397459h), java.lang.Long.valueOf(this.f264479f.f397460i));
    }

    public void g(r45.un6 un6Var) {
        a();
        om4.t Ai = ((om4.m) i95.n0.c(om4.m.class)).Ai();
        r45.xn6 xn6Var = this.f264478e;
        rm4.d dVar = this.f264479f;
        Ai.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay: %s %s", xn6Var, dVar);
        if (xn6Var != null && dVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            dVar.f397453b = currentTimeMillis;
            dVar.f397454c = currentTimeMillis - dVar.f397452a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ismediaplay=1&searchid=");
            sb6.append(un6Var.f387507m);
            sb6.append("&scene=");
            sb6.append(un6Var.f387506i);
            sb6.append("&businesstype=3&mediatype=2&rec_category=");
            sb6.append(un6Var.f387505h);
            sb6.append("&docid=");
            sb6.append(xn6Var.G);
            sb6.append("&cdnsourcetype=");
            sb6.append(xn6Var.Q);
            try {
                sb6.append("&expand1=");
                sb6.append(fp.s0.b(xn6Var.f390273x, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.lang.Exception unused) {
            }
            sb6.append("&query=");
            try {
                sb6.append(fp.s0.b(un6Var.f387508n, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.lang.Exception unused2) {
            }
            sb6.append("&title=");
            try {
                sb6.append(fp.s0.b(xn6Var.f390255d, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.lang.Exception unused3) {
            }
            sb6.append("&duration=");
            sb6.append(xn6Var.f390258g * 1000);
            sb6.append("&mediaid=");
            sb6.append(xn6Var.f390259h);
            sb6.append("&startplaytime=");
            sb6.append(dVar.f397452a);
            sb6.append("&endplaytime=");
            sb6.append(dVar.f397453b);
            sb6.append("&playtime=");
            sb6.append(dVar.f397454c);
            sb6.append("&lastplayms=");
            sb6.append(dVar.f397455d);
            sb6.append("&autoplay=");
            sb6.append(dVar.f397459h);
            sb6.append("&hasplayended=");
            sb6.append(dVar.f397456e);
            sb6.append("&hasquickplay=");
            sb6.append(dVar.f397457f);
            sb6.append("&hasfullscreen=");
            sb6.append(dVar.f397458g);
            sb6.append("&hitpreload=");
            sb6.append(dVar.f397460i);
            sb6.append("&firstloadtime=");
            sb6.append(dVar.f397463l);
            sb6.append("&downloadfinishtime=");
            sb6.append(dVar.f397464m);
            sb6.append("&firstmoovreadytime=");
            sb6.append(dVar.f397465n);
            sb6.append("&firstdataavailabletime=");
            sb6.append(dVar.f397468q);
            sb6.append("&filesize=");
            sb6.append(dVar.f397474w);
            if (dVar.f397473v != null) {
                sb6.append("&bitrate=");
                sb6.append(dVar.f397473v.f162383b);
                sb6.append("&audiobitrate=");
                sb6.append(dVar.f397473v.f162388g);
            }
            java.lang.String sb7 = sb6.toString();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(sb7)) {
                r45.lq5 lq5Var = new r45.lq5();
                lq5Var.f379756t = sb7;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "build14436VideoPlayReportString %s", sb7);
                gm0.j1.d().g(new su4.u1(lq5Var));
            }
            com.tencent.mm.plugin.sight.base.b bVar = dVar.f397473v;
            java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(un6Var.f387506i), xn6Var.f390259h, java.lang.Long.valueOf(xn6Var.f390254J), "mp4", java.lang.Integer.valueOf(xn6Var.f390258g), java.lang.Integer.valueOf(bVar != null ? bVar.f162383b : 0), java.lang.Long.valueOf(dVar.f397452a), java.lang.Long.valueOf(dVar.f397453b), java.lang.Long.valueOf(dVar.f397455d), java.lang.Long.valueOf(dVar.f397454c), java.lang.Long.valueOf(dVar.f397457f), java.lang.Long.valueOf(dVar.f397458g), java.lang.Long.valueOf(dVar.f397459h), java.lang.Long.valueOf(dVar.f397460i), java.lang.Long.valueOf(dVar.f397463l), java.lang.Long.valueOf(dVar.f397464m), java.lang.Long.valueOf(dVar.f397456e), java.lang.Long.valueOf(dVar.f397465n), java.lang.Long.valueOf(dVar.f397466o), java.lang.Long.valueOf(dVar.f397468q), java.lang.Long.valueOf(dVar.f397469r), dVar.f397471t, java.lang.Long.valueOf(dVar.f397472u), com.tencent.mm.plugin.websearch.l2.b(), java.lang.Long.valueOf(dVar.f397467p), java.lang.Long.valueOf(dVar.f397470s), java.lang.Long.valueOf(dVar.f397461j), java.lang.Long.valueOf(dVar.f397462k), un6Var.f387512r);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay 15414 %s", format);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.kvStat(15414, format);
            if (dVar.f397463l > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(845);
                iDKey.SetKey(0);
                iDKey.SetValue(dVar.f397463l);
                arrayList.add(iDKey);
                com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                iDKey2.SetID(845);
                iDKey2.SetKey(1);
                iDKey2.SetValue(1L);
                arrayList.add(iDKey2);
                fVar.b(arrayList, false);
            }
            if (dVar.f397454c > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
                iDKey3.SetID(845);
                iDKey3.SetKey(2);
                iDKey3.SetValue(dVar.f397454c);
                arrayList2.add(iDKey3);
                com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
                iDKey4.SetID(845);
                iDKey4.SetKey(3);
                iDKey4.SetValue(1L);
                arrayList2.add(iDKey4);
                fVar.b(arrayList2, false);
            }
            if (dVar.f397464m > 0) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                com.tencent.mars.smc.IDKey iDKey5 = new com.tencent.mars.smc.IDKey();
                iDKey5.SetID(845);
                iDKey5.SetKey(4);
                iDKey5.SetValue(dVar.f397464m);
                arrayList3.add(iDKey5);
                com.tencent.mars.smc.IDKey iDKey6 = new com.tencent.mars.smc.IDKey();
                iDKey6.SetID(845);
                iDKey6.SetKey(5);
                iDKey6.SetValue(1L);
                arrayList3.add(iDKey6);
                fVar.b(arrayList3, false);
            }
        }
        this.f264478e = null;
        this.f264479f = null;
    }
}
