package ya2;

/* loaded from: classes10.dex */
public abstract class d {
    public static final r45.xk a(com.tencent.mm.protocal.protobuf.FinderContact finderContact, boolean z17) {
        java.util.LinkedList<r45.zv0> bind_info;
        java.lang.Object obj;
        r45.fw0 fw0Var;
        java.util.LinkedList list;
        java.util.LinkedList<r45.zv0> bind_info2;
        java.lang.Object obj2;
        r45.fw0 fw0Var2;
        java.util.LinkedList list2;
        kotlin.jvm.internal.o.g(finderContact, "<this>");
        if (!z17) {
            if ((finderContact.getOne_time_flag() & 2) > 0 || (finderContact.getOne_time_flag() & 4) <= 0 || (bind_info = finderContact.getBind_info()) == null) {
                return null;
            }
            java.util.Iterator<T> it = bind_info.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.zv0) obj).getInteger(0) == 1) {
                    break;
                }
            }
            r45.zv0 zv0Var = (r45.zv0) obj;
            if (zv0Var == null || (fw0Var = (r45.fw0) zv0Var.getCustom(1)) == null || (list = fw0Var.getList(0)) == null) {
                return null;
            }
            return (r45.xk) kz5.n0.Z(list);
        }
        if (!(finderContact.getUser_mode() == 2 || finderContact.getUser_mode() == 1)) {
            finderContact = null;
        }
        if (finderContact == null || (bind_info2 = finderContact.getBind_info()) == null) {
            return null;
        }
        java.util.Iterator<T> it6 = bind_info2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (((r45.zv0) obj2).getInteger(0) == 1) {
                break;
            }
        }
        r45.zv0 zv0Var2 = (r45.zv0) obj2;
        if (zv0Var2 == null || (fw0Var2 = (r45.fw0) zv0Var2.getCustom(1)) == null || (list2 = fw0Var2.getList(0)) == null) {
            return null;
        }
        return (r45.xk) kz5.n0.Z(list2);
    }

    public static final r45.xk b(ya2.b2 b2Var, boolean z17) {
        r45.aw0 aw0Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.fw0 fw0Var;
        java.util.LinkedList list2;
        r45.aw0 aw0Var2;
        java.util.LinkedList list3;
        java.lang.Object obj2;
        r45.fw0 fw0Var2;
        java.util.LinkedList list4;
        kotlin.jvm.internal.o.g(b2Var, "<this>");
        if (!z17) {
            int i17 = b2Var.K2;
            if ((i17 & 2) > 0 || (i17 & 4) <= 0 || (aw0Var = b2Var.field_bindInfoList) == null || (list = aw0Var.getList(0)) == null) {
                return null;
            }
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.zv0) obj).getInteger(0) == 1) {
                    break;
                }
            }
            r45.zv0 zv0Var = (r45.zv0) obj;
            if (zv0Var == null || (fw0Var = (r45.fw0) zv0Var.getCustom(1)) == null || (list2 = fw0Var.getList(0)) == null) {
                return null;
            }
            return (r45.xk) kz5.n0.Z(list2);
        }
        int i18 = b2Var.field_user_mode;
        if (!(i18 == 2 || i18 == 1)) {
            b2Var = null;
        }
        if (b2Var == null || (aw0Var2 = b2Var.field_bindInfoList) == null || (list3 = aw0Var2.getList(0)) == null) {
            return null;
        }
        java.util.Iterator it6 = list3.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (((r45.zv0) obj2).getInteger(0) == 1) {
                break;
            }
        }
        r45.zv0 zv0Var2 = (r45.zv0) obj2;
        if (zv0Var2 == null || (fw0Var2 = (r45.fw0) zv0Var2.getCustom(1)) == null || (list4 = fw0Var2.getList(0)) == null) {
            return null;
        }
        return (r45.xk) kz5.n0.Z(list4);
    }

    public static /* synthetic */ r45.xk c(ya2.b2 b2Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        return b(b2Var, z17);
    }

    public static final ya2.b2 d(ya2.b2 b2Var) {
        kotlin.jvm.internal.o.g(b2Var, "<this>");
        ya2.b2 b17 = ya2.h.f460484a.b(b2Var.D0());
        b2Var.field_retryCount = b17 != null ? b17.field_retryCount : 0;
        return b2Var;
    }

    public static final com.tencent.mm.protocal.protobuf.FinderAuthInfo e(r45.xk xkVar) {
        r45.kj kjVar;
        if (xkVar == null || (kjVar = (r45.kj) xkVar.getCustom(5)) == null) {
            return null;
        }
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
        finderAuthInfo.setAuthIconType(kjVar.getInteger(0));
        finderAuthInfo.setAuthIconUrl(kjVar.getString(1));
        return finderAuthInfo;
    }

    public static final boolean f(ya2.b2 b2Var) {
        return (b2Var == null || (b2Var.field_user_flag & 1) == 0) ? false : true;
    }

    public static final ya2.b2 g(com.tencent.mm.protocal.protobuf.FinderContact finderContact, ya2.b2 b2Var, boolean z17) {
        java.lang.String headUrl;
        java.lang.String nickname;
        kotlin.jvm.internal.o.g(finderContact, "<this>");
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(finderContact.getUsername()))) {
            finderContact = null;
        }
        if (finderContact == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderContactEx", "error FinderContact username is null " + new com.tencent.mm.sdk.platformtools.z3());
            return new ya2.b2();
        }
        if (b2Var == null) {
            b2Var = new ya2.b2();
        }
        java.lang.String username = finderContact.getUsername();
        if (username == null) {
            username = "";
        }
        b2Var.field_username = username;
        r45.xk a17 = z17 ? null : a(finderContact, false);
        if (a17 == null || (headUrl = a17.getString(2)) == null) {
            headUrl = finderContact.getHeadUrl();
        }
        if (headUrl == null) {
            headUrl = "";
        }
        b2Var.field_avatarUrl = headUrl;
        if (a17 == null || (nickname = a17.getString(1)) == null) {
            nickname = finderContact.getNickname();
        }
        if (nickname == null) {
            nickname = "";
        }
        b2Var.field_nickname = nickname;
        java.lang.String headUrl2 = finderContact.getHeadUrl();
        if (headUrl2 == null) {
            headUrl2 = "";
        }
        b2Var.field_rawAvatarUrl = headUrl2;
        java.lang.String nickname2 = finderContact.getNickname();
        if (nickname2 == null) {
            nickname2 = "";
        }
        b2Var.field_rawNickname = nickname2;
        b2Var.field_version = finderContact.getSeq();
        java.lang.String signature = finderContact.getSignature();
        if (signature == null) {
            signature = "";
        }
        b2Var.field_signature = signature;
        b2Var.field_follow_Flag = finderContact.getFollowFlag();
        b2Var.field_followTime = finderContact.getFollowTime();
        java.lang.String coverImgUrl = finderContact.getCoverImgUrl();
        if (coverImgUrl == null) {
            coverImgUrl = "";
        }
        b2Var.field_coverImg = coverImgUrl;
        b2Var.field_spamStatus = finderContact.getSpamStatus();
        b2Var.field_authInfo = finderContact.getAuthInfo();
        b2Var.field_extInfo = finderContact.getExtInfo();
        b2Var.field_originalFlag = finderContact.getOriginalFlag();
        b2Var.field_originalEntranceFlag = finderContact.getOriginalEntranceFlag();
        b2Var.field_originalInfo = finderContact.getOriginalInfo();
        b2Var.field_extFlag = finderContact.getExtFlag();
        b2Var.field_liveCoverImg = finderContact.getLiveCoverImgUrl();
        b2Var.field_liveStatus = finderContact.getLiveStatus();
        r45.kz0 live_info = finderContact.getLive_info();
        b2Var.field_liveAnchorStatusFlag = live_info != null ? live_info.getLong(0) : 0L;
        b2Var.field_friendFollowCount = finderContact.getFriend_follow_count();
        b2Var.field_liveSwitchFlag = finderContact.getLive_info() != null ? r8.getInteger(1) : 0;
        java.lang.String wx_username_v5 = finderContact.getWx_username_v5();
        b2Var.field_v5username = wx_username_v5 != null ? wx_username_v5 : "";
        b2Var.field_feedCount = finderContact.getFeedCount();
        b2Var.field_user_mode = finderContact.getUser_mode();
        r45.aw0 aw0Var = new r45.aw0();
        aw0Var.set(0, finderContact.getBind_info());
        b2Var.field_bindInfoList = aw0Var;
        b2Var.field_guestInfo = finderContact.getGuest_info();
        b2Var.field_coverUrl = finderContact.getCoverUrl();
        b2Var.field_coverEntranceFlag = finderContact.getCoverEntranceFlag();
        r45.sc1 sc1Var = new r45.sc1();
        sc1Var.set(0, finderContact.getMenu());
        b2Var.field_jumpInfoList = sc1Var;
        b2Var.K2 = finderContact.getOne_time_flag();
        b2Var.L2 = finderContact.getWxuser_finder_identity_info();
        b2Var.field_messageStatus = finderContact.getStatus();
        b2Var.field_additionalFlag = finderContact.getAdditionalFlag();
        b2Var.field_liveRoomImg = finderContact.getLive_room_img();
        b2Var.field_user_flag = finderContact.getUser_flag();
        b2Var.field_privacyInfo = finderContact.getPrivacy_info();
        r45.et2 et2Var = new r45.et2();
        et2Var.set(0, finderContact.getReference_info());
        b2Var.field_reference_info = et2Var;
        return b2Var;
    }

    public static /* synthetic */ ya2.b2 h(com.tencent.mm.protocal.protobuf.FinderContact finderContact, ya2.b2 b2Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            b2Var = null;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return g(finderContact, b2Var, z17);
    }

    public static final com.tencent.mm.protocal.protobuf.FinderContact i(ya2.b2 b2Var) {
        kotlin.jvm.internal.o.g(b2Var, "<this>");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        finderContact.setUsername(b2Var.D0());
        finderContact.setHeadUrl(b2Var.y0());
        finderContact.setNickname(b2Var.z0());
        finderContact.setSeq(b2Var.field_version);
        finderContact.setSignature(b2Var.field_signature);
        finderContact.setFollowFlag(b2Var.field_follow_Flag);
        finderContact.setFollowTime(b2Var.field_followTime);
        finderContact.setCoverImgUrl(b2Var.field_coverImg);
        finderContact.setAuthInfo(b2Var.field_authInfo);
        finderContact.setCoverImgUrl(b2Var.field_coverImg);
        finderContact.setSpamStatus(b2Var.field_spamStatus);
        finderContact.setExtInfo(b2Var.field_extInfo);
        finderContact.setOriginalFlag(b2Var.field_originalFlag);
        finderContact.setOriginalEntranceFlag(b2Var.field_originalEntranceFlag);
        finderContact.setOriginalInfo(b2Var.field_originalInfo);
        finderContact.setExtFlag(b2Var.field_extFlag);
        finderContact.setLiveCoverImgUrl(b2Var.field_liveCoverImg);
        finderContact.setLiveStatus(b2Var.field_liveStatus);
        r45.kz0 kz0Var = new r45.kz0();
        kz0Var.set(0, java.lang.Long.valueOf(b2Var.field_liveAnchorStatusFlag));
        kz0Var.set(1, java.lang.Integer.valueOf((int) b2Var.field_liveSwitchFlag));
        finderContact.setLive_info(kz0Var);
        finderContact.setFriend_follow_count(b2Var.field_friendFollowCount);
        java.lang.String str = b2Var.field_v5username;
        if (str == null) {
            str = "";
        }
        finderContact.setWx_username_v5(str);
        finderContact.setUser_mode(b2Var.field_user_mode);
        r45.aw0 aw0Var = b2Var.field_bindInfoList;
        finderContact.setBind_info(aw0Var != null ? aw0Var.getList(0) : null);
        finderContact.setGuest_info(b2Var.field_guestInfo);
        finderContact.setCoverUrl(b2Var.field_coverUrl);
        finderContact.setCoverEntranceFlag(b2Var.field_coverEntranceFlag);
        r45.sc1 sc1Var = b2Var.field_jumpInfoList;
        finderContact.setMenu(sc1Var != null ? sc1Var.getList(0) : null);
        finderContact.setStatus(b2Var.field_messageStatus);
        finderContact.setAdditionalFlag(b2Var.field_additionalFlag);
        finderContact.setUser_flag(b2Var.field_user_flag);
        finderContact.setPrivacy_info(b2Var.field_privacyInfo);
        r45.et2 et2Var = b2Var.field_reference_info;
        finderContact.setReference_info(et2Var != null ? et2Var.getList(0) : null);
        return finderContact;
    }

    public static final boolean j(java.lang.String chatbotUsername) {
        kotlin.jvm.internal.o.g(chatbotUsername, "chatbotUsername");
        if (!kotlin.jvm.internal.o.b("wxid_wi_1d142z0zdj03", chatbotUsername)) {
            return true;
        }
        java.lang.String s17 = c01.e2.s();
        if (!r26.i0.p("CN", s17, true) && !r26.i0.p("HK", s17, true)) {
            return true;
        }
        java.util.List Ai = ((vh0.f2) ((vh0.d1) i95.n0.c(vh0.d1.class))).Ai(chatbotUsername);
        boolean z17 = false;
        if (!Ai.isEmpty()) {
            java.util.Iterator it = Ai.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo) it.next()).f67864i) {
                    z17 = true;
                    break;
                }
            }
        }
        return !z17;
    }
}
