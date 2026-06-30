package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class x0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashSet f182502q;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f182503e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182504f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f182505g;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f182509n;

    /* renamed from: h, reason: collision with root package name */
    public boolean f182506h = false;

    /* renamed from: i, reason: collision with root package name */
    public i11.e f182507i = null;

    /* renamed from: m, reason: collision with root package name */
    public i11.d f182508m = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f182510o = false;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.BroadcastReceiver f182511p = new com.tencent.mm.plugin.webview.luggage.jsapi.w0(this);

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f182502q = hashSet;
        hashSet.add("gcj02");
        hashSet.add("wgs84");
    }

    @Override // sd.c
    public java.lang.String b() {
        return "geoLocation";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r8, java.lang.String r9, com.tencent.mm.plugin.webview.luggage.jsapi.q5 r10) {
        /*
            r7 = this;
            r7.f182503e = r8
            r7.f182504f = r10
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r0 = "com.tencent.mm.ACTION_LOCATION_FROM_JSAPI"
            r2.addAction(r0)
            r0 = 33
            boolean r0 = fp.h.a(r0)
            r6 = 0
            android.content.BroadcastReceiver r1 = r7.f182511p
            if (r0 == 0) goto L21
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.v9.a()
            r8.registerReceiver(r1, r2, r0, r6)
            goto L2b
        L21:
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.v9.a()
            r4 = 0
            r5 = 4
            r0 = r8
            r0.registerReceiver(r1, r2, r3, r4, r5)
        L2b:
            org.json.JSONObject r9 = com.tencent.mm.plugin.webview.luggage.util.g.e(r9)
            if (r9 == 0) goto L3a
            java.lang.String r0 = "type"
            java.lang.String r9 = r9.optString(r0)
            r7.f182505g = r9
        L3a:
            java.lang.Class<tb0.j> r9 = tb0.j.class
            i95.m r9 = i95.n0.c(r9)
            tb0.j r9 = (tb0.j) r9
            sb0.f r9 = (sb0.f) r9
            r9.getClass()
            java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
            r0 = 1
            boolean r1 = j35.u.d(r8, r9, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "MicroMsg.JsApiGeoLocation"
            java.lang.String r4 = "location perm: %s"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            if (r1 != 0) goto Lbc
            java.lang.String[] r9 = new java.lang.String[]{r9}
            int r1 = com.tencent.mm.plugin.webview.luggage.LuggageStubUI.f182132d
            r1 = 0
            if (r8 == 0) goto Lb3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9 = r9[r1]
            int r3 = b3.l.checkSelfPermission(r8, r9)
            if (r3 == 0) goto L78
            r2.add(r9)
        L78:
            int r9 = r2.size()
            if (r9 != 0) goto L7f
            goto Lb3
        L7f:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            boolean r1 = r8 instanceof android.app.Activity
            if (r1 != 0) goto L8d
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r9.addFlags(r1)
        L8d:
            java.lang.String r1 = "key_action_code"
            r9.putExtra(r1, r0)
            int r1 = r2.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r2 = "key_permission_types"
            r9.putExtra(r2, r1)
            java.lang.String r1 = "key_permission_request_code"
            r2 = 75
            r9.putExtra(r1, r2)
            java.lang.String r1 = "webview"
            java.lang.String r2 = ".luggage.LuggageStubUI"
            j45.l.j(r8, r1, r2, r9, r6)
            goto Lb4
        Lb3:
            r0 = r1
        Lb4:
            if (r0 != 0) goto Lbb
            java.lang.String r8 = "fail"
            r7.g(r10, r8)
        Lbb:
            return
        Lbc:
            r7.f(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.luggage.jsapi.x0.d(android.content.Context, java.lang.String, com.tencent.mm.plugin.webview.luggage.jsapi.q5):void");
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final void f(com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f182505g) && !f182502q.contains(this.f182505g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGeoLocation", "doGeoLocation fail, unsupported type = %s", this.f182505g);
            g(q5Var, "unsupported_type");
            return;
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f182507i = i11.h.e();
        java.lang.String str = this.f182505g;
        if (this.f182510o) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGeoLocation", "startGeoLocation");
        if (this.f182508m == null) {
            this.f182508m = new com.tencent.mm.plugin.webview.luggage.jsapi.u0(this, q5Var, str);
        }
        if (this.f182509n == null) {
            this.f182509n = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        }
        this.f182509n.postDelayed(new com.tencent.mm.plugin.webview.luggage.jsapi.v0(this, q5Var), 20000L);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.equalsIgnoreCase("gcj02")) {
            this.f182510o = true;
            ((i11.h) this.f182507i).j(this.f182508m, false);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
            return;
        }
        if (!str.equalsIgnoreCase("wgs84")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGeoLocation", "startGeoLocation, should not reach here !!!!!");
            g(q5Var, "fail_unsupported_type_startgeo");
            return;
        }
        this.f182510o = true;
        ((i11.h) this.f182507i).k(this.f182508m, false);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }

    public final synchronized void g(com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, java.lang.String str) {
        i11.d dVar;
        this.f182503e.unregisterReceiver(this.f182511p);
        i11.e eVar = this.f182507i;
        if (eVar != null && (dVar = this.f182508m) != null) {
            ((i11.h) eVar).m(dVar);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f182509n;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        this.f182508m = null;
        if (!this.f182506h) {
            this.f182506h = true;
            q5Var.a(str, null);
        }
    }
}
