package yc1;

/* loaded from: classes7.dex */
public class o implements mf1.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f460796a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f460797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f460799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yc1.q f460800e;

    public o(yc1.q qVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, boolean z17) {
        this.f460800e = qVar;
        this.f460797b = lVar;
        this.f460798c = str;
        this.f460799d = z17;
    }

    public void a(int i17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        uh1.n0 n0Var = yc1.q.f460801p;
        if (n0Var != null) {
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f460797b;
            java.lang.String str2 = this.f460798c;
            ((com.tencent.mm.plugin.appbrand.jsapi.eg) n0Var).getClass();
            u81.f fVar = (u81.f) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.jsapi.fg.f81017a).get(str2);
            if (fVar != null && (t37 = ((com.tencent.mm.plugin.appbrand.jsapi.d0) lVar).t3()) != null) {
                t37.N.c(fVar);
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int ordinal = this.f460797b.getAppState().ordinal();
        if (ordinal == 2 || ordinal == 3) {
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "interrupted");
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str);
        }
        hashMap.put("code", java.lang.Integer.valueOf(i17));
        hashMap.put("socketTaskId", this.f460798c);
        hashMap.put("state", "close");
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(this.f460797b);
        pVar.r(jSONObject);
        pVar.n(this.f460800e.f460761g.a(this.f460798c));
        this.f460800e.f460761g.b(this.f460798c);
    }

    public void b(java.lang.String str) {
        this.f460800e.D(this.f460797b, this.f460798c, str);
    }

    public void c(java.lang.String str) {
        if (this.f460796a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateSocketTask", "onSocketError is true");
            return;
        }
        this.f460796a = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = this.f460798c;
        hashMap.put("socketTaskId", str2);
        hashMap.put("state", "error");
        hashMap.put("errMsg", str);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(this.f460797b);
        pVar.r(jSONObject);
        yc1.q qVar = this.f460800e;
        pVar.n(qVar.f460761g.a(str2));
        qVar.f460761g.b(str2);
        if (qVar.f460804m || qVar.f460805n) {
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 2L, 1L, false);
        } else {
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 1L, 1L, false);
        }
    }

    public void d(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, com.tencent.mm.plugin.appbrand.utils.w3.a(str));
        hashMap.put("isBuffer", java.lang.Boolean.FALSE);
        java.lang.String str2 = this.f460798c;
        hashMap.put("socketTaskId", str2);
        hashMap.put("state", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(this.f460797b);
        pVar.r(jSONObject);
        pVar.n(this.f460800e.f460761g.a(str2));
    }

    public void e(java.nio.ByteBuffer byteBuffer) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f460798c;
        hashMap.put("socketTaskId", str);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, byteBuffer);
        hashMap.put("isBuffer", java.lang.Boolean.TRUE);
        hashMap.put("state", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f460797b;
        com.tencent.mm.plugin.appbrand.utils.u3 d17 = com.tencent.mm.plugin.appbrand.utils.v3.d(lVar.getJsRuntime(), hashMap, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class));
        if (d17 != com.tencent.mm.plugin.appbrand.utils.u3.OK) {
            if (d17 == com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT) {
                com.tencent.mm.plugin.appbrand.utils.v3.b(lVar, yc1.p.NAME);
            }
        } else {
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            yc1.p pVar = new yc1.p();
            pVar.p(lVar);
            pVar.r(jSONObject);
            pVar.n(this.f460800e.f460761g.a(str));
        }
    }

    public void f(xk1.g gVar, java.util.Map map) {
        uh1.n0 n0Var = yc1.q.f460801p;
        if (n0Var != null) {
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f460797b;
            java.lang.String str = this.f460798c;
            yc1.q qVar = this.f460800e;
            com.tencent.mm.plugin.appbrand.jsapi.eg egVar = (com.tencent.mm.plugin.appbrand.jsapi.eg) n0Var;
            egVar.getClass();
            com.tencent.mm.plugin.appbrand.jsapi.dg dgVar = new com.tencent.mm.plugin.appbrand.jsapi.dg(egVar, lVar, str, qVar);
            ((java.util.HashMap) com.tencent.mm.plugin.appbrand.jsapi.fg.f81017a).put(str, dgVar);
            ((com.tencent.mm.plugin.appbrand.jsapi.d0) lVar).t3().N.a(dgVar);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("socketTaskId", this.f460798c);
        hashMap.put("state", "open");
        hashMap.put("header", yc1.q.C(this.f460800e, gVar));
        if (map != null && map.size() > 0 && this.f460799d) {
            hashMap.put(com.google.android.gms.common.Scopes.PROFILE, map);
        }
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(this.f460797b);
        pVar.r(jSONObject);
        pVar.n(this.f460800e.f460761g.a(this.f460798c));
    }

    public void g(xk1.a aVar) {
        if (aVar == null || !((uh1.a) this.f460797b.b(uh1.a.class)).F) {
            return;
        }
        com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent();
        am.u uVar = appBrandNetWorkReqHeaderReceivedEvent.f53981g;
        uVar.f8045a = "socket";
        uVar.f8047c = yc1.q.C(this.f460800e, aVar);
        uVar.f8046b = this.f460798c;
        appBrandNetWorkReqHeaderReceivedEvent.e();
    }
}
