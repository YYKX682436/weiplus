package te5;

@j95.b
/* loaded from: classes9.dex */
public final class l1 extends jm0.o implements oy.j {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f418712m = jz5.h.b(te5.k1.f418700d);

    public final java.lang.String Zi(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (i17 == 1) {
            return str + ": " + str3 + '\n' + str2;
        }
        return str + '\n' + str2 + '\n' + str3;
    }

    public final java.lang.String aj(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, long j17) {
        return str + '_' + new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date(j17)) + '_' + f9Var.getMsgId() + str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bj(zy2.i r10, zy2.c r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof te5.c1
            if (r0 == 0) goto L13
            r0 = r12
            te5.c1 r0 = (te5.c1) r0
            int r1 = r0.f418619f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f418619f = r1
            goto L18
        L13:
            te5.c1 r0 = new te5.c1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f418617d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f418619f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Exception -> L29
            goto L9a
        L29:
            r10 = move-exception
            goto L9e
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = 0
            if (r10 == 0) goto L5e
            r45.kv2 r10 = r10.f477411b
            if (r10 == 0) goto L5e
            r12 = 0
            java.lang.String r10 = r10.getString(r12)
            if (r10 == 0) goto L5e
            boolean r12 = r26.n0.N(r10)
            r12 = r12 ^ r4
            if (r12 == 0) goto L4e
            goto L4f
        L4e:
            r10 = r3
        L4f:
            if (r10 == 0) goto L5e
            long r7 = pm0.v.Z(r10)
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L5e
            java.lang.Long r10 = java.lang.Long.valueOf(r7)
            goto L84
        L5e:
            if (r11 == 0) goto L83
            r45.g92 r10 = r11.f477359b
            if (r10 == 0) goto L83
            r11 = 2
            java.lang.String r10 = r10.getString(r11)
            if (r10 == 0) goto L83
            boolean r11 = r26.n0.N(r10)
            r11 = r11 ^ r4
            if (r11 == 0) goto L73
            goto L74
        L73:
            r10 = r3
        L74:
            if (r10 == 0) goto L83
            long r10 = pm0.v.Z(r10)
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L83
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L84
        L83:
            r10 = r3
        L84:
            if (r10 == 0) goto Lb5
            long r10 = r10.longValue()
            te5.d1 r12 = new te5.d1     // Catch: java.lang.Exception -> L29
            r12.<init>(r10, r3)     // Catch: java.lang.Exception -> L29
            r0.f418619f = r4     // Catch: java.lang.Exception -> L29
            r10 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = kotlinx.coroutines.a4.c(r10, r12, r0)     // Catch: java.lang.Exception -> L29
            if (r12 != r1) goto L9a
            return r1
        L9a:
            te5.b1 r12 = (te5.b1) r12     // Catch: java.lang.Exception -> L29
            r3 = r12
            goto Lb5
        L9e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "fetchFinderShortUrl error: "
            r11.<init>(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "MicroMsg.Chatting.MsgWordingService"
            com.tencent.mars.xlog.Log.w(r11, r10)
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.l1.bj(zy2.i, zy2.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0293, code lost:
    
        if ((r18 == null || r26.n0.N(r18)) == false) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cj(android.content.Context r27, java.lang.String r28, boolean r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 1583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.l1.cj(android.content.Context, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0048. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fj(android.content.Context r10, java.lang.String r11, int r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.l1.fj(android.content.Context, java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String hj(android.content.Context context, java.lang.String str) {
        o15.b bVar = new o15.b();
        bVar.fromXml(str);
        o15.a j17 = bVar.j();
        java.lang.String s17 = j17 != null ? j17.s() : null;
        java.lang.String l17 = j17 != null ? j17.l() : null;
        if (s17 == null || r26.n0.N(s17)) {
            s17 = l17 == null ? "" : l17;
        }
        return r26.n0.u0(context.getString(com.tencent.mm.R.string.f490470vz) + ' ' + s17).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ij(android.content.Context r8, java.lang.String r9, int r10, java.lang.String r11, java.lang.String r12, boolean r13, int r14, kotlin.coroutines.Continuation r15) {
        /*
            r7 = this;
            boolean r0 = r15 instanceof te5.g1
            if (r0 == 0) goto L13
            r0 = r15
            te5.g1 r0 = (te5.g1) r0
            int r1 = r0.f418648m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f418648m = r1
            goto L18
        L13:
            te5.g1 r0 = new te5.g1
            r0.<init>(r7, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.f418646h
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f418648m
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 != r2) goto L38
            int r14 = r6.f418645g
            java.lang.Object r8 = r6.f418644f
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r8 = r6.f418643e
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r6.f418642d
            te5.l1 r8 = (te5.l1) r8
            kotlin.ResultKt.throwOnFailure(r15)
            goto L5a
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            kotlin.ResultKt.throwOnFailure(r15)
            r6.f418642d = r7
            r6.f418643e = r11
            r6.f418644f = r12
            r6.f418645g = r14
            r6.f418648m = r2
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r13
            java.lang.Object r15 = r1.fj(r2, r3, r4, r5, r6)
            if (r15 != r0) goto L59
            return r0
        L59:
            r8 = r7
        L5a:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r8 = r8.Zi(r11, r12, r15, r14)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.l1.ij(android.content.Context, java.lang.String, int, java.lang.String, java.lang.String, boolean, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x027a -> B:11:0x0307). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x02e2 -> B:10:0x02f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mj(android.content.Context r26, java.util.List r27, com.tencent.mm.storage.z3 r28, boolean r29, boolean r30, boolean r31, boolean r32, int r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.l1.mj(android.content.Context, java.util.List, com.tencent.mm.storage.z3, boolean, boolean, boolean, boolean, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.util.List nj(android.content.Context context, java.util.List messages, com.tencent.mm.storage.z3 z3Var, boolean z17, boolean z18, boolean z19, boolean z27, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(messages, "messages");
        return (java.util.List) kotlinx.coroutines.l.f(null, new te5.i1(this, context, messages, z3Var, z17, z18, z19, z27, i17, null), 1, null);
    }

    public java.util.List oj(android.content.Context context, java.util.List messages, com.tencent.mm.storage.z3 z3Var, boolean z17, boolean z18, boolean z19, boolean z27, int i17) {
        java.lang.String str;
        java.lang.String str2;
        int t17;
        java.lang.String P0;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(messages, "messages");
        java.text.SimpleDateFormat simpleDateFormat = z19 ? new java.text.SimpleDateFormat(com.tencent.mm.sdk.platformtools.m2.j() ? "yyyy年MM月dd日 HH:mm" : "yyyy/MM/dd HH:mm") : null;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(messages, 10));
        for (java.util.Iterator it = messages.iterator(); it.hasNext(); it = it) {
            oi3.g gVar = (oi3.g) it.next();
            if (z18) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ndd);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                if (gVar.getInteger(gVar.f345617d + 9) == 1) {
                    P0 = c01.z1.l();
                } else {
                    int i18 = gVar.f345617d;
                    int i19 = i18 + 3;
                    if (com.tencent.mm.storage.z3.R4(gVar.getString(i19))) {
                        java.lang.String string2 = gVar.getString(i18 + 13);
                        if (string2 == null) {
                            string2 = "";
                        }
                        int t18 = c01.w9.t(string2);
                        if (t18 != -1) {
                            java.lang.String substring = string2.substring(0, t18);
                            kotlin.jvm.internal.o.f(substring, "substring(...)");
                            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r26.n0.u0(substring).toString(), true);
                            if (n17 != null) {
                                P0 = n17.P0();
                            }
                        }
                        P0 = null;
                    } else {
                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(gVar.getString(i19), true);
                        if (n18 != null) {
                            P0 = n18.P0();
                        }
                        P0 = null;
                    }
                }
                if (P0 == null || P0.length() == 0) {
                    P0 = null;
                }
                if (P0 == null) {
                    P0 = string;
                }
                if (z17 && !kotlin.jvm.internal.o.b(P0, string)) {
                    P0 = ez.m1.a(P0, null, 0, 3, null);
                }
                str = P0;
            } else {
                str = null;
            }
            java.lang.String format = (!z19 || simpleDateFormat == null) ? null : simpleDateFormat.format(new java.util.Date(gVar.getLong(gVar.f345617d + 2)));
            java.lang.String string3 = gVar.getString(gVar.f345617d + 13);
            java.lang.String str3 = string3 != null ? string3 : "";
            if (!com.tencent.mm.storage.z3.R4(gVar.getString(gVar.f345617d + 3)) || (t17 = c01.w9.t(str3)) == -1) {
                str2 = str3;
            } else {
                java.lang.String substring2 = str3.substring(t17 + 1);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                str2 = substring2;
            }
            arrayList.add((java.lang.String) kotlinx.coroutines.l.f(null, new te5.j1(this, context, str2, gVar, str, format, z27, i17, null), 1, null));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r0 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String pj(android.content.Context r11, com.tencent.mm.storage.f9 r12, long r13) {
        /*
            r10 = this;
            java.lang.String r0 = r12.Q0()
            long r1 = r12.getMsgId()
            r3 = 0
            java.lang.String r0 = com.tencent.mm.ui.chatting.eb.c(r0, r1, r3)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 != 0) goto L19
            boolean r1 = com.tencent.mm.vfs.w6.j(r0)
            if (r1 != 0) goto L25
        L19:
            java.lang.String r0 = r12.Q0()
            long r1 = r12.I0()
            java.lang.String r0 = com.tencent.mm.ui.chatting.eb.d(r0, r1, r3)
        L25:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r2 = 0
            if (r1 != 0) goto L9b
            boolean r1 = com.tencent.mm.vfs.w6.j(r0)
            if (r1 != 0) goto L34
            goto L9b
        L34:
            if (r0 != 0) goto L38
            java.lang.String r0 = ""
        L38:
            com.tencent.mm.vfs.z7 r0 = com.tencent.mm.vfs.z7.a(r0)
            java.lang.String r1 = r0.f213279f
            if (r1 == 0) goto L59
            java.lang.String r7 = com.tencent.mm.vfs.e8.l(r1, r3, r3)
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L59
            com.tencent.mm.vfs.z7 r1 = new com.tencent.mm.vfs.z7
            java.lang.String r5 = r0.f213277d
            java.lang.String r6 = r0.f213278e
            java.lang.String r8 = r0.f213280g
            java.lang.String r9 = r0.f213281h
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = r1
        L59:
            java.lang.String r1 = "/"
            java.lang.String r0 = r0.f213279f
            int r1 = r0.lastIndexOf(r1)
            r4 = 1
            if (r1 >= 0) goto L65
            goto L6a
        L65:
            int r1 = r1 + r4
            java.lang.String r0 = r0.substring(r1)
        L6a:
            java.lang.String r0 = com.tencent.mm.vfs.w6.n(r0)
            if (r0 == 0) goto L84
            int r1 = r0.length()
            if (r1 <= 0) goto L77
            r3 = r4
        L77:
            if (r3 == 0) goto L7a
            r2 = r0
        L7a:
            if (r2 == 0) goto L84
            java.lang.String r0 = "."
            java.lang.String r0 = r0.concat(r2)
            if (r0 != 0) goto L86
        L84:
            java.lang.String r0 = ".jpg"
        L86:
            r4 = r0
            r0 = 2131776301(0x7f10532d, float:1.918407E38)
            java.lang.String r3 = r11.getString(r0)
            java.lang.String r11 = "getString(...)"
            kotlin.jvm.internal.o.f(r3, r11)
            r1 = r10
            r2 = r12
            r5 = r13
            java.lang.String r11 = r1.aj(r2, r3, r4, r5)
            return r11
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.l1.pj(android.content.Context, com.tencent.mm.storage.f9, long):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r0 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String qj(android.content.Context r11, com.tencent.mm.storage.f9 r12, long r13) {
        /*
            r10 = this;
            java.lang.Class<tg3.u0> r0 = tg3.u0.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2 = r0
            tg3.u0 r2 = (tg3.u0) r2
            bm5.f0 r4 = bm5.f0.f22571s
            java.lang.String r5 = r12.z0()
            r6 = 0
            r7 = 8
            r8 = 0
            r3 = r12
            java.lang.String r0 = tg3.u0.e8(r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r2 = 0
            if (r1 == 0) goto L25
            return r2
        L25:
            com.tencent.mm.vfs.z7 r0 = com.tencent.mm.vfs.z7.a(r0)
            r1 = 0
            java.lang.String r3 = r0.f213279f
            if (r3 == 0) goto L47
            java.lang.String r7 = com.tencent.mm.vfs.e8.l(r3, r1, r1)
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L47
            com.tencent.mm.vfs.z7 r3 = new com.tencent.mm.vfs.z7
            java.lang.String r5 = r0.f213277d
            java.lang.String r6 = r0.f213278e
            java.lang.String r8 = r0.f213280g
            java.lang.String r9 = r0.f213281h
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = r3
        L47:
            com.tencent.mm.vfs.b3 r3 = com.tencent.mm.vfs.a3.f212781a
            com.tencent.mm.vfs.z2 r3 = r3.m(r0, r2)
            boolean r4 = r3.a()
            if (r4 != 0) goto L55
            r3 = r1
            goto L5d
        L55:
            com.tencent.mm.vfs.q2 r4 = r3.f213266a
            java.lang.String r3 = r3.f213267b
            boolean r3 = r4.F(r3)
        L5d:
            if (r3 != 0) goto L60
            return r2
        L60:
            java.lang.String r3 = "/"
            java.lang.String r0 = r0.f213279f
            int r3 = r0.lastIndexOf(r3)
            r4 = 1
            if (r3 >= 0) goto L6c
            goto L71
        L6c:
            int r3 = r3 + r4
            java.lang.String r0 = r0.substring(r3)
        L71:
            java.lang.String r0 = com.tencent.mm.vfs.w6.n(r0)
            if (r0 == 0) goto L8b
            int r3 = r0.length()
            if (r3 <= 0) goto L7e
            r1 = r4
        L7e:
            if (r1 == 0) goto L81
            r2 = r0
        L81:
            if (r2 == 0) goto L8b
            java.lang.String r0 = "."
            java.lang.String r0 = r0.concat(r2)
            if (r0 != 0) goto L8d
        L8b:
            java.lang.String r0 = ".mp4"
        L8d:
            r4 = r0
            r0 = 2131776303(0x7f10532f, float:1.9184075E38)
            java.lang.String r3 = r11.getString(r0)
            java.lang.String r11 = "getString(...)"
            kotlin.jvm.internal.o.f(r3, r11)
            r1 = r10
            r2 = r12
            r5 = r13
            java.lang.String r11 = r1.aj(r2, r3, r4, r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.l1.qj(android.content.Context, com.tencent.mm.storage.f9, long):java.lang.String");
    }
}
