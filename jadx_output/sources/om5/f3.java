package om5;

/* loaded from: classes10.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.f3 f346504d = new om5.f3();

    public f3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new com.tencent.mm.vfs.RC4EncryptedFileSystem(it, "bizimg");
    }
}
