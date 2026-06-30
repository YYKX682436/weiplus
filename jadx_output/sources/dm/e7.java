package dm;

/* loaded from: classes12.dex */
public class e7 extends l75.f0 {
    public static final java.lang.String COL_EXPIRE_AT = "expire_at";
    public static final java.lang.String COL_KEY = "key";
    public static final java.lang.String COL_TYPE = "type";
    public static final java.lang.String COL_VALUE = "value";
    public static final l75.e0 DB_INFO;
    public static final p75.d EXPIRE_AT;
    public static final java.lang.String[] INDEX_CREATE;
    public static final p75.d KEY;
    public static final o75.e OBSERVER_OWNER;
    public static final p75.d ROWID;
    public static final p75.n0 TABLE;
    public static final java.lang.String TABLE_NAME = "KindaConfigCache";
    private static final java.lang.String TAG_ = "MicroMsg.SDK.BaseKindaConfigCache";
    public static final p75.d TYPE;
    public static final p75.d VALUE;
    private static final int expire_at_HASHCODE;
    private static final int key_HASHCODE;
    private static final int rowid_HASHCODE;
    private static final int type_HASHCODE;
    private static final int value_HASHCODE;
    public long field_expire_at;
    public java.lang.String field_key;
    public int field_type;
    public java.lang.String field_value;
    private boolean __hadSetkey = true;
    private boolean __hadSetvalue = true;
    private boolean __hadSettype = true;
    private boolean __hadSetexpire_at = true;

    static {
        p75.n0 n0Var = new p75.n0("KindaConfigCache");
        TABLE = n0Var;
        java.lang.String str = n0Var.f352676a;
        ROWID = new p75.d("rowid", "long", str, "");
        KEY = new p75.d("key", "string", str, "");
        VALUE = new p75.d("value", "string", str, "");
        TYPE = new p75.d("type", "int", str, "");
        EXPIRE_AT = new p75.d("expire_at", "long", str, "");
        INDEX_CREATE = new java.lang.String[0];
        key_HASHCODE = 106079;
        value_HASHCODE = 111972721;
        type_HASHCODE = 3575610;
        expire_at_HASHCODE = 250178387;
        rowid_HASHCODE = 108705909;
        DB_INFO = initAutoDBInfo(dm.e7.class);
        OBSERVER_OWNER = new o75.e();
    }

