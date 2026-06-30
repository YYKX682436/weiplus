package p75;

/* loaded from: classes4.dex */
public abstract class f1 implements p75.r {
    public final p75.v f(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        return new p75.v(this, name);
    }

    public final p75.i0 g(java.util.List columns) {
        kotlin.jvm.internal.o.g(columns, "columns");
        return new p75.i0(this, columns);
    }

    public final p75.i0 h(p75.d column) {
        kotlin.jvm.internal.o.g(column, "column");
        return g(kz5.b0.c(column));
    }

    public final p75.i0 i() {
        return new p75.i0(this, kz5.p0.f313996d);
    }

    public final p75.h1 j(android.content.ContentValues values) {
        kotlin.jvm.internal.o.g(values, "values");
        return new p75.h1(this, values);
    }
}
