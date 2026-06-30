package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w7 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.x7 f120154h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.c f120155i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f120156m;

    /* renamed from: n, reason: collision with root package name */
    public vm2.c0 f120157n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.x7 callback) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f120154h = callback;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.e8d;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int id6 = view.getId();
        fg2.c cVar = this.f120155i;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (id6 == cVar.f261955d.getId()) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorOptionWidget", "onClick: seat edit");
            df2.q1 q1Var = (df2.q1) this.f120154h;
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorOptionController", "onSeatEditClick, curUsername=" + q1Var.f231128o);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_LINK_USERNAME", q1Var.f231128o);
            q1Var.X6(qo0.b.f365341d4, bundle);
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f120156m = new java.util.ArrayList();
        int i17 = com.tencent.mm.R.id.tgb;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(rootView, com.tencent.mm.R.id.tgb);
        if (wxRecyclerView != null) {
            i17 = com.tencent.mm.R.id.tgc;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.tgc);
            if (weImageView != null) {
                i17 = com.tencent.mm.R.id.tgd;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tgd);
                if (linearLayout != null) {
                    i17 = com.tencent.mm.R.id.tge;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tge);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.f487794zm;
                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f487794zm);
                        if (textView2 != null) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) rootView;
                            this.f120155i = new fg2.c(constraintLayout, wxRecyclerView, weImageView, linearLayout, textView, textView2, constraintLayout);
                            linearLayout.setOnClickListener(this);
                            fg2.c cVar = this.f120155i;
                            if (cVar == null) {
                                kotlin.jvm.internal.o.o("binding");
                                throw null;
                            }
                            android.widget.TextView finderLiveAnchorOptionSeatTitle = cVar.f261954c;
                            kotlin.jvm.internal.o.f(finderLiveAnchorOptionSeatTitle, "finderLiveAnchorOptionSeatTitle");
                            com.tencent.mm.ui.fk.b(finderLiveAnchorOptionSeatTitle);
                            fg2.c cVar2 = this.f120155i;
                            if (cVar2 == null) {
                                kotlin.jvm.internal.o.o("binding");
                                throw null;
                            }
                            android.widget.TextView finderLiveAnchorOptionSeatName = cVar2.f261956e;
                            kotlin.jvm.internal.o.f(finderLiveAnchorOptionSeatName, "finderLiveAnchorOptionSeatName");
                            com.tencent.mm.ui.fk.b(finderLiveAnchorOptionSeatName);
                            fg2.c cVar3 = this.f120155i;
                            if (cVar3 == null) {
                                kotlin.jvm.internal.o.o("binding");
                                throw null;
                            }
                            android.content.Context context = this.f118381d;
                            cVar3.f261953b.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
                            int a17 = com.tencent.mm.ui.zk.a(context, 24);
                            fg2.c cVar4 = this.f120155i;
                            if (cVar4 == null) {
                                kotlin.jvm.internal.o.o("binding");
                                throw null;
                            }
                            cVar4.f261953b.N(new com.tencent.mm.plugin.finder.live.widget.u7(a17));
                            java.util.ArrayList arrayList = this.f120156m;
                            if (arrayList == null) {
                                kotlin.jvm.internal.o.o("dataList");
                                throw null;
                            }
                            vm2.c0 c0Var = new vm2.c0(arrayList);
                            c0Var.f293105o = new com.tencent.mm.plugin.finder.live.widget.v7(this);
                            fg2.c cVar5 = this.f120155i;
                            if (cVar5 == null) {
                                kotlin.jvm.internal.o.o("binding");
                                throw null;
                            }
                            cVar5.f261953b.setAdapter(c0Var);
                            this.f120157n = c0Var;
                            return;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        ((df2.q1) this.f120154h).f231126m = null;
    }
}
