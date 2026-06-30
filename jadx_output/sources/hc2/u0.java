package hc2;

/* loaded from: classes8.dex */
public abstract class u0 {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if ((r5 == null || r5.length() == 0) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject a(r45.vs2 r7) {
        /*
            java.lang.String r0 = "FinderRedDotCtrlInfoExt"
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.o.g(r7, r1)
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r1 = new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo
            r1.<init>()
            r2 = 1
            java.util.LinkedList r3 = r7.f388489g     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = "show_infos"
            kotlin.jvm.internal.o.f(r3, r4)     // Catch: java.lang.Exception -> L39
            java.util.List r3 = kz5.n0.V(r3)     // Catch: java.lang.Exception -> L39
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L39
        L1d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L39
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L39
            r45.f03 r4 = (r45.f03) r4     // Catch: java.lang.Exception -> L39
            int r5 = r4.f373894n     // Catch: java.lang.Exception -> L39
            if (r5 != r2) goto L1d
            com.tencent.mm.protobuf.g r4 = r4.f373895o     // Catch: java.lang.Exception -> L39
            if (r4 == 0) goto L34
            byte[] r4 = r4.f192156a     // Catch: java.lang.Exception -> L39
            goto L35
        L34:
            r4 = 0
        L35:
            r1.parseFrom(r4)     // Catch: java.lang.Exception -> L39
            goto L1d
        L39:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getExtInfoJson "
            r4.<init>(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.mars.xlog.Log.e(r0, r3)
        L4f:
            org.json.JSONObject r3 = pm0.b0.g(r1)
            r4 = 0
            long r5 = r1.getLong(r4)
            java.lang.String r1 = pm0.v.u(r5)
            java.lang.String r5 = "object_id"
            r3.put(r5, r1)
            java.lang.String r1 = "report_ext_info"
            boolean r5 = r3.has(r1)
            if (r5 == 0) goto L83
            boolean r5 = r3.has(r1)
            if (r5 == 0) goto Laa
            java.lang.String r5 = r3.getString(r1)
            if (r5 == 0) goto L80
            int r5 = r5.length()
            if (r5 != 0) goto L7e
            goto L80
        L7e:
            r5 = r4
            goto L81
        L80:
            r5 = r2
        L81:
            if (r5 == 0) goto Laa
        L83:
            java.lang.String r5 = r7.f388499t
            if (r5 == 0) goto L8f
            int r5 = r5.length()
            if (r5 != 0) goto L8e
            goto L8f
        L8e:
            r2 = r4
        L8f:
            if (r2 != 0) goto Laa
            java.lang.String r2 = r7.f388499t
            r3.put(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "use ctrlInfo.report_ext_info. tipsId="
            r1.<init>(r2)
            java.lang.String r7 = r7.f388490h
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.mars.xlog.Log.w(r0, r7)
        Laa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.u0.a(r45.vs2):org.json.JSONObject");
    }

    public static final java.lang.String b(r45.vs2 vs2Var) {
        kotlin.jvm.internal.o.g(vs2Var, "<this>");
        java.lang.String str = vs2Var.f388496q;
        return str == null ? "" : str;
    }

    public static final boolean c(r45.vs2 vs2Var) {
        if (vs2Var == null) {
            return false;
        }
        r45.xs2 xs2Var = new r45.xs2();
        com.tencent.mm.protobuf.g gVar = vs2Var.f388488f;
        byte[] g17 = gVar != null ? gVar.g() : null;
        if (g17 != null) {
            xs2Var.parseFrom(g17);
        }
        return (xs2Var.getInteger(25) & 2) != 0;
    }

    public static final boolean d(r45.vs2 vs2Var, java.lang.String path) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.Object obj = null;
        if (vs2Var != null && (linkedList = vs2Var.f388489g) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.f03) next).f373892i, path)) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.f03) obj;
        }
        return obj != null;
    }

    public static final java.lang.String e(r45.vs2 vs2Var) {
        if (vs2Var == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = null;
        try {
            java.util.LinkedList show_infos = vs2Var.f388489g;
            kotlin.jvm.internal.o.f(show_infos, "show_infos");
            int i17 = 0;
            for (java.lang.Object obj : show_infos) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append(hc2.z0.b((r45.f03) obj, i17));
                i17 = i18;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("FinderExt", "printCtrInfo forEachIndexed exception:" + e17);
        }
        java.lang.String u17 = pm0.v.u(vs2Var.C);
        r45.s30 s30Var = vs2Var.A;
        if (s30Var != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("enable=" + s30Var.f385458d);
            sb7.append("config=");
            java.util.LinkedList<r45.r30> config = s30Var.f385461g;
            kotlin.jvm.internal.o.f(config, "config");
            for (r45.r30 r30Var : config) {
                sb7.append("[ctrlType=" + r30Var.f384499e + ',');
                sb7.append("tabType=" + r30Var.f384498d + ']');
            }
            str = sb7.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        }
        return "{ tipsId=" + vs2Var.f388490h + " tips_uuid=" + vs2Var.f388503x + " type=" + vs2Var.f388487e + " priority=" + vs2Var.f388486d + " start_time=" + vs2Var.f388492m + " expired=" + vs2Var.f388491i + " object_id=" + u17 + " username=" + vs2Var.f388496q + " tipsShowInfo=" + ((java.lang.Object) sb6) + " } clearConf=" + str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(r45.vs2 vs2Var, boolean z17, int i17, java.lang.Object obj) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        r45.f03 f03Var = null;
        if (vs2Var != null && (linkedList3 = vs2Var.f388489g) != null) {
            java.util.Iterator it = linkedList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.f03) next).f373892i, "FinderEntrance")) {
                    f03Var = next;
                    break;
                }
            }
            f03Var = f03Var;
        }
        if (f03Var != null && vs2Var != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            r45.f03 f03Var2 = f03Var;
            com.tencent.mm.plugin.finder.report.x2.m(x2Var, vs2Var, f03Var2, 14, null, 0L, 24, null);
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
            jbVar.t0(vs2Var);
            com.tencent.mm.plugin.finder.report.x2.j(x2Var, jbVar, f03Var2, 5, 2, null, null, 48, null);
            if (kotlin.jvm.internal.o.b("Discovery", f03Var.f373893m)) {
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                jbVar2.t0(vs2Var);
                x2Var.o(5, 1L, jbVar2, f03Var, "");
            }
        }
        if (vs2Var != null && (linkedList2 = vs2Var.f388489g) != null) {
            pm0.v.d0(linkedList2, hc2.r0.f280338d);
        }
        if (z17 && vs2Var != null && (linkedList = vs2Var.f388489g) != null) {
            pm0.v.d0(linkedList, hc2.s0.f280339d);
        }
        if (vs2Var == null || f03Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("removeFinderEntrance", "removeRedDot=" + vs2Var.f388503x + " includeRemoveDiscovery=" + z17);
    }

    public static final r45.f03 g(r45.vs2 vs2Var, java.lang.String path, boolean z17) {
        kotlin.jvm.internal.o.g(vs2Var, "<this>");
        kotlin.jvm.internal.o.g(path, "path");
        java.util.Iterator it = vs2Var.f388489g.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            r45.f03 f03Var = (r45.f03) it.next();
            if (kotlin.jvm.internal.o.b(f03Var.f373892i, path)) {
                it.remove();
                com.tencent.mars.xlog.Log.i("FinderExt", "removeShowInfo removePath=".concat(path));
                return f03Var;
            }
        }
        return null;
    }
}