    public static final m75.a batchInsert(java.util.List<dm.e7> list, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (dm.e7 e7Var : list) {
            if (z17) {
                arrayList.add(new m75.c(e7Var, true, e7Var.createInsertEvent(), OBSERVER_OWNER, TAG_));
            } else {
                arrayList.add(new m75.c(e7Var, true, null, null, TAG_));
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
        linkedList.add("CREATE TABLE IF NOT EXISTS KindaConfigCache ( " + DB_INFO.f316956e + ");");
        for (java.lang.String str : INDEX_CREATE) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i(TAG_, "createTableSql %s", str2);
            k0Var.A("KindaConfigCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(DB_INFO, "KindaConfigCache", k0Var)) {
            com.tencent.mars.xlog.Log.i(TAG_, "updateTableSql %s", str3);
            k0Var.A("KindaConfigCache", str3);
        }
        com.tencent.mars.xlog.Log.i(TAG_, "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static final dm.a7 cvBuilder() {
        return new dm.a7();
    }

    public static final dm.b7 delete() {
        return new dm.b7();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class<?> cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = "value";
        e0Var.f316955d.put("value", "TEXT");
        e0Var.f316954c[2] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[3] = "expire_at";
        e0Var.f316955d.put("expire_at", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  value TEXT,  type INTEGER,  expire_at LONG";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public static final m75.c insert(dm.e7 e7Var, boolean z17) {
        return z17 ? new m75.c(e7Var, true, e7Var.createInsertEvent(), OBSERVER_OWNER, TAG_) : new m75.c(e7Var, true, null, null, TAG_);
    }

    public static final m75.c insertOrThrow(dm.e7 e7Var, boolean z17) {
        return z17 ? new m75.c(e7Var, false, e7Var.createInsertEvent(), OBSERVER_OWNER, TAG_) : new m75.c(e7Var, false, null, null, TAG_);
    }

    public static final p75.l0 isExistByKey(java.lang.String str) {
        p75.n0 n0Var = TABLE;
        p75.d dVar = KEY;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f352657d = dVar.j(str);
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

    public static final m75.d replace(dm.e7 e7Var, boolean z17) {
        return z17 ? new m75.d(e7Var, e7Var.createReplaceEvent(), OBSERVER_OWNER, TAG_) : new m75.d(e7Var, null, null, TAG_);
    }

    public static final dm.c7 select() {
        return new dm.c7();
    }

    public static final p75.l0 selectByExpire_at(long j17) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = EXPIRE_AT.i(java.lang.Long.valueOf(j17));
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByExpire_atList(java.util.List<java.lang.Long> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = EXPIRE_AT.k(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByKey(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = KEY.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByKeyList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = KEY.l(list);
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

    public static final p75.l0 selectByValue(java.lang.String str) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = VALUE.j(str);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectByValueList(java.util.List<java.lang.String> list) {
        p75.i0 i17 = TABLE.i();
        i17.f352657d = VALUE.l(list);
        i17.f352656c = TAG_;
        return i17.a();
    }

    public static final p75.l0 selectExistListByKey(java.util.List<java.lang.String> list) {
        p75.n0 n0Var = TABLE;
        p75.d dVar = KEY;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f352657d = dVar.l(list);
        h17.f352656c = TAG_;
        return h17.a();
    }

    public static final long selectExpire_atByKey(l75.k0 k0Var, java.lang.String str) {
        dm.c7 select = select();
        ((java.util.LinkedList) select.f236150a).add(EXPIRE_AT);
        select.f236151b = KEY.j(str);
        dm.e7 e7Var = (dm.e7) select.a().o(k0Var, dm.e7.class);
        if (e7Var != null) {
            return e7Var.field_expire_at;
        }
        return 0L;
    }

    public static final int selectTypeByKey(l75.k0 k0Var, java.lang.String str) {
        dm.c7 select = select();
        ((java.util.LinkedList) select.f236150a).add(TYPE);
        select.f236151b = KEY.j(str);
        dm.e7 e7Var = (dm.e7) select.a().o(k0Var, dm.e7.class);
        if (e7Var != null) {
            return e7Var.field_type;
        }
        return 0;
    }

    public static final java.lang.String selectValueByKey(l75.k0 k0Var, java.lang.String str) {
        dm.c7 select = select();
        ((java.util.LinkedList) select.f236150a).add(VALUE);
        select.f236151b = KEY.j(str);
        dm.e7 e7Var = (dm.e7) select.a().o(k0Var, dm.e7.class);
        if (e7Var != null) {
            return e7Var.field_value;
        }
        return null;
    }

    public static final dm.d7 update() {
        return new dm.d7();
    }

    public boolean compareContent(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.e7)) {
            return false;
        }
        dm.e7 e7Var = (dm.e7) f0Var;
        return n51.f.a(this.field_key, e7Var.field_key) && n51.f.a(this.field_value, e7Var.field_value) && n51.f.a(java.lang.Integer.valueOf(this.field_type), java.lang.Integer.valueOf(e7Var.field_type)) && n51.f.a(java.lang.Long.valueOf(this.field_expire_at), java.lang.Long.valueOf(e7Var.field_expire_at));
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
            if (key_HASHCODE == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.__hadSetkey = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (value_HASHCODE == hashCode) {
                try {
                    this.field_value = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (type_HASHCODE == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (expire_at_HASHCODE == hashCode) {
                try {
                    this.field_expire_at = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG_, th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (rowid_HASHCODE == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.__hadSetkey) {
            contentValues.put("key", this.field_key);
        }
        if (this.__hadSetvalue) {
            contentValues.put("value", this.field_value);
        }
        if (this.__hadSettype) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.__hadSetexpire_at) {
            contentValues.put("expire_at", java.lang.Long.valueOf(this.field_expire_at));
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
        return this.field_key;
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

    public boolean isExistByKeyInDB(l75.k0 k0Var) {
        return isExistByKey(this.field_key).h(k0Var);
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

    public static final m75.b delete(dm.e7 e7Var, boolean z17) {
        if (z17) {
            return new m75.b(e7Var, e7Var.createDeleteEvent(), OBSERVER_OWNER, TAG_);
        }
        return new m75.b(e7Var, null, null, TAG_);
    }

    public static final m75.e update(dm.e7 e7Var, boolean z17) {
        if (z17) {
            return new m75.e(e7Var, e7Var.createUpdateEvent(), OBSERVER_OWNER, TAG_);
        }
        return new m75.e(e7Var, null, null, TAG_);
    }

    public p75.l0 selectByExpire_at() {
        return selectByExpire_at(this.field_expire_at);
    }

    public p75.l0 selectByKey() {
        return selectByKey(this.field_key);
    }

    public p75.l0 selectByType() {
        return selectByType(this.field_type);
    }

    public p75.l0 selectByValue() {
        return selectByValue(this.field_value);
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.__hadSetkey = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z17) {
                this.__hadSetvalue = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.__hadSettype = true;
            }
        }
        if (contentValues.containsKey("expire_at")) {
            this.field_expire_at = contentValues.getAsLong("expire_at").longValue();
            if (z17) {
                this.__hadSetexpire_at = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
