package ir1;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI f293977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI) {
        super(2);
        this.f293977d = bizFansBlackListUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI = this.f293977d;
        java.lang.Object obj3 = bizFansBlackListUI.f93934f.f293950e.get(intValue);
        kotlin.jvm.internal.o.f(obj3, "get(...)");
        r45.d04 d04Var = (r45.d04) obj3;
        rl5.r rVar = bizFansBlackListUI.f93937i;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        rl5.r rVar2 = bizFansBlackListUI.f93937i;
        if (rVar2 != null) {
            rVar2.h(view, new ir1.m(bizFansBlackListUI), new ir1.q(bizFansBlackListUI, d04Var), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("popupMenu");
        throw null;
    }
}
