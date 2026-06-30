package we5;

/* loaded from: classes5.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f445353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445354e;

    public l0(com.tencent.mm.ui.chatting.viewitems.ao aoVar, yb5.d dVar) {
        this.f445353d = aoVar;
        this.f445354e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextTo$filling$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f445353d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTextTo", "sourceTV click msgId:%s", aoVar.f203379b.getTag(com.tencent.mm.R.id.bon));
        java.lang.Object tag = aoVar.f203379b.getTag(com.tencent.mm.R.id.rfh);
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.String");
        java.lang.Object tag2 = aoVar.f203379b.getTag(com.tencent.mm.R.id.bon);
        kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) tag2).longValue();
        com.tencent.mm.ui.chatting.w5.m(this.f445354e, (java.lang.String) tag, longValue, 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextTo$filling$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
