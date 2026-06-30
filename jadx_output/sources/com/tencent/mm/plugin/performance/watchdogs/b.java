package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f153008a;

    /* renamed from: b, reason: collision with root package name */
    public long f153009b;

    /* renamed from: c, reason: collision with root package name */
    public double f153010c;

    /* renamed from: d, reason: collision with root package name */
    public long f153011d;

    public final void a(yz5.a getter) {
        kotlin.jvm.internal.o.g(getter, "getter");
        long longValue = ((java.lang.Number) getter.invoke()).longValue();
        long j17 = this.f153008a + longValue;
        this.f153008a = j17;
        long j18 = this.f153009b + 1;
        this.f153009b = j18;
        this.f153010c = j17 / j18;
        this.f153011d = java.lang.Math.max(this.f153011d, longValue);
    }
}
