package cw2;

/* loaded from: classes8.dex */
public final class db implements rm5.k {

    /* renamed from: a, reason: collision with root package name */
    public final long f223655a;

    /* renamed from: b, reason: collision with root package name */
    public final rm5.k f223656b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f223657c;

    public db(long j17, rm5.k thumbFetcher, yz5.a destroyCallback) {
        kotlin.jvm.internal.o.g(thumbFetcher, "thumbFetcher");
        kotlin.jvm.internal.o.g(destroyCallback, "destroyCallback");
        this.f223655a = j17;
        this.f223656b = thumbFetcher;
        this.f223657c = destroyCallback;
    }

    @Override // rm5.k
    public void a(java.util.List times, yz5.p callback) {
        kotlin.jvm.internal.o.g(times, "times");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(times, 10));
        java.util.Iterator it = times.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((java.lang.Number) it.next()).longValue() + this.f223655a));
        }
        this.f223656b.a(arrayList, new cw2.cb(callback, this));
    }

    @Override // rm5.k
    public void b(long j17) {
        this.f223656b.b(j17 + this.f223655a);
    }

    @Override // rm5.k
    public void destroy() {
        this.f223656b.destroy();
        this.f223657c.invoke();
    }

    @Override // rm5.k
    public void setSize(int i17, int i18) {
        this.f223656b.setSize(i17, i18);
    }
}
