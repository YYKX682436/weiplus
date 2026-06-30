package ze5;

/* loaded from: classes9.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472216e;

    public u(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f472215d = dVar;
        this.f472216e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandProfileCardMvvm$Companion$createViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te5.t.f418749a.d(this.f472215d, this.f472216e);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandProfileCardMvvm$Companion$createViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
