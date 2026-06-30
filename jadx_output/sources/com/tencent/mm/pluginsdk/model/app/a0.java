package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class a0 implements com.tencent.mm.modelbase.i1 {
    static {
        new java.util.HashMap();
    }

    public static void b(xg3.m0 m0Var, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "autoDownloadFile1 %s %s", java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.getMsgId()));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.model.app.c0(f9Var));
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int t17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return null;
        }
        if (!com.tencent.mm.storage.z3.R4(str) || (t17 = c01.w9.t(str3)) == -1) {
            return str3;
        }
        return (str3 + " ").substring(t17 + 2).trim();
    }

    public static void l(com.tencent.mm.storage.f9 f9Var, ot0.q qVar, int i17) {
        long j17;
        if (f9Var == null || qVar == null) {
            return;
        }
        long I0 = f9Var.I0();
        rt0.b bVar = (rt0.b) qVar.y(rt0.b.class);
        if (bVar != null) {
            long j18 = bVar.f399372b;
            if (j18 != 0) {
                j17 = j18;
                ct3.d.f222303a.a(f9Var, qVar, i17, j17);
            }
        }
        j17 = I0;
        ct3.d.f222303a.a(f9Var, qVar, i17, j17);
    }

    public static void m(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var == null) {
            return;
        }
        com.tencent.mm.ui.report.b bVar = com.tencent.mm.ui.report.b.f209619a;
        java.lang.String b17 = sc5.g.f406572a.b(f9Var);
        if (b17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleReceived fileExt is null");
            return;
        }
        com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(f9Var, b17, "", bVar.a(f9Var, null, null, false));
        com.tencent.mm.ui.report.e.f209628e.getClass();
        com.tencent.mm.ui.report.e eVar = (com.tencent.mm.ui.report.e) ((java.util.LinkedHashMap) com.tencent.mm.ui.report.e.f209629f).get(java.lang.Integer.valueOf(i17));
        if (eVar == null) {
            eVar = com.tencent.mm.ui.report.e.f209630g;
        }
        oVar.f209717l = eVar;
        com.tencent.mm.ui.report.d0.f209626a.d(com.tencent.mm.ui.report.p.f209720e, oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair n(com.tencent.mm.storage.f9 r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.a0.n(com.tencent.mm.storage.f9, boolean):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0218, code lost:
    
        if (r5 != null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x09eb A[RETURN] */
    @Override // com.tencent.mm.modelbase.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 r36) {
        /*
            Method dump skipped, instructions count: 2543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.a0.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:128|(4:130|(1:358)(1:136)|137|(2:139|(7:141|(1:143)|144|145|146|(2:148|(2:149|(3:151|(2:155|(1:159))|334)(2:338|339)))(2:340|(2:342|(5:344|(1:346)(1:352)|347|(1:349)(1:351)|350)(0))(0))|163)))(1:359)|357|144|145|146|(0)(0)|163) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0743, code lost:
    
        r13.f1(r13.w0() | 8);
        com.tencent.mars.xlog.Log.i(r3, "check c2c payer list, myself is payer, add red flag");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0755, code lost:
    
        r5 = r50;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0759, code lost:
    
        r5.o(true, r13.Q0());
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0852, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0858, code lost:
    
        com.tencent.mars.xlog.Log.e(r3, "check c2c payer list error: %s", r0.getMessage());
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0854, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0855, code lost:
    
        r5 = r50;
        r6 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0712 A[Catch: Exception -> 0x0854, TryCatch #3 {Exception -> 0x0854, blocks: (B:145:0x070a, B:148:0x0712, B:149:0x071a, B:151:0x0720, B:153:0x072e, B:155:0x0731, B:157:0x0739, B:160:0x0743), top: B:144:0x070a }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x08bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0768 A[Catch: Exception -> 0x0852, TryCatch #4 {Exception -> 0x0852, blocks: (B:162:0x0759, B:340:0x0768, B:342:0x0775, B:344:0x07a0, B:346:0x07f3, B:347:0x0814, B:349:0x083a, B:350:0x0846, B:351:0x0841, B:352:0x0804), top: B:146:0x0710 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x039a  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r3v34, types: [pt0.e0] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20, types: [com.tencent.mm.pluginsdk.model.app.a0] */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v35, types: [int] */
    /* JADX WARN: Type inference failed for: r5v37, types: [com.tencent.mm.sdk.event.IEvent, com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r6v111 */
    /* JADX WARN: Type inference failed for: r6v112 */
    /* JADX WARN: Type inference failed for: r6v113 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v53, types: [int] */
    /* JADX WARN: Type inference failed for: r6v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v75, types: [bm5.v] */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r6v96 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.modelbase.q0 c(com.tencent.mm.modelbase.p0 r51, java.lang.String r52, ot0.q r53) {
        /*
            Method dump skipped, instructions count: 3326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.a0.c(com.tencent.mm.modelbase.p0, java.lang.String, ot0.q):com.tencent.mm.modelbase.q0");
    }

    public boolean h(long j17, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18) {
        i(j17, f9Var, str, str2, str3, i17, z17, i18, "", false);
        return true;
    }

    public boolean i(long j17, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, java.lang.String str4, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "getThumbByCdn msgsvrid:%d aes:%s thumblen:%d url:%s talker:%s bigThumb:%b", java.lang.Long.valueOf(f9Var.I0()), str2, java.lang.Integer.valueOf(i17), str3, str, java.lang.Boolean.valueOf(z17));
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        java.lang.String str5 = "wcf://temp/appmsgext-cdnthumb-" + new java.util.Random().nextLong();
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_AppMessageExtension_1";
        mVar.field_mediaId = com.tencent.mm.modelcdntran.i2.b("downappthumb", f9Var.getCreateTime(), str, "" + j17);
        mVar.field_fullpath = str5;
        if (z18) {
            mVar.field_fileType = 19;
            mVar.f241811z = str3;
        } else {
            mVar.field_fileId = str3;
            mVar.field_fileType = 3;
        }
        mVar.field_totalLen = i17;
        mVar.field_aesKey = str2;
        mVar.field_priority = 3;
        mVar.field_authKey = str4;
        mVar.field_chattype = com.tencent.mm.storage.z3.R4(str) ? 1 : 0;
        mVar.f241787f = new com.tencent.mm.pluginsdk.model.app.b0(this, j17, str3, str5, str, i18, f9Var, z17, i17);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        return true;
    }

    public final void o(boolean z17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "updateC2CAAMsgMark, mark: %s, talker: %s", java.lang.Boolean.valueOf(z17), str);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
        if (p17 != null) {
            if (z17) {
                p17.c2(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            } else {
                p17.e2(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            }
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(p17, str);
        }
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
        int i17;
        java.lang.String U1;
        ot0.q v17;
        com.tencent.mm.storage.f9 f9Var = r0Var.f70757a;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMessageExtension", "[onPreDelMessage] msg == null");
            return;
        }
        f9Var.z0();
        com.tencent.mm.autogen.events.VoiceReminderDeleteRecordMessageEvent voiceReminderDeleteRecordMessageEvent = new com.tencent.mm.autogen.events.VoiceReminderDeleteRecordMessageEvent();
        voiceReminderDeleteRecordMessageEvent.f54938g.f7756a = f9Var.z0();
        voiceReminderDeleteRecordMessageEvent.e();
        if (f9Var.getType() == 436207665 || f9Var.getType() == 419430449) {
            com.tencent.mm.autogen.events.DelWalletAppMsgEvent delWalletAppMsgEvent = new com.tencent.mm.autogen.events.DelWalletAppMsgEvent();
            delWalletAppMsgEvent.f54082g.f8051a = f9Var.getMsgId();
            delWalletAppMsgEvent.e();
        }
        if (f9Var.getType() == 436207665) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_lucky_money_delete_database_config, true) && (U1 = f9Var.U1()) != null && (v17 = ot0.q.v(U1)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "checkPayMsgLogic content.c2cSceneId:%s", v17.f348700q1);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348700q1)) {
                    java.lang.String str = v17.f348700q1;
                    str.getClass();
                    char c17 = 65535;
                    switch (str.hashCode()) {
                        case 1507425:
                            if (str.equals("1002")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1507427:
                            if (str.equals("1004")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1507428:
                            if (str.equals("1005")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c17) {
                        case 0:
                        case 1:
                        case 2:
                            if (((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).Vi().z0(v17.f348704r1) != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "delete lucky money msg result：%s", java.lang.Integer.valueOf(((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).Vi().delete(dm.fc.f236952s.f352676a, "mNativeUrl=?", new java.lang.String[]{v17.f348704r1})));
                                break;
                            }
                            break;
                    }
                }
            }
        }
        ((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).aj(f9Var.getMsgId(), f9Var.Q0());
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        if (com.tencent.mm.vfs.w6.j(D2)) {
            com.tencent.mm.vfs.w6.h(D2);
        }
        if (f9Var.getMsgId() != 0) {
            bt3.g2.m(f9Var.Q0(), f9Var.getMsgId());
        }
        try {
            p75.n0 n0Var = dm.o0.f238842p;
            dm.n0 n0Var2 = new dm.n0();
            n0Var2.b(f9Var.getMsgId());
            i17 = n0Var2.a().f(gm0.j1.u().f273153f);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppMessageExtension", th6, "delete appMsg err", new java.lang.Object[0]);
            i17 = -2;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppMessageExtension", "onPreDelMessage, clean file, thumbPath:%s, attachFullPath:%s deleteAppMsgResult:%s deleteQuoteRet:%b", D2, null, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).wi(f9Var.Q0(), f9Var.getMsgId())));
    }
}
