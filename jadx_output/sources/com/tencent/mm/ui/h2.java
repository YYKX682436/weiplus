package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f208770a;

    /* renamed from: b, reason: collision with root package name */
    public long f208771b;

    public h2(long j17, int i17, kotlin.jvm.internal.i iVar) {
        this.f208770a = (i17 & 1) != 0 ? 1000L : j17;
    }

    public final boolean a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = currentTimeMillis - this.f208771b < this.f208770a;
        this.f208771b = currentTimeMillis;
        return z17;
    }
}
