package ze5;

/* loaded from: classes9.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f472055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f472056f;

    public l(yb5.d dVar, android.view.View view, android.widget.TextView textView) {
        this.f472054d = dVar;
        this.f472055e = view;
        this.f472056f = textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandMvvm$Companion$todoSourceViewCreator$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) view.getTag();
        android.view.View view2 = this.f472055e;
        android.widget.TextView textView = this.f472056f;
        yb5.d dVar = this.f472054d;
        com.tencent.mm.ui.chatting.viewitems.j1.m(f9Var, dVar, 1, new ze5.k(view2, textView, dVar));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandMvvm$Companion$todoSourceViewCreator$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
