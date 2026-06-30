package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ka extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final java.lang.String H;
    public com.tencent.mm.view.recyclerview.WxRecyclerView I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f116444J;
    public android.view.View K;
    public android.view.View L;
    public yz5.l M;
    public android.widget.TextView N;
    public final int P;
    public bm2.c6 Q;
    public kotlinx.coroutines.r2 R;
    public wt2.a S;
    public int T;
    public int U;
    public final jz5.g V;
    public yz5.l W;
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout X;
    public com.tencent.mm.protobuf.g Y;
    public final com.tencent.mm.plugin.finder.live.view.FinderLivePromoteAddSubWidget$tingEventListener$1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.live.view.FinderLivePromoteAddSubWidget$tingEventListener$1] */
    public ka(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = "FinderLivePromoteAddSubWidget";
        this.P = 1;
        this.T = -1;
        this.V = jz5.h.b(com.tencent.mm.plugin.finder.live.view.t9.f116698d);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.Z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingCategoryChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.view.FinderLivePromoteAddSubWidget$tingEventListener$1
            {
                this.__eventId = -1986766098;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TingCategoryChangeEvent tingCategoryChangeEvent) {
                el2.v2 v2Var;
                java.util.LinkedList linkedList;
                java.lang.Object obj;
                com.tencent.mm.autogen.events.TingCategoryChangeEvent event = tingCategoryChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.live.view.ka kaVar = com.tencent.mm.plugin.finder.live.view.ka.this;
                java.lang.String str = kaVar.H;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[tingEventListener] action = ");
                am.yy yyVar = event.f54893g;
                sb6.append(yyVar.f8491a);
                sb6.append(", isLike = ");
                sb6.append(yyVar.f8492b);
                sb6.append(", isPublic = ");
                sb6.append(yyVar.f8493c);
                sb6.append(", itemId = ");
                sb6.append(yyVar.f8494d.c());
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                bm2.c6 c6Var = kaVar.Q;
                if (c6Var == null || (linkedList = c6Var.f21821h) == null) {
                    v2Var = null;
                } else {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        el2.v2 v2Var2 = (el2.v2) obj;
                        if ((v2Var2 instanceof el2.a3) && kotlin.jvm.internal.o.b(v2Var2.a(), yyVar.f8494d.c())) {
                            break;
                        }
                    }
                    v2Var = (el2.v2) obj;
                }
                int i17 = yyVar.f8491a;
                if (i17 != 3) {
                    if (i17 != 4) {
                        if (i17 == 5 && v2Var != null) {
                            el2.a3 a3Var = v2Var instanceof el2.a3 ? (el2.a3) v2Var : null;
                            r45.qy1 qy1Var = a3Var != null ? a3Var.f253746a : null;
                            if (qy1Var != null) {
                                il4.l lVar = il4.l.f292142a;
                                bw5.o50 item = yyVar.f8494d;
                                kotlin.jvm.internal.o.f(item, "item");
                                qy1Var.set(0, new com.tencent.mm.protobuf.g(lVar.n(item).toByteArray()));
                            }
                            bm2.c6 c6Var2 = kaVar.Q;
                            if (c6Var2 != null) {
                                java.util.LinkedList linkedList2 = c6Var2.f21821h;
                                int indexOf = linkedList2.indexOf(v2Var);
                                if (indexOf >= 0 && indexOf < linkedList2.size()) {
                                    c6Var2.notifyItemChanged(indexOf);
                                }
                            }
                        }
                    } else if (v2Var != null) {
                        com.tencent.mm.plugin.finder.live.view.ka.e0(kaVar, v2Var);
                    }
                } else if (!yyVar.f8493c && v2Var != null) {
                    com.tencent.mm.plugin.finder.live.view.ka.e0(kaVar, v2Var);
                }
                return false;
            }
        };
    }

    public static final void e0(com.tencent.mm.plugin.finder.live.view.ka kaVar, el2.v2 item) {
        bm2.c6 c6Var = kaVar.Q;
        if (c6Var != null) {
            kotlin.jvm.internal.o.g(item, "item");
            java.util.LinkedList linkedList = c6Var.f21821h;
            int indexOf = linkedList.indexOf(item);
            if (indexOf >= 0 && indexOf < linkedList.size()) {
                linkedList.remove(indexOf);
                c6Var.notifyItemRemoved(indexOf);
            }
        }
        int i17 = kaVar.U - 1;
        kaVar.U = i17;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.ga(kaVar, kaVar.T, i17));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.axl;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.I = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.fhv);
        this.f116444J = rootView.findViewById(com.tencent.mm.R.id.fhw);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.fht);
        zl2.r4 r4Var = zl2.r4.f473950a;
        kotlin.jvm.internal.o.d(findViewById);
        zl2.r4.c3(r4Var, findViewById, 0, 0, 6, null);
        this.K = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.fhu);
        kotlin.jvm.internal.o.d(findViewById2);
        zl2.r4.c3(r4Var, findViewById2, 0, 0, 6, null);
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.x9(this));
        this.L = findViewById2;
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.fhx);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        this.N = textView;
        this.Q = new bm2.c6(new com.tencent.mm.plugin.finder.live.view.y9(this), new com.tencent.mm.plugin.finder.live.view.ba(this), new com.tencent.mm.plugin.finder.live.view.ca(this));
        android.view.View view = this.f116444J;
        if (view != null) {
            view.setOnClickListener(com.tencent.mm.plugin.finder.live.view.da.f116255d);
        }
        android.view.View view2 = this.K;
        if (view2 != null) {
            view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.ea(this));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.I;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(this.Q);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.I;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this.f118183e));
        }
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) rootView.findViewById(com.tencent.mm.R.id.f486583lr1);
        wxRefreshLayout.D(new com.tencent.mm.plugin.finder.view.FinderLiveMultiNoticeListFooter(wxRefreshLayout.getContext(), null));
        wxRefreshLayout.setOnSimpleAction(new com.tencent.mm.plugin.finder.live.view.fa(this));
        this.X = wxRefreshLayout;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        g0();
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void f() {
        g0();
    }

    public final gk2.e f0() {
        return (gk2.e) ((jz5.n) this.V).getValue();
    }

    public final void g0() {
        kotlinx.coroutines.r2 r2Var = this.R;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        bm2.c6 c6Var = this.Q;
        if (c6Var != null) {
            c6Var.f21821h.clear();
            c6Var.notifyDataSetChanged();
        }
        yz5.l lVar = this.W;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(this.T));
        }
        this.Y = null;
        dead();
    }

    public final void h0(int i17) {
        i0(i17);
        android.view.View view = this.L;
        if (view == null) {
            return;
        }
        int i18 = i17 == 7 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddSubWidget", "refreshDataAndUI", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddSubWidget", "refreshDataAndUI", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i0(int i17) {
        yg2.b bVar;
        com.tencent.mars.xlog.Log.i(this.H, "[requestData] type = " + i17);
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.X;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.E(false);
        }
        kotlinx.coroutines.r2 r2Var = this.R;
        kotlinx.coroutines.r2 r2Var2 = null;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        gk2.e f07 = f0();
        if (f07 != null && (bVar = f07.f272475i) != null) {
            r2Var2 = kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.view.ja(this, i17, null), 3, null);
        }
        this.R = r2Var2;
    }

    public final void j0(int i17, int i18, wt2.a presenter, com.tencent.mm.plugin.finder.live.widget.e0 e0Var, yz5.l lVar) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.S = presenter;
        this.M = lVar;
        this.T = i17;
        this.U = i18;
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, e0Var, false, 0, 6, null);
        h0(i17);
        if (i17 == 19) {
            alive();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return true;
    }
}
