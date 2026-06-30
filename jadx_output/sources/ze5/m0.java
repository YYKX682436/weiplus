package ze5;

/* loaded from: classes9.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.n0 f472074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c00.j4 f472077g;

    public m0(ze5.n0 n0Var, com.tencent.mm.storage.f9 f9Var, yb5.d dVar, c00.j4 j4Var) {
        this.f472074d = n0Var;
        this.f472075e = f9Var;
        this.f472076f = dVar;
        this.f472077g = j4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsProductCardMvvm$ChattingItemAppMsgEcProduct$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ze5.n0 n0Var = this.f472074d;
        bw5.u8 u8Var = n0Var.f472102t;
        if (u8Var != null) {
            ze5.n0.k0(n0Var, "view_clk", this.f472076f, this.f472075e, u8Var, n0Var.f472103u);
        }
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", this.f472075e, "ecs_kf_card_product");
        yb5.d dVar = this.f472076f;
        com.tencent.mm.sdk.coroutines.LifecycleScope i17 = dVar.i();
        if (i17 != null) {
            kotlinx.coroutines.l.d(i17, null, null, new ze5.l0(dVar, this.f472077g, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsProductCardMvvm$ChattingItemAppMsgEcProduct$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
