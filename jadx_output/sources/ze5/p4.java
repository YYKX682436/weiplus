package ze5;

/* loaded from: classes9.dex */
public final class p4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472146e;

    public p4(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472145d = f9Var;
        this.f472146e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgPhotoAccountNameCardMvvm$Companion$createPhotoAccountNameCardViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ze5.q4 q4Var = ze5.r4.f472180a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.storage.f9 f9Var = this.f472145d;
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String j17 = f9Var.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        q4Var.d(context, Q0, j17, this.f472146e.D(), f9Var.A0() == 0, this.f472145d);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgPhotoAccountNameCardMvvm$Companion$createPhotoAccountNameCardViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
