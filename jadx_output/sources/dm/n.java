package dm;

/* loaded from: classes4.dex */
public class n extends l75.f0 {
    public static final p75.d ADINFO;
    public static final p75.d ADXML;
    public static final p75.d ATADINFO;
    public static final p75.d ATTRBUF;
    public static final java.lang.String COL_ADINFO = "adinfo";
    public static final java.lang.String COL_ADXML = "adxml";
    public static final java.lang.String COL_ATADINFO = "atAdinfo";
    public static final java.lang.String COL_ATTRBUF = "attrBuf";
    public static final java.lang.String COL_CONTENT = "content";
    public static final java.lang.String COL_CREATEADTIME = "createAdTime";
    public static final java.lang.String COL_CREATETIME = "createTime";
    public static final java.lang.String COL_EXPOSURECOUNT = "exposureCount";
    public static final java.lang.String COL_EXPOSURETIME = "exposureTime";
    public static final java.lang.String COL_FIRSTCONTROLTIME = "firstControlTime";
    public static final java.lang.String COL_HEAD = "head";
    public static final java.lang.String COL_LIKEFLAG = "likeFlag";
    public static final java.lang.String COL_LOCALFLAG = "localFlag";
    public static final java.lang.String COL_LOCALPRIVATE = "localPrivate";
    public static final java.lang.String COL_POSTBUF = "postBuf";
    public static final java.lang.String COL_PRAVITED = "pravited";
    public static final java.lang.String COL_RECXML = "recxml";
    public static final java.lang.String COL_REMINDINFOGROUP = "remindInfoGroup";
    public static final java.lang.String COL_SNSID = "snsId";
    public static final java.lang.String COL_SOURCETYPE = "sourceType";
    public static final java.lang.String COL_STRINGSEQ = "stringSeq";
    public static final java.lang.String COL_SUBTYPE = "subType";
    public static final java.lang.String COL_TYPE = "type";
    public static final java.lang.String COL_USERNAME = "userName";
    public static final p75.d CONTENT;
    public static final p75.d CREATEADTIME;
    public static final p75.d CREATETIME;
    public static final l75.e0 DB_INFO;
    public static final p75.d EXPOSURECOUNT;
    public static final p75.d EXPOSURETIME;
    public static final p75.d FIRSTCONTROLTIME;
    public static final p75.d HEAD;
    public static final java.lang.String[] INDEX_CREATE;
    public static final p75.d LIKEFLAG;
    public static final p75.d LOCALFLAG;
    public static final p75.d LOCALPRIVATE;
    public static final o75.e OBSERVER_OWNER;
    public static final p75.d POSTBUF;
    public static final p75.d PRAVITED;
    public static final p75.d RECXML;
    public static final p75.d REMINDINFOGROUP;
    public static final p75.d ROWID;
    public static final p75.d SNSID;
    public static final p75.d SOURCETYPE;
    public static final p75.d STRINGSEQ;
    public static final p75.d SUBTYPE;
    public static final p75.n0 TABLE;
    public static final java.lang.String TABLE_NAME = "AdSnsInfo";
    private static final java.lang.String TAG_ = "MicroMsg.SDK.BaseAdSnsInfo";
    public static final p75.d TYPE;
    public static final p75.d USERNAME;
    private static final int adinfo_HASHCODE;
    private static final int adxml_HASHCODE;
    private static final int atAdinfo_HASHCODE;
    private static final int attrBuf_HASHCODE;
    private static final int content_HASHCODE;
    private static final int createAdTime_HASHCODE;
    private static final int createTime_HASHCODE;
    private static final int exposureCount_HASHCODE;
    private static final int exposureTime_HASHCODE;
    private static final int firstControlTime_HASHCODE;
    private static final int head_HASHCODE;
    private static final int likeFlag_HASHCODE;
    private static final int localFlag_HASHCODE;
    private static final int localPrivate_HASHCODE;
    private static final int postBuf_HASHCODE;
    private static final int pravited_HASHCODE;
    private static final int recxml_HASHCODE;
    private static final int remindInfoGroup_HASHCODE;
    private static final int rowid_HASHCODE;
    private static final int snsId_HASHCODE;
    private static final int sourceType_HASHCODE;
    private static final int stringSeq_HASHCODE;
    private static final int subType_HASHCODE;
    private static final int type_HASHCODE;
    private static final int userName_HASHCODE;
    public java.lang.String field_adinfo;
    public java.lang.String field_adxml;
    public java.lang.String field_atAdinfo;
    public byte[] field_attrBuf;
    public byte[] field_content;
    public int field_createAdTime;
    public int field_createTime;
    public int field_exposureCount;
    public int field_exposureTime;
    public int field_firstControlTime;
    public int field_head;
    public int field_likeFlag;
    public int field_localFlag;
    public int field_localPrivate;
    public byte[] field_postBuf;
    public int field_pravited;
    public java.lang.String field_recxml;
    public byte[] field_remindInfoGroup;
    public long field_snsId;
    public int field_sourceType;
    public java.lang.String field_stringSeq;
    public int field_subType;
    public int field_type;
    public java.lang.String field_userName;
    private boolean __hadSetsnsId = true;
    private boolean __hadSetuserName = true;
    private boolean __hadSetlocalFlag = true;
    private boolean __hadSetcreateTime = true;
    private boolean __hadSethead = true;
    private boolean __hadSetlocalPrivate = true;
    private boolean __hadSettype = true;
    private boolean __hadSetsourceType = true;
    private boolean __hadSetlikeFlag = true;
    private boolean __hadSetpravited = true;
    private boolean __hadSetstringSeq = true;
    private boolean __hadSetcontent = true;
    private boolean __hadSetattrBuf = true;
    private boolean __hadSetpostBuf = true;
    private boolean __hadSetadinfo = true;
    private boolean __hadSetadxml = true;
    private boolean __hadSetcreateAdTime = true;
    private boolean __hadSetexposureTime = true;
    private boolean __hadSetfirstControlTime = true;
    private boolean __hadSetrecxml = true;
    private boolean __hadSetsubType = true;
    private boolean __hadSetexposureCount = true;
    private boolean __hadSetatAdinfo = true;
    private boolean __hadSetremindInfoGroup = true;

