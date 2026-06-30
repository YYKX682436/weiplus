package ui2;

/* loaded from: classes8.dex */
public final class n extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final si2.a f428104e;

    public n(si2.a aVar) {
        this.f428104e = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eaj;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.b item = (vi2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f11941i = true;
        }
        com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.f484721tm3);
        if (roundCornerLinearLayout != null) {
            float dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            roundCornerLinearLayout.c(dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f484723tm5);
        if (textView != null) {
            int i19 = item.f437538h;
            if (i19 == 0) {
                textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.dm8));
            } else {
                textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f491599nr2, java.lang.Integer.valueOf(i19)));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f484722tm4);
        if (imageView != null) {
            imageView.setOnClickListener(new ui2.m(this));
        }
    }
}
