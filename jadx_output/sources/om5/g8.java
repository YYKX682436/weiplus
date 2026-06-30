package om5;

/* loaded from: classes12.dex */
public final class g8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.g8 f346520d = new om5.g8();

    public g8() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new com.tencent.mm.vfs.MigrationFileSystem(false, false, it, new com.tencent.mm.vfs.NativeFileSystem("${sdTo}/MicroMsg/${accountSalt}/image"));
    }
}
