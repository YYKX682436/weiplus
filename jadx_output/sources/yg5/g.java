package yg5;

/* loaded from: classes.dex */
public final class g extends in5.r {
    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.egx, (android.view.ViewGroup) null);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        yg5.d item = (yg5.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.u0f)).setText(item.f462345f);
    }
}
