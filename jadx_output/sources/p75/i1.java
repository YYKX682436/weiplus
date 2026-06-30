package p75;

/* loaded from: classes4.dex */
public final class i1 extends p75.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f352663c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.ContentValues f352664d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f352665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String table, android.content.ContentValues values, java.lang.String str, java.lang.String[] strArr) {
        super("", strArr);
        kotlin.jvm.internal.o.g(table, "table");
        kotlin.jvm.internal.o.g(values, "values");
        this.f352663c = table;
        this.f352664d = values;
        this.f352665e = str;
    }

    public final int f(l75.k0 k0Var) {
        if (k0Var != null) {
            return k0Var.p(this.f352663c, this.f352664d, this.f352665e, this.f352637b);
        }
        return -1;
    }
}
