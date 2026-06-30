package jn4;

/* loaded from: classes11.dex */
public class m {

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f300814i;

    /* renamed from: j, reason: collision with root package name */
    public static jn4.p f300815j;

    /* renamed from: a, reason: collision with root package name */
    public boolean f300816a = false;

    /* renamed from: b, reason: collision with root package name */
    public final jn4.h f300817b = new jn4.h(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f300818c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f300819d;

    /* renamed from: e, reason: collision with root package name */
    public jn4.f f300820e;

    /* renamed from: f, reason: collision with root package name */
    public jn4.e f300821f;

    /* renamed from: g, reason: collision with root package name */
    public jn4.d f300822g;

    /* renamed from: h, reason: collision with root package name */
    public jn4.c f300823h;

    public m(java.lang.String str) {
        this.f300819d = str;
        f300814i = fp.m.b().getAbsolutePath() + "/tencent/traceroute_log_" + new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()).toString() + ".log";
    }

    public static void a(jn4.m mVar) {
        jn4.c cVar = mVar.f300823h;
        if (cVar != null) {
            ((com.tencent.mm.plugin.traceroute.ui.x) cVar).f175341a.f175343a.f175317m.sendEmptyMessage(3);
        }
    }

    public void b(java.lang.String[] strArr, boolean z17) {
        if (strArr == null || strArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "no ip contains");
            return;
        }
        java.lang.String str = z17 ? "long: " : "short: ";
        for (java.lang.String str2 : strArr) {
            java.lang.String[] split = str2.split(":");
            if (split == null || split.length != 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "err ip ".concat(str2));
            } else {
                java.util.Map map = this.f300818c;
                if (((java.util.HashMap) map).containsKey(split[0])) {
                    ((java.util.Set) ((java.util.HashMap) map).get(split[0])).add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(split[1], 0)));
                } else {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    hashSet.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(split[1], 0)));
                    ((java.util.HashMap) map).put(split[0], hashSet);
                    str = str + split[0] + " ";
                }
            }
        }
        com.tencent.mm.vfs.w6.a(f300814i, (str + "\n").getBytes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        if (str != null && str2 != null) {
            if (num.intValue() >= 0) {
                if (!this.f300817b.containsKey(str)) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    concurrentHashMap.put(num, new java.lang.StringBuilder(str2));
                    this.f300817b.put(str, concurrentHashMap);
                } else if (((java.util.concurrent.ConcurrentHashMap) this.f300817b.get(str)).containsKey(num)) {
                    ((java.lang.StringBuilder) ((java.util.concurrent.ConcurrentHashMap) this.f300817b.get(str)).get(num)).append(str2);
                } else {
                    new java.util.concurrent.ConcurrentHashMap().put(num, new java.lang.StringBuilder(str2));
                    ((java.util.concurrent.ConcurrentHashMap) this.f300817b.get(str)).put(num, new java.lang.StringBuilder(str2));
                }
            }
        }
    }

    public void d() {
        synchronized (this) {
            this.f300816a = true;
        }
        jn4.p pVar = f300815j;
        if (pVar != null) {
            try {
                pVar.shutdownNow();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "failed to shutdown threadpool: " + e17.getMessage());
            }
        }
    }
}
