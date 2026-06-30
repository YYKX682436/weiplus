package om5;

/* loaded from: classes10.dex */
public final class w7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.w7 f346694d = new om5.w7();

    public w7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.VideoGCFileSystem videoGCFileSystem = new com.tencent.mm.vfs.VideoGCFileSystem(it);
        videoGCFileSystem.a("video", new com.tencent.mm.vfs.g8());
        return videoGCFileSystem;
    }
}
