package lr;

/* loaded from: classes12.dex */
public class c0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f320501f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f320502g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483272a50);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f320501f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f483273a51);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f320502g = (android.widget.TextView) findViewById2;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        ir.g gVar = (ir.g) this.f320581e;
        if (gVar != null) {
            android.widget.ImageView imageView = this.f320501f;
            int i17 = gVar.f293837c;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = gVar.f293836b;
            if (i17 != 3) {
                zq.h hVar = zq.h.f474972a;
                kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                hVar.d((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, imageView, null);
            } else {
                zq.h.f474972a.b(imageView);
                imageView.setImageResource(com.tencent.mm.R.drawable.emoji_download_icon);
            }
            android.widget.TextView textView = this.f320502g;
            if (i17 == 2) {
                textView.setVisibility(0);
                java.lang.String v17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().v(iEmojiInfo.getMd5());
                textView.setText(v17);
                imageView.setContentDescription(v17);
            } else {
                if (iEmojiInfo.getMd5().equals("08f223fa83f1ca34e143d1e580252c7c")) {
                    imageView.setContentDescription(this.itemView.getContext().getString(com.tencent.mm.R.string.f491096bw0));
                } else if (iEmojiInfo.getMd5().equals("9bd1281af3a31710a45b84d736363691")) {
                    imageView.setContentDescription(this.itemView.getContext().getString(com.tencent.mm.R.string.bwj));
                } else {
                    imageView.setContentDescription(((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().v(iEmojiInfo.getMd5()));
                }
                textView.setVisibility(8);
            }
            if (n22.m.j(iEmojiInfo)) {
                imageView.setContentDescription(this.itemView.getContext().getString(com.tencent.mm.R.string.bvu));
            }
        }
    }
}
