package q72;

/* loaded from: classes9.dex */
public abstract class b {
    public static r45.qp0 a(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f384162d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".itemshowtype"), -1);
        qp0Var.f384176u = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".ispaysubscribe"), -1);
        qp0Var.f384163e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".nativepage"), 0);
        qp0Var.f384164f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".width"), 0);
        qp0Var.f384165g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".height"), 0);
        qp0Var.f384166h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".pubtime"), 0);
        qp0Var.f384167i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".duration"), 0);
        qp0Var.f384171p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".funcflag"), 0);
        qp0Var.f384168m = (java.lang.String) map.get(str + ".vid");
        qp0Var.f384169n = (java.lang.String) map.get(str + ".srcusername");
        qp0Var.f384170o = (java.lang.String) map.get(str + ".srcdisplayname");
        qp0Var.f384173r = (java.lang.String) map.get(str + ".cover");
        return qp0Var;
    }

    public static r45.qp0 b(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f384168m = (java.lang.String) map.get(str + ".vid");
        qp0Var.f384175t = (java.lang.String) map.get(str + ".videourl");
        qp0Var.f384174s = (java.lang.String) map.get(str + ".mpurl");
        qp0Var.f384169n = (java.lang.String) map.get(str + ".bizusrname");
        qp0Var.f384170o = (java.lang.String) map.get(str + ".biznickname");
        qp0Var.f384173r = (java.lang.String) map.get(str + ".thumburl");
        qp0Var.f384164f = (int) com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(str + ".thumbwidth"), 0.0f);
        qp0Var.f384165g = (int) com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(str + ".thumbheight"), 0.0f);
        qp0Var.f384167i = (int) com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(str + ".duration"), 0.0f);
        return qp0Var;
    }

    public static java.lang.String c(r45.qp0 qp0Var) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<appmsgshareitem><vid>");
        if (qp0Var == null) {
            return "";
        }
        stringBuffer.append(com.tencent.mm.sdk.platformtools.t8.p(qp0Var.f384168m));
        stringBuffer.append("</vid><srcusername>");
        stringBuffer.append(com.tencent.mm.sdk.platformtools.t8.p(qp0Var.f384169n));
        stringBuffer.append("</srcusername><srcdisplayname>");
        stringBuffer.append(com.tencent.mm.sdk.platformtools.t8.p(qp0Var.f384170o));
        stringBuffer.append("</srcdisplayname><cover>");
        stringBuffer.append(com.tencent.mm.sdk.platformtools.t8.p(qp0Var.f384173r));
        stringBuffer.append("</cover><itemshowtype>");
        stringBuffer.append(qp0Var.f384162d);
        stringBuffer.append("</itemshowtype><ispaysubscribe>");
        stringBuffer.append(qp0Var.f384176u);
        stringBuffer.append("</ispaysubscribe><nativepage>");
        stringBuffer.append(qp0Var.f384163e);
        stringBuffer.append("</nativepage><width>");
        stringBuffer.append(qp0Var.f384164f);
        stringBuffer.append("</width><height>");
        stringBuffer.append(qp0Var.f384165g);
        stringBuffer.append("</height><pubtime>");
        stringBuffer.append(qp0Var.f384166h);
        stringBuffer.append("</pubtime><duration>");
        stringBuffer.append(qp0Var.f384167i);
        stringBuffer.append("</duration><funcflag>");
        stringBuffer.append(qp0Var.f384171p);
        stringBuffer.append("</funcflag></appmsgshareitem>");
        return stringBuffer.toString();
    }
}
