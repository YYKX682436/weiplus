package kh;

/* loaded from: classes12.dex */
public final class s2 extends kh.b3 {
    public s2() {
        super("wild", 2);
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        kotlin.jvm.internal.o.g(threadIdCard, "threadIdCard");
        java.lang.String str = threadIdCard.f307799a;
        if (kotlin.jvm.internal.o.b(str, "Thread-?") || kotlin.jvm.internal.o.b(str, "pool-?-thread-?") || kotlin.jvm.internal.o.b(str, "Timer-?")) {
            return this.f307765b;
        }
        return 0;
    }
}
