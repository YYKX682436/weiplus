package lp1;

/* loaded from: classes8.dex */
public final class a extends in5.r {
    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        return new lp1.b(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eex;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        pp1.a item = (pp1.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        if (holder instanceof lp1.b) {
            android.view.View view = holder.itemView;
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/convert/FloatBallListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/ball/ui/floatball/FloatBallLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/convert/FloatBallListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/ball/ui/floatball/FloatBallLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            qp1.g0 g0Var = qp1.g0.f365722a;
            android.widget.FrameLayout frameLayout = ((lp1.b) holder).f320270o;
            android.view.View b17 = g0Var.b(frameLayout);
            sp1.b bVar = b17 instanceof sp1.b ? (sp1.b) b17 : null;
            if (bVar != null) {
                bVar.b(item);
                return;
            }
            frameLayout.removeAllViews();
            android.content.Context context = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ym5.v6.b(frameLayout, new sp1.b(context, item));
        }
    }
}
