package t52;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t52.a f415709a = new t52.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f415710b;

    public final void a(java.lang.String str, java.lang.String str2, long j17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r45.g16 g16Var = (r45.g16) it.next();
            if (!arrayList2.contains(java.lang.Long.valueOf(g16Var.f374823e))) {
                java.util.LinkedList linkedList = g16Var.f374824f;
                int size = linkedList.size();
                t52.b bVar = t52.c.f415711a;
                if (size == 1) {
                    r45.c16 c16Var = (r45.c16) linkedList.get(0);
                    if (c16Var != null && kotlin.jvm.internal.o.b(str, c16Var.f371220d)) {
                        r45.u53 u53Var = new r45.u53();
                        u53Var.f387047d = str2;
                        u53Var.f387049f = c16Var;
                        u53Var.f387051h = true;
                        u53Var.f387052i = g16Var.f374826h;
                        u53Var.f387053m = g16Var.f374825g;
                        u53Var.f387054n = g16Var.f374823e;
                        r45.t53 t53Var = new r45.t53();
                        t53Var.f386152d = str;
                        t53Var.f386153e = j17;
                        u53Var.f387050g.addLast(t53Var);
                        android.util.Pair c17 = bVar.c(str2);
                        ((r45.a16) c17.first).f369646e.addLast(u53Var);
                        r45.a16 a16Var = (r45.a16) c17.first;
                        a16Var.f369645d = str2;
                        java.lang.Object second = c17.second;
                        kotlin.jvm.internal.o.f(second, "second");
                        bVar.f(a16Var, ((java.lang.Number) second).intValue());
                    }
                } else if (linkedList.size() == 2) {
                    r45.c16 c16Var2 = (r45.c16) linkedList.get(0);
                    r45.c16 c16Var3 = (r45.c16) linkedList.get(1);
                    if (kotlin.jvm.internal.o.b(str, c16Var2.f371220d)) {
                        r45.u53 u53Var2 = new r45.u53();
                        u53Var2.f387047d = str2;
                        u53Var2.f387048e.add(c16Var2);
                        u53Var2.f387049f = c16Var3;
                        u53Var2.f387051h = true;
                        u53Var2.f387052i = g16Var.f374826h;
                        u53Var2.f387053m = g16Var.f374825g;
                        u53Var2.f387054n = g16Var.f374823e;
                        r45.t53 t53Var2 = new r45.t53();
                        t53Var2.f386152d = str;
                        t53Var2.f386153e = j17;
                        u53Var2.f387050g.addLast(t53Var2);
                        android.util.Pair c18 = bVar.c(str2);
                        ((r45.a16) c18.first).f369646e.addLast(u53Var2);
                        r45.a16 a16Var2 = (r45.a16) c18.first;
                        a16Var2.f369645d = str2;
                        java.lang.Object second2 = c18.second;
                        kotlin.jvm.internal.o.f(second2, "second");
                        bVar.f(a16Var2, ((java.lang.Number) second2).intValue());
                    }
                } else {
                    java.util.List subList = linkedList.subList(0, linkedList.size() - 1);
                    kotlin.jvm.internal.o.f(subList, "subList(...)");
                    r45.c16 c16Var4 = (r45.c16) linkedList.getLast();
                    if (kotlin.jvm.internal.o.b(str, ((r45.c16) subList.get(0)).f371220d)) {
                        r45.u53 u53Var3 = new r45.u53();
                        u53Var3.f387047d = str2;
                        u53Var3.f387048e.addAll(subList);
                        u53Var3.f387049f = c16Var4;
                        u53Var3.f387051h = true;
                        u53Var3.f387052i = g16Var.f374826h;
                        u53Var3.f387053m = g16Var.f374825g;
                        u53Var3.f387054n = g16Var.f374823e;
                        r45.t53 t53Var3 = new r45.t53();
                        t53Var3.f386152d = str;
                        t53Var3.f386153e = j17;
                        u53Var3.f387050g.addLast(t53Var3);
                        android.util.Pair c19 = bVar.c(str2);
                        ((r45.a16) c19.first).f369646e.addLast(u53Var3);
                        r45.a16 a16Var3 = (r45.a16) c19.first;
                        a16Var3.f369645d = str2;
                        java.lang.Object second3 = c19.second;
                        kotlin.jvm.internal.o.f(second3, "second");
                        bVar.f(a16Var3, ((java.lang.Number) second3).intValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r12, boolean r13, long r14) {
        /*
            r11 = this;
            r0 = 0
            if (r13 != 0) goto L9
            boolean r13 = b52.b.l(r12)
            if (r13 == 0) goto L10
        L9:
            boolean r13 = t52.a.f415710b
            if (r13 == 0) goto L10
            t52.a.f415710b = r0
            return
        L10:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b r13 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a
            r45.lw3 r13 = x52.c.h()
            r1 = 0
            if (r13 == 0) goto L38
            java.util.LinkedList r2 = r13.f379878f
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L22
            goto L38
        L22:
            boolean r3 = x52.c.g(r13)
            if (r3 == 0) goto L31
            int r13 = r13.f379879g
            java.lang.Object r13 = r2.get(r13)
            r45.c45 r13 = (r45.c45) r13
            goto L39
        L31:
            java.lang.Object r13 = r2.getLast()
            r45.c45 r13 = (r45.c45) r13
            goto L39
        L38:
            r13 = r1
        L39:
            if (r13 != 0) goto L3c
            goto L3e
        L3c:
            java.lang.String r1 = r13.f371270d
        L3e:
            java.lang.String r13 = "HABBYGE-MALI.FuzzyMatch"
            if (r1 != 0) goto L48
            java.lang.String r12 = "_matchOnFinish: curSession == null"
            com.tencent.mars.xlog.Log.w(r13, r12)
            return
        L48:
            t52.b r2 = t52.c.f415711a
            r45.a16 r1 = r2.b(r1)
            if (r1 != 0) goto L56
            java.lang.String r12 = "_matchOnFinish: sessionMatch == null"
            com.tencent.mars.xlog.Log.w(r13, r12)
            return
        L56:
            java.util.LinkedList r13 = r1.f369646e
            java.util.Iterator r13 = r13.iterator()
        L5c:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r13.next()
            r45.u53 r3 = (r45.u53) r3
            boolean r4 = r3.f387051h
            if (r4 == 0) goto L8c
            r45.c16 r4 = r3.f387049f
            java.lang.String r4 = r4.f371220d
            java.lang.String r4 = b52.b.g(r4)
            r45.c16 r5 = r3.f387049f
            java.lang.String r5 = r5.f371220d
            boolean r5 = kotlin.jvm.internal.o.b(r12, r5)
            if (r5 != 0) goto L84
            boolean r4 = kotlin.jvm.internal.o.b(r12, r4)
            if (r4 == 0) goto L5c
        L84:
            r3.f387051h = r0
            t52.d r4 = t52.e.f415712a
            r4.a(r3, r14)
            goto L5c
        L8c:
            java.util.LinkedList r3 = r3.f387050g
            int r4 = r3.size()
            int r4 = r4 + (-1)
        L94:
            r5 = -1
            if (r5 >= r4) goto L5c
            java.lang.Object r5 = r3.get(r4)
            r45.t53 r5 = (r45.t53) r5
            if (r5 != 0) goto La0
            goto Lc7
        La0:
            java.lang.String r6 = r5.f386152d
            java.lang.String r6 = b52.b.g(r6)
            java.lang.String r7 = r5.f386152d
            boolean r7 = kotlin.jvm.internal.o.b(r12, r7)
            if (r7 != 0) goto Lb4
            boolean r6 = kotlin.jvm.internal.o.b(r12, r6)
            if (r6 == 0) goto Lc7
        Lb4:
            long r6 = r5.f386154f
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto Lc7
            long r6 = r5.f386153e
            long r6 = r14 - r6
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto Lc5
            r8 = r6
        Lc5:
            r5.f386154f = r8
        Lc7:
            int r4 = r4 + (-1)
            goto L94
        Lca:
            r2.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t52.a.b(java.lang.String, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r19, long r20, t52.h r22) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t52.a.c(java.lang.String, long, t52.h):void");
    }
}
