package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class cb0 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.UICallbackListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f134005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134005d = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter(2, 1, new int[]{3, 2, 7, 8});
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.UICallbackListener
    public void F(dm.pd mention) {
        kotlin.jvm.internal.o.g(mention, "mention");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b3w;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c01.z1.r(), true);
        if (n17 != null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).setMMTitle(getActivity().getString(com.tencent.mm.R.string.eps, n17.f2()));
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity2).setBackBtn(new com.tencent.mm.plugin.finder.viewmodel.component.za0(this));
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View rootView = getRootView();
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f134005d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback((com.tencent.mm.ui.MMActivity) activity3, rootView, msgPresenter, this);
        msgPresenter.g(msgViewCallback);
        msgViewCallback.b();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC;
        c17.r(u3Var, 0);
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC;
        c18.r(u3Var2, 0);
        gm0.j1.u().c().r(u3Var2, 0);
        gm0.j1.u().c().r(u3Var2, 0);
        gm0.j1.u().c().x(u3Var, 0);
        gm0.j1.u().c().x(u3Var2, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("TLWxBubble");
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().X("WxMessageEntryRight", com.tencent.mm.plugin.finder.viewmodel.component.ab0.f133766d, false, xy2.c.e(getContext()));
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().X("WxMessageEntry", com.tencent.mm.plugin.finder.viewmodel.component.bb0.f133864d, false, xy2.c.e(getContext()));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f134005d.onDetach();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f134005d;
        msgPresenter.getClass();
        msgPresenter.f122831o = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f134005d;
        msgPresenter.getClass();
        msgPresenter.f122832p.f57440q = java.lang.System.currentTimeMillis() - msgPresenter.f122831o;
    }
}
