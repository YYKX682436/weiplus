package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class p3 extends androidx.recyclerview.widget.f2 implements zy2.fc {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.t3 f125815e;

    public p3(com.tencent.mm.plugin.finder.search.t3 t3Var, boolean z17) {
        this.f125815e = t3Var;
        this.f125814d = z17;
    }

    public static void x(com.tencent.mm.plugin.finder.search.p3 p3Var, androidx.recyclerview.widget.k3 k3Var, int i17, int i18, boolean z17, int i19, java.lang.Object obj) {
        java.lang.String username;
        com.tencent.mm.plugin.finder.search.t3 t3Var = p3Var.f125815e;
        if (i18 != 1) {
            if (i18 == 2) {
                int i27 = i17 - 1;
                r45.mu2 mu2Var = (r45.mu2) ((com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) t3Var.f125858e).f125571m.get(i27);
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                ((com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) t3Var.f125858e).c((finderContact == null || (username = finderContact.getUsername()) == null) ? "" : username, i27, 1, null, 0);
                kotlin.jvm.internal.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactItemHolder");
                com.tencent.mm.plugin.finder.search.n3 n3Var = new com.tencent.mm.plugin.finder.search.n3(i17, t3Var);
                int i28 = com.tencent.mm.plugin.finder.search.v2.B;
                ((com.tencent.mm.plugin.finder.search.v2) k3Var).k(mu2Var, n3Var, null, true);
                android.view.View view = k3Var.itemView;
                android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ffc);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) findViewById;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(finderLiveOnliveWidget, "living_label");
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                if (finderContact2 != null && finderContact2.getLiveStatus() == 1) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(finderLiveOnliveWidget, 40, 26236);
                    java.lang.Object tag = view.getTag();
                    kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    jz5.l[] lVarArr = new jz5.l[5];
                    lVarArr[0] = new jz5.l("feed_id", "");
                    lVarArr[1] = new jz5.l("live_id", "");
                    lVarArr[2] = new jz5.l("comment_scene", "23");
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.mu2) tag).getCustom(0);
                    lVarArr[3] = new jz5.l("finder_username", finderContact3 != null ? finderContact3.getUsername() : null);
                    lVarArr[4] = new jz5.l("session_buffer", " ");
                    ((cy1.a) rVar).gk(finderLiveOnliveWidget, kz5.c1.k(lVarArr));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(finderLiveOnliveWidget, com.tencent.mm.plugin.finder.search.o3.f125801a);
                    return;
                }
                return;
            }
            if (i18 != 8) {
                if (i18 != 9) {
                    return;
                }
                kotlin.jvm.internal.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchSafetyHintHolder");
                java.lang.String safetyHint = ((com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) p3Var.f125815e.f125858e).f125575q;
                kotlin.jvm.internal.o.g(safetyHint, "safetyHint");
                ((com.tencent.mm.plugin.finder.search.e3) k3Var).f125673e.setText(safetyHint);
                return;
            }
        }
        kotlin.jvm.internal.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactHeaderHolder");
        com.tencent.mm.plugin.finder.search.r2 r2Var = (com.tencent.mm.plugin.finder.search.r2) k3Var;
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = (com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) t3Var.f125858e;
        boolean z18 = finderMixSearchPresenter.f125571m.size() > 3 && finderMixSearchPresenter.f();
        com.tencent.mm.plugin.finder.search.m3 m3Var = new com.tencent.mm.plugin.finder.search.m3(t3Var);
        android.widget.TextView textView = r2Var.f125835e;
        if (z18) {
            textView.setVisibility(0);
            android.view.View view2 = r2Var.f125836f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder", "onBindView", "(ZLandroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder", "onBindView", "(ZLandroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r2Var.itemView.setOnClickListener(m3Var);
        } else {
            textView.setVisibility(8);
            android.view.View view3 = r2Var.f125836f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder", "onBindView", "(ZLandroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder", "onBindView", "(ZLandroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r2Var.itemView.setOnClickListener(null);
        }
        r2Var.f125837g.setText(r2Var.f125834d);
    }

    @Override // zy2.fc
    public java.util.List getData() {
        return kz5.p0.f313996d;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.finder.search.t3 t3Var = this.f125815e;
        return com.tencent.mm.plugin.finder.search.t3.a(t3Var) + (!com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) t3Var.f125858e).f125575q) ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.finder.search.t3 t3Var = this.f125815e;
        int a17 = com.tencent.mm.plugin.finder.search.t3.a(t3Var);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) t3Var.f125858e).f125575q);
        int y17 = y(i17);
        com.tencent.mars.xlog.Log.i(t3Var.f125860g, "getItemViewType adapterPosition: " + i17 + "  position:" + y17);
        if (i17 == 0 && z17) {
            return 9;
        }
        if (y17 >= a17) {
            return 1;
        }
        if (y17 == 0) {
            return t3Var.g() ? 8 : 1;
        }
        return 2;
    }

    @Override // zy2.fc
    public java.util.List l() {
        return ((com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) this.f125815e.f125858e).f125571m;
    }

    @Override // zy2.fc
    public int n(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        com.tencent.mars.xlog.Log.i(this.f125815e.f125860g, "onBindViewHolder position:" + i17);
        x(this, holder, y(i17), getItemViewType(i17), false, 8, null);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        com.tencent.mm.plugin.finder.search.r2 r2Var;
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.search.t3 t3Var = this.f125815e;
        com.tencent.mars.xlog.Log.i(t3Var.f125860g, "onCreateViewHolder viewType: " + i17);
        int i18 = com.tencent.mm.R.layout.f489033b35;
        boolean z17 = this.f125814d;
        if (i17 == 1) {
            com.tencent.mm.ui.MMActivity mMActivity = t3Var.f125857d;
            kotlin.jvm.internal.o.d(mMActivity);
            android.view.LayoutInflater layoutInflater = mMActivity.getLayoutInflater();
            if (!z17) {
                i18 = com.tencent.mm.R.layout.f489032b34;
            }
            android.view.View inflate = layoutInflater.inflate(i18, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            java.lang.String string = parent.getResources().getString(com.tencent.mm.R.string.f2l);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            r2Var = new com.tencent.mm.plugin.finder.search.r2(inflate, string);
        } else {
            if (i17 == 2) {
                com.tencent.mm.ui.MMActivity mMActivity2 = t3Var.f125857d;
                kotlin.jvm.internal.o.d(mMActivity2);
                android.view.View inflate2 = mMActivity2.getLayoutInflater().inflate(z17 ? com.tencent.mm.R.layout.afj : com.tencent.mm.R.layout.afi, parent, false);
                kotlin.jvm.internal.o.d(inflate2);
                return new com.tencent.mm.plugin.finder.search.v2(inflate2, false, false, false, 14, null);
            }
            if (i17 != 8) {
                if (i17 != 9) {
                    android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b38, parent, false);
                    kotlin.jvm.internal.o.d(inflate3);
                    return new com.tencent.mm.plugin.finder.convert.yu(inflate3);
                }
                android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aik, parent, false);
                kotlin.jvm.internal.o.d(inflate4);
                return new com.tencent.mm.plugin.finder.search.e3(inflate4);
            }
            com.tencent.mm.ui.MMActivity mMActivity3 = t3Var.f125857d;
            kotlin.jvm.internal.o.d(mMActivity3);
            android.view.LayoutInflater layoutInflater2 = mMActivity3.getLayoutInflater();
            if (!z17) {
                i18 = com.tencent.mm.R.layout.f489032b34;
            }
            android.view.View inflate5 = layoutInflater2.inflate(i18, parent, false);
            kotlin.jvm.internal.o.d(inflate5);
            java.lang.String string2 = parent.getResources().getString(com.tencent.mm.R.string.f2z);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            r2Var = new com.tencent.mm.plugin.finder.search.r2(inflate5, string2);
        }
        return r2Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams;
        boolean z17 = true;
        if (holder.getItemViewType() != 1 && holder.getItemViewType() != 8 && holder.getItemViewType() != 2 && holder.getItemViewType() != 9) {
            z17 = false;
        }
        layoutParams2.f11941i = z17;
    }

    public final int y(int i17) {
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) this.f125815e.f125858e).f125575q);
        if (z17 && i17 == 0) {
            return 0;
        }
        return z17 ? i17 - 1 : i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        x(this, holder, y(i17), getItemViewType(i17), false, 8, null);
    }
}
