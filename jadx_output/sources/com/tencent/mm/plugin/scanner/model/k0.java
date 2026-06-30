package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public abstract class k0 {
    public static java.lang.String a(int i17) {
        return (i17 != 4 && i17 == 3) ? "wx482a4001c37e2b74" : "wxfbc915ff7c30e335";
    }

    public static e04.n3 b(java.lang.String str, int i17) {
        java.util.Map d17;
        java.util.Map d18;
        boolean z17;
        java.lang.String str2;
        e04.n3 n3Var = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        int d19 = e04.q3.d(str);
        if (d19 != 3) {
            if (d19 != 4 || str == null || (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, ya.a.SEARCH, null)) == null) {
                return null;
            }
            e04.n3 n3Var2 = new e04.n3();
            n3Var2.field_xmlType = 4;
            n3Var2.field_xml = str;
            n3Var2.f246032a = com.tencent.mm.plugin.scanner.model.b.b(d17, ".search");
            return n3Var2;
        }
        if (str != null) {
            if (str.startsWith("<productInfo")) {
                d18 = com.tencent.mm.sdk.platformtools.aa.d(str, "productInfo", null);
                z17 = true;
                str2 = ".productInfo";
            } else {
                d18 = com.tencent.mm.sdk.platformtools.aa.d(str, "product", null);
                z17 = false;
                str2 = "";
            }
            if (d18 != null) {
                n3Var = new e04.n3();
                if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) d18.get(str2.concat(".product.$type")))) {
                    n3Var.field_type = 0;
                } else {
                    n3Var.field_type = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d18.get(str2.concat(".product.$type")), 0);
                }
                java.lang.String str3 = (java.lang.String) d18.get(str2.concat(".product.id"));
                if (str3 == null) {
                    str3 = "";
                }
                n3Var.field_productid = str3;
                java.lang.String str4 = (java.lang.String) d18.get(str2.concat(".product.subtitle"));
                if (str4 == null) {
                    str4 = "";
                }
                n3Var.field_subtitle = str4;
                java.lang.String str5 = (java.lang.String) d18.get(str2.concat(".product.shareurl"));
                if (str5 == null) {
                    str5 = "";
                }
                n3Var.field_shareurl = str5;
                java.lang.String str6 = (java.lang.String) d18.get(str2.concat(".product.playurl"));
                if (str6 == null) {
                    str6 = "";
                }
                n3Var.field_playurl = str6;
                n3Var.field_xmlType = 3;
                java.lang.String str7 = (java.lang.String) d18.get(str2.concat(".product.title"));
                if (str7 == null) {
                    str7 = "";
                }
                n3Var.field_title = str7;
                java.lang.String str8 = (java.lang.String) d18.get(str2.concat(".product.thumburl"));
                if (str8 == null) {
                    str8 = "";
                }
                n3Var.field_thumburl = str8;
                java.lang.String str9 = (java.lang.String) d18.get(str2.concat(".product.source"));
                if (str9 == null) {
                    str9 = "";
                }
                n3Var.field_source = str9;
                java.lang.String str10 = (java.lang.String) d18.get(str2.concat(".product.feedbackurl"));
                if (str10 == null) {
                    str10 = "";
                }
                n3Var.field_feedbackurl = str10;
                java.lang.String str11 = (java.lang.String) d18.get(str2.concat(".product.extinfo"));
                if (str11 == null) {
                    str11 = "";
                }
                n3Var.field_extinfo = str11;
                java.lang.String str12 = (java.lang.String) d18.get(str2.concat(".product.introtitle"));
                if (str12 == null) {
                    str12 = "";
                }
                n3Var.field_introtitle = str12;
                java.lang.String str13 = (java.lang.String) d18.get(str2.concat(".product.introlink"));
                if (str13 == null) {
                    str13 = "";
                }
                n3Var.field_introlink = str13;
                n3Var.field_getaction = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d18.get(str2.concat(".product.getaction")), 0);
                java.lang.String str14 = (java.lang.String) d18.get(str2.concat(".product.certification"));
                if (str14 == null) {
                    str14 = "";
                }
                n3Var.field_certification = str14;
                java.lang.String str15 = (java.lang.String) d18.get(str2.concat(".product.headerbackgroundurl"));
                if (str15 == null) {
                    str15 = "";
                }
                n3Var.field_headerbackgroundurl = str15;
                java.lang.String str16 = (java.lang.String) d18.get(str2.concat(".product.headermask"));
                if (str16 == null) {
                    str16 = "";
                }
                n3Var.field_headermask = str16;
                java.lang.String str17 = (java.lang.String) d18.get(str2.concat(".product.detailurl"));
                if (str17 == null) {
                    str17 = "";
                }
                n3Var.field_detailurl = str17;
                java.lang.String str18 = (java.lang.String) d18.get(str2.concat(".product.certificationurl"));
                if (str18 == null) {
                    str18 = "";
                }
                n3Var.field_certificationurl = str18;
                java.lang.String str19 = (java.lang.String) d18.get(str2.concat(".product.exposeurl"));
                if (str19 == null) {
                    str19 = "";
                }
                n3Var.field_exposeurl = str19;
                n3Var.f246032a = com.tencent.mm.plugin.scanner.model.b.b(d18, str2.concat(".product"));
                java.lang.String concat = str2.concat(".product");
                e04.m3 m3Var = new e04.m3();
                n3Var.f246033b = m3Var;
                m3Var.f246025a = new java.util.LinkedList();
                java.lang.String str20 = concat + ".bannerlist.banner";
                int i18 = 0;
                while (i18 < 1000) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str20);
                    sb6.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
                    java.lang.String str21 = (java.lang.String) d18.get(sb6.toString() + ".link");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str21)) {
                        break;
                    }
                    e04.k3 k3Var = new e04.k3();
                    k3Var.f246005a = str21;
                    n3Var.f246033b.f246025a.add(k3Var);
                    i18++;
                }
                n3Var.f246033b.f246026b = new java.util.LinkedList();
                java.lang.String str22 = concat + ".detaillist.detail";
                int i19 = 0;
                while (i19 < 1000) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str22);
                    sb7.append(i19 > 0 ? java.lang.Integer.valueOf(i19) : "");
                    java.lang.String sb8 = sb7.toString();
                    java.lang.String str23 = (java.lang.String) d18.get(sb8 + ".title");
                    java.lang.String str24 = (java.lang.String) d18.get(sb8 + ".desc");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str23) && com.tencent.mm.sdk.platformtools.t8.K0(str24)) {
                        break;
                    }
                    e04.l3 l3Var = new e04.l3();
                    l3Var.f246020a = str23;
                    l3Var.f246021b = str24;
                    n3Var.f246033b.f246026b.add(l3Var);
                    i19++;
                }
                java.lang.String str25 = (java.lang.String) d18.get(str2.concat(".functionType"));
                if (com.tencent.mm.sdk.platformtools.t8.K0(str25)) {
                    n3Var.field_functionType = i17;
                } else {
                    n3Var.field_functionType = com.tencent.mm.sdk.platformtools.t8.P(str25, 0);
                }
                if (z17) {
                    n3Var.field_xml = str;
                } else {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder(256);
                    sb9.append("<productInfo>");
                    sb9.append(str);
                    sb9.append("<functionType>" + n3Var.field_functionType + "</functionType>");
                    sb9.append("</productInfo>");
                    n3Var.field_xml = sb9.toString();
                }
            }
        }
        return n3Var;
    }

    public static java.lang.String c(android.content.Context context, e04.n3 n3Var) {
        ot0.q qVar = new ot0.q();
        qVar.f348646d = a(n3Var.field_functionType);
        qVar.f348654f = n3Var.field_title;
        qVar.f348658g = n3Var.field_source;
        qVar.f348666i = 10;
        qVar.f348674k = n3Var.field_shareurl;
        qVar.f348662h = "";
        qVar.H = e04.q3.b(context, n3Var.field_type);
        qVar.f348734z = n3Var.field_thumburl;
        qVar.f348643c0 = n3Var.field_type;
        qVar.f348647d0 = e04.q3.a(n3Var);
        return ot0.q.u(qVar, null, null);
    }
}
