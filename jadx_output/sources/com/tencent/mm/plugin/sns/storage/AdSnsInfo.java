package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class AdSnsInfo extends dm.n {
    public static final java.lang.String COL_ID = "rowid";
    public static final java.lang.String TABLEINDEXHEAD = "serverAdSnsTimeHeadIndex";
    public static final java.lang.String TABLEINDEXLOCALFLAG = "AdsnsLocalflagIndex";
    public static final java.lang.String TABLEINDEXMULTI1 = "adsnsMultiIndex1";
    public static final java.lang.String TABLEINDEXMULTI2 = "adsnsMultiIndex2";
    public static final java.lang.String TABLEINDEXSOURCE = "serverAdSnsTimeSourceTypeIndex";
    public static final java.lang.String TABLEINDEXTIME = "serverAdSnsTimeIndex";
    public static final java.lang.String TABLEINDEXUSERNAME = "serverAdSnsNameIndex";
    public static final java.lang.String TAG = "MicroMsg.AdSnsInfo";
    public java.lang.String contentByteMd5 = null;
    protected int localid;
    protected static l75.e0 info = dm.n.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.AdSnsInfo.class);
    protected static java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.storage.ADXml> cacheAdXml = new java.util.concurrent.ConcurrentHashMap();
    protected static java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.storage.ADInfo> cacheAdInfo = new java.util.concurrent.ConcurrentHashMap();

    public static com.tencent.mm.plugin.sns.storage.ADXml getADXmlCache(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !cacheAdXml.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.ADXml aDXml = cacheAdXml.get(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDXml;
    }

    public void addSourceFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_sourceType = i17 | this.field_sourceType;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    @Override // dm.n, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        super.convertFrom(cursor);
        this.localid = (int) this.systemRowid;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertToSnsInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        snsInfo.setTimeLine(getTimeLine());
        snsInfo.setLocalid(this.localid);
        snsInfo.setUserName(this.field_userName);
        snsInfo.setCreateTime(this.field_createTime);
        snsInfo.setLikeFlag(this.field_likeFlag);
        snsInfo.setSnsId(this.field_snsId);
        snsInfo.field_sourceType = this.field_sourceType;
        snsInfo.field_content = this.field_content;
        snsInfo.addSourceFlag(2);
        snsInfo.addSourceFlag(32);
        snsInfo.field_attrBuf = this.field_attrBuf;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        timeLine.UserName = this.field_userName;
        snsInfo.setPravited(timeLine.Privated);
        snsInfo.setExtFlag();
        snsInfo.setTimeLine(timeLine);
        r45.a90 a90Var = timeLine.ContentObj;
        if (a90Var != null) {
            snsInfo.setTypeFlag(a90Var.f369837e);
            snsInfo.setSubTypeFlag(timeLine.ContentObj.f369841i);
        }
        snsInfo.setAdSnsInfo(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertToSnsInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return snsInfo;
    }

    public com.tencent.mm.plugin.sns.storage.ADInfo getAdInfo() {
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String str = this.field_adinfo;
        if (str == null) {
            aDInfo = null;
        } else {
            if (cacheAdInfo.containsKey(str)) {
                com.tencent.mm.plugin.sns.storage.ADInfo aDInfo2 = cacheAdInfo.get(this.field_adinfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return aDInfo2;
            }
            aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(this.field_adinfo);
            cacheAdInfo.put(this.field_adinfo, aDInfo);
        }
        if (aDInfo == null) {
            aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDInfo;
    }

    public com.tencent.mm.plugin.sns.storage.ADXml getAdXml() {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String str = this.field_adxml;
        if (str == null) {
            aDXml = null;
        } else {
            if (cacheAdXml.containsKey(str)) {
                com.tencent.mm.plugin.sns.storage.ADXml aDXml2 = cacheAdXml.get(this.field_adxml);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return aDXml2;
            }
            aDXml = new com.tencent.mm.plugin.sns.storage.ADXml(this.field_adxml);
            m44.a.f(aDXml, ca4.z0.t0(this.field_snsId));
            cacheAdXml.put(this.field_adxml, aDXml);
        }
        if (aDXml == null) {
            aDXml = new com.tencent.mm.plugin.sns.storage.ADXml(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDXml;
    }

    public com.tencent.mm.plugin.sns.storage.ADInfo getAtAdInfo() {
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String str = this.field_atAdinfo;
        if (str == null) {
            aDInfo = null;
        } else {
            if (cacheAdInfo.containsKey(str)) {
                com.tencent.mm.plugin.sns.storage.ADInfo aDInfo2 = cacheAdInfo.get(this.field_atAdinfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return aDInfo2;
            }
            aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(this.field_atAdinfo);
            cacheAdInfo.put(this.field_atAdinfo, aDInfo);
        }
        if (aDInfo == null) {
            aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDInfo;
    }

    public com.tencent.mm.protobuf.g getAtFriendRemindInfoSelfInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (getRemindInfoGroup() == null || getRemindInfoGroup().f381862e == null || getRemindInfoGroup().f381862e.f380715f == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.tencent.mm.protobuf.g gVar = getRemindInfoGroup().f381862e.f380715f.f371841f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return gVar;
    }

    public com.tencent.mm.protobuf.g getAtFriendRemindInfoSourceInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (getRemindInfoGroup() == null || getRemindInfoGroup().f381862e == null || getRemindInfoGroup().f381862e.f380714e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.tencent.mm.protobuf.g gVar = getRemindInfoGroup().f381862e.f380714e.f371841f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return gVar;
    }

    @Override // dm.n, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        l75.e0 e0Var = info;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return e0Var;
    }

    public int getExpId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.tencent.mm.plugin.sns.storage.ADXml recXml = getRecXml();
        int i17 = recXml == null ? 0 : recXml.recExpId;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i17;
    }

    public java.lang.String getLocalid() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String i17 = com.tencent.mm.plugin.sns.storage.w2.i("ad_table_", this.localid);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i17;
    }

    public int getRecSrc() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecSrc", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.tencent.mm.plugin.sns.storage.ADXml recXml = getRecXml();
        int i17 = recXml == null ? 0 : recXml.recSrc;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecSrc", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i17;
    }

    public com.tencent.mm.plugin.sns.storage.ADXml getRecXml() {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String str = this.field_recxml;
        if (str == null) {
            aDXml = null;
        } else {
            if (cacheAdXml.containsKey(str)) {
                com.tencent.mm.plugin.sns.storage.ADXml aDXml2 = cacheAdXml.get(this.field_recxml);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return aDXml2;
            }
            aDXml = new com.tencent.mm.plugin.sns.storage.ADXml(this.field_recxml);
            m44.a.f(aDXml, ca4.z0.t0(this.field_snsId));
            cacheAdXml.put(this.field_recxml, aDXml);
        }
        if (aDXml == null) {
            aDXml = new com.tencent.mm.plugin.sns.storage.ADXml(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDXml;
    }

    public r45.o3 getRemindInfoGroup() {
        r45.o3 o3Var;
        java.lang.Exception e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        r45.o3 o3Var2 = null;
        try {
        } catch (java.lang.Exception e18) {
            o3Var = null;
            e17 = e18;
        }
        if (this.field_remindInfoGroup != null) {
            o3Var = new r45.o3();
            try {
                o3Var.parseFrom(this.field_remindInfoGroup);
            } catch (java.lang.Exception e19) {
                e17 = e19;
                com.tencent.mars.xlog.Log.e(TAG, "parse remindInfo error! " + e17.getMessage());
                o3Var2 = o3Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return o3Var2;
            }
            o3Var2 = o3Var;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return o3Var2;
    }

    public java.lang.String getSnsId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String j17 = com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", this.field_snsId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return j17;
    }

    public int getSource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.tencent.mm.plugin.sns.storage.ADXml recXml = getRecXml();
        int i17 = recXml == null ? 0 : recXml.recSrc;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i17;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject getTimeLine() {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String t07 = ca4.z0.t0(this.field_snsId);
        if (this.field_content == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_METADATA, 124);
            ca4.q.c("error timeLineObject, field==null, snsId=" + t07, new java.lang.RuntimeException("field_content==null"));
            com.tencent.mm.protocal.protobuf.TimeLineObject i17 = m21.y.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return i17;
        }
        if (this.contentByteMd5 == null) {
            this.contentByteMd5 = kk.k.g(this.field_content) + kk.k.g(this.field_attrBuf);
        }
        if (com.tencent.mm.plugin.sns.storage.SnsInfo.cacheTimeLine.containsKey(this.contentByteMd5) && (timeLineObject = com.tencent.mm.plugin.sns.storage.SnsInfo.cacheTimeLine.get(this.contentByteMd5)) != null && timeLineObject.ContentObj != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return timeLineObject;
        }
        try {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = (com.tencent.mm.protocal.protobuf.TimeLineObject) new com.tencent.mm.protocal.protobuf.TimeLineObject().parseFrom(this.field_content);
            if (timeLineObject2 == null) {
                com.tencent.mars.xlog.Log.e(TAG, "error timeLineObj is null! snsid = " + getSnsId());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_METADATA, 124);
                ca4.q.c("error timeLineObject, timeLineObj==null, snsId=" + t07, new java.lang.RuntimeException("timeLineObj==null"));
                com.tencent.mm.protocal.protobuf.TimeLineObject i18 = m21.y.i();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return i18;
            }
            if (timeLineObject2.ContentObj != null) {
                com.tencent.mm.plugin.sns.storage.SnsInfo.cacheTimeLine.put(this.contentByteMd5, timeLineObject2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return timeLineObject2;
            }
            com.tencent.mars.xlog.Log.e(TAG, "error timeLineObj.ContentObj is null!  snsid = " + getSnsId());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_METADATA, 124);
            ca4.q.c("error timeLineObject, ContentObj==null, snsId=" + t07, new java.lang.RuntimeException("ContentObj==null"));
            com.tencent.mm.protocal.protobuf.TimeLineObject i19 = m21.y.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return i19;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "error get snsinfo timeline! parse exp=" + e17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_METADATA, 124);
            ca4.q.c("error timeLineObject, parse exp, snsId=" + t07, e17);
            com.tencent.mm.protocal.protobuf.TimeLineObject i27 = m21.y.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return i27;
        }
    }

    public com.tencent.mm.protobuf.g getTimelineRemindInfoSelfInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (getRemindInfoGroup() == null || getRemindInfoGroup().f381861d == null || getRemindInfoGroup().f381861d.f380715f == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.tencent.mm.protobuf.g gVar = getRemindInfoGroup().f381861d.f380715f.f371841f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return gVar;
    }

    public com.tencent.mm.protobuf.g getTimelineRemindInfoSourceInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (getRemindInfoGroup() == null || getRemindInfoGroup().f381861d == null || getRemindInfoGroup().f381861d.f380714e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.tencent.mm.protobuf.g gVar = getRemindInfoGroup().f381861d.f380714e.f371841f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return gVar;
    }

    public boolean isCollectedAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        boolean z17 = false;
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return false;
        }
        s34.e1 e1Var = adXml.collectedAdInfo;
        if (e1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            boolean z18 = e1Var.f402626a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            if (z18) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z17;
    }

    public boolean isExposured() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z17 = (this.field_localFlag & 128) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z17;
    }

    public boolean isLocalInvisible() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z17 = (this.field_localFlag & 256) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z17;
    }

    public boolean isRecExpAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return false;
        }
        boolean isRecExpAd = adXml.isRecExpAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return isRecExpAd;
    }

    public boolean isSourceExist(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z17 = (i17 & this.field_sourceType) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z17;
    }

    public void readFromBundle(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (bundle == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return;
        }
        convertFrom((android.content.ContentValues) bundle.getParcelable("values"));
        this.localid = bundle.getInt("localid");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void removeSourceFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_sourceType = (~i17) & this.field_sourceType;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setAttrBuf(byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAttrBuf", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_attrBuf = bArr;
        this.contentByteMd5 = kk.k.g(this.field_content) + kk.k.g(this.field_attrBuf);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAttrBuf", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public boolean setContent(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.field_content = m21.y.q(str).toByteArray();
            this.contentByteMd5 = kk.k.g(this.field_content) + kk.k.g(this.field_attrBuf);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return false;
        }
    }

    public void setExposures() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExposures", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_localFlag |= 128;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExposures", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setLocalInvisible() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_localFlag |= 256;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setLocalVisible() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalVisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_localFlag &= -257;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalVisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setNotExposured() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNotExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_localFlag &= -129;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNotExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setRemindInfoGroup(r45.o3 o3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.field_remindInfoGroup = o3Var.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "remindInfo toBytes error! " + e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setSnsId(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_snsId = j17;
        if (j17 != 0) {
            setStringSeq(j17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setStringSeq(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String t07 = ca4.z0.t0(j17);
        this.field_stringSeq = t07;
        this.field_stringSeq = ca4.z0.A(t07);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setTimeLine(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.field_content = timeLineObject.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public android.os.Bundle writeToBundle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("values", super.convertTo());
        bundle.putInt("localid", this.localid);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return bundle;
    }

    public android.content.ContentValues convertFrom(android.content.ContentValues contentValues) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_snsId = contentValues.getAsLong("snsId").longValue();
        this.field_userName = contentValues.getAsString("userName");
        this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
        this.field_createTime = contentValues.getAsInteger("createTime").intValue();
        this.field_head = contentValues.getAsInteger("head").intValue();
        this.field_localPrivate = contentValues.getAsInteger("localPrivate").intValue();
        this.field_type = contentValues.getAsInteger("type").intValue();
        this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
        this.field_likeFlag = contentValues.getAsInteger("likeFlag").intValue();
        this.field_pravited = contentValues.getAsInteger("pravited").intValue();
        this.field_stringSeq = contentValues.getAsString("stringSeq");
        this.field_content = contentValues.getAsByteArray("content");
        this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
        this.field_postBuf = contentValues.getAsByteArray("postBuf");
        this.field_adinfo = contentValues.getAsString(dm.n.COL_ADINFO);
        this.field_adxml = contentValues.getAsString(dm.n.COL_ADXML);
        this.field_createAdTime = contentValues.getAsInteger(dm.n.COL_CREATEADTIME).intValue();
        this.field_exposureTime = contentValues.getAsInteger(dm.n.COL_EXPOSURETIME).intValue();
        this.field_firstControlTime = contentValues.getAsInteger(dm.n.COL_FIRSTCONTROLTIME).intValue();
        this.field_recxml = contentValues.getAsString(dm.n.COL_RECXML);
        this.field_subType = contentValues.getAsInteger("subType").intValue();
        this.systemRowid = contentValues.getAsLong("rowid").longValue();
        this.field_atAdinfo = contentValues.getAsString(dm.n.COL_ATADINFO);
        this.field_remindInfoGroup = contentValues.getAsByteArray(dm.n.COL_REMINDINFOGROUP);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return contentValues;
    }
}
