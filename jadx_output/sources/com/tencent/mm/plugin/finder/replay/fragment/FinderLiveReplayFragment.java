package com.tencent.mm.plugin.finder.replay.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/fragment/FinderLiveReplayFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveReplayFragment extends com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f124915n = "FinderLiveReplayFragment";

    /* renamed from: o, reason: collision with root package name */
    public int f124916o;

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        com.tencent.mars.xlog.Log.i(this.f124915n, "importUIComponents sourceType:" + this.f124916o);
        return kz5.o1.c(this.f124916o == 3 ? bt2.h.class : ws2.m1.class);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveReplayUI finderLiveReplayUI = context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveReplayUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderLiveReplayUI) context : null;
        this.f124916o = finderLiveReplayUI != null ? finderLiveReplayUI.f109411v : 0;
        com.tencent.mars.xlog.Log.i(this.f124915n, "onAttach sourceType:" + this.f124916o);
        super.onAttach(context);
    }
}
