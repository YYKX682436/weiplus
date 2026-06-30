package pl2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f356671a;

    /* renamed from: b, reason: collision with root package name */
    public long f356672b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f356673c;

    /* renamed from: d, reason: collision with root package name */
    public int f356674d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f356675e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f356676f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f356677g = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f356678h = 2;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f356679i = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pl2.x f356680j;

    public w(pl2.x xVar, int i17) {
        this.f356680j = xVar;
        this.f356671a = i17;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(r26.i0.t(str, ";", ",", false));
            jSONObject.put(str2, str3);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(this.f356680j.f356681d, "report appendChnlExtra error, " + e17.getMessage());
            return str;
        }
    }

    public final jz5.l b() {
        pl2.x xVar = this.f356680j;
        android.app.Activity context = xVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String a17 = a(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).f135388t, "is_related", "1");
        boolean z17 = this.f356673c;
        int i17 = this.f356671a;
        java.lang.String a18 = z17 ? a(a(a17, "active_id", java.lang.String.valueOf(i17)), "active_index", java.lang.String.valueOf(this.f356675e)) : a(a(a(a17, "single_stream_type", "active"), "active_id", java.lang.String.valueOf(i17)), "active_index", java.lang.String.valueOf(this.f356675e));
        com.tencent.mars.xlog.Log.i(xVar.f356681d, xVar.f356687m.hashCode() + "report genJoinLiveChnlExtra " + this.f356673c + ", " + i17 + ", " + this.f356675e + ", " + a18);
        return new jz5.l(java.lang.Boolean.valueOf(this.f356673c), a18);
    }

    public final void c() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("banner_type", "common_recmd");
        int i17 = this.f356671a;
        linkedHashMap.put("active_id", java.lang.String.valueOf(i17));
        pl2.x xVar = this.f356680j;
        linkedHashMap.put("screen_type", xVar.getContext().getResources().getConfiguration().orientation == 2 ? "2" : "1");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f328001x1, linkedHashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i(xVar.f356681d, "report reportBannerClick " + i17);
    }

    public final void d(int i17, pl2.a aVar, int i18) {
        java.lang.String str;
        km2.n nVar;
        km2.t c17;
        com.tencent.mm.live.api.LiveConfig b17;
        pl2.x xVar = this.f356680j;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i(xVar.f356681d, "report reportSideBarItemExpose feed is null");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("banner_type", "common_recmd");
        int i19 = this.f356671a;
        linkedHashMap.put("active_id", java.lang.String.valueOf(i19));
        linkedHashMap.put("active_index", java.lang.String.valueOf(i17));
        linkedHashMap.put("card_exp_type", java.lang.String.valueOf(i18));
        km2.m mVar = aVar.f356616d;
        linkedHashMap.put("liveId", pm0.v.u(mVar.f309129d.f68537e));
        linkedHashMap.put("feedId", pm0.v.u(mVar.f309129d.f68549s));
        if (xVar.f356685h == null || (nVar = dk2.ef.H) == null || (c17 = nVar.c()) == null || (b17 = c17.b()) == null || (str = java.lang.Long.valueOf(b17.f68537e).toString()) == null) {
            str = "";
        }
        linkedHashMap.put("liveid_id", str);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.f328099x1, linkedHashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i(xVar.f356681d, "report reportSideBarItemExpose " + i19 + ", " + i17 + ", " + pm0.v.u(mVar.f309129d.f68537e) + ", " + pm0.v.u(mVar.f309129d.f68549s) + ' ');
    }
}
