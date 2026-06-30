package g55;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f268962a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f268963b;

    /* renamed from: c, reason: collision with root package name */
    public long f268964c;

    /* renamed from: d, reason: collision with root package name */
    public int f268965d;

    /* renamed from: e, reason: collision with root package name */
    public long f268966e;

    /* renamed from: f, reason: collision with root package name */
    public long f268967f;

    /* renamed from: g, reason: collision with root package name */
    public long f268968g;

    /* renamed from: h, reason: collision with root package name */
    public long f268969h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f268970i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f268971j;

    /* renamed from: k, reason: collision with root package name */
    public long f268972k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f268973l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f268974m;

    public e(java.lang.String redDotKey) {
        kotlin.jvm.internal.o.g(redDotKey, "redDotKey");
        this.f268962a = redDotKey;
        this.f268963b = jz5.h.b(g55.b.f268959d);
        this.f268970i = jz5.h.b(g55.c.f268960d);
        this.f268971j = jz5.h.b(g55.a.f268958d);
    }

    public static java.util.Map c(g55.e eVar, java.lang.Long l17, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRedDotInfoParams");
        }
        eVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(eVar.d());
        long j18 = eVar.f268966e;
        long j19 = eVar.f268968g;
        if (l17 != null) {
            j18 += l17.longValue() - eVar.f268972k;
            if (j19 == 0) {
                j19 = l17.longValue() - eVar.f268972k;
            }
        }
        linkedHashMap.put("exposure_time", java.lang.Long.valueOf(j18));
        java.lang.String str = eVar.f268962a;
        linkedHashMap.put("red_dot_key", str);
        linkedHashMap.put("first_exposure_time", java.lang.Long.valueOf(eVar.f268967f));
        linkedHashMap.put("disappear_time", java.lang.Long.valueOf(eVar.f268969h));
        linkedHashMap.put("exposure_cnt", java.lang.Integer.valueOf(eVar.f268965d));
        linkedHashMap.put("cur_exposure_time", java.lang.Long.valueOf(j19));
        linkedHashMap.put("entry_key", e55.e.f249667a.a(str));
        return linkedHashMap;
    }

    public java.util.Map a() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(c(this, null, 0L, 2, null));
        if (!b().isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            i55.e eVar = (i55.e) ((g55.i) kz5.n0.i0(b()));
            eVar.getClass();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            linkedHashMap3.put("start_time", java.lang.Long.valueOf(eVar.f268998a));
            linkedHashMap3.put("end_time", java.lang.Long.valueOf(eVar.f268999b));
            linkedHashMap3.put("stay_time", java.lang.Long.valueOf(eVar.f269000c));
            linkedHashMap2.putAll(linkedHashMap3);
            linkedHashMap2.put("red_dot_text", eVar.f288844e);
            linkedHashMap2.put("red_dot_unread", java.lang.Integer.valueOf(eVar.f288845f));
            arrayList.add(linkedHashMap2);
            linkedHashMap.put("red_dot_change_list", arrayList);
        }
        return linkedHashMap;
    }

    public final java.util.ArrayList b() {
        return (java.util.ArrayList) ((jz5.n) this.f268963b).getValue();
    }

    public final java.util.Map d() {
        return (java.util.Map) ((jz5.n) this.f268970i).getValue();
    }

    public final void e(long j17, java.util.Map map) {
        this.f268973l = true;
        if (this.f268967f == 0) {
            this.f268967f = j17;
        }
        if (map != null) {
            d().putAll(map);
        }
        if (j17 > this.f268972k) {
            this.f268972k = j17;
        }
        this.f268965d++;
        g55.i iVar = (g55.i) kz5.n0.k0(b());
        if (iVar != null) {
            iVar.f269001d = j17;
        }
    }

    public final void f(long j17, java.util.Map map) {
        this.f268973l = false;
        if (map != null) {
            d().putAll(map);
        }
        long j18 = this.f268972k;
        if (j17 > j18) {
            long j19 = j17 - j18;
            this.f268968g = j19;
            this.f268966e += j19;
            this.f268972k = 0L;
        }
        g55.i iVar = (g55.i) kz5.n0.k0(b());
        if (iVar != null) {
            iVar.f268999b = j17;
            iVar.f269000c += j17 - iVar.f269001d;
            iVar.f269001d = 0L;
        }
    }

    public final void g(g55.g info) {
        kotlin.jvm.internal.o.g(info, "info");
        jz5.g gVar = this.f268971j;
        if (((java.util.ArrayList) ((jz5.n) gVar).getValue()).size() > 5) {
            ((java.util.ArrayList) ((jz5.n) gVar).getValue()).remove(0);
        }
        ((java.util.ArrayList) ((jz5.n) gVar).getValue()).add(info);
    }

    public java.lang.String toString() {
        java.util.Iterator it = b().iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + '_' + ((g55.i) it.next());
        }
        return "curReportKey = " + this.f268962a + " \nexposureStayTime = " + this.f268966e + " \ncurExposureStayTime = " + this.f268968g + " \nfirstExposureTime = " + this.f268967f + " \ndisappearTime = " + this.f268969h + " \nexposureCnt = " + this.f268965d + " \ndisappearInfoList = " + ((java.util.ArrayList) ((jz5.n) this.f268971j).getValue()) + " \nchangeList = " + str + " \nparamsInfo = " + kz5.n0.g0(d().entrySet(), ",", "{", "}", 0, null, g55.d.f268961d, 24, null) + " \n";
    }
}
