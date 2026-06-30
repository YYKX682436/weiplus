package dm;

/* loaded from: classes4.dex */
public class lb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f238328i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f238329m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f238330n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f238331o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238332p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238333q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238334r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238335s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238336t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238337u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f238338v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f238339w;
    private java.lang.String field_contentId;
    private java.lang.String field_id;
    private java.lang.String field_receiverId;
    private java.lang.String field_senderId;
    private java.lang.String field_targetLangCode;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238340d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238341e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238342f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238343g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238344h = false;

    static {
        p75.n0 n0Var = new p75.n0("TranslateContext");
        f238328i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        p75.d dVar = new p75.d("contentId", "string", tableName, "");
        f238329m = dVar;
        p75.d dVar2 = new p75.d("senderId", "string", tableName, "");
        f238330n = dVar2;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        p75.v f17 = n0Var.f("contentIdAndSenderIdIndex");
        f17.b(dVar, dVar2);
        f238331o = new java.lang.String[]{f17.a().f352636a};
        f238332p = 3355;
        f238333q = -407108748;
        f238334r = 1247963696;
        f238335s = 209269610;
        f238336t = 1087816108;
        f238337u = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        ((java.util.HashMap) e0Var.f316955d).put(dm.i4.COL_ID, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_ID;
        e0Var.f316954c[1] = "contentId";
        ((java.util.HashMap) e0Var.f316955d).put("contentId", "TEXT");
        e0Var.f316954c[2] = "senderId";
        ((java.util.HashMap) e0Var.f316955d).put("senderId", "TEXT default '' ");
        e0Var.f316954c[3] = "receiverId";
        ((java.util.HashMap) e0Var.f316955d).put("receiverId", "TEXT default '' ");
        e0Var.f316954c[4] = "targetLangCode";
        ((java.util.HashMap) e0Var.f316955d).put("targetLangCode", "TEXT default '' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " id TEXT PRIMARY KEY ,  contentId TEXT,  senderId TEXT default '' ,  receiverId TEXT default '' ,  targetLangCode TEXT default '' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f238338v = e0Var;
        f238339w = new o75.e();
    }

    public void A0(java.lang.String str) {
        this.field_senderId = str;
        this.f238342f = true;
    }

    public void D0(java.lang.String str) {
        this.field_targetLangCode = str;
        this.f238344h = true;
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
            if (f238332p == hashCode) {
                try {
                    this.field_id = cursor.getString(i17);
                    this.f238340d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTranslateContext", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238333q == hashCode) {
                try {
                    this.field_contentId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTranslateContext", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238334r == hashCode) {
                try {
                    this.field_senderId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTranslateContext", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238335s == hashCode) {
                try {
                    this.field_receiverId = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTranslateContext", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238336t == hashCode) {
                try {
                    this.field_targetLangCode = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTranslateContext", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238337u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238340d) {
            contentValues.put(dm.i4.COL_ID, this.field_id);
        }
        if (this.f238341e) {
            contentValues.put("contentId", this.field_contentId);
        }
        if (this.field_senderId == null) {
            this.field_senderId = "";
        }
        if (this.f238342f) {
            contentValues.put("senderId", this.field_senderId);
        }
        if (this.field_receiverId == null) {
            this.field_receiverId = "";
        }
        if (this.f238343g) {
            contentValues.put("receiverId", this.field_receiverId);
        }
        if (this.field_targetLangCode == null) {
            this.field_targetLangCode = "";
        }
        if (this.f238344h) {
            contentValues.put("targetLangCode", this.field_targetLangCode);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTranslateContext", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TranslateContext ( ");
        l75.e0 e0Var = f238338v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238331o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTranslateContext", "createTableSql %s", str2);
            k0Var.A("TranslateContext", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TranslateContext", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTranslateContext", "updateTableSql %s", str3);
            k0Var.A("TranslateContext", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTranslateContext", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238338v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238339w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238328i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238328i.f352676a;
    }

    public long insertToDB(l75.k0 k0Var, boolean z17) {
        m75.c cVar;
        if (z17) {
            o75.c cVar2 = new o75.c(o75.b.f343582c, java.lang.String.valueOf(this.field_id), "MicroMsg.SDK.BaseTranslateContext");
            cVar2.f343590d = this;
            cVar = new m75.c(this, true, cVar2, f238339w, "MicroMsg.SDK.BaseTranslateContext");
        } else {
            cVar = new m75.c(this, true, null, null, "MicroMsg.SDK.BaseTranslateContext");
        }
        return cVar.a(k0Var);
    }

    public java.lang.String t0() {
        return this.field_contentId;
    }

    public java.lang.String u0() {
        return this.field_receiverId;
    }

    public java.lang.String v0() {
        return this.field_senderId;
    }

    public java.lang.String w0() {
        return this.field_targetLangCode;
    }

    public void y0(java.lang.String str) {
        this.field_contentId = str;
        this.f238341e = true;
    }

    public void z0(java.lang.String str) {
        this.field_receiverId = str;
        this.f238343g = true;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsString(dm.i4.COL_ID);
            if (z17) {
                this.f238340d = true;
            }
        }
        if (contentValues.containsKey("contentId")) {
            this.field_contentId = contentValues.getAsString("contentId");
            if (z17) {
                this.f238341e = true;
            }
        }
        if (contentValues.containsKey("senderId")) {
            this.field_senderId = contentValues.getAsString("senderId");
            if (z17) {
                this.f238342f = true;
            }
        }
        if (contentValues.containsKey("receiverId")) {
            this.field_receiverId = contentValues.getAsString("receiverId");
            if (z17) {
                this.f238343g = true;
            }
        }
        if (contentValues.containsKey("targetLangCode")) {
            this.field_targetLangCode = contentValues.getAsString("targetLangCode");
            if (z17) {
                this.f238344h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
