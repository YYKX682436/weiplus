package j5;

/* loaded from: classes13.dex */
public final class m implements j5.j {

    /* renamed from: a, reason: collision with root package name */
    public final l4.q f297751a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f297752b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.w f297753c;

    public m(l4.q qVar) {
        this.f297751a = qVar;
        this.f297752b = new j5.k(this, qVar);
        this.f297753c = new j5.l(this, qVar);
    }

    public j5.i a(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c17.bindNull(1);
        } else {
            c17.bindString(1, str);
        }
        l4.q qVar = this.f297751a;
        qVar.b();
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            return a17.moveToFirst() ? new j5.i(a17.getString(n4.a.a(a17, "work_spec_id")), a17.getInt(n4.a.a(a17, "system_id"))) : null;
        } finally {
            a17.close();
            c17.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(java.lang.String str) {
        l4.q qVar = this.f297751a;
        qVar.b();
        l4.w wVar = this.f297753c;
        p4.i a17 = wVar.a();
        if (str == null) {
            ((q4.h) a17).bindNull(1);
        } else {
            ((q4.h) a17).bindString(1, str);
        }
        qVar.c();
        try {
            q4.i iVar = (q4.i) a17;
            iVar.a();
            qVar.h();
            qVar.f();
            wVar.c(iVar);
        } catch (java.lang.Throwable th6) {
            qVar.f();
            wVar.c(a17);
            throw th6;
        }
    }
}
