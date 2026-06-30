package com.tencent.mm.plugin.finder.nearby.video;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyVideoFragment extends com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment {
    public NearbyVideoFragment() {
        super(com.tencent.mm.R.string.h7f, 1002);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void A0() {
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, com.tencent.mm.plugin.finder.nearby.video.t.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        rq2.x.f398914a.c(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyVideoFragment);
        aVar.Rj(this, iy1.a.PeopleNearby);
        aVar.ck(this, true);
        aVar.ik(this, 40, 24184);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        rq2.x.f398914a.d(this);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 15;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    /* renamed from: u0 */
    public java.lang.String getF121516t() {
        return "1002";
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public java.lang.String w0() {
        return "15-1002";
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void y0() {
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = ((com.tencent.mm.plugin.finder.nearby.video.t) j0(com.tencent.mm.plugin.finder.nearby.video.t.class)).f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onActionbarClick(false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void z0() {
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = ((com.tencent.mm.plugin.finder.nearby.video.t) j0(com.tencent.mm.plugin.finder.nearby.video.t.class)).f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onActionbarClick(true);
        }
    }
}
