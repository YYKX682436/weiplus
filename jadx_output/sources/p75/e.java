package p75;

/* loaded from: classes4.dex */
public abstract class e extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f352630b;

    /* renamed from: c, reason: collision with root package name */
    public final p75.n f352631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f352632d;

    /* renamed from: e, reason: collision with root package name */
    public final p75.p f352633e;

    public e(java.lang.String column, int i17, p75.n bitOperation, int i18, p75.p operator) {
        kotlin.jvm.internal.o.g(column, "column");
        kotlin.jvm.internal.o.g(bitOperation, "bitOperation");
        kotlin.jvm.internal.o.g(operator, "operator");
        this.f352629a = column;
        this.f352630b = i17;
        this.f352631c = bitOperation;
        this.f352632d = i18;
        this.f352633e = operator;
    }

    @Override // p75.r
    public java.lang.String b() {
        return "(" + this.f352629a + ' ' + this.f352631c + ' ' + this.f352630b + ") " + this.f352633e + ' ' + this.f352632d;
    }
}
