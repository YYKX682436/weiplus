package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class po extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f132855e;

    public po(yz5.l isLast) {
        kotlin.jvm.internal.o.g(isLast, "isLast");
        this.f132855e = isLast;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.arf;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.view.View view;
        int i19;
        int i27;
        com.tencent.mm.plugin.finder.view.dk item = (com.tencent.mm.plugin.finder.view.dk) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ezm);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ezl);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.ezj);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ezk);
        r45.u24 u24Var = (r45.u24) item.f131900d;
        java.lang.String string = u24Var.getString(0);
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        int integer = u24Var.getInteger(1);
        android.content.Context context = holder.f293121e;
        if (integer == 7 && item.f131901e) {
            r45.j73 j73Var = (r45.j73) u24Var.getCustom(2);
            int integer2 = j73Var != null ? j73Var.getInteger(1) : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTeamConditionBottomSheet", "current setting value: " + integer2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            view = p18;
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String valueOf = java.lang.String.valueOf(integer2);
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.coin_icon, context.getResources().getColor(com.tencent.mm.R.color.Link_100));
            e17.setBounds(0, 0, i65.a.f(context, com.tencent.mm.R.dimen.f479688cn), i65.a.f(context, com.tencent.mm.R.dimen.f479688cn));
            ((ke0.e) xVar).getClass();
            java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            i19 = 1;
            spannableStringBuilder.setSpan(new al5.w(e17, 1), 0, 1, 17);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            spannableStringBuilder.append((java.lang.CharSequence) valueOf);
            textView2.setText(spannableStringBuilder);
            i27 = 8;
        } else {
            view = p18;
            i19 = 1;
            textView2.setVisibility(8);
            if (item.f131901e) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                i27 = 8;
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                i27 = 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (u24Var.getInteger(i19) == i19) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479001n5));
        } else {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        if (((java.lang.Boolean) this.f132855e.invoke(java.lang.Integer.valueOf(i17))).booleanValue()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = view;
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = view;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
