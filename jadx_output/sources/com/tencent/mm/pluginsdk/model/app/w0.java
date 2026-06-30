package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes5.dex */
public abstract class w0 {
    public static final java.lang.String a(int i17, java.lang.String str) {
        long c17 = c01.id.c();
        if (str == null || r26.n0.N(str)) {
            return "";
        }
        int length = str.length();
        l15.c cVar = new l15.c();
        cVar.fromXml(str);
        ez.v0 v0Var = ez.v0.f257777a;
        v05.b k17 = cVar.k();
        if (!v0Var.j(java.lang.Integer.valueOf(k17 != null ? k17.getInteger(k17.f368365d + 6) : 0)) || !te5.h.f418649a.c()) {
            return str;
        }
        r15.b l17 = cVar.l();
        if (l17 != null) {
            l17.p(((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).hj(l17.l()));
            cVar.r(l17);
        }
        java.lang.String xml = cVar.toXml();
        com.tencent.mars.xlog.Log.i("MicroMsg.Xml.AppMsgSerializeUtil", "trim file xml source:" + i17 + " before:" + length + " after:" + xml.length() + " trimPer: %.02f cost:" + (c01.id.c() - c17), java.lang.Float.valueOf(((length - r2) * 100.0f) / length));
        return xml;
    }

    public static final java.lang.String b(int i17, java.lang.String str, boolean z17, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = "";
        if ((str2 == null || r26.n0.N(str2)) || str == null) {
            return "";
        }
        try {
            if (!com.tencent.mm.storage.z3.R4(str) || z17) {
                str3 = str2;
            } else {
                java.util.List g17 = new r26.t("\n").g(str2, 2);
                str4 = ((java.lang.String) g17.get(0)) + '\n';
                str3 = (java.lang.String) g17.get(1);
            }
            return str4 + d(i17, str3);
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            int length = str2.length();
            if (length > 500) {
                length = 500;
            }
            objArr[1] = str2.subSequence(0, length);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Xml.AppMsgSerializeUtil", e17, "trimMsgContentUrlXml source:%s originXml:%s", objArr);
            return str2;
        }
    }

    public static final java.lang.String c(int i17, java.lang.String str, boolean z17, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = "";
        if ((str2 == null || r26.n0.N(str2)) || str == null) {
            return "";
        }
        try {
            if (!com.tencent.mm.storage.z3.R4(str) || z17) {
                str3 = str2;
            } else {
                java.util.List g17 = new r26.t("\n").g(str2, 2);
                str4 = ((java.lang.String) g17.get(0)) + '\n';
                str3 = (java.lang.String) g17.get(1);
            }
            return str4 + a(i17, str3);
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            int length = str2.length();
            if (length > 500) {
                length = 500;
            }
            objArr[1] = str2.subSequence(0, length);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Xml.AppMsgSerializeUtil", e17, "trimMsgContentUrlXml source:%s originXml:%s", objArr);
            return str2;
        }
    }

    public static final java.lang.String d(int i17, java.lang.String str) {
        long c17 = c01.id.c();
        if (str == null || r26.n0.N(str)) {
            return "";
        }
        int length = str.length();
        l15.c cVar = new l15.c();
        cVar.fromXml(str);
        java.lang.String xml = cVar.toXml();
        com.tencent.mars.xlog.Log.i("MicroMsg.Xml.AppMsgSerializeUtil", "trim url xml source:" + i17 + " before:" + length + " after:" + xml.length() + " trimPer: %.02f cost:" + (c01.id.c() - c17), java.lang.Float.valueOf(((length - r3) * 100.0f) / length));
        return xml;
    }
}
