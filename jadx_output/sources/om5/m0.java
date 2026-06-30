package om5;

/* loaded from: classes10.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.f6 f346578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.vfs.f6 f6Var) {
        super(1);
        this.f346578d = f6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f346578d.getClass();
        return new com.tencent.mm.vfs.CleanExpireFileSystem(it, 7 * 86400000, true);
    }
}
