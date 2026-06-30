package g95;

/* loaded from: classes9.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final g95.u f269821a = new g95.u();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f269822b = jz5.h.b(g95.j.f269807d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f269823c = jz5.h.b(g95.f.f269802d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f269824d = kz5.c0.i(2, 9, 10, 11, 8, 13, 14);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f269825e = kz5.b0.c(1);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f269826f = kz5.c0.i(11, 14);

    public static final boolean a(g95.u uVar, g15.a aVar) {
        uVar.getClass();
        int k17 = aVar.k();
        return (k17 == 3 || k17 == 4 || k17 == 5 || k17 == 6 || k17 == 12) && aVar.getCreateTime() + ((long) com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER) < c01.id.c();
    }

    public static final void b(java.lang.String str) {
        if (str != null) {
            g95.u uVar = f269821a;
            g15.b wi6 = ((ez.j) uVar.e()).wi(str);
            if (wi6 == null) {
                wi6 = new g15.b();
            }
            if (wi6.j().removeIf(g95.g.f269803a)) {
                uVar.n(str, wi6);
                com.tencent.mars.xlog.Log.i("MicroMsg.ConvRedHintStorage", "enterChatRemoveRedHint remove red hints, [" + str + ']');
            }
        }
    }

    public static final java.util.List c(java.lang.String str) {
        if (str == null) {
            return new java.util.LinkedList();
        }
        g15.b wi6 = ((ez.j) f269821a.e()).wi(str);
        if (wi6 == null) {
            wi6 = new g15.b();
        }
        return wi6.j();
    }

    public static final java.util.ArrayList f(java.lang.String str) {
        if (str == null) {
            return new java.util.ArrayList();
        }
        g15.b wi6 = ((ez.j) f269821a.e()).wi(str);
        if (wi6 == null) {
            wi6 = new g15.b();
        }
        return o(wi6.j());
    }

    public static final void g(java.lang.String str) {
        if (str != null) {
            g95.u uVar = f269821a;
            g15.b wi6 = ((ez.j) uVar.e()).wi(str);
            if (wi6 == null) {
                wi6 = new g15.b();
            }
            if (wi6.j().removeIf(g95.i.f269806a)) {
                uVar.n(str, wi6);
                com.tencent.mars.xlog.Log.i("MicroMsg.ConvRedHintStorage", "markReadRemoveRedHint remove red hints, [" + str + ']');
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[EDGE_INSN: B:16:0x0062->B:17:0x0062 BREAK  A[LOOP:0: B:7:0x002a->B:23:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:7:0x002a->B:23:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(long r19, java.lang.String r21, int r22, int r23, long r24) {
        /*
            r0 = r19
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            java.lang.String r7 = "MicroMsg.ConvRedHintStorage"
            r8 = 0
            if (r2 == 0) goto Led
            g95.u r9 = g95.u.f269821a
            pt0.m r10 = r9.e()
            ez.j r10 = (ez.j) r10
            g15.b r10 = r10.wi(r2)
            if (r10 != 0) goto L22
            g15.b r10 = new g15.b
            r10.<init>()
        L22:
            java.util.LinkedList r11 = r10.j()
            java.util.Iterator r11 = r11.iterator()
        L2a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L61
            java.lang.Object r12 = r11.next()
            r13 = r12
            g15.a r13 = (g15.a) r13
            java.util.List r14 = g95.u.f269826f
            java.lang.Integer r15 = java.lang.Integer.valueOf(r22)
            boolean r14 = r14.contains(r15)
            r15 = 1
            r16 = 0
            if (r14 == 0) goto L4d
            int r13 = r13.k()
            if (r13 != r3) goto L5c
            goto L5e
        L4d:
            long r17 = r13.l()
            int r14 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r14 != 0) goto L5c
            int r13 = r13.k()
            if (r13 != r3) goto L5c
            goto L5e
        L5c:
            r15 = r16
        L5e:
            if (r15 == 0) goto L2a
            goto L62
        L61:
            r12 = r8
        L62:
            g15.a r12 = (g15.a) r12
            jz5.f0 r11 = jz5.f0.f302826a
            java.lang.String r13 = ", "
            if (r12 == 0) goto Lad
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r14 = "update, ["
            r8.<init>(r14)
            r8.append(r2)
            r8.append(r13)
            r8.append(r0)
            r8.append(r13)
            r8.append(r3)
            java.lang.String r14 = "], origin msgId:"
            r8.append(r14)
            long r14 = r12.l()
            r8.append(r14)
            java.lang.String r14 = " type: "
            r8.append(r14)
            int r14 = r12.k()
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r7, r8)
            r12.p(r3)
            r12.q(r0)
            r12.n(r4)
            r12.o(r5)
            r8 = r11
        Lad:
            if (r8 != 0) goto Le9
            java.util.LinkedList r8 = r10.j()
            g15.a r12 = new g15.a
            r12.<init>()
            r12.q(r0)
            r12.p(r3)
            r12.n(r4)
            r12.o(r5)
            r8.add(r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "record, ["
            r4.<init>(r5)
            r4.append(r2)
            r4.append(r13)
            r4.append(r0)
            r4.append(r13)
            r4.append(r3)
            r0 = 93
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.mars.xlog.Log.i(r7, r0)
        Le9:
            r9.n(r2, r10)
            r8 = r11
        Led:
            if (r8 != 0) goto Lf4
            java.lang.String r0 = "talker is null"
            com.tencent.mars.xlog.Log.e(r7, r0)
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g95.u.h(long, java.lang.String, int, int, long):void");
    }

    public static final void i(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var != null) {
            h(f9Var.getMsgId(), f9Var.Q0(), i17, f269821a.d(i17), f9Var.getCreateTime());
        }
    }

    public static final void j(java.lang.String str, int i17) {
        h(0L, str, i17, f269821a.d(i17), c01.id.c());
    }

    public static final void k(long j17, java.lang.String str) {
        jz5.f0 f0Var;
        if (str != null) {
            g95.u uVar = f269821a;
            g15.b wi6 = ((ez.j) uVar.e()).wi(str);
            if (wi6 == null) {
                wi6 = new g15.b();
            }
            boolean removeIf = wi6.j().removeIf(new g95.k(j17));
            if (removeIf) {
                uVar.n(str, wi6);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvRedHintStorage", "remove by msgId, [" + str + ", " + j17 + "], result: " + removeIf);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConvRedHintStorage", "talker is null");
        }
    }

    public static final void l(java.lang.String str, int i17) {
        jz5.f0 f0Var;
        if (str != null) {
            g95.u uVar = f269821a;
            g15.b wi6 = ((ez.j) uVar.e()).wi(str);
            if (wi6 == null) {
                wi6 = new g15.b();
            }
            boolean removeIf = wi6.j().removeIf(new g95.m(i17));
            if (removeIf) {
                uVar.n(str, wi6);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvRedHintStorage", "remove by type, [" + str + ", " + i17 + "], result: " + removeIf);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConvRedHintStorage", "talker is null");
        }
    }

    public static final void m(java.util.List msgList, java.lang.String str, int i17, int i18) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        if (str != null) {
            d75.b.g(new g95.o(str, msgList, i17, i18));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConvRedHintStorage", "talker is null");
        }
    }

    public static final java.util.ArrayList o(java.util.List redHints) {
        kotlin.jvm.internal.o.g(redHints, "redHints");
        java.util.List y17 = q26.h0.y(q26.h0.v(q26.h0.i(kz5.n0.J(redHints), g95.t.f269820d), new g95.p()));
        q26.n o17 = q26.h0.o(q26.h0.i(kz5.n0.J(y17), g95.r.f269818d), g95.s.f269819d);
        java.util.HashSet hashSet = new java.util.HashSet();
        q26.h0.x(o17, hashSet);
        java.util.ArrayList arrayList = new java.util.ArrayList(y17);
        kz5.h0.B(arrayList, new g95.q(hashSet));
        return arrayList;
    }

    public final int d(int i17) {
        if (f269824d.contains(java.lang.Integer.valueOf(i17))) {
            return 0;
        }
        return f269825e.contains(java.lang.Integer.valueOf(i17)) ? 1 : 2;
    }

    public final pt0.m e() {
        return (pt0.m) ((jz5.n) f269823c).getValue();
    }

    public final void n(java.lang.String str, g15.b bVar) {
        if (str == null || bVar == null) {
            return;
        }
        ((ez.j) e()).getClass();
        ti3.c.f419579a.d(bVar, str, "ConvRedHintStorage");
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if (Di != null) {
            Di.b(3, Di, str);
        }
    }
}
