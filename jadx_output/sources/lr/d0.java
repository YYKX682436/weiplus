package lr;

/* loaded from: classes13.dex */
public final class d0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f320506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483272a50);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f320506f = (android.widget.ImageView) findViewById;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        ir.z zVar = (ir.z) this.f320581e;
        if (zVar != null) {
            android.widget.ImageView imageView = this.f320506f;
            int i17 = zVar.f293921b;
            if (i17 == 0) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.emoji_add_custom, imageView.getContext().getResources().getColor(com.tencent.mm.R.color.f479265ui)));
                imageView.setContentDescription(imageView.getContext().getString(com.tencent.mm.R.string.iyb));
            } else if (i17 == 1) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.emoji_add_capture, imageView.getContext().getResources().getColor(com.tencent.mm.R.color.f479265ui)));
                imageView.setContentDescription(imageView.getContext().getString(com.tencent.mm.R.string.aql));
            }
        }
    }
}
