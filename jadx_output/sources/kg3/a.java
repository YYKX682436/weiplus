package kg3;

/* loaded from: classes8.dex */
public interface a {
    default void a(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(args, "args");
        format.concat("");
        java.util.Arrays.copyOf(args, args.length);
    }
}
