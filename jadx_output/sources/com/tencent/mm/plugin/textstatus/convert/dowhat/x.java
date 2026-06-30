package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class x extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.dowhat.v f173252e;

    public x(com.tencent.mm.plugin.textstatus.convert.dowhat.v vVar) {
        this.f173252e = vVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489566d02;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ej4.k item = (ej4.k) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.d0v);
        int i19 = i17 == 0 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/RecentStatusInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/RecentStatusInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bk4.f a17 = bk4.i.a();
        java.lang.String str = item.f253369d;
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.opz)).setText(item.f253370e);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hnw);
        if (i17 == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(0);
            imageView.setLayoutParams(layoutParams2);
        }
        bk4.f.V(a17, imageView, str, null, null, null, false, false, 124, null);
        imageView.setAlpha(0.5f);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.dowhat.w(this, item));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
