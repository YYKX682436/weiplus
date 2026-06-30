package ir1;

/* loaded from: classes11.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationFragment f293974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationFragment bizFansConversationFragment) {
        super(0);
        this.f293974d = bizFansConversationFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationFragment bizFansConversationFragment = this.f293974d;
        ir1.e0 e0Var = new ir1.e0(bizFansConversationFragment, bizFansConversationFragment.f93946w, 0);
        int i17 = e0Var.f293959f;
        e0Var.f293965o = new ir1.t(i17);
        wn.u uVar = bizFansConversationFragment.f64738u;
        if (uVar != null) {
            e0Var.f293966p = new ir1.r(i17, uVar.f447380d, null, 4, null);
            return e0Var;
        }
        kotlin.jvm.internal.o.o("readyChattingUIC");
        throw null;
    }
}
