package wh4;

/* loaded from: classes.dex */
public final class c extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f446003e = {l75.n0.getCreateSQLs(uh4.g0.f427980x, "TeenModeAuthorization")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f446004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l75.k0 db6) {
        super(db6, uh4.g0.f427980x, "TeenModeAuthorization", null);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f446004d = db6;
    }

    public final uh4.g0 y0(int i17, java.lang.String key, long j17) {
        kotlin.jvm.internal.o.g(key, "key");
        uh4.g0 g0Var = new uh4.g0();
        g0Var.field_businessType = i17;
        g0Var.field_businessKey = key;
        g0Var.field_msgSvrId = j17;
        java.lang.String str = "select * from TeenModeAuthorization where businessType = " + i17 + " and businessKey = '" + key + "' ";
        if (j17 > 0) {
            str = str + " and msgSvrId = " + j17;
        }
        android.database.Cursor B = this.f446004d.B(str + " order by time desc ", null);
        if (B.moveToNext()) {
            g0Var.convertFrom(B);
        }
        B.close();
        return g0Var;
    }
}
