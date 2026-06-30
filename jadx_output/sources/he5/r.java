package he5;

/* loaded from: classes9.dex */
public class r implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public android.database.Cursor f280975a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f280976b;

    /* renamed from: c, reason: collision with root package name */
    public int f280977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f280978d;

    /* renamed from: e, reason: collision with root package name */
    public final he5.q f280979e;

    /* renamed from: f, reason: collision with root package name */
    public long f280980f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f280981g = new java.util.ArrayList();

    public r(java.lang.String str, int i17, int i18, hd5.n nVar, he5.q qVar) {
        this.f280976b = str;
        this.f280977c = i17;
        this.f280978d = i18;
        this.f280979e = qVar;
    }

    @Override // he5.t
    public int a() {
        return this.f280978d;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        list.addAll(this.f280981g);
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        com.tencent.mm.storage.x4 x4Var = (com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        java.lang.String str = this.f280976b;
        this.f280980f = x4Var.m0(str);
        int i17 = this.f280977c;
        he5.q qVar = this.f280979e;
        if (i17 < ((ke5.b0) qVar).a() * 3) {
            this.f280977c = ((ke5.b0) qVar).a() * 3;
        }
        android.database.Cursor M4 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).M4(str, this.f280977c, this.f280980f);
        this.f280975a = M4;
        java.util.List list = this.f280981g;
        try {
            M4.moveToFirst();
            com.tencent.mm.storage.f9 f9Var = null;
            while (!this.f280975a.isAfterLast()) {
                com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                f9Var2.convertFrom(this.f280975a);
                ((java.util.ArrayList) list).add(f9Var2);
                this.f280975a.moveToNext();
                if (f9Var != null) {
                    ((ke5.b0) qVar).b(f9Var, f9Var2);
                }
                f9Var = f9Var2;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", e17, "", new java.lang.Object[0]);
        }
        oVar.next();
    }

    @Override // he5.t
    public void close() {
        this.f280975a.close();
    }

    @Override // he5.t
    public long d() {
        return this.f280980f;
    }
}
