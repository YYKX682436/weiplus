package vq4;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.r2 f439304c;

    /* renamed from: d, reason: collision with root package name */
    public int f439305d;

    /* renamed from: e, reason: collision with root package name */
    public int f439306e;

    /* renamed from: f, reason: collision with root package name */
    public int f439307f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f439308g;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f439302a = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f439303b = jz5.h.a(jz5.i.f302831f, vq4.h.f439299d);

    /* renamed from: h, reason: collision with root package name */
    public final int f439309h = j62.e.g().c(new com.tencent.mm.repairer.config.voip.setting.RepairerConfigVoIPProfileReport());

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f439310i = jz5.h.b(new vq4.f(this));

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f439311j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f439312k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f439313l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f439314m = true;

    public final rh.c1 a() {
        return (rh.c1) this.f439310i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final vq4.e b() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vq4.i.b():vq4.e");
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfilerMonitor", "startMonitor: " + this.f439304c);
        kotlinx.coroutines.r2 r2Var = this.f439304c;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f439304c = kotlinx.coroutines.l.d(this.f439302a, null, null, new vq4.g(this, null), 3, null);
        rh.c1 a17 = a();
        if (a17 != null && a17.E()) {
            a17.a();
            a17.b();
        }
        rh.c1 a18 = a();
        if (a18 != null) {
            a18.I();
        }
    }

    public final org.json.JSONObject d(java.util.List list) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.lang.Number) next).intValue() < 30) {
                arrayList.add(next);
            }
        }
        sb6.append(arrayList.size());
        sb6.append("-");
        java.util.ArrayList<java.lang.Number> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            int intValue = ((java.lang.Number) obj).intValue();
            if (30 <= intValue && intValue < 48) {
                arrayList2.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Number number : arrayList2) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf((number.intValue() - 30) / 2);
            java.lang.Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((java.util.List) obj2).add(java.lang.Integer.valueOf(number.intValue()));
        }
        for (int i17 = 0; i17 < 9; i17++) {
            java.util.List list2 = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(i17));
            sb6.append(list2 != null ? list2.size() : 0);
            sb6.append("-");
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (((java.lang.Number) obj3).intValue() >= 48) {
                arrayList3.add(obj3);
            }
        }
        sb6.append(arrayList3.size());
        java.lang.Integer num = (java.lang.Integer) kz5.n0.m0(list);
        jSONObject.put("max", num != null ? num.intValue() : 0);
        java.lang.Integer num2 = (java.lang.Integer) kz5.n0.o0(list);
        jSONObject.put("min", num2 != null ? num2.intValue() : 0);
        jSONObject.put("distributed", sb6.toString());
        return jSONObject;
    }
}
