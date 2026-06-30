package p75;

/* loaded from: classes4.dex */
public abstract class e1 implements p75.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352636a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f352637b;

    public e1(java.lang.String sql, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(sql, "sql");
        this.f352636a = sql;
        this.f352637b = strArr;
    }

    @Override // p75.r
    public java.lang.String b() {
        return this.f352636a;
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return this.f352637b;
    }

    public java.lang.String toString() {
        return "sql=" + this.f352636a + " params=" + this.f352637b;
    }
}
