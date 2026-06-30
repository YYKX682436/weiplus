package p06;

/* loaded from: classes16.dex */
public abstract class m {
    public static final p06.k a(p06.k first, p06.k second) {
        kotlin.jvm.internal.o.g(first, "first");
        kotlin.jvm.internal.o.g(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new p06.r(first, second);
    }
}
