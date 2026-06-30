package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class vd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        super(1);
        this.f124298d = finderProfileReplayLiveUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse response = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = this.f124298d;
        com.tencent.mars.xlog.Log.i(finderProfileReplayLiveUIC.f123448i, "[fetchEndCallback] totalSize=" + finderProfileReplayLiveUIC.O6().getSize() + ",hasMore:" + response.getHasMore());
        if (response.getHasMore()) {
            finderProfileReplayLiveUIC.f123455s = 1;
        } else {
            if (finderProfileReplayLiveUIC.getRlLayout().getLoadMoreFooter() != null) {
                android.widget.TextView textView = (android.widget.TextView) finderProfileReplayLiveUIC.findViewById(com.tencent.mm.R.id.ili);
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.f491896el3);
                }
                android.widget.TextView textView2 = (android.widget.TextView) finderProfileReplayLiveUIC.findViewById(com.tencent.mm.R.id.ili);
                if (textView2 != null) {
                    textView2.setTextColor(finderProfileReplayLiveUIC.getActivity().getResources().getColor(com.tencent.mm.R.color.FG_2));
                }
                android.widget.TextView textView3 = (android.widget.TextView) finderProfileReplayLiveUIC.findViewById(com.tencent.mm.R.id.ili);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                android.view.View findViewById = finderProfileReplayLiveUIC.findViewById(com.tencent.mm.R.id.ilg);
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$onCreate$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$onCreate$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            finderProfileReplayLiveUIC.getRlLayout().E(true);
            finderProfileReplayLiveUIC.f123455s = 0;
        }
        return jz5.f0.f302826a;
    }
}
