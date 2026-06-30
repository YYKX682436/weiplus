package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class t extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f209365d;

    /* renamed from: e, reason: collision with root package name */
    public rl5.r f209366e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f209367f;

    /* renamed from: g, reason: collision with root package name */
    public em.k2 f209368g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f209369h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f209370i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f209365d = new java.util.ArrayList();
        this.f209369h = new java.util.ArrayList();
    }

    public static final void T6(com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar, java.lang.String str, int i17) {
        android.widget.TextView textView;
        b95.j Ai;
        tVar.getClass();
        com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation pluginMessengerFoundation = (com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class);
        if (pluginMessengerFoundation != null && (Ai = pluginMessengerFoundation.Ai()) != null) {
            Ai.a(str);
        }
        java.util.ArrayList arrayList = tVar.f209365d;
        arrayList.remove(i17);
        tVar.f209369h.remove(i17);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tVar.f209367f;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        rl5.r rVar = tVar.f209366e;
        if (rVar != null) {
            rVar.a();
        }
        if (com.tencent.mm.ui.contact.t8.a(arrayList)) {
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = tVar.f209367f;
        android.widget.LinearLayout linearLayout = null;
        androidx.recyclerview.widget.RecyclerView b07 = wxRecyclerAdapter2 != null ? wxRecyclerAdapter2.b0() : null;
        if (b07 != null) {
            b07.setVisibility(8);
        }
        em.k2 k2Var = tVar.f209368g;
        if (k2Var != null) {
            if (k2Var.f254502b == null) {
                k2Var.f254502b = (android.widget.TextView) k2Var.f254501a.findViewById(com.tencent.mm.R.id.gze);
            }
            textView = k2Var.f254502b;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        em.k2 k2Var2 = tVar.f209368g;
        if (k2Var2 != null) {
            if (k2Var2.f254503c == null) {
                k2Var2.f254503c = (android.widget.LinearLayout) k2Var2.f254501a.findViewById(com.tencent.mm.R.id.m7p);
            }
            linearLayout = k2Var2.f254503c;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public static final void U6(com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar) {
        if (tVar.f209370i) {
            tVar.X6(false);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tVar.f209367f;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
    }

    public final void V6(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        for (com.tencent.mm.ui.contact.v8 v8Var : this.f209365d) {
            if (kotlin.jvm.internal.o.b(v8Var.f207220d.f207231a, userName)) {
                v8Var.f207220d.f207233c = !r1.f207233c;
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f209367f;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }

    public final void W6(wi5.n0 state) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardListViewUIC", "updateMultiSelectStatus " + state.e());
        java.util.Iterator it = this.f209365d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.contact.v8 v8Var = (com.tencent.mm.ui.contact.v8) it.next();
            v8Var.f207220d.f207234d = state.e();
            java.util.LinkedList linkedList = state.f446319o;
            com.tencent.mm.ui.contact.w8 w8Var = v8Var.f207220d;
            w8Var.f207233c = linkedList.contains(w8Var.f207231a);
        }
        if (state.e()) {
            X6(false);
        }
        em.k2 k2Var = this.f209368g;
        if (k2Var != null) {
            if (k2Var.f254504d == null) {
                k2Var.f254504d = (androidx.recyclerview.widget.RecyclerView) k2Var.f254501a.findViewById(com.tencent.mm.R.id.llt);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = k2Var.f254504d;
            if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
                return;
            }
            adapter.notifyDataSetChanged();
        }
    }

    public final void X6(boolean z17) {
        this.f209370i = z17;
        java.util.Iterator it = this.f209365d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.contact.v8) it.next()).f207220d.f207235e = z17;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        S6(new com.tencent.mm.ui.mvvm.uic.conversation.recent.p(this));
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new com.tencent.mm.ui.mvvm.uic.conversation.recent.q(this));
    }
}
