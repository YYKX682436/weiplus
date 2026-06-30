package uc5;

/* loaded from: classes4.dex */
public final class o0 extends in5.r {
    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.ekr, (android.view.ViewGroup) recyclerView, false);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        uc5.l0 item = (uc5.l0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        uc5.k0 k0Var = item instanceof uc5.k0 ? (uc5.k0) item : null;
        if (k0Var == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.o7z);
        java.lang.String str = k0Var.f426519f;
        textView.setText(str);
        textView.setContentDescription(str);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.f11941i = true;
    }
}
