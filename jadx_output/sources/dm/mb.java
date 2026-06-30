package dm;

/* loaded from: classes10.dex */
public class mb extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f238569J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f238570t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f238571u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238572v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238573w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238574x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238575y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238576z;
    public r45.et0 field_actionInfo;
    public long field_actionTime;
    public int field_actionType;
    public int field_canRemove;
    public int field_failedFlag;
    public long field_feedId;
    public long field_lastTryTime;
    public long field_localCommentId;
    public java.lang.String field_objectNonceId;
    public long field_postTime;
    public int field_scene;
    public int field_state;
    public long field_tryCount;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238577d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238578e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238579f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238580g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238581h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238582i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238583m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238584n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238585o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238586p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238587q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238588r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238589s = true;

    static {
        p75.n0 n0Var = new p75.n0("UniAction");
        f238570t = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238571u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS Finder_Local_Comment_Id ON UniAction(localCommentId)", "CREATE INDEX IF NOT EXISTS FinderAction_Feed_Id ON UniAction(feedId)", "CREATE INDEX IF NOT EXISTS Finder_Feed_CreateTime ON UniAction(actionTime)", "CREATE INDEX IF NOT EXISTS Finder_Feed_ActionType ON UniAction(actionType)", "CREATE INDEX IF NOT EXISTS Finder_Reply_state ON UniAction(state)"};
        f238572v = 1175274671;
        f238573w = -1278410919;
        f238574x = 1851865635;
        f238575y = 1851881104;
        f238576z = -1362583253;
        A = 109254796;
        B = 109757585;
        C = 1851542532;
        D = 757010317;
        E = 1928166420;
        F = -10073996;
        G = 838484914;
        H = 564765001;
        I = 108705909;
        f238569J = initAutoDBInfo(dm.mb.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "localCommentId";
        e0Var.f316955d.put("localCommentId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "localCommentId";
        e0Var.f316954c[1] = "feedId";
        e0Var.f316955d.put("feedId", "LONG");
        e0Var.f316954c[2] = "actionTime";
        e0Var.f316955d.put("actionTime", "LONG");
        e0Var.f316954c[3] = "actionType";
        e0Var.f316955d.put("actionType", "INTEGER");
        e0Var.f316954c[4] = "objectNonceId";
        e0Var.f316955d.put("objectNonceId", "TEXT");
        e0Var.f316954c[5] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[6] = "state";
        e0Var.f316955d.put("state", "INTEGER");
        e0Var.f316954c[7] = "actionInfo";
        e0Var.f316955d.put("actionInfo", "BLOB");
        e0Var.f316954c[8] = "postTime";
        e0Var.f316955d.put("postTime", "LONG");
        e0Var.f316954c[9] = "tryCount";
        e0Var.f316955d.put("tryCount", "LONG");
        e0Var.f316954c[10] = "canRemove";
        e0Var.f316955d.put("canRemove", "INTEGER");
        e0Var.f316954c[11] = "lastTryTime";
        e0Var.f316955d.put("lastTryTime", "LONG");
        e0Var.f316954c[12] = "failedFlag";
        e0Var.f316955d.put("failedFlag", "INTEGER");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " localCommentId LONG PRIMARY KEY ,  feedId LONG,  actionTime LONG,  actionType INTEGER,  objectNonceId TEXT,  scene INTEGER,  state INTEGER,  actionInfo BLOB,  postTime LONG,  tryCount LONG,  canRemove INTEGER,  lastTryTime LONG,  failedFlag INTEGER";
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
            if (f238572v == hashCode) {
                try {
                    this.field_localCommentId = cursor.getLong(i17);
                    this.f238577d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238573w == hashCode) {
                try {
                    this.field_feedId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238574x == hashCode) {
                try {
                    this.field_actionTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238575y == hashCode) {
                try {
                    this.field_actionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238576z == hashCode) {
                try {
                    this.field_objectNonceId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_actionInfo = (r45.et0) new r45.et0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_postTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_tryCount = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_canRemove = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_lastTryTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_failedFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUniAction", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238577d) {
            contentValues.put("localCommentId", java.lang.Long.valueOf(this.field_localCommentId));
        }
        if (this.f238578e) {
            contentValues.put("feedId", java.lang.Long.valueOf(this.field_feedId));
        }
        if (this.f238579f) {
            contentValues.put("actionTime", java.lang.Long.valueOf(this.field_actionTime));
        }
        if (this.f238580g) {
            contentValues.put("actionType", java.lang.Integer.valueOf(this.field_actionType));
        }
        if (this.f238581h) {
            contentValues.put("objectNonceId", this.field_objectNonceId);
        }
        if (this.f238582i) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f238583m) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f238584n) {
            r45.et0 et0Var = this.field_actionInfo;
            if (et0Var != null) {
                try {
                    contentValues.put("actionInfo", et0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseUniAction", e17.getMessage());
                }
            } else {
                contentValues.put("actionInfo", (byte[]) null);
            }
        }
        if (this.f238585o) {
            contentValues.put("postTime", java.lang.Long.valueOf(this.field_postTime));
        }
        if (this.f238586p) {
            contentValues.put("tryCount", java.lang.Long.valueOf(this.field_tryCount));
        }
        if (this.f238587q) {
            contentValues.put("canRemove", java.lang.Integer.valueOf(this.field_canRemove));
        }
        if (this.f238588r) {
            contentValues.put("lastTryTime", java.lang.Long.valueOf(this.field_lastTryTime));
        }
        if (this.f238589s) {
            contentValues.put("failedFlag", java.lang.Integer.valueOf(this.field_failedFlag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseUniAction", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS UniAction ( ");
        l75.e0 e0Var = f238569J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238571u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUniAction", "createTableSql %s", str2);
            k0Var.A("UniAction", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "UniAction", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUniAction", "updateTableSql %s", str3);
            k0Var.A("UniAction", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUniAction", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238569J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localCommentId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238570t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238570t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("localCommentId")) {
            this.field_localCommentId = contentValues.getAsLong("localCommentId").longValue();
            if (z17) {
                this.f238577d = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.field_feedId = contentValues.getAsLong("feedId").longValue();
            if (z17) {
                this.f238578e = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.field_actionTime = contentValues.getAsLong("actionTime").longValue();
            if (z17) {
                this.f238579f = true;
            }
        }
        if (contentValues.containsKey("actionType")) {
            this.field_actionType = contentValues.getAsInteger("actionType").intValue();
            if (z17) {
                this.f238580g = true;
            }
        }
        if (contentValues.containsKey("objectNonceId")) {
            this.field_objectNonceId = contentValues.getAsString("objectNonceId");
            if (z17) {
                this.f238581h = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f238582i = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f238583m = true;
            }
        }
        if (contentValues.containsKey("actionInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("actionInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_actionInfo = (r45.et0) new r45.et0().parseFrom(asByteArray);
                    if (z17) {
                        this.f238584n = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseUniAction", e17.getMessage());
            }
        }
        if (contentValues.containsKey("postTime")) {
            this.field_postTime = contentValues.getAsLong("postTime").longValue();
            if (z17) {
                this.f238585o = true;
            }
        }
        if (contentValues.containsKey("tryCount")) {
            this.field_tryCount = contentValues.getAsLong("tryCount").longValue();
            if (z17) {
                this.f238586p = true;
            }
        }
        if (contentValues.containsKey("canRemove")) {
            this.field_canRemove = contentValues.getAsInteger("canRemove").intValue();
            if (z17) {
                this.f238587q = true;
            }
        }
        if (contentValues.containsKey("lastTryTime")) {
            this.field_lastTryTime = contentValues.getAsLong("lastTryTime").longValue();
            if (z17) {
                this.f238588r = true;
            }
        }
        if (contentValues.containsKey("failedFlag")) {
            this.field_failedFlag = contentValues.getAsInteger("failedFlag").intValue();
            if (z17) {
                this.f238589s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
