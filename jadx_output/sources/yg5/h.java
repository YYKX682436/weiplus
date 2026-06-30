package yg5;

/* loaded from: classes2.dex */
public final class h extends in5.r {
    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.egy, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        yg5.e item = (yg5.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View view = holder.itemView;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ung);
        textView.setText(item.f462351g);
        boolean z18 = item.f462352h;
        android.content.Context context = holder.f293121e;
        if (z18) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.agk, null));
            com.tencent.mm.ui.fk.a(textView);
        } else {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.agj, null));
            com.tencent.mm.ui.fk.c(textView);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.u0d);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i65.a.h(context, com.tencent.mm.R.dimen.f479648bn));
        gradientDrawable.setColor(context.getResources().getColor(!com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.f478491c : com.tencent.mm.R.color.abz, null));
        frameLayout.setBackground(gradientDrawable);
    }
}
