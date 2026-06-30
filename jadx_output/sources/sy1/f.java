package sy1;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public hz1.a f413846a;

    /* renamed from: b, reason: collision with root package name */
    public hz1.a f413847b;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f413851f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f413852g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f413853h;

    /* renamed from: i, reason: collision with root package name */
    public long f413854i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f413855j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f413856k;

    /* renamed from: l, reason: collision with root package name */
    public long f413857l;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f413870y;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f413848c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f413849d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f413850e = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f413858m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f413859n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f413860o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f413861p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f413862q = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f413863r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f413864s = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: t, reason: collision with root package name */
    public hz1.a f413865t = null;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f413866u = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f413867v = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f413868w = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.Stack f413869x = new java.util.Stack();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f413871z = new java.util.ArrayList();

    public void a(hz1.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.Map map = this.f413866u;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            hz1.a aVar2 = (hz1.a) it.next();
            if (aVar.d(aVar2)) {
                ((java.util.concurrent.ConcurrentHashMap) map).remove(aVar2);
                break;
            }
        }
        java.util.Map map2 = this.f413864s;
        java.util.Iterator it6 = ((java.util.concurrent.ConcurrentHashMap) map2).keySet().iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            hz1.a aVar3 = (hz1.a) it6.next();
            if (aVar.d(aVar3)) {
                ((java.util.concurrent.ConcurrentHashMap) map2).remove(aVar3);
                break;
            }
        }
        java.util.Map map3 = this.f413867v;
        java.util.Iterator it7 = ((java.util.concurrent.ConcurrentHashMap) map3).keySet().iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            hz1.a aVar4 = (hz1.a) it7.next();
            if (aVar.d(aVar4)) {
                ((java.util.concurrent.ConcurrentHashMap) map3).remove(aVar4);
                break;
            }
        }
        java.util.Map map4 = this.f413868w;
        java.util.Iterator it8 = ((java.util.concurrent.ConcurrentHashMap) map4).keySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            hz1.a aVar5 = (hz1.a) it8.next();
            if (aVar.d(aVar5)) {
                ((java.util.concurrent.ConcurrentHashMap) map4).remove(aVar5);
                break;
            }
        }
        java.util.Map map5 = this.f413848c;
        java.util.Iterator it9 = ((java.util.concurrent.ConcurrentHashMap) map5).keySet().iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            hz1.a aVar6 = (hz1.a) it9.next();
            if (aVar.d(aVar6)) {
                ((java.util.concurrent.ConcurrentHashMap) map5).remove(aVar6);
                break;
            }
        }
        java.util.Map map6 = this.f413849d;
        for (hz1.a aVar7 : ((java.util.concurrent.ConcurrentHashMap) map6).keySet()) {
            if (aVar.d(aVar7)) {
                ((java.util.concurrent.ConcurrentHashMap) map6).remove(aVar7);
                return;
            }
        }
    }

    public java.lang.String b(int i17, int i18) {
        java.lang.String str = (java.lang.String) ((java.util.HashMap) this.f413858m).get(java.lang.Integer.valueOf(i17));
        if (u46.l.e(str)) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) this.f413859n).get(java.lang.Integer.valueOf(i17));
        boolean e17 = u46.l.e(str2);
        int i19 = 0;
        java.util.Map map = this.f413860o;
        if (e17) {
            arrayList.add("");
        } else {
            arrayList.add(str2.split("_")[0] + "-" + (((java.util.HashMap) map).get(str2) != null ? (java.lang.String) ((java.util.HashMap) map).get(str2) : ""));
        }
        while (i18 >= 0) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) e();
            int size = (arrayList2.size() - 1) - i18;
            if (size >= 0 && arrayList2.size() > size) {
                java.lang.String str3 = (java.lang.String) arrayList2.get(size);
                if (!u46.l.e(str3)) {
                    arrayList.add(str3.split("_")[0] + "-" + (((java.util.HashMap) map).get(str3) != null ? (java.lang.String) ((java.util.HashMap) map).get(str3) : ""));
                    i18--;
                }
            }
            arrayList.add("");
            i18--;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            if (i19 != arrayList.size() - 1) {
                sb6.append("&");
            }
            i19++;
        }
        return sb6.toString();
    }

    public java.util.Map c(hz1.a aVar) {
        if (aVar == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map map = this.f413867v;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            hz1.a aVar2 = (hz1.a) it.next();
            if (aVar.d(aVar2)) {
                java.util.Map map2 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(aVar2);
                if (map2 != null && map2.size() > 0) {
                    hashMap.putAll(map2);
                }
            }
        }
        return hashMap;
    }

    public java.util.Map d(hz1.a aVar) {
        if (aVar == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map map = this.f413868w;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            hz1.a aVar2 = (hz1.a) it.next();
            if (aVar.d(aVar2)) {
                java.util.Map map2 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(aVar2);
                if (map2 != null && map2.size() > 0) {
                    hashMap.putAll(map2);
                }
            }
        }
        return hashMap;
    }

    public java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f413862q).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            arrayList.add(str);
            java.util.List list = (java.util.List) ((java.util.HashMap) this.f413863r).get(str);
            if (list != null && list.size() > 0) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    public java.lang.String f() {
        sy1.e eVar;
        synchronized (this.f413869x) {
            eVar = this.f413869x.size() > 0 ? (sy1.e) this.f413869x.peek() : null;
        }
        if (eVar != null) {
            return eVar.f413844b;
        }
        return null;
    }

    public void g(hz1.a aVar, java.util.Map map) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        if (aVar == null || map == null || map.size() <= 0) {
            return;
        }
        java.util.Map map2 = this.f413864s;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map2).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                concurrentHashMap = null;
                break;
            }
            hz1.a aVar2 = (hz1.a) it.next();
            if (aVar.d(aVar2)) {
                concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((java.util.concurrent.ConcurrentHashMap) map2).get(aVar2);
                break;
            }
        }
        if (concurrentHashMap == null) {
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
            ((java.util.concurrent.ConcurrentHashMap) map2).put(aVar, concurrentHashMap);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                concurrentHashMap.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
    }

    public void h(java.lang.String str) {
        java.lang.String str2;
        if (u46.l.e(str)) {
            return;
        }
        java.util.List list = this.f413862q;
        if (((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            str2 = (java.lang.String) ((java.util.concurrent.CopyOnWriteArrayList) list).get(((java.util.concurrent.CopyOnWriteArrayList) list).size() - 1);
        } else {
            str2 = null;
        }
        if (u46.l.e(str2)) {
            return;
        }
        java.util.Map map = this.f413863r;
        java.util.List list2 = (java.util.List) ((java.util.HashMap) map).get(str2);
        if (list2 == null) {
            list2 = new java.util.ArrayList();
            ((java.util.HashMap) map).put(str2, list2);
        }
        list2.add(str);
    }

    public void i(java.lang.String str) {
        java.lang.String str2;
        if (u46.l.e(str)) {
            return;
        }
        java.util.List list = this.f413862q;
        if (((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            str2 = (java.lang.String) ((java.util.concurrent.CopyOnWriteArrayList) list).get(((java.util.concurrent.CopyOnWriteArrayList) list).size() - 1);
        } else {
            str2 = null;
        }
        if (u46.l.e(str2)) {
            return;
        }
        java.util.Map map = this.f413863r;
        java.util.List list2 = (java.util.List) ((java.util.HashMap) map).get(str2);
        if (list2 == null) {
            return;
        }
        list2.remove(str);
        if (list2.size() <= 0) {
            ((java.util.HashMap) map).remove(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f3, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: all -> 0x0142, TryCatch #0 {, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x002f, B:13:0x0035, B:14:0x0040, B:17:0x0042, B:19:0x0059, B:21:0x0063, B:23:0x006d, B:28:0x007d, B:30:0x0087, B:32:0x0091, B:34:0x009b, B:40:0x00ad, B:42:0x00b2, B:44:0x00c0, B:47:0x00ce, B:49:0x00d4, B:50:0x0111, B:68:0x00e1, B:70:0x00e9, B:73:0x00f5, B:75:0x00fb, B:78:0x0103, B:87:0x010c), top: B:6:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[Catch: all -> 0x0142, TryCatch #0 {, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x002f, B:13:0x0035, B:14:0x0040, B:17:0x0042, B:19:0x0059, B:21:0x0063, B:23:0x006d, B:28:0x007d, B:30:0x0087, B:32:0x0091, B:34:0x009b, B:40:0x00ad, B:42:0x00b2, B:44:0x00c0, B:47:0x00ce, B:49:0x00d4, B:50:0x0111, B:68:0x00e1, B:70:0x00e9, B:73:0x00f5, B:75:0x00fb, B:78:0x0103, B:87:0x010c), top: B:6:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1 A[Catch: all -> 0x0142, TryCatch #0 {, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x002f, B:13:0x0035, B:14:0x0040, B:17:0x0042, B:19:0x0059, B:21:0x0063, B:23:0x006d, B:28:0x007d, B:30:0x0087, B:32:0x0091, B:34:0x009b, B:40:0x00ad, B:42:0x00b2, B:44:0x00c0, B:47:0x00ce, B:49:0x00d4, B:50:0x0111, B:68:0x00e1, B:70:0x00e9, B:73:0x00f5, B:75:0x00fb, B:78:0x0103, B:87:0x010c), top: B:6:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c A[Catch: all -> 0x0142, TryCatch #0 {, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x002f, B:13:0x0035, B:14:0x0040, B:17:0x0042, B:19:0x0059, B:21:0x0063, B:23:0x006d, B:28:0x007d, B:30:0x0087, B:32:0x0091, B:34:0x009b, B:40:0x00ad, B:42:0x00b2, B:44:0x00c0, B:47:0x00ce, B:49:0x00d4, B:50:0x0111, B:68:0x00e1, B:70:0x00e9, B:73:0x00f5, B:75:0x00fb, B:78:0x0103, B:87:0x010c), top: B:6:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sy1.f.j(int, java.lang.String):void");
    }

    public void k(hz1.a aVar, long j17) {
        hz1.a aVar2;
        if (aVar == null) {
            return;
        }
        l(aVar, "page_in");
        vy1.b j18 = uy1.a.j(aVar, true);
        if (j18 != null) {
            j18.f441437p = j17;
        }
        this.f413846a = this.f413847b;
        this.f413847b = aVar;
        this.f413850e++;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f413871z;
        if (arrayList.size() > 999) {
            arrayList.remove(0);
        }
        if (uy1.a.k(aVar) > 0) {
            arrayList.add(uy1.a.k(aVar) + "_" + j17);
        } else {
            arrayList.add(aVar.f286289c + "_" + j17);
        }
        if (!aVar.f286293g || (aVar2 = this.f413846a) == null || aVar2.f286293g) {
            return;
        }
        wy1.b bVar = uy1.a.f431908b;
        bVar.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) bVar.f450631a).values().iterator();
        while (it.hasNext()) {
            arrayList2.add((vy1.b) it.next());
        }
        if (uy1.a.f431907a > arrayList2.size()) {
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = ((vy1.b) it6.next()).f441423b;
                if (pz1.a.a() && !u46.l.e(str)) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add("1");
                    arrayList3.add(str);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.l(24504, arrayList3);
                }
            }
            uy1.a.f431907a = arrayList2.size();
        }
    }

    public final void l(hz1.a aVar, java.lang.String str) {
        vy1.b bVar;
        vy1.b j17;
        if (aVar == null || u46.l.e(str)) {
            return;
        }
        int i17 = this.f413850e;
        vy1.b j18 = uy1.a.j(aVar, true);
        if (j18 != null) {
            j18.f441436o = i17;
        }
        if (aVar.f286292f) {
            vy1.b j19 = uy1.a.j(this.f413847b, false);
            if (j19 != null) {
                bVar = j19.f441427f;
            }
            bVar = null;
        } else {
            hz1.a c17 = ry1.b.c(this.f413847b);
            if (c17 != null) {
                bVar = uy1.a.j(c17, false);
            }
            bVar = null;
        }
        if (bVar != null) {
            vy1.b j27 = uy1.a.j(aVar, true);
            if (j27 != null) {
                j27.f441427f = bVar;
            }
            vy1.b j28 = uy1.a.j(aVar, false);
            if ((j28 != null ? j28.f441428g : null) != null || (j17 = uy1.a.j(aVar, true)) == null) {
                return;
            }
            j17.f441428g = bVar;
        }
    }
}
