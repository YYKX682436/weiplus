package d06;

/* loaded from: classes12.dex */
public final class a extends c06.a {
    @Override // c06.e
    public int e(int i17, int i18) {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt(i17, i18);
    }

    @Override // c06.e
    public long g(long j17) {
        return java.util.concurrent.ThreadLocalRandom.current().nextLong(j17);
    }

    @Override // c06.e
    public long h(long j17, long j18) {
        return java.util.concurrent.ThreadLocalRandom.current().nextLong(j17, j18);
    }

    @Override // c06.a
    public java.util.Random i() {
        java.util.concurrent.ThreadLocalRandom current = java.util.concurrent.ThreadLocalRandom.current();
        kotlin.jvm.internal.o.f(current, "current(...)");
        return current;
    }
}
