package lp3;

@j95.b
/* loaded from: classes5.dex */
public class l extends i95.w implements mp3.j, com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f320291g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_send_pat_frequency_limit_interval, 10000);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f320292h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final int f320293i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_pat_send_pat_msg_delay_interval, 5000);

    /* renamed from: m, reason: collision with root package name */
    public static final int f320294m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_pat_avatar_revoke_pat_msg_interval, 10000);

    /* renamed from: e, reason: collision with root package name */
    public op3.c f320296e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f320295d = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f320297f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new lp3.i(this));

    public static void Ni(com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct sendPatActionReportStruct) {
        if (sendPatActionReportStruct != null) {
            java.lang.String str = sendPatActionReportStruct.f60219f;
            java.lang.String str2 = sendPatActionReportStruct.f60220g;
            sendPatActionReportStruct.f60231r = sendPatActionReportStruct.b("FromStatusID", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str), true);
            sendPatActionReportStruct.f60232s = sendPatActionReportStruct.b("ToStatusID", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str2), true);
            sendPatActionReportStruct.f60233t = sendPatActionReportStruct.b("FromStatusIcon", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ui(str), true);
            sendPatActionReportStruct.f60234u = sendPatActionReportStruct.b("ToStatusIcon", ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ui(str2), true);
        }
    }

    public boolean Ai(long j17, long j18, java.lang.String str) {
        r45.l55 l55Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "delete svr pat msg (%d,%d)", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.getMsgId() != j17 || j18 == 0) {
            return false;
        }
        r45.k55 e17 = bm5.d1.e(Li.j());
        java.util.LinkedList linkedList = e17.f378386e;
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "pat record list size %d", java.lang.Integer.valueOf(linkedList.size()));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                l55Var = null;
                break;
            }
            l55Var = (r45.l55) it.next();
            if (l55Var.f379157i == j18) {
                break;
            }
        }
        if (l55Var == null) {
            return false;
        }
        linkedList.remove(l55Var);
        if (linkedList.isEmpty()) {
            pt0.f0.P7(Li.Q0(), Li.getMsgId());
        } else {
            Li.d1(mj(e17));
            Li.setType(922746929);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        }
        return true;
    }

    public void Bi(java.lang.String str, long j17) {
        long j18;
        com.tencent.mm.storage.f9 o27;
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "do revoke svr pat msg %d from talker %s", java.lang.Long.valueOf(j17), str);
        r45.m55 Bi = ((lp3.r) i95.n0.c(lp3.r.class)).Bi(j17);
        if (Bi == null || (o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, (j18 = Bi.f380155d))) == null || o27.I0() != j18) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "revoke pat msg %d,%d", java.lang.Long.valueOf(o27.getMsgId()), java.lang.Long.valueOf(j17));
        Ai(o27.getMsgId(), j17, str);
    }

    public void Di(android.util.Pair pair, int i17, java.lang.String str) {
        r45.k55 e17;
        r45.l55 Ui;
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "do revoke local pat msg (%d,%d), talker:%s", pair.first, pair.second, str);
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, ((java.lang.Long) pair.first).longValue());
        if (Li.getMsgId() != ((java.lang.Long) pair.first).longValue() || (Ui = Ui((e17 = bm5.d1.e(Li.j())), ((java.lang.Long) pair.second).longValue())) == null) {
            return;
        }
        long j17 = Ui.f379157i;
        if (j17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "do revoke sent pat msg %d, svrId %d", pair.first, java.lang.Long.valueOf(j17));
            op3.a aVar = new op3.a(aj(pair), ((java.lang.Long) pair.first).longValue(), Ui.f379157i, Ui.f379155g, e17.f378385d);
            com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct revokePatActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct();
            op3.c cVar = this.f320296e;
            if (cVar != null && cVar.f347258e.equals(pair)) {
                revokePatActionReportStruct.f60012d = this.f320296e.f347255b;
            }
            revokePatActionReportStruct.f60013e = Ui.f379155g;
            revokePatActionReportStruct.f60014f = java.lang.System.currentTimeMillis();
            revokePatActionReportStruct.f60015g = revokePatActionReportStruct.b("UserName", Ui.f379152d, true);
            revokePatActionReportStruct.f60016h = revokePatActionReportStruct.b("PattedUserName", Ui.f379153e, true);
            revokePatActionReportStruct.f60017i = revokePatActionReportStruct.b("PatSuffix", lp3.p.a(Ui.f379153e), true);
            if (com.tencent.mm.storage.z3.N4(e17.f378385d)) {
                revokePatActionReportStruct.f60018j = revokePatActionReportStruct.b("ChatRoomName", e17.f378385d, true);
            }
            revokePatActionReportStruct.f60019k = i17;
            revokePatActionReportStruct.f60021m = 1;
            aVar.f347246f = revokePatActionReportStruct;
            gm0.j1.d().g(aVar);
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_PAT_FIRST_REVOKE_BOOLEAN_SYNC;
            if (c17.o(u3Var, true)) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                ((ku5.t0) ku5.t0.f312615d).g(new lp3.k(this, e17));
                return;
            }
            return;
        }
        op3.c cVar2 = this.f320296e;
        if (cVar2 == null || !cVar2.f347258e.equals(pair)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "do revoke unsent pat msg (%d,%d)", pair.first, pair.second);
        this.f320297f.removeMessages(291, this.f320296e);
        com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct sendPatActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct();
        op3.c cVar3 = this.f320296e;
        sendPatActionReportStruct.f60217d = cVar3.f347255b;
        if (com.tencent.mm.storage.z3.N4(cVar3.f347256c)) {
            sendPatActionReportStruct.f60221h = sendPatActionReportStruct.b("ChatroomName", this.f320296e.f347256c, true);
        }
        sendPatActionReportStruct.f60223j = ((java.lang.Long) pair.second).longValue() - ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ri(e17.f378385d, pair);
        sendPatActionReportStruct.f60225l = hj(this.f320296e.f347256c, pair) ? 1 : 0;
        sendPatActionReportStruct.f60226m = Vi(e17, ((java.lang.Long) pair.second).longValue()) + 1;
        sendPatActionReportStruct.f60219f = sendPatActionReportStruct.b("Username", c01.z1.r(), true);
        sendPatActionReportStruct.f60220g = sendPatActionReportStruct.b("PattedUserName", this.f320296e.f347257d, true);
        op3.c cVar4 = this.f320296e;
        sendPatActionReportStruct.f60218e = cVar4.f347254a;
        sendPatActionReportStruct.f60227n = sendPatActionReportStruct.b("PatSuffix", lp3.p.a(cVar4.f347257d), true);
        sendPatActionReportStruct.f60228o = 1;
        sendPatActionReportStruct.f60229p = i17;
        sendPatActionReportStruct.f60230q = this.f320296e.f347259f ? 1 : 0;
        Ni(sendPatActionReportStruct);
        sendPatActionReportStruct.k();
        sendPatActionReportStruct.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "delete unsent pat msg (%d,%d)", pair.first, pair.second);
        com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(str, ((java.lang.Long) pair.first).longValue());
        if (Li2.getMsgId() == ((java.lang.Long) pair.first).longValue()) {
            r45.k55 e18 = bm5.d1.e(Li2.j());
            java.util.LinkedList linkedList = e18.f378386e;
            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "before delete, pat record list size %d", java.lang.Integer.valueOf(linkedList.size()));
            r45.l55 Ui2 = Ui(e18, ((java.lang.Long) pair.second).longValue());
            if (Ui2 != null) {
                linkedList.remove(Ui2);
                if (linkedList.isEmpty()) {
                    pt0.f0.P7(Li2.Q0(), Li2.getMsgId());
                    return;
                }
                Li2.d1(mj(e18));
                Li2.setType(922746929);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(((java.lang.Long) pair.first).longValue(), Li2, true);
            }
        }
    }

    public long Ri(java.lang.String str, android.util.Pair pair) {
        java.util.List z17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().z1(str, ((java.lang.Long) pair.second).longValue(), 1);
        if (z17 != null && !z17.isEmpty() && ((com.tencent.mm.storage.f9) z17.get(0)).getMsgId() > 0) {
            if (((com.tencent.mm.storage.f9) z17.get(0)).getType() != 922746929) {
                return ((com.tencent.mm.storage.f9) z17.get(0)).getCreateTime();
            }
            r45.k55 e17 = bm5.d1.e(((com.tencent.mm.storage.f9) z17.get(0)).j());
            java.util.LinkedList linkedList = e17.f378386e;
            if (linkedList.size() == 0) {
                return 0L;
            }
            if (((java.lang.Long) pair.first).longValue() != ((com.tencent.mm.storage.f9) z17.get(0)).getMsgId()) {
                return ((r45.l55) linkedList.getLast()).f379155g;
            }
            int Vi = Vi(e17, ((java.lang.Long) pair.second).longValue());
            if (Vi > 1) {
                return ((r45.l55) linkedList.get(Vi - 1)).f379155g;
            }
        }
        return 0L;
    }

    public r45.l55 Ui(r45.k55 k55Var, long j17) {
        java.util.Iterator it = k55Var.f378386e.iterator();
        while (it.hasNext()) {
            r45.l55 l55Var = (r45.l55) it.next();
            if (l55Var.f379155g == j17) {
                return l55Var;
            }
        }
        return null;
    }

    public int Vi(r45.k55 k55Var, long j17) {
        int i17 = -1;
        for (int i18 = 0; i18 < k55Var.f378386e.size(); i18++) {
            if (((r45.l55) k55Var.f378386e.get(i18)).f379155g == j17) {
                i17 = i18;
            }
        }
        return i17;
    }

    public final java.lang.String Zi(int i17) {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i17).replaceAll("\\[", "{").replaceAll("]", "}");
    }

    public java.lang.String aj(android.util.Pair pair) {
        return c01.z1.r() + "_" + pair.first + "_" + pair.second;
    }

    public java.lang.CharSequence bj(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, int i18) {
        ot0.q v17;
        r45.k55 k55Var = new r45.k55();
        if (i17 == 889192497) {
            ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).getClass();
            k55Var = bm5.d1.e(str);
        } else if (i17 == 922746929 && (v17 = ot0.q.v(str)) != null) {
            k55Var = ((mp3.a) v17.y(mp3.a.class)).f330450b;
        }
        try {
            if (k55Var.f378386e.size() > 0) {
                r45.l55 l55Var = (r45.l55) k55Var.f378386e.getLast();
                mp3.p Ri = ((lp3.r) i95.n0.c(lp3.r.class)).Ri(l55Var, str2);
                android.text.SpannableString spannableString = new android.text.SpannableString(Ri.f330460a);
                java.util.List<mp3.o> list = Ri.f330463d;
                if (((java.util.LinkedList) list).size() > 0) {
                    for (mp3.o oVar : list) {
                        spannableString.setSpan(((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Zi(null, oVar.f330459c, bi4.c.PATMSG_NO_BG, i18), oVar.f330457a, oVar.f330458b, 17);
                    }
                }
                java.lang.String r17 = c01.z1.r();
                if (!l55Var.f379152d.equals(r17) && l55Var.f379153e.equals(r17) && l55Var.f379156h == 0) {
                    java.util.List list2 = Ri.f330461b;
                    if (!((java.util.ArrayList) list2).isEmpty()) {
                        com.tencent.mm.ui.base.span.BoldForegroundColorSpan boldForegroundColorSpan = new com.tencent.mm.ui.base.span.BoldForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                        java.lang.String string = context.getString(com.tencent.mm.R.string.f492682hg1);
                        int indexOf = Ri.f330460a.indexOf(string, ((java.lang.Integer) ((android.util.Pair) ((java.util.ArrayList) list2).get(0)).second).intValue());
                        int length = string.length() + indexOf;
                        if (length > spannableString.length()) {
                            length = spannableString.length();
                        }
                        spannableString.setSpan(boldForegroundColorSpan, indexOf, length, 17);
                    }
                }
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                return com.tencent.mm.pluginsdk.ui.span.c0.n(context, spannableString, i18);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PatMsgExtension", e17, "", new java.lang.Object[0]);
        }
        return "";
    }

    public java.lang.String cj(java.lang.String str, java.lang.String str2) {
        int i17;
        java.lang.String r17 = c01.z1.r();
        try {
            i17 = ((java.lang.Integer) lp3.p.b(str, "pat_user_suffix_version")).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PatUserMMKV", e17, "", new java.lang.Object[0]);
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "pattedUser %s, version %d", str, java.lang.Integer.valueOf(i17));
        if (str.equals(r17)) {
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null);
            return com.tencent.mm.sdk.platformtools.t8.K0(str3) ? Zi(com.tencent.mm.R.string.ii6) : i17 == 0 ? java.lang.String.format(Zi(com.tencent.mm.R.string.ii8), str3) : java.lang.String.format(Zi(com.tencent.mm.R.string.ii7), str3);
        }
        java.lang.String a17 = lp3.p.a(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "pattedUser %s, suffix %s", str, a17);
        java.lang.String u17 = com.tencent.mm.storage.z3.R4(str2) ? c01.e2.u(str2, str, true) : c01.a2.e(str);
        return com.tencent.mm.sdk.platformtools.t8.K0(a17) ? java.lang.String.format(Zi(com.tencent.mm.R.string.ii9), u17) : i17 == 0 ? java.lang.String.format(Zi(com.tencent.mm.R.string.iia), u17, a17) : java.lang.String.format(Zi(com.tencent.mm.R.string.ii_), u17, a17);
    }

    public android.util.Pair fj(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, long j17) {
        java.lang.String str5;
        r45.k55 k55Var;
        com.tencent.mm.storage.f9 q57;
        long j18;
        boolean z17;
        int i18;
        java.lang.String str6 = str;
        if (com.tencent.mm.sdk.platformtools.t8.N0(str2, str6, str3)) {
            return android.util.Pair.create(0L, 0L);
        }
        if (str6.equals(c01.z1.r())) {
            str6 = str2;
        }
        if (!com.tencent.mm.storage.z3.N4(str6) || ((com.tencent.mm.storage.d3) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).n(str6) || (q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str6)) == null || q57.getMsgId() <= 0 || q57.getType() != 922746929) {
            long m17 = c01.w9.m(str6, i17);
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            r45.k55 k55Var2 = new r45.k55();
            k55Var2.f378385d = str6;
            r45.l55 l55Var = new r45.l55();
            l55Var.f379154f = str4;
            l55Var.f379155g = m17;
            l55Var.f379152d = str2;
            l55Var.f379153e = str3;
            l55Var.f379157i = j17;
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, "");
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG;
            long t17 = c17.t(u3Var, 0L);
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT;
            int r17 = c18.r(u3Var2, 0);
            if (!str3.equals(c01.z1.r()) || com.tencent.mm.sdk.platformtools.t8.K0(v17)) {
                str5 = "";
                k55Var = k55Var2;
            } else {
                str5 = "";
                if (c01.id.c() - t17 > ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_pat_suffix_modify_tip_time_interval, 86400L) * 1000) {
                    if (r17 < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_pat_suffix_modify_tip_max_count, Integer.MAX_VALUE)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "show modify tip %s %s %s %s %s", java.lang.Long.valueOf(j17), str2, java.lang.Long.valueOf(t17), java.lang.Integer.valueOf(r17), v17);
                        l55Var.f379158m = 1;
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(c01.id.c()));
                        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(r17 + 1));
                    }
                }
                k55Var = k55Var2;
            }
            k55Var.f378386e.add(l55Var);
            ot0.q qVar = new ot0.q();
            mp3.a aVar = new mp3.a();
            aVar.f330450b = k55Var;
            qVar.f(aVar);
            qVar.f348666i = 62;
            qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
            qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
            f9Var.d1(ot0.q.u(qVar, str5, null));
            f9Var.j1(0);
            f9Var.u1(str6);
            f9Var.o1(j17);
            f9Var.e1(m17);
            f9Var.setType(922746929);
            ((lp3.r) i95.n0.c(lp3.r.class)).wi(f9Var.I0(), l55Var);
            long x17 = c01.w9.x(f9Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "insert pat msg %d %s %s", java.lang.Long.valueOf(x17), java.lang.Integer.toHexString(f9Var.getType()), java.lang.Integer.toHexString(922746929));
            return android.util.Pair.create(java.lang.Long.valueOf(x17), java.lang.Long.valueOf(m17));
        }
        long j19 = i17 * 1000;
        if (j19 <= q57.getCreateTime()) {
            j19 = q57.getCreateTime() + 1;
        }
        r45.l55 l55Var2 = new r45.l55();
        l55Var2.f379154f = str4;
        l55Var2.f379155g = j19;
        l55Var2.f379152d = str2;
        l55Var2.f379153e = str3;
        l55Var2.f379157i = j17;
        r45.k55 e17 = bm5.d1.e(q57.j());
        e17.f378385d = q57.Q0();
        java.util.LinkedList linkedList = e17.f378386e;
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "All svrIds in recordList:");
        for (java.util.Iterator it = linkedList.iterator(); it.hasNext(); it = it) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "svrId: " + ((r45.l55) it.next()).f379157i);
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                j18 = j19;
                z17 = true;
                break;
            }
            long j27 = ((r45.l55) it6.next()).f379157i;
            j18 = j19;
            long j28 = l55Var2.f379157i;
            if (j27 == j28 && j27 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "checkPatSvrId failed, svrId %d already exists", java.lang.Long.valueOf(j28));
                z17 = false;
                break;
            }
            j19 = j18;
        }
        if (z17) {
            linkedList.add(l55Var2);
        }
        ot0.q qVar2 = new ot0.q();
        mp3.a aVar2 = new mp3.a();
        aVar2.f330450b = e17;
        qVar2.f(aVar2);
        qVar2.f348666i = 62;
        qVar2.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar2.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        q57.d1(ot0.q.u(qVar2, "", null));
        long msgId = q57.getMsgId();
        if (msgId != 0) {
            i18 = 1;
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(msgId, q57, true);
        } else {
            i18 = 1;
        }
        ((lp3.r) i95.n0.c(lp3.r.class)).wi(q57.I0(), l55Var2);
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "update pat msg %d, index %d", java.lang.Long.valueOf(msgId), java.lang.Integer.valueOf(linkedList.size() - i18));
        return android.util.Pair.create(java.lang.Long.valueOf(msgId), java.lang.Long.valueOf(j18));
    }

    public final boolean hj(java.lang.String str, android.util.Pair pair) {
        return ((java.lang.Long) pair.second).longValue() <= ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().w3(str);
    }

    public boolean ij(long j17, java.lang.String str) {
        java.util.Set set = this.f320295d;
        if (((java.util.HashSet) set).contains(java.lang.Long.valueOf(j17))) {
            return true;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.getMsgId() > 0) {
            java.util.Iterator it = bm5.d1.e(Li.j()).f378386e.iterator();
            boolean z17 = true;
            while (it.hasNext()) {
                z17 &= ((r45.l55) it.next()).f379156h == 1;
            }
            if (z17) {
                ((java.util.HashSet) set).add(java.lang.Long.valueOf(j17));
                return true;
            }
        }
        return false;
    }

    public java.lang.String mj(r45.k55 k55Var) {
        ot0.q qVar = new ot0.q();
        mp3.a aVar = new mp3.a();
        aVar.f330450b = k55Var;
        qVar.f(aVar);
        qVar.f348666i = 62;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        return ot0.q.u(qVar, null, null);
    }

    public r45.k55 nj(java.lang.String str) {
        return bm5.d1.e(str);
    }

    public java.util.List oj(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || f9Var.getType() != 922746929) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.k55 e17 = bm5.d1.e(f9Var.j());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Long.valueOf(f9Var.getMsgId());
        java.util.LinkedList linkedList = e17.f378386e;
        objArr[1] = java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "split pat msg [%d] to %d child msg", objArr);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.l55 l55Var = (r45.l55) it.next();
            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
            r45.k55 k55Var = new r45.k55();
            k55Var.f378385d = e17.f378385d;
            bm5.c1 c1Var = new bm5.c1();
            c1Var.f379154f = l55Var.f379154f;
            c1Var.f22556o = l55Var.f379154f;
            c1Var.f379155g = l55Var.f379155g;
            c1Var.f379152d = l55Var.f379152d;
            c1Var.f379153e = l55Var.f379153e;
            c1Var.f379157i = l55Var.f379157i;
            k55Var.f378386e.add(c1Var);
            ot0.q qVar = new ot0.q();
            mp3.a aVar = new mp3.a();
            aVar.f330450b = k55Var;
            qVar.f(aVar);
            qVar.f348666i = 62;
            qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
            qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
            f9Var2.d1(ot0.q.u(qVar, "", null));
            f9Var2.setType(922746929);
            f9Var2.j1(0);
            f9Var2.u1(f9Var.Q0());
            f9Var2.o1(l55Var.f379157i);
            f9Var2.e1(l55Var.f379155g);
            arrayList.add(f9Var2);
        }
        return arrayList;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        gm0.j1.d().a(849, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.k55 e17;
        r45.l55 Ui;
        r45.k55 e18;
        r45.l55 Ui2;
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        op3.b bVar = (op3.b) m1Var;
        com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct sendPatActionReportStruct = bVar.f347253g;
        if (sendPatActionReportStruct != null) {
            sendPatActionReportStruct.f60222i = i18;
        }
        int i19 = ((r45.kz5) bVar.f347250d.f70710a.f70684a).f379047h;
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "onSceneEnd, pat scene %d", java.lang.Integer.valueOf(i19));
        if (i17 == 0 && i18 == 0) {
            android.util.Pair pair = bVar.f347252f;
            com.tencent.mm.modelbase.o oVar = bVar.f347250d;
            com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
            java.lang.String str2 = ((r45.kz5) fVar).f379044e;
            java.lang.String str3 = ((r45.kz5) fVar).f379045f;
            if (i19 == 1) {
                java.lang.String str4 = ((r45.lz5) oVar.f70711b.f70700a).f380010e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str5 = str4 == null ? "" : str4;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    try {
                        lp3.p.c(str3, "pat_user_suffix_content", str5);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PatUserMMKV", e19, "", new java.lang.Object[0]);
                    }
                    if (((java.lang.Long) pair.first).longValue() > 0) {
                        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str2, ((java.lang.Long) pair.first).longValue());
                        if (Li.getMsgId() == ((java.lang.Long) pair.first).longValue() && (Ui2 = Ui((e18 = bm5.d1.e(Li.j())), ((java.lang.Long) pair.second).longValue())) != null) {
                            if (str3.equalsIgnoreCase(Ui2.f379153e)) {
                                Ui2.f379154f = cj(str3, ((r45.kz5) bVar.f347250d.f70710a.f70684a).f379044e);
                                Li.d1(mj(e18));
                                Li.setType(922746929);
                                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(((java.lang.Long) pair.first).longValue(), Li, true);
                                com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "update pat msg suffix %d, createTime %d", pair.first, pair.second);
                            } else {
                                com.tencent.mars.xlog.Log.w("MicroMsg.PatMsgExtension", "update pat msg suffix %d, pattedUser (%s,%s) not match", pair.first, str3, Ui2.f379153e);
                            }
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null))) {
                            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_INTRO_BOOLEAN_SYNC;
                            if (c17.o(u3Var, true)) {
                                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                                java.lang.String Q0 = Li.Q0();
                                java.lang.String format = java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492686hg5), "<_wc_custom_link_ href='weixin://jump/setpat/'>", "</_wc_custom_link_>");
                                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                                f9Var.j1(0);
                                f9Var.u1(Q0);
                                f9Var.r1(3);
                                f9Var.d1(format);
                                f9Var.e1(c01.w9.m(Q0, java.lang.System.currentTimeMillis() / 1000));
                                f9Var.setType(10000);
                                f9Var.f1(f9Var.w0());
                                c01.w9.x(f9Var);
                                op3.c cVar = this.f320296e;
                                if (cVar != null) {
                                    cVar.f347259f = true;
                                }
                            }
                        }
                    }
                    com.tencent.mm.autogen.events.PatSuccessEvent patSuccessEvent = new com.tencent.mm.autogen.events.PatSuccessEvent();
                    patSuccessEvent.f54605g.getClass();
                    patSuccessEvent.f54605g.getClass();
                    patSuccessEvent.f54605g.getClass();
                    patSuccessEvent.e();
                }
            } else {
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(((r45.lz5) oVar.f70711b.f70700a).f380009d, "sysmsg", null);
                int D1 = d17 != null ? com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".sysmsg.pat.patsuffixversion"), 0) : 0;
                com.tencent.mm.sdk.platformtools.o4 o4Var = lp3.p.f320302a;
                try {
                    lp3.p.c(str3, "pat_user_suffix_version", java.lang.Integer.valueOf(D1));
                } catch (org.json.JSONException e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PatUserMMKV", e27, "", new java.lang.Object[0]);
                }
                long j17 = ((r45.lz5) bVar.f347250d.f70711b.f70700a).f380011f;
                if (j17 != 0 && ((java.lang.Long) pair.first).longValue() > 0) {
                    com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(str2, ((java.lang.Long) pair.first).longValue());
                    com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "update pat msg %d, svrId %d", pair.first, java.lang.Long.valueOf(j17));
                    if (Li2.getMsgId() == ((java.lang.Long) pair.first).longValue() && (Ui = Ui((e17 = bm5.d1.e(Li2.j())), ((java.lang.Long) pair.second).longValue())) != null) {
                        if (str3.equalsIgnoreCase(Ui.f379153e)) {
                            Ui.f379157i = j17;
                            if (Li2.I0() == 0) {
                                Li2.o1(j17);
                            }
                            Li2.d1(mj(e17));
                            Li2.setType(922746929);
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(((java.lang.Long) pair.first).longValue(), Li2, true);
                            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "update pat msg svrId %d, createTime %d", pair.first, pair.second);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.PatMsgExtension", "update pat msg svrId %d, pattedUser (%s,%s) not match", pair.first, str3, Ui.f379153e);
                        }
                    }
                }
            }
        } else {
            if (i19 == 1) {
                return;
            }
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490391to) + "(" + i17 + "," + i18 + ")", 0).show();
            java.lang.String str6 = ((r45.kz5) bVar.f347250d.f70710a.f70684a).f379044e;
            if (i18 != -22 && i18 != -44) {
                ((ku5.t0) ku5.t0.f312615d).g(new lp3.j(this, str6));
            }
        }
        if (sendPatActionReportStruct != null) {
            Ni(sendPatActionReportStruct);
            sendPatActionReportStruct.k();
            sendPatActionReportStruct.o();
        }
    }

    public boolean wi(int i17, java.lang.String str, java.lang.String str2) {
        java.util.List m17;
        if ((!com.tencent.mm.storage.z3.N4(str) && !com.tencent.mm.storage.z3.Q4(str)) || com.tencent.mm.storage.z3.y4(str) || c01.e2.U(str) || com.tencent.mm.storage.z3.R3(str) || c01.e2.G(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "cannot pat, talker %s", str);
            return false;
        }
        if (!com.tencent.mm.storage.z3.Q4(str2) || com.tencent.mm.storage.z3.y4(str2) || c01.e2.U(str2) || com.tencent.mm.storage.z3.R3(str2) || c01.e2.G(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "cannot pat, user %s", str2);
            return false;
        }
        if (!com.tencent.mm.storage.z3.N4(str) || (m17 = c01.v1.m(str)) == null || ((java.util.LinkedList) m17).contains(str2)) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.PatMsgExtension", "chatroom %s members %s, not contain %s", str, m17, str2);
        return false;
    }
}