    static {
        p75.n0 n0Var = new p75.n0(TABLE_NAME);
        TABLE = n0Var;
        java.lang.String str = n0Var.f352676a;
        ROWID = new p75.d("rowid", "long", str, "");
        SNSID = new p75.d("snsId", "long", str, "");
        USERNAME = new p75.d("userName", "string", str, "");
        LOCALFLAG = new p75.d("localFlag", "int", str, "");
        CREATETIME = new p75.d("createTime", "int", str, "");
        HEAD = new p75.d("head", "int", str, "");
        LOCALPRIVATE = new p75.d("localPrivate", "int", str, "");
        TYPE = new p75.d("type", "int", str, "");
        SOURCETYPE = new p75.d("sourceType", "int", str, "");
        LIKEFLAG = new p75.d("likeFlag", "int", str, "");
        PRAVITED = new p75.d("pravited", "int", str, "");
        STRINGSEQ = new p75.d("stringSeq", "string", str, "");
        CONTENT = new p75.d("content", "byte[]", str, "");
        ATTRBUF = new p75.d("attrBuf", "byte[]", str, "");
        POSTBUF = new p75.d("postBuf", "byte[]", str, "");
        ADINFO = new p75.d(COL_ADINFO, "string", str, "");
        ADXML = new p75.d(COL_ADXML, "string", str, "");
        CREATEADTIME = new p75.d(COL_CREATEADTIME, "int", str, "");
        EXPOSURETIME = new p75.d(COL_EXPOSURETIME, "int", str, "");
        FIRSTCONTROLTIME = new p75.d(COL_FIRSTCONTROLTIME, "int", str, "");
        RECXML = new p75.d(COL_RECXML, "string", str, "");
        SUBTYPE = new p75.d("subType", "int", str, "");
        EXPOSURECOUNT = new p75.d(COL_EXPOSURECOUNT, "int", str, "");
        ATADINFO = new p75.d(COL_ATADINFO, "string", str, "");
        REMINDINFOGROUP = new p75.d(COL_REMINDINFOGROUP, "byte[]", str, "");
        INDEX_CREATE = new java.lang.String[0];
        snsId_HASHCODE = 109594803;
        userName_HASHCODE = -266666762;
        localFlag_HASHCODE = -1205623433;
        createTime_HASHCODE = 1369213417;
        head_HASHCODE = 3198432;
        localPrivate_HASHCODE = -1746354280;
        type_HASHCODE = 3575610;
        sourceType_HASHCODE = -1111431691;
        likeFlag_HASHCODE = 1102348195;
        pravited_HASHCODE = -1388287679;
        stringSeq_HASHCODE = -189292914;
        content_HASHCODE = 951530617;
        attrBuf_HASHCODE = -674882878;
        postBuf_HASHCODE = -391239245;
        adinfo_HASHCODE = -1422350511;
        adxml_HASHCODE = 92679444;
        createAdTime_HASHCODE = 1004792236;
        exposureTime_HASHCODE = -1648924556;
        firstControlTime_HASHCODE = -295142150;
        recxml_HASHCODE = -934900345;
        subType_HASHCODE = -1868521062;
        exposureCount_HASHCODE = 407433288;
        atAdinfo_HASHCODE = -918393500;
        remindInfoGroup_HASHCODE = -61213972;
        rowid_HASHCODE = 108705909;
        DB_INFO = initAutoDBInfo(dm.n.class);
        OBSERVER_OWNER = new o75.e();
    }

