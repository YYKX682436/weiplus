package om5;

/* loaded from: classes10.dex */
public final class a8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.a8 f346454d = new om5.a8();

    public a8() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.AttachmentGCFileSystem attachmentGCFileSystem = new com.tencent.mm.vfs.AttachmentGCFileSystem(it);
        attachmentGCFileSystem.a("attachment", new com.tencent.mm.vfs.n());
        return attachmentGCFileSystem;
    }
}
