package jg0;

/* loaded from: classes12.dex */
public final class x extends qi3.c {

    /* renamed from: o, reason: collision with root package name */
    public static volatile java.util.concurrent.ConcurrentHashMap f299634o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public static volatile java.util.concurrent.ConcurrentHashMap f299635p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public static volatile java.util.concurrent.ConcurrentHashMap f299636q = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f299637r = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final cg0.d f299638i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f299639m;

    /* renamed from: n, reason: collision with root package name */
    public final jg0.v f299640n;

    public x(cg0.d params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f299638i = params;
        this.f299639m = jz5.h.b(new jg0.w(this));
        this.f299640n = new jg0.v(this);
    }

    public static final int E(jg0.x xVar, java.lang.String str) {
        com.tencent.mm.modelbase.g1 g1Var;
        xVar.getClass();
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f299637r.get(str);
        if (weakReference == null || (g1Var = (com.tencent.mm.modelbase.g1) weakReference.get()) == null) {
            return -1;
        }
        return (int) g1Var.c();
    }

    public static final void G(jg0.x xVar, oi3.g gVar, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMsgSendFail, Set error failed file:");
        cg0.d dVar = xVar.f299638i;
        sb6.append(dVar.f41049b);
        sb6.append(", msgId:");
        sb6.append(gVar.getLong(gVar.f345617d + 0));
        sb6.append(", talker: ");
        int i18 = gVar.f345617d;
        int i19 = i18 + 3;
        sb6.append(gVar.getString(i19));
        com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", sb6.toString());
        ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
        java.lang.String str = dVar.f41049b;
        w21.w0 j17 = w21.x0.j(str);
        if (j17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", "Set error failed file:" + str);
            return;
        }
        switch (i17) {
            case -530032:
                com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", "setError retCode: " + i17 + ", file: " + str + " msgId: " + j17.f442496m + " old stat: " + j17.f442492i);
                return;
            case -530031:
                if (j17.f442492i == 3) {
                    pt0.e0 e0Var = pt0.f0.f358209b1;
                    com.tencent.mm.storage.f9 k17 = e0Var.k(j17.f442486c, j17.f442496m);
                    if (k17 != null) {
                        z15.b bVar = dVar.f41052e;
                        if (bVar != null) {
                            bVar.t(false);
                        }
                        z15.b bVar2 = dVar.f41052e;
                        k17.d1(bVar2 != null ? bVar2.toXml() : null);
                        k17.r1(2);
                        e0Var.s(j17.f442486c, k17.getMsgId(), k17);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "onMsgSendFail, msg is null");
                    }
                }
                j17.f442492i = 97;
                j17.f442494k = java.lang.System.currentTimeMillis() / 1000;
                j17.f442484a = com.tencent.mapsdk.internal.km.f50100e;
                ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(str, j17);
                return;
            case -510001:
                xVar.x();
                return;
            default:
                j17.f442492i = 98;
                j17.f442494k = java.lang.System.currentTimeMillis() / 1000;
                j17.f442484a = com.tencent.mapsdk.internal.km.f50100e;
                com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", "setError ret: " + ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(str, j17) + ", file: " + str + " msgId: " + j17.f442496m + " old stat: " + j17.f442492i);
                pt0.e0 e0Var2 = pt0.f0.f358209b1;
                com.tencent.mm.storage.f9 k18 = e0Var2.k(gVar.getString(i19), gVar.getLong(i18 + 0));
                if (k18 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "onMsgSendFail, msg is null");
                    return;
                }
                k18.setMsgId(j17.f442496m);
                k18.q3(dVar.f41056i);
                k18.r1(5);
                k18.u1(j17.f442486c);
                z15.b bVar3 = dVar.f41052e;
                if (bVar3 != null) {
                    bVar3.t(true);
                }
                z15.b bVar4 = dVar.f41052e;
                k18.d1(bVar4 != null ? bVar4.toXml() : null);
                k18.l1(k18.F & (-8193));
                e0Var2.s(j17.f442486c, k18.getMsgId(), k18);
                com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent voiceMsgDownloadFinishEvent = new com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent();
                long msgId = k18.getMsgId();
                am.p00 p00Var = voiceMsgDownloadFinishEvent.f54936g;
                p00Var.f7590a = msgId;
                p00Var.f7591b = false;
                p00Var.f7592c = j17.c();
                voiceMsgDownloadFinishEvent.b(android.os.Looper.getMainLooper());
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(jg0.x r6, kotlin.coroutines.Continuation r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof jg0.k
            if (r0 == 0) goto L16
            r0 = r7
            jg0.k r0 = (jg0.k) r0
            int r1 = r0.f299583g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f299583g = r1
            goto L1b
        L16:
            jg0.k r0 = new jg0.k
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f299581e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f299583g
            java.lang.String r3 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r6 = r0.f299580d
            jg0.x r6 = (jg0.x) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L84
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.f299580d
            jg0.x r6 = (jg0.x) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L54
        L43:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.p()
            r0.f299580d = r6
            r0.f299583g = r5
            java.lang.Object r7 = r6.l(r0)
            if (r7 != r1) goto L54
            goto La8
        L54:
            qi3.d0 r7 = (qi3.d0) r7
            r6.f1()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r6.i()
            r2.append(r5)
            java.lang.String r5 = " rerunSendCgi, send cgi retCode:"
            r2.append(r5)
            int r7 = r7.f363683a
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.tencent.mars.xlog.Log.i(r3, r7)
            r6.s()
            r0.f299580d = r6
            r0.f299583g = r4
            java.lang.Object r7 = r6.B(r0)
            if (r7 != r1) goto L84
            goto La8
        L84:
            qi3.k0 r7 = (qi3.k0) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.i()
            r0.append(r1)
            java.lang.String r1 = " rerunSendCgi, updateMsg retCode:"
            r0.append(r1)
            int r7 = r7.f363739a
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r7)
            r6.f1()
            jz5.f0 r1 = jz5.f0.f302826a
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.H(jg0.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(jg0.x r11, w21.w0 r12, z15.b r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.u(jg0.x, w21.w0, z15.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(jg0.x r22, qi3.d0 r23, w21.w0 r24, int r25, int r26, w21.t r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 1313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.w(jg0.x, qi3.d0, w21.w0, int, int, w21.t, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.b0
    public java.lang.Object A(kotlin.coroutines.Continuation continuation) {
        int i17;
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        cg0.d dVar = this.f299638i;
        java.util.Map map = dVar.f41060m;
        java.lang.String str2 = dVar.f41059l;
        linkedHashMap.putAll(map);
        qi3.f0 f0Var = dVar.f41064q;
        java.lang.String str3 = "PrepareError";
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
                str3 = str;
            }
            str = str3;
        }
        qi3.i0 i0Var = dVar.f41065r;
        if (i0Var != null) {
            linkedHashMap.putAll(i0Var.f363726b);
            int i19 = i0Var.f363725a;
            if (i19 != 0) {
                str = "UploadError";
                i17 = i19;
            }
        }
        qi3.d0 d0Var = dVar.f41066s;
        if (d0Var != null) {
            linkedHashMap.putAll(d0Var.f363684b);
            int i27 = d0Var.f363683a;
            if (i27 != 0) {
                str = "SendCgiError";
                i17 = i27;
            }
        }
        qi3.k0 k0Var = dVar.f41067t;
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
        linkedHashMap.put("send_failback_to_cgi", new java.lang.Integer(dVar.f41061n ? 1 : 0));
        linkedHashMap.put("send_use_cdn_upload", new java.lang.Integer(L() ? 1 : 0));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        oi3.g gVar = dVar.f41058k;
        sb6.append(gVar != null ? new java.lang.Long(gVar.getLong(gVar.f345617d + 1)) : null);
        sb6.append('_');
        oi3.g gVar2 = dVar.f41058k;
        sb6.append(gVar2 != null ? new java.lang.Long(gVar2.getLong(gVar2.f345617d + 0)) : null);
        sb6.append('_');
        oi3.g gVar3 = dVar.f41058k;
        sb6.append(gVar3 != null ? new java.lang.Integer(gVar3.getInteger(gVar3.f345617d + 4)) : null);
        linkedHashMap.put("send_msg_quote_svrid_msgid", sb6.toString());
        linkedHashMap.put("send_result_type", str);
        linkedHashMap.put("send_total_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - this.f363676e));
        linkedHashMap.put("inner_version", new java.lang.Integer(1));
        try {
            com.tencent.mm.autogen.mmdata.rpt.VoiceMessageDownloadStruct voiceMessageDownloadStruct = new com.tencent.mm.autogen.mmdata.rpt.VoiceMessageDownloadStruct();
            voiceMessageDownloadStruct.f61696k = voiceMessageDownloadStruct.b("EventId", str2, true);
            voiceMessageDownloadStruct.f61698m = voiceMessageDownloadStruct.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(linkedHashMap)), ",", ";", false), true);
            voiceMessageDownloadStruct.k();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "report26956: " + str2 + ' ' + linkedHashMap);
        return jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof jg0.r
            if (r0 == 0) goto L13
            r0 = r6
            jg0.r r0 = (jg0.r) r0
            int r1 = r0.f299610g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299610g = r1
            goto L18
        L13:
            jg0.r r0 = new jg0.r
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f299608e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f299610g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f299607d
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
            java.lang.String r2 = r5.i()
            r6.append(r2)
            java.lang.String r2 = " start to updateMsg"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.tencent.mars.xlog.Log.i(r2, r6)
            qi3.k0 r6 = new qi3.k0
            r2 = 0
            r6.<init>(r2)
            cg0.d r2 = r5.f299638i
            r2.f41067t = r6
            jg0.s r2 = new jg0.s
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f299607d = r6
            r0.f299610g = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r0 = r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.b0
    public qi3.h0 C() {
        return qi3.h0.f363717e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(yz5.l r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.D(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(com.tencent.mm.storage.f9 r10, w21.w0 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.I(com.tencent.mm.storage.f9, w21.w0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.J(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean L() {
        return ((java.lang.Boolean) ((jz5.n) this.f299639m).getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof jg0.f
            if (r0 == 0) goto L13
            r0 = r8
            jg0.f r0 = (jg0.f) r0
            int r1 = r0.f299567h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299567h = r1
            goto L18
        L13:
            jg0.f r0 = new jg0.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f299565f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f299567h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f299563d
            java.lang.Object r0 = r0.f299564e
            qi3.f0 r0 = (qi3.f0) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8b
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = r7.i()
            r8.append(r2)
            java.lang.String r2 = " start to initVoice"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.tencent.mars.xlog.Log.i(r2, r8)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r8 = r7.f299638i
            java.lang.String r2 = r8.f41048a
            boolean r2 = r26.n0.N(r2)
            if (r2 == 0) goto L69
            qi3.f0 r8 = new qi3.f0
            r0 = -520012(0xfffffffffff810b4, float:NaN)
            r8.<init>(r0)
            return r8
        L69:
            qi3.f0 r2 = new qi3.f0
            r6 = 0
            r2.<init>(r6)
            r8.f41064q = r2
            boolean r8 = r8.f41053f
            if (r8 == 0) goto L76
            return r2
        L76:
            jg0.g r8 = new jg0.g
            r6 = 0
            r8.<init>(r7, r2, r6)
            r0.f299564e = r2
            r0.f299563d = r4
            r0.f299567h = r3
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L89
            return r1
        L89:
            r0 = r2
            r1 = r4
        L8b:
            java.util.Map r8 = r0.f363701b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "init_cost"
            r8.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.M(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof jg0.p
            if (r0 == 0) goto L13
            r0 = r9
            jg0.p r0 = (jg0.p) r0
            int r1 = r0.f299604h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299604h = r1
            goto L18
        L13:
            jg0.p r0 = new jg0.p
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f299602f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f299604h
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r1 = r0.f299600d
            java.lang.Object r0 = r0.f299601e
            qi3.f0 r0 = (qi3.f0) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lad
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.i()
            r9.append(r2)
            java.lang.String r2 = " start to beginVoice"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.tencent.mars.xlog.Log.i(r2, r9)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r9 = r8.f299638i
            r6 = 0
            r9.f41054g = r6
            java.lang.String r7 = r9.f41048a
            boolean r7 = r26.n0.N(r7)
            if (r7 == 0) goto L6d
            qi3.f0 r9 = new qi3.f0
            r0 = -520012(0xfffffffffff810b4, float:NaN)
            r9.<init>(r0)
            return r9
        L6d:
            qi3.f0 r7 = new qi3.f0
            r7.<init>(r6)
            r9.f41064q = r7
            boolean r9 = r9.f41053f
            if (r9 == 0) goto L79
            return r7
        L79:
            boolean r9 = r8.L()
            if (r9 == 0) goto L98
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r8.i()
            r9.append(r0)
            java.lang.String r0 = " useCdnUpload = true, skip to beginVoice"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r2, r9)
            return r7
        L98:
            jg0.q r9 = new jg0.q
            r2 = 0
            r9.<init>(r8, r7, r2)
            r0.f299601e = r7
            r0.f299600d = r4
            r0.f299604h = r3
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto Lab
            return r1
        Lab:
            r1 = r4
            r0 = r7
        Lad:
            java.util.Map r9 = r0.f363701b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "start_cost"
            r9.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.N(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.c
    public java.lang.Integer d(boolean z17) {
        java.lang.Integer d17 = super.d(z17);
        if (d17 != null) {
            return d17;
        }
        cg0.d dVar = this.f299638i;
        oi3.g gVar = dVar.f41051d;
        if (gVar == null) {
            return dVar.f41054g ? null : -520009;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = gVar.f345617d;
        com.tencent.mm.storage.f9 k17 = e0Var.k(gVar.getString(i17 + 3), gVar.getLong(i17 + 0));
        if (k17 != null) {
            return (k17.W2() || k17.V2()) ? -520023 : null;
        }
        return -520002;
    }

    @Override // qi3.c
    public qi3.e0 h() {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker;
        qi3.e0 e0Var = new qi3.e0(this.f363677f, this);
        cg0.d dVar = this.f299638i;
        oi3.g gVar = dVar.f41051d;
        if (gVar != null) {
            int i17 = gVar.f345617d;
            msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(gVar.getLong(i17 + 0), gVar.getString(i17 + 3));
        } else {
            msgIdTalker = null;
        }
        e0Var.f363697g = msgIdTalker;
        e0Var.f363693c = dVar.f41064q;
        e0Var.f363694d = dVar.f41065r;
        e0Var.f363695e = dVar.f41066s;
        e0Var.f363696f = dVar.f41067t;
        return e0Var;
    }

    @Override // qi3.c
    public boolean j() {
        return com.tencent.mm.storage.z3.J3(this.f299638i.f41048a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof jg0.l
            if (r0 == 0) goto L13
            r0 = r9
            jg0.l r0 = (jg0.l) r0
            int r1 = r0.f299588h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299588h = r1
            goto L18
        L13:
            jg0.l r0 = new jg0.l
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f299586f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f299588h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f299584d
            java.lang.Object r0 = r0.f299585e
            qi3.d0 r0 = (qi3.d0) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L9b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.i()
            r9.append(r2)
            java.lang.String r2 = " start to sendBypCgi"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.tencent.mars.xlog.Log.i(r2, r9)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r9 = r8.f299638i
            int r6 = r9.f41063p
            r7 = 0
            if (r6 != r3) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.i()
            r0.append(r1)
            java.lang.String r1 = " sendBypCgi end, because endFlag = 1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            qi3.d0 r9 = r9.f41066s
            if (r9 != 0) goto L7e
            qi3.d0 r9 = new qi3.d0
            r9.<init>(r7)
        L7e:
            return r9
        L7f:
            qi3.d0 r2 = new qi3.d0
            r2.<init>(r7)
            r9.f41066s = r2
            jg0.m r9 = new jg0.m
            r6 = 0
            r9.<init>(r8, r2, r6)
            r0.f299585e = r2
            r0.f299584d = r4
            r0.f299588h = r3
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L99
            return r1
        L99:
            r0 = r2
            r1 = r4
        L9b:
            java.util.Map r9 = r0.f363684b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "send_cgi_cost"
            r9.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof jg0.n
            if (r0 == 0) goto L13
            r0 = r9
            jg0.n r0 = (jg0.n) r0
            int r1 = r0.f299596h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299596h = r1
            goto L18
        L13:
            jg0.n r0 = new jg0.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f299594f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f299596h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f299592d
            java.lang.Object r0 = r0.f299593e
            qi3.d0 r0 = (qi3.d0) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L9b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.i()
            r9.append(r2)
            java.lang.String r2 = " start to sendCgi"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.tencent.mars.xlog.Log.i(r2, r9)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r9 = r8.f299638i
            int r6 = r9.f41063p
            r7 = 0
            if (r6 != r3) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.i()
            r0.append(r1)
            java.lang.String r1 = " sendCgi end, because endFlag = 1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            qi3.d0 r9 = r9.f41066s
            if (r9 != 0) goto L7e
            qi3.d0 r9 = new qi3.d0
            r9.<init>(r7)
        L7e:
            return r9
        L7f:
            qi3.d0 r2 = new qi3.d0
            r2.<init>(r7)
            r9.f41066s = r2
            jg0.o r9 = new jg0.o
            r6 = 0
            r9.<init>(r8, r2, r6)
            r0.f299593e = r2
            r0.f299592d = r4
            r0.f299596h = r3
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L99
            return r1
        L99:
            r0 = r2
            r1 = r4
        L9b:
            java.util.Map r9 = r0.f363684b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "send_cgi_cost"
            r9.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.c, qi3.b0
    public void x() {
        super.x();
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        cg0.d dVar = this.f299638i;
        java.lang.String str = dVar.f41049b;
        ((bv.p0) h1Var).getClass();
        w21.w0 j17 = w21.x0.j(str);
        if (j17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", "setCancel, Get info Failed fileName:" + dVar.f41049b);
            return;
        }
        long j18 = j17.f442496m;
        com.tencent.mm.storage.f9 k17 = j18 != 0 ? pt0.f0.f358209b1.k(j17.f442486c, j18) : null;
        cv.h1 h1Var2 = (cv.h1) i95.n0.c(cv.h1.class);
        java.lang.String str2 = j17.f442485b;
        ((bv.p0) h1Var2).getClass();
        boolean e17 = w21.x0.e(k17, str2);
        long j19 = j17.f442496m;
        if (j19 != 0) {
            pt0.f0.f358209b1.b(j17.f442486c, j19);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "cancel record: delete msg ret:" + e17 + dVar.f41049b + " msgLocalId:" + j17.f442496m);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof jg0.t
            if (r0 == 0) goto L13
            r0 = r8
            jg0.t r0 = (jg0.t) r0
            int r1 = r0.f299626h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299626h = r1
            goto L18
        L13:
            jg0.t r0 = new jg0.t
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f299624f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f299626h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f299622d
            java.lang.Object r0 = r0.f299623e
            qi3.i0 r0 = (qi3.i0) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L79
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = r7.i()
            r8.append(r2)
            java.lang.String r2 = " start to uploadAttach"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.tencent.mars.xlog.Log.i(r2, r8)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r8 = r7.f299638i
            qi3.i0 r2 = r8.f41065r
            if (r2 != 0) goto L64
            qi3.i0 r2 = new qi3.i0
            r6 = 0
            r2.<init>(r6)
            r8.f41065r = r2
        L64:
            jg0.u r8 = new jg0.u
            r6 = 0
            r8.<init>(r7, r2, r6)
            r0.f299623e = r2
            r0.f299622d = r4
            r0.f299626h = r3
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            r0 = r2
            r1 = r4
        L79:
            java.util.Map r8 = r0.f363726b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "upload_cost"
            r8.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.y(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
