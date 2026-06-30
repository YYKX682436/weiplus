package tt0;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f421786a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f421787b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f421788c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f421789d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f421790e;

    /* renamed from: f, reason: collision with root package name */
    public int f421791f;

    /* renamed from: g, reason: collision with root package name */
    public int f421792g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f421793h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f421794i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f421795j;

    public static tt0.c a(java.lang.String str) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        tt0.c cVar = new tt0.c();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("TemplateMsgContent", "values map is null.");
            return cVar;
        }
        cVar.f421786a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        if (str2 == null) {
            str2 = "";
        }
        cVar.f421787b = str2;
        cVar.f421788c = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.title");
        cVar.f421791f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        cVar.f421789d = (java.lang.String) d17.get(".msg.appmsg.template_id");
        cVar.f421790e = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.weapp_username");
        cVar.f421792g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type"), -1);
        cVar.f421793h = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.digest");
        cVar.f421795j = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.message_folder_id");
        int i17 = 0;
        while (true) {
            if (i17 >= 100) {
                break;
            }
            java.lang.String str3 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
            if (i17 != 0) {
                str3 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line" + i17;
            }
            java.lang.String str4 = (java.lang.String) d17.get(str3 + ".value.word");
            java.lang.String str5 = (java.lang.String) d17.get(str3 + ".key.word");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4) && com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                com.tencent.mars.xlog.Log.i("TemplateMsgContent", "visit lines: lines count=%d", java.lang.Integer.valueOf(i17));
                break;
            }
            tt0.b bVar = new tt0.b();
            bVar.f421785b = str4;
            if (str5 == null) {
                str5 = "";
            }
            bVar.f421784a = str5;
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(str3 + ".key.hide"), 0);
            ((java.util.ArrayList) cVar.f421794i).add(bVar);
            i17++;
        }
        return cVar;
    }
}
