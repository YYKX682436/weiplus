package lr;

/* loaded from: classes12.dex */
public class v0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f320594f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.emoji.view.EmojiStatusView f320595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.view.View itemView, boolean z17, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f320594f = z17;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483272a50);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f320595g = (com.tencent.mm.emoji.view.EmojiStatusView) findViewById;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        ir.g gVar;
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.f482326bf);
        int i17 = this.f320594f ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/emoji/panel/adapter/SimilarEmojiHeadViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/emoji/panel/adapter/SimilarEmojiHeadViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView = this.f320595g;
        if (emojiStatusView.getEmojiInfo() != null || (gVar = (ir.g) this.f320581e) == null) {
            return;
        }
        emojiStatusView.setEmojiInfo(gVar.f293836b);
    }
}
