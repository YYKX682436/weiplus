package rf2;

/* loaded from: classes10.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f394679a;

    /* renamed from: b, reason: collision with root package name */
    public final df2.un f394680b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f394681c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f394682d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f394683e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f394684f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f394685g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.r f394686h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.q f394687i;

    public c2(android.view.View root, df2.un controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f394679a = root;
        this.f394680b = controller;
        this.f394681c = "Finder.MileStoneVoteWidget";
        this.f394683e = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rf2.c2 r22, rf2.d2 r23, java.lang.String r24, android.widget.TextView r25, java.lang.String r26, android.view.View r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.c2.a(rf2.c2, rf2.d2, java.lang.String, android.widget.TextView, java.lang.String, android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(mm2.r4 r4Var, android.view.View view, android.widget.TextView textView) {
        boolean z17;
        java.lang.Object obj;
        if (r4Var == null) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.Iterator it = this.f394683e.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((rf2.d2) obj).f394695d.getInteger(2) > 0) {
                    break;
                }
            }
        }
        boolean z18 = obj != null;
        int i17 = r4Var.f329377b;
        if (!(1 <= i17 && i17 < 60) && !z18) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i(this.f394681c, "refreshVoteCountDownText selfVoted:" + z18 + ", showCountDown:" + z17 + ", data.localRemainTime:" + r4Var.f329377b);
        android.widget.TextView textView2 = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.p8v) : null;
        int i18 = r4Var.f329377b;
        android.view.View view2 = this.f394679a;
        if (i18 <= 0 && z18) {
            if (textView != null) {
                textView.setText("");
            }
            if (textView2 == null) {
                return;
            }
            textView2.setText(view2.getContext().getString(com.tencent.mm.R.string.dpn));
            return;
        }
        if (!z17) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String a17 = no0.l.a(no0.m.f338730a, r4Var.f329377b, ":", false, false, false, 24, null);
        if (textView != null) {
            textView.setText(a17);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setText(view2.getContext().getString(com.tencent.mm.R.string.dpr));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r26, boolean r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.c2.c(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(java.lang.String str, android.widget.TextView textView, android.view.View view, java.lang.String str2, boolean z17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.String str3;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.lang.String str4;
        java.util.ArrayList<rf2.d2> arrayList = this.f394683e;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((rf2.d2) obj2).f394695d.getInteger(2) > 0) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        boolean z28 = obj2 != null;
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((rf2.d2) next).f394696e) {
                obj = next;
                break;
            }
        }
        boolean z29 = obj != null;
        mm2.r4 P6 = ((mm2.v4) this.f394680b.business(mm2.v4.class)).P6();
        boolean z37 = (P6 != null ? P6.f329376a : 1) == 1;
        java.lang.String str5 = this.f394681c;
        com.tencent.mars.xlog.Log.i(str5, "refreshVoteState selfVoted:" + z28 + ", hasSelected:" + z29 + ", isRunning:" + z37);
        if (z28) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            java.lang.String str6 = str5;
            z19 = false;
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            long j17 = 0;
            for (rf2.d2 d2Var : arrayList) {
                d2Var.f394697f = true;
                boolean z38 = d2Var.f394696e;
                r45.l30 l30Var = d2Var.f394695d;
                if (!z38) {
                    str4 = str6;
                } else if (l30Var.getInteger(3) < 1) {
                    str4 = str6;
                    com.tencent.mars.xlog.Log.i(str4, "refreshVoteState " + d2Var.f394699h + " modify select_count to 1");
                    l30Var.set(3, 1);
                } else {
                    str4 = str6;
                }
                j17 += l30Var.getInteger(3);
                str6 = str4;
            }
            java.lang.String str7 = str6;
            z18 = true;
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                ((rf2.d2) it7.next()).f394698g = j17;
            }
            com.tencent.mars.xlog.Log.i(str7, "refreshVoteState totalCount:" + j17);
            z27 = z28;
            str3 = str7;
        } else {
            z18 = true;
            z19 = false;
            textView.setVisibility(0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            z27 = z28;
            str3 = str5;
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((rf2.d2) it8.next()).f394697f = false;
            }
            android.view.View view2 = this.f394679a;
            if (z37) {
                if (z17) {
                    rf2.t.f(rf2.t.f394890a, str, 7, null, null, null, 28, null);
                }
                textView.setText(view2.getContext().getString(com.tencent.mm.R.string.dry));
                if (z29) {
                    boolean d17 = com.tencent.mm.plugin.finder.live.util.k2.d(textView, 9, 8);
                    boolean e17 = com.tencent.mm.plugin.finder.live.util.k2.e(textView, 8);
                    if (!d17 || !e17) {
                        textView.setBackgroundResource(com.tencent.mm.R.drawable.f481735a50);
                        textView.setTextColor(view2.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                    }
                } else {
                    boolean d18 = com.tencent.mm.plugin.finder.live.util.k2.d(textView, 7, 8);
                    boolean e18 = com.tencent.mm.plugin.finder.live.util.k2.e(textView, 6);
                    if (!d18 || !e18) {
                        textView.setBackgroundResource(com.tencent.mm.R.drawable.f481736a51);
                        textView.setTextColor(view2.getContext().getResources().getColor(com.tencent.mm.R.color.aeu));
                    }
                }
            } else {
                textView.setText(view2.getContext().getString(com.tencent.mm.R.string.dqc));
                boolean d19 = com.tencent.mm.plugin.finder.live.util.k2.d(textView, 7, 8);
                boolean e19 = com.tencent.mm.plugin.finder.live.util.k2.e(textView, 6);
                if (!d19 || !e19) {
                    textView.setBackgroundResource(com.tencent.mm.R.drawable.f481736a51);
                    textView.setTextColor(view2.getContext().getResources().getColor(com.tencent.mm.R.color.aeu));
                }
            }
        }
        java.lang.String str8 = str3;
        com.tencent.mars.xlog.Log.i(str8, "refresh onChoiceClickListener, lotteryId:" + str + ", voteId:" + str2);
        boolean z39 = z27;
        boolean z47 = z37;
        boolean z48 = z19;
        boolean z49 = z18;
        this.f394686h = new rf2.x1(this, str, textView, view, str2);
        if (z39 || !z47) {
            this.f394685g = z48;
            textView.setOnClickListener(rf2.y1.f394967d);
        } else {
            this.f394685g = z49;
        }
        com.tencent.mars.xlog.Log.i(str8, "refresh enableChoiceClick:" + this.f394685g);
        if (!z17 || (wxRecyclerView = this.f394684f) == null || (adapter = wxRecyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
