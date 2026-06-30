package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderRedDotCtrlInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo();
    public int business_type;
    public int expire_time;
    public com.tencent.mm.protobuf.g extInfo;
    public long feedId;
    public int finder_sub_recall_type;
    public java.lang.String group_id;
    public int ignore_display_tab_type;
    public boolean ignore_valid;
    public java.lang.String internal_feedback_url;
    public int live_sub_recall_type;
    public long localFlag;
    public int localIsFinderIdentity;
    public com.tencent.mm.protobuf.g report_ctrl_info;
    public java.lang.String report_ext_info;
    public int save_Strategy;
    public java.lang.String self_finder_username;
    public com.tencent.mm.protobuf.g session_bypass_info;
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTipsShowInfo> show_infos;
    public int start_time;
    public java.lang.String tips_id;
    public java.lang.String tips_uuid;
    public int priority = 0;
    public int type = 0;

    public FinderRedDotCtrlInfo() {
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.protobuf.g.f192155b;
        this.extInfo = gVar;
        this.show_infos = new java.util.LinkedList<>();
        this.tips_id = "";
        this.expire_time = 0;
        this.start_time = 0;
        this.ignore_display_tab_type = 0;
        this.ignore_valid = false;
        this.internal_feedback_url = "";
        this.self_finder_username = "";
        this.finder_sub_recall_type = 0;
        this.live_sub_recall_type = 0;
        this.report_ext_info = "";
        this.group_id = "";
        this.report_ctrl_info = gVar;
        this.session_bypass_info = gVar;
        this.tips_uuid = "";
        this.save_Strategy = 0;
        this.business_type = 0;
        this.feedId = 0L;
        this.localFlag = 0L;
        this.localIsFinderIdentity = 0;
    }

    public static com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo addAllElementShowInfos(java.util.Collection<com.tencent.wechat.aff.newlife.FinderTipsShowInfo> collection) {
        this.show_infos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo addAllElementShow_infos(java.util.Collection<com.tencent.wechat.aff.newlife.FinderTipsShowInfo> collection) {
        this.show_infos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo addElementShowInfos(com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo) {
        this.show_infos.add(finderTipsShowInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo addElementShow_infos(com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo) {
        this.show_infos.add(finderTipsShowInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo = (com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.priority), java.lang.Integer.valueOf(finderRedDotCtrlInfo.priority)) && n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(finderRedDotCtrlInfo.type)) && n51.f.a(this.extInfo, finderRedDotCtrlInfo.extInfo) && n51.f.a(this.show_infos, finderRedDotCtrlInfo.show_infos) && n51.f.a(this.tips_id, finderRedDotCtrlInfo.tips_id) && n51.f.a(java.lang.Integer.valueOf(this.expire_time), java.lang.Integer.valueOf(finderRedDotCtrlInfo.expire_time)) && n51.f.a(java.lang.Integer.valueOf(this.start_time), java.lang.Integer.valueOf(finderRedDotCtrlInfo.start_time)) && n51.f.a(java.lang.Integer.valueOf(this.ignore_display_tab_type), java.lang.Integer.valueOf(finderRedDotCtrlInfo.ignore_display_tab_type)) && n51.f.a(java.lang.Boolean.valueOf(this.ignore_valid), java.lang.Boolean.valueOf(finderRedDotCtrlInfo.ignore_valid)) && n51.f.a(this.internal_feedback_url, finderRedDotCtrlInfo.internal_feedback_url) && n51.f.a(this.self_finder_username, finderRedDotCtrlInfo.self_finder_username) && n51.f.a(java.lang.Integer.valueOf(this.finder_sub_recall_type), java.lang.Integer.valueOf(finderRedDotCtrlInfo.finder_sub_recall_type)) && n51.f.a(java.lang.Integer.valueOf(this.live_sub_recall_type), java.lang.Integer.valueOf(finderRedDotCtrlInfo.live_sub_recall_type)) && n51.f.a(this.report_ext_info, finderRedDotCtrlInfo.report_ext_info) && n51.f.a(this.group_id, finderRedDotCtrlInfo.group_id) && n51.f.a(this.report_ctrl_info, finderRedDotCtrlInfo.report_ctrl_info) && n51.f.a(this.session_bypass_info, finderRedDotCtrlInfo.session_bypass_info) && n51.f.a(this.tips_uuid, finderRedDotCtrlInfo.tips_uuid) && n51.f.a(java.lang.Integer.valueOf(this.save_Strategy), java.lang.Integer.valueOf(finderRedDotCtrlInfo.save_Strategy)) && n51.f.a(java.lang.Integer.valueOf(this.business_type), java.lang.Integer.valueOf(finderRedDotCtrlInfo.business_type)) && n51.f.a(java.lang.Long.valueOf(this.feedId), java.lang.Long.valueOf(finderRedDotCtrlInfo.feedId)) && n51.f.a(java.lang.Long.valueOf(this.localFlag), java.lang.Long.valueOf(finderRedDotCtrlInfo.localFlag)) && n51.f.a(java.lang.Integer.valueOf(this.localIsFinderIdentity), java.lang.Integer.valueOf(finderRedDotCtrlInfo.localIsFinderIdentity));
    }

    public int getBusinessType() {
        return this.business_type;
    }

    public int getBusiness_type() {
        return this.business_type;
    }

    public int getExpireTime() {
        return this.expire_time;
    }

    public int getExpire_time() {
        return this.expire_time;
    }

    public com.tencent.mm.protobuf.g getExtInfo() {
        return this.extInfo;
    }

    public long getFeedId() {
        return this.feedId;
    }

    public int getFinderSubRecallType() {
        return this.finder_sub_recall_type;
    }

    public int getFinder_sub_recall_type() {
        return this.finder_sub_recall_type;
    }

    public java.lang.String getGroupId() {
        return this.group_id;
    }

    public java.lang.String getGroup_id() {
        return this.group_id;
    }

    public int getIgnoreDisplayTabType() {
        return this.ignore_display_tab_type;
    }

    public boolean getIgnoreValid() {
        return this.ignore_valid;
    }

    public int getIgnore_display_tab_type() {
        return this.ignore_display_tab_type;
    }

    public boolean getIgnore_valid() {
        return this.ignore_valid;
    }

    public java.lang.String getInternalFeedbackUrl() {
        return this.internal_feedback_url;
    }

    public java.lang.String getInternal_feedback_url() {
        return this.internal_feedback_url;
    }

    public int getLiveSubRecallType() {
        return this.live_sub_recall_type;
    }

    public int getLive_sub_recall_type() {
        return this.live_sub_recall_type;
    }

    public long getLocalFlag() {
        return this.localFlag;
    }

    public int getLocalIsFinderIdentity() {
        return this.localIsFinderIdentity;
    }

    public int getPriority() {
        return this.priority;
    }

    public com.tencent.mm.protobuf.g getReportCtrlInfo() {
        return this.report_ctrl_info;
    }

    public java.lang.String getReportExtInfo() {
        return this.report_ext_info;
    }

    public com.tencent.mm.protobuf.g getReport_ctrl_info() {
        return this.report_ctrl_info;
    }

    public java.lang.String getReport_ext_info() {
        return this.report_ext_info;
    }

    public int getSaveStrategy() {
        return this.save_Strategy;
    }

    public int getSave_Strategy() {
        return this.save_Strategy;
    }

    public java.lang.String getSelfFinderUsername() {
        return this.self_finder_username;
    }

    public java.lang.String getSelf_finder_username() {
        return this.self_finder_username;
    }

    public com.tencent.mm.protobuf.g getSessionBypassInfo() {
        return this.session_bypass_info;
    }

    public com.tencent.mm.protobuf.g getSession_bypass_info() {
        return this.session_bypass_info;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTipsShowInfo> getShowInfos() {
        return this.show_infos;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTipsShowInfo> getShow_infos() {
        return this.show_infos;
    }

    public int getStartTime() {
        return this.start_time;
    }

    public int getStart_time() {
        return this.start_time;
    }

    public java.lang.String getTipsId() {
        return this.tips_id;
    }

    public java.lang.String getTipsUuid() {
        return this.tips_uuid;
    }

    public java.lang.String getTips_id() {
        return this.tips_id;
    }

    public java.lang.String getTips_uuid() {
        return this.tips_uuid;
    }

    public int getType() {
        return this.type;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.priority);
            fVar.e(2, this.type);
            com.tencent.mm.protobuf.g gVar = this.extInfo;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, this.show_infos);
            java.lang.String str = this.tips_id;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.expire_time);
            fVar.e(7, this.start_time);
            fVar.e(8, this.ignore_display_tab_type);
            fVar.a(9, this.ignore_valid);
            java.lang.String str2 = this.internal_feedback_url;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.self_finder_username;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            fVar.e(12, this.finder_sub_recall_type);
            fVar.e(13, this.live_sub_recall_type);
            java.lang.String str4 = this.report_ext_info;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.group_id;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.report_ctrl_info;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.session_bypass_info;
            if (gVar3 != null) {
                fVar.b(18, gVar3);
            }
            java.lang.String str6 = this.tips_uuid;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            fVar.e(20, this.save_Strategy);
            fVar.e(21, this.business_type);
            fVar.h(100, this.feedId);
            fVar.h(101, this.localFlag);
            fVar.e(102, this.localIsFinderIdentity);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.priority) + 0 + b36.f.e(2, this.type);
            com.tencent.mm.protobuf.g gVar4 = this.extInfo;
            if (gVar4 != null) {
                e17 += b36.f.b(3, gVar4);
            }
            int g17 = e17 + b36.f.g(4, 8, this.show_infos);
            java.lang.String str7 = this.tips_id;
            if (str7 != null) {
                g17 += b36.f.j(5, str7);
            }
            int e18 = g17 + b36.f.e(6, this.expire_time) + b36.f.e(7, this.start_time) + b36.f.e(8, this.ignore_display_tab_type) + b36.f.a(9, this.ignore_valid);
            java.lang.String str8 = this.internal_feedback_url;
            if (str8 != null) {
                e18 += b36.f.j(10, str8);
            }
            java.lang.String str9 = this.self_finder_username;
            if (str9 != null) {
                e18 += b36.f.j(11, str9);
            }
            int e19 = e18 + b36.f.e(12, this.finder_sub_recall_type) + b36.f.e(13, this.live_sub_recall_type);
            java.lang.String str10 = this.report_ext_info;
            if (str10 != null) {
                e19 += b36.f.j(14, str10);
            }
            java.lang.String str11 = this.group_id;
            if (str11 != null) {
                e19 += b36.f.j(15, str11);
            }
            com.tencent.mm.protobuf.g gVar5 = this.report_ctrl_info;
            if (gVar5 != null) {
                e19 += b36.f.b(16, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.session_bypass_info;
            if (gVar6 != null) {
                e19 += b36.f.b(18, gVar6);
            }
            java.lang.String str12 = this.tips_uuid;
            if (str12 != null) {
                e19 += b36.f.j(19, str12);
            }
            return e19 + b36.f.e(20, this.save_Strategy) + b36.f.e(21, this.business_type) + b36.f.h(100, this.feedId) + b36.f.h(101, this.localFlag) + b36.f.e(102, this.localIsFinderIdentity);
        }
        if (i17 == 2) {
            this.show_infos.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.priority = aVar2.g(intValue);
                return 0;
            case 2:
                this.type = aVar2.g(intValue);
                return 0;
            case 3:
                this.extInfo = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo = new com.tencent.wechat.aff.newlife.FinderTipsShowInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderTipsShowInfo.parseFrom(bArr);
                    }
                    this.show_infos.add(finderTipsShowInfo);
                }
                return 0;
            case 5:
                this.tips_id = aVar2.k(intValue);
                return 0;
            case 6:
                this.expire_time = aVar2.g(intValue);
                return 0;
            case 7:
                this.start_time = aVar2.g(intValue);
                return 0;
            case 8:
                this.ignore_display_tab_type = aVar2.g(intValue);
                return 0;
            case 9:
                this.ignore_valid = aVar2.c(intValue);
                return 0;
            case 10:
                this.internal_feedback_url = aVar2.k(intValue);
                return 0;
            case 11:
                this.self_finder_username = aVar2.k(intValue);
                return 0;
            case 12:
                this.finder_sub_recall_type = aVar2.g(intValue);
                return 0;
            case 13:
                this.live_sub_recall_type = aVar2.g(intValue);
                return 0;
            case 14:
                this.report_ext_info = aVar2.k(intValue);
                return 0;
            case 15:
                this.group_id = aVar2.k(intValue);
                return 0;
            case 16:
                this.report_ctrl_info = aVar2.d(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 18:
                        this.session_bypass_info = aVar2.d(intValue);
                        return 0;
                    case 19:
                        this.tips_uuid = aVar2.k(intValue);
                        return 0;
                    case 20:
                        this.save_Strategy = aVar2.g(intValue);
                        return 0;
                    case 21:
                        this.business_type = aVar2.g(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 100:
                                this.feedId = aVar2.i(intValue);
                                return 0;
                            case 101:
                                this.localFlag = aVar2.i(intValue);
                                return 0;
                            case 102:
                                this.localIsFinderIdentity = aVar2.g(intValue);
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setBusinessType(int i17) {
        this.business_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setBusiness_type(int i17) {
        this.business_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setExpireTime(int i17) {
        this.expire_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setExpire_time(int i17) {
        this.expire_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setExtInfo(com.tencent.mm.protobuf.g gVar) {
        this.extInfo = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setFeedId(long j17) {
        this.feedId = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setFinderSubRecallType(int i17) {
        this.finder_sub_recall_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setFinder_sub_recall_type(int i17) {
        this.finder_sub_recall_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setGroupId(java.lang.String str) {
        this.group_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setGroup_id(java.lang.String str) {
        this.group_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setIgnoreDisplayTabType(int i17) {
        this.ignore_display_tab_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setIgnoreValid(boolean z17) {
        this.ignore_valid = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setIgnore_display_tab_type(int i17) {
        this.ignore_display_tab_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setIgnore_valid(boolean z17) {
        this.ignore_valid = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setInternalFeedbackUrl(java.lang.String str) {
        this.internal_feedback_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setInternal_feedback_url(java.lang.String str) {
        this.internal_feedback_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setLiveSubRecallType(int i17) {
        this.live_sub_recall_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setLive_sub_recall_type(int i17) {
        this.live_sub_recall_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setLocalFlag(long j17) {
        this.localFlag = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setLocalIsFinderIdentity(int i17) {
        this.localIsFinderIdentity = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setPriority(int i17) {
        this.priority = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setReportCtrlInfo(com.tencent.mm.protobuf.g gVar) {
        this.report_ctrl_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setReportExtInfo(java.lang.String str) {
        this.report_ext_info = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setReport_ctrl_info(com.tencent.mm.protobuf.g gVar) {
        this.report_ctrl_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setReport_ext_info(java.lang.String str) {
        this.report_ext_info = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setSaveStrategy(int i17) {
        this.save_Strategy = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setSave_Strategy(int i17) {
        this.save_Strategy = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setSelfFinderUsername(java.lang.String str) {
        this.self_finder_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setSelf_finder_username(java.lang.String str) {
        this.self_finder_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setSessionBypassInfo(com.tencent.mm.protobuf.g gVar) {
        this.session_bypass_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setSession_bypass_info(com.tencent.mm.protobuf.g gVar) {
        this.session_bypass_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setShowInfos(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTipsShowInfo> linkedList) {
        this.show_infos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setShow_infos(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTipsShowInfo> linkedList) {
        this.show_infos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setStartTime(int i17) {
        this.start_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setStart_time(int i17) {
        this.start_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setTipsId(java.lang.String str) {
        this.tips_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setTipsUuid(java.lang.String str) {
        this.tips_uuid = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setTips_id(java.lang.String str) {
        this.tips_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setTips_uuid(java.lang.String str) {
        this.tips_uuid = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo setType(int i17) {
        this.type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo) super.parseFrom(bArr);
    }
}
