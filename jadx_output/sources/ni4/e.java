package ni4;

/* loaded from: classes3.dex */
public final class e extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.d0b;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.g item = (lj4.g) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oqh)).setText(item.f318985d);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oqk)).setText("共324人 同城23人");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
