package qt0;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f366496a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f366497b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f366498c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f366499d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f366500e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f366501f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f366502g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f366503h;

    public e(l75.k0 k0Var, java.lang.String[] createIndexSQLs, java.lang.String targetTableName, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(createIndexSQLs, "createIndexSQLs");
        kotlin.jvm.internal.o.g(targetTableName, "targetTableName");
        this.f366496a = k0Var;
        this.f366497b = createIndexSQLs;
        this.f366498c = targetTableName;
        this.f366499d = str;
        this.f366500e = "MicroMsg.DBIndexTask";
        this.f366501f = jz5.h.b(qt0.c.f366494d);
        this.f366502g = "db_lazy_create_index_" + targetTableName + '_' + i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicfg_db_lazy_create_index_");
        if (str == null) {
            str = targetTableName.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(str, "toLowerCase(...)");
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(i17);
        sb6.append("_android");
        this.f366503h = sb6.toString();
    }
}
