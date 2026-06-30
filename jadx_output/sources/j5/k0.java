package j5;

/* loaded from: classes13.dex */
public final class k0 implements j5.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l4.q f297749a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f297750b;

    public k0(l4.q qVar) {
        this.f297749a = qVar;
        this.f297750b = new j5.j0(this, qVar);
    }

    public java.util.List a(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c17.bindNull(1);
        } else {
            c17.bindString(1, str);
        }
        l4.q qVar = this.f297749a;
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
}
