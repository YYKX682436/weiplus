package px;

@j95.b
/* loaded from: classes12.dex */
public final class b0 extends i95.w implements qx.f0, qi3.a0 {
    public java.lang.String Ai(com.tencent.mm.storage.f9 targetMsg, java.lang.String str, c01.h7 h7Var) {
        kotlin.jvm.internal.o.g(targetMsg, "targetMsg");
        return gt1.a.f275370a.b(targetMsg, null, str, h7Var);
    }

    public java.lang.String Bi(com.tencent.mm.storage.f9 targetMsg, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(targetMsg, "targetMsg");
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str3 == null || str3.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgTracerService", "tryInsertMessageTracebackInfo() called with: msgSource = " + str + ", svrMsgId = " + str2 + ", talkerUsername = " + str3);
                gt1.a aVar = gt1.a.f275370a;
                c01.h7 h7Var = new c01.h7();
                com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str3, com.tencent.mm.sdk.platformtools.b8.c(str2));
                h7Var.f37227b = o27.getMsgId();
                h7Var.f37229d = o27.Q0();
                return aVar.b(targetMsg, null, str, h7Var);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgTracerService", "tryInsertMessageTracebackInfo() called with: msgSource = " + str + ", svrMsgId = " + str2 + ", talkerUsername = " + str3);
        return str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x00c1, code lost:
    
        if ((r7 == null || r7.length() == 0) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c2 A[Catch: all -> 0x02c6, TRY_LEAVE, TryCatch #2 {all -> 0x02c6, blocks: (B:96:0x02b0, B:98:0x02b6, B:103:0x02c2, B:111:0x02ad), top: B:110:0x02ad }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0275 A[Catch: all -> 0x0279, TRY_LEAVE, TryCatch #4 {all -> 0x0279, blocks: (B:47:0x0136, B:120:0x0142, B:132:0x0161, B:146:0x0269, B:151:0x0275, B:154:0x01cb, B:156:0x01d5, B:159:0x01e0, B:161:0x01dc, B:163:0x01e7, B:165:0x01f1, B:168:0x01fd, B:169:0x01f8, B:171:0x0204, B:173:0x020e, B:176:0x0218, B:177:0x0215, B:179:0x021e, B:181:0x0228, B:184:0x0234, B:185:0x022f, B:187:0x023a, B:189:0x0242, B:192:0x024e, B:193:0x0249, B:195:0x0254, B:198:0x0261, B:199:0x025f), top: B:46:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f6 A[Catch: Exception -> 0x035e, TryCatch #1 {Exception -> 0x035e, blocks: (B:57:0x02d2, B:60:0x02de, B:63:0x02ed, B:65:0x02f6, B:67:0x0302, B:69:0x030a, B:71:0x0315, B:73:0x0321, B:74:0x032b, B:77:0x0356, B:79:0x033c, B:81:0x0342, B:82:0x034f), top: B:56:0x02d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030a A[Catch: Exception -> 0x035e, TryCatch #1 {Exception -> 0x035e, blocks: (B:57:0x02d2, B:60:0x02de, B:63:0x02ed, B:65:0x02f6, B:67:0x0302, B:69:0x030a, B:71:0x0315, B:73:0x0321, B:74:0x032b, B:77:0x0356, B:79:0x033c, B:81:0x0342, B:82:0x034f), top: B:56:0x02d2 }] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String, dn.h] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(com.tencent.mm.storage.f9 r21, c01.h7 r22) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: px.b0.Di(com.tencent.mm.storage.f9, c01.h7):void");
    }

    @Override // qi3.a0
    public void L8(qi3.e0 event) {
        int i17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f363691a == qi3.g0.f363712n) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            qi3.f0 f0Var = event.f363693c;
            java.lang.String str2 = "PrepareError";
            if (f0Var != null) {
                str = "Success";
                i17 = 0;
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
            qi3.k0 k0Var = event.f363696f;
            if (k0Var != null) {
                linkedHashMap.putAll(k0Var.f363740b);
                int i19 = k0Var.f363739a;
                if (i19 != 0) {
                    str = "UploadError";
                    i17 = i19;
                }
            }
            qi3.d0 d0Var = event.f363695e;
            if (d0Var != null) {
                linkedHashMap.putAll(d0Var.f363684b);
                int i27 = d0Var.f363683a;
                if (i27 != 0) {
                    str = "SendCgiError";
                    i17 = i27;
                }
            }
            qi3.k0 k0Var2 = event.f363696f;
            if (k0Var2 != null) {
                linkedHashMap.putAll(k0Var2.f363740b);
                int i28 = k0Var2.f363739a;
                if (i28 != 0) {
                    str = "UpdateMsgError";
                    i17 = i28;
                }
            }
            if (i17 == -520007) {
                t65.f Zi = ((k04.h) ((t65.e) i95.n0.c(t65.e.class))).Zi();
                linkedHashMap.put("send_from_last_screen", java.lang.Integer.valueOf(Zi.p()));
                linkedHashMap.put("send_network_tick_rate", java.lang.Float.valueOf(Zi.t()));
                linkedHashMap.put("send_from_last_network_min", java.lang.Integer.valueOf(Zi.n()));
                linkedHashMap.put("send_process_status", java.lang.Integer.valueOf(Zi.u()));
            }
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = event.f363697g;
            if (msgIdTalker != null) {
                com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(msgIdTalker.a(), msgIdTalker.f149480d);
                linkedHashMap.put("send_msg_type", java.lang.Integer.valueOf(k17 != null ? k17.getType() : 0));
                if (k17 != null && k17.k2()) {
                    java.lang.String j17 = k17.j();
                    if (!(j17 == null || j17.length() == 0)) {
                        try {
                            v05.b bVar = new v05.b();
                            java.lang.String j18 = k17.j();
                            kotlin.jvm.internal.o.f(j18, "getContent(...)");
                            bVar.fromXml(j18);
                            linkedHashMap.put("send_appmsg_type", java.lang.Integer.valueOf(bVar.getInteger(bVar.f368365d + 6)));
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                }
            }
            qi3.b0 b0Var = event.f363692b;
            linkedHashMap.put("send_type", b0Var.C());
            linkedHashMap.put("send_result_ret_code", java.lang.Integer.valueOf(i17));
            linkedHashMap.put("send_result_type", str);
            linkedHashMap.put("send_total_cost", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - ((qi3.c) b0Var).f363676e));
            linkedHashMap.put("send_task_id", b0Var.id());
            linkedHashMap.put("inner_version", 1);
            ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
            if (((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).sj(36407, linkedHashMap, 1)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("trace_send_msg", linkedHashMap, 36407);
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_msgtrace_tmpnode_enable, 0) == 1) {
            gt1.a.f275371b = true;
        }
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this);
    }

    public void qc(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgTraceHelper", "setScene() called with: scene = " + i17);
        gt1.a.f275372c = i17;
    }

    public void wi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgTraceHelper", "clearScene() called");
        gt1.a.f275372c = 2;
    }
}
