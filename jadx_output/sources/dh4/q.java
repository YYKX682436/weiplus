package dh4;

/* loaded from: classes11.dex */
public class q implements com.tencent.mm.modelbase.i1 {
    public static int b(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return i17;
        }
        try {
            return java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomExtension", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }

    @Override // com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        r45.j4 j4Var = p0Var.f70726a;
        if (j4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM is null");
            return null;
        }
        int i17 = j4Var.f377560g;
        if (i17 != 56) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM.type:%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        java.lang.String g18 = ((java.lang.String) c01.d9.b().p().l(2, null)).equals(g17) ? x51.j1.g(j4Var.f377559f) : g17;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(g18, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).h0(new com.tencent.mm.storage.z3(g18));
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(x51.j1.g(j4Var.f377561h), "talkroominfo", null);
        if (d17 != null) {
            try {
                if (b((java.lang.String) d17.get(".talkroominfo.tracksysmsgtype"), 0) == 0) {
                    b((java.lang.String) d17.get(".talkroominfo.sysmsgtype"), 0);
                    z17 = true;
                } else {
                    z17 = false;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                b((java.lang.String) d17.get(".talkroominfo.membersize"), 0);
                int i18 = 0;
                while (true) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(".talkroominfo.memberlist.member");
                    sb6.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
                    java.lang.String sb7 = sb6.toString();
                    java.lang.String str3 = (java.lang.String) d17.get(sb7 + ".username");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        break;
                    }
                    int b17 = b((java.lang.String) d17.get(sb7 + ".memberid"), 0);
                    r45.nk6 nk6Var = new r45.nk6();
                    nk6Var.f381474e = str3;
                    nk6Var.f381473d = b17;
                    linkedList.add(nk6Var);
                    i18++;
                }
                if (g18.equals(dh4.l.Di().f232516h)) {
                    java.lang.String c17 = c(g18, linkedList);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                        str = c17;
                        str2 = f(g18, linkedList);
                    } else {
                        str = c17;
                        str2 = null;
                    }
                } else {
                    str = null;
                    str2 = null;
                }
                dh4.l.Ni().g(g18, linkedList, str, str2, z17 ? 0 : 1);
                return null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomExtension", "parsing memList xml failed");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomExtension", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public final java.lang.String c(java.lang.String str, java.util.List list) {
        int i17;
        java.util.List k17 = dh4.l.Di().k();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            r45.nk6 nk6Var = (r45.nk6) it.next();
            java.util.Iterator it6 = k17.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((r45.nk6) it6.next()).f381474e.equals(nk6Var.f381474e)) {
                    i17 = 1;
                    break;
                }
            }
            if (i17 == 0) {
                linkedList.add(nk6Var.f381474e);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        while (i17 < linkedList.size()) {
            java.lang.String str2 = (java.lang.String) linkedList.get(i17);
            if (!str2.equals(c01.z1.r())) {
                return str2;
            }
            i17++;
        }
        return null;
    }

    public final java.lang.String f(java.lang.String str, java.util.List list) {
        int i17;
        java.util.List k17 = dh4.l.Di().k();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = k17.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            r45.nk6 nk6Var = (r45.nk6) it.next();
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((r45.nk6) it6.next()).f381474e.equals(nk6Var.f381474e)) {
                    i17 = 1;
                    break;
                }
            }
            if (i17 == 0) {
                linkedList.add(nk6Var.f381474e);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        while (i17 < linkedList.size()) {
            java.lang.String str2 = (java.lang.String) linkedList.get(i17);
            if (!str2.equals(c01.z1.r())) {
                return str2;
            }
            i17++;
        }
        return null;
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
