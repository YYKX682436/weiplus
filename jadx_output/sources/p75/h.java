package p75;

/* loaded from: classes4.dex */
public abstract class h extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352645a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f352646b;

    /* renamed from: c, reason: collision with root package name */
    public final p75.p f352647c;

    public h(java.lang.String column, java.lang.String value, p75.p operator) {
        kotlin.jvm.internal.o.g(column, "column");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(operator, "operator");
        this.f352645a = column;
        this.f352646b = value;
        this.f352647c = operator;
    }

    @Override // p75.r
    public java.lang.String b() {
        return this.f352645a + ' ' + this.f352647c + " ?";
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return new java.lang.String[]{this.f352646b};
    }
}
