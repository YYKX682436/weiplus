package om5;

/* loaded from: classes10.dex */
public final class y7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.y7 f346714d = new om5.y7();

    public y7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.VoiceGCFileSystem voiceGCFileSystem = new com.tencent.mm.vfs.VoiceGCFileSystem(it);
        voiceGCFileSystem.a("voice", new com.tencent.mm.vfs.j8());
        return voiceGCFileSystem;
    }
}
