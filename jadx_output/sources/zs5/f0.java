package zs5;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f475354a = 6;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f475355b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f475356c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f475357d;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f475355b = arrayList;
        f475356c = false;
        arrayList.add("weixin://wxpay/");
        arrayList.add("wxp://");
        arrayList.add("https://wx.tenpay.com/");
        arrayList.add("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fye) + "/");
        arrayList.add("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxv) + "/");
        arrayList.add("https://payapp.wechatpay.cn/");
        f475357d = new java.util.ArrayList();
    }

    public static java.util.List a() {
        boolean z17 = f475356c;
        java.util.List list = f475355b;
        if (!z17) {
            try {
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_scan_code_white_list_android, "", true);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                    for (java.lang.String str : Zi.split(";")) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            ((java.util.ArrayList) list).add(str);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.QBarAIModHelper", "updateWhiteList whiteListConfigValue: %s, whiteListSize: %d", Zi, java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
                f475356c = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QBarAIModHelper", e17, "updateWhiteList exception", new java.lang.Object[0]);
            }
        }
        return list;
    }
}
