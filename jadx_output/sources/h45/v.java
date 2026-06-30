package h45;

/* loaded from: classes12.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f278954a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f278956c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f278957d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f278958e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f278959f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f278961h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f278962i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f278963j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f278964k;

    /* renamed from: b, reason: collision with root package name */
    public int f278955b = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f278960g = false;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f278965l = new java.util.ArrayList();

    public static h45.v a(java.lang.String str) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        h45.v vVar = new h45.v();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("WXPayTemplateMsgContent", "values map is null.");
            return vVar;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        vVar.f278954a = str2;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        vVar.f278955b = P;
        if (P != 0) {
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.display_name");
            if (str3 == null) {
                str3 = "";
            }
            vVar.f278957d = str3;
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.title");
            if (str4 == null) {
                str4 = "";
            }
            vVar.f278958e = str4;
            java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.first_data");
            if (str5 == null) {
                str5 = "";
            }
            vVar.f278959f = str5;
            java.lang.String str6 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.icon_url");
            if (str6 == null) {
                str6 = "";
            }
            vVar.f278961h = str6;
            java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.hide_title");
            if (str7 == null) {
                str7 = "";
            }
            if ("1".equals(str7)) {
                vVar.f278960g = true;
            }
            java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.word");
            java.lang.String str9 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.word");
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str9);
            java.util.List list = vVar.f278965l;
            if (!K0) {
                java.lang.String str10 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word");
                if (str10 == null) {
                    str10 = "";
                }
                vVar.f278962i = str10;
                h45.u uVar = new h45.u();
                if (str8 == null) {
                    str8 = "";
                }
                uVar.f278951a = str8;
                if (str9 == null) {
                    str9 = "";
                }
                uVar.f278952b = str9;
                uVar.f278953c = true;
                ((java.util.ArrayList) list).add(uVar);
            }
            java.lang.String str11 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.middle_tips_with_background.text");
            if (str11 == null) {
                str11 = "";
            }
            vVar.f278963j = str11;
            java.lang.String str12 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.pay_recepit_middle_tips_word");
            if (str12 == null) {
                str12 = "";
            }
            vVar.f278964k = str12;
            int i17 = 0;
            while (true) {
                if (i17 >= 100) {
                    break;
                }
                java.lang.String str13 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
                if (i17 != 0) {
                    str13 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line" + i17;
                }
                java.lang.String str14 = (java.lang.String) d17.get(str13 + ".value.word");
                java.lang.String str15 = (java.lang.String) d17.get(str13 + ".key.word");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str14) && com.tencent.mm.sdk.platformtools.t8.K0(str15)) {
                    com.tencent.mars.xlog.Log.i("WXPayTemplateMsgContent", "visit lines: lines count=%d", java.lang.Integer.valueOf(i17));
                    break;
                }
                h45.u uVar2 = new h45.u();
                if (str14 == null) {
                    str14 = "";
                }
                uVar2.f278952b = str14;
                if (str15 == null) {
                    str15 = "";
                }
                uVar2.f278951a = str15;
                com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(str13 + ".key.hide"), 0);
                ((java.util.ArrayList) list).add(uVar2);
                i17++;
            }
        } else {
            vVar.f278960g = false;
            java.lang.String str16 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.title");
            if (str16 == null) {
                str16 = "";
            }
            vVar.f278958e = str16;
            java.lang.String str17 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.digest");
            vVar.f278956c = str17 != null ? str17 : "";
        }
        return vVar;
    }
}
