package ef4;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef4.c f252436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ef4.c cVar) {
        super(0);
        this.f252436d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ef4.c cVar = this.f252436d;
        try {
            cVar.getClass();
            ef4.c.a(cVar, "pic/", 31457280, 100);
            ef4.c.a(cVar, "video/", 314572800, 100);
        } catch (java.lang.Exception e17) {
            cVar.getClass();
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryMgr", e17, "", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
