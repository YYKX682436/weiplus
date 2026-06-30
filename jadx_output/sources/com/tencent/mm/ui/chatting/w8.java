package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class w8 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f206215d;

    public w8(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f206215d = chattingUIFragment;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        n52.e eVar;
        com.tencent.mm.storage.z3 u17;
        ot0.q v17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f206215d;
        chattingUIFragment.B.n();
        yb5.d dVar = chattingUIFragment.f198152f;
        dVar.f460710e.j0(recyclerView, i17);
        if (i17 == 1) {
            chattingUIFragment.f198269t.f().setTag(com.tencent.mm.R.id.bke, java.lang.Boolean.TRUE);
        }
        if (i17 == 0) {
            dVar.B();
            if (chattingUIFragment.f198269t.getFirstCompletelyVisiblePosition() == 0) {
                java.lang.Object tag = chattingUIFragment.f198269t.f().getTag(com.tencent.mm.R.id.bke);
                if (tag == null ? true : ((java.lang.Boolean) tag).booleanValue()) {
                    if (chattingUIFragment.F.isLoading()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUIFragment", "[rv.onScrollStateChanged] skip auto load!, current is loading");
                    } else {
                        android.view.View childAt = chattingUIFragment.f198269t.getChildAt(0);
                        if (childAt != null) {
                            int paddingTop = chattingUIFragment.f198269t.getPaddingTop();
                            if (childAt.getTop() == paddingTop) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[rv.onScrollStateChanged] auto load top more!");
                                boolean z17 = (chattingUIFragment.getBounceView() == null || chattingUIFragment.getBounceView().getOffset() == 0) ? false : true;
                                tb5.v vVar = ((tb5.y) ((tb5.m0) dVar.f460708c.a(tb5.m0.class))).f417105f;
                                vVar.getClass();
                                vVar.f417100q = java.lang.System.currentTimeMillis();
                                chattingUIFragment.B.e(true, z17 ? 0 : 200);
                            } else if (childAt.getTop() < paddingTop) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUIFragment", "[rv.onScrollStateChanged] exception auto load top more wit reset adapter!");
                                chattingUIFragment.B.setAdapter(chattingUIFragment.f198268s);
                            }
                        }
                    }
                }
            } else if (chattingUIFragment.f198269t.getLastVisiblePosition() == chattingUIFragment.f198269t.getCount() - 1) {
                com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = chattingUIFragment.f198269t;
                android.view.View childAt2 = v3Var.getChildAt(v3Var.getChildCount() - 1);
                if (childAt2 != null && chattingUIFragment.f198269t.getBottom() - chattingUIFragment.B.getBottomHeight() >= childAt2.getBottom()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[rv.onScrollStateChanged] auto load bottom more!");
                    chattingUIFragment.B.c(true);
                }
            }
            ((com.tencent.mm.ui.chatting.adapter.k) chattingUIFragment.f198268s).G0(chattingUIFragment.f198269t.getFirstVisiblePosition() - chattingUIFragment.f198269t.getHeaderViewsCount(), chattingUIFragment.f198269t.getLastVisiblePosition());
            sb5.z zVar = chattingUIFragment.f198268s;
            int firstVisiblePosition = chattingUIFragment.f198269t.getFirstVisiblePosition() - chattingUIFragment.f198269t.getHeaderViewsCount();
            int lastVisiblePosition = chattingUIFragment.f198269t.getLastVisiblePosition();
            com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
            yb5.d dVar2 = kVar.K;
            if (dVar2 != null && (u17 = dVar2.u()) != null && !u17.k2()) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (firstVisiblePosition <= lastVisiblePosition) {
                    while (true) {
                        com.tencent.mm.storage.f9 item = kVar.getItem(firstVisiblePosition);
                        if (item != null && (v17 = ot0.q.v(item.U1())) != null && v17.f348666i == 5 && !android.text.TextUtils.isEmpty(v17.f348674k)) {
                            zq1.i0 i0Var = new zq1.i0();
                            i0Var.f474983a = v17.f348674k;
                            i0Var.f474985c = 1;
                            i0Var.f474987e = v17.f348646d;
                            i0Var.f474988f = v17.f348654f;
                            i0Var.f474989g = v17.f348658g;
                            i0Var.f474990h = dVar2.D() ? "groupmessage" : "singlemessage";
                            i0Var.f474986d = 2;
                            linkedList.add(i0Var);
                        }
                        if (firstVisiblePosition == lastVisiblePosition) {
                            break;
                        } else {
                            firstVisiblePosition++;
                        }
                    }
                }
                if (((zq1.a0) gm0.j1.s(zq1.a0.class)) != null && linkedList.size() > 0) {
                    linkedList.size();
                    ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).f(linkedList, 2);
                }
            }
        }
        android.view.ViewGroup f17 = chattingUIFragment.f198269t.f();
        n30.v vVar2 = chattingUIFragment.I;
        if (vVar2 != null && (eVar = ((n52.c) vVar2).f335121a) != null) {
            eVar.a(f17, i17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        n52.e eVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        boolean z17 = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f206215d;
        if (z17 && adapter != null) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int w17 = linearLayoutManager.w();
            int y17 = (linearLayoutManager.y() - w17) + 1;
            chattingUIFragment.f198152f.f460710e.i0(recyclerView, w17, y17, adapter.getItemCount(), i18);
            android.view.ViewGroup f17 = chattingUIFragment.f198269t.f();
            n30.v vVar = chattingUIFragment.I;
            if (vVar != null && (eVar = ((n52.c) vVar).f335121a) != null) {
                eVar.b(f17, w17, y17);
            }
        }
        if (com.tencent.mm.ui.chatting.ChattingUIFragment.X0(chattingUIFragment) > 0 && (chattingUIFragment.F instanceof ke5.s)) {
            chattingUIFragment.B.n();
            if (chattingUIFragment.f198269t.getFirstVisiblePosition() <= com.tencent.mm.ui.chatting.ChattingUIFragment.X0(chattingUIFragment) && chattingUIFragment.f198269t.getFirstCompletelyVisiblePosition() > 0 && i18 < 0) {
                java.lang.Object tag = chattingUIFragment.f198269t.f().getTag(com.tencent.mm.R.id.bke);
                if ((tag == null ? true : ((java.lang.Boolean) tag).booleanValue()) && !chattingUIFragment.F.isLoading()) {
                    chattingUIFragment.B.f(true, 0, true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
