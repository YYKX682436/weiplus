package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class i3 implements com.tencent.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f212992a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f212993b;

    /* renamed from: c, reason: collision with root package name */
    public final long f212994c;

    /* renamed from: d, reason: collision with root package name */
    public long f212995d = 7 * 86400000;

    public i3(long j17, boolean z17) {
        this.f212992a = j17;
        this.f212993b = z17;
        this.f212994c = j17 * 2;
    }

    public final com.tencent.mm.vfs.u b() {
        return this.f212993b ? new com.tencent.mm.vfs.o3(this.f212992a, this.f212994c, this.f212995d) : new com.tencent.mm.vfs.n3(this.f212992a, this.f212994c, this.f212995d);
    }
}
