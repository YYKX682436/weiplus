package r23;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f368824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.a aVar) {
        super(1);
        this.f368824d = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        dx1.g.f244489a.j("SnsPublishProcess", "agreeCnt", 1, bx1.u.f36310e);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "onSendItemClick get permission");
        this.f368824d.invoke();
        r23.j.f368837k = false;
        return jz5.f0.f302826a;
    }
}
