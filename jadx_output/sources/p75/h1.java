package p75;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final p75.f1 f352649a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.ContentValues f352650b;

    /* renamed from: c, reason: collision with root package name */
    public p75.m f352651c;

    public h1(p75.f1 table, android.content.ContentValues values) {
        kotlin.jvm.internal.o.g(table, "table");
        kotlin.jvm.internal.o.g(values, "values");
        this.f352649a = table;
        this.f352650b = values;
    }

    public final p75.i1 a() {
        p75.f1 f1Var = this.f352649a;
        if (f1Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String b17 = f1Var.b();
        p75.m mVar = this.f352651c;
        java.lang.String b18 = mVar != null ? mVar.b() : null;
        p75.m mVar2 = this.f352651c;
        return new p75.i1(b17, this.f352650b, b18, mVar2 != null ? mVar2.e() : null);
    }

    public final p75.h1 b(p75.m condition) {
        kotlin.jvm.internal.o.g(condition, "condition");
        this.f352651c = condition;
        return this;
    }
}
