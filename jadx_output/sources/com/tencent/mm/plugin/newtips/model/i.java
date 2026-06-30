package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes13.dex */
public abstract class i {
    public static void a(com.tencent.mm.plugin.newtips.model.a aVar) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsHelper", "clearCompatTag() iNewTipsView == null");
            return;
        }
        aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, false);
        aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NEW, false);
        aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, false);
        aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON, false);
        aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON, false);
        aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_COUNTER, false);
    }

    public static boolean b(com.tencent.mm.plugin.newtips.model.a aVar, com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
        int i17;
        byte b17 = 0;
        if (aVar == null || aVar.h() == null) {
            return false;
        }
        try {
            b17 = ((java.lang.Byte) aVar.h().getTag(com.tencent.mm.R.id.k_6)).byteValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "editOldNewTipsTag() getTag(R.id.new_tips_tag_show_type_old) [%s]", e17.toString());
        }
        aVar.getPath();
        java.lang.Long.toBinaryString(b17);
        switch (rVar.ordinal()) {
            case 1:
                if (!z17) {
                    i17 = b17 & 31;
                    break;
                } else {
                    i17 = b17 | 32;
                    break;
                }
            case 2:
                if (!z17) {
                    i17 = b17 & 47;
                    break;
                } else {
                    i17 = b17 | com.tencent.wxmm.v2encoder.enumCODEC_vcodec2;
                    break;
                }
            case 3:
                if (!z17) {
                    i17 = b17 & 55;
                    break;
                } else {
                    i17 = b17 | 8;
                    break;
                }
            case 4:
                if (!z17) {
                    i17 = b17 & 59;
                    break;
                } else {
                    i17 = b17 | 4;
                    break;
                }
            case 5:
                if (!z17) {
                    i17 = b17 & 61;
                    break;
                } else {
                    i17 = b17 | 2;
                    break;
                }
            case 6:
                if (!z17) {
                    i17 = b17 & 62;
                    break;
                } else {
                    i17 = b17 | 1;
                    break;
                }
        }
        b17 = (byte) i17;
        aVar.h().setTag(com.tencent.mm.R.id.k_6, java.lang.Byte.valueOf(b17));
        aVar.getPath();
        java.lang.Long.toBinaryString(b17);
        return true;
    }

    public static int c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "me")) {
            return 1;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "discovery")) {
            return 2;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "plus")) {
            return 3;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "plus_receiveorpay")) {
            return 4;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "pay_receiveorpay")) {
            return 5;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "topstories")) {
            return 6;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "topstories_wow")) {
            return 7;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "topstories_top")) {
            return 8;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, ya.a.SEARCH)) {
            return 9;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "dining_nearby")) {
            return 10;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "shopping")) {
            return 11;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "game")) {
            return 12;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "pay")) {
            return 13;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "card")) {
            return 14;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "textstate_history")) {
            return 37;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM)) {
            return 36;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "wallet")) {
            return 15;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "grouppayreddot")) {
            return 16;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "facingreceivereddot")) {
            return 17;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "facingreceiveremerchantapplydot")) {
            return 40;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "facingreceiveremerchantdot")) {
            return 41;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "f2fhongbaoreddot")) {
            return 18;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "rewardcodereddot")) {
            return 19;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "transfertoreddot")) {
            return 20;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "transtobankreddot")) {
            return 21;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "mobiletransferreddot")) {
            return 22;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "finder")) {
            return 24;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "chatroom")) {
            return 25;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "chatroommgr")) {
            return 26;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "useww")) {
            return 27;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "finder_tl_hot_tab")) {
            return 28;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "finder_tl_nearby_tab")) {
            return 29;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "screenShare")) {
            return 35;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "setting")) {
            return 30;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "about")) {
            return 38;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "versionIntro")) {
            return 39;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "privacyUpdate")) {
            return 42;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "general")) {
            return 31;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "wechattools")) {
            return 32;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "inputmethod")) {
            return 33;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "plugin")) {
            return 34;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "weapp")) {
            return 43;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "stickernavright")) {
            return 44;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "sticker")) {
            return 45;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "attach_voiceinput")) {
            return 46;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "attach_voiceinput_wxkeyboard")) {
            return 47;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "plugin_wxkeyboard")) {
            return 48;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "fulltext_input_wxkeyboard")) {
            return 49;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "emoti_search_wxkeyboard")) {
            return 50;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "account_safe")) {
            return 51;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "more_sec_setting")) {
            return 52;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "sec_bind_email")) {
            return 53;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "custom_emoji_wetype")) {
            return 54;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "attach_hongbao_panel")) {
            return 55;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "attach_hongbao_panel_bottom")) {
            return 56;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "attach_hongbao_send")) {
            return 57;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "other_function")) {
            return 58;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "attachment_plus")) {
            return 59;
        }
        return com.tencent.mm.sdk.platformtools.t8.D0(str, "facingreceiverofficialentrancedot") ? 60 : 0;
    }

    public static java.lang.String d(int i17) {
        if (i17 == 1) {
            return "me";
        }
        if (i17 == 2) {
            return "discovery";
        }
        if (i17 == 3) {
            return "plus";
        }
        if (i17 == 4) {
            return "plus_receiveorpay";
        }
        if (i17 == 5) {
            return "pay_receiveorpay";
        }
        if (i17 == 6) {
            return "topstories";
        }
        if (i17 == 7) {
            return "topstories_wow";
        }
        if (i17 == 8) {
            return "topstories_top";
        }
        if (i17 == 9) {
            return ya.a.SEARCH;
        }
        if (i17 == 10) {
            return "dining_nearby";
        }
        if (i17 == 11) {
            return "shopping";
        }
        if (i17 == 12) {
            return "game";
        }
        if (i17 == 13) {
            return "pay";
        }
        if (i17 == 14) {
            return "card";
        }
        if (i17 == 37) {
            return "textstate_history";
        }
        if (i17 == 36) {
            return com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM;
        }
        if (i17 == 15) {
            return "wallet";
        }
        if (i17 == 16) {
            return "grouppayreddot";
        }
        if (i17 == 17) {
            return "facingreceivereddot";
        }
        if (i17 == 40) {
            return "facingreceiveremerchantapplydot";
        }
        if (i17 == 41) {
            return "facingreceiveremerchantdot";
        }
        if (i17 == 18) {
            return "f2fhongbaoreddot";
        }
        if (i17 == 19) {
            return "rewardcodereddot";
        }
        if (i17 == 20) {
            return "transfertoreddot";
        }
        if (i17 == 21) {
            return "transtobankreddot";
        }
        if (i17 == 22) {
            return "mobiletransferreddot";
        }
        if (i17 == 24) {
            return "finder";
        }
        if (i17 == 25) {
            return "chatroom";
        }
        if (i17 == 26) {
            return "chatroommgr";
        }
        if (i17 == 27) {
            return "useww";
        }
        if (i17 == 28) {
            return "finder_tl_hot_tab";
        }
        if (i17 == 29) {
            return "finder_tl_nearby_tab";
        }
        if (i17 == 35) {
            return "screenShare";
        }
        if (i17 == 30) {
            return "setting";
        }
        if (i17 == 38) {
            return "about";
        }
        if (i17 == 39) {
            return "versionIntro";
        }
        if (i17 == 42) {
            return "privacyUpdate";
        }
        if (i17 == 31) {
            return "general";
        }
        if (i17 == 32) {
            return "wechattools";
        }
        if (i17 == 33) {
            return "inputmethod";
        }
        if (i17 == 34) {
            return "plugin";
        }
        if (i17 == 43) {
            return "weapp";
        }
        if (i17 == 44) {
            return "stickernavright";
        }
        if (i17 == 45) {
            return "sticker";
        }
        if (i17 == 46) {
            return "attach_voiceinput";
        }
        if (i17 == 47) {
            return "attach_voiceinput_wxkeyboard";
        }
        if (i17 == 48) {
            return "plugin_wxkeyboard";
        }
        if (i17 == 49) {
            return "fulltext_input_wxkeyboard";
        }
        if (i17 == 50) {
            return "emoti_search_wxkeyboard";
        }
        if (i17 == 51) {
            return "account_safe";
        }
        if (i17 == 52) {
            return "more_sec_setting";
        }
        if (i17 == 53) {
            return "sec_bind_email";
        }
        if (i17 == 54) {
            return "custom_emoji_wetype";
        }
        if (i17 == 55) {
            return "attach_hongbao_panel";
        }
        if (i17 == 56) {
            return "attach_hongbao_panel_bottom";
        }
        if (i17 == 57) {
            return "attach_hongbao_send";
        }
        if (i17 == 59) {
            return "attachment_plus";
        }
        if (i17 == 60) {
            return "facingreceiverofficialentrancedot";
        }
        return null;
    }

    public static com.tencent.mm.plugin.newtips.model.r e(com.tencent.mm.plugin.newtips.model.a aVar) {
        byte b17;
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NONE;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "getShowNewTipsShowType() curNewTip is null");
            return rVar;
        }
        if (aVar.h() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "getShowNewTipsShowType() path:%s root is null", aVar.getPath());
            return rVar;
        }
        try {
            b17 = ((java.lang.Byte) aVar.h().getTag(com.tencent.mm.R.id.k_4)).byteValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsHelper", "getShowNewTipsShowType() getTag(R.id.new_tips_tag_show_type_new) [%s]", e17.toString());
            b17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "getShowNewTipsShowType() path:%s state:%s", aVar.getPath(), java.lang.Long.toBinaryString(b17));
        return b17 != 1 ? b17 != 2 ? b17 != 4 ? b17 != 8 ? b17 != 16 ? b17 != 32 ? rVar : com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT : com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NEW : com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE : com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON : com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON : com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_COUNTER;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static android.util.Pair f(com.tencent.mm.plugin.newtips.model.a aVar, android.util.Pair pair, boolean z17) {
        boolean z18;
        byte b17;
        int i17;
        switch ((com.tencent.mm.plugin.newtips.model.r) pair.first) {
            case MMNEWTIPS_SHOWTYPE_NONE:
                g(aVar);
                z18 = false;
                b17 = 0;
                break;
            case MMNEWTIPS_SHOWTYPE_REDPOINT:
                z18 = aVar.y(z17);
                if (z18 && z17) {
                    i17 = 32;
                    b17 = (byte) i17;
                    break;
                }
                b17 = 0;
                break;
            case MMNEWTIPS_SHOWTYPE_NEW:
                z18 = aVar.Y3(z17);
                if (z17) {
                    i17 = 16;
                    b17 = (byte) i17;
                    break;
                }
                b17 = 0;
                break;
            case MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE:
                z18 = aVar.T1(z17, (r45.pm6) pair.second);
                if (z17) {
                    i17 = 8;
                    b17 = (byte) i17;
                    break;
                }
                b17 = 0;
                break;
            case MMNEWTIPS_SHOWTYPE_REDPOINT_ICON:
                z18 = aVar.q3(z17, (r45.pm6) pair.second);
                if (z17) {
                    i17 = 4;
                    b17 = (byte) i17;
                    break;
                }
                b17 = 0;
                break;
            case MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON:
                z18 = aVar.u6(z17, (r45.pm6) pair.second);
                if (z17) {
                    i17 = 2;
                    b17 = (byte) i17;
                    break;
                }
                b17 = 0;
                break;
            case MMNEWTIPS_SHOWTYPE_COUNTER:
                z18 = aVar.Z3(z17, (r45.pm6) pair.second);
                if (z17) {
                    i17 = 1;
                    b17 = (byte) i17;
                    break;
                }
                b17 = 0;
                break;
            default:
                z18 = false;
                b17 = 0;
                break;
        }
        aVar.c1(z17, (com.tencent.mm.plugin.newtips.model.r) pair.first);
        if (z17) {
            aVar.h().setTag(com.tencent.mm.R.id.k_4, java.lang.Byte.valueOf(b17));
            aVar.h().setTag(com.tencent.mm.R.id.k_5, pair.second);
        } else {
            aVar.h().setTag(com.tencent.mm.R.id.k_4, 0);
            aVar.h().setTag(com.tencent.mm.R.id.k_5, null);
        }
        return new android.util.Pair(java.lang.Byte.valueOf(b17), java.lang.Boolean.valueOf(z18));
    }

    public static void g(com.tencent.mm.plugin.newtips.model.a aVar) {
        com.tencent.mm.plugin.newtips.model.r e17 = e(aVar);
        if (e17 != com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NONE) {
            android.util.Pair pair = new android.util.Pair(e17, new r45.pm6());
            if (aVar != null) {
                android.util.Pair f17 = f(aVar, pair, false);
                java.lang.Object[] objArr = new java.lang.Object[6];
                objArr[0] = aVar.getPath();
                java.lang.Object obj = pair.first;
                if (obj == null) {
                    obj = "null";
                }
                objArr[1] = obj;
                objArr[2] = m((r45.pm6) pair.second);
                objArr[3] = java.lang.Boolean.FALSE;
                objArr[4] = f17.first;
                objArr[5] = f17.second;
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "showNewTips() path:%s pair:(%s, %s) show:%s state:%s result:%s", objArr);
            }
        }
    }

    public static boolean h(com.tencent.mm.plugin.newtips.model.a aVar) {
        byte b17;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "isShowCompateNewTips() curNewTip is null");
            return true;
        }
        if (aVar.h() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "isShowCompateNewTips() path:%s root is null", aVar.getPath());
            return true;
        }
        try {
            b17 = ((java.lang.Byte) aVar.h().getTag(com.tencent.mm.R.id.k_6)).byteValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsHelper", "isShowCompateNewTips() path:%s getTag(R.id.new_tips_tag_show_type_old) [%s]", aVar.getPath(), e17.toString());
            b17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "isShowCompateNewTips() path:%s state:%s", aVar.getPath(), java.lang.Long.toBinaryString(b17));
        return b17 != 0;
    }

    public static boolean i(int i17) {
        rn3.i.Di().getClass();
        com.tencent.mm.plugin.newtips.model.a aVar = null;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "getNewTipsView() path == 0");
        } else {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) com.tencent.mm.plugin.newtips.model.p.f152383f.get(java.lang.Integer.valueOf(i17));
            if (weakReference == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "getNewTipsView() weakReference(%s) is null", java.lang.Integer.valueOf(i17));
            } else {
                com.tencent.mm.plugin.newtips.model.a aVar2 = (com.tencent.mm.plugin.newtips.model.a) weakReference.get();
                if (aVar2 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "getNewTipsView() curNewTip(%s) is null", java.lang.Integer.valueOf(i17));
                } else {
                    aVar = aVar2;
                }
            }
        }
        return j(aVar);
    }

    public static boolean j(com.tencent.mm.plugin.newtips.model.a aVar) {
        byte b17;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "isShowNewTips() curNewTip is null");
            return false;
        }
        if (aVar.h() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "isShowNewTips() path:%s root is null", aVar.getPath());
            return false;
        }
        try {
            b17 = ((java.lang.Byte) aVar.h().getTag(com.tencent.mm.R.id.k_4)).byteValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsHelper", "isShowNewTips() getTag(R.id.new_tips_tag_show_type_new) [%s]", e17.toString());
            b17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "isShowNewTips() path:%s state:%s", aVar.getPath(), java.lang.Long.toBinaryString(b17));
        return b17 != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001e. Please report as an issue. */
    public static boolean k(vn3.c cVar, com.tencent.mm.plugin.newtips.model.r rVar) {
        boolean z17 = false;
        if (cVar == null) {
            return false;
        }
        if (cVar.f438433c || rVar == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NONE) {
            return true;
        }
        com.tencent.mm.plugin.newtips.model.r rVar2 = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON;
        com.tencent.mm.plugin.newtips.model.r rVar3 = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON;
        com.tencent.mm.plugin.newtips.model.r rVar4 = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE;
        com.tencent.mm.plugin.newtips.model.r rVar5 = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_COUNTER;
        com.tencent.mm.plugin.newtips.model.r rVar6 = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NEW;
        com.tencent.mm.plugin.newtips.model.r rVar7 = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
        switch (cVar.f438432b) {
            case 1:
            case 31:
            case 32:
            case 33:
            case 38:
            case 39:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 2:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 3:
            case 25:
            case 26:
            case 27:
            case 35:
            case 36:
            case 37:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                if (rVar == rVar7 || rVar == rVar3 || rVar == rVar4) {
                    return true;
                }
                return z17;
            case 4:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 5:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 6:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar2 || rVar == rVar3 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 7:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 8:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 9:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar2 || rVar == rVar3 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 10:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar2 || rVar == rVar3 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 11:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar2 || rVar == rVar3 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 12:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar2 || rVar == rVar3 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 13:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar2 || rVar == rVar3 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 14:
            case 30:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar2 || rVar == rVar3 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 15:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 40:
            case 41:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4) {
                    return true;
                }
                return z17;
            case 23:
            case 28:
            case 29:
            default:
                return z17;
            case 24:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar2 || rVar == rVar3 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 34:
                if (rVar == rVar7 || rVar == rVar6 || rVar == rVar4 || rVar == rVar5) {
                    return true;
                }
                return z17;
            case 42:
                if (rVar == rVar4) {
                    z17 = true;
                }
                if (rVar != rVar7 || rVar == rVar6 || rVar == rVar4) {
                    return true;
                }
                return z17;
            case 44:
            case 45:
                return rVar != rVar7 ? true : true;
            case 46:
            case 47:
            case 48:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 58:
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                if (rVar == rVar7) {
                    return true;
                }
                return z17;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                if (rVar == rVar7 || rVar == rVar4) {
                    return true;
                }
                return z17;
            case 60:
                if (rVar == rVar4) {
                    return true;
                }
                return z17;
        }
    }

    public static boolean l(boolean z17, com.tencent.mm.plugin.newtips.model.a aVar) {
        if (!j(aVar)) {
            return false;
        }
        if (!z17) {
            return true;
        }
        g(aVar);
        return false;
    }

    public static java.lang.String m(r45.pm6 pm6Var) {
        if (pm6Var == null) {
            return "null";
        }
        return "TipsInfo{num=" + pm6Var.f383186d + ", title='" + pm6Var.f383187e + "', url='" + pm6Var.f383188f + "'}";
    }
}
