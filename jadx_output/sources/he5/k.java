package he5;

/* loaded from: classes9.dex */
public final class k implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f280945a;

    /* renamed from: b, reason: collision with root package name */
    public final long f280946b;

    /* renamed from: c, reason: collision with root package name */
    public final long f280947c;

    /* renamed from: d, reason: collision with root package name */
    public android.database.Cursor f280948d;

    public k(java.lang.String talker, long j17, long j18) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f280945a = talker;
        this.f280946b = j17;
        this.f280947c = j18;
    }

    @Override // he5.t
    public int a() {
        return ((com.tencent.mm.storage.g9) c01.d9.b().u()).j7(this.f280945a);
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        android.database.Cursor cursor;
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(success, "success");
        try {
            cursor = this.f280948d;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingSearchDataSource", e17, "", new java.lang.Object[0]);
        }
        if (cursor == null) {
            return;
        }
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.convertFrom(cursor);
            list.add(f9Var);
            cursor.moveToNext();
        }
        ((hd5.f) success).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(this.f280945a);
        android.database.Cursor V2 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).V2(this.f280945a, java.lang.Math.max(m07, this.f280946b), this.f280947c);
        this.f280948d = V2;
        if (V2 != null) {
            V2.moveToFirst();
        }
        if (oVar != null) {
            oVar.next();
        }
    }

    @Override // he5.t
    public void close() {
        android.database.Cursor cursor = this.f280948d;
        if (cursor != null) {
            cursor.close();
        }
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }
}
