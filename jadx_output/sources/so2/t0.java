package so2;

/* loaded from: classes2.dex */
public final class t0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u0 f410603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.s0 f410604e;

    public t0(so2.u0 u0Var, so2.s0 s0Var) {
        this.f410603d = u0Var;
        this.f410604e = s0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        so2.u0 u0Var = this.f410603d;
        if ((u0Var.f410620b.f410572f && i17 != 0) || !hc2.e.a()) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        yz5.l lVar = u0Var.f410629k;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        int y17 = linearLayoutManager.y();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - u0Var.f410624f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(recyclerView + " state=" + i17 + ",pos=" + y17 + "(lastPos=" + u0Var.f410625g + "),before time=" + u0Var.f410624f + " curTime=" + currentTimeMillis + ",duration=" + j17 + ",fastScrollCnt=" + u0Var.f410622d + " continueFastScrollCnt=" + u0Var.f410621c + ';');
        if (y17 == -1 || y17 == u0Var.f410625g) {
            str = "onScrollStateChanged";
        } else {
            str = "onScrollStateChanged";
            boolean z19 = true;
            if (j17 <= u0Var.f410620b.f410567a) {
                so2.s0 s0Var = this.f410604e;
                if (s0Var == null) {
                    z17 = true;
                } else {
                    z17 = s0Var.a(recyclerView, y17);
                    sb6.append("itemValid=" + z17 + ',');
                }
                if (z17) {
                    u0Var.f410622d++;
                    u0Var.f410621c++;
                    if (y17 > u0Var.f410625g) {
                        int i18 = u0Var.f410623e + 1;
                        u0Var.f410623e = i18;
                        int i19 = u0Var.f410620b.f410570d;
                        if (i19 != -1 && i18 >= i19) {
                            yz5.l lVar2 = u0Var.f410628j;
                            if (lVar2 != null) {
                                lVar2.invoke(java.lang.Boolean.TRUE);
                            }
                            if (u0Var.f410620b.f410571e) {
                                u0Var.f410623e = 0;
                            }
                        }
                    } else {
                        u0Var.f410623e = 0;
                    }
                }
            } else {
                u0Var.f410621c = 0;
                u0Var.f410623e = 0;
                z17 = false;
            }
            sb6.append("hitFastScroll=" + z17 + ",after fastScrollCnt=" + u0Var.f410622d + " continueFastScrollCnt=" + u0Var.f410621c + " consecutiveUpwardFastSlipCnt:" + u0Var.f410623e + ';');
            u0Var.f410624f = currentTimeMillis;
            so2.r0 r0Var = u0Var.f410620b;
            int i27 = r0Var.f410568b;
            if (i27 == -1 || u0Var.f410622d < i27) {
                z18 = false;
            } else {
                if (r0Var.f410571e) {
                    u0Var.f410622d = 0;
                }
                z18 = true;
            }
            int i28 = r0Var.f410569c;
            if (i28 == -1 || u0Var.f410621c < i28) {
                z19 = false;
            } else if (r0Var.f410571e) {
                u0Var.f410621c = 0;
            }
            if ((z18 || z19) && (pVar = u0Var.f410627i) != null) {
                pVar.invoke(java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            }
            sb6.append("amountToFastScrollCnt=" + z18 + ",amountToContinueFastScrollCnt=" + z19);
            if (y17 != u0Var.f410625g) {
                u0Var.b("lastPos from " + u0Var.f410625g + " to " + y17);
            }
            u0Var.f410625g = y17;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        u0Var.b(sb7);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", str, "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
