package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lso2/j5;", "it", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveWeCoinHotConstract$Presenter$onAttach$3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter f122802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveWeCoinHotConstract$Presenter$onAttach$3(com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter presenter) {
        super(1);
        this.f122802d = presenter;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof com.tencent.mm.plugin.finder.feed.model.b4) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wecoinHotList.size:");
            com.tencent.mm.plugin.finder.feed.model.b4 b4Var = (com.tencent.mm.plugin.finder.feed.model.b4) it;
            java.util.LinkedList linkedList = b4Var.f107723a;
            sb6.append(linkedList.size());
            sb6.append(", totalWecoinHot:");
            long j17 = b4Var.f107724b;
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("FinderLiveWeCoinHotConstract.Presenter", sb6.toString());
            boolean isEmpty = linkedList.isEmpty();
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter presenter = this.f122802d;
            if (isEmpty) {
                com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback viewCallback = presenter.f122799f;
                if (viewCallback != null) {
                    android.widget.RelativeLayout relativeLayout = viewCallback.f122809m;
                    if (relativeLayout == null) {
                        kotlin.jvm.internal.o.o("titleGroup");
                        throw null;
                    }
                    relativeLayout.setVisibility(8);
                    android.widget.TextView textView = viewCallback.f122812p;
                    if (textView == null) {
                        kotlin.jvm.internal.o.o("emptyTv");
                        throw null;
                    }
                    textView.setVisibility(0);
                    viewCallback.a().setVisibility(8);
                    android.view.View view = viewCallback.f122813q;
                    if (view == null) {
                        kotlin.jvm.internal.o.o("loadingView");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "showEmptyView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "showEmptyView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback viewCallback2 = presenter.f122799f;
                if (viewCallback2 != null) {
                    android.widget.TextView textView2 = viewCallback2.f122811o;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("titleAmountTv");
                        throw null;
                    }
                    textView2.setText(java.lang.String.valueOf(j17));
                    android.widget.RelativeLayout relativeLayout2 = viewCallback2.f122809m;
                    if (relativeLayout2 == null) {
                        kotlin.jvm.internal.o.o("titleGroup");
                        throw null;
                    }
                    relativeLayout2.setVisibility(0);
                    android.widget.TextView textView3 = viewCallback2.f122812p;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("emptyTv");
                        throw null;
                    }
                    textView3.setVisibility(8);
                    viewCallback2.a().setVisibility(0);
                    android.view.View view2 = viewCallback2.f122813q;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("loadingView");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "showContentView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "showContentView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = presenter.f122798e;
                if (wxRecyclerAdapter == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
        return jz5.f0.f302826a;
    }
}
