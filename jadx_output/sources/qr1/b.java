package qr1;

/* loaded from: classes11.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent f366059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent chattingBizFansComponent) {
        super(1);
        this.f366059d = chattingBizFansComponent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent chattingBizFansComponent = this.f366059d;
        if (str != null) {
            zq1.w wVar = (zq1.w) ((yb5.d) chattingBizFansComponent.f463595d).f460708c.a(zq1.w.class);
            if (wVar != null) {
                ((com.tencent.mm.ui.chatting.component.biz.j) wVar).f198789d.L0(true, str, null, "bizfans");
            }
        } else {
            zq1.w wVar2 = (zq1.w) ((yb5.d) chattingBizFansComponent.f463595d).f460708c.a(zq1.w.class);
            if (wVar2 != null) {
                ((com.tencent.mm.ui.chatting.component.biz.j) wVar2).f198789d.L0(false, "", null, "bizfans");
            }
        }
        return jz5.f0.f302826a;
    }
}
