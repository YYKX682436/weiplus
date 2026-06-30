package com.tencent.mm.plugin.lite;

/* loaded from: classes.dex */
public final class j implements kd.a {
    @Override // kd.a
    public void d(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            return;
        }
        java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length));
    }

    @Override // kd.a
    public void e(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            com.tencent.mars.xlog.Log.e(str, format);
        } else {
            com.tencent.mars.xlog.Log.e(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)));
        }
    }

    @Override // kd.a
    public void i(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            com.tencent.mars.xlog.Log.i(str, format);
        } else {
            com.tencent.mars.xlog.Log.i(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)));
        }
    }

    @Override // kd.a
    public void v(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            return;
        }
        java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length));
    }

    @Override // kd.a
    public void w(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(objects, "objects");
        if (objects.length == 0) {
            com.tencent.mars.xlog.Log.w(str, format);
        } else {
            com.tencent.mars.xlog.Log.w(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)));
        }
    }
}
