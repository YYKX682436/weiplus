package uf;

/* loaded from: classes5.dex */
public final class r0 implements v91.c {
    @Override // v91.c
    public void a(java.lang.String tag, java.lang.Throwable tr6, java.lang.String format) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(tr6, "tr");
        kotlin.jvm.internal.o.g(format, "format");
        com.tencent.mars.xlog.Log.printErrStackTrace(tag, tr6, format, new java.lang.Object[0]);
    }

    @Override // v91.c
    public void e(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e(tag, msg);
    }

    @Override // v91.c
    public void i(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(tag, msg);
    }
}
