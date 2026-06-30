package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.n2 f115640a = new com.tencent.mm.plugin.finder.live.util.n2();

    public static com.tencent.rtmp.TXLivePlayConfig b(com.tencent.mm.plugin.finder.live.util.n2 n2Var, java.lang.String source, boolean z17, r45.nw1 nw1Var, r45.ka4 ka4Var, int i17, int i18, int i19, java.lang.Object obj) {
        r45.ma4 ma4Var;
        com.tencent.mm.protobuf.g gVar;
        boolean z18 = false;
        if ((i19 & 2) != 0) {
            z17 = false;
        }
        if ((i19 & 4) != 0) {
            nw1Var = null;
        }
        if ((i19 & 8) != 0) {
            ka4Var = null;
        }
        if ((i19 & 16) != 0) {
            ae2.in inVar = ae2.in.f3688a;
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_visitor_max_retry_count, 100);
        }
        if ((i19 & 32) != 0) {
            ae2.in inVar2 = ae2.in.f3688a;
            i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_visitor_retry_interval, 3);
        }
        n2Var.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig = new com.tencent.rtmp.TXLivePlayConfig();
        tXLivePlayConfig.setConnectRetryCount(i17);
        tXLivePlayConfig.setConnectRetryInterval(i18);
        ae2.in inVar3 = ae2.in.f3688a;
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_sei_enable_switch, 1) == 1;
        tXLivePlayConfig.setEnableMessage(z19);
        boolean z27 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3920x5).getValue()).r()).intValue() == 1;
        if (z17) {
            if (z27) {
                tXLivePlayConfig.setAutoAdjustCacheTime(true);
                tXLivePlayConfig.setMinAutoAdjustCacheTime(1.0f);
                tXLivePlayConfig.setMaxAutoAdjustCacheTime(5.0f);
                if (ka4Var == null) {
                    if (nw1Var != null && (ma4Var = (r45.ma4) nw1Var.getCustom(23)) != null && (gVar = ma4Var.f380300m) != null) {
                        r45.na4 na4Var = new r45.na4();
                        try {
                            na4Var.parseFrom(gVar.g());
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                            na4Var = null;
                        }
                        if (na4Var != null) {
                            ka4Var = na4Var.f381197f;
                        }
                    }
                    ka4Var = null;
                }
                if (ka4Var != null) {
                    if (ka4Var.f378553x > 0 && ka4Var.f378552w > 0) {
                        z18 = true;
                    }
                    if ((z18 ? ka4Var : null) != null) {
                        tXLivePlayConfig.setMinAutoAdjustCacheTime(r1.f378552w / 1000.0f);
                        tXLivePlayConfig.setMaxAutoAdjustCacheTime(r1.f378553x / 1000.0f);
                    }
                }
            } else {
                tXLivePlayConfig.setMinAutoAdjustCacheTime(1.0f);
                tXLivePlayConfig.setMaxAutoAdjustCacheTime(1.0f);
            }
        }
        com.tencent.mars.xlog.Log.i("LiveUtil", "getLivePlayConfig: source=" + source + ", connectRetryCount=" + i17 + ", connectRetryInterval=" + i18 + ", isEnableMessage=" + z19 + ", miniCache=" + z17 + ", minAutoAdjustCacheTime=" + tXLivePlayConfig.getMinAutoAdjustCacheTime() + ", maxAutoAdjustCacheTime=" + tXLivePlayConfig.getMaxAutoAdjustCacheTime() + ", newLogicEnable=" + z27);
        return tXLivePlayConfig;
    }

    public final java.util.LinkedList a() {
        java.lang.Object obj;
        r45.pf1 pf1Var;
        java.util.LinkedList list;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            try {
                obj = null;
                java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ALIAS_LIST1_STRING_SYNC, null);
                pf1Var = new r45.pf1();
                if (str != null) {
                    byte[] bytes = str.getBytes(r26.c.f368867c);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    pf1Var.parseFrom(bytes);
                }
                list = pf1Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getAlias_info(...)");
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            try {
                m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
                if (I1 != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (((r45.of1) next).getInteger(2) == 3) {
                            obj = next;
                            break;
                        }
                    }
                    r45.of1 of1Var = (r45.of1) obj;
                    if (of1Var != null) {
                        of1Var.set(0, I1.field_nickname);
                        of1Var.set(1, I1.field_avatarUrl);
                    }
                }
                com.tencent.mars.xlog.Log.i("LiveUtil", "getAliasInfoList result:" + pm0.b0.g(pf1Var));
                return list;
            } catch (java.lang.Exception e18) {
                e = e18;
                linkedList = list;
                hc2.c.a(e, "getAliasInfoList:" + e.getMessage());
                return linkedList;
            } catch (java.lang.Throwable unused) {
                return list;
            }
        } catch (java.lang.Throwable unused2) {
            return linkedList;
        }
    }

    public final boolean c(long j17) {
        boolean z17 = pm0.v.z((int) j17, 2);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        com.tencent.mars.xlog.Log.i("LiveUtil", "giftFuncEnableBySwitchFlag isTeenMode:" + isTeenMode + " pagEnable:true enableGiftBySwitchFlag:" + z17 + " switchFlag:" + j17);
        return z17 && !isTeenMode;
    }

    public final void d(r45.a73 a73Var, java.lang.String TAG) {
        kotlin.jvm.internal.o.g(a73Var, "<this>");
        kotlin.jvm.internal.o.g(TAG, "TAG");
        java.util.LinkedList<r45.z63> list = a73Var.getList(0);
        if (list != null) {
            for (r45.z63 z63Var : list) {
                if (z63Var != null) {
                    com.tencent.mars.xlog.Log.i(TAG, "GameRankSwitch appid:" + z63Var.getString(0) + ", name:" + z63Var.getString(1) + ", enable:" + z63Var.getInteger(2));
                }
            }
        }
    }

    public final void e(java.lang.String tag, int i17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mars.xlog.Log.i(tag, "check AnchorStatus1, tag:" + tag + ", status:" + i17 + ", BAN_COMMENT:" + pm0.v.z(i17, 8) + ", SHOPPING:" + pm0.v.z(i17, 16) + ", GIFT:" + pm0.v.z(i17, 128) + ", BAN_LIKE:" + pm0.v.z(i17, 512) + ", LINK_MIC:" + pm0.v.z(i17, 64) + ", SING_SONG:" + pm0.v.z(i17, 32768) + ", ");
        com.tencent.mars.xlog.Log.i(tag, "check AnchorStatus2, tag:" + tag + ", status:" + i17 + ", ENTER_BACKGROUND:" + pm0.v.z(i17, 1) + ", CALL_INTERRUPTION:" + pm0.v.z(i17, 2) + ", RECORD_SCREEN_ON:" + pm0.v.z(i17, 4) + ", BREAK_LIVE_RULE:" + pm0.v.z(i17, 32) + ", AUDIO_MODE:" + pm0.v.z(i17, 256) + ", SCREEN_SHARE:" + pm0.v.z(i17, 1024) + ", HIDE_AUDIENCE_NICKNAME:" + pm0.v.z(i17, 8192) + ", DISABLE_SHOW_BIZ:" + pm0.v.z(i17, 4096) + ", ENABLE_ANCHOR_DATA_PANEL:" + pm0.v.z(i17, 8388608) + ", ");
    }
}
