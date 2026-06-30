package qa2;

/* loaded from: classes2.dex */
public final class a extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f361033e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f361034f;

    public a(java.util.List dataList, boolean z17) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f361033e = dataList;
        this.f361034f = z17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b_o;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ra2.b item = (ra2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.ogz);
        textView.setTextSize(1, 12.0f);
        textView.setText(item.f393484d.getString(0));
        boolean z18 = i17 == item.f393485e.f393483a;
        boolean z19 = this.f361034f;
        android.content.Context context = holder.f293121e;
        textView.setTextColor(z18 ? !z19 ? context.getColor(com.tencent.mm.R.color.FG_0) : context.getColor(com.tencent.mm.R.color.f478980mj) : !z19 ? context.getColor(com.tencent.mm.R.color.FG_1) : context.getColor(com.tencent.mm.R.color.f478985mo));
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.ogy);
        int i19 = i17 == this.f361033e.size() - 1 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/topic/convert/FinderTopicInnerTabItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/topic/data/FinderTopicInnerTabData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/topic/convert/FinderTopicInnerTabItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/topic/data/FinderTopicInnerTabData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
