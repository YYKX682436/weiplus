package dm;

/* loaded from: classes4.dex */
public class b1 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f235791m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f235792n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f235793o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235794p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235795q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235796r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235797s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235798t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235799u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235800v;

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f235801w;

    /* renamed from: x, reason: collision with root package name */
    public static final o75.e f235802x;
    public int field_clusterType;
    public long field_createTime;
    public int field_massSendType;
    public long field_msgId;
    public int field_scene;
    public java.lang.String field_talker;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235803d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235804e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235805f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235806g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235807h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235808i = true;

    static {
        p75.n0 n0Var = new p75.n0("BizContactConversationMassSend");
        f235791m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235792n = new p75.d("msgId", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235793o = new java.lang.String[0];
        f235794p = 104191100;
        f235795q = 1369213417;
        f235796r = 1463551478;
        f235797s = -1141536684;
        f235798t = 109254796;
        f235799u = -881080743;
        f235800v = 108705909;
        f235801w = initAutoDBInfo(dm.b1.class);
        f235802x = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[1] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[2] = "massSendType";
        e0Var.f316955d.put("massSendType", "INTEGER default '0' ");
        e0Var.f316954c[3] = "clusterType";
        e0Var.f316955d.put("clusterType", "INTEGER default '0' ");
        e0Var.f316954c[4] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER default '0' ");
        e0Var.f316954c[5] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " msgId LONG PRIMARY KEY ,  createTime LONG,  massSendType INTEGER default '0' ,  clusterType INTEGER default '0' ,  scene INTEGER default '0' ,  talker TEXT";
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
            if (f235794p == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                    this.f235803d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizContactConversationMassSend", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235795q == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizContactConversationMassSend", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235796r == hashCode) {
                try {
                    this.field_massSendType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizContactConversationMassSend", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235797s == hashCode) {
                try {
                    this.field_clusterType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizContactConversationMassSend", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235798t == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizContactConversationMassSend", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235799u == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizContactConversationMassSend", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235800v == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235803d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f235804e) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f235805f) {
            contentValues.put("massSendType", java.lang.Integer.valueOf(this.field_massSendType));
        }
        if (this.f235806g) {
            contentValues.put("clusterType", java.lang.Integer.valueOf(this.field_clusterType));
        }
        if (this.f235807h) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f235808i) {
            contentValues.put("talker", this.field_talker);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizContactConversationMassSend", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizContactConversationMassSend ( ");
        l75.e0 e0Var = f235801w;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235793o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizContactConversationMassSend", "createTableSql %s", str2);
            k0Var.A("BizContactConversationMassSend", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizContactConversationMassSend", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizContactConversationMassSend", "updateTableSql %s", str3);
            k0Var.A("BizContactConversationMassSend", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizContactConversationMassSend", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235801w;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235802x;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235791m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235791m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f235803d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f235804e = true;
            }
        }
        if (contentValues.containsKey("massSendType")) {
            this.field_massSendType = contentValues.getAsInteger("massSendType").intValue();
            if (z17) {
                this.f235805f = true;
            }
        }
        if (contentValues.containsKey("clusterType")) {
            this.field_clusterType = contentValues.getAsInteger("clusterType").intValue();
            if (z17) {
                this.f235806g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f235807h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f235808i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
