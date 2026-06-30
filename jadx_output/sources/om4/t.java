package om4;

/* loaded from: classes15.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f346443b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f346442a = new om4.q(this, "TopStoryReportExposeTask");

    public void a(r45.un6 un6Var, r45.xn6 xn6Var, int i17, int i18, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        try {
            sb6.append("scene=");
            sb6.append(un6Var.f387506i);
            sb6.append("&");
            sb6.append("businesstype=3");
            sb6.append("&");
            sb6.append("mediatype=2");
            sb6.append("&");
            sb6.append("docid=");
            sb6.append(xn6Var.G);
            sb6.append("&");
            sb6.append("typepos=");
            sb6.append("0");
            sb6.append("&");
            sb6.append("docpos=");
            sb6.append(i17 + 1);
            sb6.append("&");
            sb6.append("searchid=");
            sb6.append(un6Var.f387507m);
            sb6.append("&");
            sb6.append("ishomepage=");
            sb6.append(0);
            sb6.append("&rec_category=");
            sb6.append(xn6Var.f390271v);
            sb6.append("&");
            sb6.append("timestamp=");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append("&");
            sb6.append("clicktype=");
            sb6.append(i18);
            sb6.append("&");
            sb6.append("clickcontent=");
            try {
                sb6.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.lang.Exception unused) {
            }
            sb6.append("&");
            sb6.append("clicksource=");
            sb6.append("4");
            sb6.append("&");
            sb6.append("sceneactiontype=");
            sb6.append(1);
            sb6.append("&");
            sb6.append("query=");
            try {
                sb6.append(fp.s0.b(un6Var.f387508n, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.lang.Exception unused2) {
            }
            sb6.append("&");
            sb6.append("resulttype=");
            sb6.append(xn6Var.H);
            sb6.append("&");
            sb6.append("sessionid=");
            sb6.append(su4.r2.f(un6Var.f387506i));
            sb6.append("&");
            sb6.append("expand=");
            try {
                sb6.append(fp.s0.b(xn6Var.f390273x, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.lang.Exception unused3) {
            }
            sb6.append("&");
            sb6.append("title=");
            try {
                sb6.append(fp.s0.b(xn6Var.f390255d, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.lang.Exception unused4) {
            }
            sb6.append("&");
            sb6.append("nettype=");
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                sb6.append("wifi");
            } else if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                sb6.append("4g");
            } else {
                sb6.append("3g");
            }
            sb6.append("&");
            sb6.append("itemtype=");
            sb6.append(xn6Var.A);
        } catch (java.lang.Exception unused5) {
        }
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(sb7)) {
            return;
        }
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f379756t = sb7;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "do12721ClickVideoReport %s", sb7);
        gm0.j1.d().g(new su4.u1(lq5Var));
    }
}
