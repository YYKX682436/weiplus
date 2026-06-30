package om5;

/* loaded from: classes10.dex */
public final class u7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.u7 f346673d = new om5.u7();

    public u7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.ImageGCFileSystem imageGCFileSystem = new com.tencent.mm.vfs.ImageGCFileSystem(it);
        imageGCFileSystem.a("image2", new com.tencent.mm.vfs.f3());
        return imageGCFileSystem;
    }
}
