package ri5;

/* loaded from: classes.dex */
public final class l extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489333el4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ri5.j item = (ri5.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View view = holder.itemView;
        em.n2 n2Var = new em.n2(view);
        n2Var.a().setText(holder.f293121e.getString(com.tencent.mm.R.string.f491375nm2));
        if (item.f396118o) {
            n2Var.b().setVisibility(0);
            n2Var.a().setText(item.f396119p);
            if (item.f396121r) {
                com.tencent.mm.ui.bk.s0(n2Var.a().getPaint());
            }
        } else {
            n2Var.b().setVisibility(8);
        }
        if (item.f396120q != 0) {
            n2Var.b().setBackgroundColor(item.f396120q);
            n2Var.a().setBackgroundColor(item.f396120q);
        }
        java.lang.CharSequence charSequence = item.f396112g;
        if (n2Var.f254641c == null) {
            n2Var.f254641c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence, n2Var.f254641c);
        java.lang.CharSequence charSequence2 = item.f396117n;
        if (n2Var.f254640b == null) {
            n2Var.f254640b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cut);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence2, n2Var.f254640b);
        super.h(holder, item, i17, i18, z17, list);
    }
}
