package nc2;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final nc2.g f336108a = new nc2.g();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(r45.vs2 vs2Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.f03 f03Var = null;
        if (vs2Var != null && (linkedList2 = vs2Var.f388489g) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.f03) next).f373892i, "FinderLiveEntrance")) {
                    f03Var = next;
                    break;
                }
            }
            f03Var = f03Var;
        }
        r45.f03 f03Var2 = f03Var;
        if (!((vs2Var == null || (linkedList = vs2Var.f388489g) == null) ? false : pm0.v.d0(linkedList, nc2.a.f336102d)) || vs2Var == null || f03Var2 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        jbVar.t0(vs2Var);
        com.tencent.mm.plugin.finder.report.x2.j(x2Var, jbVar, f03Var2, 5, 2, null, null, 48, null);
    }

    public final void b(java.lang.String tag, java.lang.String source) {
        r45.f03 f03Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(tag, "[removeFinderLiveEntranceShowInfo] ".concat(source));
        for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : ((c61.l7) i95.n0.c(c61.l7.class)).nk().W()) {
            java.util.LinkedList linkedList = jbVar.field_ctrInfo.f388489g;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((r45.f03) obj).f373892i, "FinderLiveEntrance")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                f03Var = (r45.f03) obj;
            } else {
                f03Var = null;
            }
            if (!(f03Var != null)) {
                jbVar = null;
            }
            if (jbVar != null) {
                java.util.LinkedList linkedList2 = jbVar.field_ctrInfo.f388489g;
                com.tencent.mars.xlog.Log.i(tag, "removeFinderLiveEntranceShowInfo " + source + " result:" + (linkedList2 != null ? java.lang.Boolean.valueOf(pm0.v.d0(linkedList2, nc2.b.f336103d)) : null));
                java.util.LinkedList linkedList3 = jbVar.field_ctrInfo.f388489g;
                if (linkedList3 != null) {
                    java.util.ArrayList<r45.f03> arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : linkedList3) {
                        if (kotlin.jvm.internal.o.b(((r45.f03) obj2).f373893m, "FinderLiveEntrance")) {
                            arrayList.add(obj2);
                        }
                    }
                    for (r45.f03 f03Var2 : arrayList) {
                        f03Var2.f373891h = 1;
                        f03Var2.f373893m = "";
                    }
                }
                r45.vs2 vs2Var = new r45.vs2();
                vs2Var.parseFrom(jbVar.field_ctrInfo.toByteArray());
                zy2.fa.D(((c61.l7) i95.n0.c(c61.l7.class)).nk(), vs2Var, "removeFinderLiveEntranceShowInfo", null, false, null, 28, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(r45.vs2 vs2Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.f03 f03Var = null;
        if (vs2Var != null && (linkedList2 = vs2Var.f388489g) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.f03) next).f373892i, "NearbyLiveTab")) {
                    f03Var = next;
                    break;
                }
            }
            f03Var = f03Var;
        }
        r45.f03 f03Var2 = f03Var;
        if (!((vs2Var == null || (linkedList = vs2Var.f388489g) == null) ? false : pm0.v.d0(linkedList, nc2.c.f336104d)) || vs2Var == null || f03Var2 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        jbVar.t0(vs2Var);
        com.tencent.mm.plugin.finder.report.x2.j(x2Var, jbVar, f03Var2, 5, 2, null, null, 48, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "source"
            kotlin.jvm.internal.o.g(r0, r1)
            java.lang.String r1 = "[removeNearByEntranceShowInfo] "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "Finder.NearbyRedDotLogic"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r1 = i95.n0.c(r0)
            c61.l7 r1 = (c61.l7) r1
            zy2.fa r1 = r1.nk()
            java.util.Set r1 = r1.W()
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ldd
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.finder.extension.reddot.jb r2 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r2
            r45.vs2 r3 = r2.field_ctrInfo
            int r4 = r3.f388487e
            r5 = 1014(0x3f6, float:1.421E-42)
            java.lang.String r6 = "NearbyEntrance"
            r7 = 1
            r8 = 0
            if (r4 == r5) goto L66
            java.util.LinkedList r3 = r3.f388489g
            if (r3 == 0) goto L61
            java.util.Iterator r3 = r3.iterator()
        L47:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r3.next()
            r5 = r4
            r45.f03 r5 = (r45.f03) r5
            java.lang.String r5 = r5.f373892i
            boolean r5 = kotlin.jvm.internal.o.b(r5, r6)
            if (r5 == 0) goto L47
            goto L5e
        L5d:
            r4 = r8
        L5e:
            r45.f03 r4 = (r45.f03) r4
            goto L62
        L61:
            r4 = r8
        L62:
            if (r4 == 0) goto L66
            r3 = r7
            goto L67
        L66:
            r3 = 0
        L67:
            if (r3 == 0) goto L6a
            goto L6b
        L6a:
            r2 = r8
        L6b:
            if (r2 == 0) goto L27
            r45.vs2 r3 = r2.field_ctrInfo
            java.util.LinkedList r3 = r3.f388489g
            if (r3 == 0) goto L78
            nc2.d r4 = nc2.d.f336105d
            pm0.v.d0(r3, r4)
        L78:
            r45.vs2 r3 = r2.field_ctrInfo
            java.util.LinkedList r3 = r3.f388489g
            if (r3 == 0) goto Lb7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L87:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r3.next()
            r8 = r5
            r45.f03 r8 = (r45.f03) r8
            java.lang.String r8 = r8.f373893m
            boolean r8 = kotlin.jvm.internal.o.b(r8, r6)
            if (r8 == 0) goto L87
            r4.add(r5)
            goto L87
        La0:
            java.util.Iterator r3 = r4.iterator()
        La4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r3.next()
            r45.f03 r4 = (r45.f03) r4
            r4.f373891h = r7
            java.lang.String r5 = ""
            r4.f373893m = r5
            goto La4
        Lb7:
            r45.vs2 r9 = new r45.vs2
            r9.<init>()
            r45.vs2 r2 = r2.field_ctrInfo
            byte[] r2 = r2.toByteArray()
            r9.parseFrom(r2)
            i95.m r2 = i95.n0.c(r0)
            c61.l7 r2 = (c61.l7) r2
            zy2.fa r8 = r2.nk()
            java.lang.String r10 = "removeNearByEntranceShowInfo"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 28
            r15 = 0
            zy2.fa.D(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L27
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc2.g.d(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(r45.vs2 vs2Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.f03 f03Var = null;
        if (vs2Var != null && (linkedList2 = vs2Var.f388489g) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.f03) next).f373892i, "NearbyEntrance")) {
                    f03Var = next;
                    break;
                }
            }
            f03Var = f03Var;
        }
        r45.f03 f03Var2 = f03Var;
        if (!((vs2Var == null || (linkedList = vs2Var.f388489g) == null) ? false : pm0.v.d0(linkedList, nc2.e.f336106d)) || vs2Var == null || f03Var2 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        jbVar.t0(vs2Var);
        com.tencent.mm.plugin.finder.report.x2.j(x2Var, jbVar, f03Var2, 5, 2, null, null, 48, null);
    }
}
