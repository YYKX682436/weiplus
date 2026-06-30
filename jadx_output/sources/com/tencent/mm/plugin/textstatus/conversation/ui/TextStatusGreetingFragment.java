package com.tencent.mm.plugin.textstatus.conversation.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lhi4/e;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusGreetingFragment extends com.tencent.mm.chatting.BasePrivateMsgConvListFragment<hi4.e> {

    /* renamed from: w, reason: collision with root package name */
    public ui4.c f173212w;

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View A0() {
        ui4.c cVar = this.f173212w;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.TextView emptyTip = cVar.f428128c;
        kotlin.jvm.internal.o.f(emptyTip, "emptyTip");
        return emptyTip;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public int B0() {
        return 15;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View C0() {
        ui4.c cVar = this.f173212w;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.ui.widget.MMProcessBar loadingIcon = cVar.f428129d;
        kotlin.jvm.internal.o.f(loadingIcon, "loadingIcon");
        return loadingIcon;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public androidx.recyclerview.widget.RecyclerView G0() {
        ui4.c cVar = this.f173212w;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView conversationRecyclerView = cVar.f428127b;
        kotlin.jvm.internal.o.f(conversationRecyclerView, "conversationRecyclerView");
        return conversationRecyclerView;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public com.tencent.mm.view.RefreshLoadMoreLayout H0() {
        ui4.c cVar = this.f173212w;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = cVar.f428130e;
        kotlin.jvm.internal.o.f(rlLayout, "rlLayout");
        return rlLayout;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.czf;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        li4.b k17 = ni4.x.f337776d.k();
        k17.getClass();
        java.lang.String[] strArr = mj4.n.f327076e;
        k17.f318788d.A("TextStatusLike", "update TextStatusGreetingItem set Read = 1 where Read != 1");
        k17.doNotify(li4.b.f318787f, 6, null);
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.o4z);
        int i17 = com.tencent.mm.R.id.ciw;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.ciw);
        if (recyclerView != null) {
            i17 = com.tencent.mm.R.id.dft;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.dft);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.ilq;
                com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) x4.b.a(findViewById, com.tencent.mm.R.id.ilq);
                if (mMProcessBar != null) {
                    i17 = com.tencent.mm.R.id.m6e;
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                    if (refreshLoadMoreLayout != null) {
                        com.tencent.mm.view.TouchableLayout touchableLayout = (com.tencent.mm.view.TouchableLayout) findViewById;
                        this.f173212w = new ui4.c(touchableLayout, recyclerView, textView, mMProcessBar, refreshLoadMoreLayout, touchableLayout);
                        super.onViewCreated(view, bundle);
                        ni4.x.f337776d.h().add(w0());
                        ym5.a1.g(G0(), new mi4.c());
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public void r0() {
        android.content.Context context = getContext();
        if (context != null) {
            wn.a w07 = w0();
            ei4.s sVar = w07 instanceof ei4.s ? (ei4.s) w07 : null;
            if (sVar != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = sVar.f253239e;
                int min = java.lang.Math.min(3, linkedList2.size());
                for (int i17 = 0; i17 < min; i17++) {
                    linkedList.add(((hi4.e) linkedList2.get(i17)).field_encUsername);
                }
                ki4.g0.f308132a.c(context, linkedList, "greeting");
            }
        }
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.a t0() {
        ei4.s sVar = new ei4.s();
        sVar.f253241g = new ei4.w(null, 1, null);
        sVar.f253240f = new ei4.v(null, 1, null);
        return sVar;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public java.util.List u0() {
        return kz5.b0.c(ni4.x.f337776d.n());
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.b y0() {
        return new hi4.d(0, 0, 3, null);
    }
}