    public static final m75.a batchInsert(java.util.List<dm.n> list, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (dm.n nVar : list) {
            if (z17) {
                arrayList.add(new m75.c(nVar, true, nVar.createInsertEvent(), OBSERVER_OWNER, TAG_));
            } else {
                arrayList.add(new m75.c(nVar, true, null, null, TAG_));
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
        linkedList.add("CREATE TABLE IF NOT EXISTS AdSnsInfo ( " + DB_INFO.f316956e + ");");
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

    public static final dm.j cvBuilder() {
        return new dm.j();
    }

    public static final dm.k delete() {
        return new dm.k();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class<?> cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[24];
        java.lang.String[] strArr = new java.lang.String[25];
        e0Var.f316954c = strArr;
        strArr[0] = "snsId";
        e0Var.f316955d.put("snsId", "LONG");
        e0Var.f316954c[1] = "userName";
        e0Var.f316955d.put("userName", "TEXT");
        e0Var.f316954c[2] = "localFlag";
        e0Var.f316955d.put("localFlag", "INTEGER");
        e0Var.f316954c[3] = "createTime";
        e0Var.f316955d.put("createTime", "INTEGER");
        e0Var.f316954c[4] = "head";
        e0Var.f316955d.put("head", "INTEGER");
        e0Var.f316954c[5] = "localPrivate";
        e0Var.f316955d.put("localPrivate", "INTEGER");
        e0Var.f316954c[6] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[7] = "sourceType";
        e0Var.f316955d.put("sourceType", "INTEGER");
        e0Var.f316954c[8] = "likeFlag";
        e0Var.f316955d.put("likeFlag", "INTEGER");
        e0Var.f316954c[9] = "pravited";
        e0Var.f316955d.put("pravited", "INTEGER");
        e0Var.f316954c[10] = "stringSeq";
        e0Var.f316955d.put("stringSeq", "TEXT");
        e0Var.f316954c[11] = "content";
        e0Var.f316955d.put("content", "BLOB");
        e0Var.f316954c[12] = "attrBuf";
        e0Var.f316955d.put("attrBuf", "BLOB");
        e0Var.f316954c[13] = "postBuf";
        e0Var.f316955d.put("postBuf", "BLOB");
        e0Var.f316954c[14] = COL_ADINFO;
        e0Var.f316955d.put(COL_ADINFO, "TEXT");
        e0Var.f316954c[15] = COL_ADXML;
        e0Var.f316955d.put(COL_ADXML, "TEXT");
        e0Var.f316954c[16] = COL_CREATEADTIME;
        e0Var.f316955d.put(COL_CREATEADTIME, "INTEGER");
        e0Var.f316954c[17] = COL_EXPOSURETIME;
        e0Var.f316955d.put(COL_EXPOSURETIME, "INTEGER");
        e0Var.f316954c[18] = COL_FIRSTCONTROLTIME;
        e0Var.f316955d.put(COL_FIRSTCONTROLTIME, "INTEGER");
        e0Var.f316954c[19] = COL_RECXML;
        e0Var.f316955d.put(COL_RECXML, "TEXT");
        e0Var.f316954c[20] = "subType";
        e0Var.f316955d.put("subType", "INTEGER");
        e0Var.f316954c[21] = COL_EXPOSURECOUNT;
        e0Var.f316955d.put(COL_EXPOSURECOUNT, "INTEGER");
        e0Var.f316954c[22] = COL_ATADINFO;
        e0Var.f316955d.put(COL_ATADINFO, "TEXT");
        e0Var.f316954c[23] = COL_REMINDINFOGROUP;
        e0Var.f316955d.put(COL_REMINDINFOGROUP, "BLOB");
        e0Var.f316954c[24] = "rowid";
        e0Var.f316956e = " snsId LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  head INTEGER,  localPrivate INTEGER,  type INTEGER,  sourceType INTEGER,  likeFlag INTEGER,  pravited INTEGER,  stringSeq TEXT,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  adinfo TEXT,  adxml TEXT,  createAdTime INTEGER,  exposureTime INTEGER,  firstControlTime INTEGER,  recxml TEXT,  subType INTEGER,  exposureCount INTEGER,  atAdinfo TEXT,  remindInfoGroup BLOB";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public static final m75.c insert(dm.n nVar, boolean z17) {
        return z17 ? new m75.c(nVar, true, nVar.createInsertEvent(), OBSERVER_OWNER, TAG_) : new m75.c(nVar, true, null, null, TAG_);
    }

    public static final m75.c insertOrThrow(dm.n nVar, boolean z17) {
        return z17 ? new m75.c(nVar, false, nVar.createInsertEvent(), OBSERVER_OWNER, TAG_) : new m75.c(nVar, false, null, null, TAG_);
    }

    public static final void observe(androidx.lifecycle.y yVar, o75.a aVar) {
        OBSERVER_OWNER.observe(yVar, aVar);
    }

    public static final void removeObserve(o75.a aVar) {
        OBSERVER_OWNER.removeObserver(aVar);
    }

    public static final m75.d replace(dm.n nVar, boolean z17) {
        return z17 ? new m75.d(nVar, nVar.createReplaceEvent(), OBSERVER_OWNER, TAG_) : new m75.d(nVar, null, null, TAG_);
    }

    public static final dm.l select() {
        return new dm.l();
    }

    public static final p75.l0 selectByAdinfo(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = ADINFO.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByAdinfoList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = ADINFO.l(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByAdxml(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = ADXML.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByAdxmlList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = ADXML.l(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByAtAdinfo(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = ATADINFO.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByAtAdinfoList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = ATADINFO.l(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByCreateAdTime(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = CREATEADTIME.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByCreateAdTimeList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = CREATEADTIME.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByCreateTime(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = CREATETIME.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByCreateTimeList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = CREATETIME.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByExposureCount(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = EXPOSURECOUNT.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByExposureCountList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = EXPOSURECOUNT.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByExposureTime(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = EXPOSURETIME.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByExposureTimeList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = EXPOSURETIME.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByFirstControlTime(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = FIRSTCONTROLTIME.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByFirstControlTimeList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = FIRSTCONTROLTIME.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByHead(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = HEAD.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByHeadList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = HEAD.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByLikeFlag(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = LIKEFLAG.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByLikeFlagList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = LIKEFLAG.k(list);
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

    public static final p75.l0 selectByLocalPrivate(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = LOCALPRIVATE.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByLocalPrivateList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = LOCALPRIVATE.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByPravited(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = PRAVITED.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByPravitedList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = PRAVITED.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByRecxml(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = RECXML.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByRecxmlList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = RECXML.l(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectBySnsId(long j17) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = SNSID.i(java.lang.Long.valueOf(j17));
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectBySnsIdList(java.util.List<java.lang.Long> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = SNSID.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectBySourceType(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = SOURCETYPE.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectBySourceTypeList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = SOURCETYPE.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByStringSeq(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = STRINGSEQ.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByStringSeqList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = STRINGSEQ.l(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectBySubType(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = SUBTYPE.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectBySubTypeList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = SUBTYPE.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByType(int i17) {
        p75.i0 i18 = TABLE.i();
        i18.f352657d = TYPE.i(java.lang.Integer.valueOf(i17));
        i18.f352656c = TAG_;
        return i18.a();
    }

    public static final p75.l0 selectByTypeList(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = TYPE.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByUserName(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = USERNAME.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByUserNameList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = USERNAME.l(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final dm.m update() {
        return new dm.m();
    }

    public boolean compareContent(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.n)) {
            return false;
        }
        dm.n nVar = (dm.n) f0Var;
        return n51.f.a(java.lang.Long.valueOf(this.field_snsId), java.lang.Long.valueOf(nVar.field_snsId)) && n51.f.a(this.field_userName, nVar.field_userName) && n51.f.a(java.lang.Integer.valueOf(this.field_localFlag), java.lang.Integer.valueOf(nVar.field_localFlag)) && n51.f.a(java.lang.Integer.valueOf(this.field_createTime), java.lang.Integer.valueOf(nVar.field_createTime)) && n51.f.a(java.lang.Integer.valueOf(this.field_head), java.lang.Integer.valueOf(nVar.field_head)) && n51.f.a(java.lang.Integer.valueOf(this.field_localPrivate), java.lang.Integer.valueOf(nVar.field_localPrivate)) && n51.f.a(java.lang.Integer.valueOf(this.field_type), java.lang.Integer.valueOf(nVar.field_type)) && n51.f.a(java.lang.Integer.valueOf(this.field_sourceType), java.lang.Integer.valueOf(nVar.field_sourceType)) && n51.f.a(java.lang.Integer.valueOf(this.field_likeFlag), java.lang.Integer.valueOf(nVar.field_likeFlag)) && n51.f.a(java.lang.Integer.valueOf(this.field_pravited), java.lang.Integer.valueOf(nVar.field_pravited)) && n51.f.a(this.field_stringSeq, nVar.field_stringSeq) && n51.f.a(this.field_content, nVar.field_content) && n51.f.a(this.field_attrBuf, nVar.field_attrBuf) && n51.f.a(this.field_postBuf, nVar.field_postBuf) && n51.f.a(this.field_adinfo, nVar.field_adinfo) && n51.f.a(this.field_adxml, nVar.field_adxml) && n51.f.a(java.lang.Integer.valueOf(this.field_createAdTime), java.lang.Integer.valueOf(nVar.field_createAdTime)) && n51.f.a(java.lang.Integer.valueOf(this.field_exposureTime), java.lang.Integer.valueOf(nVar.field_exposureTime)) && n51.f.a(java.lang.Integer.valueOf(this.field_firstControlTime), java.lang.Integer.valueOf(nVar.field_firstControlTime)) && n51.f.a(this.field_recxml, nVar.field_recxml) && n51.f.a(java.lang.Integer.valueOf(this.field_subType), java.lang.Integer.valueOf(nVar.field_subType)) && n51.f.a(java.lang.Integer.valueOf(this.field_exposureCount), java.lang.Integer.valueOf(nVar.field_exposureCount)) && n51.f.a(this.field_atAdinfo, nVar.field_atAdinfo) && n51.f.a(this.field_remindInfoGroup, nVar.field_remindInfoGroup);
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
            if (snsId_HASHCODE == hashCode) {
                try {
                    this.field_snsId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (userName_HASHCODE == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (localFlag_HASHCODE == hashCode) {
                try {
                    this.field_localFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (createTime_HASHCODE == hashCode) {
                try {
                    this.field_createTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (head_HASHCODE == hashCode) {
                try {
                    this.field_head = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (localPrivate_HASHCODE == hashCode) {
                try {
                    this.field_localPrivate = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (type_HASHCODE == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (sourceType_HASHCODE == hashCode) {
                try {
                    this.field_sourceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (likeFlag_HASHCODE == hashCode) {
                try {
                    this.field_likeFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (pravited_HASHCODE == hashCode) {
                try {
                    this.field_pravited = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (stringSeq_HASHCODE == hashCode) {
                try {
                    this.field_stringSeq = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (content_HASHCODE == hashCode) {
                try {
                    this.field_content = cursor.getBlob(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (attrBuf_HASHCODE == hashCode) {
                try {
                    this.field_attrBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (postBuf_HASHCODE == hashCode) {
                try {
                    this.field_postBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (adinfo_HASHCODE == hashCode) {
                try {
                    this.field_adinfo = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (adxml_HASHCODE == hashCode) {
                try {
                    this.field_adxml = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (createAdTime_HASHCODE == hashCode) {
                try {
                    this.field_createAdTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (exposureTime_HASHCODE == hashCode) {
                try {
                    this.field_exposureTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (firstControlTime_HASHCODE == hashCode) {
                try {
                    this.field_firstControlTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (recxml_HASHCODE == hashCode) {
                try {
                    this.field_recxml = cursor.getString(i17);
                } catch (java.lang.Throwable th25) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th25, "convertFrom %s", columnNames[i17]);
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (subType_HASHCODE == hashCode) {
                try {
                    this.field_subType = cursor.getInt(i17);
                } catch (java.lang.Throwable th26) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th26, "convertFrom %s", columnNames[i17]);
                    java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (exposureCount_HASHCODE == hashCode) {
                try {
                    this.field_exposureCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th27, "convertFrom %s", columnNames[i17]);
                    java.lang.String str22 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (atAdinfo_HASHCODE == hashCode) {
                try {
                    this.field_atAdinfo = cursor.getString(i17);
                } catch (java.lang.Throwable th28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th28, "convertFrom %s", columnNames[i17]);
                    java.lang.String str23 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (remindInfoGroup_HASHCODE == hashCode) {
                try {
                    this.field_remindInfoGroup = cursor.getBlob(i17);
                } catch (java.lang.Throwable th29) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th29, "convertFrom %s", columnNames[i17]);
                    java.lang.String str24 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (rowid_HASHCODE == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.__hadSetsnsId) {
            contentValues.put("snsId", java.lang.Long.valueOf(this.field_snsId));
        }
        if (this.__hadSetuserName) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.__hadSetlocalFlag) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.field_localFlag));
        }
        if (this.__hadSetcreateTime) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.field_createTime));
        }
        if (this.__hadSethead) {
            contentValues.put("head", java.lang.Integer.valueOf(this.field_head));
        }
        if (this.__hadSetlocalPrivate) {
            contentValues.put("localPrivate", java.lang.Integer.valueOf(this.field_localPrivate));
        }
        if (this.__hadSettype) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.__hadSetsourceType) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.field_sourceType));
        }
        if (this.__hadSetlikeFlag) {
            contentValues.put("likeFlag", java.lang.Integer.valueOf(this.field_likeFlag));
        }
        if (this.__hadSetpravited) {
            contentValues.put("pravited", java.lang.Integer.valueOf(this.field_pravited));
        }
        if (this.__hadSetstringSeq) {
            contentValues.put("stringSeq", this.field_stringSeq);
        }
        if (this.__hadSetcontent) {
            contentValues.put("content", this.field_content);
        }
        if (this.__hadSetattrBuf) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.__hadSetpostBuf) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.__hadSetadinfo) {
            contentValues.put(COL_ADINFO, this.field_adinfo);
        }
        if (this.__hadSetadxml) {
            contentValues.put(COL_ADXML, this.field_adxml);
        }
        if (this.__hadSetcreateAdTime) {
            contentValues.put(COL_CREATEADTIME, java.lang.Integer.valueOf(this.field_createAdTime));
        }
        if (this.__hadSetexposureTime) {
            contentValues.put(COL_EXPOSURETIME, java.lang.Integer.valueOf(this.field_exposureTime));
        }
        if (this.__hadSetfirstControlTime) {
            contentValues.put(COL_FIRSTCONTROLTIME, java.lang.Integer.valueOf(this.field_firstControlTime));
        }
        if (this.__hadSetrecxml) {
            contentValues.put(COL_RECXML, this.field_recxml);
        }
        if (this.__hadSetsubType) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.field_subType));
        }
        if (this.__hadSetexposureCount) {
            contentValues.put(COL_EXPOSURECOUNT, java.lang.Integer.valueOf(this.field_exposureCount));
        }
        if (this.__hadSetatAdinfo) {
            contentValues.put(COL_ATADINFO, this.field_atAdinfo);
        }
        if (this.__hadSetremindInfoGroup) {
            contentValues.put(COL_REMINDINFOGROUP, this.field_remindInfoGroup);
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
        return java.lang.Long.valueOf(this.systemRowid);
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

    public static final m75.b delete(dm.n nVar, boolean z17) {
        if (z17) {
            return new m75.b(nVar, nVar.createDeleteEvent(), OBSERVER_OWNER, TAG_);
        }
        return new m75.b(nVar, null, null, TAG_);
    }

    public static final m75.e update(dm.n nVar, boolean z17) {
        if (z17) {
            return new m75.e(nVar, nVar.createUpdateEvent(), OBSERVER_OWNER, TAG_);
        }
        return new m75.e(nVar, null, null, TAG_);
    }

    public p75.l0 selectByAdinfo() {
        return selectByAdinfo(this.field_adinfo);
    }

    public p75.l0 selectByAdxml() {
        return selectByAdxml(this.field_adxml);
    }

    public p75.l0 selectByAtAdinfo() {
        return selectByAtAdinfo(this.field_atAdinfo);
    }

    public p75.l0 selectByCreateAdTime() {
        return selectByCreateAdTime(this.field_createAdTime);
    }

    public p75.l0 selectByCreateTime() {
        return selectByCreateTime(this.field_createTime);
    }

    public p75.l0 selectByExposureCount() {
        return selectByExposureCount(this.field_exposureCount);
    }

    public p75.l0 selectByExposureTime() {
        return selectByExposureTime(this.field_exposureTime);
    }

    public p75.l0 selectByFirstControlTime() {
        return selectByFirstControlTime(this.field_firstControlTime);
    }

    public p75.l0 selectByHead() {
        return selectByHead(this.field_head);
    }

    public p75.l0 selectByLikeFlag() {
        return selectByLikeFlag(this.field_likeFlag);
    }

    public p75.l0 selectByLocalFlag() {
        return selectByLocalFlag(this.field_localFlag);
    }

    public p75.l0 selectByLocalPrivate() {
        return selectByLocalPrivate(this.field_localPrivate);
    }

    public p75.l0 selectByPravited() {
        return selectByPravited(this.field_pravited);
    }

    public p75.l0 selectByRecxml() {
        return selectByRecxml(this.field_recxml);
    }

    public p75.l0 selectBySnsId() {
        return selectBySnsId(this.field_snsId);
    }

    public p75.l0 selectBySourceType() {
        return selectBySourceType(this.field_sourceType);
    }

    public p75.l0 selectByStringSeq() {
        return selectByStringSeq(this.field_stringSeq);
    }

    public p75.l0 selectBySubType() {
        return selectBySubType(this.field_subType);
    }

    public p75.l0 selectByType() {
        return selectByType(this.field_type);
    }

    public p75.l0 selectByUserName() {
        return selectByUserName(this.field_userName);
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsId")) {
            this.field_snsId = contentValues.getAsLong("snsId").longValue();
            if (z17) {
                this.__hadSetsnsId = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.__hadSetuserName = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.__hadSetlocalFlag = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.__hadSetcreateTime = true;
            }
        }
        if (contentValues.containsKey("head")) {
            this.field_head = contentValues.getAsInteger("head").intValue();
            if (z17) {
                this.__hadSethead = true;
            }
        }
        if (contentValues.containsKey("localPrivate")) {
            this.field_localPrivate = contentValues.getAsInteger("localPrivate").intValue();
            if (z17) {
                this.__hadSetlocalPrivate = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.__hadSettype = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.__hadSetsourceType = true;
            }
        }
        if (contentValues.containsKey("likeFlag")) {
            this.field_likeFlag = contentValues.getAsInteger("likeFlag").intValue();
            if (z17) {
                this.__hadSetlikeFlag = true;
            }
        }
        if (contentValues.containsKey("pravited")) {
            this.field_pravited = contentValues.getAsInteger("pravited").intValue();
            if (z17) {
                this.__hadSetpravited = true;
            }
        }
        if (contentValues.containsKey("stringSeq")) {
            this.field_stringSeq = contentValues.getAsString("stringSeq");
            if (z17) {
                this.__hadSetstringSeq = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z17) {
                this.__hadSetcontent = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
            if (z17) {
                this.__hadSetattrBuf = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.field_postBuf = contentValues.getAsByteArray("postBuf");
            if (z17) {
                this.__hadSetpostBuf = true;
            }
        }
        if (contentValues.containsKey(COL_ADINFO)) {
            this.field_adinfo = contentValues.getAsString(COL_ADINFO);
            if (z17) {
                this.__hadSetadinfo = true;
            }
        }
        if (contentValues.containsKey(COL_ADXML)) {
            this.field_adxml = contentValues.getAsString(COL_ADXML);
            if (z17) {
                this.__hadSetadxml = true;
            }
        }
        if (contentValues.containsKey(COL_CREATEADTIME)) {
            this.field_createAdTime = contentValues.getAsInteger(COL_CREATEADTIME).intValue();
            if (z17) {
                this.__hadSetcreateAdTime = true;
            }
        }
        if (contentValues.containsKey(COL_EXPOSURETIME)) {
            this.field_exposureTime = contentValues.getAsInteger(COL_EXPOSURETIME).intValue();
            if (z17) {
                this.__hadSetexposureTime = true;
            }
        }
        if (contentValues.containsKey(COL_FIRSTCONTROLTIME)) {
            this.field_firstControlTime = contentValues.getAsInteger(COL_FIRSTCONTROLTIME).intValue();
            if (z17) {
                this.__hadSetfirstControlTime = true;
            }
        }
        if (contentValues.containsKey(COL_RECXML)) {
            this.field_recxml = contentValues.getAsString(COL_RECXML);
            if (z17) {
                this.__hadSetrecxml = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.__hadSetsubType = true;
            }
        }
        if (contentValues.containsKey(COL_EXPOSURECOUNT)) {
            this.field_exposureCount = contentValues.getAsInteger(COL_EXPOSURECOUNT).intValue();
            if (z17) {
                this.__hadSetexposureCount = true;
            }
        }
        if (contentValues.containsKey(COL_ATADINFO)) {
            this.field_atAdinfo = contentValues.getAsString(COL_ATADINFO);
            if (z17) {
                this.__hadSetatAdinfo = true;
            }
        }
        if (contentValues.containsKey(COL_REMINDINFOGROUP)) {
            this.field_remindInfoGroup = contentValues.getAsByteArray(COL_REMINDINFOGROUP);
            if (z17) {
                this.__hadSetremindInfoGroup = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
