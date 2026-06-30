package qe;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.f f361926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qe.f fVar) {
        super(0);
        this.f361926d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qe.f fVar = this.f361926d;
        qe.f.a(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CronetHttpNativeInstallHelper", "httpBinding lazy init, loading native library");
        sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return new qe.c(fVar);
    }
}
