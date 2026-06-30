package t56;

/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f415894a;

    /* renamed from: b, reason: collision with root package name */
    public final t56.l[] f415895b;

    /* renamed from: c, reason: collision with root package name */
    public long f415896c;

    public k(java.util.concurrent.ThreadFactory threadFactory, int i17) {
        this.f415894a = i17;
        this.f415895b = new t56.l[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            this.f415895b[i18] = new t56.l(threadFactory);
        }
    }
}
