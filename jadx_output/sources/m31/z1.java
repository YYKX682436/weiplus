package m31;

/* loaded from: classes9.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI f323243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
        super(0);
        this.f323243d = subscribeMsgRequestProxyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f323243d.getIntent().getStringExtra("key_subscribe_url");
        return stringExtra == null ? "" : stringExtra;
    }
}
