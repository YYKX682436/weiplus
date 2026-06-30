package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class w1 implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public long f213221d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FastList.TagSet[] f213222e;

    public w1(long j17, com.tencent.mm.vfs.FastList.TagSet[] tagSetArr, com.tencent.mm.vfs.v1 v1Var) {
        this.f213221d = j17;
        this.f213222e = tagSetArr;
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        long j17 = this.f213221d;
        if (j17 != 0) {
            com.tencent.mm.vfs.FastList.close(j17);
            this.f213221d = 0L;
        }
    }
}
