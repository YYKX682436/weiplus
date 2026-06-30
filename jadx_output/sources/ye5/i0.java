package ye5;

/* loaded from: classes9.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.n8 f461262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f461263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ze5.n8 n8Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        super(4);
        this.f461262d = n8Var;
        this.f461263e = a0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View view = (android.view.View) obj;
        yb5.d chattingContext = (yb5.d) obj2;
        rd5.d msgData = (rd5.d) obj3;
        com.tencent.mm.ui.chatting.viewitems.g0 chattingHolder = (com.tencent.mm.ui.chatting.viewitems.g0) obj4;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(chattingHolder, "chattingHolder");
        ye5.j b17 = ye5.k0.b(ye5.l0.f461271a, msgData);
        if (b17 != null) {
            com.tencent.mm.storage.f9 f9Var = b17.f461264a;
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.ujd);
            q31.n nVar = tag instanceof q31.n ? (q31.n) tag : null;
            if (nVar != null) {
                this.f461262d.setQuoteView(nVar);
                lf5.f fVar = lf5.f.f318534a;
                ze5.n8 n8Var = this.f461262d;
                com.tencent.mm.ui.chatting.viewitems.a0 a0Var = this.f461263e;
                ze5.ma maVar = b17.f461265b;
                fVar.a(chattingContext, f9Var, n8Var, a0Var, maVar.a(), maVar.b());
            }
        }
        return jz5.f0.f302826a;
    }
}
