package tt0;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f421796a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f421797b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f421798c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f421799d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f421800e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f421801f;

    /* renamed from: g, reason: collision with root package name */
    public int f421802g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f421803h;

    /* renamed from: i, reason: collision with root package name */
    public int f421804i;

    /* renamed from: j, reason: collision with root package name */
    public int f421805j;

    /* renamed from: k, reason: collision with root package name */
    public int f421806k;

    public static tt0.d a(java.lang.String str) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
        tt0.d dVar = new tt0.d();
        if (d17 == null) {
            return dVar;
        }
        dVar.f421797b = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.template");
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.title");
        dVar.f421798c = str2;
        dVar.f421796a = dVar.f421797b.replace("$wxaapp_view$", str2);
        dVar.f421799d = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.appid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        dVar.f421800e = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.username");
        dVar.f421801f = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.path");
        dVar.f421802g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.type"), 0);
        dVar.f421803h = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key");
        dVar.f421804i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.forbids"), 0);
        dVar.f421805j = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.wxaapp_type"), 1);
        dVar.f421806k = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.updatable_msg_type"), 0);
        return dVar;
    }
}
