package j5;

/* loaded from: classes13.dex */
public final class d implements j5.b {

    /* renamed from: a, reason: collision with root package name */
    public final l4.q f297730a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f297731b;

    public d(l4.q qVar) {
        this.f297730a = qVar;
        this.f297731b = new j5.c(this, qVar);
    }

    public java.util.List a(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c17.bindNull(1);
        } else {
            c17.bindString(1, str);
        }
        l4.q qVar = this.f297730a;
        qVar.b();
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(a17.getCount());
            while (a17.moveToNext()) {
                arrayList.add(a17.getString(0));
            }
            return arrayList;
        } finally {
            a17.close();
            c17.release();
        }
    }

    public boolean b(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c17.bindNull(1);
        } else {
            c17.bindString(1, str);
        }
        l4.q qVar = this.f297730a;
        qVar.b();
        boolean z17 = false;
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            if (a17.moveToFirst()) {
                z17 = a17.getInt(0) != 0;
            }
            return z17;
        } finally {
            a17.close();
            c17.release();
        }
    }
}
