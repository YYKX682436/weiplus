package j06;

/* loaded from: classes16.dex */
public abstract class j {
    public static void a(j06.k kVar, java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        if (j06.k0.a(kVar) == args.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Callable expects " + j06.k0.a(kVar) + " arguments, but " + args.length + " were provided.");
    }
}
