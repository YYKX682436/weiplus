package om5;

/* loaded from: classes10.dex */
public final class c8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.c8 f346476d = new om5.c8();

    public c8() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.RecordAndExtraGCFileSystem recordAndExtraGCFileSystem = new com.tencent.mm.vfs.RecordAndExtraGCFileSystem(it);
        recordAndExtraGCFileSystem.a("record", new com.tencent.mm.vfs.y4());
        return recordAndExtraGCFileSystem;
    }
}
