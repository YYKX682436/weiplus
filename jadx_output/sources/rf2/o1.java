package rf2;

/* loaded from: classes10.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f394836a;

    /* renamed from: b, reason: collision with root package name */
    public final df2.un f394837b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f394838c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f394839d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f394840e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f394841f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f394842g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f394843h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f394844i;

    public o1(android.view.View root, df2.un controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f394836a = root;
        this.f394837b = controller;
        this.f394838c = "Finder.MileStoneMainWidget";
        this.f394840e = new java.util.ArrayList();
    }

    public static final boolean a(rf2.o1 o1Var) {
        o1Var.getClass();
        if (!zl2.r4.f473950a.w1()) {
            return true;
        }
        android.view.View view = o1Var.f394836a;
        db5.t7.m(view.getContext(), view.getContext().getResources().getString(com.tencent.mm.R.string.dw9));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int, boolean] */
    public final void b(r45.g02 metaInfo, boolean z17, boolean z18) {
        java.lang.Integer num;
        android.view.View view;
        kotlin.jvm.internal.o.g(metaInfo, "metaInfo");
        android.view.View view2 = this.f394836a;
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.j8w);
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.r3i);
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.p_0);
        ?? r132 = 0;
        if (findViewById == null) {
            num = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            num = 0;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 == null) {
            view = findViewById3;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            findViewById2 = findViewById2;
            view = findViewById3;
            r132 = 0;
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(r132)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z18) {
            kotlin.jvm.internal.o.d(findViewById2);
            kotlin.jvm.internal.o.d(findViewById);
            this.f394837b.c7(findViewById2, findViewById, r132);
        }
        java.lang.String str = "initViews " + this.f394839d;
        java.lang.String str2 = this.f394838c;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (!this.f394839d) {
            this.f394839d = true;
            android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.bys);
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new rf2.x0(this));
            }
            android.view.View findViewById5 = view2.findViewById(com.tencent.mm.R.id.j8w);
            this.f394841f = findViewById5 != null ? (android.widget.TextView) findViewById5.findViewById(com.tencent.mm.R.id.odf) : null;
            this.f394842g = findViewById5 != null ? (android.widget.TextView) findViewById5.findViewById(com.tencent.mm.R.id.cut) : null;
            this.f394844i = findViewById5 != null ? (androidx.recyclerview.widget.RecyclerView) findViewById5.findViewById(com.tencent.mm.R.id.iry) : null;
            this.f394843h = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.fgx);
            android.widget.TextView textView = this.f394841f;
            if (textView != null) {
                com.tencent.mm.ui.fk.a(textView);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f394844i;
            if (recyclerView != 0) {
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setNestedScrollingEnabled(r132);
                recyclerView.setAdapter(new rf2.h1(this));
            }
        }
        d(metaInfo);
        if (z17) {
            java.util.LinkedList infos = metaInfo.f374768d;
            kotlin.jvm.internal.o.f(infos, "infos");
            java.util.Iterator it = infos.iterator();
            int i17 = r132;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                int i18 = ((r45.dm4) it.next()).f372572g;
                if ((i18 == 2 || i18 == 3) ? true : r132) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                com.tencent.mars.xlog.Log.i(str2, "autoScroll index:" + i17);
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f394844i;
                java.lang.Object layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(num);
                    arrayList4.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList4);
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    yj0.a.d(linearLayoutManager2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.P(((java.lang.Integer) arrayList4.get(r132)).intValue(), ((java.lang.Integer) arrayList4.get(1)).intValue());
                    yj0.a.f(linearLayoutManager2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
            } else {
                com.tencent.mars.xlog.Log.i(str2, "autoScroll index:" + i17 + " invalid");
            }
        }
        android.widget.TextView textView2 = this.f394841f;
        if (textView2 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView2, 3);
        }
        android.widget.TextView textView3 = this.f394842g;
        if (textView3 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView3, 4);
        }
        android.view.View findViewById6 = view2.findViewById(com.tencent.mm.R.id.df6);
        if (findViewById6 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.f(findViewById6, 1, r132);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.bys);
        if (weImageView != null) {
            com.tencent.mm.plugin.finder.live.util.k2.c(weImageView, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(r45.dm4 r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.o1.c(r45.dm4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(r45.g02 metaInfo) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(metaInfo, "metaInfo");
        android.widget.TextView textView = this.f394841f;
        if (textView != null) {
            java.lang.String str = metaInfo.f374772h;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        android.widget.TextView textView2 = this.f394842g;
        if (textView2 != null) {
            java.lang.String str2 = metaInfo.f374773i;
            textView2.setText(str2 != null ? str2 : "");
        }
        android.widget.ImageView imageView = this.f394843h;
        if (imageView != null) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(metaInfo.f374774m, com.tencent.mm.plugin.finder.storage.y90.f128355e));
            rf2.n1 n1Var = new rf2.n1(this, imageView);
            a17.getClass();
            a17.f447873d = n1Var;
            a17.f();
        }
        java.util.ArrayList arrayList = this.f394840e;
        arrayList.clear();
        arrayList.addAll(metaInfo.f374768d);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f394844i;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
