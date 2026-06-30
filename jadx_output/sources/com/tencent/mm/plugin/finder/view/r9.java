package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class r9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f132937d;

    public r9(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView) {
        this.f132937d = finderFeedLiveNoticeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderFeedLiveNoticeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f132937d;
        com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView.a(finderFeedLiveNoticeView);
        yz5.a clickCardCall = finderFeedLiveNoticeView.getClickCardCall();
        if (clickCardCall != null) {
            clickCardCall.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderFeedLiveNoticeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
