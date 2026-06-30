package hz;

/* loaded from: classes12.dex */
public final class h extends qi3.c {

    /* renamed from: i, reason: collision with root package name */
    public final hz.m f286228i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f286229m;

    public h(hz.m params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f286228i = params;
    }

    @Override // qi3.b0
    public java.lang.Object B(kotlin.coroutines.Continuation continuation) {
        r45.ml4 ml4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " start to updateMsg");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        qi3.k0 k0Var = new qi3.k0(0);
        hz.m mVar = this.f286228i;
        mVar.f286242j = k0Var;
        oi3.g gVar = mVar.f286238f;
        java.util.Map map = k0Var.f363740b;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg failed: msgInfo is null");
            k0Var.f363739a = -520009;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.f0 f0Var = mVar.f286239g;
        if (f0Var != null && f0Var.f363700a != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: prepare failed with retCode=" + f0Var.f363700a);
            w(gVar, f0Var.f363700a);
            k0Var.f363739a = f0Var.f363700a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.i0 i0Var = mVar.f286240h;
        if (i0Var != null && i0Var.f363725a != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: upload failed with retCode=" + i0Var.f363725a);
            w(gVar, i0Var.f363725a);
            k0Var.f363739a = i0Var.f363725a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.d0 d0Var = mVar.f286241i;
        if (d0Var != null && d0Var.f363683a != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: sendCgi failed with retCode=" + d0Var.f363683a);
            w(gVar, d0Var.f363683a);
            k0Var.f363739a = d0Var.f363683a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = gVar.f345617d;
        com.tencent.mm.storage.f9 k17 = e0Var.k(gVar.getString(i17 + 3), gVar.getLong(i17 + 0));
        if (k17 != null) {
            qi3.d0 d0Var2 = mVar.f286241i;
            r9 = d0Var2 != null ? d0Var2.f363689g : null;
            if (r9 instanceof r45.fz5) {
                java.util.LinkedList linkedList = ((r45.fz5) r9).f374751e;
                if (linkedList != null && (ml4Var = (r45.ml4) kz5.n0.Z(linkedList)) != null) {
                    k17.o1(ml4Var.f380633n);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: set MsgSvrId=" + ml4Var.f380633n);
                }
            } else if (r9 instanceof r45.rr) {
                r45.rr rrVar = (r45.rr) r9;
                k17.o1(rrVar.f385130d);
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: byp set MsgSvrId=" + rrVar.f385130d);
            }
            k17.r1(2);
            e0Var.s(k17.Q0(), k17.getMsgId(), k17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg success: msgId=" + k17.getMsgId() + ", status=STATE_SENT");
            if (!mVar.f286235c) {
                com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
                long msgId = k17.getMsgId();
                am.xz xzVar = updateForwardMsgIdEvent.f54918g;
                xzVar.f8409a = msgId;
                xzVar.f8410b = 0;
                xzVar.f8411c = k17.Q0();
                updateForwardMsgIdEvent.e();
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: published UpdateForwardMsgIdEvent, msgId=" + k17.getMsgId() + ", talker=" + k17.Q0());
            }
            r9 = jz5.f0.f302826a;
        }
        if (r9 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: getMsgAndCheckById returned null");
            k0Var.f363739a = -520002;
        }
        map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return k0Var;
    }

    @Override // qi3.b0
    public qi3.h0 C() {
        return qi3.h0.f363720h;
    }

    @Override // qi3.b0
    public java.lang.Object D(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        long j17;
        java.lang.Object obj;
        java.lang.String str;
        qk.o oVar;
        java.lang.String Vi;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " start to prepare");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        hz.m mVar = this.f286228i;
        qi3.f0 f0Var = mVar.f286239g;
        if (f0Var == null) {
            f0Var = new qi3.f0(0);
            mVar.f286239g = f0Var;
        }
        qi3.f0 f0Var2 = f0Var;
        f0Var2.f363701b.put("send_msg_type", new java.lang.Integer(com.tencent.mm.storage.z3.m4(mVar.f286234b) ? 66 : 42));
        boolean z17 = mVar.f286235c;
        java.util.Map map = f0Var2.f363701b;
        if (z17) {
            map.put("resend_msg", new java.lang.Integer(1));
            oi3.g gVar = mVar.f286238f;
            if (gVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " prepare failed: isResend=true but sendMsgInfo is null");
                f0Var2.f363700a = -520009;
                map.put("prepare_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                return f0Var2;
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
            return f0Var2;
        }
        java.lang.String str2 = mVar.f286237e;
        if (str2 == null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(mVar.f286234b, true);
            java.lang.String str3 = mVar.f286234b;
            if (n17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", "buildCardXmlContent: contact is null for " + str3);
                j17 = elapsedRealtime;
                obj = "prepare_cost";
                str2 = null;
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str3);
                str = "";
                if (com.tencent.mm.storage.z3.m4(str3)) {
                    java.lang.String Q0 = n17.Q0();
                    if (n17.A0() == null || n17.A0().f382019e == 0 || n17.A0().f382019e == 2) {
                        obj = "prepare_cost";
                        j17 = elapsedRealtime;
                        Vi = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(n17.Q0(), "openim_desc_icon", j41.a0.TYPE_URL, 0);
                        kotlin.jvm.internal.o.f(Vi, "getAppIDString(...)");
                    } else {
                        j17 = elapsedRealtime;
                        obj = "prepare_cost";
                        Vi = "";
                    }
                    java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
                    kotlin.jvm.internal.o.f(fj6, "getWordingFromID(...)");
                    java.lang.Object[] objArr = new java.lang.Object[8];
                    java.lang.String c17 = n07 != null ? n07.c() : null;
                    if (c17 == null) {
                        c17 = "";
                    }
                    objArr[0] = com.tencent.mm.sdk.platformtools.t8.p(c17);
                    java.lang.String d17 = n07 != null ? n07.d() : null;
                    if (d17 == null) {
                        d17 = "";
                    }
                    objArr[1] = com.tencent.mm.sdk.platformtools.t8.p(d17);
                    objArr[2] = com.tencent.mm.sdk.platformtools.t8.p(n17.d1());
                    objArr[3] = com.tencent.mm.sdk.platformtools.t8.p(n17.f2());
                    objArr[4] = java.lang.Integer.valueOf(n17.I);
                    objArr[5] = com.tencent.mm.sdk.platformtools.t8.p(Q0 != null ? Q0 : "");
                    objArr[6] = com.tencent.mm.sdk.platformtools.t8.p(fj6);
                    objArr[7] = com.tencent.mm.sdk.platformtools.t8.p(Vi);
                    str2 = java.lang.String.format("<msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" sex=\"%d\" openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", java.util.Arrays.copyOf(objArr, 8));
                    kotlin.jvm.internal.o.f(str2, "format(...)");
                } else {
                    j17 = elapsedRealtime;
                    obj = "prepare_cost";
                    int i18 = n07 != null ? n07.f70530b : n17.H;
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    if (n17.k2()) {
                        java.lang.String d18 = n17.d1();
                        ((qv.o) u2Var).getClass();
                        oVar = r01.z.b(d18);
                    } else {
                        oVar = null;
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[17];
                    java.lang.String d19 = n17.d1();
                    if (d19 == null) {
                        d19 = "";
                    }
                    objArr2[0] = com.tencent.mm.sdk.platformtools.t8.p(d19);
                    java.lang.String f27 = n17.f2();
                    if (f27 == null) {
                        f27 = "";
                    }
                    objArr2[1] = com.tencent.mm.sdk.platformtools.t8.p(f27);
                    java.lang.String t07 = n17.t0();
                    if (t07 == null) {
                        t07 = "";
                    }
                    objArr2[2] = com.tencent.mm.sdk.platformtools.t8.p(t07);
                    java.lang.String f28 = n17.f2();
                    if (f28 == null) {
                        f28 = "";
                    }
                    objArr2[3] = com.tencent.mm.sdk.platformtools.t8.p(f28);
                    java.lang.String T0 = n17.T0();
                    if (T0 == null) {
                        T0 = "";
                    }
                    objArr2[4] = com.tencent.mm.sdk.platformtools.t8.p(T0);
                    objArr2[5] = java.lang.Integer.valueOf(i18);
                    java.lang.String str4 = n17.W;
                    if (str4 == null) {
                        str4 = "";
                    }
                    objArr2[6] = com.tencent.mm.sdk.platformtools.t8.p(str4);
                    java.lang.String str5 = n17.X;
                    if (str5 == null) {
                        str5 = "";
                    }
                    objArr2[7] = com.tencent.mm.sdk.platformtools.t8.p(str5);
                    java.lang.String str6 = n17.V;
                    if (str6 == null) {
                        str6 = "";
                    }
                    objArr2[8] = com.tencent.mm.sdk.platformtools.t8.p(str6);
                    objArr2[9] = java.lang.Integer.valueOf(n17.U);
                    objArr2[10] = java.lang.Integer.valueOf(n17.I);
                    objArr2[11] = java.lang.Integer.valueOf(n17.f1());
                    java.lang.String str7 = n17.f236588y0;
                    if (str7 == null) {
                        str7 = "";
                    }
                    objArr2[12] = com.tencent.mm.sdk.platformtools.t8.p(str7);
                    java.lang.String str8 = oVar != null ? oVar.field_brandIconURL : null;
                    if (str8 == null) {
                        str8 = "";
                    }
                    objArr2[13] = com.tencent.mm.sdk.platformtools.t8.p(str8);
                    java.lang.String str9 = n17.f236570l1;
                    if (str9 == null) {
                        str9 = "";
                    }
                    objArr2[14] = com.tencent.mm.sdk.platformtools.t8.p(str9);
                    byte[] bArr = mVar.f286236d;
                    if (bArr != null) {
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", "getBizNameCardString buffer size: " + bArr.length);
                            java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 2);
                            kotlin.jvm.internal.o.d(encodeToString);
                            str = encodeToString;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", "getBizNameCardString exception: " + e17.getMessage());
                        }
                    }
                    objArr2[15] = str;
                    objArr2[16] = 0;
                    str2 = java.lang.String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\" biznamecardinfo=\"%s\" brandType=\"%d\"/>", java.util.Arrays.copyOf(objArr2, 17));
                    kotlin.jvm.internal.o.f(str2, "format(...)");
                }
            }
        } else {
            j17 = elapsedRealtime;
            obj = "prepare_cost";
        }
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " prepare failed: buildCardXmlContent returned null");
            f0Var2.f363700a = -520009;
            return f0Var2;
        }
        this.f286229m = str2;
        oi3.g gVar2 = new oi3.g();
        mVar.f286238f = gVar2;
        java.lang.String str10 = mVar.f286233a;
        int i19 = gVar2.f345617d;
        gVar2.set(i19 + 3, str10);
        gVar2.set(i19 + 13, str2);
        gVar2.set(i19 + 4, java.lang.Integer.valueOf(com.tencent.mm.storage.z3.m4(mVar.f286234b) ? 66 : 42));
        gVar2.set(i19 + 7, 1);
        gVar2.set(i19 + 9, 1);
        gVar2.set(i19 + 2, java.lang.Long.valueOf(c01.w9.o(mVar.f286233a)));
        gVar2.set(i19 + 0, java.lang.Long.valueOf(pt0.f0.f358209b1.r(gVar2)));
        if (gVar2.getLong(i19 + 0) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " prepare failed: insertMsg returned " + gVar2.getLong(i19 + 0));
            f0Var2.f363700a = -520001;
            return f0Var2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " prepare success: msgId=" + gVar2.getLong(i19 + 0) + ", talker=" + gVar2.getString(i19 + 3));
        lVar.invoke(new com.tencent.mm.plugin.msg.MsgIdTalker(gVar2.getLong(i19 + 0), gVar2.getString(i19 + 3)));
        map.put("send_msg_local_id", new java.lang.Long(gVar2.getLong(i19 + 0)));
        map.put("send_msg_create_time", new java.lang.Long(gVar2.getLong(i19 + 2)));
        map.put(obj, new java.lang.Long(android.os.SystemClock.elapsedRealtime() - j17));
        return f0Var2;
    }

    @Override // qi3.c
    public qi3.e0 h() {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker;
        qi3.e0 e0Var = new qi3.e0(this.f363677f, this);
        hz.m mVar = this.f286228i;
        oi3.g gVar = mVar.f286238f;
        if (gVar != null) {
            int i17 = gVar.f345617d;
            msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(gVar.getLong(i17 + 0), gVar.getString(i17 + 3));
        } else {
            msgIdTalker = null;
        }
        e0Var.f363697g = msgIdTalker;
        e0Var.f363693c = mVar.f286239g;
        e0Var.f363694d = mVar.f286240h;
        e0Var.f363695e = mVar.f286241i;
        e0Var.f363696f = mVar.f286242j;
        return e0Var;
    }

    @Override // qi3.c
    public boolean j() {
        return com.tencent.mm.storage.z3.J3(this.f286228i.f286233a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(14:5|6|7|(2:121|(1:(4:124|125|126|47)(2:127|128))(4:129|130|131|98))(2:9|(2:11|12)(4:14|(1:16)|(1:120)(1:20)|(2:22|23)(16:24|25|26|28|29|30|31|32|33|34|35|36|37|38|39|(6:90|91|92|93|94|(1:96)(2:97|98))(4:41|42|43|(1:45)(2:46|47)))))|48|(1:50)|51|(1:53)(1:85)|54|55|(7:57|58|59|(3:61|(1:63)(1:66)|(1:65))|67|68|69)(3:75|(1:77)(1:79)|78)|70|71|72))|135|6|7|(0)(0)|48|(0)|51|(0)(0)|54|55|(0)(0)|70|71|72|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0185, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0271, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4 A[Catch: Exception -> 0x0185, TryCatch #5 {Exception -> 0x0185, blocks: (B:47:0x01b8, B:48:0x01ba, B:51:0x01c8, B:53:0x01d4, B:54:0x01da, B:57:0x01e2, B:59:0x01e9, B:61:0x0207, B:65:0x0213, B:67:0x0219, B:98:0x0182), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e2 A[Catch: Exception -> 0x0185, TRY_LEAVE, TryCatch #5 {Exception -> 0x0185, blocks: (B:47:0x01b8, B:48:0x01ba, B:51:0x01c8, B:53:0x01d4, B:54:0x01da, B:57:0x01e2, B:59:0x01e9, B:61:0x0207, B:65:0x0213, B:67:0x0219, B:98:0x0182), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024e A[Catch: Exception -> 0x0271, TryCatch #10 {Exception -> 0x0271, blocks: (B:69:0x0249, B:75:0x024e, B:78:0x0266), top: B:55:0x01e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    /* JADX WARN: Type inference failed for: r2v18, types: [qi3.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.Continuation, hz.f] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [qi3.c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [qi3.c] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [qi3.d0] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, qi3.d0] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [qi3.d0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, qi3.d0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz.h.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d6 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:11:0x003a, B:12:0x0189, B:15:0x01ca, B:17:0x01d6, B:18:0x01dc, B:20:0x01e4, B:22:0x01eb, B:24:0x0209, B:28:0x0214, B:30:0x021a, B:34:0x024b, B:36:0x024f, B:44:0x02ad, B:47:0x028a, B:38:0x026e, B:40:0x0272, B:42:0x0279), top: B:10:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e4 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:11:0x003a, B:12:0x0189, B:15:0x01ca, B:17:0x01d6, B:18:0x01dc, B:20:0x01e4, B:22:0x01eb, B:24:0x0209, B:28:0x0214, B:30:0x021a, B:34:0x024b, B:36:0x024f, B:44:0x02ad, B:47:0x028a, B:38:0x026e, B:40:0x0272, B:42:0x0279), top: B:10:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024b A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:11:0x003a, B:12:0x0189, B:15:0x01ca, B:17:0x01d6, B:18:0x01dc, B:20:0x01e4, B:22:0x01eb, B:24:0x0209, B:28:0x0214, B:30:0x021a, B:34:0x024b, B:36:0x024f, B:44:0x02ad, B:47:0x028a, B:38:0x026e, B:40:0x0272, B:42:0x0279), top: B:10:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz.h.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r45.ez5 u(oi3.g gVar, java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i());
        sb6.append(" createCgiRequest: start, toUserName=");
        hz.m mVar = this.f286228i;
        sb6.append(mVar.f286233a);
        sb6.append(", msgType=");
        sb6.append(i17);
        sb6.append(", contentLen=");
        sb6.append(str.length());
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", sb6.toString());
        r45.ll4 ll4Var = new r45.ll4();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = mVar.f286233a;
        du5Var.f372757e = true;
        ll4Var.f379572d = du5Var;
        ll4Var.f379573e = str;
        ll4Var.f379574f = i17;
        ll4Var.f379575g = (int) (gVar.getLong(gVar.f345617d + 2) / 1000);
        java.lang.String r17 = c01.z1.r();
        int i18 = gVar.f345617d;
        ll4Var.f379576h = c01.y1.a(r17, gVar.getLong(i18 + 2)).hashCode();
        try {
            if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(mVar.f286233a)) {
                ll4Var.f379578m = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(mVar.f286233a);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " createCgiRequest: SendMsgTicket exception: " + e17.getMessage(), e17);
        }
        try {
            w11.i1 i1Var = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).f442064d;
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(gVar.getString(i18 + 3), gVar.getLong(i18 + 0));
            if (k17 != null) {
                i1Var.j(ll4Var, k17);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " createCgiRequest: tempMsgInfo is null, skipping MsgSource assembly");
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " createCgiRequest: MsgSource assembly exception: " + e18.getMessage(), e18);
        }
        r45.ez5 ez5Var = new r45.ez5();
        java.util.LinkedList linkedList = ez5Var.f373851e;
        linkedList.add(ll4Var);
        ez5Var.f373850d = linkedList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " createCgiRequest: done, Count=" + ez5Var.f373850d);
        return ez5Var;
    }

    public final void w(oi3.g gVar, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " onMsgSendFail: retCode=" + i17);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.f9 k17 = e0Var.k(gVar.getString(gVar.f345617d + 3), gVar.getLong(gVar.f345617d + 0));
        if (k17 != null) {
            k17.r1(5);
            e0Var.s(k17.Q0(), k17.getMsgId(), k17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " onMsgSendFail: updated msg status to STATE_FAILED");
            com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
            sendMsgFailEvent.f54753g.f7461a = k17;
            sendMsgFailEvent.e();
        }
    }

    @Override // qi3.b0
    public java.lang.Object y(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " uploadAttach: no attachment needed for contact card");
        qi3.i0 i0Var = new qi3.i0(0);
        this.f286228i.f286240h = i0Var;
        i0Var.f363726b.put("upload_cost", new java.lang.Long(0L));
        return i0Var;
    }
}
