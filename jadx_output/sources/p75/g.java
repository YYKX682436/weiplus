package p75;

/* loaded from: classes.dex */
public class g implements p75.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352642a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f352643b;

    public g(java.lang.String column, boolean z17) {
        kotlin.jvm.internal.o.g(column, "column");
        this.f352642a = column;
        this.f352643b = z17;
    }

    @Override // p75.r
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f352642a);
        sb6.append(this.f352643b ? "" : " DESC");
        return sb6.toString();
    }
}
