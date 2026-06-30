package p75;

/* loaded from: classes3.dex */
public abstract class x extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352698a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f352699b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f352700c;

    public x(java.lang.String column, boolean z17, java.lang.String likeValue) {
        kotlin.jvm.internal.o.g(column, "column");
        kotlin.jvm.internal.o.g(likeValue, "likeValue");
        this.f352698a = column;
        this.f352699b = z17;
        this.f352700c = likeValue;
    }

    @Override // p75.r
    public java.lang.String b() {
        boolean z17 = this.f352699b;
        java.lang.String str = this.f352700c;
        java.lang.String str2 = this.f352698a;
        if (z17) {
            return str2 + " NOT LIKE " + str;
        }
        return str2 + " LIKE " + str;
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return null;
    }
}
