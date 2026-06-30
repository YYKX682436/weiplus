package ye5;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f461247d;

    public d(com.tencent.mm.storage.f9 f9Var) {
        this.f461247d = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemFoldSys$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jc5.b.f299016a.a(this.f461247d);
        new com.tencent.mm.autogen.events.ChatMsgNotifyEvent().e();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemFoldSys$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
