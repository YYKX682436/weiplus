package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes9.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f137498a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f137499b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f137500c = new java.util.ArrayList();

    public static com.tencent.mm.plugin.fts.logic.d3 a(java.lang.String str) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        com.tencent.mm.plugin.fts.logic.d3 d3Var = new com.tencent.mm.plugin.fts.logic.d3();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("TemplateMsgContent", "values map is null.");
            return d3Var;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        d3Var.f137498a = str2;
        d3Var.f137499b = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.title");
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
            com.tencent.mm.plugin.fts.logic.c3 c3Var = new com.tencent.mm.plugin.fts.logic.c3();
            c3Var.f137482a = str4;
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(str3 + ".key.hide"), 0);
            ((java.util.ArrayList) d3Var.f137500c).add(c3Var);
            i17++;
        }
        return d3Var;
    }
}
