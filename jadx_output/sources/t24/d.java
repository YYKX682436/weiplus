package t24;

/* loaded from: classes.dex */
public final class d extends a24.g {
    @Override // a24.g, in5.r
    public int e() {
        return com.tencent.mm.R.layout.c_e;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        c24.f item = (c24.f) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        p(holder, item, i17, i18, z17, list);
        a24.i iVar = item.f38077e;
        if (iVar instanceof s24.d) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o3b);
            if (textView != null) {
                textView.setText(iVar.c7());
            }
            holder.itemView.getLayoutParams().height = -2;
        }
    }
}
