package md1;

/* loaded from: classes7.dex */
public class s extends md1.q0 {
    public static final int CTRL_INDEX = 516;
    public static final java.lang.String NAME = "joinVoIPChat";

    /* renamed from: i, reason: collision with root package name */
    public final md1.c1 f325789i = new md1.c1();

    /* renamed from: m, reason: collision with root package name */
    public final md1.d1 f325790m = new md1.d1();

    /* renamed from: n, reason: collision with root package name */
    public final md1.g1 f325791n = new md1.g1();

    /* renamed from: o, reason: collision with root package name */
    public final md1.e1 f325792o = new md1.e1();

    /* renamed from: p, reason: collision with root package name */
    public final md1.f1 f325793p = new md1.f1();

    /* renamed from: q, reason: collision with root package name */
    public final md1.a1 f325794q = new md1.a1();

    /* renamed from: r, reason: collision with root package name */
    public final md1.z0 f325795r = new md1.z0();

    /* renamed from: s, reason: collision with root package name */
    public u81.f f325796s = null;

    /* renamed from: t, reason: collision with root package name */
    public final md1.k1 f325797t = new md1.k1();

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f325798u = false;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f325799v = "";

    /* renamed from: w, reason: collision with root package name */
    public long f325800w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f325801x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f325802y = false;

    public s() {
        si1.e.a(NAME);
    }

    @Override // md1.q0
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            java.lang.String str = android.text.TextUtils.isEmpty("fail:data is null or nil") ? "fail:jsapi invalid request data" : "fail:data is null or nil";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        fb1.c ec6 = fb1.e.f260836e.ec(fb1.d.f260832g, false, new md1.j(this, c0Var));
        if (ec6 instanceof fb1.a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "can not join voip chat now, message:%s", ((fb1.a) ec6).f260827a);
            java.util.HashMap hashMap = new java.util.HashMap();
            C(hashMap, D(-10086, -7));
            java.lang.String format = java.lang.String.format("fail: %d, %d, can not join voip chat now", -10086, -7);
            if (format == null) {
                format = null;
            }
            if (format == null) {
                format = "";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1107001);
            c0Var.a(i17, t(format, hashMap));
            return;
        }
        this.f325799v = c0Var.getAppId();
        I(c0Var);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(c0Var);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        p0Var.X1 = new md1.k(this, weakReference);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: appId:" + c0Var.getAppId() + ", params:" + jSONObject.toString());
        fw1.b G = G(c0Var, jSONObject);
        if (G == null) {
            java.lang.String str4 = android.text.TextUtils.isEmpty("fail: param error!") ? "fail:jsapi invalid request data" : "fail: param error!";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str4, jSONObject3));
            this.f325802y = false;
            return;
        }
        this.f325801x = 0;
        this.f325800w = android.os.SystemClock.elapsedRealtime();
        G.f267049c = "wx766655dab8fe851b";
        md1.j1 b17 = md1.j1.b();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f325785g;
        int i18 = this.f325786h;
        b17.f325751a = v5Var;
        b17.f325752b = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "init, roomType:%d", java.lang.Integer.valueOf(i18));
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        md1.l lVar = new md1.l(this, G, c0Var, i17);
        md1.m mVar = new md1.m(this, c0Var, G);
        md1.n nVar = new md1.n(this, c0Var);
        md1.o oVar = new md1.o(this, c0Var);
        md1.p pVar = new md1.p(this, c0Var);
        md1.q qVar = new md1.q(this, c0Var);
        md1.r rVar = new md1.r(this, c0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: trigger join room. %s, %s, %s, %d, %s", G.f267048b, G.f267050d, G.f267052f, java.lang.Integer.valueOf(G.f267053g), G.f267051e);
        p0Var.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b2(p0Var, G, lVar, mVar, nVar, oVar, pVar, qVar, rVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: JsApiCloudVoiceJoinVoIPChat callbackId:" + i17);
    }

    public java.util.Map H(java.util.ArrayList arrayList) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((fw1.d) it.next()).f267070b);
            }
        }
        hashMap.put("openIdList", arrayList2);
        return hashMap;
    }

    public void I(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        if (this.f325796s == null) {
            this.f325796s = new md1.i(this, c0Var);
        }
        if (c0Var.t3() == null || c0Var.t3().N == null) {
            return;
        }
        c0Var.t3().N.a(this.f325796s);
    }
}
