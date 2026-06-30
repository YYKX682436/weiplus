package su4;

/* loaded from: classes8.dex */
public class f3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f412881a;

    /* renamed from: b, reason: collision with root package name */
    public int f412882b;

    /* renamed from: c, reason: collision with root package name */
    public int f412883c;

    /* renamed from: d, reason: collision with root package name */
    public long f412884d;

    /* renamed from: e, reason: collision with root package name */
    public int f412885e;

    /* renamed from: f, reason: collision with root package name */
    public int f412886f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412887g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f412888h;

    /* renamed from: i, reason: collision with root package name */
    public long f412889i;

    /* renamed from: j, reason: collision with root package name */
    public int f412890j;

    /* renamed from: k, reason: collision with root package name */
    public long f412891k = java.lang.System.currentTimeMillis();

    /* renamed from: l, reason: collision with root package name */
    public int f412892l;

    /* renamed from: m, reason: collision with root package name */
    public int f412893m;

    public boolean a() {
        if (this.f412893m == 1) {
            return false;
        }
        int i17 = this.f412883c;
        if (i17 > o45.wf.f343029g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "msgid %s clientVersion %d invalid ,curVer is %d", this.f412881a, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(o45.wf.f343029g));
            return false;
        }
        if (java.lang.System.currentTimeMillis() > this.f412891k + (this.f412884d * 1000)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "msgid %s expired", this.f412881a);
            return false;
        }
        java.lang.String str = this.f412882b + "h5 version valid ? %b, red.h5 %d, cur.h5 %s, red.timestamp %d, last rec.timestamp %d";
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(com.tencent.mm.plugin.websearch.l2.a(0) >= this.f412885e);
        objArr[1] = java.lang.Integer.valueOf(this.f412885e);
        objArr[2] = java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0));
        objArr[3] = java.lang.Long.valueOf(this.f412889i);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SEARCH_REDDOT_LONG;
        java.lang.Object m17 = c17.m(u3Var, null);
        objArr[4] = java.lang.Long.valueOf(m17 == null ? 0L : ((java.lang.Long) m17).longValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", str, objArr);
        if (com.tencent.mm.plugin.websearch.l2.a(0) < this.f412885e) {
            return false;
        }
        long j17 = this.f412889i;
        java.lang.Object m18 = gm0.j1.u().c().m(u3Var, null);
        return j17 > (m18 != null ? ((java.lang.Long) m18).longValue() : 0L);
    }
}
