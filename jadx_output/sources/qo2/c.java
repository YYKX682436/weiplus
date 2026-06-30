package qo2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f365572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jz5.l lVar) {
        super(0);
        this.f365572d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderLiveShopMsgEvent finderLiveShopMsgEvent = new com.tencent.mm.autogen.events.FinderLiveShopMsgEvent();
        am.vb vbVar = finderLiveShopMsgEvent.f54291g;
        vbVar.f8186a = (java.util.List) this.f365572d.f302834e;
        vbVar.f8187b = true;
        finderLiveShopMsgEvent.e();
        return jz5.f0.f302826a;
    }
}
