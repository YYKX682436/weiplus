package e04;

/* loaded from: classes15.dex */
public abstract class q3 {
    public static java.lang.String a(e04.n3 n3Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_productid)) {
            java.lang.String str = n3Var.field_xml;
            if (str == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Scanner.ScanXmlHelper", "product.field_xml == null in getProductInfoXml()");
                return "";
            }
            if (str.startsWith("<productInfo")) {
                return n3Var.field_xml;
            }
            sb6.append("<productInfo>");
            sb6.append(n3Var.field_xml);
            sb6.append("<functionType>" + n3Var.field_functionType + "</functionType>");
            sb6.append("</productInfo>");
        } else {
            sb6.append("<productInfo><product type=\"" + n3Var.field_type + "\">");
            sb6.append("<id>" + com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_productid) + "</id>");
            sb6.append("<title>" + com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_title) + "</title>");
            sb6.append("<subtitle>" + com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_subtitle) + "</subtitle>");
            sb6.append("<thumburl>" + com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_thumburl) + "</thumburl>");
            sb6.append("<source>" + com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_source) + "</source>");
            sb6.append("<shareurl>" + com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_shareurl) + "</shareurl>");
            sb6.append("<playurl>" + com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_playurl) + "</playurl>");
            sb6.append("<extinfo>" + com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_extinfo) + "</extinfo>");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<getaction>");
            sb7.append(com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_getaction + ""));
            sb7.append("</getaction>");
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("<certification>");
            sb8.append(com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_certification + ""));
            sb8.append("</certification>");
            sb6.append(sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("<headerbackgroundurl>");
            sb9.append(com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_headerbackgroundurl + ""));
            sb9.append("</headerbackgroundurl>");
            sb6.append(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("<headermask>");
            sb10.append(com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_headermask + ""));
            sb10.append("</headermask>");
            sb6.append(sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("<detailurl>");
            sb11.append(com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_detailurl + ""));
            sb11.append("</detailurl>");
            sb6.append(sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("<certificationurl>");
            sb12.append(com.tencent.mm.sdk.platformtools.t8.p(n3Var.field_certificationurl + ""));
            sb12.append("</certificationurl>");
            sb6.append(sb12.toString());
            sb6.append("</product>");
            sb6.append("<functionType>" + n3Var.field_functionType + "</functionType>");
            sb6.append("</productInfo>");
        }
        return sb6.toString();
    }

    public static java.lang.String b(android.content.Context context, int i17) {
        if (context == null || i17 < 0) {
            return "";
        }
        if (i17 == 0) {
            context.getString(com.tencent.mm.R.string.iam);
        } else if (i17 == 1) {
            context.getString(com.tencent.mm.R.string.iaf);
        } else if (i17 == 2) {
            context.getString(com.tencent.mm.R.string.ial);
        } else if (i17 == 3) {
            context.getString(com.tencent.mm.R.string.iag);
        }
        return context.getString(com.tencent.mm.R.string.iam);
    }

    public static e04.j3 c(java.lang.String str) {
        java.util.Map d17;
        if (str == null || (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, ya.a.SEARCH, null)) == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".search.query");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) d17.get(".search.extInfo");
        return new e04.j3(str2, str3 != null ? str3 : "");
    }

    public static int d(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        java.lang.String trim = str.trim();
        if (trim.startsWith("<user")) {
            return 1;
        }
        if (trim.startsWith("<url")) {
            return 2;
        }
        if (trim.startsWith("<product")) {
            return 3;
        }
        return trim.startsWith("<search") ? 4 : 0;
    }
}
