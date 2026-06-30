package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class aq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bq f117791d;

    public aq(com.tencent.mm.plugin.finder.live.widget.bq bqVar) {
        this.f117791d = bqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveOuterFastCommentGuidePanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("FinderLiveASRFastCommentGuidePanel", "guidePanelCancelBtn clicked");
        com.tencent.mm.plugin.finder.live.widget.bq bqVar = this.f117791d;
        yz5.a aVar = bqVar.K;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(bqVar, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveOuterFastCommentGuidePanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
