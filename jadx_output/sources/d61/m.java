package d61;

/* loaded from: classes14.dex */
public final class m extends d61.a {

    /* renamed from: w, reason: collision with root package name */
    public long f226752w;

    public final void b(java.io.RandomAccessFile source, byte[] atomHead) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(atomHead, "atomHead");
        byte[] bArr = new byte[4];
        d61.c.h(source, 12L);
        source.read(bArr);
        this.f226752w = d61.c.e(bArr, 0);
        source.read(bArr);
        d61.c.e(bArr, 0);
    }
}
