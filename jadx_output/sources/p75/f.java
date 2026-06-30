package p75;

/* loaded from: classes4.dex */
public abstract class f extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352638a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f352639b;

    /* renamed from: c, reason: collision with root package name */
    public final p75.p f352640c;

    public f(java.lang.String column1, java.lang.String column2, p75.p operator) {
        kotlin.jvm.internal.o.g(column1, "column1");
        kotlin.jvm.internal.o.g(column2, "column2");
        kotlin.jvm.internal.o.g(operator, "operator");
        this.f352638a = column1;
        this.f352639b = column2;
        this.f352640c = operator;
    }

    @Override // p75.r
    public java.lang.String b() {
        return this.f352638a + ' ' + this.f352640c + ' ' + this.f352639b;
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return null;
    }
}
