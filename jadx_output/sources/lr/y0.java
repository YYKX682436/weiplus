package lr;

/* loaded from: classes12.dex */
public class y0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f320613f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.emoji.view.EmojiStatusView f320614g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ProgressBar f320615h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f320616i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.view.View itemView, boolean z17, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f320613f = z17;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483272a50);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView = (com.tencent.mm.emoji.view.EmojiStatusView) findViewById;
        this.f320614g = emojiStatusView;
        this.f320615h = (android.widget.ProgressBar) itemView.findViewById(com.tencent.mm.R.id.czj);
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f483273a51);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.krb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f320616i = (android.widget.TextView) findViewById3;
        emojiStatusView.setDefaultImageResource(0);
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        ir.g gVar = (ir.g) this.f320581e;
        if (gVar != null) {
            android.widget.ProgressBar progressBar = this.f320615h;
            com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView = this.f320614g;
            if (progressBar != null) {
                emojiStatusView.setStatusListener(new lr.x0(this));
                emojiStatusView.setImageDrawable(null);
            }
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = gVar.f293836b;
            int B0 = iEmojiInfo.B0();
            android.widget.TextView textView = this.f320616i;
            if (B0 == 1) {
                textView.setVisibility(0);
                emojiStatusView.setContentDescription(this.itemView.getContext().getString(com.tencent.mm.R.string.bx6) + iEmojiInfo.E1());
            } else {
                textView.setVisibility(8);
                emojiStatusView.setContentDescription(iEmojiInfo.E1());
            }
            emojiStatusView.y();
            com.tencent.mm.api.IEmojiInfo emojiInfo = emojiStatusView.getEmojiInfo();
            if (!kotlin.jvm.internal.o.b(emojiInfo != null ? emojiInfo.getMd5() : null, iEmojiInfo.getMd5())) {
                emojiStatusView.setImageDrawable(new android.graphics.drawable.ColorDrawable(emojiStatusView.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d)));
            }
            if (this.f320613f) {
                emojiStatusView.setEmojiInfo(iEmojiInfo);
                emojiStatusView.setContentDescription(iEmojiInfo.E1());
            } else {
                zq.h hVar = zq.h.f474972a;
                kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                hVar.d((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, emojiStatusView, new android.graphics.drawable.ColorDrawable(emojiStatusView.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d)));
            }
        }
    }
}
