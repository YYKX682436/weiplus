package ze5;

/* loaded from: classes5.dex */
public final class a6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471818e;

    public a6(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f471817d = f9Var;
        this.f471818e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemContactCardMvvm$Companion$createContactCardViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        com.tencent.mm.storage.f9 f9Var = this.f471817d;
        com.tencent.mm.ui.chatting.viewitems.wg.a(context, f9Var.Q0(), f9Var.j(), this.f471818e.D(), f9Var.A0() == 0, this.f471817d);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemContactCardMvvm$Companion$createContactCardViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
