package p05;

/* loaded from: classes.dex */
public final class d5 implements tq5.n {
    @Override // tq5.n
    public void d(java.lang.String str, java.lang.String str2, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(args, "args");
        java.util.Arrays.copyOf(args, args.length);
    }

    @Override // tq5.n
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mars.xlog.Log.e(str, str2, java.util.Arrays.copyOf(args, args.length));
    }

    @Override // tq5.n
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mars.xlog.Log.i(str, str2, java.util.Arrays.copyOf(args, args.length));
    }

    @Override // tq5.n
    public void w(java.lang.String str, java.lang.String str2, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mars.xlog.Log.w(str, str2, java.util.Arrays.copyOf(args, args.length));
    }
}
