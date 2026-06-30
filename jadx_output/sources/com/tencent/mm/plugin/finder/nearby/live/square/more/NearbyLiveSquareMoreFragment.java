package com.tencent.mm.plugin.finder.nearby.live.square.more;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/more/NearbyLiveSquareMoreFragment;", "Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyLiveSquareMoreFragment extends com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment {
    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6 = ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6();
            rq2.x.f398914a.d(P6);
            ip2.a.f293612a.c(P6);
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareUIC", "onResume()");
        rq2.x xVar = rq2.x.f398914a;
        rq2.x.f398917d = c01.id.c();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        o0();
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 80;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    /* renamed from: u0 */
    public java.lang.String getF121516t() {
        return c92.g.f39738a.b() ? "8002" : "1004";
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public int x0() {
        return 3;
    }
}
