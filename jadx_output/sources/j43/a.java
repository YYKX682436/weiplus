package j43;

/* loaded from: classes12.dex */
public abstract class a extends j43.d {
    public abstract void b(p75.k kVar, java.lang.Object obj);

    public final void c(java.lang.Iterable iterable) {
        p75.k z17;
        if (this.f297672a.compareAndSet(false, true)) {
            if (this.f297674c == null) {
                this.f297674c = this.f297673b.z(a());
            }
            z17 = this.f297674c;
        } else {
            z17 = this.f297673b.z(a());
        }
        try {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(z17, it.next());
                p75.e0 e0Var = (p75.e0) z17;
                com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = e0Var.f352634d;
                if (sQLiteStatement != null) {
                    sQLiteStatement.executeInsert();
                } else {
                    com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = e0Var.f352635e;
                    if (sQLiteStatement2 != null) {
                        sQLiteStatement2.executeInsert();
                    }
                }
            }
        } finally {
            if (z17 == this.f297674c) {
                this.f297672a.set(false);
            }
        }
    }

    public final void d(java.lang.Object obj) {
        p75.k z17;
        if (this.f297672a.compareAndSet(false, true)) {
            if (this.f297674c == null) {
                this.f297674c = this.f297673b.z(a());
            }
            z17 = this.f297674c;
        } else {
            z17 = this.f297673b.z(a());
        }
        try {
            b(z17, obj);
            p75.e0 e0Var = (p75.e0) z17;
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = e0Var.f352634d;
            if (sQLiteStatement != null) {
                sQLiteStatement.executeInsert();
            } else {
                com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = e0Var.f352635e;
                if (sQLiteStatement2 != null) {
                    sQLiteStatement2.executeInsert();
                }
            }
            if (e0Var == this.f297674c) {
                this.f297672a.set(false);
            }
        } catch (java.lang.Throwable th6) {
            if (z17 == this.f297674c) {
                this.f297672a.set(false);
            }
            throw th6;
        }
    }
}
