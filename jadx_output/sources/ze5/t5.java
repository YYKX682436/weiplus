package ze5;

/* loaded from: classes9.dex */
public final class t5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472205e;

    public t5(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f472204d = dVar;
        this.f472205e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemBizShareCardMvvm$Companion$createBizShareCardViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ze5.o5.f472128a.c(this.f472204d, this.f472205e);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemBizShareCardMvvm$Companion$createBizShareCardViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
