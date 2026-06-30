package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class j5 extends com.tencent.mm.vfs.i5 {
    public j5(java.lang.String str) {
        super(str, true);
    }

    public int a(int i17) {
        java.io.RandomAccessFile randomAccessFile = this.f212997d;
        long max = java.lang.Math.max(randomAccessFile.length() + i17, 0L);
        randomAccessFile.setLength(max);
        return (int) max;
    }
}
