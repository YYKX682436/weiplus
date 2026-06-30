package vm2;

/* loaded from: classes.dex */
public final class y extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f438131d;

    /* renamed from: e, reason: collision with root package name */
    public int f438132e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f438133f = new java.util.LinkedList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f438133f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        vm2.w holder = (vm2.w) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f438133f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.f62 f62Var = (r45.f62) obj;
        android.widget.TextView textView = holder.f438125e;
        com.tencent.mm.ui.bk.q0(textView.getPaint());
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.f484831ro2);
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.f484832ro3);
        int i18 = i17 == 0 ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i19 = i17 == getItemCount() - 1 ? 4 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.itemView.setOnClickListener(new vm2.x(this, i17));
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.ro8)).setText(java.lang.String.valueOf(i17));
        boolean z17 = i17 == this.f438132e;
        android.widget.TextView textView2 = holder.f438126f;
        if (z17) {
            android.view.View view = holder.f438124d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder", "selected", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder", "selected", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
        } else {
            android.view.View view2 = holder.f438124d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder", "selected", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder", "selected", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            textView.setAlpha(0.3f);
            textView2.setAlpha(0.3f);
        }
        if (zl2.r4.f473950a.u1(f62Var)) {
            android.view.View view3 = holder.f438128h;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = holder.f438127g;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(holder.itemView.getContext().getString(com.tencent.mm.R.string.mpd));
            textView2.setVisibility(8);
            return;
        }
        android.view.View view5 = holder.f438128h;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = holder.f438127g;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setText(holder.itemView.getContext().getString(com.tencent.mm.R.string.mpc));
        textView2.setVisibility(0);
        textView2.setText(android.text.format.DateFormat.format(holder.itemView.getContext().getString(com.tencent.mm.R.string.mpg), f62Var.getLong(2) * 1000));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dti, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new vm2.w(inflate);
    }
}
