package zc;

/* loaded from: classes13.dex */
public final class a implements nx5.b {
    @Override // nx5.b
    public void d(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            kd.c.a(str, format, new java.lang.Object[0]);
        } else {
            kd.c.a(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)), new java.lang.Object[0]);
        }
    }

    @Override // nx5.b
    public void e(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            kd.c.b(str, format, new java.lang.Object[0]);
        } else {
            kd.c.b(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)), new java.lang.Object[0]);
        }
    }

    @Override // nx5.b
    public void i(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            kd.c.c(str, format, new java.lang.Object[0]);
        } else {
            kd.c.c(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)), new java.lang.Object[0]);
        }
    }

    @Override // nx5.b
    public void v(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            kd.c.d(str, format, new java.lang.Object[0]);
        } else {
            kd.c.d(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)), new java.lang.Object[0]);
        }
    }

    @Override // nx5.b
    public void w(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            kd.c.e(str, format, new java.lang.Object[0]);
        } else {
            kd.c.e(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)), new java.lang.Object[0]);
        }
    }
}
