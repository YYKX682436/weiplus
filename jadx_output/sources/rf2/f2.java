package rf2;

/* loaded from: classes10.dex */
public final class f2 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.br_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
        int i19;
        int i27;
        rf2.d2 item = (rf2.d2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f483713bu0);
        java.lang.String str = item.f394699h;
        if (textView != null) {
            textView.setText(str);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.agx);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.f486477lc4);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.mkk);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.m1w);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.m1t);
        p17.setBackgroundResource(com.tencent.mm.R.drawable.cjg);
        com.tencent.mm.plugin.finder.live.util.k2.f(p17, 12, 8);
        if (item.f394697f) {
            weImageView3.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            if (item.f394696e) {
                weImageView4.setVisibility(0);
                com.tencent.mm.plugin.finder.live.util.k2.e(textView2, 13);
                if (textView != null) {
                    com.tencent.mm.plugin.finder.live.util.k2.e(textView, 13);
                }
                i19 = 8;
                com.tencent.mm.plugin.finder.live.util.k2.f(p18, 11, 8);
                i27 = 3;
            } else {
                i19 = 8;
                weImageView4.setVisibility(8);
                i27 = 3;
                com.tencent.mm.plugin.finder.live.util.k2.e(textView2, 3);
                if (textView != null) {
                    com.tencent.mm.plugin.finder.live.util.k2.e(textView, 3);
                }
                com.tencent.mm.plugin.finder.live.util.k2.f(p18, 12, 8);
            }
            r45.l30 l30Var = item.f394695d;
            textView2.setText(holder.f293121e.getString(com.tencent.mm.R.string.ds6, java.lang.String.valueOf(l30Var.getInteger(i27))));
            if (item.f394698g > 0) {
                float integer = l30Var.getInteger(i27) / ((float) item.f394698g);
                com.tencent.mars.xlog.Log.i("Finder.VoteConvert", "item pos:" + i17 + ' ' + str + ", progress:" + integer + ", count:" + l30Var.getInteger(i27) + ", total:" + item.f394698g);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                holder.itemView.post(new rf2.e2(holder.f293120d, p17, integer, p18, this, i17, item));
                weImageView2 = weImageView3;
                weImageView = weImageView4;
            } else {
                weImageView2 = weImageView3;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList3);
                weImageView = weImageView4;
                yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mars.xlog.Log.i("Finder.VoteConvert", "item pos:" + i17 + ' ' + str + ", totalCount invalid: " + item.f394698g);
            }
        } else {
            weImageView = weImageView4;
            weImageView2 = weImageView3;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p18, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteChoice;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(8);
            textView2.setVisibility(8);
            if (item.f394696e) {
                weImageView2.setVisibility(0);
                com.tencent.mm.plugin.finder.live.util.k2.f(p17, 11, 8);
                if (textView != null) {
                    com.tencent.mm.plugin.finder.live.util.k2.e(textView, 13);
                }
            } else {
                weImageView2.setVisibility(8);
                com.tencent.mm.plugin.finder.live.util.k2.f(p17, 12, 8);
                if (textView != null) {
                    com.tencent.mm.plugin.finder.live.util.k2.e(textView, 3);
                }
            }
        }
        if (weImageView2 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.c(weImageView2, 13);
        }
        if (weImageView != null) {
            com.tencent.mm.plugin.finder.live.util.k2.c(weImageView, 13);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f483713bu0);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
    }
}
