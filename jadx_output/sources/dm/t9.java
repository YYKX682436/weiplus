package dm;

/* loaded from: classes9.dex */
public class t9 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f240158r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f240159s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f240160t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f240161u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240162v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240163w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240164x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240165y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240166z;
    public r45.bq0 field_dataProto;
    public java.lang.String field_desc;
    public java.lang.String field_favFrom;
    public int field_localId;
    public long field_msgId;
    public long field_oriMsgId;
    public java.lang.String field_oriMsgTalker;
    public int field_status;
    public java.lang.String field_title;
    public java.lang.String field_toUser;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240167d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240168e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240169f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240170g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240171h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240172i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240173m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240174n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240175o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240176p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240177q = true;

    static {
        p75.n0 n0Var = new p75.n0("RecordMessageInfo");
        f240158r = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240159s = new p75.d("msgId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240160t = new p75.d("type", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240161u = new java.lang.String[0];
        f240162v = 338409958;
        f240163w = 104191100;
        f240164x = 1355322678;
        f240165y = -868828954;
        f240166z = 110371416;
        A = 3079825;
        B = -377281442;
        C = 3575610;
        D = -892481550;
        E = -1075703451;
        F = -163788556;
        G = 108705909;
        H = initAutoDBInfo(dm.t9.class);
        I = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "INTEGER PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_LOCALID;
        e0Var.f316954c[1] = "msgId";
        e0Var.f316955d.put("msgId", "LONG default '-1' ");
        e0Var.f316954c[2] = "oriMsgId";
        e0Var.f316955d.put("oriMsgId", "LONG default '-1' ");
        e0Var.f316954c[3] = "toUser";
        e0Var.f316955d.put("toUser", "TEXT default '' ");
        e0Var.f316954c[4] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[5] = "desc";
        e0Var.f316955d.put("desc", "TEXT");
        e0Var.f316954c[6] = "dataProto";
        e0Var.f316955d.put("dataProto", "BLOB");
        e0Var.f316954c[7] = "type";
        e0Var.f316955d.put("type", "INTEGER default '0' ");
        e0Var.f316954c[8] = "status";
        e0Var.f316955d.put("status", "INTEGER default '0' ");
        e0Var.f316954c[9] = "favFrom";
        e0Var.f316955d.put("favFrom", "TEXT");
        e0Var.f316954c[10] = "oriMsgTalker";
        e0Var.f316955d.put("oriMsgTalker", "TEXT default '' ");
        e0Var.f316954c[11] = "rowid";
        e0Var.f316956e = " localId INTEGER PRIMARY KEY ,  msgId LONG default '-1' ,  oriMsgId LONG default '-1' ,  toUser TEXT default '' ,  title TEXT,  desc TEXT,  dataProto BLOB,  type INTEGER default '0' ,  status INTEGER default '0' ,  favFrom TEXT,  oriMsgTalker TEXT default '' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
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
            if (f240162v == hashCode) {
                try {
                    this.field_localId = cursor.getInt(i17);
                    this.f240167d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240163w == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240164x == hashCode) {
                try {
                    this.field_oriMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240165y == hashCode) {
                try {
                    this.field_toUser = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240166z == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_desc = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_dataProto = (r45.bq0) new r45.bq0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_favFrom = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_oriMsgTalker = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240167d) {
            contentValues.put(dm.i4.COL_LOCALID, java.lang.Integer.valueOf(this.field_localId));
        }
        if (this.f240168e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f240169f) {
            contentValues.put("oriMsgId", java.lang.Long.valueOf(this.field_oriMsgId));
        }
        if (this.field_toUser == null) {
            this.field_toUser = "";
        }
        if (this.f240170g) {
            contentValues.put("toUser", this.field_toUser);
        }
        if (this.f240171h) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f240172i) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f240173m) {
            r45.bq0 bq0Var = this.field_dataProto;
            if (bq0Var != null) {
                try {
                    contentValues.put("dataProto", bq0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseRecordMessageInfo", e17.getMessage());
                }
            } else {
                contentValues.put("dataProto", (byte[]) null);
            }
        }
        if (this.f240174n) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f240175o) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f240176p) {
            contentValues.put("favFrom", this.field_favFrom);
        }
        if (this.field_oriMsgTalker == null) {
            this.field_oriMsgTalker = "";
        }
        if (this.f240177q) {
            contentValues.put("oriMsgTalker", this.field_oriMsgTalker);
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseRecordMessageInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RecordMessageInfo ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240161u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRecordMessageInfo", "createTableSql %s", str2);
            k0Var.A("RecordMessageInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "RecordMessageInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRecordMessageInfo", "updateTableSql %s", str3);
            k0Var.A("RecordMessageInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRecordMessageInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return H;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return I;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_localId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240158r;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240158r.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsInteger(dm.i4.COL_LOCALID).intValue();
            if (z17) {
                this.f240167d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f240168e = true;
            }
        }
        if (contentValues.containsKey("oriMsgId")) {
            this.field_oriMsgId = contentValues.getAsLong("oriMsgId").longValue();
            if (z17) {
                this.f240169f = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.field_toUser = contentValues.getAsString("toUser");
            if (z17) {
                this.f240170g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f240171h = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z17) {
                this.f240172i = true;
            }
        }
        if (contentValues.containsKey("dataProto")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("dataProto");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_dataProto = (r45.bq0) new r45.bq0().parseFrom(asByteArray);
                    if (z17) {
                        this.f240173m = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseRecordMessageInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f240174n = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f240175o = true;
            }
        }
        if (contentValues.containsKey("favFrom")) {
            this.field_favFrom = contentValues.getAsString("favFrom");
            if (z17) {
                this.f240176p = true;
            }
        }
        if (contentValues.containsKey("oriMsgTalker")) {
            this.field_oriMsgTalker = contentValues.getAsString("oriMsgTalker");
            if (z17) {
                this.f240177q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
