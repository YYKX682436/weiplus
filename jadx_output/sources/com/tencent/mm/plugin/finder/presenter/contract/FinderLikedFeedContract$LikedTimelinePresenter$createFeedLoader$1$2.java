package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter f122657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        super(0);
        this.f122657d = likedTimelinePresenter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View f213435x;
        android.view.View f213435x2;
        android.view.View f213435x3;
        android.widget.TextView textView;
        android.view.View f213435x4;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f122657d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = likedTimelinePresenter.f122652p;
        if (likedTimelineViewCallback != null && (f213435x4 = likedTimelineViewCallback.a().getF213435x()) != null && (textView2 = (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491896el3);
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = likedTimelinePresenter.f122652p;
        if (likedTimelineViewCallback2 != null && (f213435x3 = likedTimelineViewCallback2.a().getF213435x()) != null && (textView = (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback3 = likedTimelinePresenter.f122652p;
        android.view.View view = null;
        android.widget.TextView textView3 = (likedTimelineViewCallback3 == null || (f213435x2 = likedTimelineViewCallback3.a().getF213435x()) == null) ? null : (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback4 = likedTimelinePresenter.f122652p;
        if (likedTimelineViewCallback4 != null && (f213435x = likedTimelineViewCallback4.a().getF213435x()) != null) {
            view = f213435x.findViewById(com.tencent.mm.R.id.ilg);
        }
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
