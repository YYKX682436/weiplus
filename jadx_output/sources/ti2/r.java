package ti2;

/* loaded from: classes8.dex */
public class r extends ti2.i {
    @Override // ti2.i, in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488845am5;
    }

    @Override // ti2.i, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, vi2.e item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.f482343bx);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.a3k);
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }
}
