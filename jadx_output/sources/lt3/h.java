package lt3;

/* loaded from: classes4.dex */
public final class h extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f321241e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f321242f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f321243d;

    static {
        l75.e0 e0Var = lt3.g.f321240y0;
        java.lang.String str = lt3.g.f321238l1;
        f321241e = new java.lang.String[]{l75.n0.getCreateSQLs(e0Var, str)};
        f321242f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l75.k0 db6) {
        super(db6, lt3.g.f321240y0, lt3.g.f321238l1, lt3.g.f321239p1);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = lt3.g.f321240y0;
        this.f321243d = db6;
    }

    public final lt3.g y0(java.lang.String taskId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        java.lang.String format = java.lang.String.format("select * from %s where %s=\"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{f321242f, "taskId", taskId}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.database.Cursor rawQuery = rawQuery(format, new java.lang.String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    lt3.g gVar = new lt3.g();
                    gVar.convertFrom(rawQuery);
                    vz5.b.a(rawQuery, null);
                    return gVar;
                }
                vz5.b.a(rawQuery, null);
            } finally {
            }
        }
        return null;
    }

    public final int z0(java.lang.String taskId, lt3.g editorData) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(editorData, "editorData");
        android.content.ContentValues convertTo = editorData.convertTo();
        convertTo.remove("rowid");
        return this.f321243d.p(f321242f, convertTo, "taskId=?", new java.lang.String[]{taskId});
    }
}
