package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class b6 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f212833d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f212834e;

    /* renamed from: f, reason: collision with root package name */
    public final long f212835f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final int f212836g;

    /* renamed from: h, reason: collision with root package name */
    public long f212837h;

    /* renamed from: i, reason: collision with root package name */
    public int f212838i;

    /* renamed from: m, reason: collision with root package name */
    public int f212839m;

    /* renamed from: n, reason: collision with root package name */
    public long f212840n;

    /* renamed from: o, reason: collision with root package name */
    public int f212841o;

    /* renamed from: p, reason: collision with root package name */
    public long f212842p;

    /* renamed from: q, reason: collision with root package name */
    public int f212843q;

    public b6(java.lang.String str, boolean z17) {
        this.f212833d = str;
        this.f212834e = z17;
        this.f212836g = com.tencent.mm.vfs.StatisticsFileSystem.c(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f212833d.compareTo((java.lang.String) obj);
    }
}
