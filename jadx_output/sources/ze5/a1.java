package ze5;

/* loaded from: classes9.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.k4 f471809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze5.b1 f471810g;

    public a1(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, c00.k4 k4Var, ze5.b1 b1Var) {
        this.f471807d = dVar;
        this.f471808e = f9Var;
        this.f471809f = k4Var;
        this.f471810g = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsShopWindowCardMvvm$ChattingItemAppMsgEcsShopWindowCard$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.sdk.coroutines.LifecycleScope i17 = this.f471807d.i();
        if (i17 != null) {
            kotlinx.coroutines.l.d(i17, null, null, new ze5.z0(this.f471807d, view, this.f471808e, this.f471809f, this.f471810g, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsShopWindowCardMvvm$ChattingItemAppMsgEcsShopWindowCard$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
