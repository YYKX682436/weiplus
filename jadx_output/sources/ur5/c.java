package ur5;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f430436a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final vr5.a f430437b = new vr5.a(kr5.p.f311570a);

    public c(ur5.a aVar) {
    }

    public void a(java.lang.String str, tr5.g0 g0Var) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        if (g0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupResult".concat(" can not be null"));
        }
        or5.b.a("Cache %s for %s", g0Var, str);
        ((java.util.concurrent.ConcurrentHashMap) this.f430436a).put(str, g0Var);
        if (kr5.p.f311571b.f311561p) {
            vr5.a aVar = this.f430437b;
            aVar.getClass();
            synchronized (vr5.a.f439817e) {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = null;
                try {
                    try {
                        sQLiteDatabase = aVar.b();
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        sQLiteDatabase = sQLiteDatabase2;
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("host", str);
                    contentValues.put("result", vr5.c.a(g0Var));
                    sQLiteDatabase.insertWithOnConflict("lookupDB", null, contentValues, 5);
                    sQLiteDatabase.setTransactionSuccessful();
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (java.lang.Exception e18) {
                        or5.b.b("db end transaction error  " + e18, new java.lang.Object[0]);
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    sQLiteDatabase2 = sQLiteDatabase;
                    or5.b.b("insert lookupCache fail " + e, new java.lang.Object[0]);
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (java.lang.Exception e27) {
                            or5.b.b("db end transaction error  " + e27, new java.lang.Object[0]);
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (java.lang.Exception e28) {
                            or5.b.b("db end transaction error  " + e28, new java.lang.Object[0]);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public void b() {
        java.lang.Throwable th6;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        ((java.util.concurrent.ConcurrentHashMap) this.f430436a).clear();
        if (kr5.p.f311571b.f311561p) {
            vr5.a aVar = this.f430437b;
            aVar.getClass();
            synchronized (vr5.a.f439817e) {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = null;
                try {
                    try {
                        sQLiteDatabase = aVar.b();
                    } catch (java.lang.Exception e17) {
                        e = e17;
                    }
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    sQLiteDatabase = sQLiteDatabase2;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    sQLiteDatabase.delete("lookupDB", null, null);
                    sQLiteDatabase.setTransactionSuccessful();
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (java.lang.Exception e18) {
                        or5.b.b("db end transaction error " + e18, new java.lang.Object[0]);
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    sQLiteDatabase2 = sQLiteDatabase;
                    or5.b.b("clear cache fail" + e, new java.lang.Object[0]);
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (java.lang.Exception e27) {
                            or5.b.b("db end transaction error " + e27, new java.lang.Object[0]);
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    th6 = th8;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (java.lang.Exception e28) {
                            or5.b.b("db end transaction error " + e28, new java.lang.Object[0]);
                        }
                    }
                    throw th6;
                }
            }
        }
    }

    public void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f430436a).remove(str);
        if (kr5.p.f311571b.f311561p) {
            this.f430437b.a(new java.lang.String[]{str});
        }
    }
}
