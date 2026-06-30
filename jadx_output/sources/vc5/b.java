package vc5;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView f435313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView) {
        super(0);
        this.f435313d = msgHistoryGalleryActionBarView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        em.u1 u1Var = this.f435313d.f201711f;
        if (u1Var != null) {
            u1Var.a().setExpanded(false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("binding");
        throw null;
    }
}
