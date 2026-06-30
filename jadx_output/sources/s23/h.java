package s23;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f402304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.a aVar) {
        super(1);
        this.f402304d = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        dx1.g.f244489a.j("SnsPublishProcess", "agreeCnt", 1, bx1.u.f36310e);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "onSendItemClick get permission");
        this.f402304d.invoke();
        s23.n.f402318p = false;
        return jz5.f0.f302826a;
    }
}
