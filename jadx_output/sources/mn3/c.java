package mn3;

/* loaded from: classes8.dex */
public final class c implements com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f330176a = jz5.h.b(mn3.b.f330175d);

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public java.lang.String debugInfo(com.tencent.wechat.aff.newlife.NewLifeSyncRequest newLifeSyncRequest) {
        java.lang.String str;
        if (newLifeSyncRequest != null) {
            r45.ov4 ov4Var = new r45.ov4();
            ov4Var.parseFrom(newLifeSyncRequest.toByteArray());
            str = ov4Var.toJSON().toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public java.lang.String debugSwitchInfo(com.tencent.wechat.aff.newlife.EntranceReportSwitch entranceReportSwitch) {
        java.lang.String str;
        if (entranceReportSwitch != null) {
            r45.hl0 hl0Var = new r45.hl0();
            hl0Var.parseFrom(entranceReportSwitch.toByteArray());
            str = hl0Var.toJSON().toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).wi() != false) goto L13;
     */
    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean enableSync(int r6, int r7) {
        /*
            r5 = this;
            r0 = 4
            java.lang.String r1 = ", syncScene: "
            java.lang.String r2 = "MicroMsg.NewLife.AffSyncCppToNativeManagerImpl"
            r3 = 1
            r4 = 0
            if (r6 == r0) goto L32
            r0 = 9
            if (r6 == r0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "check enableSync, unsupported businessType: "
            r0.<init>(r3)
            r0.append(r6)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.e(r2, r0)
        L24:
            r3 = r4
            goto L52
        L26:
            java.lang.Class<tg0.w1> r0 = tg0.w1.class
            i95.m r0 = i95.n0.c(r0)
            tg0.w1 r0 = (tg0.w1) r0
            r0.getClass()
            goto L52
        L32:
            java.lang.Class<ra0.v> r0 = ra0.v.class
            i95.m r0 = i95.n0.c(r0)
            ra0.v r0 = (ra0.v) r0
            en3.v r0 = (en3.v) r0
            boolean r0 = r0.wi()
            if (r0 == 0) goto L24
            java.lang.Class<mf0.e0> r0 = mf0.e0.class
            i95.m r0 = i95.n0.c(r0)
            mf0.e0 r0 = (mf0.e0) r0
            lf0.w r0 = (lf0.w) r0
            boolean r0 = r0.wi()
            if (r0 == 0) goto L24
        L52:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "check enableSync, businessType: "
            r0.<init>(r4)
            r0.append(r6)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r6 = ", canSync: "
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mn3.c.enableSync(int, int):boolean");
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public java.util.ArrayList getConfigSyncKeyPathList(int i17) {
        if (i17 == 4) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            return new java.util.ArrayList(r26.n0.f0((java.lang.CharSequence) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F3).getValue()).r(), new java.lang.String[]{";"}, false, 0, 6, null));
        }
        if (i17 == 9) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            return new java.util.ArrayList(r26.n0.f0((java.lang.CharSequence) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G3).getValue()).r(), new java.lang.String[]{";"}, false, 0, 6, null));
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NewLife.AffSyncCppToNativeManagerImpl", "getConfigSyncKeyPathList, unsupported businessType: " + i17);
        return new java.util.ArrayList();
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo getLiteAppVersionInfo() {
        boolean z17;
        java.util.ArrayList d17 = kz5.c0.d("wxalite2fd372f050eecd471a4392786dfae78c", "wxalite71e155e932f19de48da8333a8f225708", "wxalite15eb964a6d8b6f8943f9a2881c5ebdfa");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.util.LinkedList<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo> linkedList = new java.util.LinkedList<>();
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
            com.tencent.liteapp.storage.WxaLiteAppInfo Bj = iVar.Bj(str);
            if (Bj == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.AffSyncCppToNativeManagerImpl", "For %s, info is null", str);
            } else {
                java.lang.String Ej = iVar.Ej(Bj.path, str, Bj.signatureKey);
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.AffSyncCppToNativeManagerImpl", "For %s, version is %s", str, Ej);
                com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo liteAppVersionInfo = new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo();
                liteAppVersionInfo.setAppid(str);
                liteAppVersionInfo.setVersion(Ej);
                linkedList.add(liteAppVersionInfo);
            }
        }
        fr4.g0 g0Var2 = (fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class));
        g0Var2.getClass();
        java.util.LinkedList<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo> linkedList2 = new java.util.LinkedList<>();
        kr4.m Bi = g0Var2.Bi();
        java.util.concurrent.ConcurrentHashMap.KeySetView newKeySet = java.util.concurrent.ConcurrentHashMap.newKeySet();
        android.database.Cursor B = Bi.f311517d.B("select * , rowid from W1wConversation", null);
        while (B.moveToNext()) {
            try {
                kr4.g gVar = new kr4.g();
                gVar.convertFrom(B);
                newKeySet.add(gVar.field_selfUserName);
            } finally {
            }
        }
        vz5.b.a(B, null);
        kotlin.jvm.internal.o.d(newKeySet);
        java.util.List<java.lang.String> S0 = kz5.n0.S0(newKeySet);
        if (S0.size() > 100) {
            S0 = S0.subList(0, 100);
        }
        for (java.lang.String str2 : S0) {
            com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo zhugePersonalMsgInfo = new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo();
            zhugePersonalMsgInfo.setUsername(str2);
            zhugePersonalMsgInfo.setUnreadCount(g0Var2.Bi().z0(0, str2));
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = g0Var2.f265827n;
            java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap.get(str2);
            if (bool == null || !bool.booleanValue()) {
                z17 = false;
            } else {
                concurrentHashMap.put(str2, java.lang.Boolean.FALSE);
                z17 = true;
            }
            zhugePersonalMsgInfo.setHasEvent(z17);
            linkedList2.add(zhugePersonalMsgInfo);
        }
        com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo searchSyncClientCustomInfo = new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo();
        searchSyncClientCustomInfo.setLiteappVersionList(linkedList);
        searchSyncClientCustomInfo.setZhugePersonalMsgInfoList(linkedList2);
        return searchSyncClientCustomInfo;
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult getNewLifeRequestSyncResult() {
        com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult newBuilder = com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult.newBuilder();
        newBuilder.isPrefetchFreqLimit = true;
        newBuilder.lastPrefetchTime = 0L;
        com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult build = newBuilder.build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        return build;
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig getWebSearchRequestSyncConfig() {
        r45.vs2 vs2Var;
        byte[] initialProtobufBytes;
        sg0.u3 u3Var = (sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class));
        u3Var.getClass();
        ug0.q.T6(u3Var);
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) kz5.n0.Z(nk6.w0("Search.Entrance", xy2.c.e(context), true, true));
        com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig newBuilder = com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig.newBuilder();
        newBuilder.hasEntranceReddot = jbVar != null;
        if (jbVar != null && (vs2Var = jbVar.field_ctrInfo) != null && (initialProtobufBytes = vs2Var.initialProtobufBytes()) != null) {
            newBuilder.addElementWaitWebSearchCtrlInfoList(new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo().parseFrom(initialProtobufBytes));
        }
        com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig build = newBuilder.build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        return build;
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public void handleCmd(int i17, com.tencent.wechat.aff.newlife.FinderCmdItem finderCmdItem, int i18, boolean z17) {
        boolean z18;
        java.util.LinkedList<r45.f03> linkedList;
        int i19;
        r45.f03 f03Var;
        java.util.LinkedList<r45.f03> linkedList2;
        java.util.LinkedList linkedList3;
        java.util.HashMap hashMap;
        if (finderCmdItem != null) {
            int i27 = 0;
            if (i17 == 4) {
                ln3.h hVar = new ln3.h();
                int i28 = finderCmdItem.cmdId;
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "cmdId=" + i28 + "  scene=" + i18);
                switch (i28) {
                    case 10001:
                        z18 = true;
                        r45.zu4 zu4Var = new r45.zu4();
                        com.tencent.mm.protobuf.g gVar = finderCmdItem.cmdBuf;
                        zu4Var.parseFrom(gVar != null ? gVar.g() : null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "getMentionCount username: " + zu4Var.getString(4) + " interactionTabTotalCount:" + zu4Var.getInteger(6) + " commentTabTotalCount:" + zu4Var.getInteger(7));
                        if (zu4Var.getInteger(7) <= 0 && zu4Var.getInteger(6) <= 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "[processGetMentionCount] server error.");
                            break;
                        }
                        break;
                    case 10002:
                        r45.ts2 ts2Var = new r45.ts2();
                        com.tencent.mm.protobuf.g gVar2 = finderCmdItem.cmdBuf;
                        ts2Var.parseFrom(gVar2 != null ? gVar2.g() : null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "redDotEvent get red dot, showRed:" + ts2Var.getInteger(0));
                        r45.vs2 vs2Var = (r45.vs2) ts2Var.getCustom(1);
                        if (vs2Var != null && (linkedList = vs2Var.f388489g) != null) {
                            for (r45.f03 f03Var2 : linkedList) {
                                if (kotlin.jvm.internal.o.b(f03Var2.f373892i, "NewLife.Entrance")) {
                                    com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
                                    if (L0 != null) {
                                        f03Var = L0.I0("NewLife.Entrance");
                                        i19 = 1;
                                    } else {
                                        i19 = 1;
                                        f03Var = null;
                                    }
                                    ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Zi(L0, f03Var, hVar.a((r45.vs2) ts2Var.getCustom(i19), f03Var2), false, 2);
                                }
                            }
                        }
                        z18 = true;
                        ((c61.l7) i95.n0.c(c61.l7.class)).nk().D0(ts2Var);
                        break;
                    case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        r45.dz2 dz2Var = new r45.dz2();
                        com.tencent.mm.protobuf.g gVar3 = finderCmdItem.cmdBuf;
                        if (gVar3 != null) {
                            dz2Var.parseFrom(gVar3.g());
                            java.util.LinkedList list = dz2Var.getList(0);
                            if (list != null) {
                                java.util.Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    r45.gz2 gz2Var = (r45.gz2) it.next();
                                    r45.vs2 vs2Var2 = (r45.vs2) gz2Var.getCustom(i27);
                                    if (vs2Var2 != null && (linkedList2 = vs2Var2.f388489g) != null) {
                                        for (r45.f03 f03Var3 : linkedList2) {
                                            java.util.Iterator it6 = it;
                                            if (kotlin.jvm.internal.o.b(f03Var3.f373892i, "NewLife.Entrance")) {
                                                java.lang.String a17 = hVar.a((r45.vs2) gz2Var.getCustom(0), f03Var3);
                                                com.tencent.mm.plugin.finder.extension.reddot.jb L02 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
                                                ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Zi(L02, L02 != null ? L02.I0("NewLife.Entrance") : null, a17, false, 3);
                                            }
                                            it = it6;
                                            i27 = 0;
                                        }
                                    }
                                }
                            }
                            ((com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) i95.n0.c(c61.l7.class)).nk()).e1(dz2Var, "processTabRedDot");
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "NewLifeTabTips is null");
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "process tab red dot scene:" + i18 + "  cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        z18 = true;
                        break;
                    case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID /* 10004 */:
                        try {
                            r45.vt2 vt2Var = new r45.vt2();
                            com.tencent.mm.protobuf.g gVar4 = finderCmdItem.cmdBuf;
                            vt2Var.parseFrom(gVar4 != null ? gVar4.g() : null);
                            ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).fj(vt2Var);
                            ((c61.l7) i95.n0.c(c61.l7.class)).nk().o(vt2Var);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.NewLife.NewLifeSyncHandler", "", e17);
                        }
                        z18 = true;
                        break;
                    default:
                        z18 = true;
                        if (z17) {
                            r45.hx0 hx0Var = new r45.hx0();
                            hx0Var.parseFrom(finderCmdItem.toByteArray());
                            ((ic2.p0) ((jz5.n) hVar.f319900a).getValue()).j7(hx0Var, 0, i18);
                            break;
                        }
                        break;
                }
            } else {
                if (i17 != 9) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NewLife.AffSyncCppToNativeManagerImpl", "handleCmd, unsupported businessType: " + i17);
                } else {
                    sg0.u3 u3Var = (sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class));
                    u3Var.getClass();
                    ug0.q T6 = ug0.q.T6(u3Var);
                    int i29 = finderCmdItem.cmdId;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleSyncCmdItem, cmdId: " + i29 + ", scene: " + i18);
                    if (!ug0.q.f427472n) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleSyncCmdItem, CommonSyncRedDot not enabled, ignored.");
                    }
                    tg0.u1 u1Var = T6.f427475h;
                    if (i29 == 30000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleTabRedDotCmdItem, cmdId: " + finderCmdItem.cmdId + ", scene: " + i18);
                        if (finderCmdItem.cmdBuf == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleTabRedDotCmdItem, finderCmdItem.cmdBuf is null.");
                        } else {
                            r45.dz2 dz2Var2 = new r45.dz2();
                            com.tencent.mm.protobuf.g gVar5 = finderCmdItem.cmdBuf;
                            dz2Var2.parseFrom(gVar5 != null ? gVar5.g() : null);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleTabRedDotCmdItem, tabTips: " + dz2Var2);
                            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
                            java.util.LinkedList list2 = dz2Var2.getList(0);
                            if (list2 != null) {
                                java.util.Iterator it7 = list2.iterator();
                                while (it7.hasNext()) {
                                    r45.vs2 vs2Var3 = (r45.vs2) ((r45.gz2) it7.next()).getCustom(0);
                                    if (vs2Var3 != null && (linkedList3 = vs2Var3.f388489g) != null) {
                                        java.util.Iterator it8 = linkedList3.iterator();
                                        while (it8.hasNext()) {
                                            if ("Search.Entrance".equals(((r45.f03) it8.next()).f373892i)) {
                                                com.tencent.mm.plugin.finder.extension.reddot.jb L03 = nk6.L0("Search.Entrance");
                                                r45.f03 I0 = L03 != null ? L03.I0("Search.Entrance") : null;
                                                wg0.a aVar = (wg0.a) u1Var;
                                                aVar.getClass();
                                                if (L03 == null || I0 == null) {
                                                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearchRedDotReporter", "reportCovered, invalid params, ctrInfo: " + L03 + ", showInfo: " + I0);
                                                } else {
                                                    java.lang.String str = I0.f373892i;
                                                    r45.f03 I02 = str != null ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(str) : null;
                                                    if (I02 != null) {
                                                        hashMap = new java.util.HashMap();
                                                        hashMap.put("base64_cover_reddot_info", I02.toJSON().toString());
                                                    } else {
                                                        hashMap = null;
                                                    }
                                                    aVar.a("red_dot_covered", L03, I0, hashMap);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ((com.tencent.mm.plugin.finder.extension.reddot.x2) nk6).e1(dz2Var2, "processTabRedDot");
                        }
                    } else if (i29 != 30001) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebSearchCommonSyncRedDotFSC", "onHandleSyncCmdItem, unsupported cmdId: " + i29);
                        z18 = false;
                    } else {
                        try {
                            r45.vt2 vt2Var2 = new r45.vt2();
                            com.tencent.mm.protobuf.g gVar6 = finderCmdItem.cmdBuf;
                            if (gVar6 != null) {
                                vt2Var2.parseFrom(gVar6.g());
                            }
                            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().o(vt2Var2);
                            ((wg0.a) u1Var).c(vt2Var2);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.WebSearchCommonSyncRedDotFSC", "", e18);
                        }
                    }
                }
                z18 = true;
            }
            if (z17 && !z18) {
                r45.hx0 hx0Var2 = new r45.hx0();
                hx0Var2.parseFrom(finderCmdItem.toByteArray());
                ((ic2.p0) ((jz5.n) this.f330176a).getValue()).j7(hx0Var2, 0, i18);
            }
        }
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public boolean isShowLookOneLookEntry() {
        return ((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).wi();
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public boolean isShowWebSearchEntry() {
        ((tg0.w1) i95.n0.c(tg0.w1.class)).getClass();
        return true;
    }

    @Override // com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase
    public java.lang.String mergeSyncKey(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        byte[] bArr2;
        com.tencent.mm.protobuf.g h17;
        java.lang.String str3 = null;
        if (str != null) {
            bArr = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        if (str2 != null) {
            bArr2 = str2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr2, "getBytes(...)");
        } else {
            bArr2 = null;
        }
        byte[] c17 = o45.qi.c(bArr, bArr2);
        if (c17 != null && (h17 = pm0.b0.h(c17)) != null) {
            str3 = h17.i();
        }
        return str3 == null ? "" : str3;
    }
}
