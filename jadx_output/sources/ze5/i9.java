package ze5;

/* loaded from: classes5.dex */
public final class i9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.j9 f472004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472006f;

    public i9(ze5.j9 j9Var, yb5.d dVar, rd5.d dVar2) {
        this.f472004d = j9Var;
        this.f472005e = dVar;
        this.f472006f = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemTingCategoryMvvm$ChattingItemTingCategoryMvvmTo$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f472004d.R(view, this.f472005e, this.f472006f.f394254d.f445300b);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemTingCategoryMvvm$ChattingItemTingCategoryMvvmTo$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
