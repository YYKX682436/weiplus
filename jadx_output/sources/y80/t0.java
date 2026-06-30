package y80;

/* loaded from: classes12.dex */
public final class t0 extends qi3.c {

    /* renamed from: i, reason: collision with root package name */
    public final y80.q1 f459941i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459942m;

    public t0(y80.q1 params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f459941i = params;
    }

    @Override // qi3.b0
    public java.lang.Object B(kotlin.coroutines.Continuation continuation) {
        r45.ml4 ml4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " start to updateMsg");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        qi3.k0 k0Var = new qi3.k0(0);
        y80.q1 q1Var = this.f459941i;
        q1Var.f459921u = k0Var;
        oi3.g gVar = q1Var.f459903c;
        java.util.Map map = k0Var.f363740b;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg failed: msgInfo is null");
            k0Var.f363739a = -520009;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.f0 f0Var = q1Var.f459918r;
        if (f0Var != null && f0Var.f363700a != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: prepare failed with retCode=" + f0Var.f363700a);
            w(gVar, f0Var.f363700a);
            k0Var.f363739a = f0Var.f363700a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.i0 i0Var = q1Var.f459919s;
        if (i0Var != null && i0Var.f363725a != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: upload failed with retCode=" + i0Var.f363725a);
            w(gVar, i0Var.f363725a);
            k0Var.f363739a = i0Var.f363725a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.d0 d0Var = q1Var.f459920t;
        if (d0Var != null && d0Var.f363683a != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: sendCgi failed with retCode=" + d0Var.f363683a);
            w(gVar, d0Var.f363683a);
            k0Var.f363739a = d0Var.f363683a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = gVar.f345617d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(gVar.getString(i17 + 3), gVar.getLong(i17 + 0));
        qi3.d0 d0Var2 = q1Var.f459920t;
        r45.ny3 ny3Var = d0Var2 != null ? d0Var2.f363689g : null;
        if (ny3Var instanceof r45.fz5) {
            java.util.LinkedList linkedList = ((r45.fz5) ny3Var).f374751e;
            if (linkedList != null && (ml4Var = (r45.ml4) kz5.n0.Z(linkedList)) != null) {
                n17.o1(ml4Var.f380633n);
                c01.ia.P(n17, ml4Var.f380634o, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: set MsgSvrId=" + ml4Var.f380633n);
            }
        } else if (ny3Var instanceof r45.rr) {
            r45.rr rrVar = (r45.rr) ny3Var;
            n17.o1(rrVar.f385130d);
            com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: byp set MsgSvrId=" + rrVar.f385130d);
        }
        n17.r1(2);
        e0Var.s(n17.Q0(), n17.getMsgId(), n17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg success: msgId=" + n17.getMsgId() + ", status=STATE_SENT");
        if (!q1Var.f459902b) {
            com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
            long msgId = n17.getMsgId();
            am.xz xzVar = updateForwardMsgIdEvent.f54918g;
            xzVar.f8409a = msgId;
            xzVar.f8410b = 0;
            xzVar.f8411c = n17.Q0();
            updateForwardMsgIdEvent.e();
            com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: published UpdateForwardMsgIdEvent, msgId=" + n17.getMsgId() + ", talker=" + n17.Q0());
        }
        map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return k0Var;
    }

    @Override // qi3.b0
    public qi3.h0 C() {
        return qi3.h0.f363719g;
    }

    @Override // qi3.b0
    public java.lang.Object D(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " start to prepare");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        y80.q1 q1Var = this.f459941i;
        qi3.f0 f0Var = q1Var.f459918r;
        if (f0Var == null) {
            f0Var = new qi3.f0(0);
            q1Var.f459918r = f0Var;
        }
        f0Var.f363701b.put("send_msg_type", new java.lang.Integer(48));
        boolean z17 = q1Var.f459902b;
        java.util.Map map = f0Var.f363701b;
        if (z17) {
            map.put("resend_msg", new java.lang.Integer(1));
            oi3.g gVar = q1Var.f459903c;
            if (gVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " prepare failed: isResend=true but sendMsgInfo is null");
                f0Var.f363700a = -520009;
                map.put("prepare_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                return f0Var;
            }
            if (gVar != null) {
                int i17 = gVar.f345617d;
                map.put("send_msg_local_id", new java.lang.Long(gVar.getLong(i17 + 0)));
                map.put("send_msg_create_time", new java.lang.Long(gVar.getLong(i17 + 2)));
                pt0.e0 e0Var = pt0.f0.f358209b1;
                com.tencent.mm.storage.f9 k17 = e0Var.k(gVar.getString(i17 + 3), gVar.getLong(i17 + 0));
                if (k17 != null) {
                    long o17 = c01.w9.o(gVar.getString(i17 + 3));
                    if (o17 == k17.getCreateTime()) {
                        o17++;
                    }
                    k17.e1(o17);
                    k17.r1(1);
                    e0Var.s(k17.Q0(), k17.getMsgId(), k17);
                    gVar.set(i17 + 2, java.lang.Long.valueOf(k17.getCreateTime()));
                }
            }
            map.put("prepare_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return f0Var;
        }
        java.lang.String str2 = "<msg><location x=\"" + q1Var.f459904d + "\" y=\"" + q1Var.f459905e + "\" scale=\"" + q1Var.f459906f + "\" label=\"" + com.tencent.mm.sdk.platformtools.t8.p(q1Var.f459907g) + "\" poiname=\"" + com.tencent.mm.sdk.platformtools.t8.p(q1Var.f459908h) + "\" infourl=\"" + com.tencent.mm.sdk.platformtools.t8.p(q1Var.f459909i) + "\" maptype=\"0\" poiid=\"" + q1Var.f459910j + "\" isFromPoiList=\"" + q1Var.f459911k + "\" poiCategoryTips=\"" + q1Var.f459912l + "\" poiBusinessHour=\"" + q1Var.f459913m + "\" poiPhone=\"" + q1Var.f459914n + "\" poiPriceTips=\"" + q1Var.f459915o + "\" buildingId=\"" + q1Var.f459916p + "\" floorName=\"" + q1Var.f459917q + "\" /></msg>";
        this.f459942m = str2;
        oi3.g gVar2 = new oi3.g();
        q1Var.f459903c = gVar2;
        java.lang.String str3 = q1Var.f459901a;
        int i18 = gVar2.f345617d;
        gVar2.set(i18 + 3, str3);
        gVar2.set(i18 + 13, str2);
        gVar2.set(i18 + 4, 48);
        gVar2.set(i18 + 7, 1);
        gVar2.set(i18 + 9, 1);
        gVar2.set(i18 + 2, java.lang.Long.valueOf(c01.w9.o(q1Var.f459901a)));
        vg3.u3 u3Var = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).f442065e;
        if (u3Var != null) {
            ((j.f) ((p.j) i95.n0.c(p.j.class))).getClass();
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            obj = "prepare_cost";
            f9Var.setMsgId(gVar2.getLong(i18 + 0));
            f9Var.o1(gVar2.getLong(i18 + 1));
            f9Var.e1(gVar2.getLong(i18 + 2));
            f9Var.u1(gVar2.getString(i18 + 3));
            f9Var.setType(gVar2.getInteger(i18 + 4));
            f9Var.r1(gVar2.getInteger(i18 + 7));
            f9Var.j1(gVar2.getInteger(i18 + 9));
            f9Var.f1(gVar2.getInteger(i18 + 10));
            f9Var.d1(gVar2.getString(i18 + 13));
            f9Var.u3(gVar2.getString(i18 + 12));
            str = ((aq1.u0) u3Var).a(f9Var);
        } else {
            obj = "prepare_cost";
            str = null;
        }
        if (str == null) {
            str = "";
        }
        gVar2.set(i18 + 12, str);
        gVar2.set(i18 + 0, java.lang.Long.valueOf(pt0.f0.f358209b1.r(gVar2)));
        if (gVar2.getLong(i18 + 0) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " prepare failed: insertMsg returned " + gVar2.getLong(i18 + 0));
            f0Var.f363700a = -520001;
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " prepare success: msgId=" + gVar2.getLong(i18 + 0) + ", talker=" + gVar2.getString(i18 + 3));
        lVar.invoke(new com.tencent.mm.plugin.msg.MsgIdTalker(gVar2.getLong(i18 + 0), gVar2.getString(i18 + 3)));
        map.put("send_msg_local_id", new java.lang.Long(gVar2.getLong(i18 + 0)));
        map.put("send_msg_create_time", new java.lang.Long(gVar2.getLong(i18 + 2)));
        map.put(obj, new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return f0Var;
    }

    @Override // qi3.c
    public qi3.e0 h() {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker;
        qi3.e0 e0Var = new qi3.e0(this.f363677f, this);
        y80.q1 q1Var = this.f459941i;
        oi3.g gVar = q1Var.f459903c;
        if (gVar != null) {
            int i17 = gVar.f345617d;
            msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(gVar.getLong(i17 + 0), gVar.getString(i17 + 3));
        } else {
            msgIdTalker = null;
        }
        e0Var.f363697g = msgIdTalker;
        e0Var.f363693c = q1Var.f459918r;
        e0Var.f363694d = q1Var.f459919s;
        e0Var.f363695e = q1Var.f459920t;
        e0Var.f363696f = q1Var.f459921u;
        return e0Var;
    }

    @Override // qi3.c
    public boolean j() {
        return com.tencent.mm.storage.z3.J3(this.f459941i.f459901a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(14:5|6|(1:(4:9|10|11|12)(2:54|55))(2:56|(2:58|59)(4:60|(1:62)|(1:91)(1:66)|(2:68|69)(9:70|71|72|73|74|75|76|77|(1:79)(1:80))))|13|14|(1:16)|17|(1:19)(1:48)|20|21|(7:23|24|25|(3:27|(1:29)(1:32)|(1:31))|33|34|35)(1:42)|36|37|38))|92|6|(0)(0)|13|14|(0)|17|(0)(0)|20|21|(0)(0)|36|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0209, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020c, code lost:
    
        r5 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0174 A[Catch: Exception -> 0x020b, TryCatch #2 {Exception -> 0x020b, blocks: (B:14:0x0158, B:17:0x0168, B:19:0x0174, B:20:0x017a, B:23:0x0182, B:25:0x0189, B:27:0x01a7, B:31:0x01b3, B:33:0x01b9), top: B:13:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0182 A[Catch: Exception -> 0x020b, TRY_LEAVE, TryCatch #2 {Exception -> 0x020b, blocks: (B:14:0x0158, B:17:0x0168, B:19:0x0174, B:20:0x017a, B:23:0x0182, B:25:0x0189, B:27:0x01a7, B:31:0x01b3, B:33:0x01b9), top: B:13:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ee A[Catch: Exception -> 0x0209, TRY_LEAVE, TryCatch #4 {Exception -> 0x0209, blocks: (B:35:0x01e9, B:42:0x01ee), top: B:21:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.t0.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01bc A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:11:0x0040, B:12:0x016f, B:15:0x01b0, B:17:0x01bc, B:18:0x01c2, B:21:0x01cc, B:23:0x01ec, B:27:0x01f7, B:29:0x01fd, B:33:0x022e, B:35:0x0232, B:57:0x02f5, B:37:0x0251, B:39:0x0255, B:41:0x025b, B:43:0x026e, B:45:0x0278, B:47:0x027c, B:48:0x02cd, B:50:0x02e0, B:51:0x02ea), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01cc A[Catch: Exception -> 0x0045, TRY_ENTER, TryCatch #2 {Exception -> 0x0045, blocks: (B:11:0x0040, B:12:0x016f, B:15:0x01b0, B:17:0x01bc, B:18:0x01c2, B:21:0x01cc, B:23:0x01ec, B:27:0x01f7, B:29:0x01fd, B:33:0x022e, B:35:0x0232, B:57:0x02f5, B:37:0x0251, B:39:0x0255, B:41:0x025b, B:43:0x026e, B:45:0x0278, B:47:0x027c, B:48:0x02cd, B:50:0x02e0, B:51:0x02ea), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022e A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:11:0x0040, B:12:0x016f, B:15:0x01b0, B:17:0x01bc, B:18:0x01c2, B:21:0x01cc, B:23:0x01ec, B:27:0x01f7, B:29:0x01fd, B:33:0x022e, B:35:0x0232, B:57:0x02f5, B:37:0x0251, B:39:0x0255, B:41:0x025b, B:43:0x026e, B:45:0x0278, B:47:0x027c, B:48:0x02cd, B:50:0x02e0, B:51:0x02ea), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.t0.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r45.ez5 u(oi3.g gVar, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i());
        sb6.append(" createCgiRequest: start, toUserName=");
        y80.q1 q1Var = this.f459941i;
        sb6.append(q1Var.f459901a);
        sb6.append(", contentLen=");
        sb6.append(str.length());
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", sb6.toString());
        r45.ll4 ll4Var = new r45.ll4();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = q1Var.f459901a;
        du5Var.f372757e = true;
        ll4Var.f379572d = du5Var;
        ll4Var.f379573e = str;
        ll4Var.f379574f = 48;
        ll4Var.f379575g = (int) (gVar.getLong(gVar.f345617d + 2) / 1000);
        java.lang.String r17 = c01.z1.r();
        int i17 = gVar.f345617d;
        ll4Var.f379576h = c01.y1.a(r17, gVar.getLong(i17 + 2)).hashCode();
        try {
            if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(q1Var.f459901a)) {
                ll4Var.f379578m = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(q1Var.f459901a);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " createCgiRequest: SendMsgTicket exception: " + e17.getMessage(), e17);
        }
        try {
            w11.i1 i1Var = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).f442064d;
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(gVar.getString(i17 + 3), gVar.getLong(i17 + 0));
            if (k17 != null) {
                i1Var.j(ll4Var, k17);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " createCgiRequest: tempMsgInfo is null, skipping MsgSource assembly");
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " createCgiRequest: MsgSource assembly exception: " + e18.getMessage(), e18);
        }
        r45.ez5 ez5Var = new r45.ez5();
        java.util.LinkedList linkedList = ez5Var.f373851e;
        linkedList.add(ll4Var);
        ez5Var.f373850d = linkedList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " createCgiRequest: done, Count=" + ez5Var.f373850d);
        return ez5Var;
    }

    public final void w(oi3.g gVar, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " onMsgSendFail: retCode=" + i17);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.f9 k17 = e0Var.k(gVar.getString(gVar.f345617d + 3), gVar.getLong(gVar.f345617d + 0));
        if (k17 != null) {
            k17.r1(5);
            e0Var.s(k17.Q0(), k17.getMsgId(), k17);
            com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " onMsgSendFail: updated msg status to STATE_FAILED");
            com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
            sendMsgFailEvent.f54753g.f7461a = k17;
            sendMsgFailEvent.e();
        }
    }

    @Override // qi3.b0
    public java.lang.Object y(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " uploadAttach: no attachment needed for location msg");
        qi3.i0 i0Var = new qi3.i0(0);
        this.f459941i.f459919s = i0Var;
        i0Var.f363726b.put("upload_cost", new java.lang.Long(0L));
        return i0Var;
    }
}
