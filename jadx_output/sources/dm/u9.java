package dm;

/* loaded from: classes9.dex */
public class u9 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f240382p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f240383q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240384r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240385s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240386t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240387u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240388v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240389w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240390x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240391y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f240392z;
    public boolean field_hasClicked;
    public long field_invalidtime;
    public boolean field_isSend;
    public long field_locaMsgId;
    public int field_receiveStatus;
    public long field_receiveTime;
    public java.lang.String field_receiverName;
    public java.lang.String field_talker;
    public java.lang.String field_transferId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240393d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240394e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240395f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240396g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240397h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240398i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240399m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240400n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240401o = true;

    static {
        p75.n0 n0Var = new p75.n0("RemittanceRecord");
        f240382p = n0Var;
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
        f240383q = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS remittance_record_status_index ON RemittanceRecord(receiveStatus)", "CREATE INDEX IF NOT EXISTS remittance_record_talker_index ON RemittanceRecord(talker)"};
        f240384r = -1727368602;
        f240385s = -1232917541;
        f240386t = 1505638581;
        f240387u = -1180128302;
        f240388v = -881080743;
        f240389w = -952209084;
        f240390x = -755218150;
        f240391y = -1402055635;
        f240392z = -2103439280;
        A = 108705909;
        B = initAutoDBInfo(dm.u9.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "transferId";
        e0Var.f316955d.put("transferId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "transferId";
        e0Var.f316954c[1] = "locaMsgId";
        e0Var.f316955d.put("locaMsgId", "LONG");
        e0Var.f316954c[2] = "receiveStatus";
        e0Var.f316955d.put("receiveStatus", "INTEGER default '-1' ");
        e0Var.f316954c[3] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER");
        e0Var.f316954c[4] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[5] = "invalidtime";
        e0Var.f316955d.put("invalidtime", "LONG");
        e0Var.f316954c[6] = "receiverName";
        e0Var.f316955d.put("receiverName", "TEXT");
        e0Var.f316954c[7] = "hasClicked";
        e0Var.f316955d.put("hasClicked", "INTEGER");
        e0Var.f316954c[8] = "receiveTime";
        e0Var.f316955d.put("receiveTime", "LONG");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " transferId TEXT PRIMARY KEY ,  locaMsgId LONG,  receiveStatus INTEGER default '-1' ,  isSend INTEGER,  talker TEXT,  invalidtime LONG,  receiverName TEXT,  hasClicked INTEGER,  receiveTime LONG";
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
            if (f240384r == hashCode) {
                try {
                    this.field_transferId = cursor.getString(i17);
                    this.f240393d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240385s == hashCode) {
                try {
                    this.field_locaMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240386t == hashCode) {
                try {
                    this.field_receiveStatus = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240387u == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isSend = z17;
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240388v == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240389w == hashCode) {
                try {
                    this.field_invalidtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240390x == hashCode) {
                try {
                    this.field_receiverName = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240391y == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_hasClicked = z17;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240392z == hashCode) {
                try {
                    this.field_receiveTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseRemittanceRecord", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240393d) {
            contentValues.put("transferId", this.field_transferId);
        }
        if (this.f240394e) {
            contentValues.put("locaMsgId", java.lang.Long.valueOf(this.field_locaMsgId));
        }
        if (this.f240395f) {
            contentValues.put("receiveStatus", java.lang.Integer.valueOf(this.field_receiveStatus));
        }
        if (this.f240396g) {
            if (this.field_isSend) {
                contentValues.put("isSend", (java.lang.Integer) 1);
            } else {
                contentValues.put("isSend", (java.lang.Integer) 0);
            }
        }
        if (this.f240397h) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f240398i) {
            contentValues.put("invalidtime", java.lang.Long.valueOf(this.field_invalidtime));
        }
        if (this.f240399m) {
            contentValues.put("receiverName", this.field_receiverName);
        }
        if (this.f240400n) {
            if (this.field_hasClicked) {
                contentValues.put("hasClicked", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasClicked", (java.lang.Integer) 0);
            }
        }
        if (this.f240401o) {
            contentValues.put("receiveTime", java.lang.Long.valueOf(this.field_receiveTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseRemittanceRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RemittanceRecord ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240383q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRemittanceRecord", "createTableSql %s", str2);
            k0Var.A("RemittanceRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "RemittanceRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRemittanceRecord", "updateTableSql %s", str3);
            k0Var.A("RemittanceRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseRemittanceRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_transferId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240382p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240382p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("transferId")) {
            this.field_transferId = contentValues.getAsString("transferId");
            if (z17) {
                this.f240393d = true;
            }
        }
        if (contentValues.containsKey("locaMsgId")) {
            this.field_locaMsgId = contentValues.getAsLong("locaMsgId").longValue();
            if (z17) {
                this.f240394e = true;
            }
        }
        if (contentValues.containsKey("receiveStatus")) {
            this.field_receiveStatus = contentValues.getAsInteger("receiveStatus").intValue();
            if (z17) {
                this.f240395f = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue() != 0;
            if (z17) {
                this.f240396g = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f240397h = true;
            }
        }
        if (contentValues.containsKey("invalidtime")) {
            this.field_invalidtime = contentValues.getAsLong("invalidtime").longValue();
            if (z17) {
                this.f240398i = true;
            }
        }
        if (contentValues.containsKey("receiverName")) {
            this.field_receiverName = contentValues.getAsString("receiverName");
            if (z17) {
                this.f240399m = true;
            }
        }
        if (contentValues.containsKey("hasClicked")) {
            this.field_hasClicked = contentValues.getAsInteger("hasClicked").intValue() != 0;
            if (z17) {
                this.f240400n = true;
            }
        }
        if (contentValues.containsKey("receiveTime")) {
            this.field_receiveTime = contentValues.getAsLong("receiveTime").longValue();
            if (z17) {
                this.f240401o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
