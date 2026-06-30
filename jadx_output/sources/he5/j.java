package he5;

/* loaded from: classes9.dex */
public class j implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public android.database.Cursor f280938a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f280939b;

    /* renamed from: c, reason: collision with root package name */
    public final int f280940c;

    /* renamed from: d, reason: collision with root package name */
    public final int f280941d;

    /* renamed from: e, reason: collision with root package name */
    public final long f280942e;

    public j(java.lang.String str, int i17, int i18, long j17) {
        this.f280939b = str;
        this.f280940c = i17;
        this.f280941d = i18;
        this.f280942e = j17;
    }

    @Override // he5.t
    public int a() {
        return this.f280941d;
    }

    @Override // he5.t
    public void b(final java.util.List list, he5.s sVar) {
        sd5.p.a("fillItem", new yz5.a() { // from class: he5.j$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                java.util.List list2 = list;
                he5.j jVar = he5.j.this;
                jVar.getClass();
                java.lang.System.currentTimeMillis();
                try {
                    jVar.f280938a.moveToFirst();
                    while (!jVar.f280938a.isAfterLast()) {
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.convertFrom(jVar.f280938a);
                        list2.add(f9Var);
                        jVar.f280938a.moveToNext();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingNormalDataSource", e17, "", new java.lang.Object[0]);
                }
                if (!com.tencent.mars.xlog.Log.isDebug()) {
                    return null;
                }
                list2.size();
                java.lang.System.currentTimeMillis();
                return null;
            }
        });
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        xg3.m0 u17 = c01.d9.b().u();
        this.f280938a = ((com.tencent.mm.storage.g9) u17).M4(this.f280939b, this.f280940c, this.f280942e);
        oVar.next();
    }

    @Override // he5.t
    public void close() {
        this.f280938a.close();
    }

    @Override // he5.t
    public long d() {
        return this.f280942e;
    }
}
