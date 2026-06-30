package p75;

/* loaded from: classes3.dex */
public abstract class c0 extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352624a;

    public c0(java.lang.String column) {
        kotlin.jvm.internal.o.g(column, "column");
        this.f352624a = column;
    }

    @Override // p75.r
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f352624a;
        sb6.append(str);
        sb6.append(" is null OR ");
        sb6.append(str);
        sb6.append(" = ''");
        return sb6.toString();
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return null;
    }
}
