package dm;

/* loaded from: classes8.dex */
public class u4 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f240284m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f240285n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240286o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240287p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240288q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240289r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240290s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240291t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240292u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f240293v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f240294w;
    public r45.qt2 field_contextObj;
    public boolean field_isPrivate;
    public int field_likeAction;
    public long field_localId;
    public int field_scene;
    public boolean field_showTips;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240295d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240296e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240297f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240298g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240299h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240300i = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLocalOperation");
        f240284m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240285n = new java.lang.String[0];
        f240286o = 338409958;
        f240287p = -1651192659;
        f240288q = 109254796;
        f240289r = -338830379;
        f240290s = 273771720;
        f240291t = -894276359;
        f240292u = 108705909;
        f240293v = initAutoDBInfo(dm.u4.class);
        f240294w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "LONG PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_LOCALID;
        e0Var.f316954c[1] = "likeAction";
        e0Var.f316955d.put("likeAction", "INTEGER");
        e0Var.f316954c[2] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[3] = "showTips";
        e0Var.f316955d.put("showTips", "INTEGER");
        e0Var.f316954c[4] = "contextObj";
        e0Var.f316955d.put("contextObj", "BLOB");
        e0Var.f316954c[5] = "isPrivate";
        e0Var.f316955d.put("isPrivate", "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " localId LONG PRIMARY KEY ,  likeAction INTEGER,  scene INTEGER,  showTips INTEGER,  contextObj BLOB,  isPrivate INTEGER";
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
            boolean z17 = true;
            if (f240286o == hashCode) {
                try {
                    this.field_localId = cursor.getLong(i17);
                    this.f240295d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240287p == hashCode) {
                try {
                    this.field_likeAction = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240288q == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240289r == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_showTips = z17;
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240290s == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_contextObj = (r45.qt2) new r45.qt2().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240291t == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isPrivate = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240292u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240295d) {
            contentValues.put(dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
        }
        if (this.f240296e) {
            contentValues.put("likeAction", java.lang.Integer.valueOf(this.field_likeAction));
        }
        if (this.f240297f) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f240298g) {
            if (this.field_showTips) {
                contentValues.put("showTips", (java.lang.Integer) 1);
            } else {
                contentValues.put("showTips", (java.lang.Integer) 0);
            }
        }
        if (this.f240299h) {
            r45.qt2 qt2Var = this.field_contextObj;
            if (qt2Var != null) {
                try {
                    contentValues.put("contextObj", qt2Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLocalOperation", e17.getMessage());
                }
            } else {
                contentValues.put("contextObj", (byte[]) null);
            }
        }
        if (this.f240300i) {
            if (this.field_isPrivate) {
                contentValues.put("isPrivate", (java.lang.Integer) 1);
            } else {
                contentValues.put("isPrivate", (java.lang.Integer) 0);
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
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLocalOperation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLocalOperation ( ");
        l75.e0 e0Var = f240293v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240285n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLocalOperation", "createTableSql %s", str2);
            k0Var.A("FinderLocalOperation", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderLocalOperation", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLocalOperation", "updateTableSql %s", str3);
            k0Var.A("FinderLocalOperation", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderLocalOperation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240293v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240294w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240284m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240284m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(dm.i4.COL_LOCALID).longValue();
            if (z17) {
                this.f240295d = true;
            }
        }
        if (contentValues.containsKey("likeAction")) {
            this.field_likeAction = contentValues.getAsInteger("likeAction").intValue();
            if (z17) {
                this.f240296e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f240297f = true;
            }
        }
        if (contentValues.containsKey("showTips")) {
            this.field_showTips = contentValues.getAsInteger("showTips").intValue() != 0;
            if (z17) {
                this.f240298g = true;
            }
        }
        if (contentValues.containsKey("contextObj")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("contextObj");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_contextObj = (r45.qt2) new r45.qt2().parseFrom(asByteArray);
                    if (z17) {
                        this.f240299h = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderLocalOperation", e17.getMessage());
            }
        }
        if (contentValues.containsKey("isPrivate")) {
            this.field_isPrivate = contentValues.getAsInteger("isPrivate").intValue() != 0;
            if (z17) {
                this.f240300i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
