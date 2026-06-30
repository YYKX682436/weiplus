package uw5;

/* loaded from: classes8.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String tag, java.lang.String format, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.d(b(format, java.util.Arrays.copyOf(obj, obj.length)));
    }

    public final java.lang.String b(java.lang.String str, java.lang.Object... objArr) {
        return objArr.length == 0 ? str : java.lang.String.format(str, java.util.Arrays.copyOf(objArr, objArr.length));
    }
}
