package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class c5 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f212870a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.channels.FileLock f212871b;

    /* renamed from: c, reason: collision with root package name */
    public int f212872c;

    public c5(java.io.RandomAccessFile randomAccessFile, boolean z17) {
        this.f212872c = z17 ? -1 : 1;
        this.f212871b = randomAccessFile.getChannel().lock(0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue, !z17);
    }
}
