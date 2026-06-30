package ui2;

/* loaded from: classes8.dex */
public final class b extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final si2.a f428089e;

    public b(si2.a aVar) {
        this.f428089e = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eae;
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
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.tlc);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new ui2.a(this));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.tld);
        boolean z18 = item.f437537g;
        if (textView != null) {
            if (z18) {
                textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f491667dv0));
            } else {
                textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.dvs));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.tle);
        if (imageView != null) {
            if (z18) {
                imageView.setRotation(-90.0f);
            } else {
                imageView.setRotation(90.0f);
            }
        }
    }
}
