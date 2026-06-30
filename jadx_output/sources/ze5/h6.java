package ze5;

/* loaded from: classes9.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.k6 f471967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f471969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471970g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(ze5.k6 k6Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, yb5.d dVar) {
        super(1);
        this.f471967d = k6Var;
        this.f471968e = f9Var;
        this.f471969f = emojiInfo;
        this.f471970g = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.m6 it = (ze5.m6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.ImageView imageView = it.f472092c;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("tickImageView");
            throw null;
        }
        if (imageView == null) {
            kotlin.jvm.internal.o.o("tickImageView");
            throw null;
        }
        imageView.setVisibility(8);
        boolean z17 = this.f471968e.P0() < 2;
        ze5.k6 k6Var = this.f471967d;
        k6Var.Z(it, z17, true);
        if (n22.m.r(this.f471969f)) {
            android.view.View b17 = it.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiTo$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiTo$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View b18 = it.b();
            if (k6Var.f205378u == null) {
                k6Var.f205378u = new com.tencent.mm.ui.chatting.viewitems.rk(k6Var.f205376s);
            }
            b18.setOnClickListener(k6Var.f205378u);
            android.view.View view = it.f472094e;
            if (view == null) {
                kotlin.jvm.internal.o.o("captureTipsBg");
                throw null;
            }
            yb5.d dVar = this.f471970g;
            view.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).n0());
            android.view.ViewGroup.LayoutParams layoutParams = it.b().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).o0(0);
            }
            it.b().setLayoutParams(marginLayoutParams);
        } else {
            android.view.View b19 = it.b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b19, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiTo$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b19, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiTo$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
