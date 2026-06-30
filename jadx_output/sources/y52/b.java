package y52;

/* loaded from: classes15.dex */
public abstract class b {
    public static void a(java.lang.String str, int i17, long j17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.String g17 = b52.b.g(str);
        r45.jw3 jw3Var = new r45.jw3();
        jw3Var.f378159d = g17;
        jw3Var.f378167o = i17;
        jw3Var.f378160e = j17;
        r45.c45 e17 = x52.c.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "addPageflow(addPage2Flow), Unknown Page: %s", g17);
            jw3Var.f378162g = null;
            x52.i.e();
        } else {
            java.lang.String m17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.m(e17);
            jw3Var.f378162g = m17;
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "addPageflow(addPage2Flow), session: %s, %s", g17, m17);
            x52.i.c(jw3Var);
        }
        r45.iw3 a17 = y52.a.a();
        a17.f377354d.addLast(jw3Var);
        y52.a.b(a17);
    }

    public static void b(r45.c45 c45Var, java.lang.String str, int i17, long j17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (c45Var == null || !b62.b.a(c45Var.f371270d)) {
            c(c45Var, str, i17, j17);
        } else {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "addpageFlow scan-session, need filter !!");
        }
    }

    public static void c(r45.c45 c45Var, java.lang.String str, int i17, long j17) {
        r45.jw3 jw3Var;
        java.lang.String g17 = b52.b.g(str);
        r45.iw3 a17 = y52.a.a();
        if (c45Var == null) {
            if ("LauncherUI".equals(g17) || "FinderHomeUI".equals(g17) || "FinderHomeAffinityUI".equals(g17) || "FinderConversationUI".equals(g17)) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "Invalidate Page: LauncherUI/FinderHomeUI");
                return;
            }
        } else if ("LauncherUI".equals(g17)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "Invalidate Page: LauncherUI");
            return;
        } else if ("FinderHomeUI".equals(g17) || "FinderHomeAffinityUI".equals(g17) || "FinderConversationUI".equals(g17)) {
            androidx.fragment.app.Fragment a18 = p52.k.a();
            g17 = a18 != null ? a18.getClass().getSimpleName() : "FinderFollowTabFragment";
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "maybe invalidate Page: FinderHomeUI in %s, %s", c45Var.f371270d, g17);
        }
        java.util.LinkedList linkedList = a17.f377354d;
        r45.jw3 jw3Var2 = (r45.jw3) linkedList.peekLast();
        if (jw3Var2 != null) {
            if (jw3Var2.f378159d.equals(g17)) {
                if (c45Var != null && !c45Var.f371270d.equals(jw3Var2.f378162g)) {
                    java.lang.String str2 = jw3Var2.f378162g;
                    jw3Var2.f378162g = c45Var.f371270d;
                    linkedList.set(linkedList.size() - 1, jw3Var2);
                    j(a17, str2, c45Var.f371270d, false);
                    y52.a.b(a17);
                }
                if (jw3Var2.f378167o <= 0 && i17 > 0) {
                    jw3Var2.f378167o = i17;
                    y52.a.b(a17);
                }
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "repeated page, no need to add this page: %s, %d, %s, %d", jw3Var2.f378159d, java.lang.Integer.valueOf(jw3Var2.f378167o), g17, java.lang.Integer.valueOf(i17));
                return;
            }
            if (c45Var != null && !jw3Var2.f378162g.equals(c45Var.f371270d)) {
                j(a17, jw3Var2.f378162g, c45Var.f371270d, true);
            }
            int size = linkedList.size();
            if (size > 2 && (jw3Var = (r45.jw3) linkedList.get(size - 2)) != null) {
                if ("MsgRetransmitUI".equals(jw3Var.f378159d) && "SelectConversationUI".equals(jw3Var2.f378159d) && "MsgRetransmitUI".equals(g17)) {
                    return;
                }
                if ("SelectConversationUI".equals(jw3Var.f378159d) && "MsgRetransmitUI".equals(jw3Var2.f378159d) && "SelectConversationUI".equals(g17)) {
                    return;
                }
            }
        }
        r45.jw3 jw3Var3 = new r45.jw3();
        jw3Var3.f378159d = g17;
        jw3Var3.f378167o = i17;
        jw3Var3.f378160e = j17;
        if (c45Var == null) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "addPageFlow, Unknown Page: %s, %d", g17, java.lang.Integer.valueOf(i17));
            jw3Var3.f378162g = null;
            x52.i.e();
        } else {
            jw3Var3.f378162g = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.m(c45Var);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "addPageFlow, session: %s, %d, %s", g17, java.lang.Integer.valueOf(i17), jw3Var3.f378162g);
            x52.i.c(jw3Var3);
        }
        linkedList.addLast(jw3Var3);
        y52.a.b(a17);
    }

    public static android.util.Pair d() {
        java.util.LinkedList linkedList = y52.a.a().f377354d;
        if (linkedList.isEmpty()) {
            return null;
        }
        return android.util.Pair.create((r45.jw3) linkedList.getLast(), java.lang.Integer.valueOf(linkedList.size() - 1));
    }

    public static nm5.b e(java.lang.String str, java.lang.String str2) {
        java.lang.String g17;
        if (str != null && str2 != null && !str2.isEmpty()) {
            java.lang.String g18 = b52.b.g(str2);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowManager", "getPageFlowItemOfCurSession: %s, %s", g18, str);
            java.util.LinkedList linkedList = y52.a.a().f377354d;
            for (int size = linkedList.size() - 1; size >= 0; size--) {
                r45.jw3 jw3Var = (r45.jw3) linkedList.get(size);
                if (jw3Var.f378162g.equals(str) && (g17 = b52.b.g(jw3Var.f378159d)) != null && g17.equals(g18)) {
                    return nm5.j.c(jw3Var, java.lang.Integer.valueOf(size));
                }
            }
        }
        return null;
    }

    public static java.util.List f(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = y52.a.a().f377354d;
        int size = linkedList.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.jw3 jw3Var = (r45.jw3) linkedList.get(i17);
            if (jw3Var.f378162g.equals(str)) {
                arrayList.add(jw3Var);
            }
        }
        return arrayList;
    }

    public static void g() {
        synchronized (y52.a.class) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c52.c.d("mmkv_key_hell_PFLOW", new byte[0]);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageFlowDao", "HellPageFlowDao-reset-time: %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void h(java.lang.String str, long j17) {
        r45.jw3 jw3Var;
        r45.iw3 a17 = y52.a.a();
        java.util.LinkedList linkedList = a17.f377354d;
        if (linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellPageFlowManager", "setEndTimeOfPageWhenEvent8, pageFlow.items == NULL");
            return;
        }
        java.lang.String g17 = b52.b.g(str);
        if (g17 == null || g17.isEmpty() || (jw3Var = (r45.jw3) linkedList.getLast()) == null) {
            return;
        }
        long j18 = j17 - jw3Var.f378160e;
        if (j18 <= 0) {
            j18 = 0;
        }
        jw3Var.f378161f = j18;
        y52.a.b(a17);
    }

    public static void i(r45.jw3 jw3Var, int i17) {
        if (jw3Var == null) {
            return;
        }
        r45.iw3 a17 = y52.a.a();
        try {
            a17.f377354d.set(i17, jw3Var);
            y52.a.b(a17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellPageFlowManager", e17, "updatePageFlow crash: %s", e17.getMessage());
        }
    }

    public static void j(r45.iw3 iw3Var, java.lang.String str, java.lang.String str2, boolean z17) {
        int size = iw3Var.f377354d.size();
        if (!z17) {
            size--;
        }
        for (int i17 = size - 1; i17 >= 0; i17--) {
            r45.jw3 jw3Var = (r45.jw3) iw3Var.f377354d.get(i17);
            if (jw3Var != null) {
                if (!jw3Var.f378162g.equals(str)) {
                    return;
                }
                com.tencent.mm.plugin.expt.hellhound.ext.session.config.b bVar = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a;
                nm5.b l17 = bVar.l(str);
                java.lang.String str3 = l17 != null ? (java.lang.String) l17.a(1) : null;
                nm5.b l18 = bVar.l(str2);
                java.lang.String str4 = l18 != null ? (java.lang.String) l18.a(1) : null;
                if (str3 != null && str3.equals(str4)) {
                    jw3Var.f378162g = str2;
                }
            }
        }
    }
}
