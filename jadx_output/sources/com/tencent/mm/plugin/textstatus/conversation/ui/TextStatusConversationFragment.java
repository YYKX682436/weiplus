package com.tencent.mm.plugin.textstatus.conversation.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/conversation/ui/TextStatusConversationFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lhi4/a;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusConversationFragment extends com.tencent.mm.chatting.BasePrivateMsgConvListFragment<hi4.a> {

    /* renamed from: w, reason: collision with root package name */
    public ui4.a f173209w;

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View A0() {
        ui4.a aVar = this.f173209w;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.TextView emptyTip = aVar.f428116c;
        kotlin.jvm.internal.o.f(emptyTip, "emptyTip");
        return emptyTip;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public int B0() {
        return 15;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View C0() {
        ui4.a aVar = this.f173209w;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.ui.widget.MMProcessBar loadingIcon = aVar.f428117d;
        kotlin.jvm.internal.o.f(loadingIcon, "loadingIcon");
        return loadingIcon;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public androidx.recyclerview.widget.RecyclerView G0() {
        ui4.a aVar = this.f173209w;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView conversationRecyclerView = aVar.f428115b;
        kotlin.jvm.internal.o.f(conversationRecyclerView, "conversationRecyclerView");
        return conversationRecyclerView;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public com.tencent.mm.view.RefreshLoadMoreLayout H0() {
        ui4.a aVar = this.f173209w;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = aVar.f428118e;
        kotlin.jvm.internal.o.f(rlLayout, "rlLayout");
        return rlLayout;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cyz;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ni4.x xVar = ni4.x.f337776d;
        xVar.k().remove(w0());
        xVar.n().remove(w0());
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.o4y);
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
                        this.f173209w = new ui4.a(touchableLayout, recyclerView, textView, mMProcessBar, refreshLoadMoreLayout, touchableLayout);
                        super.onViewCreated(view, bundle);
                        ni4.x xVar = ni4.x.f337776d;
                        xVar.k().add(w0());
                        xVar.n().add(w0());
                        ym5.a1.g(G0(), new mi4.a());
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public void r0() {
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        super.setUserVisibleHint(z17);
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.a t0() {
        ei4.h hVar = new ei4.h();
        hVar.f253217g = new ei4.j(this);
        hVar.f253218h = new ei4.l(this, null, 2, null);
        return hVar;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public java.util.List u0() {
        return kz5.b0.c(ni4.x.f337776d.n());
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.b y0() {
        return new hi4.b(0, 0, 3, null);
    }
}
