package dm;

/* loaded from: classes9.dex */
public class da extends l75.f0 {
    public static final l75.e0 A;
    public static final o75.e B;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f236423n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f236424o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f236425p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f236426q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f236427r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236428s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236429t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236430u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236431v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236432w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236433x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236434y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236435z;
    public java.lang.String field_clusterNote;
    public int field_foldCount;
    public long field_groupId;
    public long field_msgId;
    public int field_showStatus;
    public java.lang.String field_title;
    public java.lang.String field_weappMsgId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236436d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236437e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236438f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236439g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236440h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236441i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236442m = true;

    static {
        p75.n0 n0Var = new p75.n0("ServiceNotifyAggregationMsg");
        f236423n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236424o = new p75.d("msgId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236425p = new p75.d("groupId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236426q = new p75.d("showStatus", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236427r = new java.lang.String[0];
        f236428s = 104191100;
        f236429t = 496020878;
        f236430u = 293428218;
        f236431v = 110371416;
        f236432w = 782607695;
        f236433x = 1371600809;
        f236434y = -1141724916;
        f236435z = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        ((java.util.HashMap) e0Var.f316955d).put("msgId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[1] = "foldCount";
        ((java.util.HashMap) e0Var.f316955d).put("foldCount", "INTEGER");
        e0Var.f316954c[2] = "groupId";
        ((java.util.HashMap) e0Var.f316955d).put("groupId", "LONG");
        e0Var.f316954c[3] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        ((java.util.HashMap) e0Var.f316955d).put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[4] = "showStatus";
        ((java.util.HashMap) e0Var.f316955d).put("showStatus", "INTEGER");
        e0Var.f316954c[5] = "weappMsgId";
        ((java.util.HashMap) e0Var.f316955d).put("weappMsgId", "TEXT");
        e0Var.f316954c[6] = "clusterNote";
        ((java.util.HashMap) e0Var.f316955d).put("clusterNote", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " msgId LONG PRIMARY KEY ,  foldCount INTEGER,  groupId LONG,  title TEXT,  showStatus INTEGER,  weappMsgId TEXT,  clusterNote TEXT";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        A = e0Var;
        B = new o75.e();
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
            if (f236428s == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                    this.f236436d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236429t == hashCode) {
                try {
                    this.field_foldCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236430u == hashCode) {
                try {
                    this.field_groupId = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236431v == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236432w == hashCode) {
                try {
                    this.field_showStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236433x == hashCode) {
                try {
                    this.field_weappMsgId = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236434y == hashCode) {
                try {
                    this.field_clusterNote = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236435z == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236436d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f236437e) {
            contentValues.put("foldCount", java.lang.Integer.valueOf(this.field_foldCount));
        }
        if (this.f236438f) {
            contentValues.put("groupId", java.lang.Long.valueOf(this.field_groupId));
        }
        if (this.f236439g) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f236440h) {
            contentValues.put("showStatus", java.lang.Integer.valueOf(this.field_showStatus));
        }
        if (this.f236441i) {
            contentValues.put("weappMsgId", this.field_weappMsgId);
        }
        if (this.f236442m) {
            contentValues.put("clusterNote", this.field_clusterNote);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ServiceNotifyAggregationMsg ( ");
        l75.e0 e0Var = A;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236427r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", "createTableSql %s", str2);
            k0Var.A("ServiceNotifyAggregationMsg", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ServiceNotifyAggregationMsg", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", "updateTableSql %s", str3);
            k0Var.A("ServiceNotifyAggregationMsg", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return A;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return B;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236423n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236423n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f236436d = true;
            }
        }
        if (contentValues.containsKey("foldCount")) {
            this.field_foldCount = contentValues.getAsInteger("foldCount").intValue();
            if (z17) {
                this.f236437e = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsLong("groupId").longValue();
            if (z17) {
                this.f236438f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f236439g = true;
            }
        }
        if (contentValues.containsKey("showStatus")) {
            this.field_showStatus = contentValues.getAsInteger("showStatus").intValue();
            if (z17) {
                this.f236440h = true;
            }
        }
        if (contentValues.containsKey("weappMsgId")) {
            this.field_weappMsgId = contentValues.getAsString("weappMsgId");
            if (z17) {
                this.f236441i = true;
            }
        }
        if (contentValues.containsKey("clusterNote")) {
            this.field_clusterNote = contentValues.getAsString("clusterNote");
            if (z17) {
                this.f236442m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
