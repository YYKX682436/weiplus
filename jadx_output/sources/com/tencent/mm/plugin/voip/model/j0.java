package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.model.j0 f176682a = new com.tencent.mm.plugin.voip.model.j0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f176683b = java.util.Collections.synchronizedSet(new java.util.HashSet(4));

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f176684c = new java.util.concurrent.CopyOnWriteArraySet(new java.util.HashSet());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f176685d = new java.util.concurrent.locks.ReentrantLock();

    public static final boolean a(com.tencent.mm.plugin.voip.model.j0 j0Var, dm.sb sbVar) {
        j0Var.getClass();
        if (sbVar.u0() > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - sbVar.u0();
            if (1 <= currentTimeMillis && currentTimeMillis < 180000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "allowInsertLocalMsg: allow insert");
                return true;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "allowInsertLocalMsg: time out");
        } else if (sbVar.z0() > 0) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - sbVar.z0();
            if (1 <= currentTimeMillis2 && currentTimeMillis2 < 180000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "allowInsertLocalMsg: allow insert by inviteTS");
                return true;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "allowInsertLocalMsg: time out by inviteTS");
        }
        return false;
    }

    public static final com.tencent.mm.storage.f9 b(com.tencent.mm.plugin.voip.model.j0 j0Var, dm.sb sbVar, java.lang.String str) {
        j0Var.getClass();
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.e1(java.lang.System.currentTimeMillis());
        f9Var.setType(50);
        f9Var.u1(sbVar.T0());
        f9Var.d1(sbVar.P0() == 0 ? "voip_content_video" : "voip_content_voice");
        if (sbVar.I0() == 1) {
            f9Var.j1(1);
        } else {
            f9Var.j1(0);
        }
        f9Var.r1(6);
        f9Var.u3(str);
        return f9Var;
    }

    public static final boolean c(com.tencent.mm.plugin.voip.model.j0 j0Var, long j17, long j18, long j19) {
        j0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('-');
        sb6.append(j18);
        sb6.append('-');
        sb6.append(j19);
        return f176683b.contains(sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if (r4 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d() {
        /*
            bm5.o1 r0 = bm5.o1.f22719a
            bm5.h0 r1 = bm5.h0.RepairerConfig_VOIP_UseSvrBubble_Int
            r2 = 0
            int r0 = r0.g(r1, r2)
            r1 = -1
            java.lang.String r3 = "MicroMsg.VoIPBubbleHelper"
            if (r0 == r1) goto L4d
            r1 = 1
            if (r0 == r1) goto L4c
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r4 = e42.d0.clicfg_voip_svr_bubble_enable
            h62.d r0 = (h62.d) r0
            int r0 = r0.Ni(r4, r2)
            java.lang.Class<jp5.n> r4 = jp5.n.class
            i95.m r4 = i95.n0.c(r4)
            jp5.n r4 = (jp5.n) r4
            co5.p r4 = (co5.p) r4
            boolean r4 = r4.getEnable()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "enableSwitch: xconfig "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = " enableILink "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r3, r5)
            if (r0 == r1) goto L4c
            if (r4 == 0) goto L4d
        L4c:
            r2 = r1
        L4d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "enableSwitch: enable "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.j0.d():boolean");
    }

    public static final jz5.l g(long j17) {
        dm.sb i17 = f176682a.i(dm.sb.W0(j17));
        java.lang.Long valueOf = i17 != null ? java.lang.Long.valueOf(i17.z0()) : null;
        java.lang.Long valueOf2 = i17 != null ? java.lang.Long.valueOf(i17.w0()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "getInviteAndConnectTimeByRoomId: inviteTime " + valueOf + " connectTime " + valueOf2);
        return new jz5.l(java.lang.Long.valueOf(valueOf != null ? valueOf.longValue() : 0L), java.lang.Long.valueOf(valueOf2 != null ? valueOf2.longValue() : 0L));
    }

    public static final long h(long j17) {
        dm.sb i17 = f176682a.i(dm.sb.W0(j17));
        java.lang.Long valueOf = i17 != null ? java.lang.Long.valueOf(i17.z0()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "getInviteTimeByRoomId: time " + valueOf);
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    public static final synchronized com.tencent.mm.modelbase.q0 j(java.lang.String content, r45.j4 addMsg) {
        int i17;
        com.tencent.mm.modelbase.q0 q0Var;
        synchronized (com.tencent.mm.plugin.voip.model.j0.class) {
            kotlin.jvm.internal.o.g(content, "content");
            kotlin.jvm.internal.o.g(addMsg, "addMsg");
            java.util.concurrent.locks.ReentrantLock reentrantLock = f176685d;
            reentrantLock.lock();
            r45.j07 q17 = q(content);
            if (q17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoIPBubbleHelper", "handlerBubbleMsg: parse bubble info error");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "handlerBubbleMsg: msg " + q17.f377477d + ", roomid " + q17.f377480g + ", roomkey " + q17.f377481h + ", inviteid " + q17.f377482i + ", msgType " + q17.f377483m + " identity " + q17.f377485o);
            com.tencent.mm.plugin.voip.model.j0 j0Var = f176682a;
            dm.sb e17 = j0Var.e(q17);
            if (e17 == null) {
                e17 = new dm.sb();
                f176684c.add(e17);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "handlerBubbleMsg: not find item in db");
                e17.q1(q17.f377480g);
                e17.r1(q17.f377481h);
                e17.h1(q17.f377482i);
                e17.p1(q17.f377478e);
                e17.e1(q17.f377485o);
                e17.j1(q17.f377483m);
                e17.f1(java.lang.System.currentTimeMillis());
                e17.Y0(1);
                j0Var.k(e17);
            }
            java.lang.String g17 = x51.j1.g(addMsg.f377558e);
            java.lang.String g18 = x51.j1.g(addMsg.f377559f);
            if (kotlin.jvm.internal.o.b(g17, c01.z1.r())) {
                kotlin.jvm.internal.o.d(g18);
                i17 = 1;
            } else {
                kotlin.jvm.internal.o.d(g17);
                g18 = g17;
                i17 = 0;
            }
            com.tencent.mm.storage.f9 o17 = pt0.f0.f358209b1.o(g18, e17.G0(), true);
            if (o17 != null) {
                com.tencent.mm.storage.f9 f9Var = (o17.getMsgId() > 0L ? 1 : (o17.getMsgId() == 0L ? 0 : -1)) > 0 ? o17 : null;
                if (f9Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "handlerBubbleMsg: update msg it.msgSvrId(" + f9Var.I0() + ") addMsg.NewMsgId(" + addMsg.f377568r + ')');
                    f9Var.u3(q17.f377477d);
                    if (f9Var.I0() == 0) {
                        f9Var.o1(addMsg.f377568r);
                    }
                    if (!ip.l.f(content)) {
                        f9Var.d1(content);
                    }
                    if (kotlin.jvm.internal.o.b(f9Var.Q0(), g18)) {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(e17.G0(), f9Var, true);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "handlerBubbleMsg: update msg error, addMsg.talker(" + g18 + ") != it.talker(" + f9Var.Q0() + ')');
                    }
                    reentrantLock.unlock();
                    q0Var = new com.tencent.mm.modelbase.q0(f9Var, false);
                    return q0Var;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "handlerBubbleMsg: no msg inserted");
            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
            long m17 = c01.w9.m(g17, addMsg.f377565o);
            f9Var2.o1(addMsg.f377568r);
            long J0 = e17.J0();
            if (m17 >= J0) {
                J0 = m17;
            }
            if (m17 > J0) {
                m17 = J0;
            }
            f9Var2.e1(m17);
            f9Var2.setType(addMsg.f377560g);
            f9Var2.d1(content);
            f9Var2.u1(g18);
            f9Var2.j1(i17);
            f9Var2.r1(q17.f377479f ? 3 : 6);
            f9Var2.u3(q17.f377477d);
            e17.k1(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2));
            e17.o1(4);
            e17.a1(f9Var2.getCreateTime());
            e17.j1(q17.f377483m);
            j0Var.t(e17);
            reentrantLock.unlock();
            q0Var = new com.tencent.mm.modelbase.q0(f9Var2, true);
            return q0Var;
        }
    }

    public static final void m(long j17, long j18, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "markCgiCalled() called with: roomId = " + j17 + ", roomKey = " + j18 + ", inviteId = " + i17);
        long j19 = (long) i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "[+] remove freshly created voip info: %s,%s,%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('-');
        sb6.append(j18);
        sb6.append('-');
        sb6.append(j19);
        f176683b.remove(sb6.toString());
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.voip.model.i0(j17, j18, i17));
    }

    public static final void n(com.tencent.mm.plugin.voip.model.k0 voipInfo) {
        kotlin.jvm.internal.o.g(voipInfo, "voipInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "markRoomConnected() called with: voipInfo = " + voipInfo);
        com.tencent.mm.plugin.voip.model.j0 j0Var = f176682a;
        dm.sb f17 = j0Var.f(voipInfo);
        if (f17 != null) {
            f17.o1(2);
            f17.c1(java.lang.System.currentTimeMillis());
            j0Var.t(f17);
        }
    }

    public static final void o(com.tencent.mm.plugin.voip.model.k0 voipInfo) {
        kotlin.jvm.internal.o.g(voipInfo, "voipInfo");
        java.util.concurrent.locks.ReentrantLock reentrantLock = f176685d;
        reentrantLock.lock();
        p(voipInfo, false);
        reentrantLock.unlock();
    }

    public static final void p(com.tencent.mm.plugin.voip.model.k0 voipInfo, boolean z17) {
        kotlin.jvm.internal.o.g(voipInfo, "voipInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "markRoomCreated() called with: voipInfo = " + voipInfo);
        long j17 = voipInfo.f176689a;
        long j18 = voipInfo.f176691c;
        if (j17 == 0 && j18 == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "markRoomCreated: not valued info");
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        long j19 = voipInfo.f176690b;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "[+] add freshly created voip info: %s,%s,%s", valueOf, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j18));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('-');
        sb6.append(j19);
        sb6.append('-');
        sb6.append(j18);
        f176683b.add(sb6.toString());
        com.tencent.mm.plugin.voip.model.j0 j0Var = f176682a;
        dm.sb f17 = j0Var.f(voipInfo);
        java.lang.String str = voipInfo.f176692d;
        boolean z18 = voipInfo.f176694f;
        boolean z19 = voipInfo.f176693e;
        if (f17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "markRoomCreated: already has record");
            f17.p1(!z19 ? 1 : 0);
            f17.l1(z18 ? 1 : 0);
            f17.u1(str);
            f17.i1(1);
            if (z17) {
                f17.Y0(1);
            }
            j0Var.t(f17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "markRoomCreated: insert new record");
        dm.sb sbVar = new dm.sb();
        sbVar.q1(j17);
        sbVar.r1(j19);
        sbVar.h1(j18);
        sbVar.p1(!z19 ? 1 : 0);
        sbVar.l1(z18 ? 1 : 0);
        sbVar.u1(str);
        sbVar.k1(-1L);
        sbVar.o1(1);
        sbVar.f1(java.lang.System.currentTimeMillis());
        sbVar.i1(1);
        if (z17) {
            sbVar.Y0(1);
        }
        f176684c.add(sbVar);
        j0Var.k(sbVar);
    }

    public static final r45.j07 q(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "VoIPBubbleMsg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPBubbleHelper", "parseBubbleMsg: parse value error");
            return null;
        }
        r45.j07 j07Var = new r45.j07();
        j07Var.f377477d = r(d17, "msg");
        j07Var.f377478e = com.tencent.mm.sdk.platformtools.t8.P(r(d17, "room_type"), 0);
        j07Var.f377479f = com.tencent.mm.sdk.platformtools.t8.y(r(d17, "red_dot"), false);
        j07Var.f377480g = com.tencent.mm.sdk.platformtools.t8.V(r(d17, "roomid"), 0L);
        j07Var.f377481h = com.tencent.mm.sdk.platformtools.t8.V(r(d17, "roomkey"), 0L);
        j07Var.f377482i = com.tencent.mm.sdk.platformtools.t8.V(r(d17, "inviteid64"), 0L);
        j07Var.f377483m = com.tencent.mm.sdk.platformtools.t8.P(r(d17, "msg_type"), 0);
        j07Var.f377484n = com.tencent.mm.sdk.platformtools.t8.V(r(d17, com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP), 0L);
        j07Var.f377485o = r(d17, "identity");
        j07Var.f377486p = com.tencent.mm.sdk.platformtools.t8.P(r(d17, "duration"), 0);
        return j07Var;
    }

    public static final java.lang.String r(java.util.Map map, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) map.get(".VoIPBubbleMsg." + str);
        return str2 == null ? "" : str2;
    }

    public static final r45.j07 s(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "voipinvitemsg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPBubbleHelper", "parseBubbleMsg voipInviteMsgValues: parse value error");
            return null;
        }
        java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(str, "voiplocalinfo", null);
        if (d18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPBubbleHelper", "parseBubbleMsg voipLocalInfoValues: parse value error");
            return null;
        }
        r45.j07 j07Var = new r45.j07();
        java.lang.String str2 = (java.lang.String) d18.get(".voiplocalinfo.diaplay_content");
        if (str2 == null) {
            str2 = "";
        }
        j07Var.f377477d = str2;
        java.lang.String str3 = (java.lang.String) d17.get(".voipinvitemsg.invite_type");
        if (str3 == null) {
            str3 = "";
        }
        j07Var.f377478e = com.tencent.mm.sdk.platformtools.t8.P(str3, 0);
        java.lang.String str4 = (java.lang.String) d17.get(".voipinvitemsg.id");
        if (str4 == null) {
            str4 = "";
        }
        j07Var.f377480g = com.tencent.mm.sdk.platformtools.t8.V(str4, 0L);
        java.lang.String str5 = (java.lang.String) d18.get(".voiplocalinfo.key");
        j07Var.f377481h = com.tencent.mm.sdk.platformtools.t8.V(str5 != null ? str5 : "", 0L);
        return j07Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dm.sb e(r45.j07 r17) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.j0.e(r45.j07):dm.sb");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dm.sb f(com.tencent.mm.plugin.voip.model.k0 r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getBubbleInfoByVoIPInfo() called with: voipInfo = "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.VoIPBubbleHelper"
            com.tencent.mars.xlog.Log.i(r3, r2)
            long r4 = r1.f176689a
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            com.tencent.mm.plugin.voip.model.j0 r4 = com.tencent.mm.plugin.voip.model.j0.f176682a
            long r8 = r1.f176690b
            long r10 = r1.f176691c
            long r12 = r1.f176689a
            if (r2 <= 0) goto Laa
            java.util.concurrent.CopyOnWriteArraySet r1 = com.tencent.mm.plugin.voip.model.j0.f176684c
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            r14 = 0
            r15 = 1
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            r16 = r2
            dm.sb r16 = (dm.sb) r16
            long r16 = r16.Q0()
            int r16 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r16 != 0) goto L48
            r16 = r15
            goto L4a
        L48:
            r16 = r14
        L4a:
            if (r16 == 0) goto L2d
            goto L4e
        L4d:
            r2 = 0
        L4e:
            dm.sb r2 = (dm.sb) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "getBubbleInfoInCache "
            r1.<init>(r5)
            if (r2 != 0) goto L5b
            r5 = r15
            goto L5c
        L5b:
            r5 = r14
        L5c:
            r1.append(r5)
            java.lang.String r5 = " in "
            r1.append(r5)
            r1.append(r12)
            r5 = 32
            r1.append(r5)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r3, r1)
            if (r2 == 0) goto L79
            return r2
        L79:
            p75.l0 r1 = dm.sb.W0(r12)
            dm.sb r1 = r0.i(r1)
            if (r1 == 0) goto Laa
            long r17 = r1.R0()
            int r2 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r2 != 0) goto L8c
            r14 = r15
        L8c:
            if (r14 == 0) goto L8f
            goto L90
        L8f:
            r1 = 0
        L90:
            if (r1 == 0) goto Laa
            long r14 = r1.A0()
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 != 0) goto Lab
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 == 0) goto Lab
            java.lang.String r2 = "getBubbleInfoByVoIPInfo: update inviteid"
            com.tencent.mars.xlog.Log.i(r3, r2)
            r1.h1(r10)
            r4.t(r1)
            goto Lab
        Laa:
            r1 = 0
        Lab:
            if (r1 != 0) goto Ld8
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 <= 0) goto Ld6
            p75.l0 r1 = dm.sb.U0(r10)
            dm.sb r1 = r0.i(r1)
            if (r1 == 0) goto Ld6
            long r10 = r1.Q0()
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 != 0) goto Ld8
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 == 0) goto Ld8
            java.lang.String r2 = "getBubbleInfoByVoIPInfo: update roomid"
            com.tencent.mars.xlog.Log.i(r3, r2)
            r1.q1(r12)
            r1.r1(r8)
            r4.t(r1)
            goto Ld8
        Ld6:
            r5 = 0
            goto Ld9
        Ld8:
            r5 = r1
        Ld9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.j0.f(com.tencent.mm.plugin.voip.model.k0):dm.sb");
    }

    public final dm.sb i(p75.l0 l0Var) {
        java.lang.Object obj;
        java.util.Iterator it = l0Var.k(lq4.b.f320461n.a().Q4(), dm.sb.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = true;
            if (((dm.sb) obj).D0() != 1) {
                z17 = false;
            }
            if (z17) {
                break;
            }
        }
        return (dm.sb) obj;
    }

    public final long k(dm.sb sbVar) {
        kotlin.jvm.internal.o.g(sbVar, "<this>");
        long j17 = 100;
        sbVar.d1((java.lang.System.currentTimeMillis() * j17) + (java.lang.System.nanoTime() % j17));
        return new m75.c(sbVar, true, null, null, "MicroMsg.SDK.BaseVoIPBubbleInfo").a(lq4.b.f320461n.a().Q4());
    }

    public final synchronized long l(dm.sb sbVar, com.tencent.mm.storage.f9 f9Var) {
        if (!d()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "insertMsg: switch not enabled");
            return 0L;
        }
        if (sbVar.L0() == 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "insertMsg: already has bubble msg");
            return sbVar.G0();
        }
        if (sbVar.J0() > 0 && f9Var.getCreateTime() >= sbVar.J0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "insertMsg: modify bubble msg create time from " + f9Var.getCreateTime() + " to " + (sbVar.J0() - 1));
            f9Var.e1(sbVar.J0() - 1);
        }
        long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "insertMsg: insert msg " + sbVar.T0() + ' ' + sbVar.Q0() + ' ' + sbVar.A0() + ' ' + sbVar.y0() + ' ' + f9Var.G + ' ' + f9Var.getMsgId());
        sbVar.k1(M9);
        sbVar.o1(3);
        sbVar.a1(f9Var.getCreateTime());
        f176682a.t(sbVar);
        return M9;
    }

    public final int t(dm.sb sbVar) {
        kotlin.jvm.internal.o.g(sbVar, "<this>");
        return new m75.e(sbVar, null, null, "MicroMsg.SDK.BaseVoIPBubbleInfo").a(lq4.b.f320461n.a().Q4());
    }
}
