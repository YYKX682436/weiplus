package d04;

/* loaded from: classes8.dex */
public final class e2 extends in5.r {
    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        return new d04.b2(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489426en1;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        d04.j2 item = (d04.j2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        if (holder instanceof d04.b2) {
            android.view.View view = ((d04.b2) holder).f225383n;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = item.f225449g;
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
    }
}
