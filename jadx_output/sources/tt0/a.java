package tt0;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f421775a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f421776b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f421777c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f421778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f421779e;

    /* renamed from: f, reason: collision with root package name */
    public int f421780f;

    /* renamed from: g, reason: collision with root package name */
    public int f421781g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f421782h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f421783i;

    public static tt0.a a(java.lang.String str) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
        tt0.a aVar = new tt0.a();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("AppBrandNotifyMsgContent", "values map is null.");
            return aVar;
        }
        aVar.f421775a = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.title");
        aVar.f421776b = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.wxa_nickname");
        com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.weapp_pushmsg.op"), 0);
        aVar.f421777c = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.busi_msgid");
        aVar.f421778d = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.username");
        aVar.f421779e = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.appid");
        aVar.f421780f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.type"), 0);
        aVar.f421781g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.version"), 0);
        aVar.f421782h = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.weappiconurl");
        aVar.f421783i = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.pagepath");
        return aVar;
    }
}
