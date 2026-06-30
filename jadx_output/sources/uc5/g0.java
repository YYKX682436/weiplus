package uc5;

/* loaded from: classes4.dex */
public final class g0 extends in5.r {
    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.ekn, (android.view.ViewGroup) recyclerView, false);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        uc5.l0 item = (uc5.l0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        uc5.i0 i0Var = item instanceof uc5.i0 ? (uc5.i0) item : null;
        if (i0Var == null) {
            return;
        }
        android.view.View view = holder.itemView;
        android.content.Context context = view.getContext();
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ups)).setText(context.getString(com.tencent.mm.R.string.pbv));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.upr);
        kotlin.jvm.internal.o.f(recyclerView, "getPersonRecommendRv(...)");
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
            recyclerView.N(new uc5.f0(context));
        }
        java.lang.Object context2 = holder.itemView.getContext();
        uc5.r rVar = context2 instanceof uc5.r ? (uc5.r) context2 : null;
        java.lang.String j76 = rVar != null ? ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) rVar).j7() : "";
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        uc5.e0 e0Var = adapter instanceof uc5.e0 ? (uc5.e0) adapter : null;
        java.util.List newItems = i0Var.f426501d;
        if (e0Var != null) {
            kotlin.jvm.internal.o.g(newItems, "newItems");
            e0Var.f426480d = newItems;
            e0Var.f426481e = j76;
            e0Var.notifyDataSetChanged();
        } else {
            recyclerView.setAdapter(new uc5.e0(newItems, j76));
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.f11941i = true;
    }
}
