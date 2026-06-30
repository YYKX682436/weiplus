package ui2;

/* loaded from: classes8.dex */
public final class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final si2.a f428099e;

    public i(si2.a aVar) {
        this.f428099e = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eah;
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
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.f484720tm2);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.f484718tm0);
        findViewById.setOnClickListener(new ui2.g(this));
        viewGroup.setOnClickListener(new ui2.h(this));
    }
}
