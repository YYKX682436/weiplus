package dm;

/* loaded from: classes10.dex */
public class w3 extends l75.f0 {
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
    public static final int f240757J;
    public static final int K;
    public static final l75.e0 L;
    public static final o75.e M;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f240758u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f240759v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240760w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240761x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240762y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240763z;
    public r45.et0 field_actionInfo;
    public long field_actionTime;
    public int field_actionType;
    public int field_canRemove;
    public java.lang.String field_dupFlag;
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
    public boolean f240764d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240765e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240766f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240767g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240768h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240769i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240770m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240771n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240772o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240773p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f240774q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f240775r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f240776s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f240777t = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderAction");
        f240758u = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240759v = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS Finder_Local_Comment_Id ON FinderAction(localCommentId)", "CREATE INDEX IF NOT EXISTS FinderAction_Feed_Id ON FinderAction(feedId)", "CREATE INDEX IF NOT EXISTS Finder_Feed_CreateTime ON FinderAction(actionTime)", "CREATE INDEX IF NOT EXISTS Finder_Feed_ActionType ON FinderAction(actionType)", "CREATE INDEX IF NOT EXISTS Finder_Reply_state ON FinderAction(state)"};
        f240760w = 1175274671;
        f240761x = -1278410919;
        f240762y = 1851865635;
        f240763z = 1851881104;
        A = -1362583253;
        B = 109254796;
        C = 109757585;
        D = 1851542532;
        E = 757010317;
        F = 1928166420;
        G = -10073996;
        H = 838484914;
        I = 564765001;
        f240757J = 2011292171;
        K = 108705909;
        L = initAutoDBInfo(dm.w3.class);
        M = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
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
        e0Var.f316954c[13] = "dupFlag";
        e0Var.f316955d.put("dupFlag", "TEXT");
        e0Var.f316954c[14] = "rowid";
        e0Var.f316956e = " localCommentId LONG PRIMARY KEY ,  feedId LONG,  actionTime LONG,  actionType INTEGER,  objectNonceId TEXT,  scene INTEGER,  state INTEGER,  actionInfo BLOB,  postTime LONG,  tryCount LONG,  canRemove INTEGER,  lastTryTime LONG,  failedFlag INTEGER,  dupFlag TEXT";
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
            if (f240760w == hashCode) {
                try {
                    this.field_localCommentId = cursor.getLong(i17);
                    this.f240764d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240761x == hashCode) {
                try {
                    this.field_feedId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240762y == hashCode) {
                try {
                    this.field_actionTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240763z == hashCode) {
                try {
                    this.field_actionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_objectNonceId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_actionInfo = (r45.et0) new r45.et0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_postTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_tryCount = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_canRemove = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_lastTryTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_failedFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240757J == hashCode) {
                try {
                    this.field_dupFlag = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAction", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240764d) {
            contentValues.put("localCommentId", java.lang.Long.valueOf(this.field_localCommentId));
        }
        if (this.f240765e) {
            contentValues.put("feedId", java.lang.Long.valueOf(this.field_feedId));
        }
        if (this.f240766f) {
            contentValues.put("actionTime", java.lang.Long.valueOf(this.field_actionTime));
        }
        if (this.f240767g) {
            contentValues.put("actionType", java.lang.Integer.valueOf(this.field_actionType));
        }
        if (this.f240768h) {
            contentValues.put("objectNonceId", this.field_objectNonceId);
        }
        if (this.f240769i) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f240770m) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f240771n) {
            r45.et0 et0Var = this.field_actionInfo;
            if (et0Var != null) {
                try {
                    contentValues.put("actionInfo", et0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderAction", e17.getMessage());
                }
            } else {
                contentValues.put("actionInfo", (byte[]) null);
            }
        }
        if (this.f240772o) {
            contentValues.put("postTime", java.lang.Long.valueOf(this.field_postTime));
        }
        if (this.f240773p) {
            contentValues.put("tryCount", java.lang.Long.valueOf(this.field_tryCount));
        }
        if (this.f240774q) {
            contentValues.put("canRemove", java.lang.Integer.valueOf(this.field_canRemove));
        }
        if (this.f240775r) {
            contentValues.put("lastTryTime", java.lang.Long.valueOf(this.field_lastTryTime));
        }
        if (this.f240776s) {
            contentValues.put("failedFlag", java.lang.Integer.valueOf(this.field_failedFlag));
        }
        if (this.f240777t) {
            contentValues.put("dupFlag", this.field_dupFlag);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderAction", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderAction ( ");
        l75.e0 e0Var = L;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240759v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderAction", "createTableSql %s", str2);
            k0Var.A("FinderAction", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderAction", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderAction", "updateTableSql %s", str3);
            k0Var.A("FinderAction", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderAction", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return L;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return M;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localCommentId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240758u;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240758u.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("localCommentId")) {
            this.field_localCommentId = contentValues.getAsLong("localCommentId").longValue();
            if (z17) {
                this.f240764d = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.field_feedId = contentValues.getAsLong("feedId").longValue();
            if (z17) {
                this.f240765e = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.field_actionTime = contentValues.getAsLong("actionTime").longValue();
            if (z17) {
                this.f240766f = true;
            }
        }
        if (contentValues.containsKey("actionType")) {
            this.field_actionType = contentValues.getAsInteger("actionType").intValue();
            if (z17) {
                this.f240767g = true;
            }
        }
        if (contentValues.containsKey("objectNonceId")) {
            this.field_objectNonceId = contentValues.getAsString("objectNonceId");
            if (z17) {
                this.f240768h = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f240769i = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f240770m = true;
            }
        }
        if (contentValues.containsKey("actionInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("actionInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_actionInfo = (r45.et0) new r45.et0().parseFrom(asByteArray);
                    if (z17) {
                        this.f240771n = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderAction", e17.getMessage());
            }
        }
        if (contentValues.containsKey("postTime")) {
            this.field_postTime = contentValues.getAsLong("postTime").longValue();
            if (z17) {
                this.f240772o = true;
            }
        }
        if (contentValues.containsKey("tryCount")) {
            this.field_tryCount = contentValues.getAsLong("tryCount").longValue();
            if (z17) {
                this.f240773p = true;
            }
        }
        if (contentValues.containsKey("canRemove")) {
            this.field_canRemove = contentValues.getAsInteger("canRemove").intValue();
            if (z17) {
                this.f240774q = true;
            }
        }
        if (contentValues.containsKey("lastTryTime")) {
            this.field_lastTryTime = contentValues.getAsLong("lastTryTime").longValue();
            if (z17) {
                this.f240775r = true;
            }
        }
        if (contentValues.containsKey("failedFlag")) {
            this.field_failedFlag = contentValues.getAsInteger("failedFlag").intValue();
            if (z17) {
                this.f240776s = true;
            }
        }
        if (contentValues.containsKey("dupFlag")) {
            this.field_dupFlag = contentValues.getAsString("dupFlag");
            if (z17) {
                this.f240777t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
