package ze5;

/* loaded from: classes5.dex */
public final class g9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.h9 f471951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f471953f;

    public g9(ze5.h9 h9Var, yb5.d dVar, rd5.d dVar2) {
        this.f471951d = h9Var;
        this.f471952e = dVar;
        this.f471953f = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemTingCategoryMvvm$ChattingItemTingCategoryMvvmFrom$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f471951d.R(view, this.f471952e, this.f471953f.f394254d.f445300b);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemTingCategoryMvvm$ChattingItemTingCategoryMvvmFrom$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
