package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public interface q2 {
    java.lang.Iterable C(java.lang.String str);

    java.lang.String D(java.lang.String str, boolean z17);

    boolean F(java.lang.String str);

    java.io.InputStream a(java.lang.String str);

    java.io.OutputStream c(java.lang.String str, boolean z17);

    boolean d(java.lang.String str);

    boolean e(java.lang.String str, boolean z17);

    com.tencent.mm.vfs.o2 g(java.lang.String str);

    java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17);

    long i(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17);

    java.lang.Iterable list(java.lang.String str);

    com.tencent.mm.vfs.x1 m(java.lang.String str);

    boolean n(java.lang.String str, long j17);

    int o();

    void q(android.os.CancellationSignal cancellationSignal);

    boolean r(java.lang.String str);

    java.nio.channels.ReadableByteChannel s(java.lang.String str);

    boolean t(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2);

    android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2);

    com.tencent.mm.vfs.FileSystem y();
}
