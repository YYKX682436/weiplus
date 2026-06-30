package p75;

/* loaded from: classes3.dex */
public abstract class a0 extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352619a;

    public a0(java.lang.String column) {
        kotlin.jvm.internal.o.g(column, "column");
        this.f352619a = column;
    }

    @Override // p75.r
    public java.lang.String b() {
        return "trim(" + this.f352619a + ") != ''";
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return null;
    }
}
