package eg4;

/* loaded from: classes4.dex */
public final class y extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dyi;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        eg4.d2 item = (eg4.d2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.itemView.getContext();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f482698lm);
        boolean z18 = item.f252690d;
        if (textView != null) {
            textView.setVisibility(z18 ? 0 : 8);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.mfo);
        if (viewGroup != null) {
            viewGroup.setVisibility(z18 ? 8 : 0);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.mfo);
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new eg4.v(context, item));
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.f482696lk);
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new eg4.x(context, item));
        }
    }
}
