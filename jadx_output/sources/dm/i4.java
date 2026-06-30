package dm;

/* loaded from: classes12.dex */
public class i4 extends l75.f0 {
    public static final p75.d CLIPLIST;
    public static final java.lang.String COL_CLIPLIST = "clipList";
    public static final java.lang.String COL_CREATETIME = "createTime";
    public static final java.lang.String COL_CUSTOMDATA = "customData";
    public static final java.lang.String COL_FINDEROBJECT = "finderObject";
    public static final java.lang.String COL_HALFMEDIAEXTLIST = "halfMediaExtList";
    public static final java.lang.String COL_ID = "id";
    public static final java.lang.String COL_LOCALFLAG = "localFlag";
    public static final java.lang.String COL_LOCALID = "localId";
    public static final java.lang.String COL_LONGVIDEOMEDIAEXTLIST = "longVideoMediaExtList";
    public static final java.lang.String COL_MEDIAEXTLIST = "mediaExtList";
    public static final java.lang.String COL_POSTEXTRADATA = "postExtraData";
    public static final java.lang.String COL_POSTINFO = "postinfo";
    public static final java.lang.String COL_REPORTOBJECT = "reportObject";
    public static final java.lang.String COL_SOURCEFLAG = "sourceFlag";
    public static final java.lang.String COL_UPDATETIME = "updateTime";
    public static final java.lang.String COL_USERNAME = "username";
    public static final java.lang.String COL_WATERMARKFLAG = "watermarkFlag";
    public static final p75.d CREATETIME;
    public static final p75.d CUSTOMDATA;
    public static final l75.e0 DB_INFO;
    public static final p75.d FINDEROBJECT;
    public static final p75.d HALFMEDIAEXTLIST;
    public static final p75.d ID;
    public static final java.lang.String[] INDEX_CREATE;
    public static final p75.d LOCALFLAG;
    public static final p75.d LOCALID;
    public static final p75.d LONGVIDEOMEDIAEXTLIST;
    public static final p75.d MEDIAEXTLIST;
    public static final o75.e OBSERVER_OWNER;
    public static final p75.d POSTEXTRADATA;
    public static final p75.d POSTINFO;
    public static final p75.d REPORTOBJECT;
    public static final p75.d ROWID;
    public static final p75.d SOURCEFLAG;
    public static final p75.n0 TABLE;
    public static final java.lang.String TABLE_NAME = "FinderFeedItem";
    private static final java.lang.String TAG_ = "MicroMsg.SDK.BaseFinderFeedItem";
    public static final p75.d UPDATETIME;
    public static final p75.d USERNAME;
    public static final p75.d WATERMARKFLAG;
    private static final int clipList_HASHCODE;
    private static final int createTime_HASHCODE;
    private static final int customData_HASHCODE;
    private static final int finderObject_HASHCODE;
    private static final int halfMediaExtList_HASHCODE;
    private static final int id_HASHCODE;
    private static final int localFlag_HASHCODE;
    private static final int localId_HASHCODE;
    private static final int longVideoMediaExtList_HASHCODE;
    private static final int mediaExtList_HASHCODE;
    private static final int postExtraData_HASHCODE;
    private static final int postinfo_HASHCODE;
    private static final int reportObject_HASHCODE;
    private static final int rowid_HASHCODE;
    private static final int sourceFlag_HASHCODE;
    private static final int updateTime_HASHCODE;
    private static final int username_HASHCODE;
    private static final int watermarkFlag_HASHCODE;
    public r45.za4 field_clipList;
    public long field_createTime;
    public r45.u01 field_customData;
    public com.tencent.mm.protocal.protobuf.FinderObject field_finderObject;
    public r45.fc4 field_halfMediaExtList;
    public long field_id;
    public int field_localFlag;
    public long field_localId;
    public r45.fc4 field_longVideoMediaExtList;
    public r45.fc4 field_mediaExtList;
    public r45.qp2 field_postExtraData;
    public r45.qb4 field_postinfo;
    public com.tencent.mm.protocal.protobuf.FinderFeedReportObject field_reportObject;
    public int field_sourceFlag;
    public long field_updateTime;
    public java.lang.String field_username;
    public int field_watermarkFlag;
    private boolean __hadSetlocalId = true;
    private boolean __hadSetid = true;
    private boolean __hadSetcreateTime = true;
    private boolean __hadSetusername = true;
    private boolean __hadSetsourceFlag = true;
    private boolean __hadSetupdateTime = true;
    private boolean __hadSetfinderObject = true;
    private boolean __hadSetlocalFlag = true;
    private boolean __hadSetpostinfo = true;
    private boolean __hadSetmediaExtList = true;
    private boolean __hadSetreportObject = true;
    private boolean __hadSetpostExtraData = true;
    private boolean __hadSetcustomData = true;
    private boolean __hadSetlongVideoMediaExtList = true;
    private boolean __hadSethalfMediaExtList = true;
    private boolean __hadSetclipList = true;
    private boolean __hadSetwatermarkFlag = true;

