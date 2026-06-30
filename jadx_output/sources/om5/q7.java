package om5;

/* loaded from: classes10.dex */
public final class q7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.q7 f346629d = new om5.q7();

    public q7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new com.tencent.mm.vfs.RC4EncryptedFileSystem(it, "msgsynchoronize");
    }
}
