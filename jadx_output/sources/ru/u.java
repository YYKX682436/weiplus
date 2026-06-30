package ru;

/* loaded from: classes12.dex */
public final class u extends ru.j {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f399653p = 0;

    /* renamed from: o, reason: collision with root package name */
    public final gu.k f399654o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(gu.k params) {
        super(params);
        kotlin.jvm.internal.o.g(params, "params");
        this.f399654o = params;
    }

    public static final boolean M(ru.u uVar, s15.h hVar) {
        uVar.getClass();
        if (hVar.getInteger(hVar.f303422d + 2) != 1) {
            return true;
        }
        s15.d0 I = hVar.I();
        if (I != null) {
            int i17 = hVar.f303422d;
            if ((!r26.n0.N(hVar.getString(i17 + 4))) || (!r26.n0.N(hVar.c0())) || hVar.getLong(i17 + 7) > 0) {
                return true;
            }
            if (I.k() > 0 && I.getType() != 1) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.j, qi3.b0
    public java.lang.Object A(kotlin.coroutines.Continuation continuation) {
        int i17;
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        gu.k kVar = this.f399654o;
        linkedHashMap.putAll(kVar.f412184f);
        qi3.f0 f0Var = kVar.f412191m;
        java.lang.String str2 = "PrepareError";
        if (f0Var != null) {
            i17 = 0;
            str = "Success";
        } else {
            i17 = -520009;
            str = "PrepareError";
        }
        if (f0Var != null) {
            linkedHashMap.putAll(f0Var.f363701b);
            int i18 = f0Var.f363700a;
            if (i18 != 0) {
                i17 = i18;
            } else {
                str2 = str;
            }
            str = str2;
        }
        qi3.i0 i0Var = kVar.f412192n;
        if (i0Var != null) {
            linkedHashMap.putAll(i0Var.f363726b);
            int i19 = i0Var.f363725a;
            if (i19 != 0) {
                str = "UploadError";
                i17 = i19;
            }
        }
        qi3.d0 d0Var = kVar.f412193o;
        if (d0Var != null) {
            linkedHashMap.putAll(d0Var.f363684b);
            int i27 = d0Var.f363683a;
            if (i27 != 0) {
                str = "SendCgiError";
                i17 = i27;
            }
        }
        qi3.k0 k0Var = kVar.f412194p;
        if (k0Var != null) {
            linkedHashMap.putAll(k0Var.f363740b);
            int i28 = k0Var.f363739a;
            if (i28 != 0) {
                str = "UpdateMsgError";
                i17 = i28;
            }
        }
        if (i17 == -520007) {
            t65.f Zi = ((k04.h) ((t65.e) i95.n0.c(t65.e.class))).Zi();
            linkedHashMap.put("send_from_last_screen", new java.lang.Integer(Zi.p()));
            linkedHashMap.put("send_network_tick_rate", new java.lang.Float(Zi.t()));
            linkedHashMap.put("send_from_last_network_min", new java.lang.Integer(Zi.n()));
            linkedHashMap.put("send_process_status", new java.lang.Integer(Zi.u()));
        }
        linkedHashMap.put("send_result_ret_code", new java.lang.Integer(i17));
        linkedHashMap.put("send_result_type", str);
        linkedHashMap.put("send_total_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - this.f363676e));
        linkedHashMap.put("inner_version", new java.lang.Integer(36));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).sj(32784, linkedHashMap, 10);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(kVar.f275616s, linkedHashMap, 32784);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", "report32784: " + kVar.f275616s + ' ' + linkedHashMap);
        return jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ru.q
            if (r0 == 0) goto L13
            r0 = r6
            ru.q r0 = (ru.q) r0
            int r1 = r0.f399621g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399621g = r1
            goto L18
        L13:
            ru.q r0 = new ru.q
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f399619e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f399621g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f399618d
            qi3.k0 r0 = (qi3.k0) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6c
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r5.id()
            r6.append(r2)
            java.lang.String r2 = " start to updateMsg"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.AppMsg.SendRecordTask"
            com.tencent.mars.xlog.Log.i(r2, r6)
            qi3.k0 r6 = new qi3.k0
            r2 = 0
            r6.<init>(r2)
            gu.k r2 = r5.f399654o
            r2.f412194p = r6
            ru.r r2 = new ru.r
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f399618d = r6
            r0.f399621g = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r0 = r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.u.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(yz5.l r45, kotlin.coroutines.Continuation r46) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.u.D(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void N(s15.w wVar, boolean z17) {
        java.lang.String str;
        s15.i p17;
        java.lang.String l17;
        java.lang.String j17;
        s15.i0 H;
        s15.w j18;
        java.lang.String str2;
        int i17 = 0;
        for (java.lang.Object obj : wVar.j()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            s15.h hVar = (s15.h) obj;
            s15.i p18 = hVar.p();
            if (p18 == null || (str = p18.l()) == null) {
                str = "";
            }
            if (com.tencent.mm.storage.z3.W4(str)) {
                s15.i p19 = hVar.p();
                if (p19 != null) {
                    s15.i p27 = hVar.p();
                    if (p27 == null || (str2 = p27.l()) == null) {
                        str2 = "";
                    }
                    p19.n(str2);
                }
                s15.i p28 = hVar.p();
                if (p28 != null) {
                    p28.p("");
                }
            } else {
                s15.i p29 = hVar.p();
                if ((p29 == null || (j17 = p29.j()) == null || !(r26.n0.N(j17) ^ true)) ? false : true) {
                    s15.i p37 = hVar.p();
                    if (p37 != null) {
                        p37.n("");
                    }
                    this.f399654o.f412184f.put("send_msg_new_create", 1);
                }
                s15.i p38 = hVar.p();
                if (((p38 == null || (l17 = p38.l()) == null || !(r26.n0.N(l17) ^ true)) ? false : true) && (p17 = hVar.p()) != null) {
                    p17.p("");
                }
            }
            if (hVar.getInteger(hVar.f303422d + 2) == 17 && (H = hVar.H()) != null && (j18 = H.j()) != null) {
                N(j18, true);
            }
            i17 = i18;
        }
        if (z17) {
            wVar.set(wVar.f303423d + 1, ((ot.q) i95.n0.c(ot.q.class)).bj(wVar));
        }
    }

    public final void O(s15.w wVar) {
        java.util.Set D0 = kz5.z.D0(new java.lang.Integer[]{1, 2, 4, 8});
        for (s15.h hVar : wVar.j()) {
            if (hVar.getInteger(hVar.f303422d + 2) == 17) {
                s15.i0 H = hVar.H();
                s15.w j17 = H != null ? H.j() : null;
                if (j17 != null) {
                    O(j17);
                    s15.i0 H2 = hVar.H();
                    if (H2 != null) {
                        H2.k(j17);
                    }
                }
            } else {
                int i17 = hVar.f303422d;
                if (!D0.contains(java.lang.Integer.valueOf(hVar.getInteger(i17 + 2)))) {
                    java.lang.String aj6 = ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).aj(hVar);
                    if (aj6 == null) {
                        aj6 = hVar.getString(i17 + 1);
                    }
                    if (hVar.getInteger(i17 + 2) == 5) {
                        if (hVar.U().length() > 0) {
                            hVar.set(i17 + 1, aj6 + ' ' + hVar.U());
                            hVar.set(i17 + 2, 1);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", "convertClawUnsupportedRecordItems: converted dataType to TEXT, desc=" + hVar.getString(i17 + 1));
                        }
                    }
                    hVar.set(i17 + 1, aj6);
                    hVar.set(i17 + 2, 1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", "convertClawUnsupportedRecordItems: converted dataType to TEXT, desc=" + hVar.getString(i17 + 1));
                }
            }
        }
    }

    public final void Q(java.util.List list, java.util.List list2) {
        s15.w j17;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            s15.h hVar = (s15.h) it.next();
            if (hVar.getInteger(hVar.f303422d + 2) == 17) {
                s15.i0 H = hVar.H();
                if (H != null && (j17 = H.j()) != null) {
                    Q(j17.j(), list2);
                }
            } else {
                int i17 = hVar.f303422d;
                if (hVar.getLong(i17 + 7) > 0 || hVar.getLong(i17 + 11) > 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(hVar.getInteger(i17 + 2));
                    sb6.append('-');
                    sb6.append(hVar.getLong(i17 + 7));
                    sb6.append('-');
                    sb6.append(hVar.getLong(i17 + 11));
                    list2.add(sb6.toString());
                }
            }
        }
    }

    @Override // qi3.c
    public java.lang.Integer d(boolean z17) {
        java.lang.Integer d17 = super.d(z17);
        if (d17 != null) {
            return d17;
        }
        oi3.g gVar = this.f399654o.f275619v;
        if (gVar == null) {
            return -520009;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = gVar.f345617d;
        com.tencent.mm.storage.f9 k17 = e0Var.k(gVar.getString(i17 + 3), gVar.getLong(i17 + 0));
        if (k17 != null) {
            return (k17.I0() == 0 || k17.P0() != 2) ? null : -520008;
        }
        return -520002;
    }

    @Override // ru.j, qi3.c
    public qi3.e0 h() {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker;
        qi3.e0 e0Var = new qi3.e0(this.f363677f, this);
        gu.k kVar = this.f399654o;
        oi3.g gVar = kVar.f275619v;
        if (gVar != null) {
            int i17 = gVar.f345617d;
            msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(gVar.getLong(i17 + 0), gVar.getString(i17 + 3));
        } else {
            msgIdTalker = null;
        }
        e0Var.f363697g = msgIdTalker;
        e0Var.f363693c = kVar.f412191m;
        e0Var.f363694d = kVar.f412192n;
        e0Var.f363695e = kVar.f412193o;
        e0Var.f363696f = kVar.f412194p;
        return e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // ru.j, qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.u.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.j, qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ru.o
            if (r0 == 0) goto L13
            r0 = r8
            ru.o r0 = (ru.o) r0
            int r1 = r0.f399614h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399614h = r1
            goto L18
        L13:
            ru.o r0 = new ru.o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f399612f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f399614h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f399610d
            java.lang.Object r0 = r0.f399611e
            qi3.d0 r0 = (qi3.d0) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L75
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = r7.id()
            r8.append(r2)
            java.lang.String r2 = " start to sendNormalCgi"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.AppMsg.SendRecordTask"
            com.tencent.mars.xlog.Log.i(r2, r8)
            long r4 = android.os.SystemClock.elapsedRealtime()
            qi3.d0 r8 = new qi3.d0
            r2 = 0
            r8.<init>(r2)
            gu.k r2 = r7.f399654o
            r2.f412193o = r8
            ru.p r2 = new ru.p
            r6 = 0
            r2.<init>(r7, r8, r6)
            r0.f399611e = r8
            r0.f399610d = r4
            r0.f399614h = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L73
            return r1
        L73:
            r0 = r8
            r1 = r4
        L75:
            java.util.Map r8 = r0.f363684b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "send_cost"
            r8.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.u.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.j
    public void w(oi3.g recordMsgInfo, int i17) {
        kotlin.jvm.internal.o.g(recordMsgInfo, "recordMsgInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMsgSendFail Id:");
        int i18 = recordMsgInfo.f345617d;
        sb6.append(recordMsgInfo.getLong(i18 + 0));
        sb6.append(" Talker:");
        sb6.append(recordMsgInfo.getString(i18 + 3));
        sb6.append(" retCode:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", sb6.toString());
        switch (i17) {
            case -520019:
            case -520008:
            case -520002:
            case -510001:
                return;
            default:
                com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(recordMsgInfo.getString(i18 + 3), recordMsgInfo.getLong(i18 + 0));
                if (k17 != null) {
                    k17.r1(5);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.h2.class)).cj().lb(k17.getMsgId(), k17, true);
                    ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).Ai(k17.getMsgId());
                    ((com.tencent.mm.insane_statistic.a) ((v90.u) i95.n0.c(v90.u.class))).wi(k17);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.u.y(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
