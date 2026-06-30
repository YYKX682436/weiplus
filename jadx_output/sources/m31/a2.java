package m31;

/* loaded from: classes9.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI f323120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
        super(0);
        this.f323120d = subscribeMsgRequestProxyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = this.f323120d.getIntent().getStringArrayListExtra("key_template_id_list");
        kotlin.jvm.internal.o.d(stringArrayListExtra);
        return stringArrayListExtra;
    }
}
