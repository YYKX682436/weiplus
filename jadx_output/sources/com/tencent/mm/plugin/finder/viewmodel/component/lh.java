package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lh extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent f135065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135065d = new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aiz;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("Finder.FinderFollowListUIC", "onCreate, intent=" + getIntent());
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View rootView = getRootView();
        android.content.Intent intent = getIntent();
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent = this.f135065d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback((com.tencent.mm.ui.MMActivity) activity, rootView, followListPresent, intent);
        followListPresent.f122601e = followListViewCallback;
        if (!followListPresent.f122608o) {
            gm0.j1.d().a(713, followListPresent);
        }
        gm0.j1.d().a(3867, followListPresent);
        followListViewCallback.b();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f135065d.onDetach();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328201e, "12", ml2.y.f328241f, 0, 0L, 0, 112, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328201e, "12", ml2.y.f328240e, 0, 0L, 0, 112, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135065d = new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent();
    }
}
