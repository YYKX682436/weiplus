package rn2;

/* loaded from: classes15.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final rn2.t2 f397902a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397903b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f397904c;

    public w(rn2.t2 viewCallback) {
        kotlin.jvm.internal.o.g(viewCallback, "viewCallback");
        this.f397902a = viewCallback;
        this.f397903b = "FinderLiveLotteryCreateGiftHelper";
        this.f397904c = new com.tencent.mm.sdk.coroutines.LifecycleScope("FinderLiveLotteryCreateGiftHelper", viewCallback.f397853e, 0, 4, null);
    }

    public static final void a(rn2.w wVar, android.view.View view, android.widget.TextView textView, android.view.View view2, android.widget.TextView textView2, java.util.List list) {
        int i17;
        wVar.getClass();
        boolean z17 = false;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = list.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (((rn2.y2) it.next()).f397926a && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        int i18 = ((rn2.y2) kz5.n0.X(list)).f397927b;
        if (i17 > 0 && i17 <= i18) {
            z17 = true;
        }
        view.setEnabled(z17);
        java.util.Iterator it6 = list.iterator();
        float f17 = 0.0f;
        while (it6.hasNext()) {
            rn2.y2 y2Var = (rn2.y2) it6.next();
            if (y2Var.f397926a) {
                f17 += y2Var.f397928c.getInteger(1) * y2Var.f397929d.getFloat(9);
            }
        }
        textView2.setText(java.lang.String.valueOf((int) f17));
    }

    public final void b(r45.gz1 gz1Var, java.util.List list) {
        java.util.ArrayList arrayList;
        int i17;
        java.lang.String str = this.f397903b;
        rn2.t2 t2Var = this.f397902a;
        if (gz1Var == null) {
            android.view.View view = t2Var.f397858l1;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper", "updateLotteryGiftLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryPrizeMethod;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper", "updateLotteryGiftLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryPrizeMethod;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.e(str, "updateLotteryGiftList but prizeMethod is null");
        }
        if (!(gz1Var != null && gz1Var.getInteger(0) == 2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLotteryGiftList but prize_type:");
            sb6.append(gz1Var != null ? java.lang.Integer.valueOf(gz1Var.getInteger(0)) : null);
            sb6.append(" is error!");
            com.tencent.mars.xlog.Log.e(str, sb6.toString());
            return;
        }
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((rn2.y2) obj).f397926a) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (gz1Var.getInteger(0) == 2) {
            if (!(arrayList == null || arrayList.isEmpty())) {
                android.view.View view2 = t2Var.f397873x0;
                if (view2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper", "updateLotteryGiftLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryPrizeMethod;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper", "updateLotteryGiftLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryPrizeMethod;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = t2Var.f397876y0;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(t2Var.f397853e, 0, false));
                    rn2.k3 k3Var = new rn2.k3(false, false, 3, null);
                    k3Var.x().clear();
                    k3Var.x().addAll(arrayList);
                    k3Var.notifyDataSetChanged();
                    recyclerView.setAdapter(k3Var);
                }
            }
        }
        android.widget.TextView textView = t2Var.f397864p1;
        if (textView != null) {
            if (arrayList == null || arrayList.isEmpty()) {
                i17 = 0;
            } else {
                java.util.Iterator it = arrayList.iterator();
                float f17 = 0.0f;
                while (it.hasNext()) {
                    f17 += ((rn2.y2) it.next()).f397929d.getFloat(9) * r11.f397928c.getInteger(1);
                }
                i17 = (int) f17;
            }
            textView.setText(java.lang.String.valueOf(i17));
        }
        android.widget.TextView textView2 = t2Var.f397877y1;
        if (textView2 != null) {
            rn2.l0 l0Var = rn2.l0.f397792a;
            r45.vd4 vd4Var = (r45.vd4) gz1Var.getCustom(2);
            java.lang.Integer valueOf = vd4Var != null ? java.lang.Integer.valueOf(vd4Var.getInteger(0)) : null;
            rn2.f fVar = t2Var.f397854f;
            textView2.setText(java.lang.String.valueOf(l0Var.c(valueOf, fVar != null ? ((rn2.c1) fVar).f397671n : 0, arrayList)));
        }
        r45.vd4 vd4Var2 = (r45.vd4) gz1Var.getCustom(2);
        if (vd4Var2 != null && vd4Var2.getInteger(0) == 0) {
            android.view.View view3 = t2Var.f397858l1;
            if (view3 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper", "updateLotteryGiftLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryPrizeMethod;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper", "updateLotteryGiftLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryPrizeMethod;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = t2Var.f397858l1;
        if (view4 == null) {
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper", "updateLotteryGiftLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryPrizeMethod;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper", "updateLotteryGiftLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryPrizeMethod;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
