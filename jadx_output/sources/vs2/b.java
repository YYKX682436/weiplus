package vs2;

/* loaded from: classes2.dex */
public final class b extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489068dn3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vs2.a item = (vs2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.cl7);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.cjm);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        r45.m66 m66Var = item.f439871d;
        wo0.c b17 = e17.b(new mn2.q3(m66Var.getString(0), com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.B));
        kotlin.jvm.internal.o.d(imageView);
        b17.c(imageView);
        java.lang.String string = holder.f293121e.getResources().getString(com.tencent.mm.R.string.nyu, java.lang.Integer.valueOf(m66Var.getInteger(2)));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (textView != null) {
            textView.setText(string);
        }
        if (m66Var.getInteger(2) > 0) {
            android.view.View view = holder.itemView;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/redpacket/FinderRedPacketCoverConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/redpacket/CoverConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/redpacket/FinderRedPacketCoverConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/redpacket/CoverConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view2 = holder.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/redpacket/FinderRedPacketCoverConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/redpacket/CoverConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/redpacket/FinderRedPacketCoverConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/redpacket/CoverConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(item.f439872e ? 0 : 4);
    }
}
