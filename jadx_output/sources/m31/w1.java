package m31;

/* loaded from: classes9.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI f323228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
        super(0);
        this.f323228d = subscribeMsgRequestProxyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f323228d.getIntent().getBooleanExtra("key_need_result", false));
    }
}
