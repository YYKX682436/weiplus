package va3;

/* loaded from: classes9.dex */
public class o0 extends c01.l implements com.tencent.mm.modelbase.i1 {
    @Override // c01.l, com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        int i17;
        java.lang.StringBuffer stringBuffer;
        java.lang.String str;
        double F;
        double F2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.j4 j4Var = p0Var.f70726a;
        if (j4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TrackMsgExtension", "onPreAddMessage cmdAM is null");
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        java.lang.String g18 = x51.j1.g(j4Var.f377559f);
        java.lang.String str5 = ((java.lang.String) gm0.j1.u().c().l(2, null)).equals(g17) ? g18 : g17;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(x51.j1.g(j4Var.f377561h), "sysmsg", null);
        if (d17 == null) {
            return null;
        }
        try {
            stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("talk  " + str5 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            stringBuffer.append("from fromUser " + g17 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            stringBuffer.append("from toUser " + g18 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            str = (java.lang.String) d17.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.addr");
            java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.latitude");
            F = str6 == null ? 0.0d : com.tencent.mm.sdk.platformtools.t8.F(str6, 0.0d);
            stringBuffer.append("lat " + F + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            java.lang.String str7 = (java.lang.String) d17.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.longitude");
            F2 = str7 == null ? 0.0d : com.tencent.mm.sdk.platformtools.t8.F(str7, 0.0d);
            stringBuffer.append("lng " + F2 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            i17 = 0;
        } catch (java.lang.Exception e17) {
            e = e17;
            i17 = 0;
        }
        try {
            stringBuffer.append("times " + com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.trackmsg.trackroominfo.timestamp"), 0) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            int i18 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(".sysmsg.trackmsg.trackroominfo.trackmemberlist.member");
                sb6.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
                java.lang.String str8 = (java.lang.String) d17.get(sb6.toString() + ".username");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                    break;
                }
                double d18 = F;
                i18++;
                linkedList.add(str8);
                F = d18;
            }
            stringBuffer.append("userNameList size " + linkedList.size() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("xml : ");
            sb7.append(stringBuffer.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.TrackMsgExtension", sb7.toString());
        } catch (java.lang.Exception e18) {
            e = e18;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackMsgExtension", e, "", new java.lang.Object[i17]);
            return null;
        }
        if (str5.equals(va3.j0.Ri().f434364v)) {
            str2 = c(str5, linkedList);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str3 = str2;
                str4 = f(str5, linkedList);
                va3.j0.Ui().g(str5, linkedList, F, F2, str, str3, str4);
                return null;
            }
        } else {
            str2 = null;
        }
        str3 = str2;
        str4 = null;
        va3.j0.Ui().g(str5, linkedList, F, F2, str, str3, str4);
        return null;
    }

    public final java.lang.String c(java.lang.String str, java.util.List list) {
        int i17;
        va3.v0 Ri = va3.j0.Ri();
        Ri.getClass();
        java.util.LinkedList b17 = va3.j0.Ui().b(Ri.f434364v);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            java.util.Iterator it6 = b17.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((java.lang.String) it6.next()).equals(str2)) {
                    i17 = 1;
                    break;
                }
            }
            if (i17 == 0) {
                linkedList.add(str2);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        while (i17 < linkedList.size()) {
            java.lang.String str3 = (java.lang.String) linkedList.get(i17);
            if (!str3.equals(c01.z1.r())) {
                return str3;
            }
            i17++;
        }
        return null;
    }

    public final java.lang.String f(java.lang.String str, java.util.List list) {
        int i17;
        va3.v0 Ri = va3.j0.Ri();
        Ri.getClass();
        java.util.LinkedList b17 = va3.j0.Ui().b(Ri.f434364v);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = b17.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((java.lang.String) it6.next()).equals(str2)) {
                    i17 = 1;
                    break;
                }
            }
            if (i17 == 0) {
                linkedList.add(str2);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        while (i17 < linkedList.size()) {
            java.lang.String str3 = (java.lang.String) linkedList.get(i17);
            if (!str3.equals(c01.z1.r())) {
                return str3;
            }
            i17++;
        }
        return null;
    }
}