    static {
        p75.n0 n0Var = new p75.n0(TABLE_NAME);
        TABLE = n0Var;
        java.lang.String str = n0Var.f352676a;
        ROWID = new p75.d("rowid", "long", str, "");
        LOCALID = new p75.d(COL_LOCALID, "long", str, "");
        ID = new p75.d(COL_ID, "long", str, "");
        CREATETIME = new p75.d("createTime", "long", str, "");
        USERNAME = new p75.d(COL_USERNAME, "string", str, "");
        SOURCEFLAG = new p75.d(COL_SOURCEFLAG, "int", str, "");
        UPDATETIME = new p75.d(COL_UPDATETIME, "long", str, "");
        FINDEROBJECT = new p75.d(COL_FINDEROBJECT, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.FinderObject");
        LOCALFLAG = new p75.d("localFlag", "int", str, "");
        POSTINFO = new p75.d(COL_POSTINFO, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.LocalFinderPostInfo");
        MEDIAEXTLIST = new p75.d(COL_MEDIAEXTLIST, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.LocalMediaListExt");
        REPORTOBJECT = new p75.d(COL_REPORTOBJECT, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.FinderFeedReportObject");
        POSTEXTRADATA = new p75.d(COL_POSTEXTRADATA, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.FinderPostExtra");
        CUSTOMDATA = new p75.d(COL_CUSTOMDATA, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.FinderCustomFeedData");
        LONGVIDEOMEDIAEXTLIST = new p75.d(COL_LONGVIDEOMEDIAEXTLIST, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.LocalMediaListExt");
        HALFMEDIAEXTLIST = new p75.d(COL_HALFMEDIAEXTLIST, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.LocalMediaListExt");
        CLIPLIST = new p75.d(COL_CLIPLIST, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str, "com.tencent.mm.protocal.protobuf.LocalClipListExt");
        WATERMARKFLAG = new p75.d(COL_WATERMARKFLAG, "int", str, "");
        INDEX_CREATE = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderFeedItem_local_index ON FinderFeedItem(localId)", "CREATE INDEX IF NOT EXISTS FinderFeedItem_Id ON FinderFeedItem(id)", "CREATE INDEX IF NOT EXISTS FinderFeedItem_create_time ON FinderFeedItem(createTime)", "CREATE INDEX IF NOT EXISTS FinderFeedItem__Local_Flag ON FinderFeedItem(localFlag)"};
        localId_HASHCODE = 338409958;
        id_HASHCODE = 3355;
        createTime_HASHCODE = 1369213417;
        username_HASHCODE = -265713450;
        sourceFlag_HASHCODE = -1111861721;
        updateTime_HASHCODE = -295931082;
        finderObject_HASHCODE = 463590149;
        localFlag_HASHCODE = -1205623433;
        postinfo_HASHCODE = 757640526;
        mediaExtList_HASHCODE = -1286867493;
        reportObject_HASHCODE = 472001939;
        postExtraData_HASHCODE = -1414616294;
        customData_HASHCODE = -1582182725;
        longVideoMediaExtList_HASHCODE = 832388826;
        halfMediaExtList_HASHCODE = -1102948946;
        clipList_HASHCODE = 917544974;
        watermarkFlag_HASHCODE = -1225389584;
        rowid_HASHCODE = 108705909;
        DB_INFO = initAutoDBInfo(dm.i4.class);
        OBSERVER_OWNER = new o75.e();
    }

    public static final m75.a batchInsert(java.util.List<dm.i4> list, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (dm.i4 i4Var : list) {
            if (z17) {
                arrayList.add(new m75.c(i4Var, true, i4Var.createInsertEvent(), OBSERVER_OWNER, TAG_));
            } else {
                arrayList.add(new m75.c(i4Var, true, null, null, TAG_));
            }
        }
        return new m75.a(arrayList);
    }

    public static void createTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e(TAG_, "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderFeedItem ( " + DB_INFO.f316956e + ");");
        for (java.lang.String str : INDEX_CREATE) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i(TAG_, "createTableSql %s", str2);
            k0Var.A(TABLE_NAME, str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(DB_INFO, TABLE_NAME, k0Var)) {
            com.tencent.mars.xlog.Log.i(TAG_, "updateTableSql %s", str3);
            k0Var.A(TABLE_NAME, str3);
        }
        com.tencent.mars.xlog.Log.i(TAG_, "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static final dm.e4 cvBuilder() {
        return new dm.e4();
    }

    public static final dm.f4 delete() {
        return new dm.f4();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class<?> cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[17];
        java.lang.String[] strArr = new java.lang.String[18];
        e0Var.f316954c = strArr;
        strArr[0] = COL_LOCALID;
        e0Var.f316955d.put(COL_LOCALID, "LONG PRIMARY KEY ");
        e0Var.f316953b = COL_LOCALID;
        e0Var.f316954c[1] = COL_ID;
        e0Var.f316955d.put(COL_ID, "LONG");
        e0Var.f316954c[2] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[3] = COL_USERNAME;
        e0Var.f316955d.put(COL_USERNAME, "TEXT");
        e0Var.f316954c[4] = COL_SOURCEFLAG;
        e0Var.f316955d.put(COL_SOURCEFLAG, "INTEGER");
        e0Var.f316954c[5] = COL_UPDATETIME;
        e0Var.f316955d.put(COL_UPDATETIME, "LONG");
        e0Var.f316954c[6] = COL_FINDEROBJECT;
        e0Var.f316955d.put(COL_FINDEROBJECT, "BLOB");
        e0Var.f316954c[7] = "localFlag";
        e0Var.f316955d.put("localFlag", "INTEGER");
        e0Var.f316954c[8] = COL_POSTINFO;
        e0Var.f316955d.put(COL_POSTINFO, "BLOB");
        e0Var.f316954c[9] = COL_MEDIAEXTLIST;
        e0Var.f316955d.put(COL_MEDIAEXTLIST, "BLOB");
        e0Var.f316954c[10] = COL_REPORTOBJECT;
        e0Var.f316955d.put(COL_REPORTOBJECT, "BLOB");
        e0Var.f316954c[11] = COL_POSTEXTRADATA;
        e0Var.f316955d.put(COL_POSTEXTRADATA, "BLOB");
        e0Var.f316954c[12] = COL_CUSTOMDATA;
        e0Var.f316955d.put(COL_CUSTOMDATA, "BLOB");
        e0Var.f316954c[13] = COL_LONGVIDEOMEDIAEXTLIST;
        e0Var.f316955d.put(COL_LONGVIDEOMEDIAEXTLIST, "BLOB");
        e0Var.f316954c[14] = COL_HALFMEDIAEXTLIST;
        e0Var.f316955d.put(COL_HALFMEDIAEXTLIST, "BLOB");
        e0Var.f316954c[15] = COL_CLIPLIST;
        e0Var.f316955d.put(COL_CLIPLIST, "BLOB");
        e0Var.f316954c[16] = COL_WATERMARKFLAG;
        e0Var.f316955d.put(COL_WATERMARKFLAG, "INTEGER");
        e0Var.f316954c[17] = "rowid";
        e0Var.f316956e = " localId LONG PRIMARY KEY ,  id LONG,  createTime LONG,  username TEXT,  sourceFlag INTEGER,  updateTime LONG,  finderObject BLOB,  localFlag INTEGER,  postinfo BLOB,  mediaExtList BLOB,  reportObject BLOB,  postExtraData BLOB,  customData BLOB,  longVideoMediaExtList BLOB,  halfMediaExtList BLOB,  clipList BLOB,  watermarkFlag INTEGER";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public static final m75.c insert(dm.i4 i4Var, boolean z17) {
        return z17 ? new m75.c(i4Var, true, i4Var.createInsertEvent(), OBSERVER_OWNER, TAG_) : new m75.c(i4Var, true, null, null, TAG_);
    }

    public static final m75.c insertOrThrow(dm.i4 i4Var, boolean z17) {
        return z17 ? new m75.c(i4Var, false, i4Var.createInsertEvent(), OBSERVER_OWNER, TAG_) : new m75.c(i4Var, false, null, null, TAG_);
    }

    public static final p75.l0 isExistByLocalId(long j17) {
        p75.n0 n0Var = TABLE;
        p75.d dVar = LOCALID;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f352657d = dVar.i(java.lang.Long.valueOf(j17));
        h17.f352656c = TAG_;
        h17.c(1, 0);
        return h17.a();
    }

    public static final void observe(androidx.lifecycle.y yVar, o75.a aVar) {
        OBSERVER_OWNER.observe(yVar, aVar);
    }

    public static final void removeObserve(o75.a aVar) {
        OBSERVER_OWNER.removeObserver(aVar);
    }

    public static final m75.d replace(dm.i4 i4Var, boolean z17) {
        return z17 ? new m75.d(i4Var, i4Var.createReplaceEvent(), OBSERVER_OWNER, TAG_) : new m75.d(i4Var, null, null, TAG_);
    }

    public static final dm.g4 select() {
        return new dm.g4();
    }

    public static final p75.l0 selectByCreateTime(long j17) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = CREATETIME.i(java.lang.Long.valueOf(j17));
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByCreateTimeList(java.util.List<java.lang.Long> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = CREATETIME.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectById(long j17) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = ID.i(java.lang.Long.valueOf(j17));
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByIdList(java.util.List<java.lang.Long> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = ID.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByLocalFlag(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = LOCALFLAG.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByLocalFlagList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = LOCALFLAG.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByLocalId(long j17) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = LOCALID.i(java.lang.Long.valueOf(j17));
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByLocalIdList(java.util.List<java.lang.Long> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = LOCALID.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectBySourceFlag(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = SOURCEFLAG.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectBySourceFlagList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = SOURCEFLAG.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByUpdateTime(long j17) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = UPDATETIME.i(java.lang.Long.valueOf(j17));
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByUpdateTimeList(java.util.List<java.lang.Long> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = UPDATETIME.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByUsername(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = USERNAME.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByUsernameList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = USERNAME.l(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByWatermarkFlag(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = WATERMARKFLAG.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByWatermarkFlagList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = WATERMARKFLAG.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final long selectCreateTimeByLocalId(l75.k0 k0Var, long j17) {
        dm.g4 select = select();
        ((java.util.LinkedList) select.f237067a).add(CREATETIME);
        select.f237068b = LOCALID.i(java.lang.Long.valueOf(j17));
        dm.i4 i4Var = (dm.i4) select.a().o(k0Var, dm.i4.class);
        if (i4Var != null) {
            return i4Var.field_createTime;
        }
        return 0L;
    }

    public static final p75.l0 selectExistListByLocalId(java.util.List<java.lang.Long> list) {
        p75.n0 n0Var = TABLE;
        p75.d dVar = LOCALID;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f352657d = dVar.k(list);
        h17.f352656c = TAG_;
        return h17.a();
    }

    public static final long selectIdByLocalId(l75.k0 k0Var, long j17) {
        dm.g4 select = select();
        ((java.util.LinkedList) select.f237067a).add(ID);
        select.f237068b = LOCALID.i(java.lang.Long.valueOf(j17));
        dm.i4 i4Var = (dm.i4) select.a().o(k0Var, dm.i4.class);
        if (i4Var != null) {
            return i4Var.field_id;
        }
        return 0L;
    }

    public static final int selectLocalFlagByLocalId(l75.k0 k0Var, long j17) {
        dm.g4 select = select();
        ((java.util.LinkedList) select.f237067a).add(LOCALFLAG);
        select.f237068b = LOCALID.i(java.lang.Long.valueOf(j17));
        dm.i4 i4Var = (dm.i4) select.a().o(k0Var, dm.i4.class);
        if (i4Var != null) {
            return i4Var.field_localFlag;
        }
        return 0;
    }

    public static final int selectSourceFlagByLocalId(l75.k0 k0Var, long j17) {
        dm.g4 select = select();
        ((java.util.LinkedList) select.f237067a).add(SOURCEFLAG);
        select.f237068b = LOCALID.i(java.lang.Long.valueOf(j17));
        dm.i4 i4Var = (dm.i4) select.a().o(k0Var, dm.i4.class);
        if (i4Var != null) {
            return i4Var.field_sourceFlag;
        }
        return 0;
    }

    public static final long selectUpdateTimeByLocalId(l75.k0 k0Var, long j17) {
        dm.g4 select = select();
        ((java.util.LinkedList) select.f237067a).add(UPDATETIME);
        select.f237068b = LOCALID.i(java.lang.Long.valueOf(j17));
        dm.i4 i4Var = (dm.i4) select.a().o(k0Var, dm.i4.class);
        if (i4Var != null) {
            return i4Var.field_updateTime;
        }
        return 0L;
    }

    public static final java.lang.String selectUsernameByLocalId(l75.k0 k0Var, long j17) {
        dm.g4 select = select();
        ((java.util.LinkedList) select.f237067a).add(USERNAME);
        select.f237068b = LOCALID.i(java.lang.Long.valueOf(j17));
        dm.i4 i4Var = (dm.i4) select.a().o(k0Var, dm.i4.class);
        if (i4Var != null) {
            return i4Var.field_username;
        }
        return null;
    }

    public static final int selectWatermarkFlagByLocalId(l75.k0 k0Var, long j17) {
        dm.g4 select = select();
        ((java.util.LinkedList) select.f237067a).add(WATERMARKFLAG);
        select.f237068b = LOCALID.i(java.lang.Long.valueOf(j17));
        dm.i4 i4Var = (dm.i4) select.a().o(k0Var, dm.i4.class);
        if (i4Var != null) {
            return i4Var.field_watermarkFlag;
        }
        return 0;
    }

    public static final dm.h4 update() {
        return new dm.h4();
    }

    public boolean compareContent(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.i4)) {
            return false;
        }
        dm.i4 i4Var = (dm.i4) f0Var;
        return n51.f.a(java.lang.Long.valueOf(this.field_localId), java.lang.Long.valueOf(i4Var.field_localId)) && n51.f.a(java.lang.Long.valueOf(this.field_id), java.lang.Long.valueOf(i4Var.field_id)) && n51.f.a(java.lang.Long.valueOf(this.field_createTime), java.lang.Long.valueOf(i4Var.field_createTime)) && n51.f.a(this.field_username, i4Var.field_username) && n51.f.a(java.lang.Integer.valueOf(this.field_sourceFlag), java.lang.Integer.valueOf(i4Var.field_sourceFlag)) && n51.f.a(java.lang.Long.valueOf(this.field_updateTime), java.lang.Long.valueOf(i4Var.field_updateTime)) && n51.f.a(this.field_finderObject, i4Var.field_finderObject) && n51.f.a(java.lang.Integer.valueOf(this.field_localFlag), java.lang.Integer.valueOf(i4Var.field_localFlag)) && n51.f.a(this.field_postinfo, i4Var.field_postinfo) && n51.f.a(this.field_mediaExtList, i4Var.field_mediaExtList) && n51.f.a(this.field_reportObject, i4Var.field_reportObject) && n51.f.a(this.field_postExtraData, i4Var.field_postExtraData) && n51.f.a(this.field_customData, i4Var.field_customData) && n51.f.a(this.field_longVideoMediaExtList, i4Var.field_longVideoMediaExtList) && n51.f.a(this.field_halfMediaExtList, i4Var.field_halfMediaExtList) && n51.f.a(this.field_clipList, i4Var.field_clipList) && n51.f.a(java.lang.Integer.valueOf(this.field_watermarkFlag), java.lang.Integer.valueOf(i4Var.field_watermarkFlag));
    }

    @Override // l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            return;
        }
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            int hashCode = columnNames[i17].hashCode();
            if (localId_HASHCODE == hashCode) {
                try {
                    this.field_localId = cursor.getLong(i17);
                    this.__hadSetlocalId = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (id_HASHCODE == hashCode) {
                try {
                    this.field_id = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (createTime_HASHCODE == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (username_HASHCODE == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (sourceFlag_HASHCODE == hashCode) {
                try {
                    this.field_sourceFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (updateTime_HASHCODE == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (finderObject_HASHCODE == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) new com.tencent.mm.protocal.protobuf.FinderObject().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (localFlag_HASHCODE == hashCode) {
                try {
                    this.field_localFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (postinfo_HASHCODE == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.field_postinfo = (r45.qb4) new r45.qb4().parseFrom(blob2);
                    }
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (mediaExtList_HASHCODE == hashCode) {
                try {
                    byte[] blob3 = cursor.getBlob(i17);
                    if (blob3 != null && blob3.length > 0) {
                        this.field_mediaExtList = (r45.fc4) new r45.fc4().parseFrom(blob3);
                    }
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (reportObject_HASHCODE == hashCode) {
                try {
                    byte[] blob4 = cursor.getBlob(i17);
                    if (blob4 != null && blob4.length > 0) {
                        this.field_reportObject = (com.tencent.mm.protocal.protobuf.FinderFeedReportObject) new com.tencent.mm.protocal.protobuf.FinderFeedReportObject().parseFrom(blob4);
                    }
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (postExtraData_HASHCODE == hashCode) {
                try {
                    byte[] blob5 = cursor.getBlob(i17);
                    if (blob5 != null && blob5.length > 0) {
                        this.field_postExtraData = (r45.qp2) new r45.qp2().parseFrom(blob5);
                    }
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (customData_HASHCODE == hashCode) {
                try {
                    byte[] blob6 = cursor.getBlob(i17);
                    if (blob6 != null && blob6.length > 0) {
                        this.field_customData = (r45.u01) new r45.u01().parseFrom(blob6);
                    }
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (longVideoMediaExtList_HASHCODE == hashCode) {
                try {
                    byte[] blob7 = cursor.getBlob(i17);
                    if (blob7 != null && blob7.length > 0) {
                        this.field_longVideoMediaExtList = (r45.fc4) new r45.fc4().parseFrom(blob7);
                    }
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (halfMediaExtList_HASHCODE == hashCode) {
                try {
                    byte[] blob8 = cursor.getBlob(i17);
                    if (blob8 != null && blob8.length > 0) {
                        this.field_halfMediaExtList = (r45.fc4) new r45.fc4().parseFrom(blob8);
                    }
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (clipList_HASHCODE == hashCode) {
                try {
                    byte[] blob9 = cursor.getBlob(i17);
                    if (blob9 != null && blob9.length > 0) {
                        this.field_clipList = (r45.za4) new r45.za4().parseFrom(blob9);
                    }
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (watermarkFlag_HASHCODE == hashCode) {
                try {
                    this.field_watermarkFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (rowid_HASHCODE == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.__hadSetlocalId) {
            contentValues.put(COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
        }
        if (this.__hadSetid) {
            contentValues.put(COL_ID, java.lang.Long.valueOf(this.field_id));
        }
        if (this.__hadSetcreateTime) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.__hadSetusername) {
            contentValues.put(COL_USERNAME, this.field_username);
        }
        if (this.__hadSetsourceFlag) {
            contentValues.put(COL_SOURCEFLAG, java.lang.Integer.valueOf(this.field_sourceFlag));
        }
        if (this.__hadSetupdateTime) {
            contentValues.put(COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.__hadSetfinderObject) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.field_finderObject;
            if (finderObject != null) {
                try {
                    contentValues.put(COL_FINDEROBJECT, finderObject.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e(TAG_, e17.getMessage());
                }
            } else {
                contentValues.put(COL_FINDEROBJECT, (byte[]) null);
            }
        }
        if (this.__hadSetlocalFlag) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.field_localFlag));
        }
        if (this.__hadSetpostinfo) {
            r45.qb4 qb4Var = this.field_postinfo;
            if (qb4Var != null) {
                try {
                    contentValues.put(COL_POSTINFO, qb4Var.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e(TAG_, e18.getMessage());
                }
            } else {
                contentValues.put(COL_POSTINFO, (byte[]) null);
            }
        }
        if (this.__hadSetmediaExtList) {
            r45.fc4 fc4Var = this.field_mediaExtList;
            if (fc4Var != null) {
                try {
                    contentValues.put(COL_MEDIAEXTLIST, fc4Var.toByteArray());
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.e(TAG_, e19.getMessage());
                }
            } else {
                contentValues.put(COL_MEDIAEXTLIST, (byte[]) null);
            }
        }
        if (this.__hadSetreportObject) {
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.field_reportObject;
            if (finderFeedReportObject != null) {
                try {
                    contentValues.put(COL_REPORTOBJECT, finderFeedReportObject.toByteArray());
                } catch (java.io.IOException e27) {
                    com.tencent.mars.xlog.Log.e(TAG_, e27.getMessage());
                }
            } else {
                contentValues.put(COL_REPORTOBJECT, (byte[]) null);
            }
        }
        if (this.__hadSetpostExtraData) {
            r45.qp2 qp2Var = this.field_postExtraData;
            if (qp2Var != null) {
                try {
                    contentValues.put(COL_POSTEXTRADATA, qp2Var.toByteArray());
                } catch (java.io.IOException e28) {
                    com.tencent.mars.xlog.Log.e(TAG_, e28.getMessage());
                }
            } else {
                contentValues.put(COL_POSTEXTRADATA, (byte[]) null);
            }
        }
        if (this.__hadSetcustomData) {
            r45.u01 u01Var = this.field_customData;
            if (u01Var != null) {
                try {
                    contentValues.put(COL_CUSTOMDATA, u01Var.toByteArray());
                } catch (java.io.IOException e29) {
                    com.tencent.mars.xlog.Log.e(TAG_, e29.getMessage());
                }
            } else {
                contentValues.put(COL_CUSTOMDATA, (byte[]) null);
            }
        }
        if (this.__hadSetlongVideoMediaExtList) {
            r45.fc4 fc4Var2 = this.field_longVideoMediaExtList;
            if (fc4Var2 != null) {
                try {
                    contentValues.put(COL_LONGVIDEOMEDIAEXTLIST, fc4Var2.toByteArray());
                } catch (java.io.IOException e37) {
                    com.tencent.mars.xlog.Log.e(TAG_, e37.getMessage());
                }
            } else {
                contentValues.put(COL_LONGVIDEOMEDIAEXTLIST, (byte[]) null);
            }
        }
        if (this.__hadSethalfMediaExtList) {
            r45.fc4 fc4Var3 = this.field_halfMediaExtList;
            if (fc4Var3 != null) {
                try {
                    contentValues.put(COL_HALFMEDIAEXTLIST, fc4Var3.toByteArray());
                } catch (java.io.IOException e38) {
                    com.tencent.mars.xlog.Log.e(TAG_, e38.getMessage());
                }
            } else {
                contentValues.put(COL_HALFMEDIAEXTLIST, (byte[]) null);
            }
        }
        if (this.__hadSetclipList) {
            r45.za4 za4Var = this.field_clipList;
            if (za4Var != null) {
                try {
                    contentValues.put(COL_CLIPLIST, za4Var.toByteArray());
                } catch (java.io.IOException e39) {
                    com.tencent.mars.xlog.Log.e(TAG_, e39.getMessage());
                }
            } else {
                contentValues.put(COL_CLIPLIST, (byte[]) null);
            }
        }
        if (this.__hadSetwatermarkFlag) {
            contentValues.put(COL_WATERMARKFLAG, java.lang.Integer.valueOf(this.field_watermarkFlag));
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    public o75.c createDeleteEvent() {
        o75.c cVar = new o75.c(o75.b.f343584e, java.lang.String.valueOf(getPrimaryKeyValue()), TAG_);
        cVar.f343590d = this;
        return cVar;
    }

    public o75.c createInsertEvent() {
        o75.c cVar = new o75.c(o75.b.f343582c, java.lang.String.valueOf(getPrimaryKeyValue()), TAG_);
        cVar.f343590d = this;
        return cVar;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        createTable(k0Var);
    }

    public o75.c createReplaceEvent() {
        o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(getPrimaryKeyValue()), TAG_);
        cVar.f343590d = this;
        return cVar;
    }

    public o75.c createUpdateEvent() {
        o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(getPrimaryKeyValue()), TAG_);
        cVar.f343590d = this;
        return cVar;
    }

    public int deleteFromDB(l75.k0 k0Var, boolean z17) {
        return delete(this, z17).a(k0Var);
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return DB_INFO;
    }

    public java.lang.String[] getIndexCreateSQL() {
        return INDEX_CREATE;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return OBSERVER_OWNER;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return TABLE;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return TABLE.f352676a;
    }

    public long insertOrThrowToDB(l75.k0 k0Var, boolean z17) {
        return insertOrThrow(this, z17).a(k0Var);
    }

    public long insertToDB(l75.k0 k0Var, boolean z17) {
        return insert(this, z17).a(k0Var);
    }

    public boolean isExistByLocalIdInDB(l75.k0 k0Var) {
        return isExistByLocalId(this.field_localId).h(k0Var);
    }

    public final void parseBuff() {
    }

    public long replaceToDB(l75.k0 k0Var, boolean z17) {
        return replace(this, z17).a(k0Var);
    }

    public void reset() {
    }

    public int updateToDB(l75.k0 k0Var, boolean z17) {
        return update(this, z17).a(k0Var);
    }

    public static final m75.b delete(dm.i4 i4Var, boolean z17) {
        if (z17) {
            return new m75.b(i4Var, i4Var.createDeleteEvent(), OBSERVER_OWNER, TAG_);
        }
        return new m75.b(i4Var, null, null, TAG_);
    }

    public static final m75.e update(dm.i4 i4Var, boolean z17) {
        if (z17) {
            return new m75.e(i4Var, i4Var.createUpdateEvent(), OBSERVER_OWNER, TAG_);
        }
        return new m75.e(i4Var, null, null, TAG_);
    }

    public p75.l0 selectByCreateTime() {
        return selectByCreateTime(this.field_createTime);
    }

    public p75.l0 selectById() {
        return selectById(this.field_id);
    }

    public p75.l0 selectByLocalFlag() {
        return selectByLocalFlag(this.field_localFlag);
    }

    public p75.l0 selectByLocalId() {
        return selectByLocalId(this.field_localId);
    }

    public p75.l0 selectBySourceFlag() {
        return selectBySourceFlag(this.field_sourceFlag);
    }

    public p75.l0 selectByUpdateTime() {
        return selectByUpdateTime(this.field_updateTime);
    }

    public p75.l0 selectByUsername() {
        return selectByUsername(this.field_username);
    }

    public p75.l0 selectByWatermarkFlag() {
        return selectByWatermarkFlag(this.field_watermarkFlag);
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(COL_LOCALID).longValue();
            if (z17) {
                this.__hadSetlocalId = true;
            }
        }
        if (contentValues.containsKey(COL_ID)) {
            this.field_id = contentValues.getAsLong(COL_ID).longValue();
            if (z17) {
                this.__hadSetid = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.__hadSetcreateTime = true;
            }
        }
        if (contentValues.containsKey(COL_USERNAME)) {
            this.field_username = contentValues.getAsString(COL_USERNAME);
            if (z17) {
                this.__hadSetusername = true;
            }
        }
        if (contentValues.containsKey(COL_SOURCEFLAG)) {
            this.field_sourceFlag = contentValues.getAsInteger(COL_SOURCEFLAG).intValue();
            if (z17) {
                this.__hadSetsourceFlag = true;
            }
        }
        if (contentValues.containsKey(COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(COL_UPDATETIME).longValue();
            if (z17) {
                this.__hadSetupdateTime = true;
            }
        }
        if (contentValues.containsKey(COL_FINDEROBJECT)) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray(COL_FINDEROBJECT);
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) new com.tencent.mm.protocal.protobuf.FinderObject().parseFrom(asByteArray);
                    if (z17) {
                        this.__hadSetfinderObject = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e(TAG_, e17.getMessage());
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.__hadSetlocalFlag = true;
            }
        }
        if (contentValues.containsKey(COL_POSTINFO)) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray(COL_POSTINFO);
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_postinfo = (r45.qb4) new r45.qb4().parseFrom(asByteArray2);
                    if (z17) {
                        this.__hadSetpostinfo = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e(TAG_, e18.getMessage());
            }
        }
        if (contentValues.containsKey(COL_MEDIAEXTLIST)) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray(COL_MEDIAEXTLIST);
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_mediaExtList = (r45.fc4) new r45.fc4().parseFrom(asByteArray3);
                    if (z17) {
                        this.__hadSetmediaExtList = true;
                    }
                }
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.e(TAG_, e19.getMessage());
            }
        }
        if (contentValues.containsKey(COL_REPORTOBJECT)) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray(COL_REPORTOBJECT);
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_reportObject = (com.tencent.mm.protocal.protobuf.FinderFeedReportObject) new com.tencent.mm.protocal.protobuf.FinderFeedReportObject().parseFrom(asByteArray4);
                    if (z17) {
                        this.__hadSetreportObject = true;
                    }
                }
            } catch (java.io.IOException e27) {
                com.tencent.mars.xlog.Log.e(TAG_, e27.getMessage());
            }
        }
        if (contentValues.containsKey(COL_POSTEXTRADATA)) {
            try {
                byte[] asByteArray5 = contentValues.getAsByteArray(COL_POSTEXTRADATA);
                if (asByteArray5 != null && asByteArray5.length > 0) {
                    this.field_postExtraData = (r45.qp2) new r45.qp2().parseFrom(asByteArray5);
                    if (z17) {
                        this.__hadSetpostExtraData = true;
                    }
                }
            } catch (java.io.IOException e28) {
                com.tencent.mars.xlog.Log.e(TAG_, e28.getMessage());
            }
        }
        if (contentValues.containsKey(COL_CUSTOMDATA)) {
            try {
                byte[] asByteArray6 = contentValues.getAsByteArray(COL_CUSTOMDATA);
                if (asByteArray6 != null && asByteArray6.length > 0) {
                    this.field_customData = (r45.u01) new r45.u01().parseFrom(asByteArray6);
                    if (z17) {
                        this.__hadSetcustomData = true;
                    }
                }
            } catch (java.io.IOException e29) {
                com.tencent.mars.xlog.Log.e(TAG_, e29.getMessage());
            }
        }
        if (contentValues.containsKey(COL_LONGVIDEOMEDIAEXTLIST)) {
            try {
                byte[] asByteArray7 = contentValues.getAsByteArray(COL_LONGVIDEOMEDIAEXTLIST);
                if (asByteArray7 != null && asByteArray7.length > 0) {
                    this.field_longVideoMediaExtList = (r45.fc4) new r45.fc4().parseFrom(asByteArray7);
                    if (z17) {
                        this.__hadSetlongVideoMediaExtList = true;
                    }
                }
            } catch (java.io.IOException e37) {
                com.tencent.mars.xlog.Log.e(TAG_, e37.getMessage());
            }
        }
        if (contentValues.containsKey(COL_HALFMEDIAEXTLIST)) {
            try {
                byte[] asByteArray8 = contentValues.getAsByteArray(COL_HALFMEDIAEXTLIST);
                if (asByteArray8 != null && asByteArray8.length > 0) {
                    this.field_halfMediaExtList = (r45.fc4) new r45.fc4().parseFrom(asByteArray8);
                    if (z17) {
                        this.__hadSethalfMediaExtList = true;
                    }
                }
            } catch (java.io.IOException e38) {
                com.tencent.mars.xlog.Log.e(TAG_, e38.getMessage());
            }
        }
        if (contentValues.containsKey(COL_CLIPLIST)) {
            try {
                byte[] asByteArray9 = contentValues.getAsByteArray(COL_CLIPLIST);
                if (asByteArray9 != null && asByteArray9.length > 0) {
                    this.field_clipList = (r45.za4) new r45.za4().parseFrom(asByteArray9);
                    if (z17) {
                        this.__hadSetclipList = true;
                    }
                }
            } catch (java.io.IOException e39) {
                com.tencent.mars.xlog.Log.e(TAG_, e39.getMessage());
            }
        }
        if (contentValues.containsKey(COL_WATERMARKFLAG)) {
            this.field_watermarkFlag = contentValues.getAsInteger(COL_WATERMARKFLAG).intValue();
            if (z17) {
                this.__hadSetwatermarkFlag = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
