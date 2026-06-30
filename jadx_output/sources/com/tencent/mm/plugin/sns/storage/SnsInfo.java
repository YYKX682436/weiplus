package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class SnsInfo extends dm.va {
    public static final java.lang.String COL_ID = "rowid";
    public static final long SECONDS_OF_DAY = 86400;
    public static final long SECONDS_OF_HOUR = 3600;
    public static final long SECONDS_OF_MINUTE = 60;
    public static final java.lang.String TABLEINDEXHEAD = "serverSnsTimeHeadIndex";
    public static final java.lang.String TABLEINDEXLOCALFLAG = "snsLocalflagIndex";
    public static final java.lang.String TABLEINDEXMULTI1 = "snsMultiIndex1";
    public static final java.lang.String TABLEINDEXMULTI2 = "snsMultiIndex2";
    public static final java.lang.String TABLEINDEXMULTI3 = "snsMultiIndex3";
    public static final java.lang.String TABLEINDEXSOURCE = "serverSnsTimeSourceTypeIndex";
    public static final java.lang.String TABLEINDEXTIME = "serverSnsTimeIndex";
    public static final java.lang.String TABLEINDEXUSERNAME = "serverSnsNameIndex";
    private static final java.lang.String TAG = "MicroMsg.SnsInfo";
    private com.tencent.mm.plugin.sns.storage.AdSnsInfo adsnsinfo;
    public int localid;
    protected static l75.e0 info = dm.va.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.SnsInfo.class);
    protected static java.util.Map<java.lang.String, com.tencent.mm.protocal.protobuf.TimeLineObject> cacheTimeLine = new java.util.concurrent.ConcurrentHashMap();
    protected static java.util.Map<java.lang.String, r45.kj4> cacheMediaPost = new java.util.concurrent.ConcurrentHashMap();
    public java.lang.String contentByteMd5 = null;
    public java.lang.String postinfoMd5 = null;
    public int ExtFlag = 0;
    public java.lang.CharSequence withTaUsername = "";
    private boolean isAd = false;
    private r45.kj4 postInfo = null;

    public SnsInfo() {
    }

    public static int formatUnixTime(long j17) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatUnixTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(1000 * j17));
        try {
            i17 = java.lang.Integer.valueOf(format).intValue();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(TAG, "error valueOf  " + format);
            i17 = (int) (j17 / 86400);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatUnixTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public static com.tencent.mm.plugin.sns.storage.SnsInfo getNewSnsInfo(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNewSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        snsInfo2.localid = snsInfo.localid;
        snsInfo2.field_snsId = snsInfo.field_snsId;
        snsInfo2.field_userName = snsInfo.field_userName;
        snsInfo2.field_localFlag = snsInfo.field_localFlag;
        snsInfo2.field_createTime = snsInfo.field_createTime;
        snsInfo2.field_head = snsInfo.field_head;
        snsInfo2.field_localPrivate = snsInfo.field_localPrivate;
        snsInfo2.field_type = snsInfo.field_type;
        snsInfo2.field_sourceType = snsInfo.field_sourceType;
        snsInfo2.field_likeFlag = snsInfo.field_likeFlag;
        snsInfo2.field_pravited = snsInfo.field_pravited;
        snsInfo2.field_stringSeq = snsInfo.field_stringSeq;
        snsInfo2.field_content = snsInfo.field_content;
        snsInfo2.field_attrBuf = snsInfo.field_attrBuf;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNewSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return snsInfo2;
    }

    public static boolean isPhotoType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPhotoType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = true;
        if (i17 != 54 && i17 != 1) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPhotoType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public static synchronized void release() {
        synchronized (com.tencent.mm.plugin.sns.storage.SnsInfo.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            cacheTimeLine.clear();
            cacheMediaPost.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        }
    }

    public void addSourceFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_sourceType = i17 | this.field_sourceType;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public boolean canDeal() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canDeal", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = this.field_snsId != 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canDeal", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public void cleanPostHolding() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -513;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void cleanWsFoldFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -1025;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void clearItemDie() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -33;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void clearWsFeedTypeFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -4097;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    @Override // dm.va, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        super.convertFrom(cursor);
        this.localid = (int) this.systemRowid;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public java.lang.String dumpAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dumpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = getAdSnsInfo();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.field_stringSeq);
        stringBuffer.append(adSnsInfo.field_adxml);
        stringBuffer.append(" <createtime " + this.field_createTime + ">");
        stringBuffer.append(" <exposuretime " + adSnsInfo.field_exposureTime + ">");
        stringBuffer.append(" <adcreatetime " + adSnsInfo.field_createAdTime + "> ");
        stringBuffer.append(adSnsInfo.getTimeLine().ContentDesc);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return stringBuffer2;
    }

    public com.tencent.mm.plugin.sns.storage.ADInfo getAdInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isAd() && this.adsnsinfo == null) {
            this.adsnsinfo = com.tencent.mm.plugin.sns.model.l4.Vi().y0(this.field_snsId);
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = this.adsnsinfo;
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = adSnsInfo == null ? new com.tencent.mm.plugin.sns.storage.ADInfo(null) : adSnsInfo.getAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return aDInfo;
    }

    public java.lang.String getAdInfoLink() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = getAdInfo();
        if (adInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return "";
        }
        java.lang.String str = adInfo.adActionLink;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public java.lang.String getAdLink() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return "";
        }
        java.lang.String str = adXml.adActionLink;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public int getAdRecSrc() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 0;
        }
        int i17 = adXml.recSrc;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public com.tencent.mm.plugin.sns.storage.AdSnsInfo getAdSnsInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isAd() && this.adsnsinfo == null) {
            this.adsnsinfo = com.tencent.mm.plugin.sns.model.l4.Vi().y0(this.field_snsId);
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = this.adsnsinfo;
        if (adSnsInfo != null) {
            adSnsInfo.field_createTime = this.field_createTime;
            adSnsInfo.field_userName = this.field_userName;
            adSnsInfo.field_likeFlag = this.field_likeFlag;
            adSnsInfo.field_attrBuf = this.field_attrBuf;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return adSnsInfo;
    }

    public java.lang.String getAdTitle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return "";
        }
        java.lang.String str = adXml.adActionTitle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public int getAdType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return -1;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = getTimeLine();
        if (adXml.isLinkAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 3;
        }
        if (adXml.isCardAd() || adXml.isFullCardAd()) {
            if (timeLine == null || timeLine.ContentObj.f369837e != 15 || timeLine.sightFolded == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return 4;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 5;
        }
        if (adXml.isFinderTopicCard()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 9;
        }
        if (adXml.isSlideFullCard()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 10;
        }
        if (adXml.isLookbookCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 12;
        }
        if (adXml.isFlipCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 13;
        }
        int i17 = this.field_type != 1 ? 2 : 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public synchronized com.tencent.mm.plugin.sns.storage.ADXml getAdXml() {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isAd() && this.adsnsinfo == null) {
            this.adsnsinfo = com.tencent.mm.plugin.sns.model.l4.Vi().y0(this.field_snsId);
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = this.adsnsinfo;
        aDXml = adSnsInfo == null ? new com.tencent.mm.plugin.sns.storage.ADXml(null) : adSnsInfo.getAdXml();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return aDXml;
    }

    public java.lang.String getAid() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = getAdInfo();
        java.lang.String str = adInfo == null ? "" : adInfo.aid;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public com.tencent.mm.plugin.sns.storage.ADInfo getAtAdInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isAd() && this.adsnsinfo == null) {
            this.adsnsinfo = com.tencent.mm.plugin.sns.model.l4.Vi().y0(this.field_snsId);
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = this.adsnsinfo;
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = adSnsInfo == null ? new com.tencent.mm.plugin.sns.storage.ADInfo(null) : adSnsInfo.getAtAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return aDInfo;
    }

    public int getCreateTime() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_createTime;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    @Override // dm.va, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        l75.e0 e0Var = info;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return e0Var;
    }

    public java.lang.String getDynamicInfoId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicInfoId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String dynamicInfoId = getAdXml().getDynamicInfoId();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicInfoId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return dynamicInfoId;
    }

    public int getHead() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_head;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public int getLikeFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_likeFlag;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public int getLocalFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_localFlag;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public int getLocalPrivate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_localPrivate;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public java.lang.String getLocalid() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isAd()) {
            java.lang.String j17 = com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", this.localid);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return j17;
        }
        java.lang.String j18 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", this.localid);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return j18;
    }

    public byte[] getPostBuf() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        byte[] bArr = this.field_postBuf;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return bArr;
    }

    public r45.kj4 getPostInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        byte[] bArr = this.field_postBuf;
        if (bArr == null) {
            r45.kj4 kj4Var = new r45.kj4();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return kj4Var;
        }
        if (this.postinfoMd5 == null) {
            this.postinfoMd5 = kk.k.g(bArr);
        }
        if (cacheMediaPost.containsKey(this.postinfoMd5)) {
            r45.kj4 kj4Var2 = cacheMediaPost.get(this.postinfoMd5);
            this.postInfo = kj4Var2;
            if (kj4Var2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return kj4Var2;
            }
        }
        try {
            r45.kj4 kj4Var3 = (r45.kj4) new r45.kj4().parseFrom(this.field_postBuf);
            this.postInfo = kj4Var3;
            cacheMediaPost.put(this.postinfoMd5, kj4Var3);
            r45.kj4 kj4Var4 = this.postInfo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return kj4Var4;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(TAG, "error get snsinfo timeline!");
            r45.kj4 kj4Var5 = new r45.kj4();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return kj4Var5;
        }
    }

    public int getPravited() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_pravited;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public java.lang.String getSnsId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String snsId = getSnsId(isAd(), this.field_snsId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return snsId;
    }

    public java.lang.String getSnsInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String str = "snsId: " + this.field_stringSeq + " \n  localFlag: " + this.field_localFlag + " #\u3000 \n  type: " + this.field_type + " lp: " + this.field_localPrivate + " \n  isPr: " + this.field_pravited + " head: " + this.field_head + " \n  time: " + this.field_createTime + " \n ";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public int getSourceType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_sourceType;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public java.lang.String getStringSeq() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String str = this.field_stringSeq;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject getTimeLine() {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (this.field_content == null) {
            com.tencent.mm.protocal.protobuf.TimeLineObject i17 = m21.y.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return i17;
        }
        if (this.contentByteMd5 == null) {
            this.contentByteMd5 = kk.k.g(this.field_content) + kk.k.g(this.field_attrBuf);
        }
        if (cacheTimeLine.containsKey(this.contentByteMd5) && (timeLineObject = cacheTimeLine.get(this.contentByteMd5)) != null && timeLineObject.ContentObj != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return timeLineObject;
        }
        try {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = (com.tencent.mm.protocal.protobuf.TimeLineObject) new com.tencent.mm.protocal.protobuf.TimeLineObject().parseFrom(this.field_content);
            if (timeLineObject2 == null) {
                com.tencent.mars.xlog.Log.e(TAG, "error timeLineObj is null!");
                com.tencent.mm.protocal.protobuf.TimeLineObject i18 = m21.y.i();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return i18;
            }
            if (timeLineObject2.ContentObj != null) {
                cacheTimeLine.put(this.contentByteMd5, timeLineObject2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return timeLineObject2;
            }
            com.tencent.mars.xlog.Log.e(TAG, "error timeLineObj.ContentObj is null!");
            com.tencent.mm.protocal.protobuf.TimeLineObject i19 = m21.y.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return i19;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(TAG, "error get snsinfo timeline!");
            com.tencent.mm.protocal.protobuf.TimeLineObject i27 = m21.y.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return i27;
        }
    }

    public java.lang.String getTraceid() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = getAdInfo();
        java.lang.String str = adInfo == null ? "" : adInfo.traceid;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public int getTypeFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_type;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    public java.lang.String getUserName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String str = this.field_userName;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public java.lang.String getUxinfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = getAdInfo();
        if (adInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return "";
        }
        java.lang.String str = adInfo.uxInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public boolean hasAdDynamicInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasAdDynamicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().hasAdDynamicInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAdDynamicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean isSourceExist = isSourceExist(32);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return isSourceExist;
    }

    public boolean isAdForbidAutoPlay() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        boolean isForbidAutoPlay = adXml.isForbidAutoPlay();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return isForbidAutoPlay;
    }

    public boolean isAdIpInteractVideo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.isAdIpInteractVideo()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isBreakFrameAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.isAdBreakFrameVideo()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isBreakFrameGestureAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.isBreakFrameGestureAd()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isCardAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isCollectedAd() {
        s34.e1 e1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && (e1Var = adXml.collectedAdInfo) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            boolean z18 = e1Var.f402626a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            if (z18) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCollectedAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isCombinedGridAD() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCombinedGridAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isCombinedGridAD();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCombinedGridAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isCoverPostFailed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 2048) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isDeadSource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDeadSource", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_sourceType & 270) == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDeadSource", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isDieItem() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDieItem", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 32) > 0 && this.field_snsId == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDieItem", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isDragAd() {
        com.tencent.mm.plugin.sns.storage.n nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDragAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDragAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (isFullCardAd() && adXml != null && (nVar = adXml.adFullCardInfo) != null && nVar.adDragInfo != null) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDragAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isDynamicAD() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDynamicAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isDynamicAD();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDynamicAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isExposures() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 128) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isExtFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 2) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isFinderAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = getAdInfo();
        if (adXml != null && adXml.adFinderInfo != null && adInfo != null && adInfo.adActionType == 9) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isFinderTopicCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderTopicCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isFinderTopicCard();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderTopicCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isFireworkCheerAd() {
        mb4.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFireworkCheerAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFireworkCheerAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (isFullCardAd() && adXml != null && (cVar = adXml.adSocialInfo) != null && cVar.f325388m != null) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFireworkCheerAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isFlipCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFlipCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isFlipCardAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFlipCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isFullCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isFullCardAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isGestureAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.isGestureAd()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isInValid() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = this.field_snsId == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isLocalInvisible() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 256) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isLongPressGestureAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.isLongPressGestureAd()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isLookbookCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLookbookCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isLookbookCardAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLookbookCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isNoCopy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_serverExtFlag & 128) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isOmittedFailResend() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 64) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isPatAd() {
        mb4.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPatAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPatAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (isSocialAttitudeAd() && (aVar = adXml.adSocialInfo.f325389n) != null && aVar.a() != null && adXml.adSocialInfo.f325389n.a().d() && adXml.adSocialInfo.f325389n.b() != null && adXml.adSocialInfo.f325389n.b().d()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPatAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isPhoto() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPhoto", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.field_type;
        boolean z17 = true;
        if (i17 != 54 && i17 != 1) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPhoto", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isRecExpAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        boolean isRecExpAd = adXml.isRecExpAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return isRecExpAd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (getPostInfo().S == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isSecurityNeedVerifyDieItem() {
        /*
            r4 = this;
            java.lang.String r0 = "isSecurityNeedVerifyDieItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r4.isDieItem()
            if (r2 == 0) goto L20
            r45.kj4 r2 = r4.getPostInfo()
            int r2 = r2.R
            r3 = 1
            if (r2 != r3) goto L20
            r45.kj4 r2 = r4.getPostInfo()
            boolean r2 = r2.S
            if (r2 != 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.SnsInfo.isSecurityNeedVerifyDieItem():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (getPostInfo().S != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isSecurityPassDieItem() {
        /*
            r4 = this;
            java.lang.String r0 = "isSecurityPassDieItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r4.isDieItem()
            if (r2 == 0) goto L20
            r45.kj4 r2 = r4.getPostInfo()
            int r2 = r2.R
            r3 = 1
            if (r2 != r3) goto L20
            r45.kj4 r2 = r4.getPostInfo()
            boolean r2 = r2.S
            if (r2 == 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.SnsInfo.isSecurityPassDieItem():boolean");
    }

    public boolean isShakeAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.isShakeAd()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isSlideCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSlideCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isSlideCard();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSlideCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isSlideFullCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isSlideFullCard();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isSocialAttitudeAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSocialAttitudeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSocialAttitudeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.adSocialInfo != null) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSocialAttitudeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isSolidBreakFrameAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSolidBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSolidBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.isAdSolidBreakFrameVideo()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSolidBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isSourceExist(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (i17 & this.field_sourceType) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isSphereCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = isAd() && getAdXml() != null && getAdXml().isSphereCardAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isTimeLimit(int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_post_retry_limit, 50);
        if (Ni > 0 && i17 >= Ni) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.H1(j17 / 1000) > 7200) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return false;
    }

    public boolean isTurnCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTurnCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = getTimeLine() != null && getTimeLine().ContentObj.f369837e == 27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTurnCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isTwistAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.isTwistAd()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValid() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = this.field_snsId != 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidAdBrandTopicInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAdBrandTopicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdBrandTopicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.adBrandTopicInfo != null) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdBrandTopicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidAdHeadStateInfo() {
        x84.e eVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAdHeadStateInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdHeadStateInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && (eVar = adXml.adHeadStateInfo) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            com.tencent.mm.plugin.sns.storage.h1 h1Var = eVar.f452586a;
            f06.v[] vVarArr = x84.e.f452585f;
            java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) h1Var).a(eVar, vVarArr[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            x84.e eVar2 = adXml.adHeadStateInfo;
            eVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str2 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) eVar2.f452587b).a(eVar2, vVarArr[1]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            x84.e eVar3 = adXml.adHeadStateInfo;
            eVar3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str3 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) eVar3.f452588c).a(eVar3, vVarArr[2]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            x84.e eVar4 = adXml.adHeadStateInfo;
            eVar4.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str4 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) eVar4.f452589d).a(eVar4, vVarArr[3]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.N0(str, str2, str3, str4)) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdHeadStateInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidAdHighLightInfo() {
        u84.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAdHighLightInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdHighLightInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && (lVar = adXml.adHighlightTagInfo) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            java.lang.String str = lVar.f425576a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.N0(str, adXml.adHighlightTagInfo.a())) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdHighLightInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidAdHotDiscussedBarInfo() {
        u84.h0 h0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAdHotDiscussedBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdHotDiscussedBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && (h0Var = adXml.adHotDiscussedBarInfo) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            java.lang.String str = h0Var.f425541c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.N0(str, adXml.adHotDiscussedBarInfo.a())) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdHotDiscussedBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidAdRandomSelectCardInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAdRandomSelectCardInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdRandomSelectCardInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.randomSelectCardAdInfo != null) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdRandomSelectCardInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidAdRockPaperScissorsInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAdRockPaperScissorsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdRockPaperScissorsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && adXml.adRockPaperScissorsInfo != null) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdRockPaperScissorsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidAdStateSettingBarInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        u84.o1 o1Var = getAdXml().adStateSettingBarInfo;
        if (o1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        if (o1Var.b() == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str = o1Var.f425629d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return z17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        java.lang.String str2 = o1Var.f425629d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.N0(str2, o1Var.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z18;
    }

    public boolean isValidAdWorldCupAvatarInfo() {
        m84.w wVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidAdWorldCupAvatarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdWorldCupAvatarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && (wVar = adXml.adWorldCupAvatarInfo) != null && wVar.c()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidAdWorldCupAvatarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidGeneralPAGInfo() {
        com.tencent.mm.plugin.sns.ad.widget.adpag.d0 d0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidGeneralPAGInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidGeneralPAGInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.ad.widget.adpag.a aVar = getAdXml().adBarPAGContainerInfo;
        if (aVar == null || (d0Var = aVar.f163327d) == null || !d0Var.d()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidGeneralPAGInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        if (aVar.f163324a > 0 && aVar.f163325b > 0 && aVar.f163326c > 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidGeneralPAGInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isValidSingleProductInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidSingleProductInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidSingleProductInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        s34.t1 t1Var = getAdXml().singleProductInfo;
        if (t1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) t1Var.f402777d).a(t1Var, s34.t1.f402773j[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.N0(str, t1Var.f402778e)) {
                if (t1Var.f402774a > 0 && t1Var.f402775b > 0 && t1Var.f402776c > 0) {
                    z17 = true;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidSingleProductInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return z17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidSingleProductInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return false;
    }

    public boolean isWaitPost() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWaitPost", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 16) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWaitPost", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isWithMe() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 1) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isWsFeedType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWsFeedType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 4096) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWsFeedType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isWsFold() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWsFold", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.field_localFlag & 1024) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWsFold", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean isWxWork() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWxWork", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        gm0.j1.i();
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(this.field_userName);
        boolean z17 = com.tencent.mm.storage.z3.m4(this.field_userName) && "3552365301".equals(f07 == null ? null : f07.Q0());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWxWork", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public boolean needDynamicViewUpdate() {
        s34.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needDynamicViewUpdate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needDynamicViewUpdate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = getAdXml();
        if (adXml != null && (lVar = adXml.adDynamicFeedUpdateInfo) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            java.lang.String str = lVar.f402698a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            if (!android.text.TextUtils.isEmpty(str)) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needDynamicViewUpdate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    public void printInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("printInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("printInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void readFromBundle(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (bundle == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return;
        }
        convertFrom((android.content.ContentValues) bundle.getParcelable("values"));
        this.localid = bundle.getInt("localid");
        android.os.Bundle bundle2 = bundle.getBundle("adValues");
        if (bundle2 != null) {
            com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = new com.tencent.mm.plugin.sns.storage.AdSnsInfo();
            adSnsInfo.readFromBundle(bundle2);
            this.adsnsinfo = adSnsInfo;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void removeSourceFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_sourceType = (~i17) & this.field_sourceType;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setAdSnsInfo(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.adsnsinfo = adSnsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setAttrBuf(byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAttrBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_attrBuf = bArr;
        this.contentByteMd5 = kk.k.g(this.field_content) + kk.k.g(this.field_attrBuf);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAttrBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public boolean setContent(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            this.field_content = m21.y.q(str).toByteArray();
            this.contentByteMd5 = kk.k.g(this.field_content) + kk.k.g(this.field_attrBuf);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
    }

    public void setCoverPostFailed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 2048;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setCreateTime(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mars.xlog.Log.i(TAG, "setCreateTime >> lastCreateTime: %d, currentCreateTime: %d, localId: %d", java.lang.Integer.valueOf(this.field_createTime), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.localid));
        int i18 = this.field_createTime;
        if (i17 - i18 >= 180 || i17 - i18 < 0) {
            this.field_createTime = i17;
            setHead(formatUnixTime(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        } else {
            if (this.field_head == 0) {
                setHead(formatUnixTime(i18));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        }
    }

    public void setExposures() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 128;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setExtFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setHead(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_head = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setItemDie() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 32;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLikeFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_likeFlag = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalInvisible() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 256;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalPrivate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localPrivate |= 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalVisible() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalVisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -257;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalVisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalid(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.localid = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setOmittedFailResend() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 64;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostBuf(byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_postBuf = bArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostFinish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPostFinish", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPostFinish", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostHolding() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 512;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            setPostBuf(this.postInfo.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e(TAG, "toByteArray error");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostWaiting() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPostWaiting", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 16;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPostWaiting", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPravited(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_pravited = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setSecurityVerifyPass() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSecurityVerifyPass", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        getPostInfo().S = true;
        setPostInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSecurityVerifyPass", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setSnsId(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_snsId = j17;
        if (j17 != 0) {
            setStringSeq(j17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setStringSeq(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_stringSeq = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setSubTypeFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSubTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_subType = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setTimeLine(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            this.field_content = timeLineObject.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
        this.contentByteMd5 = kk.k.g(this.field_content) + kk.k.g(this.field_attrBuf);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setTypeFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_type = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setUserName(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_userName = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setWithMe() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setWsFeedTypeFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 4096;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setWsFoldFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 1024;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void unLocalPrivate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localPrivate = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void unSetExtFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unSetExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unSetExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void unSetWithMe() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unSetWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unSetWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void unsetOmittedFailResend() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unsetOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isOmittedFailResend()) {
            this.field_localFlag &= -65;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unsetOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public boolean useNewAdSocialLogic() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewAdSocialLogic", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewAdSocialLogic", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        boolean isPatAd = isPatAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewAdSocialLogic", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return isPatAd;
    }

    public android.os.Bundle writeToBundle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("values", super.convertTo());
        bundle.putInt("localid", this.localid);
        if (getAdSnsInfo() != null) {
            bundle.putBundle("adValues", getAdSnsInfo().writeToBundle());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return bundle;
    }

    public static java.lang.String getSnsId(boolean z17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (z17) {
            java.lang.String j18 = com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return j18;
        }
        java.lang.String j19 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return j19;
    }

    public void setStringSeq(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_stringSeq = ca4.z0.s0(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public android.content.ContentValues convertFrom(android.content.ContentValues contentValues) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
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
        this.field_subType = contentValues.getAsInteger("subType").intValue();
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return contentValues;
    }

    public com.tencent.mm.plugin.sns.storage.ADInfo getAdInfo(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = getAtAdInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return atAdInfo;
        }
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = getAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return adInfo;
    }

    public SnsInfo(long j17) {
        setSnsId(j17);
    }
}
