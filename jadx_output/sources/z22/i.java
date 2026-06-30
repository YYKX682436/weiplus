package z22;

/* loaded from: classes10.dex */
public final class i extends z22.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z22.l lVar, android.view.View itemView) {
        super(lVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    @Override // z22.h
    public void i(int i17, r45.p64 info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.widget.ImageView imageView = this.f469724d;
        kotlin.jvm.internal.o.f(imageView, "<get-icon>(...)");
        y22.n.d(imageView, com.tencent.mm.R.raw.icons_outlined_no_effect, imageView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.f469725e.setText(com.tencent.mm.R.string.bv8);
    }
}
