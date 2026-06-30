package ze5;

/* loaded from: classes9.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.g6 f471880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(ze5.g6 g6Var, yb5.d dVar) {
        super(1);
        this.f471880d = g6Var;
        this.f471881e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.m6 it = (ze5.m6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View b17 = it.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiFrom$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiFrom$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View b18 = it.b();
        ze5.g6 g6Var = this.f471880d;
        if (g6Var.f205276u == null) {
            g6Var.f205276u = new com.tencent.mm.ui.chatting.viewitems.rk(g6Var.f205274s);
        }
        b18.setOnClickListener(g6Var.f205276u);
        yb5.d dVar = this.f471881e;
        kotlin.jvm.internal.o.f(((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).f200111m, "getChatBgAttr(...)");
        android.view.ViewGroup.LayoutParams layoutParams = it.b().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.view.View view = it.f472094e;
        if (view == null) {
            kotlin.jvm.internal.o.o("captureTipsBg");
            throw null;
        }
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        view.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) cVar.a(sb5.e.class))).n0());
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) cVar.a(sb5.e.class))).o0(0);
        }
        it.b().setLayoutParams(marginLayoutParams);
        return jz5.f0.f302826a;
    }
}
