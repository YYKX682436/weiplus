package dm;

/* loaded from: classes8.dex */
public class kb extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f238115h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f238116i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f238117m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238118n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238119o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238120p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238121q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238122r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f238123s;

    /* renamed from: t, reason: collision with root package name */
    public static final o75.e f238124t;
    private java.lang.String field_chatRoomName;
    private int field_id;
    private boolean field_isCancel;
    private r45.dn6 field_topMsgInfoItem;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238125d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238126e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238127f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238128g = false;

    static {
        p75.n0 n0Var = new p75.n0("TopMsgInfoRecord");
        f238115h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238116i = new p75.d("chatRoomName", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238117m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TopMsgInfoRecord_chatRoomName_index ON TopMsgInfoRecord(chatRoomName)", "CREATE INDEX IF NOT EXISTS TopMsgInfoRecord_id_index ON TopMsgInfoRecord(id)"};
        f238118n = 787786110;
        f238119o = 3355;
        f238120p = -693690300;
        f238121q = 1556641517;
        f238122r = 108705909;
        f238123s = initAutoDBInfo(dm.kb.class);
        f238124t = new o75.e();
    }

    public static void createTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TopMsgInfoRecord ( ");
        l75.e0 e0Var = f238123s;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238117m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTableSql %s", str2);
            k0Var.A("TopMsgInfoRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TopMsgInfoRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTopMsgInfoRecord", "updateTableSql %s", str3);
            k0Var.A("TopMsgInfoRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "chatRoomName";
        e0Var.f316955d.put("chatRoomName", "TEXT");
        e0Var.f316954c[1] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "INTEGER");
        e0Var.f316954c[2] = "isCancel";
        e0Var.f316955d.put("isCancel", "INTEGER default 'false' ");
        e0Var.f316954c[3] = "topMsgInfoItem";
        e0Var.f316955d.put("topMsgInfoItem", "BLOB");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " chatRoomName TEXT,  id INTEGER,  isCancel INTEGER default 'false' ,  topMsgInfoItem BLOB";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public void A0(boolean z17) {
        this.field_isCancel = z17;
        this.f238127f = true;
    }

    public final void D0(r45.dn6 dn6Var) {
        this.field_topMsgInfoItem = dn6Var;
        this.f238128g = true;
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
            if (f238118n == hashCode) {
                try {
                    this.field_chatRoomName = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTopMsgInfoRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238119o == hashCode) {
                try {
                    this.field_id = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTopMsgInfoRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238120p == hashCode) {
                try {
                    this.field_isCancel = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTopMsgInfoRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238121q == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_topMsgInfoItem = (r45.dn6) new r45.dn6().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTopMsgInfoRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238122r == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238125d) {
            contentValues.put("chatRoomName", this.field_chatRoomName);
        }
        if (this.f238126e) {
            contentValues.put(dm.i4.COL_ID, java.lang.Integer.valueOf(this.field_id));
        }
        if (this.f238127f) {
            if (this.field_isCancel) {
                contentValues.put("isCancel", (java.lang.Integer) 1);
            } else {
                contentValues.put("isCancel", (java.lang.Integer) 0);
            }
        }
        if (this.f238128g) {
            r45.dn6 dn6Var = this.field_topMsgInfoItem;
            if (dn6Var != null) {
                try {
                    contentValues.put("topMsgInfoItem", dn6Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTopMsgInfoRecord", e17.getMessage());
                }
            } else {
                contentValues.put("topMsgInfoItem", (byte[]) null);
            }
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        createTable(k0Var);
    }

    public int deleteFromDB(l75.k0 k0Var, boolean z17) {
        m75.b bVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f343584e, java.lang.String.valueOf(getPrimaryKeyValue()), "MicroMsg.SDK.BaseTopMsgInfoRecord");
            cVar.f343590d = this;
            bVar = new m75.b(this, cVar, f238124t, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        } else {
            bVar = new m75.b(this, null, null, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        }
        return bVar.a(k0Var);
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238123s;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238124t;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238115h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238115h.f352676a;
    }

    public java.lang.String t0() {
        return this.field_chatRoomName;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "chatRoomName", this.field_chatRoomName);
            n51.f.b(jSONObject, dm.i4.COL_ID, java.lang.Integer.valueOf(this.field_id));
            n51.f.b(jSONObject, "isCancel", java.lang.Boolean.valueOf(this.field_isCancel));
            n51.f.b(jSONObject, "topMsgInfoItem", this.field_topMsgInfoItem);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public int u0() {
        return this.field_id;
    }

    public int updateToDB(l75.k0 k0Var, boolean z17) {
        m75.e eVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(getPrimaryKeyValue()), "MicroMsg.SDK.BaseTopMsgInfoRecord");
            cVar.f343590d = this;
            eVar = new m75.e(this, cVar, f238124t, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        } else {
            eVar = new m75.e(this, null, null, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        }
        return eVar.a(k0Var);
    }

    public boolean v0() {
        return this.field_isCancel;
    }

    public final r45.dn6 w0() {
        return this.field_topMsgInfoItem;
    }

    public void y0(java.lang.String str) {
        this.field_chatRoomName = str;
        this.f238125d = true;
    }

    public void z0(int i17) {
        this.field_id = i17;
        this.f238126e = true;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chatRoomName")) {
            this.field_chatRoomName = contentValues.getAsString("chatRoomName");
            if (z17) {
                this.f238125d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsInteger(dm.i4.COL_ID).intValue();
            if (z17) {
                this.f238126e = true;
            }
        }
        if (contentValues.containsKey("isCancel")) {
            this.field_isCancel = contentValues.getAsInteger("isCancel").intValue() != 0;
            if (z17) {
                this.f238127f = true;
            }
        }
        if (contentValues.containsKey("topMsgInfoItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("topMsgInfoItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_topMsgInfoItem = (r45.dn6) new r45.dn6().parseFrom(asByteArray);
                    if (z17) {
                        this.f238128g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTopMsgInfoRecord", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
