package ex3;

/* loaded from: classes.dex */
public final class d extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cfq;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        ex3.e item = (ex3.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.dp5 dp5Var = item.f257209f;
        int i19 = item.f257208e;
        if (i19 == 0) {
            string = "[置顶] " + dp5Var.getString(1);
        } else {
            string = i19 == 2 ? "配置策略" : i19 == 3 ? "配置值" : dp5Var.getString(1);
        }
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf)).setText(string);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.own);
        if (dp5Var.getInteger(2) != 3) {
            textView.setVisibility(8);
        } else {
            textView.setText(item.f257210g);
            textView.setVisibility(0);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
