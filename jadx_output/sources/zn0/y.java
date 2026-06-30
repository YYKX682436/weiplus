package zn0;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public zn0.z f474419e;

    /* renamed from: b, reason: collision with root package name */
    public int f474416b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f474417c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f474415a = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f474418d = new java.util.concurrent.ConcurrentHashMap();

    public y(zn0.w wVar) {
    }

    public static zn0.y c() {
        return zn0.x.f474414a;
    }

    public void a(zn0.v vVar) {
        if (vVar != null) {
            fn0.g gVar = fn0.g.f264195a;
            hn0.g gVar2 = fn0.g.f264196b;
            java.lang.String str = vVar.f474406d;
            ((vd2.l5) gVar2).getClass();
            mm2.o4 o4Var = (mm2.o4) dk2.ef.f233372a.i(mm2.o4.class);
            int i17 = 0;
            if (o4Var != null) {
                java.util.List list = o4Var.f329335z;
                kotlin.jvm.internal.o.f(list, "<get-linkMicUserInfoList>(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, str)) {
                        arrayList.add(obj);
                    }
                }
                km2.q qVar = (km2.q) kz5.n0.a0(arrayList, 0);
                java.lang.Integer valueOf = qVar != null ? java.lang.Integer.valueOf(qVar.f309192w) : null;
                if (valueOf != null) {
                    i17 = valueOf.intValue();
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteUserConfigHelper", "addRemoteUser: userName:" + vVar.f474406d + " seatPosition: " + i17);
            vVar.f474413n = i17;
        }
        f();
        this.f474415a.add(vVar);
        g();
    }

    public void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear mRemoteUserConfigList size: ");
        java.util.ArrayList arrayList = this.f474415a;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteUserConfigHelper", sb6.toString());
        f();
        arrayList.clear();
        g();
    }

    public zn0.v d(java.lang.String str) {
        java.util.Iterator it = this.f474415a.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            if (str.equals(vVar.f474406d)) {
                return vVar;
            }
        }
        return null;
    }

    public java.util.List e() {
        return this.f474415a;
    }

    public final void f() {
        zn0.z zVar = this.f474419e;
        if (zVar != null) {
            int size = this.f474415a.size();
            df2.tu tuVar = (df2.tu) zVar;
            tuVar.getClass();
            com.tencent.mars.xlog.Log.i("TRTCPerformanceDetector", "notifyRemoteUserSizeBeforeChange: size: " + size);
            if (tuVar.Z6()) {
                tuVar.f231475o = 0;
                tuVar.f231476p = 0;
                tuVar.f231477q = 0;
                zn0.y yVar = zn0.x.f474414a;
                tuVar.f231475o = yVar.f474415a.size();
                java.util.ArrayList arrayList = yVar.f474415a;
                kotlin.jvm.internal.o.f(arrayList, "getRemoteUserConfigList(...)");
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((zn0.v) it.next()).f474408f) {
                        tuVar.f231476p++;
                    } else {
                        tuVar.f231477q++;
                    }
                }
                com.tencent.mars.xlog.Log.i("TRTCPerformanceDetector", "updateMicSize micTotalSize: " + tuVar.f231475o + " micVideoSize: " + tuVar.f231476p + " micAudioSize: " + tuVar.f231477q + ' ');
                tuVar.a7();
            }
        }
    }

    public final void g() {
        zn0.z zVar = this.f474419e;
        if (zVar != null) {
            int size = this.f474415a.size();
            df2.tu tuVar = (df2.tu) zVar;
            com.tencent.mars.xlog.Log.i("TRTCPerformanceDetector", "notifyRemoteUserSizeChange size: " + size);
            if (tuVar.Z6() && size > 0) {
                com.tencent.mars.xlog.Log.i("TRTCPerformanceDetector", "onPerformanceStart performanceEnable: " + tuVar.Z6());
                if (tuVar.Z6()) {
                    tuVar.f231478r = true;
                    ts5.d dVar = (ts5.d) ((jz5.n) tuVar.f231474n).getValue();
                    if (dVar != null) {
                        dVar.start();
                    }
                }
            }
        }
    }

    public void h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteUserConfigHelper", "removeRemoteUser: target userName:" + str);
        f();
        java.util.Iterator it = this.f474415a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (str.equals(((zn0.v) it.next()).f474406d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemoteUserConfigHelper", "removeRemoteUser: find userName:" + str + ", remove");
                it.remove();
                break;
            }
        }
        g();
    }

    public void i(java.lang.String str) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteUserConfigHelper", "setCurrentSessionId: sessionId:" + str);
        if (str != null) {
            java.util.Iterator it = this.f474415a.iterator();
            while (it.hasNext()) {
                zn0.v vVar = (zn0.v) it.next();
                try {
                    i17 = java.lang.Integer.parseInt(vVar.f474411i);
                } catch (java.lang.NumberFormatException unused) {
                    i17 = 0;
                }
                j(str, vVar.f474406d, i17, vVar.f474412m);
            }
        }
    }

    public void j(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteUserConfigHelper", "updateCacheUserInfoMap: sessionId:" + str + ", userId:" + str2 + ", roomId:" + i17 + ", isAnchor:" + z17);
        if (str == null || str2 == null) {
            return;
        }
        java.util.Map map = this.f474418d;
        java.util.Map map2 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (map2 == null) {
            map2 = new java.util.concurrent.ConcurrentHashMap();
        }
        zn0.v vVar = new zn0.v("");
        vVar.f474411i = i17 + "";
        vVar.f474412m = z17;
        map2.put(str2, vVar);
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, map2);
    }
}
