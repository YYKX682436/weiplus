package k40;

@j95.b
/* loaded from: classes8.dex */
public final class f extends i95.w implements l40.e {
    public java.lang.String Ai(java.lang.String username, java.lang.String str) {
        kotlin.jvm.internal.o.g(username, "username");
        int i17 = 0;
        m92.b j37 = g92.a.j3(g92.b.f269769e, username, false, 2, null);
        int i18 = j37 != null ? !j37.w0() ? 1 : 0 : 0;
        if (j37 != null && j37.w0()) {
            i17 = 1;
        }
        com.tencent.mars.xlog.Log.i("FinderAccountAccessService", "username=" + username + " isOwner=" + i18 + " isClub=" + i17 + " url=" + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isOwner=");
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("isClub=");
        sb8.append(i17);
        java.lang.String a17 = com.tencent.mm.ui.tools.qd.a(str, sb7, sb8.toString());
        kotlin.jvm.internal.o.f(a17, "safelyUrlConcatParam(...)");
        return a17;
    }

    public int Bi(android.content.Context context, java.lang.String finderUserName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        if (finderUserName.length() == 0) {
            finderUserName = xy2.c.e(context);
        }
        return Di(finderUserName);
    }

    public int Di(java.lang.String finderUsername) {
        int i17;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127923s1).getValue()).r()).intValue();
        if (intValue != -1) {
            return intValue;
        }
        boolean gl6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).gl();
        com.tencent.mars.xlog.Log.i("FinderAccountAccessService", "showPostEntry :" + gl6 + " finderUsername:" + finderUsername);
        if (gl6) {
            m92.b b17 = g92.b.f269769e.b1(finderUsername, true);
            if (b17 != null) {
                if ((b17.u0().getInteger(1) & 2) != 0) {
                    i17 = 5;
                } else {
                    int i18 = b17.field_spamStatus;
                    if (i18 == 1) {
                        i17 = 4;
                    } else {
                        i17 = (i18 != 2 ? 0 : 1) != 0 ? 6 : 3;
                    }
                }
                r1 = i17;
            } else {
                r1 = 2;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderAccountAccessService", "resultState = " + r1);
        return r1;
    }

    public java.util.ArrayList Ni() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList list = g92.b.f269769e.k2().d().getList(25);
        kotlin.jvm.internal.o.f(list, "getExpt_buffers(...)");
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) obj;
            if (gVar != null && gVar.f192156a.length > 0) {
                try {
                    r45.l21 l21Var = new r45.l21();
                    l21Var.fromProtobuf(gVar.g());
                    arrayList.add(l21Var);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.i("FinderAccountAccessService", "[getExptBuffers] index:" + i17 + " buf:" + android.util.Base64.encodeToString(gVar.g(), 0) + " err:" + th6.getMessage());
                }
            }
            i17 = i18;
        }
        return arrayList;
    }

    public r45.ct4 Ri(java.lang.String finderUsername, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getMyFinderTabShowWording] finderUsername:");
        sb6.append(finderUsername);
        sb6.append(" position:");
        sb6.append(i17);
        sb6.append(" size:");
        g92.b bVar = g92.b.f269769e;
        java.util.LinkedList list = bVar.k2().d().getList(28);
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderAccountAccessService", sb6.toString());
        java.util.LinkedList list2 = bVar.k2().d().getList(28);
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.ct4) obj).getString(0), finderUsername)) {
                    break;
                }
            }
            r45.ct4 ct4Var = (r45.ct4) obj;
            if (ct4Var != null) {
                m92.b j37 = g92.a.j3(g92.b.f269769e, finderUsername, false, 2, null);
                r45.gc4 gc4Var = j37 != null ? j37.field_myFinderTabShowWordingExt : null;
                long j17 = 0;
                if (i17 != 0) {
                    if (i17 == 1 && gc4Var != null) {
                        j17 = gc4Var.getLong(1);
                    }
                } else if (gc4Var != null) {
                    j17 = gc4Var.getLong(0);
                }
                if (Vi(ct4Var.getLong(2) * 1000) && !Vi(j17)) {
                    return ct4Var;
                }
            }
        }
        return null;
    }

    public java.lang.String Ui(android.content.Context context) {
        return g92.b.f269769e.y4(context);
    }

    public final boolean Vi(long j17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        long timeInMillis = j17 - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        return timeInMillis >= 0 && timeInMillis < 86400000;
    }

    public void Zi(java.lang.String finderUsername, java.lang.String source) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(source, "source");
        g92.b.f269769e.P0(finderUsername, source);
    }

    public java.lang.String aj() {
        return g92.b.f269769e.U();
    }

    public void bj(java.lang.String finderUsername, long j17, int i17) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        g92.b bVar = g92.b.f269769e;
        m92.c cVar = new m92.c(finderUsername);
        r45.gc4 gc4Var = cVar.field_myFinderTabShowWordingExt;
        if (gc4Var == null) {
            gc4Var = new r45.gc4();
        }
        if (i17 == 0) {
            gc4Var.set(0, java.lang.Long.valueOf(j17));
        } else if (i17 == 1) {
            gc4Var.set(1, java.lang.Long.valueOf(j17));
        }
        cVar.field_myFinderTabShowWordingExt = gc4Var;
        bVar.C(cVar, m92.j.C);
    }

    public void wi(yz5.l call) {
        kotlin.jvm.internal.o.g(call, "call");
        g92.b.f269769e.h6().f324986i.add(new k40.e(call));
    }
}
