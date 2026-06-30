package yn2;

/* loaded from: classes2.dex */
public class n extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dkb;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        o(holder);
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, zn2.b item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        vn2.u0 u0Var = vn2.u0.f438387a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder ");
        java.lang.String str = item.f474489d;
        sb6.append(str);
        u0Var.l("Finder.MegaVideo.TitleConvert", sb6.toString());
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.obc);
        textView.setText(str);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = item.f474490e.height;
    }

    public void o(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.obc);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
            textView.setTextColor(holder.f293121e.getResources().getColor(com.tencent.mm.R.color.abw));
        }
    }
}
