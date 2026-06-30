package ga2;

/* loaded from: classes2.dex */
public final class e extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f269832e = java.util.regex.Pattern.compile("<_wc_custom_link_>(.*?)</_wc_custom_link_>");

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ed6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ha2.a item = (ha2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.ad1 ad1Var = (r45.ad1) item.f279791d.getCustom(6);
        if (ad1Var == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        android.content.Context context = holder.f293121e;
        layoutParams.width = com.tencent.mm.ui.bh.a(context).f197135a;
        holder.itemView.setLayoutParams(layoutParams);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.s0t);
        i95.m c17 = i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.s6 s6Var = (zy2.s6) c17;
        java.lang.String string = ad1Var.getString(0);
        if (string == null) {
            string = "";
        }
        textView.setText(zy2.s6.l6(s6Var, string, (int) textView.getTextSize(), false, f269832e, context.getResources().getColor(com.tencent.mm.R.color.Link_100), false, null, 100, null));
        int i19 = ad1Var.getInteger(1) != 0 ? 0 : 8;
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f3x);
        if (p17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/convert/FinderPoiLbsUploadGuideConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/poi/data/FinderPoiLbsItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/activity/poi/convert/FinderPoiLbsUploadGuideConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/poi/data/FinderPoiLbsItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
